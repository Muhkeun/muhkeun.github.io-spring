package BeanEx01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//InintializingBean - 빈이 생성된 직후 동작하는 인터페이스 영역, afterPropertiesSet()
//DisposableBean - 빈이 소멸하기 전 동작하는 인터페이스 영역, destroy()
public class Player implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    
    //기본 생성자
    public Player(){
        System.out.println("Player 생성");
    }
    //인자 생성자
    public Player(String name, int age){

        this.name = name;
        this.age = age;

    }
    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Override
    @Override
    public void afterPropertiesSet() throws Exception{

        System.out.println(name + "의 Bean 생성시 처리할 명령(interface)");

    }

    @Override
    public void destroy() throws Exception{
        System.out.println(name + "의 Bean 소멸시 처리할 명령(interface)");
    }
}

