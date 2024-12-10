package X;

/* renamed from: X.1sB  reason: invalid class name and case insensitive filesystem */
public class C38911sB extends AnonymousClass1s7 {
    public AnonymousClass1s9 A00;
    public C38901sA A01;

    public void A0C() {
        this.A09 = false;
        AnonymousClass1s9 r0 = this.A04;
        r0.A00();
        r0.A0B = false;
        AnonymousClass1s9 r02 = this.A03;
        r02.A00();
        r02.A0B = false;
        AnonymousClass1s9 r03 = this.A00;
        r03.A00();
        r03.A0B = false;
        this.A05.A0B = false;
    }

    /* JADX WARNING: type inference failed for: r1v43, types: [X.1sA, X.1s9] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0079, code lost:
        r4 = r12.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r12 = this;
            X.1s3 r2 = r12.A02
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.1sA r1 = r12.A05
            int r0 = r2.A02()
            r1.A01(r0)
        L_0x000f:
            X.1sA r3 = r12.A05
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0073
            X.1s3 r6 = r12.A02
            java.lang.Integer[] r1 = r6.A0q
            r0 = 1
            r2 = r1[r0]
            r12.A07 = r2
            boolean r0 = r6.A0h
            if (r0 == 0) goto L_0x002d
            X.27O r1 = new X.27O
            r1.<init>(r12)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.A06 = r0
            r12.A01 = r1
        L_0x002d:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r2 == r0) goto L_0x00b5
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 != r0) goto L_0x00aa
            X.1s3 r5 = r6.A0Z
            if (r5 == 0) goto L_0x00aa
            java.lang.Integer[] r1 = r5.A0q
            r0 = 1
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00aa
            int r4 = r5.A02()
            X.1sC r0 = r6.A0Y
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.1sC r0 = r6.A0S
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.1s9 r1 = r12.A04
            X.1sB r0 = r5.A0d
            X.1s9 r0 = r0.A04
            X.AnonymousClass1s7.A02(r1, r0, r2)
            X.1s9 r2 = r12.A03
            X.1sB r0 = r5.A0d
            X.1s9 r1 = r0.A03
            X.1s3 r0 = r12.A02
            X.1sC r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r2, r1, r0)
            r3.A01(r4)
        L_0x0072:
            return
        L_0x0073:
            java.lang.Integer r1 = r12.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x00b5
            X.1s3 r4 = r12.A02
            X.1s3 r5 = r4.A0Z
            if (r5 == 0) goto L_0x00b5
            java.lang.Integer[] r1 = r5.A0q
            r0 = 1
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x00b5
            X.1s9 r2 = r12.A04
            X.1sB r0 = r5.A0d
            X.1s9 r1 = r0.A04
            X.1sC r0 = r4.A0Y
            int r0 = r0.A00()
            X.AnonymousClass1s7.A02(r2, r1, r0)
            X.1s9 r4 = r12.A03
            X.1sB r0 = r5.A0d
            X.1s9 r2 = r0.A03
            X.1s3 r0 = r12.A02
            X.1sC r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
        L_0x00a6:
            X.AnonymousClass1s7.A02(r4, r2, r0)
            return
        L_0x00aa:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r2 != r0) goto L_0x00b5
            int r0 = r6.A02()
            r3.A01(r0)
        L_0x00b5:
            boolean r0 = r3.A0B
            r4 = 0
            r11 = 4
            r2 = 1
            r6 = 2
            r5 = 3
            if (r0 == 0) goto L_0x019a
            X.1s3 r7 = r12.A02
            boolean r0 = r7.A0i
            if (r0 == 0) goto L_0x02c6
            X.1sC[] r1 = r7.A0n
            r6 = r1[r6]
            X.1sC r0 = r6.A03
            if (r0 == 0) goto L_0x0124
            r4 = r1[r5]
            X.1sC r0 = r4.A03
            if (r0 == 0) goto L_0x0182
            boolean r0 = r7.A0H()
            if (r0 == 0) goto L_0x00f6
            X.1s9 r1 = r12.A04
            int r0 = r6.A00()
            r1.A00 = r0
            X.1s9 r1 = r12.A03
            int r0 = r4.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x00e9:
            X.1s3 r1 = r12.A02
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x0072
            X.1s9 r4 = r12.A00
            X.1s9 r2 = r12.A04
            int r0 = r1.A07
            goto L_0x00a6
        L_0x00f6:
            X.1s9 r3 = X.AnonymousClass1s7.A00(r6)
            if (r3 == 0) goto L_0x0105
            X.1s9 r1 = r12.A04
            int r0 = r6.A00()
            X.AnonymousClass1s7.A02(r1, r3, r0)
        L_0x0105:
            X.1s3 r0 = r12.A02
            X.1sC[] r0 = r0.A0n
            r0 = r0[r5]
            X.1s9 r3 = X.AnonymousClass1s7.A00(r0)
            if (r3 == 0) goto L_0x011b
            X.1s9 r1 = r12.A03
            int r0 = r0.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r1, r3, r0)
        L_0x011b:
            X.1s9 r0 = r12.A04
            r0.A09 = r2
            X.1s9 r0 = r12.A03
            r0.A09 = r2
            goto L_0x00e9
        L_0x0124:
            r2 = r1[r5]
            X.1sC r0 = r2.A03
            if (r0 == 0) goto L_0x0140
            X.1s9 r1 = X.AnonymousClass1s7.A00(r2)
            if (r1 == 0) goto L_0x00e9
            X.1s9 r4 = r12.A03
            int r0 = r2.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r4, r1, r0)
            X.1s9 r1 = r12.A04
            int r0 = r3.A02
            int r0 = -r0
            goto L_0x0195
        L_0x0140:
            r1 = r1[r11]
            X.1sC r0 = r1.A03
            if (r0 == 0) goto L_0x0161
            X.1s9 r0 = X.AnonymousClass1s7.A00(r1)
            if (r0 == 0) goto L_0x0072
            X.1s9 r1 = r12.A00
            X.AnonymousClass1s7.A02(r1, r0, r4)
            X.1s9 r2 = r12.A04
            X.1s3 r0 = r12.A02
            int r0 = r0.A07
            int r0 = -r0
            X.AnonymousClass1s7.A02(r2, r1, r0)
            X.1s9 r4 = r12.A03
            int r0 = r3.A02
            goto L_0x00a6
        L_0x0161:
            boolean r0 = r7 instanceof X.AnonymousClass3K8
            if (r0 != 0) goto L_0x0072
            X.1s3 r0 = r7.A0Z
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            X.1sC r0 = r7.A06(r0)
            X.1sC r0 = r0.A03
            if (r0 != 0) goto L_0x0072
            X.1s3 r1 = r12.A02
            X.1s3 r0 = r1.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r2 = r0.A04
            X.1s9 r4 = r12.A04
            int r0 = r1.A05()
            goto L_0x018e
        L_0x0182:
            X.1s9 r2 = X.AnonymousClass1s7.A00(r6)
            if (r2 == 0) goto L_0x0072
            X.1s9 r4 = r12.A04
            int r0 = r6.A00()
        L_0x018e:
            X.AnonymousClass1s7.A02(r4, r2, r0)
            X.1s9 r1 = r12.A03
            int r0 = r3.A02
        L_0x0195:
            X.AnonymousClass1s7.A02(r1, r4, r0)
            goto L_0x00e9
        L_0x019a:
            java.lang.Integer r1 = r12.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x02c6
            X.1s3 r1 = r12.A02
            int r0 = r1.A0C
            if (r0 == r6) goto L_0x02be
            if (r0 != r5) goto L_0x01ce
            boolean r0 = r1.A0H()
            if (r0 != 0) goto L_0x01ce
            int r0 = r1.A0D
            if (r0 == r5) goto L_0x01ce
            X.1s8 r0 = r1.A0c
        L_0x01b4:
            X.1sA r1 = r0.A05
            java.util.List r0 = r3.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r3)
            r3.A09 = r2
            java.util.List r1 = r3.A07
            X.1s9 r0 = r12.A04
            r1.add(r0)
            X.1s9 r0 = r12.A03
            r1.add(r0)
        L_0x01ce:
            X.1s3 r7 = r12.A02
            X.1sC[] r10 = r7.A0n
            r9 = r10[r6]
            X.1sC r1 = r9.A03
            if (r1 == 0) goto L_0x0222
            r6 = r10[r5]
            X.1sC r0 = r6.A03
            if (r0 == 0) goto L_0x0222
            boolean r0 = r7.A0H()
            if (r0 == 0) goto L_0x020f
            X.1s9 r1 = r12.A04
            int r0 = r9.A00()
            r1.A00 = r0
            X.1s9 r1 = r12.A03
            int r0 = r6.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x01f5:
            X.1s3 r0 = r12.A02
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x0204
            X.1s9 r1 = r12.A00
            X.1s9 r4 = r12.A04
            X.1sA r0 = r12.A01
        L_0x0201:
            r12.A09(r1, r4, r0, r2)
        L_0x0204:
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0072
            r3.A0A = r2
            return
        L_0x020f:
            X.1s9 r1 = X.AnonymousClass1s7.A00(r9)
            X.1s9 r0 = X.AnonymousClass1s7.A00(r6)
            r1.A02(r12)
            r0.A02(r12)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r12.A08 = r0
            goto L_0x01f5
        L_0x0222:
            r8 = 0
            if (r1 == 0) goto L_0x026f
            X.1s9 r1 = X.AnonymousClass1s7.A00(r9)
            if (r1 == 0) goto L_0x0204
            X.1s9 r4 = r12.A04
            int r0 = r9.A00()
        L_0x0231:
            X.AnonymousClass1s7.A02(r4, r1, r0)
            X.1s9 r0 = r12.A03
            r12.A09(r0, r4, r3, r2)
            X.1s3 r0 = r12.A02
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x0246
            X.1s9 r1 = r12.A00
            X.1sA r0 = r12.A01
            r12.A09(r1, r4, r0, r2)
        L_0x0246:
            java.lang.Integer r0 = r12.A07
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            if (r0 != r4) goto L_0x0204
            X.1s3 r1 = r12.A02
            float r0 = r1.A01
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0204
            X.1s8 r1 = r1.A0c
            java.lang.Integer r0 = r1.A07
            if (r0 != r4) goto L_0x0204
            X.1sA r0 = r1.A05
            java.util.List r0 = r0.A07
            r0.add(r3)
            java.util.List r1 = r3.A08
            X.1s3 r0 = r12.A02
            X.1s8 r0 = r0.A0c
            X.1sA r0 = r0.A05
            r1.add(r0)
            r3.A03 = r12
            goto L_0x0204
        L_0x026f:
            r6 = r10[r5]
            X.1sC r0 = r6.A03
            r5 = -1
            if (r0 == 0) goto L_0x028d
            X.1s9 r4 = X.AnonymousClass1s7.A00(r6)
            if (r4 == 0) goto L_0x0204
            X.1s9 r1 = r12.A03
            int r0 = r6.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r1, r4, r0)
            X.1s9 r0 = r12.A04
            r12.A09(r0, r1, r3, r5)
            goto L_0x01f5
        L_0x028d:
            r1 = r10[r11]
            X.1sC r0 = r1.A03
            if (r0 == 0) goto L_0x02aa
            X.1s9 r0 = X.AnonymousClass1s7.A00(r1)
            if (r0 == 0) goto L_0x0204
            X.1s9 r1 = r12.A00
            X.AnonymousClass1s7.A02(r1, r0, r4)
            X.1s9 r4 = r12.A04
            X.1sA r0 = r12.A01
            r12.A09(r4, r1, r0, r5)
            X.1s9 r1 = r12.A03
            r0 = r3
            goto L_0x0201
        L_0x02aa:
            boolean r0 = r7 instanceof X.AnonymousClass3K8
            if (r0 != 0) goto L_0x0204
            X.1s3 r0 = r7.A0Z
            if (r0 == 0) goto L_0x0204
            X.1sB r0 = r0.A0d
            X.1s9 r1 = r0.A04
            X.1s9 r4 = r12.A04
            int r0 = r7.A05()
            goto L_0x0231
        L_0x02be:
            X.1s3 r0 = r1.A0Z
            if (r0 == 0) goto L_0x01ce
            X.1sB r0 = r0.A0d
            goto L_0x01b4
        L_0x02c6:
            r3.A02(r12)
            goto L_0x01ce
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38911sB.A0B():void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(this.A02.A0f);
        return sb.toString();
    }
}
