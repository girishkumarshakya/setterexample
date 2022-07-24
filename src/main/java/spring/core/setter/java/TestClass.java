package spring.core.setter.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister",SimpleMovieLister.class);
        System.out.println(simpleMovieLister);
        SimpleMovieLister simpleMovieLister1 = context.getBean("simpleMovieLister1",SimpleMovieLister.class);
        System.out.println("------------------------------------------------------------------");
        System.out.println(simpleMovieLister1);
    }
}
