package com.muhkeun.environmentEx01;

    //[외부 파일을 이용한 빈 설정]
    // -EnvironmentAware 인터페이스를 활용
    // Context --> getEnvironment() --> Environment 객체 얻기
    // Environment --> getPropertySources 객체를 얻기
    // PropertySources --> 프로퍼티를 추가(addList) 하거나, 추출(getProperty).

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class EnvironmentEx01 implements EnvironmentAware, InitializingBean, DisposableBean {

    private Environment environment;
    private String id;
    private String password;



    @Override
    public void setEnvironment(Environment environment){
        System.out.println("setEnvironment() 호출");
        this.environment = environment;
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("afterPropertiesSet() 호출");
        setId(environment.getProperty("environment.id"));
        setPassword(environment.getProperty("environment.password"));
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("destroy() 호출");
    }


// getter,setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
