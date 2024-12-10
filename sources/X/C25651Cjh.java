package X;

import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: X.Cjh  reason: case insensitive filesystem */
public final class C25651Cjh {
    public GoogleApiAvailabilityLight A00;
    public final SparseIntArray A01;

    public C25651Cjh(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.A01 = new SparseIntArray();
        C18210vx.A00(googleApiAvailabilityLight);
        this.A00 = googleApiAvailabilityLight;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r3 = r6.BUx();
        r2 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(android.content.Context r5, X.EDS r6) {
        /*
            r4 = this;
            X.C18210vx.A00(r5)
            X.C18210vx.A00(r6)
            boolean r0 = r6.CFd()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            int r3 = r6.BUx()
            android.util.SparseIntArray r2 = r4.A01
            r0 = -1
            int r1 = r2.get(r3, r0)
            if (r1 != r0) goto L_0x0031
            r1 = 0
        L_0x001b:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0035
            int r0 = r2.keyAt(r1)
            if (r0 <= r3) goto L_0x0032
            int r0 = r2.get(r0)
            if (r0 != 0) goto L_0x0032
            r1 = 0
        L_0x002e:
            r2.put(r3, r1)
        L_0x0031:
            return r1
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x0035:
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = r4.A00
            int r1 = r0.A02(r5, r3)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25651Cjh.A00(android.content.Context, X.EDS):int");
    }

    public C25651Cjh() {
        this(C41381wH.A00);
    }
}
