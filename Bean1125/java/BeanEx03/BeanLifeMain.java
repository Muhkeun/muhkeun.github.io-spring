package BeanEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanLifeMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:beanLife.xml");
        BeanLife beanLife = context.getBean("beanLife", BeanLifeImpl.class);

        beanLife.lifeMethod();

        context.close();
    }
}
