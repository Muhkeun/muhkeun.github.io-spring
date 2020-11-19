package diEx05;

public class Hyendai implements Car {
    public Hyendai(){
        System.out.println("현대 생성");
    }
    @Override
    public void drive(){
        System.out.println("현대차를 운전");
    };
}
