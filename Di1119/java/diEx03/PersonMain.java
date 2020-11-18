package diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        String configPath = "classpath:person.xml";

        AbstractApplicationContext context = new GenericXmlApplicationContext(configPath);

        PersonInfo personInfo = context.getBean("personInfo", PersonInfo.class);

        personInfo.getPersonInfo();

        System.out.println("=================================");

        //person2 의 정보 가져오기
        Person person = context.getBean("person2", Person.class);

        personInfo.setPerson(person);
        personInfo.getPersonInfo();

        //자원을 반납.
        context.close();
    }
}
