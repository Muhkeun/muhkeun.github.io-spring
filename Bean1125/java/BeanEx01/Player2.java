package BeanEx01;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Player2{
        private String name;
        private int age;


        //기본 생성자
        public Player2(){
            System.out.println("Player2 생성");
        }
        //인자 생성자
        public Player2(String name, int age){

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

    //Annotation 을 이용
    //@PostConstruct - 빈이 생성된 직후 동작
    //@PreDestroy - 빈이 소멸 직전 동작
        @PostConstruct
        public void init(){
            System.out.println(name + "의 Bean 생성시 처리할 명령(annotation)");
        }

        @PreDestroy
        public void destroy(){
            System.out.println(name + "의 Bean 소멸시 처리할 명령(annotation)");
        }

    }

