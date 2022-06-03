package com.springcore.collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/resource/Config.xml");
        
        System.out.println(context);
        
        Student bean = context.getBean("std",Student.class);
        
        List<String> sub = bean.getSub();
          
        for (String string : sub) {
			
        	System.out.println(string);
		}
          
          System.out.println(bean);
        
    }    
}
