package com.darshana.assignment_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment01Application {

	public static void main(String[] args) {
		//SpringApplication.run(Assignment01Application.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("./heroes.xml");

		Superman superman1 = context.getBean(Superman.class);
		Superman superman2 = context.getBean(Superman.class);

		superman1.action();

		WonderWoman wonderWoman1 = context.getBean(WonderWoman.class);
		WonderWoman wonderWoman2 = context.getBean(WonderWoman.class);

		wonderWoman1.action();

		TalkingCat talkingCat = context.getBean(TalkingCat.class);
		talkingCat.action();

		System.out.println(superman1 == superman2);
		System.out.println(wonderWoman1 == wonderWoman2);







	}

}
