package com.oselite.springhello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {

	public static void main(String[] args) {

		/** load the spring configuration file */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/** retrieve bean from spring container */
		Animal myAnimal = context.getBean("cat", Animal.class);
		//Animal myAnimal = context.getBean("dog", Animal.class);

		System.out.println(myAnimal.voice());
		
		context.close();
	}

}
