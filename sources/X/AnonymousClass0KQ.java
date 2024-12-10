package X;

/* renamed from: X.0KQ  reason: invalid class name */
public abstract class AnonymousClass0KQ {
    public int A00;
    public int[] A01 = AnonymousClass0GM.A00;
    public long[] A02 = AnonymousClass0GO.A00;

    public final String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        int[] iArr = this.A01;
        long[] jArr = this.A02;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((AnonymousClass001.A0q(j) & -9187201950435737472L) != -9187201950435737472L) {
                    int A0F = AnonymousClass000.A0F(i, length);
                    for (int i3 = 0; i3 < A0F; i3++) {
                        if ((j & 255) < 128) {
                            int i4 = iArr[(i << 3) + i3];
                            if (i2 == -1) {
                                A10.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                A10.append(", ");
                            }
                            A10.append(i4);
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

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if ((X.AnonymousClass000.A0U(r20) & -9187201950435737472L) != 0) goto L_0x00a2;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r28) {
        /*
            r27 = this;
            r13 = r28
            r26 = 1
            r1 = r27
            if (r13 == r1) goto L_0x00a3
            boolean r0 = r13 instanceof X.AnonymousClass0KQ
            r25 = 0
            if (r0 == 0) goto L_0x00a2
            X.0KQ r13 = (X.AnonymousClass0KQ) r13
            int[] r12 = r1.A01
            long[] r11 = r1.A02
            int r0 = r11.length
            int r10 = r0 + -2
            if (r10 < 0) goto L_0x00a3
            r9 = 0
        L_0x001a:
            r23 = r11[r9]
            long r3 = X.AnonymousClass001.A0q(r23)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x009c
            int r0 = X.AnonymousClass000.A0D(r9, r10)
            r8 = 8
            int r7 = 8 - r0
            r6 = 0
        L_0x0033:
            if (r6 >= r7) goto L_0x009a
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r23
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            int r0 = r9 << 3
            int r0 = r0 + r6
            r5 = r12[r0]
            int r0 = X.AnonymousClass001.A0D(r5)
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r3 = r13.A00
            int r2 = r0 >>> 7
            r2 = r2 & r3
            r22 = 0
        L_0x0051:
            long[] r0 = r13.A02
            long r20 = X.AnonymousClass002.A01(r0, r2)
            long r0 = (long) r4
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r14
            long r0 = r0 ^ r20
            long r16 = r0 - r14
            r14 = -1
            long r0 = r0 ^ r14
            long r0 = r0 & r16
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r18
        L_0x006e:
            r16 = 0
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x008a
            int r15 = X.AnonymousClass001.A0H(r2, r3, r0)
            int[] r14 = r13.A01
            r14 = r14[r15]
            if (r14 != r5) goto L_0x0085
            if (r15 < 0) goto L_0x00a2
        L_0x0080:
            long r23 = r23 >> r8
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0085:
            long r0 = X.AnonymousClass000.A0T(r0)
            goto L_0x006e
        L_0x008a:
            long r14 = X.AnonymousClass000.A0U(r20)
            long r14 = r14 & r18
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00a2
            int r22 = r22 + 8
            int r2 = r2 + r22
            r2 = r2 & r3
            goto L_0x0051
        L_0x009a:
            if (r7 != r8) goto L_0x00a3
        L_0x009c:
            if (r9 == r10) goto L_0x00a3
            int r9 = r9 + 1
            goto L_0x001a
        L_0x00a2:
            return r25
        L_0x00a3:
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KQ.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.A01;
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
                            i += iArr[(i2 << 3) + i3];
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
        return A00();
    }
}
