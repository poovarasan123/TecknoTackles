package com.techno_tackle.utills;

import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class PreferenceManager {


    private static SharedPreferences sharedPreferences;


    public static void initializePreferenceManager(SharedPreferences preferences)
    {
        sharedPreferences = preferences;
    }


    public static boolean getBoolean(String key, boolean defaultValue)
    {
        return sharedPreferences.getBoolean(key, defaultValue);
    }


    public static void setBoolean(String key, boolean value)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }


    public static String getString(String key, String defaultValue)
    {
        return sharedPreferences.getString(key, defaultValue);
    }

    public static void setString(String key, String value)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (value == null)
            editor.putString(key, "").apply();
        else
            editor.putString(key, value).apply();
    }


    public static int getInteger(String key, int defaultValue)
    {
        return sharedPreferences.getInt(key, defaultValue);
    }


    public static void setInteger(String key, int value)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value).apply();
    }


    public static void clearAllPreferences(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear().apply();
    }



}
