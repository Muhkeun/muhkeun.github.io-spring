package DiEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args){
//        일반적인 Java 의존 관계 설정
//        GetSum02 getSum02 = new GetSum02();
//
//        getSum02.setGetSum(new GetSum());
//
//        getSum02.setA(10);
//        getSum02.setB(100);

        //context 객체 생성
        String configPath = "classpath:getSum.xml";

        AbstractApplicationContext context = new GenericXmlApplicationContext(configPath);

        GetSum02 getSum02 = context.getBean("getSum02", GetSum02.class);


        getSum02.sum();

    }
}
