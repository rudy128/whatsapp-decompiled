package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.8Bs  reason: invalid class name and case insensitive filesystem */
public abstract class C161098Bs extends BroadcastReceiver {
    public static final String A00 = A5Z.A01("ConstraintProxy");

    public void onReceive(Context context, Intent intent) {
        AnonymousClass8BX.A12(A5Z.A00(), intent, "onReceive : ", A00, AnonymousClass000.A10());
        Intent A07 = AnonymousClass8BR.A07(context, SystemAlarmService.class);
        A07.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(A07);
    }
}
