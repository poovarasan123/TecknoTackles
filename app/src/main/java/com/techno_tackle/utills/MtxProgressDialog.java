package com.techno_tackle.utills;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Window;
import com.techno_tackle.R;

public class MtxProgressDialog {

    private static final String TAG = MtxProgressDialog.class.getCanonicalName();

    public static Dialog showLoader(Context context, boolean cancelFlag) {
        Log.d(TAG, "showLoader: ");
        Dialog progressDialog = new Dialog(context);
        progressDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        progressDialog.setCancelable(cancelFlag);
        progressDialog.setContentView(R.layout.dialog_progress);
        progressDialog.show();

        return progressDialog;
    }

    public static void dismissLoader(Dialog progressDialog) {
        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.dismiss();
    }
}
