package New;

public class DiTest01 {

    // 일반적인 객체 생성
    // => DiTest01는 DiTest02에 의존한다. (New.DiTest01 has a New.DiTest02)
    DiTest02 diTest02 = new DiTest02();

    public void print(){
        diTest02.aa();
    }
}

    // DI는 의존하는 객체에 대한 획득을 class에서 하지 않고 Spring 콘테이너에서 주입(제공) 한다.
    // 다시 말하면, New.DiTest01 클래스에서 New.DiTest02 diTest02 = new New.DiTest02();를 작성하지 않고
    // 스프링 컨테이너가 New.DiTest01 클래스를 생성할 때 생성하는 New.DiTest02 class의 instance(bean)을 주입 받는다.
    // 설정은 XML을 통해서 이루어 진다.

    // ##의존성을 낮추다 => interface를 이용한다.
