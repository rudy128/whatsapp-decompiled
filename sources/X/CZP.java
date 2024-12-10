package X;

public class CZP {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public int A09 = 0;
    public int A0A = 0;
    public int A0B = 0;
    public C38921sC A0C;
    public C38921sC A0D;
    public C38921sC A0E;
    public C38921sC A0F;
    public C38871s3 A0G = null;
    public final /* synthetic */ BJO A0H;

    public CZP(C38921sC r2, C38921sC r3, C38921sC r4, C38921sC r5, BJO bjo, int i, int i2) {
        this.A0H = bjo;
        this.A05 = i;
        this.A0D = r2;
        this.A0F = r3;
        this.A0E = r4;
        this.A0C = r5;
        this.A07 = bjo.A06;
        this.A09 = bjo.A05;
        this.A08 = bjo.A07;
        this.A06 = bjo.A02;
        this.A03 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r18 != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x013b, code lost:
        if (r7 != 1) goto L_0x013d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(int r18, boolean r19, boolean r20) {
        /*
            r17 = this;
            r6 = r17
            int r5 = r6.A01
            r4 = 0
            r7 = 0
        L_0x0006:
            if (r7 >= r5) goto L_0x0031
            int r3 = r6.A0A
            int r2 = r3 + r7
            X.BJO r1 = r6.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0031
            X.1s3[] r0 = r1.A0O
            int r3 = r3 + r7
            r0 = r0[r3]
            if (r0 == 0) goto L_0x002e
            java.util.ArrayList r3 = r0.A0g
            int r2 = r3.size()
            r1 = 0
        L_0x0020:
            if (r1 >= r2) goto L_0x002e
            java.lang.Object r0 = r3.get(r1)
            X.1sC r0 = (X.C38921sC) r0
            r0.A02()
            int r1 = r1 + 1
            goto L_0x0020
        L_0x002e:
            int r7 = r7 + 1
            goto L_0x0006
        L_0x0031:
            if (r5 == 0) goto L_0x0266
            X.1s3 r10 = r6.A0G
            if (r10 == 0) goto L_0x0266
            if (r20 == 0) goto L_0x003d
            r16 = 1
            if (r18 == 0) goto L_0x003f
        L_0x003d:
            r16 = 0
        L_0x003f:
            r9 = -1
            r3 = 0
            r8 = -1
            r15 = -1
        L_0x0043:
            if (r3 >= r5) goto L_0x0063
            r0 = r3
            if (r19 == 0) goto L_0x004b
            int r0 = r5 + -1
            int r0 = r0 - r3
        L_0x004b:
            int r2 = r6.A0A
            int r2 = r2 + r0
            X.BJO r1 = r6.A0H
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0063
            X.1s3[] r0 = r1.A0O
            r0 = r0[r2]
            int r0 = r0.A0N
            if (r0 != 0) goto L_0x0060
            if (r8 != r9) goto L_0x005f
            r8 = r3
        L_0x005f:
            r15 = r3
        L_0x0060:
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0063:
            int r0 = r6.A05
            r7 = 0
            if (r0 != 0) goto L_0x016f
            X.BJO r1 = r6.A0H
            int r0 = r1.A0I
            r10.A0L = r0
            int r3 = r6.A09
            if (r18 <= 0) goto L_0x0075
            int r0 = r1.A0H
            int r3 = r3 + r0
        L_0x0075:
            X.1sC r2 = r10.A0Y
            X.1sC r0 = r6.A0F
            r2.A04(r0, r3)
            if (r20 == 0) goto L_0x0087
            X.1sC r3 = r10.A0S
            X.1sC r2 = r6.A0C
            int r0 = r6.A06
            r3.A04(r2, r0)
        L_0x0087:
            if (r18 <= 0) goto L_0x0094
            X.1sC r0 = r6.A0F
            X.1s3 r0 = r0.A05
            X.1sC r2 = r0.A0S
            X.1sC r0 = r10.A0Y
            r2.A04(r0, r4)
        L_0x0094:
            int r2 = r1.A0G
            r0 = 3
            if (r2 != r0) goto L_0x016c
            boolean r0 = r10.A0h
            if (r0 != 0) goto L_0x016c
            r11 = 0
        L_0x009e:
            if (r11 >= r5) goto L_0x016c
            r0 = r11
            if (r19 == 0) goto L_0x00a6
            int r0 = r5 + -1
            int r0 = r0 - r11
        L_0x00a6:
            int r2 = r6.A0A
            int r2 = r2 + r0
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x016c
            X.1s3[] r0 = r1.A0O
            r3 = r0[r2]
            boolean r0 = r3.A0h
            int r11 = r11 + 1
            if (r0 == 0) goto L_0x009e
        L_0x00b7:
            r11 = 0
        L_0x00b8:
            if (r11 >= r5) goto L_0x0266
            r14 = r11
            if (r19 == 0) goto L_0x00c0
            int r14 = r5 + -1
            int r14 = r14 - r11
        L_0x00c0:
            int r2 = r6.A0A
            int r2 = r2 + r14
            int r0 = r1.A06
            if (r2 >= r0) goto L_0x0266
            X.1s3[] r0 = r1.A0O
            r2 = r0[r2]
            if (r11 != 0) goto L_0x00d6
            X.1sC r13 = r2.A0W
            X.1sC r12 = r6.A0D
            int r0 = r6.A07
            r2.A0D(r13, r12, r0)
        L_0x00d6:
            if (r14 != 0) goto L_0x00eb
            int r13 = r1.A0B
            float r12 = r1.A02
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x0161
            int r0 = r1.A07
            if (r0 == r9) goto L_0x0161
            r13 = r0
            float r12 = r1.A00
        L_0x00e7:
            r2.A0A = r13
            r2.A02 = r12
        L_0x00eb:
            int r0 = r5 + -1
            if (r11 != r0) goto L_0x00f8
            X.1sC r13 = r2.A0X
            X.1sC r12 = r6.A0E
            int r0 = r6.A08
            r2.A0D(r13, r12, r0)
        L_0x00f8:
            if (r7 == 0) goto L_0x011c
            X.1sC r13 = r2.A0W
            X.1sC r12 = r7.A0X
            int r0 = r1.A0A
            r13.A04(r12, r0)
            if (r11 != r8) goto L_0x010d
            int r7 = r6.A07
            X.1sC r0 = r13.A03
            if (r0 == 0) goto L_0x010d
            r13.A00 = r7
        L_0x010d:
            r12.A04(r13, r4)
            int r0 = r15 + 1
            if (r11 != r0) goto L_0x011c
            int r7 = r6.A08
            X.1sC r0 = r12.A03
            if (r0 == 0) goto L_0x011c
            r12.A00 = r7
        L_0x011c:
            if (r2 == r10) goto L_0x0134
            int r7 = r1.A0G
            r0 = 3
            if (r7 != r0) goto L_0x0138
            boolean r0 = r3.A0h
            if (r0 == 0) goto L_0x013d
            if (r2 == r3) goto L_0x013d
            boolean r0 = r2.A0h
            if (r0 == 0) goto L_0x013d
            X.1sC r7 = r2.A0R
            X.1sC r0 = r3.A0R
        L_0x0131:
            r7.A04(r0, r4)
        L_0x0134:
            int r11 = r11 + 1
            r7 = r2
            goto L_0x00b8
        L_0x0138:
            if (r7 == 0) goto L_0x015c
            r0 = 1
            if (r7 == r0) goto L_0x0157
        L_0x013d:
            X.1sC r12 = r2.A0Y
            if (r16 == 0) goto L_0x0152
            X.1sC r7 = r6.A0F
            int r0 = r6.A09
            r12.A04(r7, r0)
            X.1sC r12 = r2.A0S
            X.1sC r7 = r6.A0C
            int r0 = r6.A06
            r12.A04(r7, r0)
            goto L_0x0134
        L_0x0152:
            X.1sC r0 = r10.A0Y
            r12.A04(r0, r4)
        L_0x0157:
            X.1sC r7 = r2.A0S
            X.1sC r0 = r10.A0S
            goto L_0x0131
        L_0x015c:
            X.1sC r7 = r2.A0Y
            X.1sC r0 = r10.A0Y
            goto L_0x0131
        L_0x0161:
            if (r20 == 0) goto L_0x00e7
            int r0 = r1.A0C
            if (r0 == r9) goto L_0x00e7
            r13 = r0
            float r12 = r1.A03
            goto L_0x00e7
        L_0x016c:
            r3 = r10
            goto L_0x00b7
        L_0x016f:
            X.BJO r3 = r6.A0H
            int r0 = r3.A0B
            r10.A0A = r0
            int r2 = r6.A07
            if (r18 <= 0) goto L_0x017c
            int r0 = r3.A0A
            int r2 = r2 + r0
        L_0x017c:
            if (r19 == 0) goto L_0x0248
            X.1sC r1 = r10.A0X
            X.1sC r0 = r6.A0E
            r1.A04(r0, r2)
            if (r20 == 0) goto L_0x0190
            X.1sC r2 = r10.A0W
            X.1sC r1 = r6.A0D
            int r0 = r6.A08
            r2.A04(r1, r0)
        L_0x0190:
            if (r18 <= 0) goto L_0x019d
            X.1sC r0 = r6.A0E
            X.1s3 r0 = r0.A05
            X.1sC r1 = r0.A0W
            X.1sC r0 = r10.A0X
        L_0x019a:
            r1.A04(r0, r4)
        L_0x019d:
            r11 = 0
        L_0x019e:
            if (r11 >= r5) goto L_0x0266
            int r2 = r6.A0A
            int r1 = r2 + r11
            int r0 = r3.A06
            if (r1 >= r0) goto L_0x0266
            X.1s3[] r0 = r3.A0O
            int r2 = r2 + r11
            r2 = r0[r2]
            if (r11 != 0) goto L_0x01cb
            X.1sC r12 = r2.A0Y
            X.1sC r1 = r6.A0F
            int r0 = r6.A09
            r2.A0D(r12, r1, r0)
            int r12 = r3.A0I
            float r1 = r3.A05
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x023e
            int r0 = r3.A08
            if (r0 == r9) goto L_0x023e
            r12 = r0
            float r1 = r3.A01
        L_0x01c7:
            r2.A0L = r12
            r2.A06 = r1
        L_0x01cb:
            int r0 = r5 + -1
            if (r11 != r0) goto L_0x01d8
            X.1sC r12 = r2.A0S
            X.1sC r1 = r6.A0C
            int r0 = r6.A06
            r2.A0D(r12, r1, r0)
        L_0x01d8:
            if (r7 == 0) goto L_0x01fc
            X.1sC r12 = r2.A0Y
            X.1sC r7 = r7.A0S
            int r0 = r3.A0H
            r12.A04(r7, r0)
            if (r11 != r8) goto L_0x01ed
            int r1 = r6.A09
            X.1sC r0 = r12.A03
            if (r0 == 0) goto L_0x01ed
            r12.A00 = r1
        L_0x01ed:
            r7.A04(r12, r4)
            int r0 = r15 + 1
            if (r11 != r0) goto L_0x01fc
            int r1 = r6.A06
            X.1sC r0 = r7.A03
            if (r0 == 0) goto L_0x01fc
            r7.A00 = r1
        L_0x01fc:
            if (r2 == r10) goto L_0x020a
            r7 = 2
            int r1 = r3.A09
            if (r19 == 0) goto L_0x020e
            if (r1 == 0) goto L_0x0231
            r0 = 1
            if (r1 == r0) goto L_0x0236
            if (r1 == r7) goto L_0x022a
        L_0x020a:
            int r11 = r11 + 1
            r7 = r2
            goto L_0x019e
        L_0x020e:
            if (r1 == 0) goto L_0x0236
            r0 = 1
            if (r1 == r0) goto L_0x0231
            if (r1 != r7) goto L_0x020a
            if (r16 == 0) goto L_0x022a
            X.1sC r7 = r2.A0W
            X.1sC r1 = r6.A0D
            int r0 = r6.A07
            r7.A04(r1, r0)
            X.1sC r7 = r2.A0X
            X.1sC r1 = r6.A0E
            int r0 = r6.A08
            r7.A04(r1, r0)
            goto L_0x020a
        L_0x022a:
            X.1sC r1 = r2.A0W
            X.1sC r0 = r10.A0W
            r1.A04(r0, r4)
        L_0x0231:
            X.1sC r1 = r2.A0X
            X.1sC r0 = r10.A0X
            goto L_0x023a
        L_0x0236:
            X.1sC r1 = r2.A0W
            X.1sC r0 = r10.A0W
        L_0x023a:
            r1.A04(r0, r4)
            goto L_0x020a
        L_0x023e:
            if (r20 == 0) goto L_0x01c7
            int r0 = r3.A0D
            if (r0 == r9) goto L_0x01c7
            r12 = r0
            float r1 = r3.A04
            goto L_0x01c7
        L_0x0248:
            X.1sC r1 = r10.A0W
            X.1sC r0 = r6.A0D
            r1.A04(r0, r2)
            if (r20 == 0) goto L_0x025a
            X.1sC r2 = r10.A0X
            X.1sC r1 = r6.A0E
            int r0 = r6.A08
            r2.A04(r1, r0)
        L_0x025a:
            if (r18 <= 0) goto L_0x019d
            X.1sC r0 = r6.A0D
            X.1s3 r0 = r0.A05
            X.1sC r1 = r0.A0X
            X.1sC r0 = r10.A0W
            goto L_0x019a
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZP.A00(int, boolean, boolean):void");
    }

    public void A01(C38871s3 r8) {
        int i = this.A05;
        int i2 = 0;
        BJO bjo = this.A0H;
        int i3 = this.A03;
        if (i == 0) {
            int A012 = BJO.A01(r8, bjo, i3);
            if (r8.A0q[0] == AnonymousClass00R.A0C) {
                this.A04++;
                A012 = 0;
            }
            int i4 = bjo.A0A;
            if (r8.A0N != 8) {
                i2 = i4;
            }
            this.A0B += A012 + i2;
            int A002 = BJO.A00(r8, bjo, this.A03);
            if (this.A0G == null || this.A00 < A002) {
                this.A0G = r8;
                this.A00 = A002;
                this.A02 = A002;
            }
        } else {
            int A013 = BJO.A01(r8, bjo, i3);
            int A003 = BJO.A00(r8, bjo, this.A03);
            if (r8.A0q[1] == AnonymousClass00R.A0C) {
                this.A04++;
                A003 = 0;
            }
            int i5 = bjo.A0H;
            if (r8.A0N != 8) {
                i2 = i5;
            }
            this.A02 += A003 + i2;
            if (this.A0G == null || this.A00 < A013) {
                this.A0G = r8;
                this.A00 = A013;
                this.A0B = A013;
            }
        }
        this.A01++;
    }
}
