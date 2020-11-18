package DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DiTestMain {
    public static void main(String[] args) {

        String confLocation = "classpath:DiTest.xml";
        AbstractApplicationContext context = new GenericXmlApplicationContext(confLocation);

        // <bean id="DiTest04" class="DI.DiTest04"/> 빈(객체)을 가져온다.
        DiTest03 diTest03 = context.getBean("DiTest04", DiTest04.class);

        // 생성자를 사용하지 않고 printMsg()를 사용할 수 있다.
        System.out.println("===================");
        diTest03.printMsg();

    }
}
