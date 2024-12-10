package X;

public class D9W implements C28601E9s {
    public final C28601E9s[] A00;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r4 > r17) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BFn(long r17, long r19) {
        /*
            r16 = this;
            r15 = 0
        L_0x0001:
            r0 = r16
            X.E9s[] r8 = r0.A00
            int r7 = r8.length
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -9223372036854775808
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r9 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = -9223372036854775808
        L_0x0019:
            if (r9 >= r7) goto L_0x0030
            r0 = r8[r9]
            long r0 = r0.BVO()
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x002d
            long r4 = java.lang.Math.min(r4, r0)
            long r2 = java.lang.Math.max(r2, r0)
        L_0x002d:
            int r9 = r9 + 1
            goto L_0x0019
        L_0x0030:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r10, r10)
        L_0x0039:
            java.lang.Object r0 = r0.first
            long r11 = X.C17880vN.A05(r0)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            r0 = 0
        L_0x0044:
            if (r0 >= r7) goto L_0x0056
            int r0 = r0 + 1
            goto L_0x0044
        L_0x0049:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            goto L_0x0039
        L_0x0056:
            r10 = 0
            r9 = 0
        L_0x0058:
            if (r10 >= r7) goto L_0x007d
            r6 = r8[r10]
            long r4 = r6.BVO()
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r2 = r17
            if (r0 == 0) goto L_0x006b
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0075
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x0058
        L_0x0075:
            r0 = r19
            boolean r0 = r6.BFn(r2, r0)
            r9 = r9 | r0
            goto L_0x0072
        L_0x007d:
            r15 = r15 | r9
            if (r9 != 0) goto L_0x0001
        L_0x0080:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D9W.BFn(long, long):boolean");
    }

    public void BEV(long j) {
        for (C28601E9s BEV : this.A00) {
            BEV.BEV(j);
        }
    }

    public final long BNp(long j) {
        long j2 = Long.MAX_VALUE;
        for (C28601E9s BNp : this.A00) {
            long BNp2 = BNp.BNp(j);
            if (BNp2 != Long.MIN_VALUE) {
                if (BNp2 <= 0) {
                    return 0;
                }
                j2 = Math.min(j2, BNp2);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return 0;
        }
        return j2;
    }

    public final long BNq() {
        long j = Long.MAX_VALUE;
        for (C28601E9s BNq : this.A00) {
            long BNq2 = BNq.BNq();
            if (BNq2 != Long.MIN_VALUE) {
                j = Math.min(j, BNq2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long BVO() {
        long j = Long.MAX_VALUE;
        for (C28601E9s BVO : this.A00) {
            long BVO2 = BVO.BVO();
            if (BVO2 != Long.MIN_VALUE) {
                j = Math.min(j, BVO2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public void CK0(boolean z) {
        for (C28601E9s CK0 : this.A00) {
            CK0.CK0(z);
        }
    }

    public void CQr(byte b, boolean z) {
        for (C28601E9s CQr : this.A00) {
            CQr.CQr(b, z);
        }
    }

    public D9W(C28601E9s[] e9sArr) {
        this.A00 = e9sArr;
    }
}
