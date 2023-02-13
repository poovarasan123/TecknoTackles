package com.techno_tackle.utills;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.techno_tackle.login.LoginActivity;


public class BaseActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    String TAG= BaseActivity.class.getSimpleName();
    private Dialog mProgressDialog;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialog = new ProgressDialog(BaseActivity.this);
    }

    public boolean isNetworkConnected()
    {
        return NetworkConnectivity.checkNow(BaseActivity.this);
    }


    public void showLoading()
    {
        Log.e(TAG, "showLoading: called" );
        Log.d(TAG, "showLoading: ");
        if ( (mProgressDialog == null || !mProgressDialog.isShowing()))
            mProgressDialog = MtxProgressDialog.showLoader(this, false);
    }


    public void hideLoading()
    {
        MtxProgressDialog.dismissLoader(mProgressDialog);
    }

    @Override
    protected void onStart() {
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeListener, filter);
        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeListener);
        super.onStop();
    }


    @Override
    protected void onDestroy()
    {
        if(mProgressDialog!=null)
            MtxProgressDialog.dismissLoader(mProgressDialog);
        super.onDestroy();
    }

    public void do_logout_and_login_redirect(){
        PreferenceManager.clearAllPreferences();
        Intent myintent=new Intent(getApplicationContext(), LoginActivity.class);
        myintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(myintent);
        finish();
    }

}
