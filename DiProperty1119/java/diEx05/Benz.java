package diEx05;

public class Benz implements Car {
    public Benz(){
        System.out.println("벤츠 생성");
    }
    @Override
    public void drive() {
        System.out.println("벤츠차를 운전");
    }
}
