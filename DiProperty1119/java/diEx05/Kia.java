package diEx05;

public class Kia implements Car {
    public Kia(){
        System.out.println("Kia 생성");
    }
    @Override
    public void drive() {
        System.out.println("기아차를 운전");
    }
}
