package com.techno_tackle.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameters {

    @SerializedName("user_data")
    @Expose
    private UserData user_data;

    @SerializedName("user_devices")
    @Expose
    private String user_devices;

    @SerializedName("is_profile_updated")
    @Expose
    private String is_profile_updated;

    public UserData getUser_data() {
        return user_data;
    }

    public void setUser_data(UserData user_data) {
        this.user_data = user_data;
    }

    public String getUser_devices() {
        return user_devices;
    }

    public void setUser_devices(String user_devices) {
        this.user_devices = user_devices;
    }

    public String getIs_profile_updated() {
        return is_profile_updated;
    }

    public void setIs_profile_updated(String is_profile_updated) {
        this.is_profile_updated = is_profile_updated;
    }
}
