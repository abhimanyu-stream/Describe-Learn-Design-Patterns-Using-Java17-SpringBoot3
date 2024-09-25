package com.stream.proxy_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyPatternApplication {

    public static void main(String[] args) {
        //updates

        SpringApplication.run(ProxyPatternApplication.class, args);
        ATM atm = new ATM();
        atm.withdraw();
        atm.getAccountNumber();
    }

}
