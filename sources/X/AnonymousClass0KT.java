package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.0KT  reason: invalid class name */
public abstract class AnonymousClass0KT {
    public int A00;
    public int A01;
    public int[] A02 = AnonymousClass0GM.A00;
    public long[] A03 = AnonymousClass0GO.A00;
    public Object[] A04 = AnonymousClass00Q.A02;

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if ((X.AnonymousClass000.A0U(r21) & -9187201950435737472L) != 0) goto L_0x00bc;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r28) {
        /*
            r27 = this;
            r13 = r28
            r0 = 1
            r2 = r27
            if (r13 == r2) goto L_0x00bd
            boolean r0 = r13 instanceof X.AnonymousClass0KT
            r26 = 0
            if (r0 == 0) goto L_0x00bc
            X.0KT r13 = (X.AnonymousClass0KT) r13
            int r1 = r13.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x00bc
            int[] r12 = r2.A02
            java.lang.Object[] r11 = r2.A04
            long[] r10 = r2.A03
            int r0 = r10.length
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x00ba
            r8 = 0
        L_0x0021:
            r24 = r10[r8]
            long r3 = X.AnonymousClass001.A0q(r24)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00b4
            int r0 = X.AnonymousClass000.A0D(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L_0x003a:
            if (r5 >= r6) goto L_0x00b2
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r24
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            int r0 = r8 << 3
            int r0 = r0 + r5
            r14 = r12[r0]
            r1 = r11[r0]
            java.lang.Object r0 = r13.A02(r14)
            if (r1 != 0) goto L_0x00ab
            if (r0 != 0) goto L_0x00bc
            int r0 = X.AnonymousClass001.A0D(r14)
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r3 = r13.A00
            int r2 = r0 >>> 7
            r2 = r2 & r3
            r23 = 0
        L_0x0062:
            long[] r0 = r13.A03
            long r21 = X.AnonymousClass002.A01(r0, r2)
            long r0 = (long) r4
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r15
            long r0 = r0 ^ r21
            long r17 = r0 - r15
            r15 = -1
            long r0 = r0 ^ r15
            long r0 = r0 & r17
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r19
        L_0x007f:
            r17 = 0
            int r15 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r15 == 0) goto L_0x009b
            int r16 = X.AnonymousClass001.A0H(r2, r3, r0)
            int[] r15 = r13.A02
            r15 = r15[r16]
            if (r15 != r14) goto L_0x0096
            if (r16 < 0) goto L_0x00bc
        L_0x0091:
            long r24 = r24 >> r7
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0096:
            long r0 = X.AnonymousClass000.A0T(r0)
            goto L_0x007f
        L_0x009b:
            long r15 = X.AnonymousClass000.A0U(r21)
            long r15 = r15 & r19
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            int r23 = r23 + 8
            int r2 = r2 + r23
            r2 = r2 & r3
            goto L_0x0062
        L_0x00ab:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0091
            return r26
        L_0x00b2:
            if (r6 != r7) goto L_0x00ba
        L_0x00b4:
            if (r8 == r9) goto L_0x00ba
            int r8 = r8 + 1
            goto L_0x0021
        L_0x00ba:
            r0 = 1
            return r0
        L_0x00bc:
            return r26
        L_0x00bd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KT.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.A02;
        Object[] objArr = this.A04;
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
                            i += AnonymousClass001.A0l(objArr[i4]) ^ iArr[i4];
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
        int[] iArr = this.A02;
        Object[] objArr = this.A04;
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
                            int i5 = iArr[i4];
                            Object obj = objArr[i4];
                            A10.append(i5);
                            A10.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            A10.append(obj);
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

    public final Object A02(int i) {
        int A0D = AnonymousClass001.A0D(i);
        int i2 = A0D & StringTreeSet.OFFSET_BASE_ENCODING;
        int i3 = this.A00;
        int i4 = (A0D >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long A012 = AnonymousClass002.A01(this.A03, i4);
            long j = (((long) i2) * 72340172838076673L) ^ A012;
            long j2 = (j ^ -1) & (j - 72340172838076673L) & -9187201950435737472L;
            while (j2 != 0) {
                int A0H = AnonymousClass001.A0H(i4, i3, j2);
                if (this.A02[A0H] != i) {
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
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }
}
