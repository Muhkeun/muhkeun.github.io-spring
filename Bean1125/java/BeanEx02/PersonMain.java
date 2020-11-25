package BeanEx02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:person.xml");

        Person person1 = context.getBean("person", Person.class);

        String name = person1.getName();
        int age = person1.getAge();
        System.out.println("person1");
        System.out.println("이름: " + name +"\n나이: " + age);

        System.out.println("=============================================");
        System.out.println("person2");
        Person person2 = context.getBean("person", Person.class);

        name = person2.getName();
        age = person2.getAge();
        System.out.println("이름: " + name +"\n나이: " + age);


        System.out.println("=============================================");
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        if(person1.equals(person2)){
            //scope = singleton 일때, 객체가 같다.
            System.out.println("person1 == person2");
        }else{
            //scope = prototype 일때, 객체가 다르다.
            System.out.println("person1 != person2");
        }
    }
}
