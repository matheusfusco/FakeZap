package com.rm45401.fiap.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService
import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.orhanobut.hawk.Hawk


/**
 * Created by logonrm on 19/03/2018.
 */

class MeuFireBaseInstanceIdService: FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Refreshed token: " + refreshedToken!!)

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        Hawk.put("TOKENFIREBASE", refreshedToken)
        //sendRegistrationToServer(refreshedToken)
    }
}