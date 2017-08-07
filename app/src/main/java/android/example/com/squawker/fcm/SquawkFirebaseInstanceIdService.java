package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by xplore on 8/6/17.
 */

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refrestoken = FirebaseInstanceId.getInstance().getToken();

        Log.d("Token id", refrestoken);
        sendRegistrationToken(refrestoken);
    }

    private void sendRegistrationToken(String refrestoken) {
    }


}
