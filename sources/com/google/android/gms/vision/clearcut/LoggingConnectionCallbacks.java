package com.google.android.gms.vision.clearcut;

import X.C23203Bcx;
import X.EDW;
import X.EDX;
import android.os.Bundle;

public abstract class LoggingConnectionCallbacks implements EDW, EDX {
    public abstract void onConnected(Bundle bundle);

    public abstract void onConnectionFailed(C23203Bcx bcx);

    public abstract void onConnectionSuspended(int i);
}
