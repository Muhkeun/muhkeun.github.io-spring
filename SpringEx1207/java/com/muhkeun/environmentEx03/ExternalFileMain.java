package com.muhkeun.environmentEx03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExternalFileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExternalConfig.class);

        ExternalFileEx externalFileEx = context.getBean("externalConf",ExternalFileEx.class);

        System.out.println("environmentId :" + externalFileEx.getId());
        System.out.println("environmentPassword :" + externalFileEx.getPassword());
        System.out.println("externalId :" + externalFileEx.getExtId());
        System.out.println("externalPassword :" + externalFileEx.getExtPassword());

        context.close();
    }
}
