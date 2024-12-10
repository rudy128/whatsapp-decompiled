package androidx.compose.foundation.lazy.layout;

import X.AnonymousClass0EW;
import X.AnonymousClass0LD;
import X.AnonymousClass1OS;
import X.C17090tj;
import X.C17390ua;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;

public final class AwaitFirstLayoutModifier implements C17390ua {
    public C30391dr A00;
    public boolean A01;

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C07550bK
            if (r0 == 0) goto L_0x0053
            r5 = r7
            X.0bK r5 = (X.C07550bK) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0053
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r1 = 1
            if (r0 == 0) goto L_0x0030
            if (r0 != r1) goto L_0x0059
            java.lang.Object r2 = r5.L$1
            X.1dr r2 = (X.C30391dr) r2
            X.C30691eM.A01(r4)
        L_0x0026:
            if (r2 == 0) goto L_0x002d
            X.1Wu r0 = X.C27621Wu.A00
            r2.resumeWith(r0)
        L_0x002d:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0030:
            X.C30691eM.A01(r4)
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x002d
            X.1dr r2 = r6.A00
            r5.L$0 = r6
            r5.L$1 = r2
            r5.label = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C71053Dp.A01
            X.1dr r1 = X.C30581eB.A02(r5)
            X.3Dp r0 = new X.3Dp
            r0.<init>(r1)
            r6.A00 = r0
            java.lang.Object r0 = r0.A00()
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x0053:
            X.0bK r5 = new X.0bK
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0059:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier.A00(X.1dr):java.lang.Object");
    }

    public void BvJ() {
        if (!this.A01) {
            this.A01 = true;
            C30391dr r1 = this.A00;
            if (r1 != null) {
                r1.resumeWith(C27621Wu.A00);
            }
            this.A00 = null;
        }
    }
}
