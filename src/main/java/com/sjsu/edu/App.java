/**
 * 
 */
package com.sjsu.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author pvo
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/sjsu/edu/beans/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sjsu/edu/beans/beans.xml");
		
		Person person1 = (Person)context.getBean("person");
		//Person person2 = (Person)context.getBean("person");
		person1.setTaxId(999);
		System.out.println(person1);

		//Person person = new Person();
		//person1.speak();
		Address address = (Address)context.getBean("address2");
		System.out.println(address);
		//System.out.println(person2);
		
		
		//to close the application context
		((ClassPathXmlApplicationContext)context).close();

	}

}
