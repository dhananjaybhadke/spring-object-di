package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        // Normal approach but it is not a good practice to create a hardcoded objects in client
        /*Student student = new Student();
        MathCheat cheat = new MathCheat();
        student.setId(1);
        student.setMathCheat(cheat);
        student.cheating();*/


        // Object type dependency injection
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student stu = context.getBean("student", Student.class);
        stu.cheating();

        AnotherStudent stu1 = context.getBean("aStu", AnotherStudent.class);
        stu1.startCheating();
        System.out.println("Hello world!");


    }
}