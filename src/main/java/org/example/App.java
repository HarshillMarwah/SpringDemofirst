package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj1 = (Alien) context.getBean("alien1");
//    	obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
//        System.out.println(obj1.code());

        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Desktop dt1 = context.getBean(Desktop.class);
        dt1.compile();

       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Alien obj1 = new Alien();
 *//*       String[] beanNames = context.getBeanDefinitionNames();

        // Print all the bean names
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        Alien obj = (Alien) context.getBean("alien",Alien.class);// getting bean with ID:1
        Alien obj1 = (Alien) context.getBean("org.example.Alien#0");// getting bean without ID.
        obj.code();
        obj1.code();
        //Scope testing.
        Alien obj2 = (Alien) context.getBean("alien2");
        obj.age=100;
        System.out.println("obj2 age="+obj.age);
        obj.code();
*//*
        //Testing Dependency Injection
//        Alien obj = (Alien) context.getBean("alien",Alien.class);
        Alien obj =  context.getBean("alien",Alien.class);
        System.out.println(obj.getAge());
        obj.code();

//        System.out.println("testing this.age");
//        Alien con=new Alien(21);

        Desktop lazyTry = (Desktop)context.getBean("com");*/
    }
}
