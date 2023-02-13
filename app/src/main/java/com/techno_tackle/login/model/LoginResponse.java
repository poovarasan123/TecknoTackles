package com.techno_tackle.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginResponse {

    @SerializedName("success")
    @Expose
    private boolean success;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("parameters")
    @Expose
    private Parameters parameters;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }
}
