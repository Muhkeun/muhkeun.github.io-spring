package DiEx08;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

//어노테이션 (Annotation:Metadata) - JDK5부터 등장. ex) @Override
//선언 시에는 '@'를 사용한다.
// * 컴파일러에게 정보를 알려주거나
// * 컴파일 할 때와 설치 (Deployment)시의 작업을 지정하거나
// * 실행할 때 별도의 처리가 필요한 경우\

//@Configuration: 클래스 앞에 선언, "이 클래스는 스프링 설정에 사용되는 클래스" 라고 명시
@Configuration
public class ConfigApp {

    //@Bean : 메소드 앞에 선언, "객체를 생성"
    @Bean
    public Player player1(){
        ArrayList<String> position = new ArrayList<String>();
        position.add("4번타자");
        position.add("외야수");

        Player player = new Player("임꺽정", 26, position);
        player.setHeight(182);
        player.setWeight(92.2);

        return player;
    }

}
