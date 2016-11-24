package com.example.huang.cookhelper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;

/**
 * Created by kevin on 2016-11-23.
 */

public abstract class Search {
    public boolean parse(){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting().serializeNulls();
        Gson gson = builder.create();
        gson.fromJson(IOUtils.toString(blahblah.json, Recipe.class);
        return false;
    }
}