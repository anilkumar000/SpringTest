package com.stackroute;

import com.stackroute.domain.Manager;
import com.stackroute.domain.Surveyor;
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
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Surveyor surveyor=applicationContext.getBean("b",Surveyor.class);
        System.out.println(surveyor);

        Manager manager=applicationContext.getBean("a",Manager.class);
        System.out.println(manager);

    }
}
