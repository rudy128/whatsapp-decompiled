package androidx.work.impl.background.systemalarm;

import X.A5Z;
import X.A7W;
import X.AnonymousClass000;
import X.AnonymousClass8BW;
import X.C21368Aix;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = A5Z.A01("ConstrntProxyUpdtRecvr");

    public void onReceive(Context context, Intent intent) {
        String str;
        Intent intent2 = intent;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            A5Z A002 = A5Z.A00();
            String str2 = A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Ignoring unknown action ");
            AnonymousClass8BW.A16(A002, str, str2, A10);
            return;
        }
        A7W.A00(context).A06.BKq(new C21368Aix(this, intent2, context, goAsync(), 1));
    }
}
