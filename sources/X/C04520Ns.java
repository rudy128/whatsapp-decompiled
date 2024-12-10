package X;

import android.view.View;

/* renamed from: X.0Ns  reason: invalid class name and case insensitive filesystem */
public abstract class C04520Ns {
    public static final int A00(long j) {
        C04660Og A00 = C02750Ff.A00((int) j);
        int A03 = A00.A03(j);
        int A01 = A00.A01(j);
        int i = 1073741824;
        if (A03 != A01) {
            i = Integer.MIN_VALUE;
            if (A01 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A01, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r1.A02(r10) < r4) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r1 > r4) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r4 != X.AnonymousClass000.A0H(r12)) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r1.A01(r10) < r4) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r1 > r4) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r4 != X.AnonymousClass000.A0H(r12 >> 32)) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(long r8, long r10, long r12) {
        /*
            r7 = 1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            r0 = 32
            long r1 = r8 >>> r0
            int r0 = (int) r1
            X.0Og r0 = X.C02750Ff.A00(r0)
            int r4 = r0.A02(r8)
            int r3 = r0.A04(r8)
            if (r4 != r3) goto L_0x0023
            r0 = 32
            long r0 = r12 >> r0
            int r0 = X.AnonymousClass000.A0H(r0)
            r6 = 1
            if (r4 == r0) goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            r5 = 32
            long r0 = r10 >>> r5
            int r2 = (int) r0
            X.0Og r1 = X.C02750Ff.A00(r2)
            int r0 = r1.A04(r10)
            if (r0 > r3) goto L_0x003a
            int r0 = r1.A02(r10)
            r2 = 1
            if (r0 >= r4) goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            long r0 = r12 >> r5
            int r1 = X.AnonymousClass000.A0H(r0)
            if (r3 > r1) goto L_0x0046
            r0 = 1
            if (r1 <= r4) goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r6 != 0) goto L_0x004d
            if (r2 == 0) goto L_0x0090
            if (r0 == 0) goto L_0x0090
        L_0x004d:
            r6 = 1
        L_0x004e:
            int r0 = (int) r8
            X.0Og r0 = X.C02750Ff.A00(r0)
            int r4 = r0.A01(r8)
            int r5 = r0.A03(r8)
            if (r4 != r5) goto L_0x0064
            int r0 = X.AnonymousClass000.A0H(r12)
            r3 = 1
            if (r4 == r0) goto L_0x0065
        L_0x0064:
            r3 = 0
        L_0x0065:
            int r0 = (int) r10
            X.0Og r1 = X.C02750Ff.A00(r0)
            int r0 = r1.A03(r10)
            if (r0 > r5) goto L_0x0077
            int r0 = r1.A01(r10)
            r2 = 1
            if (r0 >= r4) goto L_0x0078
        L_0x0077:
            r2 = 0
        L_0x0078:
            int r1 = X.AnonymousClass000.A0H(r12)
            if (r5 > r1) goto L_0x0081
            r0 = 1
            if (r1 <= r4) goto L_0x0082
        L_0x0081:
            r0 = 0
        L_0x0082:
            if (r3 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x008e
            if (r0 == 0) goto L_0x008e
        L_0x0088:
            r0 = 1
        L_0x0089:
            if (r6 == 0) goto L_0x0092
            if (r0 == 0) goto L_0x0092
        L_0x008d:
            return r7
        L_0x008e:
            r0 = 0
            goto L_0x0089
        L_0x0090:
            r6 = 0
            goto L_0x004e
        L_0x0092:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04520Ns.A02(long, long, long):boolean");
    }

    public static final int A01(long j) {
        C04660Og A00 = C02750Ff.A00((int) (j >>> 32));
        int A04 = A00.A04(j);
        int A02 = A00.A02(j);
        int i = 1073741824;
        if (A04 != A02) {
            i = Integer.MIN_VALUE;
            if (A02 == Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        return View.MeasureSpec.makeMeasureSpec(A02, i);
    }
}
