package com.techno_tackle.login.mvp;

import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.techno_tackle.login.model.LoginCreds;
import com.techno_tackle.login.model.LoginResponse;
import com.techno_tackle.retrofit.TechnoTackleApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginIntractor implements LoginContractor.onLoginIntractor{

  LoginCreds loginCreds;
    interface onIntractorListener{
        void onSuccess();
        void onFailure(String msg);
    }

    public void directValidator(LoginCreds loginCreds, onIntractorListener onIntractorListener){
        this.loginCreds = loginCreds;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(loginCreds.getMobile_number())){
                    onIntractorListener.onFailure("Mobile number is required");
                    return;
                }
                if (TextUtils.isEmpty(loginCreds.getPassword_hash())){
                    onIntractorListener.onFailure("Password is required");
                    return;
                }
                onIntractorListener.onSuccess();
            }
        },500);
    }

    @Override
    public void onLoginApiCall(onLoginPresenter onLoginPresenter) {
        TechnoTackleApi.getMatrixClient().GettingLoginResponse(loginCreds).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()){
                    if (response.body() != null){
                        if (response.body().isSuccess()){
                            onLoginPresenter.onLoginFinishedListener(response.body());
                        }else{
                            onLoginPresenter.onLoginFailureListener(response.body().getMessage());
                        }
                    }else{
                        onLoginPresenter.onLoginFailureListener(response.message());
                    }
                }else{
                    onLoginPresenter.onLoginFailureListener(response.message());
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                onLoginPresenter.onLoginFailureListener(t.getMessage());
            }
        });
    }
}
