package com.muhkeun.environmentEx03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ExternalConfig {


    @Value("${environment.id}")
    private String envId;
    @Value("${environment.password}")
    private String envPassword;
    @Value("${external.id}")
    private String externalId;
    @Value("${external.password}")
    private String externalPassword;

    //컨테이너에서 자동으로 생성
    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties(){
        //Property 파일의 위치값을 저장하는 객체
        PropertySourcesPlaceholderConfigurer confiurer = new PropertySourcesPlaceholderConfigurer();

        Resource[] path = new Resource[2];
        path[0] = new ClassPathResource("env.properties");
        path[1] = new ClassPathResource("external.properties");
        confiurer.setLocations(path);

        return confiurer;
    }

    @Bean
    public ExternalFileEx externalConf(){
        ExternalFileEx externalFileEx = new ExternalFileEx();
        externalFileEx.setId(envId);
        externalFileEx.setPassword(envPassword);
        externalFileEx.setExtId(externalId);
        externalFileEx.setExtPassword(externalPassword);

        return externalFileEx;
    }
}
