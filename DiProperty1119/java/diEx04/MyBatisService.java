package diEx04;

public class MyBatisService {
    private MyBatisDao myBatisDao;

    //setter
    public void setMyBatisDao(MyBatisDao myBatisDao){
        this.myBatisDao = myBatisDao;
    }

    public MyBatisService(){
        System.out.println("MyBatisService 생성");
    }

    public void myBatisTest(){
        System.out.println("=================");
        myBatisDao.insertDB();
        myBatisDao.updateDB();
    }
}
