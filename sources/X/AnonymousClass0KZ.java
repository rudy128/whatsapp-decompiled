package X;

/* renamed from: X.0KZ  reason: invalid class name */
public abstract class AnonymousClass0KZ {
    public int A00;
    public int A01;
    public long[] A02 = AnonymousClass0GN.A00;
    public long[] A03 = AnonymousClass0GO.A00;

    public final String A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr2[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0F = AnonymousClass000.A0F(i, length);
                    for (int i3 = 0; i3 < A0F; i3++) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            if (i2 == -1) {
                                A10.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A10.append(", ");
                            }
                            A10.append(j2);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (A0F != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        A10.append("]");
        String obj = A10.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r16 = 1
            r2 = r17
            if (r10 == r2) goto L_0x005a
            boolean r0 = r10 instanceof X.AnonymousClass0KZ
            r15 = 0
            if (r0 == 0) goto L_0x004e
            X.0KZ r10 = (X.AnonymousClass0KZ) r10
            int r1 = r10.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x004e
            long[] r9 = r2.A02
            long[] r8 = r2.A03
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x005a
            r6 = 0
        L_0x001f:
            r13 = r8[r6]
            long r3 = X.AnonymousClass001.A0q(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            int r0 = X.AnonymousClass000.A0D(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x0038:
            if (r3 >= r4) goto L_0x0053
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            boolean r0 = r10.A03(r0)
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            return r15
        L_0x004f:
            long r13 = r13 >> r5
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0053:
            if (r4 != r5) goto L_0x005a
        L_0x0055:
            if (r6 == r7) goto L_0x005a
            int r6 = r6 + 1
            goto L_0x001f
        L_0x005a:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KZ.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.A02;
        long[] jArr2 = this.A03;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i2, length);
                    for (int i3 = 0; i3 < A0D; i3++) {
                        if ((255 & j) < 128) {
                            i = AnonymousClass001.A0J(jArr[(i2 << 3) + i3], i);
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if ((X.AnonymousClass000.A0U(r14) & -9187201950435737472L) != 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r18) {
        /*
            r17 = this;
            int r0 = X.AnonymousClass000.A0I(r18)
            int r0 = X.AnonymousClass001.A0E(r0)
            r9 = r0 & 127(0x7f, float:1.78E-43)
            r8 = r17
            int r7 = r8.A00
            int r6 = r0 >>> 7
            r6 = r6 & r7
            r16 = 0
        L_0x0013:
            long[] r0 = r8.A03
            long r14 = X.AnonymousClass002.A01(r0, r6)
            long r3 = (long) r9
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r3 = r3 * r0
            long r3 = r3 ^ r14
            long r10 = r3 - r0
            r0 = -1
            long r3 = r3 ^ r0
            long r3 = r3 & r10
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r12
        L_0x002d:
            r10 = 0
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            int r5 = X.AnonymousClass001.A0H(r6, r7, r3)
            long[] r0 = r8.A02
            r1 = r0[r5]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0044
            r0 = 1
            if (r5 >= 0) goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            return r0
        L_0x0044:
            long r3 = X.AnonymousClass000.A0T(r3)
            goto L_0x002d
        L_0x0049:
            long r1 = X.AnonymousClass000.A0U(r14)
            long r1 = r1 & r12
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0042
            int r16 = r16 + 8
            int r6 = r6 + r16
            r6 = r6 & r7
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KZ.A03(long):boolean");
    }

    public String toString() {
        return A02();
    }
}
