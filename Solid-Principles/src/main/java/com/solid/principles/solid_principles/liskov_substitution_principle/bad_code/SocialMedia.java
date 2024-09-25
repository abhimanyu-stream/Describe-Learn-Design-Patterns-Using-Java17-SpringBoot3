package com.solid.principles.solid_principles.liskov_substitution_principle.bad_code;

public abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract  void chatWithFriend();
    public abstract  void groupChatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract  void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract  void groupVideoCall(String[] users);
}
