package androidx.compose.runtime;

import X.AnonymousClass0EJ;
import X.AnonymousClass1OS;
import X.C03560It;
import X.C04770Os;
import X.C17860vL;
import X.C18560wh;
import X.C18570wi;
import X.C23801Hr;

public final class PausableMonotonicFrameClock implements C17860vL {
    public final C03560It A00 = new C03560It();
    public final C17860vL A01;

    public /* synthetic */ C23801Hr getKey() {
        return AnonymousClass0EJ.A00();
    }

    public final void A00() {
        C03560It r2 = this.A00;
        synchronized (r2.A03) {
            r2.A01 = false;
        }
    }

    public final void A01() {
        this.A00.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CSE(X.C30391dr r7, X.C22821Di r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C07570bM
            if (r0 == 0) goto L_0x0054
            r5 = r7
            X.0bM r5 = (X.C07570bM) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r1) goto L_0x0039
            if (r0 != r2) goto L_0x005a
            X.C30691eM.A01(r4)
        L_0x0025:
            return r4
        L_0x0026:
            X.C30691eM.A01(r4)
            X.0It r0 = r6.A00
            r5.L$0 = r6
            r5.L$1 = r8
            r5.label = r1
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L_0x0053
            r0 = r6
            goto L_0x0044
        L_0x0039:
            java.lang.Object r8 = r5.L$1
            X.1Di r8 = (X.C22821Di) r8
            java.lang.Object r0 = r5.L$0
            androidx.compose.runtime.PausableMonotonicFrameClock r0 = (androidx.compose.runtime.PausableMonotonicFrameClock) r0
            X.C30691eM.A01(r4)
        L_0x0044:
            X.0vL r1 = r0.A01
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r2
            java.lang.Object r4 = r1.CSE(r5, r8)
            if (r4 != r3) goto L_0x0025
        L_0x0053:
            return r3
        L_0x0054:
            X.0bM r5 = new X.0bM
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.PausableMonotonicFrameClock.CSE(X.1dr, X.1Di):java.lang.Object");
    }

    public PausableMonotonicFrameClock(C17860vL r2) {
        this.A01 = r2;
    }

    public Object fold(Object obj, AnonymousClass1OS r3) {
        return C04770Os.A00(this, obj, r3);
    }

    public C18570wi get(C23801Hr r2) {
        return C04770Os.A01(this, r2);
    }

    public C18560wh minusKey(C23801Hr r2) {
        return C04770Os.A02(this, r2);
    }

    public C18560wh plus(C18560wh r2) {
        return C04770Os.A03(this, r2);
    }
}
