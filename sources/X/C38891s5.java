package X;

import java.util.ArrayList;

/* renamed from: X.1s5  reason: invalid class name and case insensitive filesystem */
public class C38891s5 extends C38881s4 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C39101sU A05;
    public C38931sD A06 = new C38931sD(this);
    public C38951sF A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C39091sT[] A0B;
    public C39091sT[] A0C;
    public C38961sG A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (r26 == r6) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if ((r7 & 128) == 128) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02fb A[LOOP:16: B:170:0x02f9->B:171:0x02fb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x039b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r31 = this;
            r5 = 0
            r4 = r31
            r4.A0P = r5
            r4.A0Q = r5
            int r0 = r4.A03()
            int r28 = java.lang.Math.max(r5, r0)
            int r0 = r4.A02()
            int r27 = java.lang.Math.max(r5, r0)
            r4.A0A = r5
            r4.A08 = r5
            r2 = 64
            int r7 = r4.A01
            r1 = r7 & 64
            r0 = 0
            if (r1 != r2) goto L_0x0025
            r0 = 1
        L_0x0025:
            r6 = 1
            if (r0 != 0) goto L_0x002f
            r2 = 128(0x80, float:1.794E-43)
            r1 = r7 & r2
            r0 = 0
            if (r1 != r2) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            X.1sG r3 = r4.A0D
            r3.A05 = r5
            if (r7 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            r3.A05 = r6
        L_0x003a:
            java.lang.Integer[] r2 = r4.A0q
            r26 = r2[r6]
            r25 = r2[r5]
            java.util.ArrayList r0 = r4.A00
            r30 = r0
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            r0 = r25
            if (r0 == r6) goto L_0x0050
            r24 = 0
            r0 = r26
            if (r0 != r6) goto L_0x0052
        L_0x0050:
            r24 = 1
        L_0x0052:
            r4.A00 = r5
            r4.A04 = r5
            int r23 = r30.size()
            r7 = 0
        L_0x005b:
            r0 = r23
            if (r7 >= r0) goto L_0x0073
            java.util.ArrayList r0 = r4.A00
            java.lang.Object r1 = r0.get(r7)
            X.1s3 r1 = (X.C38871s3) r1
            boolean r0 = r1 instanceof X.C38881s4
            if (r0 == 0) goto L_0x0070
            X.1s4 r1 = (X.C38881s4) r1
            r1.A0J()
        L_0x0070:
            int r7 = r7 + 1
            goto L_0x005b
        L_0x0073:
            r1 = 0
            r22 = 0
        L_0x0076:
            int r1 = r1 + 1
            r3.A0A()     // Catch:{ Exception -> 0x02d0 }
            r4.A00 = r5     // Catch:{ Exception -> 0x02d0 }
            r4.A04 = r5     // Catch:{ Exception -> 0x02d0 }
            r4.A0C(r3)     // Catch:{ Exception -> 0x02d0 }
            r7 = 0
        L_0x0083:
            r0 = r23
            if (r7 >= r0) goto L_0x0095
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02d0 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x02d0 }
            X.1s3 r0 = (X.C38871s3) r0     // Catch:{ Exception -> 0x02d0 }
            r0.A0C(r3)     // Catch:{ Exception -> 0x02d0 }
            int r7 = r7 + 1
            goto L_0x0083
        L_0x0095:
            r4.A0I(r3)     // Catch:{ Exception -> 0x02d0 }
            java.util.ArrayList r12 = r4.A00     // Catch:{ Exception -> 0x02d0 }
            int r11 = r12.size()     // Catch:{ Exception -> 0x02d0 }
            r10 = 0
            r8 = 0
        L_0x00a0:
            r9 = 1
            if (r10 >= r11) goto L_0x00b7
            java.lang.Object r7 = r12.get(r10)     // Catch:{ Exception -> 0x02d0 }
            X.1s3 r7 = (X.C38871s3) r7     // Catch:{ Exception -> 0x02d0 }
            boolean[] r0 = r7.A0s     // Catch:{ Exception -> 0x02d0 }
            r0[r5] = r5     // Catch:{ Exception -> 0x02d0 }
            r0[r9] = r5     // Catch:{ Exception -> 0x02d0 }
            boolean r0 = r7 instanceof X.AnonymousClass27M     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x00b4
            r8 = 1
        L_0x00b4:
            int r10 = r10 + 1
            goto L_0x00a0
        L_0x00b7:
            if (r8 == 0) goto L_0x00ec
            r10 = 0
        L_0x00ba:
            if (r10 >= r11) goto L_0x00ec
            java.lang.Object r8 = r12.get(r10)     // Catch:{ Exception -> 0x02d0 }
            X.1s3 r8 = (X.C38871s3) r8     // Catch:{ Exception -> 0x02d0 }
            boolean r0 = r8 instanceof X.AnonymousClass27M     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x00e9
            X.27M r8 = (X.AnonymousClass27M) r8     // Catch:{ Exception -> 0x02d0 }
            r7 = 0
        L_0x00c9:
            int r0 = r8.A00     // Catch:{ Exception -> 0x02d0 }
            if (r7 >= r0) goto L_0x00e9
            X.1s3[] r0 = r8.A01     // Catch:{ Exception -> 0x02d0 }
            r14 = r0[r7]     // Catch:{ Exception -> 0x02d0 }
            int r13 = r8.A00     // Catch:{ Exception -> 0x02d0 }
            if (r13 == 0) goto L_0x00e2
            if (r13 == r9) goto L_0x00e2
            r0 = 2
            if (r13 == r0) goto L_0x00dd
            r0 = 3
            if (r13 != r0) goto L_0x00e6
        L_0x00dd:
            boolean[] r0 = r14.A0s     // Catch:{ Exception -> 0x02d0 }
            r0[r9] = r9     // Catch:{ Exception -> 0x02d0 }
            goto L_0x00e6
        L_0x00e2:
            boolean[] r0 = r14.A0s     // Catch:{ Exception -> 0x02d0 }
            r0[r5] = r9     // Catch:{ Exception -> 0x02d0 }
        L_0x00e6:
            int r7 = r7 + 1
            goto L_0x00c9
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x00ba
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            if (r8 >= r11) goto L_0x0105
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02d0 }
            java.lang.Object r7 = r0.get(r8)     // Catch:{ Exception -> 0x02d0 }
            X.1s3 r7 = (X.C38871s3) r7     // Catch:{ Exception -> 0x02d0 }
            boolean r0 = r7 instanceof X.BJP     // Catch:{ Exception -> 0x02d0 }
            if (r0 != 0) goto L_0x00ff
            boolean r0 = r7 instanceof X.AnonymousClass27L     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x0102
        L_0x00ff:
            r7.A0I(r3)     // Catch:{ Exception -> 0x02d0 }
        L_0x0102:
            int r8 = r8 + 1
            goto L_0x00ed
        L_0x0105:
            r10 = 0
        L_0x0106:
            if (r10 >= r11) goto L_0x01d8
            java.util.ArrayList r0 = r4.A00     // Catch:{ Exception -> 0x02d0 }
            java.lang.Object r8 = r0.get(r10)     // Catch:{ Exception -> 0x02d0 }
            X.1s3 r8 = (X.C38871s3) r8     // Catch:{ Exception -> 0x02d0 }
            boolean r0 = r8 instanceof X.C38891s5     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x0133
            java.lang.Integer[] r13 = r8.A0q     // Catch:{ Exception -> 0x02d0 }
            r12 = r13[r5]     // Catch:{ Exception -> 0x02d0 }
            r7 = r13[r9]     // Catch:{ Exception -> 0x02d0 }
            if (r12 != r6) goto L_0x0120
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x02d0 }
            r13[r5] = r0     // Catch:{ Exception -> 0x02d0 }
        L_0x0120:
            if (r7 != r6) goto L_0x0126
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x02d0 }
            r13[r9] = r0     // Catch:{ Exception -> 0x02d0 }
        L_0x0126:
            r8.A0I(r3)     // Catch:{ Exception -> 0x02d0 }
            if (r12 != r6) goto L_0x012d
            r13[r5] = r12     // Catch:{ Exception -> 0x02d0 }
        L_0x012d:
            if (r7 != r6) goto L_0x01d4
            r13[r9] = r7     // Catch:{ Exception -> 0x02d0 }
            goto L_0x01d4
        L_0x0133:
            r0 = -1
            r8.A0B = r0     // Catch:{ Exception -> 0x02d0 }
            r8.A0M = r0     // Catch:{ Exception -> 0x02d0 }
            r0 = r2[r5]     // Catch:{ Exception -> 0x02d0 }
            r14 = 2
            if (r0 == r6) goto L_0x0175
            java.lang.Integer[] r0 = r8.A0q     // Catch:{ Exception -> 0x02d0 }
            r7 = r0[r5]     // Catch:{ Exception -> 0x02d0 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x02d0 }
            if (r7 != r0) goto L_0x0175
            X.1sC r15 = r8.A0W     // Catch:{ Exception -> 0x02d0 }
            int r12 = r15.A01     // Catch:{ Exception -> 0x02d0 }
            int r7 = r4.A03()     // Catch:{ Exception -> 0x02d0 }
            X.1sC r13 = r8.A0X     // Catch:{ Exception -> 0x02d0 }
            int r0 = r13.A01     // Catch:{ Exception -> 0x02d0 }
            int r7 = r7 - r0
            X.1sH r0 = r3.A09(r15)     // Catch:{ Exception -> 0x02d0 }
            r15.A02 = r0     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r3.A09(r13)     // Catch:{ Exception -> 0x02d0 }
            r13.A02 = r0     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r15.A02     // Catch:{ Exception -> 0x02d0 }
            r3.A0C(r0, r12)     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r13.A02     // Catch:{ Exception -> 0x02d0 }
            r3.A0C(r0, r7)     // Catch:{ Exception -> 0x02d0 }
            r8.A0B = r14     // Catch:{ Exception -> 0x02d0 }
            r8.A0P = r12     // Catch:{ Exception -> 0x02d0 }
            int r7 = r7 - r12
            r8.A0O = r7     // Catch:{ Exception -> 0x02d0 }
            int r0 = r8.A0J     // Catch:{ Exception -> 0x02d0 }
            if (r7 >= r0) goto L_0x0175
            r8.A0O = r0     // Catch:{ Exception -> 0x02d0 }
        L_0x0175:
            r0 = r2[r9]     // Catch:{ Exception -> 0x02d0 }
            if (r0 == r6) goto L_0x01c9
            java.lang.Integer[] r0 = r8.A0q     // Catch:{ Exception -> 0x02d0 }
            r7 = r0[r9]     // Catch:{ Exception -> 0x02d0 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x02d0 }
            if (r7 != r0) goto L_0x01c9
            X.1sC r15 = r8.A0Y     // Catch:{ Exception -> 0x02d0 }
            int r13 = r15.A01     // Catch:{ Exception -> 0x02d0 }
            int r12 = r4.A02()     // Catch:{ Exception -> 0x02d0 }
            X.1sC r7 = r8.A0S     // Catch:{ Exception -> 0x02d0 }
            int r0 = r7.A01     // Catch:{ Exception -> 0x02d0 }
            int r12 = r12 - r0
            X.1sH r0 = r3.A09(r15)     // Catch:{ Exception -> 0x02d0 }
            r15.A02 = r0     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r3.A09(r7)     // Catch:{ Exception -> 0x02d0 }
            r7.A02 = r0     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r15.A02     // Catch:{ Exception -> 0x02d0 }
            r3.A0C(r0, r13)     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r7.A02     // Catch:{ Exception -> 0x02d0 }
            r3.A0C(r0, r12)     // Catch:{ Exception -> 0x02d0 }
            int r0 = r8.A07     // Catch:{ Exception -> 0x02d0 }
            if (r0 > 0) goto L_0x01ae
            int r7 = r8.A0N     // Catch:{ Exception -> 0x02d0 }
            r0 = 8
            if (r7 != r0) goto L_0x01bc
        L_0x01ae:
            X.1sC r0 = r8.A0R     // Catch:{ Exception -> 0x02d0 }
            X.1sH r7 = r3.A09(r0)     // Catch:{ Exception -> 0x02d0 }
            r0.A02 = r7     // Catch:{ Exception -> 0x02d0 }
            int r0 = r8.A07     // Catch:{ Exception -> 0x02d0 }
            int r0 = r0 + r13
            r3.A0C(r7, r0)     // Catch:{ Exception -> 0x02d0 }
        L_0x01bc:
            r8.A0M = r14     // Catch:{ Exception -> 0x02d0 }
            r8.A0Q = r13     // Catch:{ Exception -> 0x02d0 }
            int r12 = r12 - r13
            r8.A09 = r12     // Catch:{ Exception -> 0x02d0 }
            int r0 = r8.A0I     // Catch:{ Exception -> 0x02d0 }
            if (r12 >= r0) goto L_0x01c9
            r8.A09 = r0     // Catch:{ Exception -> 0x02d0 }
        L_0x01c9:
            boolean r0 = r8 instanceof X.BJP     // Catch:{ Exception -> 0x02d0 }
            if (r0 != 0) goto L_0x01d4
            boolean r0 = r8 instanceof X.AnonymousClass27L     // Catch:{ Exception -> 0x02d0 }
            if (r0 != 0) goto L_0x01d4
            r8.A0I(r3)     // Catch:{ Exception -> 0x02d0 }
        L_0x01d4:
            int r10 = r10 + 1
            goto L_0x0106
        L_0x01d8:
            int r0 = r4.A00     // Catch:{ Exception -> 0x02d0 }
            if (r0 <= 0) goto L_0x01df
            A00(r3, r4, r5)     // Catch:{ Exception -> 0x02d0 }
        L_0x01df:
            int r0 = r4.A04     // Catch:{ Exception -> 0x02d0 }
            if (r0 <= 0) goto L_0x01e6
            A00(r3, r4, r9)     // Catch:{ Exception -> 0x02d0 }
        L_0x01e6:
            boolean r0 = r3.A05     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x020a
            r7 = 0
        L_0x01eb:
            int r9 = r3.A02     // Catch:{ Exception -> 0x02d0 }
            if (r7 >= r9) goto L_0x01fa
            X.1sJ[] r0 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x02d0 }
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x02d0 }
            if (r0 == 0) goto L_0x020a
            int r7 = r7 + 1
            goto L_0x01eb
        L_0x01fa:
            r8 = 0
        L_0x01fb:
            if (r8 >= r9) goto L_0x02ea
            X.1sJ[] r0 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r0 = r0[r8]     // Catch:{ Exception -> 0x02d0 }
            X.1sH r7 = r0.A02     // Catch:{ Exception -> 0x02d0 }
            float r0 = r0.A00     // Catch:{ Exception -> 0x02d0 }
            r7.A00 = r0     // Catch:{ Exception -> 0x02d0 }
            int r8 = r8 + 1
            goto L_0x01fb
        L_0x020a:
            X.1sI r0 = r3.A04     // Catch:{ Exception -> 0x02d0 }
            r29 = r0
            r8 = 0
        L_0x020f:
            int r0 = r3.A02     // Catch:{ Exception -> 0x02d0 }
            if (r8 >= r0) goto L_0x02b9
            X.1sJ[] r9 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r0 = r9[r8]     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r0.A02     // Catch:{ Exception -> 0x02d0 }
            java.lang.Integer r7 = r0.A06     // Catch:{ Exception -> 0x02d0 }
            java.lang.Integer r21 = X.AnonymousClass00R.A00     // Catch:{ Exception -> 0x02d0 }
            r0 = r21
            if (r7 == r0) goto L_0x022c
            r0 = r9[r8]     // Catch:{ Exception -> 0x02d0 }
            float r0 = r0.A00     // Catch:{ Exception -> 0x02d0 }
            r16 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            int r8 = r8 + 1
            goto L_0x020f
        L_0x022f:
            r20 = 0
            r14 = 0
        L_0x0232:
            int r14 = r14 + 1
            r13 = -1
            r19 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r12 = 0
            r11 = -1
            r18 = -1
            r10 = 0
        L_0x023d:
            int r0 = r3.A02     // Catch:{ Exception -> 0x02d0 }
            r9 = 1
            if (r12 >= r0) goto L_0x0291
            X.1sJ[] r0 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r8 = r0[r12]     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r8.A02     // Catch:{ Exception -> 0x02d0 }
            java.lang.Integer r7 = r0.A06     // Catch:{ Exception -> 0x02d0 }
            r0 = r21
            if (r7 == r0) goto L_0x028e
            boolean r0 = r8.A04     // Catch:{ Exception -> 0x02d0 }
            if (r0 != 0) goto L_0x028e
            float r0 = r8.A00     // Catch:{ Exception -> 0x02d0 }
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x028e
        L_0x0258:
            int r0 = r3.A01     // Catch:{ Exception -> 0x02d0 }
            if (r9 >= r0) goto L_0x028e
            X.1sK r0 = r3.A0D     // Catch:{ Exception -> 0x02d0 }
            X.1sH[] r0 = r0.A03     // Catch:{ Exception -> 0x02d0 }
            r15 = r0[r9]     // Catch:{ Exception -> 0x02d0 }
            X.1sO r0 = r8.A01     // Catch:{ Exception -> 0x02d0 }
            float r17 = r0.BLx(r15)     // Catch:{ Exception -> 0x02d0 }
            int r0 = (r17 > r16 ? 1 : (r17 == r16 ? 0 : -1))
            r7 = 0
            if (r0 > 0) goto L_0x026e
            goto L_0x0289
        L_0x026e:
            float[] r0 = r15.A0A     // Catch:{ Exception -> 0x02d0 }
            r16 = r0[r7]     // Catch:{ Exception -> 0x02d0 }
            float r16 = r16 / r17
            int r0 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            if (r7 == r10) goto L_0x027c
        L_0x027a:
            if (r7 <= r10) goto L_0x0282
        L_0x027c:
            r10 = r7
            r19 = r16
            r11 = r12
            r18 = r9
        L_0x0282:
            int r7 = r7 + 1
            r0 = 9
            if (r7 >= r0) goto L_0x0289
            goto L_0x026e
        L_0x0289:
            int r9 = r9 + 1
            r16 = 0
            goto L_0x0258
        L_0x028e:
            int r12 = r12 + 1
            goto L_0x023d
        L_0x0291:
            if (r11 == r13) goto L_0x0294
            goto L_0x0297
        L_0x0294:
            r20 = 1
            goto L_0x02af
        L_0x0297:
            X.1sJ[] r0 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r7 = r0[r11]     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r7.A02     // Catch:{ Exception -> 0x02d0 }
            r0.A01 = r13     // Catch:{ Exception -> 0x02d0 }
            X.1sK r0 = r3.A0D     // Catch:{ Exception -> 0x02d0 }
            X.1sH[] r0 = r0.A03     // Catch:{ Exception -> 0x02d0 }
            r0 = r0[r18]     // Catch:{ Exception -> 0x02d0 }
            r7.A04(r0)     // Catch:{ Exception -> 0x02d0 }
            X.1sH r0 = r7.A02     // Catch:{ Exception -> 0x02d0 }
            r0.A01 = r11     // Catch:{ Exception -> 0x02d0 }
            r0.A04(r7)     // Catch:{ Exception -> 0x02d0 }
        L_0x02af:
            int r0 = r3.A01     // Catch:{ Exception -> 0x02d0 }
            int r0 = r0 / 2
            if (r14 > r0) goto L_0x02b9
            if (r20 != 0) goto L_0x02b9
            goto L_0x0232
        L_0x02b9:
            r0 = r29
            X.C38961sG.A05(r0, r3)     // Catch:{ Exception -> 0x02d0 }
            r8 = 0
        L_0x02bf:
            int r0 = r3.A02     // Catch:{ Exception -> 0x02d0 }
            if (r8 >= r0) goto L_0x02ea
            X.1sJ[] r0 = r3.A06     // Catch:{ Exception -> 0x02d0 }
            r0 = r0[r8]     // Catch:{ Exception -> 0x02d0 }
            X.1sH r7 = r0.A02     // Catch:{ Exception -> 0x02d0 }
            float r0 = r0.A00     // Catch:{ Exception -> 0x02d0 }
            r7.A00 = r0     // Catch:{ Exception -> 0x02d0 }
            int r8 = r8 + 1
            goto L_0x02bf
        L_0x02d0:
            r9 = move-exception
            r9.printStackTrace()
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "EXCEPTION : "
            r7.append(r0)
            r7.append(r9)
            java.lang.String r0 = r7.toString()
            r8.println(r0)
        L_0x02ea:
            boolean[] r10 = X.AnonymousClass2VK.A00
            r0 = 2
            r9 = 0
            r10[r0] = r5
            r4.A08()
            java.util.ArrayList r8 = r4.A00
            int r7 = r8.size()
        L_0x02f9:
            if (r9 >= r7) goto L_0x0307
            java.lang.Object r0 = r8.get(r9)
            X.1s3 r0 = (X.C38871s3) r0
            r0.A08()
            int r9 = r9 + 1
            goto L_0x02f9
        L_0x0307:
            if (r24 == 0) goto L_0x033a
            r0 = 8
            if (r1 >= r0) goto L_0x033a
            r0 = 2
            boolean r0 = r10[r0]
            if (r0 == 0) goto L_0x033a
            r11 = 0
            r10 = 0
            r9 = 0
        L_0x0315:
            r0 = r23
            if (r11 >= r0) goto L_0x033c
            java.util.ArrayList r0 = r4.A00
            java.lang.Object r8 = r0.get(r11)
            X.1s3 r8 = (X.C38871s3) r8
            int r7 = r8.A0P
            int r0 = r8.A03()
            int r7 = r7 + r0
            int r10 = java.lang.Math.max(r10, r7)
            int r7 = r8.A0Q
            int r0 = r8.A02()
            int r7 = r7 + r0
            int r9 = java.lang.Math.max(r9, r7)
            int r11 = r11 + 1
            goto L_0x0315
        L_0x033a:
            r10 = 0
            goto L_0x036d
        L_0x033c:
            int r0 = r4.A0J
            int r8 = java.lang.Math.max(r0, r10)
            int r0 = r4.A0I
            int r7 = java.lang.Math.max(r0, r9)
            r0 = r25
            if (r0 != r6) goto L_0x03d0
            int r0 = r4.A03()
            if (r0 >= r8) goto L_0x03d0
            r4.A0A(r8)
            r2[r5] = r6
            r10 = 1
            r22 = 1
        L_0x035a:
            r0 = r26
            if (r0 != r6) goto L_0x036d
            int r0 = r4.A02()
            if (r0 >= r7) goto L_0x036d
            r4.A09(r7)
            r0 = 1
            r2[r0] = r6
            r10 = 1
            r22 = 1
        L_0x036d:
            int r0 = r4.A0J
            int r7 = r4.A03()
            int r0 = java.lang.Math.max(r0, r7)
            if (r0 <= r7) goto L_0x0383
            r4.A0A(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2[r5] = r0
            r10 = 1
            r22 = 1
        L_0x0383:
            int r0 = r4.A0I
            int r9 = r4.A02()
            int r0 = java.lang.Math.max(r0, r9)
            if (r0 <= r9) goto L_0x039b
            r4.A09(r0)
            java.lang.Integer r7 = X.AnonymousClass00R.A00
            r0 = 1
            r2[r0] = r7
        L_0x0397:
            r22 = 1
            goto L_0x0076
        L_0x039b:
            r8 = 1
            if (r22 != 0) goto L_0x03d2
            r0 = r2[r5]
            if (r0 != r6) goto L_0x03ba
            if (r28 <= 0) goto L_0x03ba
            int r7 = r4.A03()
            r0 = r28
            if (r7 <= r0) goto L_0x03ba
            r4.A0A = r8
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2[r5] = r0
            r0 = r28
            r4.A0A(r0)
            r10 = 1
            r22 = 1
        L_0x03ba:
            r0 = r2[r8]
            if (r0 != r6) goto L_0x03d2
            if (r27 <= 0) goto L_0x03d2
            r0 = r27
            if (r9 <= r0) goto L_0x03d2
            r4.A08 = r8
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r2[r8] = r0
            r0 = r27
            r4.A09(r0)
            goto L_0x0397
        L_0x03d0:
            r10 = 0
            goto L_0x035a
        L_0x03d2:
            if (r10 != 0) goto L_0x0076
            r0 = r30
            r4.A00 = r0
            if (r22 == 0) goto L_0x03de
            r2[r5] = r25
            r2[r8] = r26
        L_0x03de:
            X.1sK r0 = r3.A0D
            r4.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38891s5.A0J():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x018f, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0190, code lost:
        r3 = r8.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0192, code lost:
        if (r3 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0196, code lost:
        if (r7 == r37) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0198, code lost:
        r5 = r5 + r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x019d, code lost:
        if (r24 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01a1, code lost:
        if (r7 == r37) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a3, code lost:
        if (r7 == r1) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01a5, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01a6, code lost:
        r3 = r8.A03;
        r2 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01aa, code lost:
        if (r3 == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ac, code lost:
        r10 = r8.A02;
        r9 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b0, code lost:
        if (r7 != r1) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b2, code lost:
        r3 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b3, code lost:
        r2.A0E(r10, r9, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b6, code lost:
        if (r11 == false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b8, code lost:
        if (r24 != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ba, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01bb, code lost:
        r2.A0D(r8.A02, r8.A03.A02, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c4, code lost:
        if (r15 == false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01ca, code lost:
        if (r7.A0N == 8) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d0, code lost:
        if (r7.A0q[r42] != r4) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d2, code lost:
        r5 = r7.A0n;
        r6 = 0;
        r2.A0E(r5[r19 + 1].A02, r5[r19].A02, 0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e3, code lost:
        r2.A0E(r7.A0n[r19].A02, r39.A0n[r19].A02, r6, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f6, code lost:
        r23 = r19 + 1;
        r3 = r7.A0n[r23].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01fe, code lost:
        if (r3 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0200, code lost:
        r5 = r3.A05;
        r3 = r5.A0n[r19].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0208, code lost:
        if (r3 == null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020c, code lost:
        if (r3.A05 != r7) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x020e, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0211, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0213, code lost:
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0221, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0223, code lost:
        if (r0 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0225, code lost:
        r7 = r36.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022d, code lost:
        if (r7[r23].A03 == null) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x022f, code lost:
        r6 = r0.A0n[r23];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0237, code lost:
        if (r0.A0q[r42] != r4) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x023d, code lost:
        if (r0.A0l[r42] != 0) goto L_0x036e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x023f, code lost:
        if (r24 != false) goto L_0x0370;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0241, code lost:
        r4 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0247, code lost:
        if (r4.A05 != r39) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0249, code lost:
        r8 = r6.A02;
        r5 = r4.A02;
        r4 = -r6.A00();
        r3 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0253, code lost:
        r2.A0D(r8, r5, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0256, code lost:
        r2.A0F(r6.A02, r7[r23].A03.A02, -r6.A00(), 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0267, code lost:
        if (r15 == false) goto L_0x0282;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0269, code lost:
        r6 = r39.A0n[r23].A02;
        r3 = r36.A0n[r23];
        r2.A0E(r6, r3.A02, r3.A00(), 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0282, code lost:
        r3 = r14.A0E;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0286, code lost:
        if (r3 == null) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0288, code lost:
        r21 = r22.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x028f, code lost:
        if (r21 <= 1) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0293, code lost:
        if (r14.A0I == false) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0297, code lost:
        if (r14.A0G != false) goto L_0x029c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0299, code lost:
        r13 = (float) r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x029c, code lost:
        r3 = 0.0f;
        r5 = null;
        r11 = 0;
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02a1, code lost:
        r9 = (X.C38871s3) r22.get(r11);
        r17 = r9.A0j[r42];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02af, code lost:
        if (r17 >= r3) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02b3, code lost:
        if (r14.A0G == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b5, code lost:
        r4 = r9.A0n;
        r2.A0D(r4[r23].A02, r4[r19].A02, 0, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02c4, code lost:
        r11 = r11 + 1;
        r3 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02c9, code lost:
        if (r11 >= r21) goto L_0x0384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ce, code lost:
        if (r17 != r3) goto L_0x02e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02d0, code lost:
        r4 = r9.A0n;
        r2.A0D(r4[r23].A02, r4[r19].A02, 0, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02e1, code lost:
        r17 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02e3, code lost:
        if (r5 == null) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02e5, code lost:
        r5 = r5.A0n;
        r28 = r5[r19].A02;
        r27 = r5[r23].A02;
        r5 = r9.A0n;
        r15 = r5[r19].A02;
        r8 = r5[r23].A02;
        r7 = r2.A06();
        r7.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0309, code lost:
        if (r13 == r3) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x030d, code lost:
        if (r10 == r17) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0311, code lost:
        if (r10 != r3) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0313, code lost:
        r7.A01.CCz(r28, 1.0f);
        r7.A01.CCz(r27, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0321, code lost:
        r2.A0B(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0324, code lost:
        r5 = r9;
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x032a, code lost:
        if (r17 != r3) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x032c, code lost:
        r7.A01.CCz(r15, 1.0f);
        r7.A01.CCz(r8, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0337, code lost:
        r10 = (r10 / r13) / (r17 / r13);
        r7.A01.CCz(r28, 1.0f);
        r7.A01.CCz(r27, -1.0f);
        r7.A01.CCz(r8, r10);
        r7.A01.CCz(r15, -r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0355, code lost:
        r7.A01.CCz(r28, 1.0f);
        r7.A01.CCz(r27, -1.0f);
        r7.A01.CCz(r8, 1.0f);
        r7.A01.CCz(r15, -1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x036e, code lost:
        if (r24 == false) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0370, code lost:
        r5 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0376, code lost:
        if (r5.A05 != r39) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0378, code lost:
        r8 = r6.A02;
        r5 = r5.A02;
        r4 = -r6.A00();
        r3 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0384, code lost:
        if (r1 == null) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0386, code lost:
        if (r1 == r0) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0388, code lost:
        if (r24 == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x038a, code lost:
        r5 = r37.A0n[r19];
        r4 = r36.A0n[r23];
        r3 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0398, code lost:
        if (r3 == null) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x039a, code lost:
        r5 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x039c, code lost:
        r3 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x039e, code lost:
        if (r3 == null) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03a0, code lost:
        r6 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03a2, code lost:
        r4 = r1.A0n[r19];
        r3 = r0.A0n[r23];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03aa, code lost:
        if (r5 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ac, code lost:
        if (r6 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ae, code lost:
        if (r42 != 0) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03b0, code lost:
        r8 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03b2, code lost:
        r2.A0G(r4.A02, r5, r6, r3.A02, r8, r4.A00(), r3.A00(), 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03c3, code lost:
        if (r26 != false) goto L_0x03c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03c5, code lost:
        if (r25 == false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03c7, code lost:
        if (r1 == null) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03c9, code lost:
        if (r1 == r0) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03cb, code lost:
        r6 = r1.A0n[r19];
        r5 = r0.A0n[r23];
        r1 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03d5, code lost:
        if (r1 == null) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03d7, code lost:
        r3 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03d9, code lost:
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x03db, code lost:
        if (r1 == null) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03dd, code lost:
        r4 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03df, code lost:
        r1 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03e1, code lost:
        if (r1 == r0) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03e3, code lost:
        r0 = r1.A0n[r23].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03e9, code lost:
        if (r0 == null) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03eb, code lost:
        r16 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03ef, code lost:
        if (r3 == null) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03f1, code lost:
        if (r16 == null) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03f3, code lost:
        r2.A0G(r6.A02, r3, r16, r5.A02, 0.5f, r6.A00(), r5.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x040b, code lost:
        r18 = r18 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x040f, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0412, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0415, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0418, code lost:
        r8 = r12.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x041b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x041e, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0422, code lost:
        if (r26 == false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0424, code lost:
        if (r1 == null) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0426, code lost:
        r4 = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0428, code lost:
        if (r4 <= 0) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x042a, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x042d, code lost:
        if (r14.A05 == r4) goto L_0x0430;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x042f, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0430, code lost:
        r7 = r1;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0432, code lost:
        r4 = r7.A0p[r42];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0436, code lost:
        if (r4 == null) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x043c, code lost:
        if (r4.A0N != 8) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x043e, code lost:
        r4 = r4.A0p[r42];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0443, code lost:
        if (r7 != r0) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0445, code lost:
        r9 = r7.A0n[r19];
        r5 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x044d, code lost:
        if (r9.A03 == null) goto L_0x04f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x044f, code lost:
        r8 = r9.A03.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0453, code lost:
        if (r6 == r7) goto L_0x04da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0455, code lost:
        r8 = r6.A0n[r23].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x045b, code lost:
        r30 = r9.A00();
        r31 = r7.A0n[r23].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0467, code lost:
        if (r4 == null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0469, code lost:
        r11 = r4.A0n[r19];
        r9 = r11.A02;
        r10 = r7.A0n[r23].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0475, code lost:
        r31 = r31 + r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x047b, code lost:
        r30 = r30 + r6.A0n[r23].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0485, code lost:
        if (r5 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0487, code lost:
        if (r8 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0489, code lost:
        if (r9 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x048b, code lost:
        if (r10 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x048d, code lost:
        if (r7 != r1) goto L_0x0497;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x048f, code lost:
        r30 = r1.A0n[r19].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0497, code lost:
        if (r7 != r0) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0499, code lost:
        r31 = r0.A0n[r23].A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x04a1, code lost:
        r32 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x04a3, code lost:
        if (r12 == false) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x04a5, code lost:
        r32 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x04a7, code lost:
        r2.A0G(r5, r8, r9, r10, 0.5f, r30, r31, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04ba, code lost:
        if (r7.A0N == 8) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04bc, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x04bd, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x04be, code lost:
        if (r4 == null) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x04c2, code lost:
        r11 = r36.A0n[r23].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x04ca, code lost:
        if (r11 == null) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x04cc, code lost:
        r9 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04ce, code lost:
        r10 = r7.A0n[r23].A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04d4, code lost:
        if (r11 == null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04d7, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x04da, code lost:
        if (r7 != r1) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x04dc, code lost:
        if (r6 != r7) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x04de, code lost:
        r3 = r37.A0n[r19].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x04e6, code lost:
        if (r3 == null) goto L_0x04ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x04e8, code lost:
        r8 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04ec, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04f0, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x04f6, code lost:
        if (r25 == false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04f8, code lost:
        if (r1 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04fa, code lost:
        r4 = r14.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04fc, code lost:
        if (r4 <= 0) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04fe, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0501, code lost:
        if (r14.A05 == r4) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0503, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0504, code lost:
        r8 = r1;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0506, code lost:
        r5 = r8.A0p[r42];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x050a, code lost:
        if (r5 == null) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x050e, code lost:
        if (r5.A0N != 8) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0510, code lost:
        r5 = r5.A0p[r42];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0515, code lost:
        if (r8 == r1) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0517, code lost:
        if (r8 == r0) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0519, code lost:
        if (r5 == null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x051b, code lost:
        if (r5 != r0) goto L_0x051f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x051d, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x051f, code lost:
        r11 = r8.A0n;
        r10 = r11[r19];
        r9 = r10.A02;
        r4 = r6.A0n[r23].A02;
        r33 = r10.A00();
        r12 = r11[r23];
        r34 = r12.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0535, code lost:
        if (r5 == null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0537, code lost:
        r11 = r5.A0n[r19];
        r10 = r11.A02;
        r3 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x053f, code lost:
        if (r3 == null) goto L_0x05d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0541, code lost:
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0543, code lost:
        r34 = r34 + r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0549, code lost:
        r33 = r33 + r6.A0n[r23].A00();
        r35 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0555, code lost:
        if (r13 == false) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0557, code lost:
        r35 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0559, code lost:
        if (r9 == null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x055b, code lost:
        if (r4 == null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x055d, code lost:
        if (r10 == null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x055f, code lost:
        if (r3 == null) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0561, code lost:
        r2.A0G(r9, r4, r10, r3, 0.5f, r33, r34, r35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0572, code lost:
        if (r8.A0N != 8) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0574, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0575, code lost:
        r6 = r8;
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0577, code lost:
        if (r5 != null) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0579, code lost:
        r10 = r1.A0n[r19];
        r4 = r37.A0n[r19].A03;
        r8 = r0.A0n[r23];
        r9 = r36.A0n[r23].A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0592, code lost:
        if (r4 == null) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0594, code lost:
        if (r1 == r0) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0596, code lost:
        r2.A0D(r10.A02, r4.A02, r10.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x05a1, code lost:
        if (r9 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05a3, code lost:
        if (r1 == r0) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05a5, code lost:
        r2.A0D(r8.A02, r9.A02, -r8.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05b3, code lost:
        if (r9 == null) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05b5, code lost:
        r6 = r10.A02;
        r5 = r4.A02;
        r33 = r10.A00();
        r2.A0G(r6, r5, r8.A02, r9.A02, 0.5f, r33, r8.A00(), 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05d7, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05db, code lost:
        r11 = r0.A0n[r19];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05df, code lost:
        if (r11 == null) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05e1, code lost:
        r10 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x05e3, code lost:
        r3 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05e5, code lost:
        if (r11 == null) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05e9, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0168, code lost:
        if (r2 != 1) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016e, code lost:
        if (r2 != 2) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0170, code lost:
        r24 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0172, code lost:
        r7 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0174, code lost:
        r8 = r7.A0n[r19];
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        if (r24 == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017c, code lost:
        r5 = r8.A00();
        r2 = r7.A0q[r42];
        r4 = X.AnonymousClass00R.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0186, code lost:
        if (r2 != r4) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0188, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018d, code lost:
        if (r7.A0l[r42] == 0) goto L_0x0190;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C38961sG r40, X.C38891s5 r41, int r42) {
        /*
            r18 = 0
            r39 = r41
            r0 = r39
            if (r42 != 0) goto L_0x05ec
            int r0 = r0.A00
            r38 = r0
            r0 = r39
            X.1sT[] r0 = r0.A0B
            r20 = r0
            r19 = 0
        L_0x0014:
            r1 = r18
            r0 = r38
            if (r1 >= r0) goto L_0x05fa
            r14 = r20[r18]
            boolean r0 = r14.A0F
            if (r0 != 0) goto L_0x013b
            int r5 = r14.A01
            r6 = 2
            int r11 = r5 * 2
            X.1s3 r4 = r14.A07
            r3 = r4
            r2 = 1
            r7 = r4
        L_0x002a:
            int r0 = r14.A05
            int r0 = r0 + 1
            r14.A05 = r0
            X.1s3[] r0 = r4.A0p
            r1 = 0
            r0[r5] = r1
            X.1s3[] r0 = r4.A0o
            r0[r5] = r1
            int r1 = r4.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00d7
            int r0 = r14.A04
            int r0 = r0 + 1
            r14.A04 = r0
            java.lang.Integer[] r1 = r4.A0q
            if (r5 != 0) goto L_0x0102
            r0 = 0
        L_0x004a:
            r0 = r1[r0]
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            if (r0 == r1) goto L_0x005b
            int r8 = r14.A03
            if (r5 != 0) goto L_0x00fc
            int r0 = r4.A03()
        L_0x0058:
            int r8 = r8 + r0
            r14.A03 = r8
        L_0x005b:
            int r9 = r14.A03
            X.1sC[] r8 = r4.A0n
            r0 = r8[r11]
            int r10 = r0.A00()
            int r9 = r9 + r10
            r14.A03 = r9
            int r0 = r11 + 1
            r0 = r8[r0]
            int r8 = r0.A00()
            int r9 = r9 + r8
            r14.A03 = r9
            int r0 = r14.A02
            int r0 = r0 + r10
            r14.A02 = r0
            int r0 = r0 + r8
            r14.A02 = r0
            X.1s3 r0 = r14.A09
            if (r0 != 0) goto L_0x0081
            r14.A09 = r4
        L_0x0081:
            r14.A0D = r4
            java.lang.Integer[] r0 = r4.A0q
            r0 = r0[r5]
            if (r0 != r1) goto L_0x00d7
            int[] r0 = r4.A0l
            r8 = r0[r5]
            r10 = 0
            if (r8 == 0) goto L_0x0095
            r0 = 3
            if (r8 == r0) goto L_0x0095
            if (r8 != r6) goto L_0x00d7
        L_0x0095:
            int r0 = r14.A06
            int r0 = r0 + 1
            r14.A06 = r0
            float[] r0 = r4.A0j
            r9 = r0[r5]
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a8
            float r0 = r14.A00
            float r0 = r0 + r9
            r14.A00 = r0
        L_0x00a8:
            int r1 = r4.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00c7
            if (r8 == 0) goto L_0x00b3
            r0 = 3
            if (r8 != r0) goto L_0x00c7
        L_0x00b3:
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            r14.A0I = r2
        L_0x00b9:
            java.util.ArrayList r0 = r14.A0E
            if (r0 != 0) goto L_0x00c4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0E = r0
        L_0x00c4:
            r0.add(r4)
        L_0x00c7:
            X.1s3 r0 = r14.A08
            if (r0 != 0) goto L_0x00cd
            r14.A08 = r4
        L_0x00cd:
            X.1s3 r0 = r14.A0C
            if (r0 == 0) goto L_0x00d5
            X.1s3[] r0 = r0.A0o
            r0[r5] = r4
        L_0x00d5:
            r14.A0C = r4
        L_0x00d7:
            if (r7 == r4) goto L_0x00dd
            X.1s3[] r0 = r7.A0p
            r0[r5] = r4
        L_0x00dd:
            X.1sC[] r0 = r4.A0n
            int r7 = r11 + 1
            r0 = r0[r7]
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0105
            X.1s3 r1 = r0.A05
            X.1sC[] r0 = r1.A0n
            r0 = r0[r11]
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0105
            X.1s3 r0 = r0.A05
            if (r0 != r4) goto L_0x0105
            r7 = r4
            r4 = r1
            goto L_0x002a
        L_0x00f9:
            r14.A0H = r2
            goto L_0x00b9
        L_0x00fc:
            int r0 = r4.A02()
            goto L_0x0058
        L_0x0102:
            r0 = 1
            goto L_0x004a
        L_0x0105:
            X.1s3 r0 = r14.A09
            if (r0 == 0) goto L_0x0116
            int r1 = r14.A03
            X.1sC[] r0 = r0.A0n
            r0 = r0[r11]
            int r0 = r0.A00()
            int r1 = r1 - r0
            r14.A03 = r1
        L_0x0116:
            X.1s3 r0 = r14.A0D
            if (r0 == 0) goto L_0x0127
            int r1 = r14.A03
            X.1sC[] r0 = r0.A0n
            r0 = r0[r7]
            int r0 = r0.A00()
            int r1 = r1 - r0
            r14.A03 = r1
        L_0x0127:
            r14.A0B = r4
            if (r5 != 0) goto L_0x021d
            boolean r0 = r14.A0J
            if (r0 == 0) goto L_0x021d
            r14.A0A = r4
        L_0x0131:
            boolean r0 = r14.A0H
            if (r0 == 0) goto L_0x021a
            boolean r0 = r14.A0I
            if (r0 == 0) goto L_0x021a
        L_0x0139:
            r14.A0G = r2
        L_0x013b:
            r0 = 1
            r14.A0F = r0
            X.1s3 r0 = r14.A07
            r37 = r0
            X.1s3 r0 = r14.A0B
            r36 = r0
            X.1s3 r1 = r14.A09
            X.1s3 r0 = r14.A0D
            X.1s3 r12 = r14.A0A
            float r13 = r14.A00
            r2 = r39
            java.lang.Integer[] r2 = r2.A0q
            r3 = r2[r42]
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            r4 = 1
            r15 = 0
            if (r3 != r2) goto L_0x015b
            r15 = 1
        L_0x015b:
            r3 = 2
            if (r42 != 0) goto L_0x0216
            int r2 = r12.A0A
        L_0x0160:
            r26 = 1
            if (r2 == 0) goto L_0x016a
            r26 = 0
            r25 = 1
            if (r2 == r4) goto L_0x0170
        L_0x016a:
            r25 = 0
            r24 = 1
            if (r2 == r3) goto L_0x0172
        L_0x0170:
            r24 = 0
        L_0x0172:
            r7 = r37
        L_0x0174:
            X.1sC[] r2 = r7.A0n
            r8 = r2[r19]
            r6 = 4
            if (r24 == 0) goto L_0x017c
            r6 = 1
        L_0x017c:
            int r5 = r8.A00()
            java.lang.Integer[] r2 = r7.A0q
            r2 = r2[r42]
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            if (r2 != r4) goto L_0x018f
            int[] r2 = r7.A0l
            r2 = r2[r42]
            r11 = 1
            if (r2 == 0) goto L_0x0190
        L_0x018f:
            r11 = 0
        L_0x0190:
            X.1sC r3 = r8.A03
            if (r3 == 0) goto L_0x019d
            r2 = r37
            if (r7 == r2) goto L_0x019d
            int r2 = r3.A00()
            int r5 = r5 + r2
        L_0x019d:
            if (r24 == 0) goto L_0x01a6
            r2 = r37
            if (r7 == r2) goto L_0x01a6
            if (r7 == r1) goto L_0x01a6
            r6 = 5
        L_0x01a6:
            X.1sC r3 = r8.A03
            r2 = r40
            if (r3 == 0) goto L_0x01c4
            X.1sH r10 = r8.A02
            X.1sH r9 = r3.A02
            if (r7 != r1) goto L_0x0213
            r3 = 6
        L_0x01b3:
            r2.A0E(r10, r9, r5, r3)
            if (r11 == 0) goto L_0x01bb
            if (r24 != 0) goto L_0x01bb
            r6 = 5
        L_0x01bb:
            X.1sH r3 = r8.A02
            X.1sC r8 = r8.A03
            X.1sH r8 = r8.A02
            r2.A0D(r3, r8, r5, r6)
        L_0x01c4:
            if (r15 == 0) goto L_0x01f6
            int r5 = r7.A0N
            r3 = 8
            if (r5 == r3) goto L_0x0211
            java.lang.Integer[] r3 = r7.A0q
            r3 = r3[r42]
            if (r3 != r4) goto L_0x0211
            X.1sC[] r5 = r7.A0n
            int r3 = r19 + 1
            r3 = r5[r3]
            X.1sH r8 = r3.A02
            r3 = r5[r19]
            X.1sH r5 = r3.A02
            r3 = 5
            r6 = 0
            r2.A0E(r8, r5, r6, r3)
        L_0x01e3:
            X.1sC[] r3 = r7.A0n
            r3 = r3[r19]
            X.1sH r5 = r3.A02
            r3 = r39
            X.1sC[] r3 = r3.A0n
            r3 = r3[r19]
            X.1sH r8 = r3.A02
            r3 = 8
            r2.A0E(r5, r8, r6, r3)
        L_0x01f6:
            X.1sC[] r3 = r7.A0n
            int r23 = r19 + 1
            r3 = r3[r23]
            X.1sC r3 = r3.A03
            if (r3 == 0) goto L_0x0221
            X.1s3 r5 = r3.A05
            X.1sC[] r3 = r5.A0n
            r3 = r3[r19]
            X.1sC r3 = r3.A03
            if (r3 == 0) goto L_0x0221
            X.1s3 r3 = r3.A05
            if (r3 != r7) goto L_0x0221
            r7 = r5
            goto L_0x0174
        L_0x0211:
            r6 = 0
            goto L_0x01e3
        L_0x0213:
            r3 = 8
            goto L_0x01b3
        L_0x0216:
            int r2 = r12.A0L
            goto L_0x0160
        L_0x021a:
            r2 = 0
            goto L_0x0139
        L_0x021d:
            r14.A0A = r3
            goto L_0x0131
        L_0x0221:
            r16 = 0
            if (r0 == 0) goto L_0x0267
            r3 = r36
            X.1sC[] r7 = r3.A0n
            r3 = r7[r23]
            X.1sC r3 = r3.A03
            if (r3 == 0) goto L_0x0267
            X.1sC[] r3 = r0.A0n
            r6 = r3[r23]
            java.lang.Integer[] r3 = r0.A0q
            r3 = r3[r42]
            if (r3 != r4) goto L_0x036e
            int[] r3 = r0.A0l
            r3 = r3[r42]
            if (r3 != 0) goto L_0x036e
            if (r24 != 0) goto L_0x0370
            X.1sC r4 = r6.A03
            X.1s3 r5 = r4.A05
            r3 = r39
            if (r5 != r3) goto L_0x0256
            X.1sH r8 = r6.A02
            X.1sH r5 = r4.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 5
        L_0x0253:
            r2.A0D(r8, r5, r4, r3)
        L_0x0256:
            X.1sH r5 = r6.A02
            r3 = r7[r23]
            X.1sC r3 = r3.A03
            X.1sH r7 = r3.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 6
            r2.A0F(r5, r7, r4, r3)
        L_0x0267:
            if (r15 == 0) goto L_0x0282
            r3 = r39
            X.1sC[] r3 = r3.A0n
            r3 = r3[r23]
            X.1sH r6 = r3.A02
            r3 = r36
            X.1sC[] r3 = r3.A0n
            r3 = r3[r23]
            X.1sH r5 = r3.A02
            int r4 = r3.A00()
            r3 = 8
            r2.A0E(r6, r5, r4, r3)
        L_0x0282:
            java.util.ArrayList r3 = r14.A0E
            r22 = r3
            if (r3 == 0) goto L_0x0384
            int r21 = r22.size()
            r4 = 1
            r3 = r21
            if (r3 <= r4) goto L_0x0384
            boolean r3 = r14.A0I
            if (r3 == 0) goto L_0x029c
            boolean r3 = r14.A0G
            if (r3 != 0) goto L_0x029c
            int r3 = r14.A06
            float r13 = (float) r3
        L_0x029c:
            r3 = 0
            r5 = r16
            r11 = 0
            r10 = 0
        L_0x02a1:
            r4 = r22
            java.lang.Object r9 = r4.get(r11)
            X.1s3 r9 = (X.C38871s3) r9
            float[] r4 = r9.A0j
            r17 = r4[r42]
            int r4 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x02cc
            boolean r4 = r14.A0G
            if (r4 == 0) goto L_0x02e1
            X.1sC[] r4 = r9.A0n
            r3 = r4[r23]
            X.1sH r7 = r3.A02
            r3 = r4[r19]
            X.1sH r6 = r3.A02
            r4 = 0
            r3 = 4
            r2.A0D(r7, r6, r4, r3)
        L_0x02c4:
            int r11 = r11 + 1
            r3 = 0
            r4 = r21
            if (r11 >= r4) goto L_0x0384
            goto L_0x02a1
        L_0x02cc:
            int r4 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x02e3
            X.1sC[] r4 = r9.A0n
            r3 = r4[r23]
            X.1sH r7 = r3.A02
            r3 = r4[r19]
            X.1sH r6 = r3.A02
            r4 = 8
            r3 = 0
            r2.A0D(r7, r6, r3, r4)
            goto L_0x02c4
        L_0x02e1:
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x02e3:
            if (r5 == 0) goto L_0x0324
            X.1sC[] r5 = r5.A0n
            r4 = r5[r19]
            X.1sH r4 = r4.A02
            r28 = r4
            r4 = r5[r23]
            X.1sH r4 = r4.A02
            r27 = r4
            X.1sC[] r5 = r9.A0n
            r4 = r5[r19]
            X.1sH r15 = r4.A02
            r4 = r5[r23]
            X.1sH r8 = r4.A02
            X.1sJ r7 = r2.A06()
            r7.A00 = r3
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0355
            int r4 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0355
            int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0328
            X.1sO r4 = r7.A01
            r3 = r28
            r4.CCz(r3, r5)
            X.1sO r4 = r7.A01
            r3 = r27
            r4.CCz(r3, r6)
        L_0x0321:
            r2.A0B(r7)
        L_0x0324:
            r5 = r9
            r10 = r17
            goto L_0x02c4
        L_0x0328:
            int r3 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0337
            X.1sO r3 = r7.A01
            r3.CCz(r15, r5)
            X.1sO r3 = r7.A01
            r3.CCz(r8, r6)
            goto L_0x0321
        L_0x0337:
            float r10 = r10 / r13
            float r3 = r17 / r13
            float r10 = r10 / r3
            X.1sO r3 = r7.A01
            r4 = r28
            r3.CCz(r4, r5)
            X.1sO r4 = r7.A01
            r3 = r27
            r4.CCz(r3, r6)
            X.1sO r3 = r7.A01
            r3.CCz(r8, r10)
            X.1sO r4 = r7.A01
            float r3 = -r10
            r4.CCz(r15, r3)
            goto L_0x0321
        L_0x0355:
            X.1sO r4 = r7.A01
            r3 = r28
            r4.CCz(r3, r5)
            X.1sO r4 = r7.A01
            r3 = r27
            r4.CCz(r3, r6)
            X.1sO r3 = r7.A01
            r3.CCz(r8, r5)
            X.1sO r3 = r7.A01
            r3.CCz(r15, r6)
            goto L_0x0321
        L_0x036e:
            if (r24 == 0) goto L_0x0256
        L_0x0370:
            X.1sC r5 = r6.A03
            X.1s3 r4 = r5.A05
            r3 = r39
            if (r4 != r3) goto L_0x0256
            X.1sH r8 = r6.A02
            X.1sH r5 = r5.A02
            int r3 = r6.A00()
            int r4 = -r3
            r3 = 4
            goto L_0x0253
        L_0x0384:
            if (r1 == 0) goto L_0x0422
            if (r1 == r0) goto L_0x038a
            if (r24 == 0) goto L_0x0422
        L_0x038a:
            r3 = r37
            X.1sC[] r3 = r3.A0n
            r5 = r3[r19]
            r3 = r36
            X.1sC[] r3 = r3.A0n
            r4 = r3[r23]
            X.1sC r3 = r5.A03
            if (r3 == 0) goto L_0x041e
            X.1sH r5 = r3.A02
        L_0x039c:
            X.1sC r3 = r4.A03
            if (r3 == 0) goto L_0x041b
            X.1sH r6 = r3.A02
        L_0x03a2:
            X.1sC[] r3 = r1.A0n
            r4 = r3[r19]
            X.1sC[] r3 = r0.A0n
            r3 = r3[r23]
            if (r5 == 0) goto L_0x03c3
            if (r6 == 0) goto L_0x03c3
            if (r42 != 0) goto L_0x0418
            float r8 = r12.A02
        L_0x03b2:
            int r9 = r4.A00()
            int r10 = r3.A00()
            X.1sH r4 = r4.A02
            X.1sH r7 = r3.A02
            r11 = 7
            r3 = r2
            r3.A0G(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x03c3:
            if (r26 != 0) goto L_0x03c7
            if (r25 == 0) goto L_0x040b
        L_0x03c7:
            if (r1 == 0) goto L_0x040b
        L_0x03c9:
            if (r1 == r0) goto L_0x040b
            X.1sC[] r1 = r1.A0n
            r6 = r1[r19]
            X.1sC[] r1 = r0.A0n
            r5 = r1[r23]
            X.1sC r1 = r6.A03
            if (r1 == 0) goto L_0x0415
            X.1sH r3 = r1.A02
        L_0x03d9:
            X.1sC r1 = r5.A03
            if (r1 == 0) goto L_0x0412
            X.1sH r4 = r1.A02
        L_0x03df:
            r1 = r36
            if (r1 == r0) goto L_0x040f
            X.1sC[] r0 = r1.A0n
            r0 = r0[r23]
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x03ef
            X.1sH r0 = r0.A02
            r16 = r0
        L_0x03ef:
            if (r3 == 0) goto L_0x040b
            if (r16 == 0) goto L_0x040b
            int r10 = r6.A00()
            int r11 = r5.A00()
            X.1sH r1 = r6.A02
            X.1sH r0 = r5.A02
            r12 = 5
            r9 = 1056964608(0x3f000000, float:0.5)
            r4 = r2
            r5 = r1
            r6 = r3
            r7 = r16
            r8 = r0
            r4.A0G(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x040b:
            int r18 = r18 + 1
            goto L_0x0014
        L_0x040f:
            r16 = r4
            goto L_0x03ef
        L_0x0412:
            r4 = r16
            goto L_0x03df
        L_0x0415:
            r3 = r16
            goto L_0x03d9
        L_0x0418:
            float r8 = r12.A06
            goto L_0x03b2
        L_0x041b:
            r6 = r16
            goto L_0x03a2
        L_0x041e:
            r5 = r16
            goto L_0x039c
        L_0x0422:
            if (r26 == 0) goto L_0x04f4
            if (r1 == 0) goto L_0x04f4
            int r4 = r14.A06
            if (r4 <= 0) goto L_0x042f
            int r3 = r14.A05
            r12 = 1
            if (r3 == r4) goto L_0x0430
        L_0x042f:
            r12 = 0
        L_0x0430:
            r7 = r1
            r6 = r1
        L_0x0432:
            X.1s3[] r3 = r7.A0p
            r4 = r3[r42]
        L_0x0436:
            if (r4 == 0) goto L_0x0443
            int r5 = r4.A0N
            r3 = 8
            if (r5 != r3) goto L_0x0445
            X.1s3[] r3 = r4.A0p
            r4 = r3[r42]
            goto L_0x0436
        L_0x0443:
            if (r7 != r0) goto L_0x04b6
        L_0x0445:
            X.1sC[] r3 = r7.A0n
            r9 = r3[r19]
            X.1sH r5 = r9.A02
            X.1sC r3 = r9.A03
            if (r3 == 0) goto L_0x04f0
            X.1sC r3 = r9.A03
            X.1sH r8 = r3.A02
        L_0x0453:
            if (r6 == r7) goto L_0x04da
            X.1sC[] r3 = r6.A0n
            r3 = r3[r23]
            X.1sH r8 = r3.A02
        L_0x045b:
            int r30 = r9.A00()
            X.1sC[] r3 = r7.A0n
            r3 = r3[r23]
            int r31 = r3.A00()
            if (r4 == 0) goto L_0x04c2
            X.1sC[] r3 = r4.A0n
            r11 = r3[r19]
            X.1sH r9 = r11.A02
            X.1sC[] r3 = r7.A0n
            r3 = r3[r23]
            X.1sH r10 = r3.A02
        L_0x0475:
            int r3 = r11.A00()
            int r31 = r31 + r3
        L_0x047b:
            X.1sC[] r3 = r6.A0n
            r3 = r3[r23]
            int r3 = r3.A00()
            int r30 = r30 + r3
            if (r5 == 0) goto L_0x04b6
            if (r8 == 0) goto L_0x04b6
            if (r9 == 0) goto L_0x04b6
            if (r10 == 0) goto L_0x04b6
            if (r7 != r1) goto L_0x0497
            X.1sC[] r3 = r1.A0n
            r3 = r3[r19]
            int r30 = r3.A00()
        L_0x0497:
            if (r7 != r0) goto L_0x04a1
            X.1sC[] r3 = r0.A0n
            r3 = r3[r23]
            int r31 = r3.A00()
        L_0x04a1:
            r32 = 5
            if (r12 == 0) goto L_0x04a7
            r32 = 8
        L_0x04a7:
            r29 = 1056964608(0x3f000000, float:0.5)
            r24 = r2
            r25 = r5
            r26 = r8
            r27 = r9
            r28 = r10
            r24.A0G(r25, r26, r27, r28, r29, r30, r31, r32)
        L_0x04b6:
            int r5 = r7.A0N
            r3 = 8
            if (r5 == r3) goto L_0x04bd
            r6 = r7
        L_0x04bd:
            r7 = r4
            if (r4 == 0) goto L_0x03c9
            goto L_0x0432
        L_0x04c2:
            r3 = r36
            X.1sC[] r3 = r3.A0n
            r3 = r3[r23]
            X.1sC r11 = r3.A03
            if (r11 == 0) goto L_0x04d7
            X.1sH r9 = r11.A02
        L_0x04ce:
            X.1sC[] r3 = r7.A0n
            r3 = r3[r23]
            X.1sH r10 = r3.A02
            if (r11 == 0) goto L_0x047b
            goto L_0x0475
        L_0x04d7:
            r9 = r16
            goto L_0x04ce
        L_0x04da:
            if (r7 != r1) goto L_0x045b
            if (r6 != r7) goto L_0x045b
            r3 = r37
            X.1sC[] r3 = r3.A0n
            r3 = r3[r19]
            X.1sC r3 = r3.A03
            if (r3 == 0) goto L_0x04ec
            X.1sH r8 = r3.A02
            goto L_0x045b
        L_0x04ec:
            r8 = r16
            goto L_0x045b
        L_0x04f0:
            r8 = r16
            goto L_0x0453
        L_0x04f4:
            r7 = 8
            if (r25 == 0) goto L_0x03c3
            if (r1 == 0) goto L_0x03c3
            int r4 = r14.A06
            if (r4 <= 0) goto L_0x0503
            int r3 = r14.A05
            r13 = 1
            if (r3 == r4) goto L_0x0504
        L_0x0503:
            r13 = 0
        L_0x0504:
            r8 = r1
            r6 = r1
        L_0x0506:
            X.1s3[] r3 = r8.A0p
            r5 = r3[r42]
        L_0x050a:
            if (r5 == 0) goto L_0x0515
            int r3 = r5.A0N
            if (r3 != r7) goto L_0x0515
            X.1s3[] r3 = r5.A0p
            r5 = r3[r42]
            goto L_0x050a
        L_0x0515:
            if (r8 == r1) goto L_0x0570
            if (r8 == r0) goto L_0x0570
            if (r5 == 0) goto L_0x0570
            if (r5 != r0) goto L_0x051f
            r5 = r16
        L_0x051f:
            X.1sC[] r11 = r8.A0n
            r10 = r11[r19]
            X.1sH r9 = r10.A02
            X.1sC[] r3 = r6.A0n
            r3 = r3[r23]
            X.1sH r4 = r3.A02
            int r33 = r10.A00()
            r12 = r11[r23]
            int r34 = r12.A00()
            if (r5 == 0) goto L_0x05db
            X.1sC[] r3 = r5.A0n
            r11 = r3[r19]
            X.1sH r10 = r11.A02
            X.1sC r3 = r11.A03
            if (r3 == 0) goto L_0x05d7
            X.1sH r3 = r3.A02
        L_0x0543:
            int r11 = r11.A00()
            int r34 = r34 + r11
        L_0x0549:
            X.1sC[] r11 = r6.A0n
            r11 = r11[r23]
            int r11 = r11.A00()
            int r33 = r33 + r11
            r35 = 4
            if (r13 == 0) goto L_0x0559
            r35 = 8
        L_0x0559:
            if (r9 == 0) goto L_0x0570
            if (r4 == 0) goto L_0x0570
            if (r10 == 0) goto L_0x0570
            if (r3 == 0) goto L_0x0570
            r32 = 1056964608(0x3f000000, float:0.5)
            r27 = r2
            r28 = r9
            r29 = r4
            r30 = r10
            r31 = r3
            r27.A0G(r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0570:
            int r3 = r8.A0N
            if (r3 != r7) goto L_0x0575
            r8 = r6
        L_0x0575:
            r6 = r8
            r8 = r5
            if (r5 != 0) goto L_0x0506
            X.1sC[] r3 = r1.A0n
            r10 = r3[r19]
            r3 = r37
            X.1sC[] r3 = r3.A0n
            r3 = r3[r19]
            X.1sC r4 = r3.A03
            X.1sC[] r3 = r0.A0n
            r8 = r3[r23]
            r3 = r36
            X.1sC[] r3 = r3.A0n
            r3 = r3[r23]
            X.1sC r9 = r3.A03
            r7 = 5
            if (r4 == 0) goto L_0x05a1
            if (r1 == r0) goto L_0x05b3
            X.1sH r5 = r10.A02
            X.1sH r4 = r4.A02
            int r3 = r10.A00()
            r2.A0D(r5, r4, r3, r7)
        L_0x05a1:
            if (r9 == 0) goto L_0x03c3
        L_0x05a3:
            if (r1 == r0) goto L_0x03c3
            X.1sH r5 = r8.A02
            X.1sH r4 = r9.A02
            int r3 = r8.A00()
            int r3 = -r3
            r2.A0D(r5, r4, r3, r7)
            goto L_0x03c3
        L_0x05b3:
            if (r9 == 0) goto L_0x03c3
            X.1sH r6 = r10.A02
            X.1sH r5 = r4.A02
            int r33 = r10.A00()
            X.1sH r4 = r8.A02
            X.1sH r3 = r9.A02
            int r34 = r8.A00()
            r32 = 1056964608(0x3f000000, float:0.5)
            r27 = r2
            r28 = r6
            r29 = r5
            r30 = r4
            r31 = r3
            r35 = r7
            r27.A0G(r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x05a3
        L_0x05d7:
            r3 = r16
            goto L_0x0543
        L_0x05db:
            X.1sC[] r3 = r0.A0n
            r11 = r3[r19]
            if (r11 == 0) goto L_0x05e9
            X.1sH r10 = r11.A02
        L_0x05e3:
            X.1sH r3 = r12.A02
            if (r11 == 0) goto L_0x0549
            goto L_0x0543
        L_0x05e9:
            r10 = r16
            goto L_0x05e3
        L_0x05ec:
            int r0 = r0.A04
            r38 = r0
            r0 = r39
            X.1sT[] r0 = r0.A0C
            r20 = r0
            r19 = 2
            goto L_0x0014
        L_0x05fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38891s5.A00(X.1sG, X.1s5, int):void");
    }

    public void A07() {
        this.A0D.A0A();
        this.A02 = 0;
        this.A03 = 0;
        super.A07();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009e, code lost:
        if (r14 == 0) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010d A[EDGE_INSN: B:74:0x010d->B:60:0x010d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(int r14, boolean r15) {
        /*
            r13 = this;
            X.1sF r7 = r13.A07
            r2 = 1
            r12 = r15 & 1
            X.1s5 r5 = r7.A00
            r6 = 0
            java.lang.Integer[] r0 = r5.A0q
            r4 = r0[r6]
            r3 = r0[r2]
            int r11 = r5.A04()
            int r10 = r5.A05()
            if (r12 == 0) goto L_0x009e
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            if (r4 == r9) goto L_0x001e
            if (r3 != r9) goto L_0x009e
        L_0x001e:
            java.util.ArrayList r0 = r7.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x0024:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r8.next()
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            int r0 = r1.A01
            if (r0 != r14) goto L_0x0024
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x0024
            r12 = 0
        L_0x003b:
            if (r14 != 0) goto L_0x00a1
            if (r12 == 0) goto L_0x0059
            if (r4 != r9) goto L_0x0059
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Integer[] r0 = r5.A0q
            r0[r6] = r1
            int r0 = X.C38951sF.A00(r5, r7, r6)
            r5.A0A(r0)
            X.1s8 r0 = r5.A0c
            X.1sA r1 = r0.A05
            int r0 = r5.A03()
            r1.A01(r0)
        L_0x0059:
            java.lang.Integer[] r0 = r5.A0q
            r1 = r0[r6]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0065
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x00d9
        L_0x0065:
            int r6 = r5.A03()
            int r6 = r6 + r11
            X.1s8 r1 = r5.A0c
            X.1s9 r0 = r1.A03
            r0.A01(r6)
            X.1sA r0 = r1.A05
            int r6 = r6 - r11
        L_0x0074:
            r0.A01(r6)
            r8 = 1
        L_0x0078:
            r7.A06()
            java.util.ArrayList r7 = r7.A05
            java.util.Iterator r6 = r7.iterator()
        L_0x0081:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00db
            java.lang.Object r1 = r6.next()
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            int r0 = r1.A01
            if (r0 != r14) goto L_0x0081
            X.1s3 r0 = r1.A02
            if (r0 != r5) goto L_0x009a
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x009a
            goto L_0x0081
        L_0x009a:
            r1.A06()
            goto L_0x0081
        L_0x009e:
            if (r14 != 0) goto L_0x00bd
            goto L_0x0059
        L_0x00a1:
            if (r12 == 0) goto L_0x00bd
            if (r3 != r9) goto L_0x00bd
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Integer[] r0 = r5.A0q
            r0[r2] = r1
            int r0 = X.C38951sF.A00(r5, r7, r2)
            r5.A09(r0)
            X.1sB r0 = r5.A0d
            X.1sA r1 = r0.A05
            int r0 = r5.A02()
            r1.A01(r0)
        L_0x00bd:
            java.lang.Integer[] r0 = r5.A0q
            r1 = r0[r2]
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x00c9
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x00d9
        L_0x00c9:
            int r6 = r5.A02()
            int r6 = r6 + r10
            X.1sB r1 = r5.A0d
            X.1s9 r0 = r1.A03
            r0.A01(r6)
            X.1sA r0 = r1.A05
            int r6 = r6 - r10
            goto L_0x0074
        L_0x00d9:
            r8 = 0
            goto L_0x0078
        L_0x00db:
            java.util.Iterator r6 = r7.iterator()
        L_0x00df:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x010d
            java.lang.Object r1 = r6.next()
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            int r0 = r1.A01
            if (r0 != r14) goto L_0x00df
            if (r8 != 0) goto L_0x00f6
            X.1s3 r0 = r1.A02
            if (r0 != r5) goto L_0x00f6
            goto L_0x00df
        L_0x00f6:
            X.1s9 r0 = r1.A04
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x010c
            X.1s9 r0 = r1.A03
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x010c
            boolean r0 = r1 instanceof X.AnonymousClass27R
            if (r0 != 0) goto L_0x00df
            X.1sA r0 = r1.A05
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00df
        L_0x010c:
            r2 = 0
        L_0x010d:
            java.lang.Integer[] r1 = r5.A0q
            r0 = 0
            r1[r0] = r4
            r0 = 1
            r1[r0] = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38891s5.A0K(int, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1sF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.1sE, java.lang.Object] */
    public C38891s5() {
        ? obj = new Object();
        obj.A07 = true;
        obj.A08 = true;
        obj.A05 = new ArrayList();
        obj.A06 = new ArrayList();
        obj.A03 = null;
        obj.A02 = new Object();
        obj.A04 = new ArrayList();
        obj.A00 = this;
        obj.A01 = this;
        this.A07 = obj;
        this.A05 = null;
        this.A09 = false;
        this.A0D = new C38961sG();
        this.A00 = 0;
        this.A04 = 0;
        this.A0C = new C39091sT[4];
        this.A0B = new C39091sT[4];
        this.A01 = 263;
        this.A0A = false;
        this.A08 = false;
    }

    public void A0F(boolean z, boolean z2) {
        super.A0F(z, z2);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((C38871s3) this.A00.get(i)).A0F(z, z2);
        }
    }
}
