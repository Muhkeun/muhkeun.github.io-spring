package diEx02;

public class ExamDAO {
    private String msg;

    // 디폴트 생성자
    public ExamDAO(){

    }

    //인자 생성자
    public ExamDAO(String msg){
        this.msg = msg;
    }

    public void outputMsg(){
        System.out.println("msg:" + msg);
    }

}
