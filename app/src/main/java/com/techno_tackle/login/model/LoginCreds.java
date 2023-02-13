package com.techno_tackle.login.model;

public class LoginCreds {

    String mobile_number, password_hash, ip_address, unique_device_id, auth_token;

    public LoginCreds(String mobile_number, String password_hash, String ip_address, String unique_device_id, String auth_token) {
        this.mobile_number = mobile_number;
        this.password_hash = password_hash;
        this.ip_address = ip_address;
        this.unique_device_id = unique_device_id;
        this.auth_token = auth_token;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public String getUnique_device_id() {
        return unique_device_id;
    }

    public void setUnique_device_id(String unique_device_id) {
        this.unique_device_id = unique_device_id;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    @Override
    public String toString() {
        return "LoginCreds{" +
                "mobile_number='" + mobile_number + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", ip_address='" + ip_address + '\'' +
                ", unique_device_id='" + unique_device_id + '\'' +
                ", auth_token='" + auth_token + '\'' +
                '}';
    }
}
