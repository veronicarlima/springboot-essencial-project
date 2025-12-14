package com.springboot.essencial.booting;

import com.springboot.essencial.booting.roomCommandLineApplication.RoomCLRApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootingApplication {



	public static void main(String[] args) {
		SpringApplication.run(BootingApplication.class, args);
	}


}
