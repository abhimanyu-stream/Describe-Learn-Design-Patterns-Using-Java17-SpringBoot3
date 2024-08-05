package com.solid.principles.solid_principles.liskov_substitution_principle.solution_code;

public class WhatsApp implements SocialMediaBase,SocialVideoCallManager{

    // Child class WhatsApp completely replaces parent class [SocialMediaBase,SocialVideoCallManager]
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }

    @Override
    public void groupVideoCall(String[] users) {

    }
}
