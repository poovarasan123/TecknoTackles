package com.techno_tackle.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.techno_tackle.MainActivity;
import com.techno_tackle.R;
import com.techno_tackle.login.model.LoginCreds;
import com.techno_tackle.login.model.LoginResponse;
import com.techno_tackle.login.mvp.LoginContractor;
import com.techno_tackle.login.mvp.LoginIntractor;
import com.techno_tackle.login.mvp.LoginPresenter;
import com.techno_tackle.utills.BaseActivity;
import com.techno_tackle.utills.Constants;
import com.techno_tackle.utills.PreferenceManager;

public class LoginActivity extends BaseActivity  implements LoginContractor {

    EditText ed_mobile_number, ed_password;
    ImageView img_pass_visible;
    TextView tv_forgot, tv_login_btn;
    String mobile, password;
    String ip_address, unique_device_id, auth_token;
    LoginCreds loginCreds;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_mobile_number = findViewById(R.id.ed_mobile_number);
        ed_password = findViewById(R.id.ed_password);
        img_pass_visible = findViewById(R.id.img_pass_visible);
        tv_forgot = findViewById(R.id.tv_forgot);
        tv_login_btn = findViewById(R.id.tv_login_btn);

        tv_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLoading();
//                mobile = ed_mobile_number.getText().toString().trim();
//                password = ed_password .getText().toString().trim();
                mobile = "8489276255";
                password = "praga123";
                ip_address = "JOIEIXONCJE";
                unique_device_id = "EJCC87C6C";
                auth_token = "a1106697fc62ff4ff9fa036a8d7af1ba";
                loginCreds = new LoginCreds(mobile, password, ip_address, unique_device_id, auth_token);
                Log.e("TAG", "onClick: " + loginCreds.toString() );
                loginPresenter = new LoginPresenter(LoginActivity.this,new LoginIntractor());
                loginPresenter.validateDetails(loginCreds);

            }
        });

    }

    @Override
    public void onLoginSuccess(LoginResponse loginResponse) {
        hideLoading();
        if (loginResponse.isSuccess()){
            PreferenceManager.setBoolean(Constants.IS_LOGGEDIN, true);
            startActivity(new Intent(this, MainActivity.class));
        }else{
            Toast.makeText(this, loginResponse.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onLoginFailure(String msg) {
        hideLoading();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}