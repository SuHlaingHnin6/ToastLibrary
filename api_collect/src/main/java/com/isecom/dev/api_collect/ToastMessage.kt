package com.isecom.dev.api_collect

import android.content.Context
import android.widget.Toast

public class ToastMessage {

    public fun mtoast (context : Context, msg : String){
        Toast.makeText(context,"$msg",Toast.LENGTH_LONG).show()
    }
}