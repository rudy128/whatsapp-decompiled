package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;

/* renamed from: X.9Om  reason: invalid class name and case insensitive filesystem */
public abstract class C180929Om {
    public static A5J A00(BroadcastReceiver broadcastReceiver, Context context) {
        String sentFromPackage;
        if (Build.VERSION.SDK_INT < 34 || (sentFromPackage = broadcastReceiver.getSentFromPackage()) == null) {
            return null;
        }
        return A5J.A00(context, sentFromPackage, true);
    }
}
