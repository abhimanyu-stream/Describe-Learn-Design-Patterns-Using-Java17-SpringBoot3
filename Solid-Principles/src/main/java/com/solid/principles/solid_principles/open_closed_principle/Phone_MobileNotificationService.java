package com.solid.principles.solid_principles.open_closed_principle;

public class Phone_MobileNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        //write logic to integrate with Phone_Platform like Android or IOS api

    }

    @Override
    public void sendMessage(String medium) {
        //write logic to integrate with Phone_Platform like Android or IOS api

    }
}
