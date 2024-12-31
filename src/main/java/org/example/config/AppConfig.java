package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean(name = "yellow")
   /* @Bean
    public Alien alien1( Computer com){//@Qualifier("laptop1")
        Alien obj = new Alien();
        obj.setAge(25);
        obj.setCom(com);
        return obj;
    }
    @Bean
    @Primary
    public Laptop laptop1(){
        return new Laptop();
    }
    @Bean
    //@Scope(value = "prototype")
    public Desktop desktop(){
        System.out.println("From config class");
        return new Desktop();
    }*/
}
