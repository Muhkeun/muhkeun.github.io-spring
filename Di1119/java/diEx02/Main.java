package diEx02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:examDao.xml");
        ExamDAO examDAO = context.getBean("examDAO", ExamDAO.class);

        examDAO.outputMsg();
    }
}
