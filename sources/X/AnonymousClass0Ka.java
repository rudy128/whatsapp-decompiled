package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0Ka  reason: invalid class name */
public abstract class AnonymousClass0Ka {
    public int A00;
    public int A01;
    public long[] A02 = AnonymousClass0GO.A00;
    public Object[] A03;
    public Object[] A04;

    public final Object A02(Object obj) {
        int i = 0;
        int A0E = AnonymousClass001.A0E(AnonymousClass001.A0l(obj));
        int i2 = A0E & StringTreeSet.OFFSET_BASE_ENCODING;
        int i3 = this.A00;
        int i4 = A0E >>> 7;
        while (true) {
            int i5 = i4 & i3;
            long A012 = AnonymousClass002.A01(this.A02, i5);
            long j = (((long) i2) * 72340172838076673L) ^ A012;
            long j2 = (j ^ -1) & (j - 72340172838076673L) & -9187201950435737472L;
            while (j2 != 0) {
                int A0H = AnonymousClass001.A0H(i5, i3, j2);
                if (!C18070vi.A18(this.A03[A0H], obj)) {
                    j2 = AnonymousClass000.A0T(j2);
                } else if (A0H >= 0) {
                    return this.A04[A0H];
                } else {
                    return null;
                }
            }
            if ((AnonymousClass000.A0U(A012) & -9187201950435737472L) != 0) {
                return null;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r19
            r17 = 1
            r2 = r18
            if (r11 == r2) goto L_0x006c
            boolean r0 = r11 instanceof X.AnonymousClass0Ka
            r16 = 0
            if (r0 == 0) goto L_0x005b
            X.0Ka r11 = (X.AnonymousClass0Ka) r11
            int r1 = r11.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x005b
            java.lang.Object[] r10 = r2.A03
            java.lang.Object[] r9 = r2.A04
            long[] r8 = r2.A02
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x006c
            r6 = 0
        L_0x0022:
            r14 = r8[r6]
            long r3 = X.AnonymousClass001.A0q(r14)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            int r0 = X.AnonymousClass000.A0D(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x003b:
            if (r3 >= r4) goto L_0x0065
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
            int r0 = r6 << 3
            int r0 = r0 + r3
            r2 = r10[r0]
            r1 = r9[r0]
            java.lang.Object r0 = r11.A02(r2)
            if (r1 != 0) goto L_0x005c
            if (r0 != 0) goto L_0x005b
            boolean r0 = r11.A03(r2)
        L_0x0059:
            if (r0 != 0) goto L_0x0061
        L_0x005b:
            return r16
        L_0x005c:
            boolean r0 = r1.equals(r0)
            goto L_0x0059
        L_0x0061:
            long r14 = r14 >> r5
            int r3 = r3 + 1
            goto L_0x003b
        L_0x0065:
            if (r4 != r5) goto L_0x006c
        L_0x0067:
            if (r6 == r7) goto L_0x006c
            int r6 = r6 + 1
            goto L_0x0022
        L_0x006c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ka.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
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
                            Object obj = objArr[i4];
                            i += AnonymousClass001.A0l(objArr2[i4]) ^ AnonymousClass001.A0l(obj);
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
        Object[] objArr = this.A03;
        Object[] objArr2 = this.A04;
        long[] jArr = this.A02;
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
                            Object obj2 = objArr2[i4];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A10.append(obj);
                            A10.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            A10.append(obj2);
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
        String obj3 = A10.toString();
        C18070vi.A0X(obj3);
        return obj3;
    }

    public AnonymousClass0Ka() {
        Object[] objArr = AnonymousClass00Q.A02;
        this.A03 = objArr;
        this.A04 = objArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((X.AnonymousClass000.A0U(r11) & -9187201950435737472L) != 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = X.AnonymousClass001.A0l(r15)
            int r0 = X.AnonymousClass001.A0E(r0)
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r14.A00
            int r4 = r0 >>> 7
            r4 = r4 & r5
            r13 = 0
        L_0x0010:
            long[] r0 = r14.A02
            long r11 = X.AnonymousClass002.A01(r0, r4)
            long r1 = (long) r6
            r7 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r1 * r7
            long r1 = r1 ^ r11
            long r9 = r1 - r7
            r7 = -1
            long r1 = r1 ^ r7
            long r1 = r1 & r9
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r9
        L_0x002a:
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0048
            int r3 = X.AnonymousClass001.A0H(r4, r5, r1)
            java.lang.Object[] r0 = r14.A03
            r0 = r0[r3]
            boolean r0 = X.C18070vi.A18(r0, r15)
            if (r0 == 0) goto L_0x0043
            r0 = 1
            if (r3 >= 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            return r0
        L_0x0043:
            long r1 = X.AnonymousClass000.A0T(r1)
            goto L_0x002a
        L_0x0048:
            long r1 = X.AnonymousClass000.A0U(r11)
            long r1 = r1 & r9
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0041
            int r13 = r13 + 8
            int r4 = r4 + r13
            r4 = r4 & r5
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ka.A03(java.lang.Object):boolean");
    }
}
