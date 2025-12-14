package com.springboot.essencial.booting.roomCommandLineApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RoomCLRApplication {


    public void CommandFizzBuzz(){
        for(int i = 1; i<100; i++){
            System.out.println("Counting : "+i);
        }

    }

}
