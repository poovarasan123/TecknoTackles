package com.techno_tackle.login.mvp;

import com.techno_tackle.login.model.LoginCreds;
import com.techno_tackle.login.model.LoginResponse;

public class LoginPresenter implements LoginContractor.onLoginIntractor.onLoginPresenter, LoginIntractor.onIntractorListener{

    LoginContractor loginContractor;
    LoginIntractor loginIntractor;

    public LoginPresenter(LoginContractor loginContractor, LoginIntractor loginIntractor) {
        this.loginContractor = loginContractor;
        this.loginIntractor = loginIntractor;
    }

    public void validateDetails(LoginCreds loginCreds){
        loginIntractor.directValidator(loginCreds, this);
    }

    @Override
    public void onLoginFinishedListener(LoginResponse loginResponse) {
        loginContractor.onLoginSuccess(loginResponse);
    }

    @Override
    public void onLoginFailureListener(String msg) {
loginContractor.onLoginFailure(msg);
    }

    @Override
    public void onSuccess() {
        loginIntractor.onLoginApiCall(this);
    }

    @Override
    public void onFailure(String msg) {
        loginContractor.onLoginFailure(msg);
    }
}
