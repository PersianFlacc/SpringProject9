package org.example.project9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println("----------------------");

        System.out.println(person.getSurname());
        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
