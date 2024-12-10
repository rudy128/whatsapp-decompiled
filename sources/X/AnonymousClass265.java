package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.util.Log;

/* renamed from: X.265  reason: invalid class name */
public class AnonymousClass265 extends BroadcastReceiver {
    public final int A00;
    public final Object A01;

    public AnonymousClass265(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        switch (this.A00) {
            case 0:
                try {
                    AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                    r2.A2Q.unregisterReceiver(this);
                    Log.i("conversation/reset-ime");
                    InputMethodManager A0N = r2.A2Q.getSystemServices().A0N();
                    C17960vV.A07(A0N);
                    A0N.restartInput(r2.A3Z);
                    r2.A0A = null;
                    return;
                } catch (Exception e) {
                    Log.e("conversation/unregister user present receiver ", e);
                    return;
                }
            case 1:
                AnonymousClass11X.A01 = null;
                AnonymousClass11X.A02 = null;
                AnonymousClass11X.A03 = null;
                return;
            default:
                AnonymousClass11X.A01 = null;
                AnonymousClass11X.A02 = null;
                AnonymousClass11X.A03 = null;
                C61792qG r5 = (C61792qG) this.A01;
                C33451iq r4 = r5.A0B;
                C63592tN A002 = r4.A03.A00();
                if (A002 != null) {
                    int i = A002.A01;
                    C17900vP.A0j("UserNoticeManager/handleLocaleChange/notice id:", AnonymousClass000.A10(), i);
                    C33421in r1 = r4.A02;
                    r1.A05(i);
                    if (r4.A04.A04() && !C63802ti.A02(r4.A01, A002)) {
                        r1.A06(i);
                    }
                }
                C24921Me r12 = r5.A07;
                r12.A06.clear();
                r12.A07.clear();
                return;
        }
    }
}
