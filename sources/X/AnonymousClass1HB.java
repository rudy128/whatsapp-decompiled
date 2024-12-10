package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1HB  reason: invalid class name */
public final class AnonymousClass1HB {
    public AnonymousClass4NU A00;
    public final C222119a A01;

    public void A00(String str, boolean z, boolean z2) {
        this.A01.A0B(str, z, z2);
    }

    public boolean A01(View view, C23571Gu r6, String str, long j) {
        if (view != null && this.A01.A05.A02) {
            AnonymousClass4NU r2 = new AnonymousClass4NU(view);
            this.A00 = r2;
            C53712cy r1 = new C53712cy(this, r6);
            C17960vV.A02();
            C17960vV.A02();
            if (r2.A00) {
                Handler handler = new Handler(Looper.getMainLooper());
                Message obtain = Message.obtain(handler, new C21448AkF(r1.A01, 15));
                AnonymousClass25R.A00(obtain);
                handler.sendMessageAtFrontOfQueue(obtain);
            } else {
                List list = r2.A02;
                list.add(r1);
                Collections.sort(list, new C98924rw(10));
            }
        }
        return this.A01.A0D(str, j);
    }

    public AnonymousClass1HB(AnonymousClass1HA r2, C222219b r3, String str) {
        this.A01 = r2.A01(r3, str);
    }
}
