package com.muhkeun.environmentEx02;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExternalFileEx implements InitializingBean, DisposableBean {
    private String id;
    private String password;
    private String extId;
    private String extPassword;
    
   
    @Override
    public void afterPropertiesSet(){
        System.out.println("afterPropertiesSet() 호출");
    }
    @Override
    public void destroy(){
        System.out.println("destroy() 호출");
    }

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

    public String getExtId() {
        return extId;
    }

    public void setExtId(String extId) {
        this.extId = extId;
    }

    public String getExtPassword() {
        return extPassword;
    }

    public void setExtPassword(String extPassword) {
        this.extPassword = extPassword;
    }
}
