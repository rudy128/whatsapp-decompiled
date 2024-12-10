package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.06z  reason: invalid class name */
public final class AnonymousClass06z extends AnonymousClass0KU {
    public int A00;

    private final int A00(int i) {
        int i2 = this.A00;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long A0t = AnonymousClass001.A0t(AnonymousClass002.A01(this.A03, i3));
            if (A0t != 0) {
                return (i3 + (Long.numberOfTrailingZeros(A0t) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public static final int A01(AnonymousClass06z r24, Object obj) {
        Object obj2 = obj;
        int A0E = AnonymousClass001.A0E(AnonymousClass001.A0l(obj2));
        int i = A0E >>> 7;
        int i2 = A0E & StringTreeSet.OFFSET_BASE_ENCODING;
        AnonymousClass06z r14 = r24;
        int i3 = r14.A00;
        int i4 = i & i3;
        int i5 = 0;
        while (true) {
            long A01 = AnonymousClass002.A01(r14.A03, i4);
            long j = (long) i2;
            long j2 = (j * 72340172838076673L) ^ A01;
            for (long j3 = (j2 ^ -1) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 = AnonymousClass000.A0T(j3)) {
                int A0H = AnonymousClass001.A0H(i4, i3, j3);
                if (C18070vi.A18(r14.A04[A0H], obj2)) {
                    return A0H;
                }
            }
            if ((AnonymousClass000.A0U(A01) & -9187201950435737472L) != 0) {
                int A002 = r14.A00(i);
                if (r14.A00 == 0) {
                    long[] jArr = r14.A03;
                    if (AnonymousClass001.A0x(jArr, A002) != 254) {
                        int i6 = r14.A00;
                        AnonymousClass070 r0 = AnonymousClass0GO.A01;
                        int i7 = (i6 * 2) + 1;
                        if (i6 == 0) {
                            i7 = 6;
                        }
                        Object[] objArr = r14.A04;
                        int[] iArr = r14.A02;
                        A03(r14, i7);
                        Object[] objArr2 = r14.A04;
                        int[] iArr2 = r14.A02;
                        for (int i8 = 0; i8 < i6; i8++) {
                            if (AnonymousClass001.A0x(jArr, i8) < 128) {
                                Object obj3 = objArr[i8];
                                int A0E2 = AnonymousClass001.A0E(AnonymousClass001.A0l(obj3));
                                int A003 = r14.A00(A0E2 >>> 7);
                                long j4 = (long) (A0E2 & StringTreeSet.OFFSET_BASE_ENCODING);
                                long[] jArr2 = r14.A03;
                                int i9 = A003 >> 3;
                                int i10 = (A003 & 7) << 3;
                                jArr2[i9] = (jArr2[i9] & ((255 << i10) ^ -1)) | (j4 << i10);
                                int A0E3 = AnonymousClass000.A0E(A003, r14.A00);
                                int i11 = A0E3 >> 3;
                                int i12 = (A0E3 & 7) << 3;
                                jArr2[i11] = (jArr2[i11] & ((255 << i12) ^ -1)) | (j4 << i12);
                                objArr2[A003] = obj3;
                                iArr2[A003] = iArr[i8];
                            }
                        }
                        A002 = r14.A00(i);
                    }
                }
                r14.A01++;
                int i13 = r14.A00;
                long[] jArr3 = r14.A03;
                int i14 = A002 >> 3;
                long j5 = jArr3[i14];
                int i15 = (A002 & 7) << 3;
                r14.A00 = i13 - (AnonymousClass000.A1P((((j5 >> i15) & 255) > 128 ? 1 : (((j5 >> i15) & 255) == 128 ? 0 : -1))) ? 1 : 0);
                jArr3[i14] = (j5 & ((255 << i15) ^ -1)) | (j << i15);
                int A0E4 = AnonymousClass000.A0E(A002, r14.A00);
                int i16 = A0E4 >> 3;
                int i17 = (A0E4 & 7) << 3;
                jArr3[i16] = (j << i17) | (((255 << i17) ^ -1) & jArr3[i16]);
                return A002 ^ -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.06z, X.0KU] */
    public static AnonymousClass06z A02() {
        ? r1 = new AnonymousClass0KU();
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        A03(r1, 6);
        return r1;
    }

    public final void A05(int i) {
        this.A01--;
        long[] jArr = this.A03;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & ((255 << i3) ^ -1)) | (254 << i3);
        int A0E = AnonymousClass000.A0E(i, this.A00);
        int i4 = A0E >> 3;
        int i5 = (A0E & 7) << 3;
        jArr[i4] = (jArr[i4] & ((255 << i5) ^ -1)) | (254 << i5);
        this.A04[i] = null;
    }

    public AnonymousClass06z() {
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        A03(this, 6);
    }

    public static final void A03(AnonymousClass06z r3, int i) {
        int A0C = AnonymousClass001.A0C(i);
        r3.A00 = A0C;
        long[] A07 = AnonymousClass002.A07(A0C);
        r3.A03 = A07;
        AnonymousClass002.A06(A07, A0C);
        int i2 = r3.A00;
        AnonymousClass070 r0 = AnonymousClass0GO.A01;
        r3.A00 = AnonymousClass001.A0B(i2) - r3.A01;
        r3.A04 = new Object[A0C];
        r3.A02 = new int[A0C];
    }
}
