package com.techno_tackle.utills;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class common {
    public static boolean isConnectedToInternet(Context context) {

        try
        {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
            if (activeNetwork != null && activeNetwork.isConnected()) {
                return true;
            }else {
                return false;
            }
        } catch (Exception e)
        {
            System.out.println("CheckConnectivity Exception: " + e.getMessage());
        }

        return false;

    }
}
