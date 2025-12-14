package com.springboot.essencial.booting;

import com.springboot.essencial.booting.roomCommandLineApplication.RoomCLRApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootingApplication {

	public static void main(String[] args) {

 /* 1 lesson create and run the project
  SpringApplication.run(BootingApplication.class, args);
*/

/*	2 lesson to print 1 to 100
	for(int i = 1; i<100; i++){
		System.out.println("Counting : "+i);
	}
 */

/*
3 Command Line Runner - Test using fizzbuzz
		SpringApplication.run(BootingApplication.class, args);}
	@Bean
	public CommandLineRunner run(){
		return args -> {
			for(int i = 0; i<101; i++){
				String result = "";
				result += (i % 3 == 0 ? "Fizz" : "" );
				result += (i % 5 == 0 ? "Buzz" : "" );
				System.out.println(!result.isEmpty() ? result : i);

			}
		};
Resolve FizzBuzz. Create variable to put, make the calculation if this calculation return 0 (%) print  FizzBuzz. In case the divison isn't 0 - so this variable its not empty, so print the number.  Another exercise to do, instead you make an interaction number, change to input a number - use the documentation if you need to learn more.
*/

}


}
