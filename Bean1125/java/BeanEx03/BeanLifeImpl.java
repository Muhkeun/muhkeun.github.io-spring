package BeanEx03;

import org.springframework.beans.factory.BeanNameAware;

// BeanNameAware 인터페이스
// : 빈 객체가 자기 자신의 이름을 알아야 할 경우 사용.
// : 클래스가 BeanNameAware 인터페이스를 구현한 경우 컨테이너는 setBeanName() 메서드를 호출해서 빈 객체의 이름 전달

public class BeanLifeImpl implements BeanLife, BeanNameAware {
    // bean의 id를 저장하기 위한 변수
    private String beanName;

    @Override
    public void lifeMethod() {
        System.out.println("비지니스 로직을 수행.");
        System.out.println("beanName: " + beanName);
    }

    public void init(){
        System.out.println("사용자 초기화 메서드");
    }

    public void end(){
        System.out.println("사용자 소멸 메서드");
    }

    // setBeanName(String arg) : 객체가 생성될 대 해당 객체의 id 값을 전달(주입) 받는 메서드
    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
