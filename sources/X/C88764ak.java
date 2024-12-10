package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.4ak  reason: invalid class name and case insensitive filesystem */
public final class C88764ak implements Activity.ScreenCaptureCallback {
    public boolean A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass1E7 A03;
    public final AnonymousClass18K A04;

    public C88764ak(Context context, AnonymousClass1E7 r3, AnonymousClass18K r4, int i) {
        C18070vi.A0f(r4, 2, r3);
        this.A02 = context;
        this.A04 = r4;
        this.A01 = i;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0041, code lost:
        if (r0 != null) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScreenCaptured() {
        /*
            r4 = this;
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0055
            android.content.Context r0 = r4.A02
            r3 = 0
            r2 = 0
            X.3Ri r1 = X.C73193Ri.A00(r0)
            r0 = 2131895469(0x7f1224ad, float:1.9425772E38)
            r1.A0V(r0)
            r0 = 2131895470(0x7f1224ae, float:1.9425774E38)
            r1.A0U(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            r1.A0X(r2, r0)
            r1.A0C()
            X.3zo r2 = new X.3zo
            r2.<init>()
            int r0 = r4.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.1E7 r1 = r4.A03
            boolean r0 = r1.A0C()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            X.2lf r0 = r1.A0H
            if (r0 != 0) goto L_0x0043
            X.1E7 r0 = r1.A0I
            r1 = 0
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A01 = r0
            X.18K r0 = r4.A04
            r0.CC7(r2)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88764ak.onScreenCaptured():void");
    }

    public final void A00(boolean z) {
        this.A00 = z;
    }
}
