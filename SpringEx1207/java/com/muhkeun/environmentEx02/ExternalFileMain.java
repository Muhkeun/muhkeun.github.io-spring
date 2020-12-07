package com.muhkeun.environmentEx02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

public class ExternalFileMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:external.xml");
        ExternalFileEx externalFileEx = context.getBean("externalFileEx", ExternalFileEx.class);

        System.out.println("environment id: " + externalFileEx.getId());
        System.out.println("environment password: " + externalFileEx.getPassword());
        System.out.println("external id: " + externalFileEx.getExtId());
        System.out.println("external password: " + externalFileEx.getExtPassword());

        context.close();
    }
}
