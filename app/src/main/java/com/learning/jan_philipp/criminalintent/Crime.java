package com.learning.jan_philipp.criminalintent;

import java.util.UUID;

/**
 * Created by jan-philipp on 16.07.14.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){

        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }


}
