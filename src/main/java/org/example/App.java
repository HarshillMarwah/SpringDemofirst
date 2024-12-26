package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Alien obj = new Alien();
//        Alien obj = (Alien) context.getBean("alien",Alien.class);
        String[] beanNames = context.getBeanDefinitionNames();

        // Print all the bean names
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        Alien obj = (Alien) context.getBean("org.example.Alien#0");
        obj.code();

    }
}
