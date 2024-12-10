package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0KS  reason: invalid class name */
public abstract class AnonymousClass0KS {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03;
    public long[] A04 = AnonymousClass0GO.A00;

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r12 = r19
            r0 = 1
            r2 = r18
            if (r12 == r2) goto L_0x0075
            boolean r0 = r12 instanceof X.AnonymousClass0KS
            r17 = 0
            if (r0 == 0) goto L_0x0058
            X.0KS r12 = (X.AnonymousClass0KS) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0058
            int[] r11 = r2.A02
            int[] r10 = r2.A03
            long[] r9 = r2.A04
            int r0 = r9.length
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x0074
            r7 = 0
        L_0x0021:
            r15 = r9[r7]
            long r3 = X.AnonymousClass001.A0q(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005f
            int r0 = X.AnonymousClass000.A0D(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L_0x003a:
            if (r4 >= r5) goto L_0x005d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r11[r0]
            r2 = r10[r0]
            int r1 = r12.A02(r3)
            if (r1 < 0) goto L_0x0064
            int[] r0 = r12.A03
            r0 = r0[r1]
            if (r2 == r0) goto L_0x0059
        L_0x0058:
            return r17
        L_0x0059:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L_0x003a
        L_0x005d:
            if (r5 != r6) goto L_0x0074
        L_0x005f:
            if (r7 == r8) goto L_0x0074
            int r7 = r7 + 1
            goto L_0x0021
        L_0x0064:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot find value for key "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0074:
            r0 = 1
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KS.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i2, length);
                    for (int i3 = 0; i3 < A0D; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i2 << 3) + i3;
                            i += iArr2[i4] ^ iArr[i4];
                        }
                        j >>= 8;
                    }
                    if (A0D != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public String toString() {
        int i = this.A01;
        if (i == 0) {
            return "{}";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('{');
        int[] iArr = this.A02;
        int[] iArr2 = this.A03;
        long[] jArr = this.A04;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i2, length);
                    for (int i4 = 0; i4 < A0D; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            int i6 = iArr[i5];
                            int i7 = iArr2[i5];
                            A10.append(i6);
                            A10.append("=");
                            A10.append(i7);
                            i3++;
                            AnonymousClass001.A1S(A10, i3, i);
                        }
                        j >>= 8;
                    }
                    if (A0D != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        A10.append('}');
        String obj = A10.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public AnonymousClass0KS() {
        int[] iArr = AnonymousClass0GM.A00;
        this.A02 = iArr;
        this.A03 = iArr;
    }

    public final int A02(int i) {
        int A0D = AnonymousClass001.A0D(i);
        int i2 = A0D & StringTreeSet.OFFSET_BASE_ENCODING;
        int i3 = this.A00;
        int i4 = (A0D >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long A012 = AnonymousClass002.A01(this.A04, i4);
            long j = (((long) i2) * 72340172838076673L) ^ A012;
            for (long j2 = (j ^ -1) & (j - 72340172838076673L) & -9187201950435737472L; j2 != 0; j2 = AnonymousClass000.A0T(j2)) {
                int A0H = AnonymousClass001.A0H(i4, i3, j2);
                if (this.A02[A0H] == i) {
                    return A0H;
                }
            }
            if ((AnonymousClass000.A0U(A012) & -9187201950435737472L) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }
}
