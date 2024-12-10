package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.9jK  reason: invalid class name and case insensitive filesystem */
public final class C189489jK {
    public final AnonymousClass118 A00;

    public C189489jK(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Notification A00() {
        Log.i("p2p/ChatTransferNotificationManager/buildDefaultNotification");
        Context context = this.A00.A00;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (launchIntentForPackage != null) {
            PendingIntent A07 = C17880vN.A07(context, launchIntentForPackage, 0);
            C1409673t A03 = C217217d.A03(context);
            A03.A0M = "other_notifications@1";
            int i = -2;
            if (Build.VERSION.SDK_INT >= 26) {
                i = -1;
            }
            A03.A03 = i;
            A03.A0A = A07;
            C17880vN.A1G(A03);
            A03.A06 = 1;
            A03.A0E(context.getResources().getString(2131895818));
            Notification A05 = A03.A05();
            C18070vi.A0X(A05);
            return A05;
        }
        throw C17880vN.A0g();
    }
}
