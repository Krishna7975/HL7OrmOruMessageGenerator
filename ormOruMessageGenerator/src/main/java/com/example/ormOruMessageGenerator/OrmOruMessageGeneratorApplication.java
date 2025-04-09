package com.example.ormOruMessageGenerator;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmOruMessageGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmOruMessageGeneratorApplication.class, args);

    }
}

