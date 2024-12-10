package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0KU  reason: invalid class name */
public abstract class AnonymousClass0KU {
    public int A00;
    public int A01;
    public int[] A02 = AnonymousClass0GM.A00;
    public long[] A03 = AnonymousClass0GO.A00;
    public Object[] A04 = AnonymousClass00Q.A02;

    public final int A04(Object obj) {
        int i = 0;
        int A0E = AnonymousClass001.A0E(AnonymousClass001.A0l(obj));
        int i2 = A0E & StringTreeSet.OFFSET_BASE_ENCODING;
        int i3 = this.A00;
        int i4 = A0E >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long A012 = AnonymousClass002.A01(this.A03, i5);
            long j = (((long) i2) * 72340172838076673L) ^ A012;
            for (long j2 = (j ^ -1) & (j - 72340172838076673L) & -9187201950435737472L; j2 != 0; j2 = AnonymousClass000.A0T(j2)) {
                int A0H = AnonymousClass001.A0H(i5, i3, j2);
                if (C18070vi.A18(this.A04[A0H], obj)) {
                    return A0H;
                }
            }
            if ((AnonymousClass000.A0U(A012) & -9187201950435737472L) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r20
            r18 = 1
            r2 = r19
            if (r12 == r2) goto L_0x007d
            boolean r0 = r12 instanceof X.AnonymousClass0KU
            r17 = 0
            if (r0 == 0) goto L_0x0059
            X.0KU r12 = (X.AnonymousClass0KU) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0059
            java.lang.Object[] r11 = r2.A04
            int[] r10 = r2.A02
            long[] r9 = r2.A03
            int r0 = r9.length
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x007d
            r7 = 0
        L_0x0022:
            r15 = r9[r7]
            long r3 = X.AnonymousClass001.A0q(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0060
            int r0 = X.AnonymousClass000.A0D(r7, r8)
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L_0x003b:
            if (r4 >= r5) goto L_0x005e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005a
            int r0 = r7 << 3
            int r0 = r0 + r4
            r3 = r11[r0]
            r2 = r10[r0]
            int r1 = r12.A04(r3)
            if (r1 < 0) goto L_0x0065
            int[] r0 = r12.A02
            r0 = r0[r1]
            if (r2 == r0) goto L_0x005a
        L_0x0059:
            return r17
        L_0x005a:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L_0x003b
        L_0x005e:
            if (r5 != r6) goto L_0x007d
        L_0x0060:
            if (r7 == r8) goto L_0x007d
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0065:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "There is no key "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " in the map"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x007d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KU.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A04;
        int[] iArr = this.A02;
        long[] jArr = this.A03;
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
                            i += iArr[i4] ^ AnonymousClass001.A0l(objArr[i4]);
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
        if (this.A01 == 0) {
            return "{}";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('{');
        Object[] objArr = this.A04;
        int[] iArr = this.A02;
        long[] jArr = this.A03;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i, length);
                    for (int i3 = 0; i3 < A0D; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            int i5 = iArr[i4];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A10.append(obj);
                            A10.append("=");
                            A10.append(i5);
                            i2++;
                            AnonymousClass001.A1S(A10, i2, this.A01);
                        }
                        j >>= 8;
                    }
                    if (A0D != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        A10.append('}');
        String obj2 = A10.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
