package com.techno_tackle.login.mvp;

import com.techno_tackle.login.model.LoginResponse;

public interface LoginContractor {
    void onLoginSuccess(LoginResponse loginResponse);
    void onLoginFailure(String msg);
    interface onLoginIntractor{
        interface onLoginPresenter{
            void onLoginFinishedListener(LoginResponse loginResponse);
            void onLoginFailureListener(String msg);
        }
        void onLoginApiCall(onLoginPresenter onLoginPresenter);
    }
}
