package X;

/* renamed from: X.27M  reason: invalid class name */
public class AnonymousClass27M extends AnonymousClass27N {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r19.A06() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r18.A06() != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (r1 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010a, code lost:
        if (r2 == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0111, code lost:
        if (r1 != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0113, code lost:
        r16 = 5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C38961sG r21) {
        /*
            r20 = this;
            r8 = r20
            X.1sC[] r2 = r8.A0n
            X.1sC r10 = r8.A0W
            r7 = 0
            r2[r7] = r10
            X.1sC r6 = r8.A0Y
            r12 = 2
            r2[r12] = r6
            X.1sC r0 = r8.A0X
            r19 = r0
            r11 = 1
            r2[r11] = r0
            X.1sC r0 = r8.A0S
            r18 = r0
            r13 = 3
            r2[r13] = r0
            r3 = 0
        L_0x001d:
            int r0 = r2.length
            r9 = r21
            if (r3 >= r0) goto L_0x002d
            r1 = r2[r3]
            X.1sH r0 = r9.A09(r1)
            r1.A02 = r0
            int r3 = r3 + 1
            goto L_0x001d
        L_0x002d:
            int r4 = r8.A00
            if (r4 < 0) goto L_0x0155
            r5 = 4
            if (r4 >= r5) goto L_0x0155
            r17 = r2[r4]
            r3 = 0
        L_0x0037:
            int r0 = r8.A00
            if (r3 >= r0) goto L_0x012d
            X.1s3[] r0 = r8.A01
            r2 = r0[r3]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0051
            boolean r0 = r2 instanceof X.AnonymousClass27L
            if (r0 != 0) goto L_0x0051
            boolean r0 = r2 instanceof X.AnonymousClass27M
            if (r0 != 0) goto L_0x0051
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0129
        L_0x0051:
            if (r4 == 0) goto L_0x0117
            if (r4 == r11) goto L_0x0117
            java.lang.Integer[] r0 = r2.A0q
            r1 = r0[r11]
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0129
            X.1sC r0 = r2.A0Y
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0129
            X.1sC r0 = r2.A0S
        L_0x0065:
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0129
            r3 = 1
        L_0x006a:
            boolean r0 = r10.A06()
            if (r0 != 0) goto L_0x0077
            boolean r0 = r19.A06()
            r2 = 0
            if (r0 == 0) goto L_0x0078
        L_0x0077:
            r2 = 1
        L_0x0078:
            boolean r0 = r6.A06()
            if (r0 != 0) goto L_0x0085
            boolean r0 = r18.A06()
            r1 = 0
            if (r0 == 0) goto L_0x0086
        L_0x0085:
            r1 = 1
        L_0x0086:
            if (r3 != 0) goto L_0x0090
            int r0 = r8.A00
            if (r0 == 0) goto L_0x010a
            if (r0 != r12) goto L_0x010d
            if (r1 != 0) goto L_0x0113
        L_0x0090:
            r16 = 4
        L_0x0092:
            r4 = 0
        L_0x0093:
            int r0 = r8.A00
            if (r4 >= r0) goto L_0x0130
            X.1s3[] r0 = r8.A01
            r2 = r0[r4]
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r2 instanceof X.AnonymousClass27L
            if (r0 != 0) goto L_0x00ad
            boolean r0 = r2 instanceof X.AnonymousClass27M
            if (r0 != 0) goto L_0x00ad
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00ef
        L_0x00ad:
            X.1sC[] r1 = r2.A0n
            int r0 = r8.A00
            r0 = r1[r0]
            X.1sH r3 = r9.A09(r0)
            int r14 = r8.A00
            r1 = r1[r14]
            r1.A02 = r3
            X.1sC r0 = r1.A03
            if (r0 == 0) goto L_0x0108
            X.1s3 r0 = r0.A05
            if (r0 != r8) goto L_0x0108
            int r2 = r1.A01
        L_0x00c7:
            if (r14 == 0) goto L_0x00f2
            if (r14 == r12) goto L_0x00f2
            r0 = r17
            X.1sH r0 = r0.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 + r2
            X.1sJ r1 = r9.A06()
            X.1sH r0 = r9.A07()
            r0.A04 = r7
            r1.A05(r15, r3, r0, r14)
        L_0x00e0:
            r9.A0B(r1)
            r0 = r17
            X.1sH r14 = r0.A02
            int r1 = r8.A01
            int r1 = r1 + r2
            r0 = r16
            r9.A0D(r14, r3, r1, r0)
        L_0x00ef:
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00f2:
            r0 = r17
            X.1sH r0 = r0.A02
            r15 = r0
            int r14 = r8.A01
            int r14 = r14 - r2
            X.1sJ r1 = r9.A06()
            X.1sH r0 = r9.A07()
            r0.A04 = r7
            r1.A06(r15, r3, r0, r14)
            goto L_0x00e0
        L_0x0108:
            r2 = 0
            goto L_0x00c7
        L_0x010a:
            if (r2 != 0) goto L_0x0113
            goto L_0x0090
        L_0x010d:
            if (r0 == r11) goto L_0x010a
            if (r0 != r13) goto L_0x0090
            if (r1 == 0) goto L_0x0090
        L_0x0113:
            r16 = 5
            goto L_0x0092
        L_0x0117:
            java.lang.Integer[] r0 = r2.A0q
            r1 = r0[r7]
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0129
            X.1sC r0 = r2.A0W
            X.1sC r0 = r0.A03
            if (r0 == 0) goto L_0x0129
            X.1sC r0 = r2.A0X
            goto L_0x0065
        L_0x0129:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x012d:
            r3 = 0
            goto L_0x006a
        L_0x0130:
            int r0 = r8.A00
            r2 = 8
            if (r0 != 0) goto L_0x0156
            r0 = r19
            X.1sH r1 = r0.A02
            X.1sH r0 = r10.A02
            r9.A0D(r1, r0, r7, r2)
            X.1sH r1 = r10.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0X
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.1sH r1 = r10.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0W
        L_0x0150:
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r7)
        L_0x0155:
            return
        L_0x0156:
            if (r0 != r11) goto L_0x0173
            X.1sH r1 = r10.A02
            r0 = r19
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r2)
            X.1sH r1 = r10.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0W
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.1sH r1 = r10.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0X
            goto L_0x0150
        L_0x0173:
            if (r0 != r12) goto L_0x0190
            r0 = r18
            X.1sH r1 = r0.A02
            X.1sH r0 = r6.A02
            r9.A0D(r1, r0, r7, r2)
            X.1sH r1 = r6.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0S
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.1sH r1 = r6.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0Y
            goto L_0x0150
        L_0x0190:
            if (r0 != r13) goto L_0x0155
            X.1sH r1 = r6.A02
            r0 = r18
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r2)
            X.1sH r1 = r6.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0Y
            X.1sH r0 = r0.A02
            r9.A0D(r1, r0, r7, r5)
            X.1sH r1 = r6.A02
            X.1s3 r0 = r8.A0Z
            X.1sC r0 = r0.A0S
            goto L_0x0150
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27M.A0I(X.1sG):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[Barrier] ");
        A10.append(this.A0f);
        String A0y = AnonymousClass000.A0y(" {", A10);
        for (int i = 0; i < this.A00; i++) {
            C38871s3 r2 = this.A01[i];
            if (i > 0) {
                A0y = AnonymousClass000.A0y(", ", AnonymousClass000.A11(A0y));
            }
            A0y = AnonymousClass000.A0y(r2.A0f, AnonymousClass000.A11(A0y));
        }
        return AnonymousClass000.A0y("}", AnonymousClass000.A11(A0y));
    }
}
