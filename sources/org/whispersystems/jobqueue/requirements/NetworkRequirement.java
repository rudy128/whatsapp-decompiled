package org.whispersystems.jobqueue.requirements;

import X.C22488B9u;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkRequirement implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient Context A00;

    public boolean Bfv() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    public void CIZ(Context context) {
        this.A00 = context;
    }
}
