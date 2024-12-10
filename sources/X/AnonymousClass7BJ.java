package X;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: X.7BJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BJ implements OnFailureListener {
    public static final /* synthetic */ AnonymousClass7BJ A00 = new Object();

    public final void onFailure(Exception exc) {
        Log.w("NearbyConnections", "Failed to start discovery.", exc);
    }
}
