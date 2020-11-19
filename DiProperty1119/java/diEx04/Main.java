package diEx04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String confLocation = "classpath:myBatis.xml";
        AbstractApplicationContext context = new GenericXmlApplicationContext(confLocation);

        MyBatisService service = context.getBean("myBatisService", MyBatisService.class);

        service.myBatisTest();

        context.close();
    }
}
