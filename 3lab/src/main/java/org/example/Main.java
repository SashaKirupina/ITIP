package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Bean testBean = context.getBean("Bean", Bean.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
