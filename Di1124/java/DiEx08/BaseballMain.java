package DiEx08;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BaseballMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:baseball.xml");

       Player player1 = context.getBean("player1", Player.class);

        System.out.println("선수이름: " + player1.getName());
        System.out.println("선수나이: " + player1.getAge());
        System.out.println("선수포지션: " + player1.getPosition());
        System.out.println("선수신장: " + player1.getHeight());
        System.out.println("선수몸무게: " + player1.getWeight());

        System.out.println("============================================================");

        Player player2 = context.getBean("player2", Player.class);

        System.out.println("선수이름: " + player2.getName());
        System.out.println("선수나이: " + player2.getAge());
        System.out.println("선수포지션: " + player2.getPosition());
        System.out.println("선수신장: " + player2.getHeight());
        System.out.println("선수몸무게: " + player2.getWeight());

        context.close();
    }
}
