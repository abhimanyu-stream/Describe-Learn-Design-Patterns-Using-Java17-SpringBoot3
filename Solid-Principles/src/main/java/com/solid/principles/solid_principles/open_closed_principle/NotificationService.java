package com.solid.principles.solid_principles.open_closed_principle;

public interface NotificationService {


    public void sendOTP(String medium);

    public void sendMessage(String medium);
}
