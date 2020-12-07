package com.muhkeun.environmentEx01;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;


public class EnvironmentMain {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();

        propertySources.addLast(new ResourcePropertySource("classpath:env.properties"));

        //environment.properties 에서 가져온 정보 확인.
        System.out.println(environment.getProperty("environment.id"));
        System.out.println(environment.getProperty("environment.password"));

        GenericXmlApplicationContext gContext = (GenericXmlApplicationContext)context;
        gContext.load("classpath:env.xml");
        gContext.refresh();

        EnvironmentEx01 environmentEx01 = gContext.getBean("environment", EnvironmentEx01.class);

        System.out.println("env id: " + environmentEx01.getId());
        System.out.println("env password: " + environmentEx01.getPassword());

        gContext.close();
        context.close();
    }
}