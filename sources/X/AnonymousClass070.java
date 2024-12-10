package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.util.Arrays;

/* renamed from: X.070  reason: invalid class name */
public final class AnonymousClass070 extends AnonymousClass0Ka {
    public int A00;

    public final void A05() {
        this.A01 = 0;
        long[] jArr = this.A02;
        if (jArr != AnonymousClass0GO.A00) {
            Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
            AnonymousClass002.A06(this.A02, this.A00);
        }
        C200310o.A06(this.A04, 0, this.A00);
        C200310o.A06(this.A03, 0, this.A00);
        this.A00 = AnonymousClass001.A0B(this.A00) - this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if ((X.AnonymousClass000.A0U(r9) & -9187201950435737472L) != 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.Object r13) {
        /*
            r12 = this;
            r11 = 0
            int r0 = X.AnonymousClass001.A0l(r13)
            int r0 = X.AnonymousClass001.A0E(r0)
            r6 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r12.A00
            int r4 = r0 >>> 7
        L_0x000f:
            r4 = r4 & r5
            long[] r0 = r12.A02
            long r9 = X.AnonymousClass002.A01(r0, r4)
            long r2 = (long) r6
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r9
            long r7 = r2 - r0
            r0 = -1
            long r2 = r2 ^ r0
            long r2 = r2 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L_0x0029:
            long r2 = r2 & r7
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0049
            int r1 = X.AnonymousClass001.A0H(r4, r5, r2)
            java.lang.Object[] r0 = r12.A03
            r0 = r0[r1]
            boolean r0 = X.C18070vi.A18(r0, r13)
            if (r0 == 0) goto L_0x0044
            if (r1 < 0) goto L_0x0043
            r12.A06(r1)
        L_0x0043:
            return
        L_0x0044:
            r0 = 1
            long r7 = r2 - r0
            goto L_0x0029
        L_0x0049:
            long r2 = X.AnonymousClass000.A0U(r9)
            r0 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0043
            int r11 = r11 + 8
            int r4 = r4 + r11
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass070.A07(java.lang.Object):void");
    }

    private final int A00(int i) {
        int i2 = this.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0t = AnonymousClass001.A0t(AnonymousClass002.A01(this.A02, i3));
            if (A0t != 0) {
                return (i3 + (Long.numberOfTrailingZeros(A0t) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final int A04(Object obj) {
        Object obj2 = obj;
        int A0E = AnonymousClass001.A0E(AnonymousClass001.A0l(obj2));
        int i = A0E >>> 7;
        int i2 = A0E & StringTreeSet.OFFSET_BASE_ENCODING;
        int i3 = this.A00;
        int i4 = i & i3;
        int i5 = 0;
        while (true) {
            long A01 = AnonymousClass002.A01(this.A02, i4);
            long j = (long) i2;
            long j2 = (j * 72340172838076673L) ^ A01;
            for (long j3 = (j2 ^ -1) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 = AnonymousClass000.A0T(j3)) {
                int A0H = AnonymousClass001.A0H(i4, i3, j3);
                if (C18070vi.A18(this.A03[A0H], obj2)) {
                    return A0H;
                }
            }
            if ((AnonymousClass000.A0U(A01) & -9187201950435737472L) != 0) {
                int A002 = A00(i);
                if (this.A00 == 0) {
                    long[] jArr = this.A02;
                    if (AnonymousClass001.A0x(jArr, A002) != 254) {
                        int i6 = this.A00;
                        AnonymousClass070 r0 = AnonymousClass0GO.A01;
                        int i7 = (i6 * 2) + 1;
                        if (i6 == 0) {
                            i7 = 6;
                        }
                        Object[] objArr = this.A03;
                        Object[] objArr2 = this.A04;
                        A01(this, i7);
                        Object[] objArr3 = this.A03;
                        Object[] objArr4 = this.A04;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (AnonymousClass001.A0x(jArr, i8) < 128) {
                                Object obj3 = objArr[i8];
                                int A0E2 = AnonymousClass001.A0E(AnonymousClass001.A0l(obj3));
                                int A003 = A00(A0E2 >>> 7);
                                long j4 = (long) (A0E2 & StringTreeSet.OFFSET_BASE_ENCODING);
                                long[] jArr2 = this.A02;
                                int i9 = A003 >> 3;
                                int i10 = (A003 & 7) << 3;
                                jArr2[i9] = (jArr2[i9] & ((255 << i10) ^ -1)) | (j4 << i10);
                                int A0E3 = AnonymousClass000.A0E(A003, this.A00);
                                int i11 = A0E3 >> 3;
                                int i12 = (A0E3 & 7) << 3;
                                jArr2[i11] = (jArr2[i11] & ((255 << i12) ^ -1)) | (j4 << i12);
                                objArr3[A003] = obj3;
                                objArr4[A003] = objArr2[i8];
                            }
                        }
                        A002 = A00(i);
                    }
                }
                this.A01++;
                int i13 = this.A00;
                long[] jArr3 = this.A02;
                int i14 = A002 >> 3;
                long j5 = jArr3[i14];
                int i15 = (A002 & 7) << 3;
                this.A00 = i13 - (AnonymousClass000.A1P((((j5 >> i15) & 255) > 128 ? 1 : (((j5 >> i15) & 255) == 128 ? 0 : -1))) ? 1 : 0);
                jArr3[i14] = (j5 & ((255 << i15) ^ -1)) | (j << i15);
                int A0E4 = AnonymousClass000.A0E(A002, this.A00);
                int i16 = A0E4 >> 3;
                int i17 = (A0E4 & 7) << 3;
                jArr3[i16] = (j << i17) | (((255 << i17) ^ -1) & jArr3[i16]);
                return A002 ^ -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void A06(int i) {
        this.A01--;
        long[] jArr = this.A02;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & ((255 << i3) ^ -1)) | (254 << i3);
        int A0E = AnonymousClass000.A0E(i, this.A00);
        int i4 = A0E >> 3;
        int i5 = (A0E & 7) << 3;
        jArr[i4] = (jArr[i4] & ((255 << i5) ^ -1)) | (254 << i5);
        this.A03[i] = null;
        this.A04[i] = null;
    }

    public AnonymousClass070() {
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        A01(this, 6);
    }

    public static final void A01(AnonymousClass070 r3, int i) {
        int A0C = AnonymousClass001.A0C(i);
        r3.A00 = A0C;
        long[] A07 = AnonymousClass002.A07(A0C);
        r3.A02 = A07;
        AnonymousClass002.A06(A07, A0C);
        int i2 = r3.A00;
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        r3.A00 = AnonymousClass001.A0B(i2) - r3.A01;
        r3.A03 = new Object[A0C];
        r3.A04 = new Object[A0C];
    }

    public final void A08(Object obj, Object obj2) {
        int A04 = A04(obj);
        if (A04 < 0) {
            A04 ^= -1;
        }
        this.A03[A04] = obj;
        this.A04[A04] = obj2;
    }
}
