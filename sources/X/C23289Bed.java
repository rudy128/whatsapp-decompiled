package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bed  reason: case insensitive filesystem */
public final class C23289Bed extends BG6 {
    public final Context A00;
    public final /* synthetic */ C41381wH A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23289Bed(android.content.Context r2, X.C41381wH r3) {
        /*
            r1 = this;
            r1.A01 = r3
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x0016
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000c:
            r1.<init>(r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.A00 = r0
            return
        L_0x0016:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23289Bed.<init>(android.content.Context, X.1wH):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", AnonymousClass001.A1I("Don't know how to handle this message: ", AnonymousClass000.A10(), i));
            return;
        }
        C41381wH r6 = this.A01;
        Context context = this.A00;
        int A02 = r6.A02(context, 12451000);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
        if (A02 == 1 || A02 == 2 || A02 == 3 || A02 == 9) {
            Intent A03 = r6.A03(context, "n", A02);
            if (A03 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, A03, CF9.A00 | 134217728);
            }
            r6.A05(activity, context, A02);
        }
    }
}
