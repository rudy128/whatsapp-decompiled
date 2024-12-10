package X;

import java.util.Comparator;

/* renamed from: X.CeS  reason: case insensitive filesystem */
public abstract class C25367CeS {
    public static final Comparator A00 = new DUR(3);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.CQt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: X.CQt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: X.CQt} */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CQt] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.lang.Object, X.CS6] */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, X.CS6] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        if (r4[r2 - 1] < r4[r2 + 1]) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        r13 = -r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        if (r13 > r8) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        r2 = r13 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bd, code lost:
        if (r2 == (r8 + r19)) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r2 == ((-r8) + r19)) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        r14 = r22 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ce, code lost:
        if (r3[r14 - 1] >= r3[r14 + 1]) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        r1 = r3[(r22 + r2) - 1];
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d7, code lost:
        r16 = r1 - r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        if (r1 <= 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        if (r16 <= 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        if (r24.A04((r20 + r1) - 1, (r11 + r16) - 1) == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ed, code lost:
        r1 = r1 - 1;
        r16 = r16 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        r3[r22 + r2] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f6, code lost:
        if (r18 != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fb, code lost:
        if ((r13 + r19) < (-r8)) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ff, code lost:
        if ((r13 + r19) > r8) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        r0 = r22 + r2;
        r14 = r4[r0];
        r1 = r3[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        if (r14 < r1) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        r8 = new java.lang.Object();
        r8.A01 = r1;
        r8.A02 = r1 - r2;
        r8.A00 = r14 - r1;
        r8.A03 = r17;
        r8.A04 = true;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011e, code lost:
        r13 = r13 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        r1 = r3[(r22 + r2) + 1] - 1;
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c4, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x012b A[EDGE_INSN: B:102:0x012b->B:49:0x012b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7 A[LOOP:3: B:17:0x0095->B:21:0x00a7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c0 A[LOOP:2: B:9:0x0078->B:82:0x01c0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0144 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25734Cl4 A00(X.C24490C6i r24) {
        /*
            r7 = 1
            int r3 = r24.A01()
            int r2 = r24.A00()
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            r1 = 0
            X.CQt r0 = new X.CQt
            r0.<init>()
            r0.A03 = r1
            r0.A02 = r3
            r0.A01 = r1
            r0.A00 = r2
            r6.add(r0)
            int r22 = r3 + r2
            int r0 = X.C108945cZ.A05(r3, r2)
            int r22 = r22 + r0
            int r0 = r22 * 2
            int[] r4 = new int[r0]
            int[] r3 = new int[r0]
            java.util.ArrayList r21 = X.AnonymousClass000.A13()
        L_0x0034:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01d6
            int r0 = X.AnonymousClass000.A0Q(r6)
            java.lang.Object r5 = r6.remove(r0)
            X.CQt r5 = (X.C24943CQt) r5
            int r0 = r5.A03
            r20 = r0
            int r12 = r5.A02
            int r11 = r5.A01
            int r10 = r5.A00
            int r12 = r12 - r0
            int r10 = r10 - r11
            if (r12 < r7) goto L_0x01c8
            if (r10 < r7) goto L_0x01c8
            int r19 = r12 - r10
            int r0 = r12 + r10
            int r0 = r0 + 1
            int r9 = r0 / 2
            int r2 = r22 - r9
            int r2 = r2 - r7
            int r0 = r22 + r9
            int r1 = r0 + 1
            r0 = 0
            java.util.Arrays.fill(r4, r2, r1, r0)
            int r2 = r2 + r19
            int r1 = r1 + r19
            java.util.Arrays.fill(r3, r2, r1, r12)
            int r0 = r19 % 2
            boolean r18 = X.AnonymousClass000.A1O(r0)
            r8 = 0
        L_0x0075:
            if (r8 > r9) goto L_0x01cf
            int r13 = -r8
        L_0x0078:
            if (r13 > r8) goto L_0x00b6
            int r0 = -r8
            if (r13 == r0) goto L_0x008b
            if (r13 == r8) goto L_0x00ac
            int r2 = r22 + r13
            int r0 = r2 - r7
            r1 = r4[r0]
            int r0 = r2 + 1
            r0 = r4[r0]
            if (r1 >= r0) goto L_0x00ac
        L_0x008b:
            int r0 = r22 + r13
            int r0 = r0 + 1
            r14 = r4[r0]
            r16 = 0
        L_0x0093:
            int r15 = r14 - r13
        L_0x0095:
            if (r14 >= r12) goto L_0x012b
            if (r15 >= r10) goto L_0x012b
            int r1 = r20 + r14
            int r0 = r11 + r15
            r2 = r1
            r1 = r0
            r0 = r24
            boolean r0 = r0.A04(r2, r1)
            if (r0 == 0) goto L_0x012b
            int r14 = r14 + 1
            int r15 = r15 + 1
            goto L_0x0095
        L_0x00ac:
            int r0 = r22 + r13
            int r0 = r0 - r7
            r0 = r4[r0]
            int r14 = r0 + 1
            r16 = 1
            goto L_0x0093
        L_0x00b6:
            int r13 = -r8
        L_0x00b7:
            if (r13 > r8) goto L_0x01c4
            int r2 = r13 + r19
            int r0 = r8 + r19
            if (r2 == r0) goto L_0x00d0
            int r0 = -r8
            int r0 = r0 + r19
            if (r2 == r0) goto L_0x0121
            int r14 = r22 + r2
            int r0 = r14 - r7
            r1 = r3[r0]
            int r0 = r14 + 1
            r0 = r3[r0]
            if (r1 >= r0) goto L_0x0121
        L_0x00d0:
            int r0 = r22 + r2
            int r0 = r0 - r7
            r1 = r3[r0]
            r17 = 0
        L_0x00d7:
            int r16 = r1 - r2
        L_0x00d9:
            if (r1 <= 0) goto L_0x00f2
            if (r16 <= 0) goto L_0x00f2
            int r0 = r20 + r1
            int r15 = r0 + -1
            int r0 = r11 + r16
            int r14 = r0 + -1
            r0 = r24
            boolean r0 = r0.A04(r15, r14)
            if (r0 == 0) goto L_0x00f2
            int r1 = r1 + -1
            int r16 = r16 + -1
            goto L_0x00d9
        L_0x00f2:
            int r0 = r22 + r2
            r3[r0] = r1
            if (r18 != 0) goto L_0x011e
            int r1 = r13 + r19
            int r0 = -r8
            if (r1 < r0) goto L_0x011e
            int r0 = r13 + r19
            if (r0 > r8) goto L_0x011e
            int r0 = r22 + r2
            r14 = r4[r0]
            r1 = r3[r0]
            if (r14 < r1) goto L_0x011e
            X.CS6 r8 = new X.CS6
            r8.<init>()
            r8.A01 = r1
            int r0 = r1 - r2
            r8.A02 = r0
            int r14 = r14 - r1
            r8.A00 = r14
            r0 = r17
            r8.A03 = r0
            r8.A04 = r7
            goto L_0x0159
        L_0x011e:
            int r13 = r13 + 2
            goto L_0x00b7
        L_0x0121:
            int r0 = r22 + r2
            int r0 = r0 + 1
            r1 = r3[r0]
            int r1 = r1 - r7
            r17 = 1
            goto L_0x00d7
        L_0x012b:
            int r0 = r22 + r13
            r4[r0] = r14
            if (r18 == 0) goto L_0x01c0
            int r0 = r19 - r8
            int r0 = r0 + 1
            if (r13 < r0) goto L_0x01c0
            int r0 = r19 + r8
            int r0 = r0 - r7
            if (r13 > r0) goto L_0x01c0
            int r0 = r22 + r13
            r2 = r4[r0]
            r1 = r3[r0]
            if (r2 < r1) goto L_0x01c0
            X.CS6 r8 = new X.CS6
            r8.<init>()
            r8.A01 = r1
            int r0 = r1 - r13
            r8.A02 = r0
            int r2 = r2 - r1
            r8.A00 = r2
            r0 = r16
            r8.A03 = r0
            r0 = 0
            r8.A04 = r0
        L_0x0159:
            int r9 = r8.A00
            if (r9 <= 0) goto L_0x0162
            r0 = r23
            r0.add(r8)
        L_0x0162:
            int r10 = r8.A01
            int r12 = r5.A03
            int r10 = r10 + r12
            r8.A01 = r10
            int r2 = r8.A02
            int r11 = r5.A01
            int r2 = r2 + r11
            r8.A02 = r2
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto L_0x01b3
            X.CQt r0 = new X.CQt
            r0.<init>()
        L_0x017b:
            r0.A03 = r12
            r0.A01 = r11
            boolean r11 = r8.A04
            if (r11 == 0) goto L_0x01a7
            r1 = r10
        L_0x0184:
            r0.A02 = r1
            r1 = r2
        L_0x0187:
            r0.A00 = r1
            r6.add(r0)
            if (r11 == 0) goto L_0x01a5
            boolean r0 = r8.A03
            int r10 = r10 + r9
            if (r0 == 0) goto L_0x019f
            int r10 = r10 + 1
        L_0x0195:
            r5.A03 = r10
            int r2 = r2 + r9
        L_0x0198:
            r5.A01 = r2
            r6.add(r5)
            goto L_0x0034
        L_0x019f:
            r5.A03 = r10
            int r2 = r2 + r9
            int r2 = r2 + 1
            goto L_0x0198
        L_0x01a5:
            int r10 = r10 + r9
            goto L_0x0195
        L_0x01a7:
            boolean r1 = r8.A03
            if (r1 == 0) goto L_0x01ae
            int r1 = r10 + -1
            goto L_0x0184
        L_0x01ae:
            r0.A02 = r10
            int r1 = r2 + -1
            goto L_0x0187
        L_0x01b3:
            int r1 = X.AnonymousClass000.A0Q(r21)
            r0 = r21
            java.lang.Object r0 = r0.remove(r1)
            X.CQt r0 = (X.C24943CQt) r0
            goto L_0x017b
        L_0x01c0:
            int r13 = r13 + 2
            goto L_0x0078
        L_0x01c4:
            int r8 = r8 + 1
            goto L_0x0075
        L_0x01c8:
            r0 = r21
            r0.add(r5)
            goto L_0x0034
        L_0x01cf:
            java.lang.String r0 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x01d6:
            java.util.Comparator r1 = A00
            r0 = r23
            java.util.Collections.sort(r0, r1)
            X.Cl4 r2 = new X.Cl4
            r1 = r24
            r2.<init>(r1, r0, r4, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25367CeS.A00(X.C6i):X.Cl4");
    }
}
