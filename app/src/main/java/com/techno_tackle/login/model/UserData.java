package com.techno_tackle.login.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserData {

    @SerializedName("user_id")
    @Expose
    private int user_id;

    @SerializedName("role_id")
    @Expose
    private int role_id;

    @SerializedName("social_login_id")
    @Expose
    private String social_login_id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("user_name")
    @Expose
    private String user_name;

    @SerializedName("password_hash")
    @Expose
    private String password_hash;

    @SerializedName("mobile_number")
    @Expose
    private String mobile_number;

    @SerializedName("email_id")
    @Expose
    private String email_id;

    @SerializedName("phone_otp")
    @Expose
    private int phone_otp;

    @SerializedName("phone_otp_verified_at")
    @Expose
    private String phone_otp_verified_at;

    @SerializedName("login_type")
    @Expose
    private String login_type;

    @SerializedName("is_active")
    @Expose
    private int is_active;

    @SerializedName("is_delete")
    @Expose
    private int is_delete;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getSocial_login_id() {
        return social_login_id;
    }

    public void setSocial_login_id(String social_login_id) {
        this.social_login_id = social_login_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public int getPhone_otp() {
        return phone_otp;
    }

    public void setPhone_otp(int phone_otp) {
        this.phone_otp = phone_otp;
    }

    public String getPhone_otp_verified_at() {
        return phone_otp_verified_at;
    }

    public void setPhone_otp_verified_at(String phone_otp_verified_at) {
        this.phone_otp_verified_at = phone_otp_verified_at;
    }

    public String getLogin_type() {
        return login_type;
    }

    public void setLogin_type(String login_type) {
        this.login_type = login_type;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }
}
