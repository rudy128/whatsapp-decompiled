package X;

/* renamed from: X.0NQ  reason: invalid class name */
public abstract class AnonymousClass0NQ {
    public int A00;
    public int A01;
    public long[] A02 = AnonymousClass0GO.A00;
    public Object[] A03 = AnonymousClass00Q.A02;

    public final String A04(C22821Di r21) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        Object[] objArr = this.A03;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0D = 8 - AnonymousClass000.A0D(i, length);
                    for (int i3 = 0; i3 < A0D; i3++) {
                        if ((j & 255) < 128) {
                            Object A0x = AnonymousClass000.A0x(objArr, i, i3);
                            if (i2 == -1) {
                                A10.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A10.append(", ");
                            }
                            A10.append((CharSequence) r21.invoke(A0x));
                            i2++;
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
            r12 = r18
            r16 = 1
            r2 = r17
            if (r12 == r2) goto L_0x0059
            boolean r0 = r12 instanceof X.AnonymousClass0NQ
            r15 = 0
            if (r0 == 0) goto L_0x004d
            X.0NQ r12 = (X.AnonymousClass0NQ) r12
            int r1 = r12.A01
            int r0 = r2.A01
            if (r1 != r0) goto L_0x004d
            java.lang.Object[] r11 = r2.A03
            long[] r10 = r2.A02
            int r0 = r10.length
            int r9 = r0 + -2
            if (r9 < 0) goto L_0x0059
            r8 = 0
        L_0x001f:
            r13 = r10[r8]
            long r3 = X.AnonymousClass001.A0q(r13)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            int r0 = X.AnonymousClass000.A0D(r8, r9)
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L_0x0038:
            if (r5 >= r6) goto L_0x0052
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            java.lang.Object r0 = X.AnonymousClass000.A0x(r11, r8, r5)
            boolean r0 = r12.A05(r0)
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            return r15
        L_0x004e:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0052:
            if (r6 != r7) goto L_0x0059
        L_0x0054:
            if (r8 == r9) goto L_0x0059
            int r8 = r8 + 1
            goto L_0x001f
        L_0x0059:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NQ.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.A03;
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
                            i += AnonymousClass001.A0l(AnonymousClass000.A0x(objArr, i2, i3));
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
        return A04(new C09430gh(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if ((X.AnonymousClass000.A0U(r11) & -9187201950435737472L) != 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(java.lang.Object r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0NQ.A05(java.lang.Object):boolean");
    }
}
