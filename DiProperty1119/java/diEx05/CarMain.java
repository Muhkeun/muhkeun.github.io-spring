package diEx05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:car.xml");
        Car car = context.getBean("car", Car.class);
        car.drive();
        context.close();
    }
}
