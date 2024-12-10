package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cxp  reason: case insensitive filesystem */
public final /* synthetic */ class C26332Cxp implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        PendingIntent pendingIntent;
        int i2 = this.A00;
        Activity activity = this.A02;
        int i3 = this.A01;
        AnonymousClass00H r0 = C20134A8u.A00;
        try {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
            Intent A03 = GoogleApiAvailabilityLight.A00.A03(activity, (String) null, i2);
            if (A03 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(activity, i3, A03, CF9.A00 | 134217728);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("gdrive-util/get-error-dialog starting resolution for ");
            C17890vO.A19(A10, C41361wE.A02(i2));
            C23203Bcx bcx = new C23203Bcx(i2, pendingIntent);
            if (bcx.A00()) {
                PendingIntent pendingIntent2 = bcx.A02;
                C18210vx.A00(pendingIntent2);
                activity.startIntentSenderForResult(pendingIntent2.getIntentSender(), i3, (Intent) null, 0, 0, 0);
            }
        } catch (IntentSender.SendIntentException e) {
            Log.e("gdrive-util/get-error-dialog", e);
        }
    }

    public /* synthetic */ C26332Cxp(Activity activity, int i, int i2) {
        this.A00 = i;
        this.A02 = activity;
        this.A01 = i2;
    }
}
