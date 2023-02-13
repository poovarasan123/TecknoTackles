package com.techno_tackle.retrofit;

import com.techno_tackle.login.model.LoginCreds;
import com.techno_tackle.login.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TechnoTackleInterface {

    @POST("login")
    Call<LoginResponse> GettingLoginResponse(@Body LoginCreds loginCreds);

}
