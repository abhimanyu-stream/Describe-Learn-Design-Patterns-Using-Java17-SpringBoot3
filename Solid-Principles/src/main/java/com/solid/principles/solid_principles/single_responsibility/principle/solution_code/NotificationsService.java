package com.solid.principles.solid_principles.single_responsibility.principle.solution_code;

public class NotificationsService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //write logic using twillio API
        }
    }
}
