package com.solid.principles.solid_principles.open_closed_principle;

public class WhatsAppNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        //write logic to integrate with WhatsApp depends on platform like IOS or Android api

    }

    @Override
    public void sendMessage(String medium) {
        //write logic to integrate with WhatsApp depends on platform like IOS or Android api
    }
}
