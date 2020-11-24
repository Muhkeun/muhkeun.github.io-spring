package DiEx09;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

//@ImportResource 를 사용하면 xml 객체를 불러올 수 있다.
@Configuration
@ImportResource("classpath:baseball2.xml")
public class ConfigApp {


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
