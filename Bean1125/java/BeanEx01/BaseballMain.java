package BeanEx01;


import org.springframework.context.support.GenericXmlApplicationContext;

public class BaseballMain {
    public static void main(String[] args) {
        System.out.println("Player Class");
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:baseball.xml");


        //refresh() - 과정에서 빈이 생성
        context.refresh();

        //close() - 컨테이너가 소멸하는 단계에서 빈도 자동 소멸
        context.close();

        System.out.println("===================================================");

        System.out.println("Player2 Class");
        GenericXmlApplicationContext context2 = new GenericXmlApplicationContext();
        context2.load("classpath:baseball2.xml");


        //refresh() - 과정에서 빈이 생성
        context2.refresh();

        //close() - 컨테이너가 소멸하는 단계에서 빈도 자동 소멸
        context2.close();



    }
}
