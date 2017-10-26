package com.codjust.demo;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.codjust.demo.common.Hello;

/**
 * Hello world!
 *
 */
public class App 
{

	
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");		
		Hello obj1 = (Hello)ctx.getBean("hello");
		obj1.say();    	
    }
}
