package com.solid.principles.solid_principles.liskov_substitution_principle.bad_code;

public class Instagram extends SocialMedia {

    public void chatWithFriend() {

    }

    @Override
    public void groupChatWithFriend() {

    }

    public void publishPost(Object post) {

    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {
        //not applicable
    }
}
