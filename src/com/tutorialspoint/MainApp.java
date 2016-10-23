package com.tutorialspoint;

import java.lang.reflect.Array;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
      
//      ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
//      weeklyTemperatures.add(78);
//      weeklyTemperatures.add(67);
//      weeklyTemperatures.add(89);
//      weeklyTemperatures.add(94);
//      
//      for (Integer temperature : weeklyTemperatures) {
//		System.out.println(temperature);
//      }
      
      
   }
   
}