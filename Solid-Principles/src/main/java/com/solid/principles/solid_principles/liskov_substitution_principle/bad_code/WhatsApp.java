package com.solid.principles.solid_principles.liskov_substitution_principle.bad_code;

import com.solid.principles.solid_principles.liskov_substitution_principle.bad_code.SocialMedia;

public class WhatsApp extends SocialMedia {


    public void chatWithFriend() {

    }

    @Override
    public void groupChatWithFriend() {

    }

    public void publishPost(Object post) {
    //Not applicable
    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }
}
