package com.learning.jan_philipp.criminalIntent;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jan-philipp on 21.09.14.
 */
public class Photo {
    private static final String JSON_FILENAME = "filename";

    private String mFilename;

    public Photo(String filename){
        mFilename = filename;
    }

    public Photo(JSONObject json) throws JSONException{
        mFilename = json.getString(JSON_FILENAME);
    }

    public JSONObject toJSON() throws JSONException{
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }

    public String getFilename(){
        return mFilename;
    }
}
