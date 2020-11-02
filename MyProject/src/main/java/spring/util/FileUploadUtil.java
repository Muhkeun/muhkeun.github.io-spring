package spring.util;

import java.io.File;

public class FileUploadUtil {
  public static String checkSameFileName(String filename, String path){
      //인자인 filename에서 확장자를 뺀 파일명을 가려내자
      //그렇게 하려면 먼저 파일명에 있는 "."의 위치를 알아내야 한다.
      int period = filename.lastIndexOf(".");


      //파일명과 확장자를 분리한다.
      //파일명
      String f_name = filename.substring(0, period);
      //확장자
      String suffix = filename.substring(period);

      //받은 path에는 파일명이 존재하지 않는다.
      String saveFile = path+System.getProperty("file.separator") + filename;

      //경로상(path + filename) 존재 여부 확인 => java.io.File 사용
      File file = new File(saveFile);

      //존재할 경우를 생각해서 이름을 변경시킬 숫자
      int idx = 1;

      while (file.exists()){
          //같은 이름으로 파일이 존재 => 파일명 뒤에 숫자를 붙인다.
          StringBuffer stringBuffer = new StringBuffer();

          stringBuffer.append(f_name);
          //숫자를 붙인 후 1 증가
          stringBuffer.append("(" + idx++ + ")");
          stringBuffer.append(suffix);

          filename = stringBuffer.toString();

          saveFile = path + System.getProperty("file.separator")+filename;

          file = new File(saveFile);

      }//while

      return filename;
  }
}
