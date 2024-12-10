package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.269  reason: invalid class name */
public class AnonymousClass269 extends BroadcastReceiver {
    public final C29831cw A00;
    public final AnonymousClass00H A01;

    public void onReceive(Context context, Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("noPopup", true);
        boolean booleanExtra2 = intent.getBooleanExtra("isAndroidWearRefresh", false);
        ((C32291gx) this.A01.get()).A0D(AnonymousClass4aU.A02(intent), booleanExtra, booleanExtra2);
    }

    public AnonymousClass269(C29831cw r1, AnonymousClass00H r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
