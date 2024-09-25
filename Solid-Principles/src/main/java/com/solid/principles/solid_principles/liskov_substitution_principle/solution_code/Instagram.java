package com.solid.principles.solid_principles.liskov_substitution_principle.solution_code;

public class Instagram implements SocialMediaBase,PostMediaManager{


    // Child class Instagram completely replaces parent class [SocialMediaBase,PostMediaManager]
    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void sendPhotosAndVideos() {

    }
}
