package X;

/* renamed from: X.Cn0  reason: case insensitive filesystem */
public final class C25844Cn0 {
    public int A00 = -1;
    public int A01 = -1;
    public int A02;
    public int A03;
    public final C24486C6d A04;

    public final char A01(int i) {
        String str;
        int i2;
        C24486C6d c6d = this.A04;
        C64 c64 = c6d.A02;
        if (c64 == null || i < (i2 = c6d.A01)) {
            str = c6d.A03;
        } else {
            int i3 = c64.A00;
            int i4 = c64.A01;
            int i5 = c64.A02;
            int i6 = i3 - (i4 - i5);
            if (i < i6 + i2) {
                int i7 = i - i2;
                char[] cArr = c64.A03;
                if (i7 >= i5) {
                    i7 = (i7 - i5) + i4;
                }
                return cArr[i7];
            }
            str = c6d.A03;
            i -= (i6 - c6d.A00) + i2;
        }
        return str.charAt(i);
    }

    public final void A03(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass000.A1E("start (", ") offset is outside of text region ", A10, i);
            throw BE6.A0l(C17880vN.A0t(A10, this.A04.A00()));
        } else if (i2 < 0 || i2 > A002) {
            StringBuilder A102 = AnonymousClass000.A10();
            BEA.A1P("end (", ") offset is outside of text region ", A102, i2, A002);
            throw BE6.A0l(A102.toString());
        } else if (i < i2) {
            this.A01 = i;
            this.A00 = i2;
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Do not set reversed or empty range: ");
            A103.append(i);
            throw AnonymousClass001.A13(" > ", A103, i2);
        }
    }

    public final void A04(int i, int i2) {
        int A002;
        if (i < 0 || i > (A002 = this.A04.A00())) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass000.A1E("start (", ") offset is outside of text region ", A10, i);
            throw BE6.A0l(C17880vN.A0t(A10, this.A04.A00()));
        } else if (i2 < 0 || i2 > A002) {
            StringBuilder A102 = AnonymousClass000.A10();
            BEA.A1P("end (", ") offset is outside of text region ", A102, i2, A002);
            throw BE6.A0l(A102.toString());
        } else if (i <= i2) {
            this.A03 = i;
            this.A02 = i2;
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Do not set reversed range: ");
            A103.append(i);
            throw AnonymousClass001.A13(" > ", A103, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r3 = ") offset is outside of text region "
            if (r5 < 0) goto L_0x0056
            X.C6d r0 = r4.A04
            int r2 = r0.A00()
            if (r5 > r2) goto L_0x0056
            if (r6 < 0) goto L_0x0044
            if (r6 > r2) goto L_0x0044
            if (r5 > r6) goto L_0x0031
            r0.A01(r5, r6, r7)
            int r2 = r7.length()
            int r2 = r2 + r5
            if (r2 < 0) goto L_0x0026
            r4.A03 = r2
            r4.A02 = r2
            r0 = -1
            r4.A01 = r0
            r4.A00 = r0
            return
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot set selectionStart to a negative value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Do not set reversed range: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " > "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r6)
            throw r0
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "end ("
            X.BEA.A1P(r0, r3, r1, r6, r2)
            java.lang.String r0 = r1.toString()
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)
            throw r0
        L_0x0056:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "start ("
            X.AnonymousClass000.A1E(r0, r3, r1, r5)
            X.C6d r0 = r4.A04
            int r0 = r0.A00()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25844Cn0.A05(int, int, java.lang.String):void");
    }

    public String toString() {
        return this.A04.toString();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.C6d, java.lang.Object] */
    public C25844Cn0(C27069DRu dRu, long j) {
        int length;
        String str = dRu.A00;
        ? obj = new Object();
        obj.A03 = str;
        obj.A01 = -1;
        obj.A00 = -1;
        this.A04 = obj;
        int A022 = C26260Cw5.A02(j);
        this.A03 = A022;
        int A012 = C26260Cw5.A01(j);
        this.A02 = A012;
        if (A022 < 0 || A022 > (length = dRu.length())) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass000.A1E("start (", ") offset is outside of text region ", A10, A022);
            throw BE6.A0l(C17880vN.A0t(A10, dRu.length()));
        } else if (A012 < 0 || A012 > length) {
            StringBuilder A102 = AnonymousClass000.A10();
            BEA.A1P("end (", ") offset is outside of text region ", A102, A012, length);
            throw BE6.A0l(A102.toString());
        } else if (A022 > A012) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Do not set reversed range: ");
            A103.append(A022);
            throw AnonymousClass001.A13(" > ", A103, A012);
        }
    }

    public static final long A00(long j, long j2) {
        int A012;
        int A022 = C26260Cw5.A02(j);
        int A013 = C26260Cw5.A01(j);
        int A023 = C26260Cw5.A02(j2);
        if (A023 < A013 && A022 < (A012 = C26260Cw5.A01(j2))) {
            if (A023 > A022 || A013 > A012) {
                if (A022 > A023 || A012 > A013) {
                    if (A023 <= A022) {
                        A022 = A023;
                    }
                }
                A013 -= C26260Cw5.A00(j2);
            } else {
                A022 = A023;
            }
            A013 = A023;
        } else if (A013 > A023) {
            A022 -= C26260Cw5.A00(j2);
            A013 -= C26260Cw5.A00(j2);
        }
        return C25858CnM.A02(A022, A013);
    }

    public final void A02(int i, int i2) {
        int A012;
        long A022 = C25858CnM.A02(i, i2);
        this.A04.A01(i, i2, "");
        long A002 = A00(C25858CnM.A02(this.A03, this.A02), A022);
        int A023 = C26260Cw5.A02(A002);
        if (A023 >= 0) {
            this.A03 = A023;
            int A013 = C26260Cw5.A01(A002);
            if (A013 >= 0) {
                this.A02 = A013;
                int i3 = this.A01;
                if (i3 != -1) {
                    long A003 = A00(C25858CnM.A02(i3, this.A00), A022);
                    if (C26260Cw5.A04(A003)) {
                        A012 = -1;
                        this.A01 = -1;
                    } else {
                        this.A01 = C26260Cw5.A02(A003);
                        A012 = C26260Cw5.A01(A003);
                    }
                    this.A00 = A012;
                    return;
                }
                return;
            }
            throw AnonymousClass001.A13("Cannot set selectionEnd to a negative value: ", AnonymousClass000.A10(), A013);
        }
        throw AnonymousClass001.A13("Cannot set selectionStart to a negative value: ", AnonymousClass000.A10(), A023);
    }
}
