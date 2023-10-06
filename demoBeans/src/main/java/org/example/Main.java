package org.example;

import org.example.models.Person;
import org.example.models.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student st1 = context.getBean("st1", Student.class);
        System.out.println(st1);
        Student st2 = context.getBean("st2", Student.class);
        System.out.println(st2);
        Student st3 = context.getBean("st3", Student.class);
        System.out.println(st3);
        Person p1 = context.getBean("p1", Person.class);
        System.out.println(p1);
        //<!--    Spring’s Auto-wiring-->
        //By Name
        Student st4 = context.getBean("st4", Student.class);
        System.out.println(st4);
    }
}