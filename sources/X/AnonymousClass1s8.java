package X;

/* renamed from: X.1s8  reason: invalid class name */
public class AnonymousClass1s8 extends AnonymousClass1s7 {
    public static int[] A00 = new int[2];

    public static void A03(int[] iArr, float f, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i5 == -1) {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            i7 = (int) ((((float) i8) / f) + 0.5f);
            if (i6 > i8) {
                if (i7 > i9) {
                    return;
                }
            }
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        } else if (i5 != 0) {
            i7 = (int) ((((float) i8) * f) + 0.5f);
        } else {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        }
        iArr[0] = i8;
        iArr[1] = i7;
    }

    public void A0C() {
        this.A09 = false;
        AnonymousClass1s9 r0 = this.A04;
        r0.A00();
        r0.A0B = false;
        AnonymousClass1s9 r02 = this.A03;
        r02.A00();
        r02.A0B = false;
        this.A05.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r5 = r8.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r8 = this;
            X.1s3 r2 = r8.A02
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.1sA r1 = r8.A05
            int r0 = r2.A03()
            r1.A01(r0)
        L_0x000f:
            X.1sA r4 = r8.A05
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x006b
            X.1s3 r6 = r8.A02
            java.lang.Integer[] r1 = r6.A0q
            r0 = 0
            r3 = r1[r0]
            r8.A07 = r3
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r3 == r0) goto L_0x00b4
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            if (r3 != r2) goto L_0x00a9
            X.1s3 r5 = r6.A0Z
            if (r5 == 0) goto L_0x0033
            java.lang.Integer[] r1 = r5.A0q
            r0 = 0
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x003a
        L_0x0033:
            java.lang.Integer[] r1 = r5.A0q
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00a9
        L_0x003a:
            int r3 = r5.A03()
            X.1sC r0 = r6.A0W
            int r2 = r0.A00()
            int r3 = r3 - r2
            X.1sC r0 = r6.A0X
            int r0 = r0.A00()
            int r3 = r3 - r0
            X.1s9 r1 = r8.A04
            X.1s8 r0 = r5.A0c
            X.1s9 r0 = r0.A04
            X.AnonymousClass1s7.A02(r1, r0, r2)
            X.1s9 r2 = r8.A03
            X.1s8 r0 = r5.A0c
            X.1s9 r1 = r0.A03
            X.1s3 r0 = r8.A02
            X.1sC r0 = r0.A0X
            int r0 = r0.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r2, r1, r0)
            r4.A01(r3)
        L_0x006a:
            return
        L_0x006b:
            java.lang.Integer r0 = r8.A07
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
            if (r0 != r2) goto L_0x00b4
            X.1s3 r5 = r8.A02
            X.1s3 r3 = r5.A0Z
            if (r3 == 0) goto L_0x0080
            java.lang.Integer[] r1 = r3.A0q
            r0 = 0
            r1 = r1[r0]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0087
        L_0x0080:
            java.lang.Integer[] r1 = r3.A0q
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00b4
        L_0x0087:
            X.1s9 r2 = r8.A04
            X.1s8 r0 = r3.A0c
            X.1s9 r1 = r0.A04
            X.1sC r0 = r5.A0W
            int r0 = r0.A00()
            X.AnonymousClass1s7.A02(r2, r1, r0)
            X.1s9 r2 = r8.A03
            X.1s8 r0 = r3.A0c
            X.1s9 r1 = r0.A03
            X.1s3 r0 = r8.A02
            X.1sC r0 = r0.A0X
            int r0 = r0.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r2, r1, r0)
            return
        L_0x00a9:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r3 != r0) goto L_0x00b4
            int r0 = r6.A03()
            r4.A01(r0)
        L_0x00b4:
            boolean r0 = r4.A0B
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0152
            X.1s3 r3 = r8.A02
            boolean r0 = r3.A0i
            if (r0 == 0) goto L_0x0152
            X.1sC[] r0 = r3.A0n
            r7 = r0[r7]
            X.1sC r1 = r7.A03
            r2 = r0[r5]
            X.1sC r0 = r2.A03
            if (r1 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x0102
            boolean r0 = r3.A0G()
            if (r0 != 0) goto L_0x0299
            X.1s9 r2 = X.AnonymousClass1s7.A00(r7)
            if (r2 == 0) goto L_0x00e3
            X.1s9 r1 = r8.A04
            int r0 = r7.A00()
            X.AnonymousClass1s7.A02(r1, r2, r0)
        L_0x00e3:
            X.1s3 r0 = r8.A02
            X.1sC[] r0 = r0.A0n
            r0 = r0[r5]
            X.1s9 r2 = X.AnonymousClass1s7.A00(r0)
            if (r2 == 0) goto L_0x00f9
            X.1s9 r1 = r8.A03
            int r0 = r0.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r1, r2, r0)
        L_0x00f9:
            X.1s9 r0 = r8.A04
            r0.A09 = r5
            X.1s9 r0 = r8.A03
            r0.A09 = r5
            return
        L_0x0102:
            X.1s9 r1 = X.AnonymousClass1s7.A00(r7)
            if (r1 == 0) goto L_0x006a
            X.1s9 r3 = r8.A04
            int r0 = r7.A00()
            goto L_0x014a
        L_0x010f:
            if (r0 == 0) goto L_0x012a
            X.1s9 r1 = X.AnonymousClass1s7.A00(r2)
            if (r1 == 0) goto L_0x006a
            X.1s9 r3 = r8.A03
            int r0 = r2.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r3, r1, r0)
            X.1s9 r1 = r8.A04
            int r0 = r4.A02
            int r0 = -r0
        L_0x0126:
            X.AnonymousClass1s7.A02(r1, r3, r0)
            return
        L_0x012a:
            boolean r0 = r3 instanceof X.AnonymousClass3K8
            if (r0 != 0) goto L_0x006a
            X.1s3 r0 = r3.A0Z
            if (r0 == 0) goto L_0x006a
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            X.1sC r0 = r3.A06(r0)
            X.1sC r0 = r0.A03
            if (r0 != 0) goto L_0x006a
            X.1s3 r2 = r8.A02
            X.1s3 r0 = r2.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r1 = r0.A04
            X.1s9 r3 = r8.A04
            int r0 = r2.A04()
        L_0x014a:
            X.AnonymousClass1s7.A02(r3, r1, r0)
            X.1s9 r1 = r8.A03
            int r0 = r4.A02
            goto L_0x0126
        L_0x0152:
            java.lang.Integer r1 = r8.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x01bf
            X.1s3 r3 = r8.A02
            int r2 = r3.A0D
            r0 = 2
            if (r2 == r0) goto L_0x0238
            r1 = 3
            if (r2 != r1) goto L_0x01bf
            int r0 = r3.A0C
            if (r0 != r1) goto L_0x01fe
            X.1s9 r0 = r8.A04
            r0.A03 = r8
            X.1s9 r0 = r8.A03
            r0.A03 = r8
            X.1sB r1 = r3.A0d
            X.1s9 r0 = r1.A04
            r0.A03 = r8
            X.1s9 r0 = r1.A03
            r0.A03 = r8
            r4.A03 = r8
            boolean r0 = r3.A0H()
            if (r0 == 0) goto L_0x01e8
            java.util.List r2 = r4.A08
            X.1sA r0 = r1.A05
            r2.add(r0)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1sA r0 = r0.A05
            java.util.List r0 = r0.A07
            r0.add(r4)
            X.1s3 r0 = r8.A02
            X.1sB r1 = r0.A0d
            X.1sA r0 = r1.A05
            r0.A03 = r8
            X.1s9 r0 = r1.A04
            r2.add(r0)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            r2.add(r0)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r4)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            java.util.List r1 = r0.A07
        L_0x01bb:
            r0 = r4
        L_0x01bc:
            r1.add(r0)
        L_0x01bf:
            X.1s3 r6 = r8.A02
            X.1sC[] r1 = r6.A0n
            r7 = r1[r7]
            X.1sC r0 = r7.A03
            if (r0 == 0) goto L_0x0264
            r2 = r1[r5]
            X.1sC r0 = r2.A03
            if (r0 == 0) goto L_0x0257
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L_0x0299
            X.1s9 r1 = X.AnonymousClass1s7.A00(r7)
            X.1s9 r0 = X.AnonymousClass1s7.A00(r2)
            r1.A02(r8)
            r0.A02(r8)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r8.A08 = r0
            return
        L_0x01e8:
            boolean r0 = r3.A0G()
            X.1sA r2 = r1.A05
            if (r0 == 0) goto L_0x0235
            java.util.List r0 = r2.A08
            r0.add(r4)
            java.util.List r1 = r4.A07
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1sA r0 = r0.A05
            goto L_0x01bc
        L_0x01fe:
            X.1sB r0 = r3.A0d
            X.1sA r1 = r0.A05
            java.util.List r0 = r4.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r4)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r4)
            X.1s3 r0 = r8.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r4)
            r4.A09 = r5
            java.util.List r1 = r4.A07
            X.1s9 r0 = r8.A04
            r1.add(r0)
            X.1s9 r2 = r8.A03
            r1.add(r2)
            java.util.List r0 = r0.A08
            r0.add(r4)
        L_0x0235:
            java.util.List r1 = r2.A08
            goto L_0x01bb
        L_0x0238:
            X.1s3 r0 = r3.A0Z
            if (r0 == 0) goto L_0x01bf
            X.1sB r0 = r0.A0d
            X.1sA r1 = r0.A05
            java.util.List r0 = r4.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r4)
            r4.A09 = r5
            java.util.List r1 = r4.A07
            X.1s9 r0 = r8.A04
            r1.add(r0)
            X.1s9 r0 = r8.A03
            goto L_0x01bc
        L_0x0257:
            X.1s9 r1 = X.AnonymousClass1s7.A00(r7)
            if (r1 == 0) goto L_0x006a
            X.1s9 r2 = r8.A04
            int r0 = r7.A00()
            goto L_0x0293
        L_0x0264:
            r3 = r1[r5]
            X.1sC r0 = r3.A03
            if (r0 == 0) goto L_0x0281
            X.1s9 r1 = X.AnonymousClass1s7.A00(r3)
            if (r1 == 0) goto L_0x006a
            X.1s9 r2 = r8.A03
            int r0 = r3.A00()
            int r0 = -r0
            X.AnonymousClass1s7.A02(r2, r1, r0)
            X.1s9 r0 = r8.A04
            r5 = -1
        L_0x027d:
            r8.A09(r0, r2, r4, r5)
            return
        L_0x0281:
            boolean r0 = r6 instanceof X.AnonymousClass3K8
            if (r0 != 0) goto L_0x006a
            X.1s3 r0 = r6.A0Z
            if (r0 == 0) goto L_0x006a
            X.1s8 r0 = r0.A0c
            X.1s9 r1 = r0.A04
            X.1s9 r2 = r8.A04
            int r0 = r6.A04()
        L_0x0293:
            X.AnonymousClass1s7.A02(r2, r1, r0)
            X.1s9 r0 = r8.A03
            goto L_0x027d
        L_0x0299:
            X.1s9 r1 = r8.A04
            int r0 = r7.A00()
            r1.A00 = r0
            X.1s9 r1 = r8.A03
            int r0 = r2.A00()
            int r0 = -r0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1s8.A0B():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b0, code lost:
        if (r11 != false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0211, code lost:
        if (r12 != false) goto L_0x0213;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQN() {
        /*
            r22 = this;
            r3 = r22
            java.lang.Integer r0 = r3.A08
            int r0 = r0.intValue()
            r8 = 2
            r7 = 3
            r5 = 1
            r2 = 0
            if (r0 == r5) goto L_0x001c
            if (r0 == r8) goto L_0x001c
            if (r0 != r7) goto L_0x001c
            X.1s3 r0 = r3.A02
            X.1sC r1 = r0.A0W
            X.1sC r0 = r0.A0X
            r3.A08(r1, r0, r2)
        L_0x001b:
            return
        L_0x001c:
            X.1sA r4 = r3.A05
            boolean r0 = r4.A0B
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x004e
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x004e
            X.1s3 r6 = r3.A02
            int r0 = r6.A0D
            if (r0 == r8) goto L_0x0270
            if (r0 != r7) goto L_0x004e
            int r0 = r6.A0C
            r10 = -1
            if (r0 == 0) goto L_0x0067
            if (r0 == r7) goto L_0x0067
            int r0 = r6.A08
            if (r0 == r10) goto L_0x0282
            if (r0 != 0) goto L_0x0282
            X.1sB r0 = r6.A0d
            X.1sA r0 = r0.A05
            int r0 = r0.A02
            float r1 = (float) r0
            float r0 = r6.A01
            float r1 = r1 / r0
        L_0x0049:
            float r1 = r1 + r14
            int r0 = (int) r1
            r4.A01(r0)
        L_0x004e:
            X.1s9 r8 = r3.A04
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x001b
            X.1s9 r6 = r3.A03
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x028e
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x028e
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x028e
            return
        L_0x0067:
            X.1sB r0 = r6.A0d
            X.1s9 r1 = r0.A04
            X.1s9 r9 = r0.A03
            X.1sC r0 = r6.A0W
            X.1sC r0 = r0.A03
            r13 = 0
            if (r0 == 0) goto L_0x0075
            r13 = 1
        L_0x0075:
            X.1sC r0 = r6.A0Y
            X.1sC r0 = r0.A03
            r12 = 0
            if (r0 == 0) goto L_0x007d
            r12 = 1
        L_0x007d:
            X.1sC r0 = r6.A0X
            X.1sC r0 = r0.A03
            r11 = 0
            if (r0 == 0) goto L_0x0085
            r11 = 1
        L_0x0085:
            X.1sC r0 = r6.A0S
            X.1sC r7 = r0.A03
            r0 = 0
            if (r7 == 0) goto L_0x008d
            r0 = 1
        L_0x008d:
            int r8 = r6.A08
            if (r13 == 0) goto L_0x0211
            if (r12 == 0) goto L_0x01b0
            if (r11 == 0) goto L_0x0213
            if (r0 == 0) goto L_0x01b2
            float r13 = r6.A01
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x00ee
            X.1s9 r7 = r3.A04
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001b
            X.1s9 r6 = r3.A03
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r14 = r0.A02
            int r0 = r7.A00
            int r14 = r14 + r0
            java.util.List r0 = r6.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r7 = r0.A02
            int r0 = r6.A00
            int r7 = r7 - r0
            int r6 = r1.A02
            int r0 = r1.A00
            int r6 = r6 + r0
            int r1 = r9.A02
            int r0 = r9.A00
            int r1 = r1 - r0
            int[] r12 = A00
            r17 = r1
            r18 = r8
            r15 = r7
            r16 = r6
            A03(r12, r13, r14, r15, r16, r17, r18)
            r0 = r12[r2]
            r4.A01(r0)
            X.1s3 r0 = r3.A02
            X.1sB r0 = r0.A0d
            X.1sA r1 = r0.A05
            r0 = r12[r5]
            r1.A01(r0)
            return
        L_0x00ee:
            X.1s9 r7 = r3.A04
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0147
            X.1s9 r6 = r3.A03
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0147
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            int r12 = r7.A02
            int r0 = r7.A00
            int r12 = r12 + r0
            int r11 = r6.A02
            int r0 = r6.A00
            int r11 = r11 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r10 = r0.A02
            int r0 = r1.A00
            int r10 = r10 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r6 = r0.A02
            int r0 = r9.A00
            int r6 = r6 - r0
            int[] r15 = A00
            r16 = r13
            r17 = r12
            r18 = r11
            r19 = r10
            r20 = r6
            r21 = r8
            A03(r15, r16, r17, r18, r19, r20, r21)
            r0 = r15[r2]
            r4.A01(r0)
            X.1s3 r0 = r3.A02
            X.1sB r0 = r0.A0d
            X.1sA r6 = r0.A05
            r0 = r15[r5]
            r6.A01(r0)
        L_0x0147:
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001b
            X.1s9 r6 = r3.A03
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r10 = r0.A02
            int r0 = r7.A00
            int r10 = r10 + r0
            java.util.List r0 = r6.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r7 = r0.A02
            int r0 = r6.A00
            int r7 = r7 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r6 = r0.A02
            int r0 = r1.A00
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r1 = r0.A02
            int r0 = r9.A00
            int r1 = r1 - r0
            int[] r15 = A00
            r16 = r13
            r17 = r10
            r18 = r7
            r19 = r6
            r20 = r1
            r21 = r8
            A03(r15, r16, r17, r18, r19, r20, r21)
            r0 = r15[r2]
            r4.A01(r0)
            X.1s3 r0 = r3.A02
            X.1sB r0 = r0.A0d
            X.1sA r1 = r0.A05
            r0 = r15[r5]
            r1.A01(r0)
            goto L_0x004e
        L_0x01b0:
            if (r11 == 0) goto L_0x004e
        L_0x01b2:
            X.1s9 r1 = r3.A04
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            X.1s9 r9 = r3.A03
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            float r7 = r6.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r6 = r0.A02
            int r0 = r1.A00
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r1 = r0.A02
            int r0 = r9.A00
            int r1 = r1 - r0
            if (r8 == r10) goto L_0x01ff
            if (r8 == 0) goto L_0x01ff
            int r1 = r1 - r6
            int r6 = r3.A04(r1, r2)
            float r0 = (float) r6
            float r0 = r0 / r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A04(r0, r5)
            if (r0 == r1) goto L_0x01f1
            float r0 = (float) r1
            float r0 = r0 * r7
        L_0x01ef:
            float r0 = r0 + r14
            int r6 = (int) r0
        L_0x01f1:
            r4.A01(r6)
            X.1s3 r0 = r3.A02
            X.1sB r0 = r0.A0d
            X.1sA r0 = r0.A05
            r0.A01(r1)
            goto L_0x004e
        L_0x01ff:
            int r1 = r1 - r6
            int r6 = r3.A04(r1, r2)
            float r0 = (float) r6
            float r0 = r0 * r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A04(r0, r5)
            if (r0 == r1) goto L_0x01f1
            float r0 = (float) r1
            float r0 = r0 / r7
            goto L_0x01ef
        L_0x0211:
            if (r12 == 0) goto L_0x004e
        L_0x0213:
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            float r7 = r6.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r6 = r0.A02
            int r0 = r1.A00
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            int r1 = r0.A02
            int r0 = r9.A00
            int r1 = r1 - r0
            if (r8 == r10) goto L_0x025e
            if (r8 != 0) goto L_0x025e
            int r1 = r1 - r6
            int r6 = r3.A04(r1, r5)
            float r0 = (float) r6
            float r0 = r0 * r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A04(r0, r2)
            if (r0 == r1) goto L_0x0250
            float r0 = (float) r1
            float r0 = r0 / r7
        L_0x024e:
            float r0 = r0 + r14
            int r6 = (int) r0
        L_0x0250:
            r4.A01(r1)
            X.1s3 r0 = r3.A02
            X.1sB r0 = r0.A0d
            X.1sA r0 = r0.A05
            r0.A01(r6)
            goto L_0x004e
        L_0x025e:
            int r1 = r1 - r6
            int r6 = r3.A04(r1, r5)
            float r0 = (float) r6
            float r0 = r0 / r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A04(r0, r2)
            if (r0 == r1) goto L_0x0250
            float r0 = (float) r1
            float r0 = r0 * r7
            goto L_0x024e
        L_0x0270:
            X.1s3 r0 = r6.A0Z
            if (r0 == 0) goto L_0x004e
            X.1s8 r0 = r0.A0c
            X.1sA r1 = r0.A05
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x004e
            float r6 = r6.A04
            int r0 = r1.A02
            float r1 = (float) r0
            goto L_0x028b
        L_0x0282:
            X.1sB r0 = r6.A0d
            X.1sA r0 = r0.A05
            int r0 = r0.A02
            float r1 = (float) r0
            float r6 = r6.A01
        L_0x028b:
            float r1 = r1 * r6
            goto L_0x0049
        L_0x028e:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x030e
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x030e
            X.1s3 r1 = r3.A02
            int r0 = r1.A0D
            if (r0 != 0) goto L_0x02ca
            boolean r0 = r1.A0G()
            if (r0 != 0) goto L_0x02ca
            java.util.List r0 = r8.A08
            java.lang.Object r3 = r0.get(r2)
            X.1s9 r3 = (X.AnonymousClass1s9) r3
            java.util.List r0 = r6.A08
            java.lang.Object r1 = r0.get(r2)
            X.1s9 r1 = (X.AnonymousClass1s9) r1
            int r2 = r3.A02
            int r0 = r8.A00
            int r2 = r2 + r0
            int r1 = r1.A02
            int r0 = r6.A00
            int r1 = r1 + r0
            int r0 = r1 - r2
            r8.A01(r2)
            r6.A01(r1)
            r4.A01(r0)
            return
        L_0x02ca:
            int r0 = r3.A00
            if (r0 != r5) goto L_0x030e
            java.util.List r5 = r8.A08
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x030e
            java.util.List r1 = r6.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x030e
            java.lang.Object r0 = r5.get(r2)
            X.1s9 r0 = (X.AnonymousClass1s9) r0
            java.lang.Object r1 = r1.get(r2)
            X.1s9 r1 = (X.AnonymousClass1s9) r1
            int r5 = r0.A02
            int r0 = r8.A00
            int r5 = r5 + r0
            int r1 = r1.A02
            int r0 = r6.A00
            int r1 = r1 + r0
            int r1 = r1 - r5
            int r0 = r4.A00
            int r5 = java.lang.Math.min(r1, r0)
            X.1s3 r0 = r3.A02
            int r1 = r0.A0F
            int r0 = r0.A0H
            int r0 = java.lang.Math.max(r0, r5)
            if (r1 <= 0) goto L_0x030b
            int r0 = java.lang.Math.min(r1, r0)
        L_0x030b:
            r4.A01(r0)
        L_0x030e:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r8.A08
            java.lang.Object r11 = r0.get(r2)
            X.1s9 r11 = (X.AnonymousClass1s9) r11
            java.util.List r0 = r6.A08
            java.lang.Object r10 = r0.get(r2)
            X.1s9 r10 = (X.AnonymousClass1s9) r10
            int r9 = r11.A02
            int r0 = r8.A00
            int r7 = r9 + r0
            int r1 = r10.A02
            int r0 = r6.A00
            int r5 = r1 + r0
            X.1s3 r0 = r3.A02
            float r2 = r0.A02
            if (r11 != r10) goto L_0x0338
            r7 = r9
            r5 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x0338:
            int r5 = r5 - r7
            int r0 = r4.A02
            int r5 = r5 - r0
            float r1 = (float) r7
            float r1 = r1 + r14
            float r0 = (float) r5
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.A01(r0)
            int r1 = r8.A02
            int r0 = r4.A02
            int r1 = r1 + r0
            r6.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1s8.CQN():void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.A02.A0f);
        return sb.toString();
    }
}
