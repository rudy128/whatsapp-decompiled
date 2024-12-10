package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.264  reason: invalid class name */
public final class AnonymousClass264 extends BroadcastReceiver {
    public final C31381fT A00;

    public AnonymousClass264(C31381fT r1) {
        C17960vV.A07(r1);
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            C57082iV r8 = new C57082iV(getResultData(), getResultExtras(true).getLong("timestamp", Long.MAX_VALUE));
            intent.getPackage();
            String str = intent.getPackage();
            C31381fT r6 = this.A00;
            C57082iV BX3 = r6.BX3();
            if (BX3.A01 == null || (r8.A01 != null && r8.A00 < BX3.A00)) {
                r6.CJu(r8);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("updated phone id from ");
                A10.append(BX3);
                A10.append(" to ");
                A10.append(r8);
                C17900vP.A0f(" based on package ", str, A10);
                return;
            }
            return;
        }
        intent.getPackage();
    }
}
