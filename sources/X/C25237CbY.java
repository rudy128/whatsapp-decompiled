package X;

import android.util.Log;
import com.facebook.android.exoplayer2.util.Util;

/* renamed from: X.CbY  reason: case insensitive filesystem */
public final class C25237CbY {
    public long A00;
    public C25237CbY A01;
    public CTA A02;
    public C26539D3a A03;
    public CSJ A04;
    public CSJ A05;
    public boolean A06;
    public boolean A07;
    public final C28649ECi A08;
    public final Object A09;
    public final E7M[] A0A;
    public final E90[] A0B;
    public final boolean[] A0C;
    public final E9e A0D;
    public final C5B A0E;

    public long A00(boolean[] zArr, long j, boolean z) {
        CSJ csj;
        CSJ csj2;
        int i = 0;
        while (true) {
            csj = this.A05;
            boolean z2 = true;
            if (i >= csj.A00) {
                break;
            }
            boolean[] zArr2 = this.A0C;
            if (z || (csj2 = this.A04) == null || !Util.A0D(csj.A03[i], csj2.A03[i]) || !Util.A0D(csj.A04[i], csj2.A04[i])) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        E90[] e90Arr = this.A0B;
        this.A04 = csj;
        C28650ECj[] eCjArr = csj.A04;
        long CHG = this.A08.CHG(e90Arr, eCjArr, this.A0C, zArr, j);
        this.A06 = false;
        for (int i2 = 0; i2 < e90Arr.length; i2++) {
            if (e90Arr[i2] != null) {
                C26056CrS.A03(AnonymousClass000.A1W(this.A05.A03[i2]));
                this.A06 = true;
            } else {
                C26056CrS.A03(AnonymousClass000.A1X(eCjArr[i2]));
            }
        }
        return CHG;
    }

    public void A01() {
        this.A04 = null;
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0D.CEL(((D9K) this.A08).A04);
            } else {
                this.A0D.CEL(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int[][][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v125, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v175, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v198, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v249, resolved type: int[][]} */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0274, code lost:
        if (r9 == -1) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0280, code lost:
        if (r9 == -1) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0288, code lost:
        if (r8 == -1) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x028d, code lost:
        if (r8 == -1) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x028f, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x06fb, code lost:
        r7 = r8.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01aa, code lost:
        if (r15 != r17) goto L_0x01ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0260 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r34 = this;
            r33 = r34
            r0 = r33
            X.C5B r0 = r0.A0E
            r22 = r0
            r0 = r33
            X.E7M[] r12 = r0.A0A
            X.D3a r13 = r0.A03
            r21 = 0
            r0 = r22
            X.BPD r0 = (X.BPD) r0
            r22 = r0
            int r14 = r12.length
            int r3 = r14 + 1
            int[] r11 = new int[r3]
            X.D3X[][] r10 = new X.D3X[r3][]
            int[][][] r6 = new int[r3][][]
            r9 = 0
            r2 = 0
        L_0x0021:
            if (r2 >= r3) goto L_0x0030
            int r1 = r13.A01
            X.D3X[] r0 = new X.D3X[r1]
            r10[r2] = r0
            int[][] r0 = new int[r1][]
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0030:
            int[] r8 = new int[r14]
            r1 = 0
        L_0x0033:
            if (r1 >= r14) goto L_0x0044
            r0 = r12[r1]
            boolean r0 = r0 instanceof X.C22775BOo
            if (r0 == 0) goto L_0x0042
            r0 = 8
        L_0x003d:
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0042:
            r0 = 0
            goto L_0x003d
        L_0x0044:
            r7 = 0
        L_0x0045:
            int r0 = r13.A01
            if (r7 >= r0) goto L_0x00a8
            X.D3X r5 = X.BE8.A0L(r13, r7)
            int r1 = r5.A01
            r0 = 5
            boolean r16 = X.AnonymousClass000.A1T(r1, r0)
            r4 = r14
            r3 = 0
            r2 = 0
            r15 = 1
        L_0x0058:
            if (r3 >= r14) goto L_0x0080
            r1 = r12[r3]
            X.D48[] r0 = r5.A02
            r0 = r0[r9]
            int r0 = r1.COo(r0)
            r0 = r0 & 7
            int r0 = java.lang.Math.max(r9, r0)
            r1 = r11[r3]
            boolean r1 = X.AnonymousClass000.A1P(r1)
            if (r0 > r2) goto L_0x007a
            if (r0 != r2) goto L_0x007d
            if (r16 == 0) goto L_0x007d
            if (r15 != 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
        L_0x007a:
            r4 = r3
            r15 = r1
            r2 = r0
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0080:
            if (r4 != r14) goto L_0x0097
            int[] r2 = X.BE6.A1X()
        L_0x0086:
            r1 = r11[r4]
            r0 = r10[r4]
            r0[r1] = r5
            r0 = r6[r4]
            r0[r1] = r2
            int r0 = r1 + 1
            r11[r4] = r0
            int r7 = r7 + 1
            goto L_0x0045
        L_0x0097:
            r1 = r12[r4]
            int[] r2 = X.BE6.A1X()
            X.D48[] r0 = r5.A02
            r0 = r0[r9]
            int r0 = r1.COo(r0)
            r2[r9] = r0
            goto L_0x0086
        L_0x00a8:
            X.D3a[] r5 = new X.C26539D3a[r14]
            java.lang.String[] r4 = new java.lang.String[r14]
            int[] r2 = new int[r14]
        L_0x00ae:
            if (r9 >= r14) goto L_0x00ec
            r3 = r11[r9]
            r1 = r10[r9]
            int r0 = r1.length
            boolean r0 = X.BE8.A1U(r3, r0)
            X.C26056CrS.A02(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            X.D3X[] r1 = (X.D3X[]) r1
            X.D3a r0 = new X.D3a
            r0.<init>(r1)
            r5[r9] = r0
            r1 = r6[r9]
            int r0 = r1.length
            boolean r0 = X.BE8.A1U(r3, r0)
            X.C26056CrS.A02(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            r6[r9] = r0
            r0 = r12[r9]
            java.lang.String r0 = r0.getName()
            r4[r9] = r0
            r0 = r12[r9]
            X.D8i r0 = (X.C26659D8i) r0
            int r0 = r0.A0B
            r2[r9] = r0
            int r9 = r9 + 1
            goto L_0x00ae
        L_0x00ec:
            r3 = r11[r14]
            r1 = r10[r14]
            int r0 = r1.length
            boolean r0 = X.BE8.A1U(r3, r0)
            X.C26056CrS.A02(r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            X.D3X[] r1 = (X.D3X[]) r1
            X.D3a r0 = new X.D3a
            r0.<init>(r1)
            X.CXB r3 = new X.CXB
            r9 = r3
            r10 = r0
            r11 = r2
            r12 = r8
            r13 = r5
            r14 = r4
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = r22
            java.util.concurrent.atomic.AtomicReference r0 = r0.A02
            java.lang.Object r5 = r0.get()
            X.BPC r5 = (X.BPC) r5
            int r4 = r3.A00
            X.ECj[] r2 = new X.C28650ECj[r4]
            r7 = 0
            r12 = 0
            r29 = 0
        L_0x0121:
            r8 = 2
            r1 = 1
            if (r12 >= r4) goto L_0x02d7
            int[] r0 = r3.A03
            r0 = r0[r12]
            if (r8 != r0) goto L_0x02c7
            if (r7 != 0) goto L_0x02bc
            X.D3a[] r0 = r3.A04
            r31 = r0[r12]
            r30 = r6[r12]
            r0 = r22
            X.C5g r7 = r0.A01
            boolean r0 = r5.A0N
            r28 = r0
            if (r0 != 0) goto L_0x0150
            if (r7 == 0) goto L_0x0150
            r7 = 0
        L_0x0140:
            r0 = r31
            int r0 = r0.A01
            if (r7 >= r0) goto L_0x0150
            r0 = r31
            X.1IX r0 = r0.A02
            r0.get(r7)
            int r7 = r7 + 1
            goto L_0x0140
        L_0x0150:
            r11 = -1
            r10 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r9 = -1
            r8 = -1
        L_0x015a:
            r0 = r31
            int r0 = r0.A01
            if (r10 >= r0) goto L_0x02b3
            r0 = r31
            X.D3X r24 = X.BE8.A0L(r0, r10)
            int r7 = r5.A0F
            int r0 = r5.A0E
            r32 = r0
            boolean r15 = r5.A0P
            java.util.ArrayList r23 = X.C17880vN.A0z(r1)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r26)
            r13 = r20
            r0 = r23
            r0.add(r13)
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r13) goto L_0x0209
            r0 = r32
            if (r0 == r13) goto L_0x0209
            r0 = r24
            X.D48[] r0 = r0.A02
            r19 = r0
            r18 = r0[r26]
            r0 = r18
            int r14 = r0.A0I
            if (r14 <= 0) goto L_0x0209
            int r13 = r0.A09
            if (r13 <= 0) goto L_0x0209
            r16 = r32
            if (r15 == 0) goto L_0x0204
            r17 = 1
            boolean r15 = X.C108975cc.A1D(r14, r13)
            r0 = r32
            if (r7 > r0) goto L_0x01a8
            r17 = 0
        L_0x01a8:
            r0 = r17
            if (r15 == r0) goto L_0x0204
        L_0x01ac:
            int r0 = r14 * r7
            int r15 = r13 * r16
            if (r0 < r15) goto L_0x01fe
            int r15 = r15 + r14
            int r7 = r15 + -1
            int r7 = r7 / r14
        L_0x01b6:
            android.graphics.Point r15 = new android.graphics.Point
            r0 = r16
            r15.<init>(r0, r7)
            int r7 = r14 * r13
            int r0 = r15.x
            float r0 = (float) r0
            r16 = 1065017672(0x3f7ae148, float:0.98)
            float r0 = r0 * r16
            int r0 = (int) r0
            if (r14 < r0) goto L_0x0209
            r0 = r18
            int r0 = r0.A09
            int r13 = r15.y
            float r13 = (float) r13
            float r13 = r13 * r16
            int r13 = (int) r13
            if (r0 < r13) goto L_0x0209
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r7 >= r0) goto L_0x0209
            int r13 = r23.size()
        L_0x01df:
            int r13 = r13 + -1
            if (r13 < 0) goto L_0x0209
            r0 = r23
            int r0 = X.BE9.A0I(r0, r13)
            r0 = r19[r0]
            int r14 = r0.A0I
            if (r14 == r11) goto L_0x01f8
            int r0 = r0.A09
            if (r0 == r11) goto L_0x01f8
            int r14 = r14 * r0
            if (r14 == r11) goto L_0x01f8
            if (r14 <= r7) goto L_0x01df
        L_0x01f8:
            r0 = r23
            r0.remove(r13)
            goto L_0x01df
        L_0x01fe:
            int r0 = r0 + r13
            int r16 = r0 + -1
            int r16 = r16 / r13
            goto L_0x01b6
        L_0x0204:
            r16 = r7
            r7 = r32
            goto L_0x01ac
        L_0x0209:
            r16 = r30[r10]
            r7 = r16[r26]
            boolean r0 = r5.A07
            r7 = r7 & 7
            r14 = 4
            if (r7 == r14) goto L_0x0219
            if (r0 == 0) goto L_0x0260
            r0 = 3
            if (r7 != r0) goto L_0x0260
        L_0x0219:
            r0 = r24
            X.D48[] r0 = r0.A02
            r13 = r0[r26]
            r7 = r20
            r0 = r23
            boolean r0 = r0.contains(r7)
            r15 = 1
            if (r0 == 0) goto L_0x02ab
            int r7 = r13.A0I
            if (r7 == r11) goto L_0x0232
            int r0 = r5.A06
            if (r7 > r0) goto L_0x02ab
        L_0x0232:
            int r7 = r13.A09
            if (r7 == r11) goto L_0x023a
            int r0 = r5.A05
            if (r7 > r0) goto L_0x02ab
        L_0x023a:
            int r7 = r13.A04
            if (r7 == r11) goto L_0x0242
            int r0 = r5.A03
            if (r7 > r0) goto L_0x02ab
        L_0x0242:
            r17 = 1
            r7 = 2
        L_0x0245:
            r0 = r16[r26]
            r0 = r0 & 7
            r16 = 0
            if (r0 != r14) goto L_0x0251
            r16 = 1
            int r7 = r7 + 1000
        L_0x0251:
            r0 = r25
            if (r7 > r0) goto L_0x0256
            r15 = 0
        L_0x0256:
            if (r7 != r0) goto L_0x0297
            if (r28 == 0) goto L_0x0264
            int r15 = r13.A04
            if (r15 != r11) goto L_0x0291
            if (r8 != r11) goto L_0x0299
        L_0x0260:
            int r10 = r10 + 1
            goto L_0x015a
        L_0x0264:
            int r15 = r13.A0I
            r14 = -1
            if (r15 == r11) goto L_0x026f
            int r0 = r13.A09
            if (r0 == r11) goto L_0x026f
            int r14 = r15 * r0
        L_0x026f:
            if (r14 == r9) goto L_0x0283
            r15 = -1
            if (r14 != r11) goto L_0x027e
            if (r9 != r11) goto L_0x0277
        L_0x0276:
            r15 = 0
        L_0x0277:
            if (r16 == 0) goto L_0x0294
            if (r17 == 0) goto L_0x0294
            if (r15 <= 0) goto L_0x0260
            goto L_0x0299
        L_0x027e:
            int r15 = r14 - r9
            if (r9 != r11) goto L_0x0277
            goto L_0x028f
        L_0x0283:
            int r0 = r13.A04
            r15 = -1
            if (r0 != r11) goto L_0x028b
            if (r8 != r11) goto L_0x0277
            goto L_0x0276
        L_0x028b:
            int r15 = r0 - r8
            if (r8 != r11) goto L_0x0277
        L_0x028f:
            r15 = 1
            goto L_0x0277
        L_0x0291:
            if (r8 == r11) goto L_0x0260
            int r15 = r15 - r8
        L_0x0294:
            if (r15 >= 0) goto L_0x0260
            goto L_0x0299
        L_0x0297:
            if (r15 == 0) goto L_0x0260
        L_0x0299:
            int r8 = r13.A04
            int r0 = r13.A0I
            r9 = -1
            if (r0 == r11) goto L_0x02a6
            int r13 = r13.A09
            if (r13 == r11) goto L_0x02a6
            int r9 = r0 * r13
        L_0x02a6:
            r27 = r24
            r25 = r7
            goto L_0x0260
        L_0x02ab:
            r17 = 0
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0260
            r7 = 1
            goto L_0x0245
        L_0x02b3:
            if (r27 != 0) goto L_0x02cb
            r8 = 0
        L_0x02b6:
            r2[r12] = r8
            boolean r7 = X.AnonymousClass000.A1W(r8)
        L_0x02bc:
            X.D3a[] r0 = r3.A04
            r0 = r0[r12]
            int r0 = r0.A01
            if (r0 > 0) goto L_0x02c5
            r1 = 0
        L_0x02c5:
            r29 = r29 | r1
        L_0x02c7:
            int r12 = r12 + 1
            goto L_0x0121
        L_0x02cb:
            int[] r7 = new int[r1]
            r7[r26] = r26
            X.BP9 r8 = new X.BP9
            r0 = r27
            r8.<init>(r0, r7)
            goto L_0x02b6
        L_0x02d7:
            r24 = 0
            r9 = 0
            r23 = 0
        L_0x02dc:
            if (r9 >= r4) goto L_0x04db
            int[] r0 = r3.A03
            r7 = r0[r9]
            if (r7 == r1) goto L_0x03c3
            if (r7 == r8) goto L_0x04cd
            r0 = 3
            if (r7 == r0) goto L_0x033b
            X.D3a[] r0 = r3.A04
            r15 = r0[r9]
            r19 = r6[r9]
            r13 = 0
            r18 = r13
            r14 = 0
            r17 = 0
            r12 = 0
        L_0x02f6:
            int r0 = r15.A01
            if (r14 >= r0) goto L_0x032a
            X.D3X r11 = X.BE8.A0L(r15, r14)
            r16 = r19[r14]
            r7 = r16[r17]
            boolean r0 = r5.A07
            r7 = r7 & 7
            r10 = 4
            if (r7 == r10) goto L_0x030e
            if (r0 == 0) goto L_0x0327
            r0 = 3
            if (r7 != r0) goto L_0x0327
        L_0x030e:
            X.D48[] r0 = r11.A02
            r0 = r0[r17]
            int r0 = r0.A0G
            r7 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x031a
            r7 = 2
        L_0x031a:
            r0 = r16[r17]
            r0 = r0 & 7
            if (r0 != r10) goto L_0x0322
            int r7 = r7 + 1000
        L_0x0322:
            if (r7 <= r12) goto L_0x0327
            r18 = r11
            r12 = r7
        L_0x0327:
            int r14 = r14 + 1
            goto L_0x02f6
        L_0x032a:
            if (r18 == 0) goto L_0x0337
            int[] r7 = new int[r1]
            r7[r17] = r17
            X.BP9 r13 = new X.BP9
            r0 = r18
            r13.<init>(r0, r7)
        L_0x0337:
            r2[r9] = r13
            goto L_0x04cd
        L_0x033b:
            if (r23 != 0) goto L_0x04cd
            X.D3a[] r0 = r3.A04
            r14 = r0[r9]
            r20 = r6[r9]
            r13 = 0
            r12 = 0
            r23 = 0
            r11 = 0
        L_0x0348:
            int r0 = r14.A01
            if (r13 >= r0) goto L_0x04c4
            X.D3X r10 = X.BE8.A0L(r14, r13)
            r19 = r20[r13]
            r0 = r19[r23]
            boolean r15 = r5.A07
            r7 = r0 & 7
            r0 = 4
            if (r7 == r0) goto L_0x0360
            if (r15 == 0) goto L_0x03ab
            r0 = 3
            if (r7 != r0) goto L_0x03ab
        L_0x0360:
            X.D48[] r0 = r10.A02
            r15 = r0[r23]
            int r0 = r15.A0G
            int r7 = r5.A00
            r7 = r7 ^ -1
            r0 = r0 & r7
            r16 = r0 & 1
            r7 = 1
            boolean r18 = X.AnonymousClass000.A1O(r16)
            r0 = r0 & 2
            boolean r17 = X.AnonymousClass000.A1O(r0)
            java.util.List r0 = r5.A0K
            boolean r16 = X.BPD.A00(r15, r0)
            if (r16 != 0) goto L_0x0398
            boolean r0 = r5.A0O
            if (r0 == 0) goto L_0x03b3
            java.lang.String r0 = r15.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0398
            java.lang.String r0 = "und"
            X.1IX r0 = X.AnonymousClass1IX.of(r0)
            boolean r0 = X.BPD.A00(r15, r0)
            if (r0 == 0) goto L_0x03b3
        L_0x0398:
            if (r18 == 0) goto L_0x03ae
            r7 = 8
        L_0x039c:
            int r7 = r7 + r16
        L_0x039e:
            r0 = r19[r23]
            r15 = r0 & 7
            r0 = 4
            if (r15 != r0) goto L_0x03a7
            int r7 = r7 + 1000
        L_0x03a7:
            if (r7 <= r11) goto L_0x03ab
            r12 = r10
            r11 = r7
        L_0x03ab:
            int r13 = r13 + 1
            goto L_0x0348
        L_0x03ae:
            r7 = 4
            if (r17 != 0) goto L_0x039c
            r7 = 6
            goto L_0x039c
        L_0x03b3:
            if (r18 == 0) goto L_0x03b7
            r7 = 3
            goto L_0x039e
        L_0x03b7:
            if (r17 == 0) goto L_0x03ab
            java.util.List r0 = r5.A0I
            boolean r0 = X.BPD.A00(r15, r0)
            if (r0 == 0) goto L_0x039e
            r7 = 2
            goto L_0x039e
        L_0x03c3:
            if (r24 != 0) goto L_0x04cd
            X.D3a[] r0 = r3.A04
            r10 = r0[r9]
            r19 = r6[r9]
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x045e
            if (r29 == 0) goto L_0x045e
            r17 = 0
        L_0x03d3:
            r7 = 0
            r13 = 0
            r11 = -1
            r18 = -1
        L_0x03d8:
            int r0 = r10.A01
            if (r13 >= r0) goto L_0x0466
            X.D3X r14 = X.BE8.A0L(r10, r13)
            r0 = r19[r13]
            r16 = 0
            r0 = r0[r16]
            boolean r15 = r5.A07
            r12 = r0 & 7
            r0 = 4
            if (r12 == r0) goto L_0x03f2
            if (r15 == 0) goto L_0x0414
            r0 = 3
            if (r12 != r0) goto L_0x0414
        L_0x03f2:
            X.D48[] r0 = r14.A02
            r12 = r0[r16]
            r11 = 0
        L_0x03f7:
            java.util.List r14 = r5.A0I
            int r0 = r14.size()
            if (r11 >= r0) goto L_0x0411
            java.lang.String r15 = X.C17880vN.A0w(r14, r11)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0417
            java.lang.String r0 = r12.A0R
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0417
        L_0x0411:
            r11 = r13
            r18 = 0
        L_0x0414:
            int r13 = r13 + 1
            goto L_0x03d8
        L_0x0417:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x0425
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            if (r0 == 0) goto L_0x0426
        L_0x0425:
            r15 = 0
        L_0x0426:
            java.lang.String r14 = r12.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = "und"
            boolean r0 = android.text.TextUtils.equals(r14, r0)
            if (r0 != 0) goto L_0x045b
            if (r14 == 0) goto L_0x045b
            if (r15 == 0) goto L_0x045b
            boolean r0 = r14.startsWith(r15)
            if (r0 != 0) goto L_0x0411
            boolean r0 = r15.startsWith(r14)
            if (r0 != 0) goto L_0x0411
            java.lang.String r0 = "-"
            java.lang.String[] r14 = r14.split(r0, r8)
            r14 = r14[r16]
            java.lang.String[] r0 = r15.split(r0, r8)
            r0 = r0[r16]
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x045b
            goto L_0x0411
        L_0x045b:
            int r11 = r11 + 1
            goto L_0x03f7
        L_0x045e:
            r0 = r22
            X.C5g r0 = r0.A01
            r17 = r0
            goto L_0x03d3
        L_0x0466:
            r0 = -1
            if (r11 == r0) goto L_0x04bd
            X.D3X r10 = X.BE8.A0L(r10, r11)
            boolean r0 = r5.A0N
            if (r0 != 0) goto L_0x04b3
            if (r17 == 0) goto L_0x04b3
            r17 = r19[r11]
            boolean r12 = r5.A04
            java.util.HashSet r15 = X.C17880vN.A12()
            r16 = 0
            r14 = 0
            X.D48[] r13 = r10.A02
            r11 = r13[r16]
            int r7 = r11.A05
            int r0 = r11.A0F
            if (r12 != 0) goto L_0x048a
            java.lang.String r14 = r11.A0S
        L_0x048a:
            X.CYZ r12 = new X.CYZ
            r12.<init>(r7, r0, r14)
            boolean r0 = r15.add(r12)
            if (r0 == 0) goto L_0x04b3
            r11 = r13[r16]
            r0 = r17[r16]
            r7 = r0 & 7
            r0 = 4
            if (r7 != r0) goto L_0x04b3
            int r7 = r11.A05
            int r0 = r12.A00
            if (r7 != r0) goto L_0x04b3
            int r7 = r11.A0F
            int r0 = r12.A01
            if (r7 != r0) goto L_0x04b3
            java.lang.String r7 = r12.A02
            if (r7 == 0) goto L_0x04b3
            java.lang.String r0 = r11.A0S
            android.text.TextUtils.equals(r7, r0)
        L_0x04b3:
            r7 = 0
            int[] r0 = new int[r1]
            r0[r7] = r18
            X.BP9 r7 = new X.BP9
            r7.<init>(r10, r0)
        L_0x04bd:
            r2[r9] = r7
            boolean r24 = X.AnonymousClass000.A1W(r7)
            goto L_0x04cd
        L_0x04c4:
            if (r12 != 0) goto L_0x04d1
            r7 = 0
        L_0x04c7:
            r2[r9] = r7
            if (r7 == 0) goto L_0x04cd
            r23 = 1
        L_0x04cd:
            int r9 = r9 + 1
            goto L_0x02dc
        L_0x04d1:
            int[] r0 = new int[r1]
            r0[r23] = r23
            X.BP9 r7 = new X.BP9
            r7.<init>(r12, r0)
            goto L_0x04c7
        L_0x04db:
            r7 = 0
            r8 = 0
        L_0x04dd:
            if (r8 >= r4) goto L_0x056a
            android.util.SparseBooleanArray r0 = r5.A02
            boolean r0 = r0.get(r8)
            if (r0 != 0) goto L_0x0567
            X.D3a[] r0 = r3.A04
            r11 = r0[r8]
            android.util.SparseArray r9 = r5.A01
            java.lang.Object r0 = r9.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0524
            boolean r0 = r0.containsKey(r11)
            if (r0 == 0) goto L_0x0524
            java.lang.Object r0 = r9.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0567
            java.lang.Object r9 = r0.get(r11)
            X.D3Y r9 = (X.D3Y) r9
            if (r9 == 0) goto L_0x0567
            int r0 = r9.A01
            if (r0 != r1) goto L_0x0527
            int r0 = r9.A00
            X.D3X r10 = X.BE8.A0L(r11, r0)
            int[] r0 = r9.A02
            r9 = r0[r7]
            int[] r0 = new int[r1]
            r0[r7] = r9
            X.BP9 r11 = new X.BP9
            r11.<init>(r10, r0)
        L_0x0522:
            r2[r8] = r11
        L_0x0524:
            int r8 = r8 + 1
            goto L_0x04dd
        L_0x0527:
            r0 = r22
            X.C5g r10 = r0.A01
            int r0 = r9.A00
            X.D3X r12 = X.BE8.A0L(r11, r0)
            int[] r9 = r9.A02
            X.E10 r13 = r10.A00
            java.lang.String r11 = "audio"
            if (r13 == 0) goto L_0x0564
            X.D48[] r0 = r12.A02
            r0 = r0[r7]
            java.lang.String r0 = r0.A0P
            if (r0 == 0) goto L_0x0564
            boolean r0 = r0.startsWith(r11)
            if (r0 == 0) goto L_0x0564
        L_0x0547:
            X.E11 r14 = r10.A02
            X.D48[] r0 = r12.A02
            r0 = r0[r7]
            java.lang.String r0 = r0.A0P
            if (r0 == 0) goto L_0x0561
            boolean r0 = r0.startsWith(r11)
            if (r0 == 0) goto L_0x0561
        L_0x0557:
            X.DRp r15 = r10.A04
            X.BPA r11 = new X.BPA
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0522
        L_0x0561:
            X.E11 r14 = r10.A03
            goto L_0x0557
        L_0x0564:
            X.E10 r13 = r10.A01
            goto L_0x0547
        L_0x0567:
            r2[r8] = r21
            goto L_0x0524
        L_0x056a:
            X.Ckl[] r12 = new X.C25715Ckl[r4]
        L_0x056c:
            if (r7 >= r4) goto L_0x058b
            android.util.SparseBooleanArray r0 = r5.A02
            boolean r0 = r0.get(r7)
            if (r0 != 0) goto L_0x0588
            int[] r0 = r3.A03
            r8 = r0[r7]
            r0 = -2
            if (r8 == r0) goto L_0x0581
            r0 = r2[r7]
            if (r0 == 0) goto L_0x0588
        L_0x0581:
            X.Ckl r0 = X.C25715Ckl.A01
        L_0x0583:
            r12[r7] = r0
            int r7 = r7 + 1
            goto L_0x056c
        L_0x0588:
            r0 = r21
            goto L_0x0583
        L_0x058b:
            int r13 = r5.A00
            if (r13 == 0) goto L_0x05ef
            r18 = 0
            r14 = -1
            r15 = 0
            r11 = -1
            r10 = -1
        L_0x0595:
            if (r15 >= r4) goto L_0x05db
            int[] r0 = r3.A03
            r9 = r0[r15]
            r8 = r2[r15]
            if (r9 == r1) goto L_0x05a2
            r0 = 2
            if (r9 != r0) goto L_0x05d2
        L_0x05a2:
            if (r8 == 0) goto L_0x05d2
            r17 = r6[r15]
            X.D3a[] r0 = r3.A04
            r0 = r0[r15]
            X.D9c r8 = (X.C26679D9c) r8
            X.D3X r5 = r8.A02
            X.1IX r0 = r0.A02
            int r16 = r0.indexOf(r5)
            if (r16 >= 0) goto L_0x05b8
            r16 = -1
        L_0x05b8:
            r7 = 0
        L_0x05b9:
            int[] r0 = r8.A03
            int r5 = r0.length
            if (r7 >= r5) goto L_0x05cd
            r5 = r17[r16]
            r0 = r0[r7]
            r0 = r5[r0]
            r5 = 32
            r0 = r0 & 32
            if (r0 != r5) goto L_0x05d2
            int r7 = r7 + 1
            goto L_0x05b9
        L_0x05cd:
            if (r9 != r1) goto L_0x05d5
            if (r10 != r14) goto L_0x05d9
            r10 = r15
        L_0x05d2:
            int r15 = r15 + 1
            goto L_0x0595
        L_0x05d5:
            if (r11 != r14) goto L_0x05d9
            r11 = r15
            goto L_0x05d2
        L_0x05d9:
            r0 = 0
            goto L_0x05dc
        L_0x05db:
            r0 = 1
        L_0x05dc:
            if (r10 == r14) goto L_0x05e2
            if (r11 == r14) goto L_0x05e2
            r18 = 1
        L_0x05e2:
            r0 = r0 & r18
            if (r0 == 0) goto L_0x05ef
            X.Ckl r0 = new X.Ckl
            r0.<init>(r13)
            r12[r10] = r0
            r12[r11] = r0
        L_0x05ef:
            android.util.Pair r12 = android.util.Pair.create(r12, r2)
            java.lang.Object r6 = r12.second
            X.E0Z[] r6 = (X.E0Z[]) r6
            int r5 = r6.length
            java.util.List[] r0 = new java.util.List[r5]
            r19 = r0
            r2 = 0
        L_0x05fd:
            if (r2 >= r5) goto L_0x0611
            r0 = r6[r2]
            if (r0 == 0) goto L_0x060c
            X.1IX r0 = X.AnonymousClass1IX.of(r0)
        L_0x0607:
            r19[r2] = r0
            int r2 = r2 + 1
            goto L_0x05fd
        L_0x060c:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0607
        L_0x0611:
            X.2AI r18 = new X.2AI
            r18.<init>()
            r11 = 0
            r14 = 0
        L_0x0618:
            if (r14 >= r4) goto L_0x06be
            X.D3a[] r13 = r3.A04
            r10 = r13[r14]
            r17 = r19[r14]
            r9 = 0
        L_0x0621:
            int r0 = r10.A01
            if (r9 >= r0) goto L_0x06ba
            X.D3X r15 = X.BE8.A0L(r10, r9)
            r0 = r13[r14]
            X.1IX r0 = r0.A02
            r0.get(r9)
            int[] r7 = new int[r1]
            r5 = 0
            int[][][] r6 = r3.A05
            r0 = r6[r14]
            r0 = r0[r9]
            r0 = r0[r11]
            r2 = r0 & 7
            r0 = 4
            if (r2 != r0) goto L_0x0643
            r5 = 1
            r7[r11] = r11
        L_0x0643:
            int[] r8 = java.util.Arrays.copyOf(r7, r5)
            r7 = 0
            r5 = 0
            r16 = 0
        L_0x064b:
            int r0 = r8.length
            if (r7 >= r0) goto L_0x066a
            r2 = r8[r7]
            r0 = r13[r14]
            X.D3X r0 = X.BE8.A0L(r0, r9)
            X.D48[] r0 = r0.A02
            r0 = r0[r2]
            java.lang.String r2 = r0.A0S
            int r0 = r16 + 1
            if (r16 != 0) goto L_0x0666
            r5 = r2
        L_0x0661:
            int r7 = r7 + 1
            r16 = r0
            goto L_0x064b
        L_0x0666:
            com.facebook.android.exoplayer2.util.Util.A0D(r5, r2)
            goto L_0x0661
        L_0x066a:
            int[] r8 = new int[r1]
            boolean[] r7 = new boolean[r1]
            r0 = r6[r14]
            r0 = r0[r9]
            r0 = r0[r11]
            r0 = r0 & 7
            r8[r11] = r0
            r6 = 0
        L_0x0679:
            int r2 = r17.size()
            r0 = 0
            if (r6 >= r2) goto L_0x06a4
            r0 = r17
            java.lang.Object r5 = r0.get(r6)
            X.E0Z r5 = (X.E0Z) r5
            r0 = r5
            X.D9c r0 = (X.C26679D9c) r0
            X.D3X r0 = r0.A02
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x06b7
            X.D9c r5 = (X.C26679D9c) r5
            r2 = 0
        L_0x0696:
            int r0 = r5.A01
            if (r2 >= r0) goto L_0x06b7
            int[] r0 = r5.A03
            r0 = r0[r2]
            if (r0 != r11) goto L_0x06b4
            r0 = -1
            if (r2 == r0) goto L_0x06b7
            r0 = 1
        L_0x06a4:
            r7[r11] = r0
            X.CYW r2 = new X.CYW
            r2.<init>(r15, r8, r7)
            r0 = r18
            r0.add((java.lang.Object) r2)
            int r9 = r9 + 1
            goto L_0x0621
        L_0x06b4:
            int r2 = r2 + 1
            goto L_0x0696
        L_0x06b7:
            int r6 = r6 + 1
            goto L_0x0679
        L_0x06ba:
            int r14 = r14 + 1
            goto L_0x0618
        L_0x06be:
            X.D3a r7 = r3.A01
            r6 = 0
        L_0x06c1:
            int r0 = r7.A01
            if (r6 >= r0) goto L_0x06dd
            X.D3X r5 = X.BE8.A0L(r7, r6)
            int[] r4 = new int[r1]
            java.util.Arrays.fill(r4, r11)
            boolean[] r0 = new boolean[r1]
            X.CYW r2 = new X.CYW
            r2.<init>(r5, r4, r0)
            r0 = r18
            r0.add((java.lang.Object) r2)
            int r6 = r6 + 1
            goto L_0x06c1
        L_0x06dd:
            X.Ckm r0 = X.C25716Ckm.A01
            X.1IX r0 = r18.build()
            X.Ckm r5 = new X.Ckm
            r5.<init>(r0)
            java.lang.Object r2 = r12.first
            X.Ckl[] r2 = (X.C25715Ckl[]) r2
            java.lang.Object r0 = r12.second
            X.ECj[] r0 = (X.C28650ECj[]) r0
            X.CSJ r4 = new X.CSJ
            r4.<init>(r5, r3, r2, r0)
            r0 = r33
            X.CSJ r8 = r0.A04
            if (r8 == 0) goto L_0x0722
            X.ECj[] r7 = r8.A04
            int r0 = r7.length
            X.ECj[] r6 = r4.A04
            int r5 = r6.length
            if (r0 != r5) goto L_0x0722
            r3 = 0
        L_0x0704:
            if (r3 >= r5) goto L_0x0721
            X.Ckl[] r0 = r4.A03
            r2 = r0[r3]
            X.Ckl[] r0 = r8.A03
            r0 = r0[r3]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r2, r0)
            if (r0 == 0) goto L_0x0722
            r2 = r6[r3]
            r0 = r7[r3]
            boolean r0 = com.facebook.android.exoplayer2.util.Util.A0D(r2, r0)
            if (r0 == 0) goto L_0x0722
            int r3 = r3 + 1
            goto L_0x0704
        L_0x0721:
            return r11
        L_0x0722:
            r2 = 0
            r0 = r33
            r0.A05 = r4
            X.ECj[] r0 = r4.A04
            int r0 = r0.length
        L_0x072a:
            if (r2 >= r0) goto L_0x072f
            int r2 = r2 + 1
            goto L_0x072a
        L_0x072f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25237CbY.A02():boolean");
    }

    public C25237CbY(CTA cta, E9e e9e, C5B c5b, C25215CbB cbB, Object obj, E7M[] e7mArr, long j) {
        this.A0A = e7mArr;
        long j2 = cta.A03;
        this.A00 = j - j2;
        this.A0E = c5b;
        this.A0D = e9e;
        C26056CrS.A01(obj);
        this.A09 = obj;
        this.A02 = cta;
        int length = e7mArr.length;
        this.A0B = new E90[length];
        this.A0C = new boolean[length];
        C28649ECi BHj = e9e.BHj(cta.A04, cbB, j2);
        long j3 = cta.A02;
        this.A08 = j3 != Long.MIN_VALUE ? new D9K(BHj, j3) : BHj;
    }
}
