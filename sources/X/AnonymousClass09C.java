package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.09C  reason: invalid class name */
public final class AnonymousClass09C extends AnonymousClass0XW implements C17670v2 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r0 != Integer.MAX_VALUE) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A01(X.C28644ECa r9) {
        /*
            r8 = this;
            float r1 = r8.A01
            r7 = 2143289344(0x7fc00000, float:NaN)
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L_0x006a
            int r4 = r9.CG9(r1)
            if (r4 >= r5) goto L_0x0019
            r4 = 0
        L_0x0019:
            float r1 = r8.A00
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0066
            int r3 = r9.CG9(r1)
            if (r3 >= r5) goto L_0x002c
            r3 = 0
        L_0x002c:
            float r1 = r8.A03
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0064
            int r2 = r9.CG9(r1)
            if (r2 <= r4) goto L_0x005f
            r2 = r4
        L_0x003f:
            float r1 = r8.A02
            int r0 = java.lang.Float.compare(r1, r7)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0053
            int r0 = r9.CG9(r1)
            if (r0 <= r3) goto L_0x0058
            r0 = r3
        L_0x0052:
            r5 = r0
        L_0x0053:
            long r0 = X.C26229CvL.A03(r2, r4, r5, r3)
            return r0
        L_0x0058:
            if (r0 >= r5) goto L_0x005c
            r0 = 0
            goto L_0x0052
        L_0x005c:
            if (r0 == r6) goto L_0x0053
            goto L_0x0052
        L_0x005f:
            if (r2 < r5) goto L_0x0064
            if (r2 == r6) goto L_0x0064
            goto L_0x003f
        L_0x0064:
            r2 = 0
            goto L_0x003f
        L_0x0066:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002c
        L_0x006a:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09C.A01(X.ECa):long");
    }

    public static final long A00(long j, long j2) {
        int A032 = Constraints.A03(j2);
        int A033 = Constraints.A03(j);
        int A012 = Constraints.A01(j);
        int A034 = C28851b7.A03(A032, A033, A012);
        int A035 = C28851b7.A03(Constraints.A01(j2), A033, A012);
        int A022 = Constraints.A02(j2);
        int A023 = Constraints.A02(j);
        int A002 = Constraints.A00(j);
        return C26229CvL.A03(A034, A035, C28851b7.A03(A022, A023, A002), C28851b7.A03(Constraints.A00(j2), A023, A002));
    }

    public int BjB(C16860tL r4, C17740v9 r5, int i) {
        long A012 = A01(r5);
        if (Constraints.A09(A012)) {
            return Constraints.A00(A012);
        }
        return C26229CvL.A00(A012, r4.Bj9(i));
    }

    public int BjE(C16860tL r4, C17740v9 r5, int i) {
        long A012 = A01(r5);
        if (Constraints.A0A(A012)) {
            return Constraints.A01(A012);
        }
        return C26229CvL.A01(A012, r4.BjC(i));
    }

    public C16820tH Bja(C17500ul r8, C17530uo r9, long j) {
        int A032;
        int A012;
        int A022;
        int A002;
        long A033;
        long A013 = A01(r9);
        if (this.A04) {
            A033 = A00(j, A013);
        } else {
            if (!AnonymousClass000.A1P(Float.compare(this.A03, Float.NaN))) {
                A032 = Constraints.A03(A013);
            } else {
                A032 = Constraints.A03(j);
                int A014 = Constraints.A01(A013);
                if (A032 > A014) {
                    A032 = A014;
                }
            }
            if (!AnonymousClass000.A1P(Float.compare(this.A01, Float.NaN))) {
                A012 = Constraints.A01(A013);
            } else {
                A012 = Constraints.A01(j);
                int A034 = Constraints.A03(A013);
                if (A012 < A034) {
                    A012 = A034;
                }
            }
            if (!AnonymousClass000.A1P(Float.compare(this.A02, Float.NaN))) {
                A022 = Constraints.A02(A013);
            } else {
                A022 = Constraints.A02(j);
                int A003 = Constraints.A00(A013);
                if (A022 > A003) {
                    A022 = A003;
                }
            }
            if (!AnonymousClass000.A1P(Float.compare(this.A00, Float.NaN))) {
                A002 = Constraints.A00(A013);
            } else {
                A002 = Constraints.A00(j);
                int A023 = Constraints.A02(A013);
                if (A002 < A023) {
                    A002 = A023;
                }
            }
            A033 = C26229CvL.A03(A032, A012, A022, A002);
        }
        AnonymousClass0XJ Bjb = r8.Bjb(A033);
        return r9.BhL(AnonymousClass1D7.A0I(), new C09560gu(Bjb), Bjb.A01, Bjb.A00);
    }

    public int Bjx(C16860tL r4, C17740v9 r5, int i) {
        long A012 = A01(r5);
        if (Constraints.A09(A012)) {
            return Constraints.A00(A012);
        }
        return C26229CvL.A00(A012, r4.Bjv(i));
    }

    public int Bk0(C16860tL r4, C17740v9 r5, int i) {
        long A012 = A01(r5);
        if (Constraints.A0A(A012)) {
            return Constraints.A01(A012);
        }
        return C26229CvL.A01(A012, r4.Bjy(i));
    }
}
