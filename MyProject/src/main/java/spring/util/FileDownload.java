package spring.util;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class FileDownload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //파라미터 값 받기 (dir, filename)
        String dir = request.getParameter("dir");
        String filename = request.getParameter("filename");

        //dir을 절대경로로 만들자
        //내장 객체인 ServletContext Application
        String RealPath = getServletContext().getRealPath(dir);

        //앞서 얻어낸 upload의 절대 경로와 파일명을 연결하면 전체 경로가 된다.
        String fullPath = RealPath + System.getProperty("file.separator") + filename;

        //전체경로를 가지고 File객체를 생성한다.
        File file = new File(fullPath);


        byte [] buffer = new byte[2048];

        //전송할 데이터가 Stream 처리될 때 문자셋 지정
        response.setContentType("application/octet-stream;charset=8859_1");

        //다운로드 대화상자 처리
        response.setHeader("Content-Disposition",
                "attachment;filename="+ new String(filename.getBytes("utf-8"), "8859_1"));

        //전송 타입 이진데이터 (binary)
        response.setHeader("Content-Transfer-Encoding","binary");

        if(file.isFile()) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

            //요청한 곳으로 보내기 위해 위해 (응답)
            //스트림을 응답객체 (response)로 부터 얻어낸다.

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(response.getOutputStream());

            int size = -1;

            try{
                while((size = bufferedInputStream.read(buffer)) != -1){
                    bufferedOutputStream.write(buffer,0, size);
                    bufferedOutputStream.flush();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(bufferedOutputStream != null)
                    bufferedOutputStream.close();
                if (bufferedInputStream != null)
                    bufferedInputStream.close();
            }
        }


    }
}
