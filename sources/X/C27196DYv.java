package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.DYv  reason: case insensitive filesystem */
public class C27196DYv implements C28600E9r {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public final E9Y A0J;
    public final byte[] A0K;
    public final byte[] A0L;

    public C27196DYv() {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A0D = 0;
        this.A0J = null;
    }

    public int BUJ() {
        return 16;
    }

    public void CQK(byte b) {
        byte[] bArr = this.A0L;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    public void reset() {
        this.A0D = 0;
        this.A0I = 0;
        this.A0H = 0;
        this.A0G = 0;
        this.A0F = 0;
        this.A0E = 0;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            int i4 = this.A0D;
            if (i4 == 16) {
                A02();
                this.A0D = 0;
                i4 = 0;
            }
            int A092 = BE6.A09(16, i4, i2 - i3);
            System.arraycopy(bArr, i3 + i, this.A0K, i4, A092);
            i3 += A092;
            this.A0D += A092;
        }
    }

    private void A02() {
        int i = this.A0D;
        int i2 = i;
        if (i < 16) {
            byte[] bArr = this.A0K;
            bArr[i] = 1;
            while (true) {
                i++;
                if (i >= 16) {
                    break;
                }
                bArr[i] = 0;
            }
        }
        byte[] bArr2 = this.A0K;
        long A0A2 = ((long) BEB.A0A(bArr2, 0)) & 4294967295L;
        long A0A3 = ((long) BEB.A0A(bArr2, 4)) & 4294967295L;
        long A0A4 = ((long) BEB.A0A(bArr2, 8)) & 4294967295L;
        long A0A5 = 4294967295L & ((long) BEB.A0A(bArr2, 12));
        int i3 = (int) (((long) this.A0E) + (A0A2 & 67108863));
        this.A0E = i3;
        int i4 = (int) (((long) this.A0F) + ((((A0A3 << 32) | A0A2) >>> 26) & 67108863));
        int i5 = i4;
        this.A0F = i4;
        int i6 = (int) (((long) this.A0G) + (((A0A3 | (A0A4 << 32)) >>> 20) & 67108863));
        int i7 = i6;
        this.A0G = i6;
        int i8 = (int) (((long) this.A0H) + ((((A0A5 << 32) | A0A4) >>> 14) & 67108863));
        this.A0H = i8;
        int i9 = (int) (((long) this.A0I) + (A0A5 >>> 8));
        this.A0I = i9;
        if (i2 == 16) {
            i9 += EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            this.A0I = i9;
        }
        int i10 = this.A04;
        long A0C2 = BE7.A0C(i3) * ((long) i10);
        int i11 = this.A0C;
        long A012 = A01(i5, i11, A0C2);
        int i12 = this.A0B;
        long A013 = A01(i7, i12, A012);
        int i13 = this.A0A;
        long A014 = A01(i9, this.A09, A01(i8, i13, A013));
        int i14 = this.A05;
        long A015 = A01(i9, i13, A01(i8, i12, A01(i7, i11, A01(i5, i10, BE7.A0C(i3) * ((long) i14)))));
        int i15 = this.A06;
        long A016 = A01(i9, i12, A01(i8, i11, A01(i7, i10, A01(i5, i14, BE7.A0C(i3) * ((long) i15)))));
        int i16 = this.A07;
        long A017 = A01(i9, i11, A01(i8, i10, A01(i7, i14, A01(i5, i15, BE7.A0C(i3) * ((long) i16)))));
        long A018 = A01(i9, i10, A01(i8, i14, A01(i7, i15, A01(i5, i16, BE7.A0C(i3) * ((long) this.A08)))));
        long j = A015 + (A014 >>> 26);
        long j2 = A016 + (j >>> 26);
        this.A0G = ((int) j2) & 67108863;
        long j3 = A017 + (j2 >>> 26);
        this.A0H = ((int) j3) & 67108863;
        long j4 = A018 + (j3 >>> 26);
        this.A0I = ((int) j4) & 67108863;
        int i17 = (((int) A014) & 67108863) + (((int) (j4 >>> 26)) * 5);
        this.A0F = (((int) j) & 67108863) + (i17 >>> 26);
        this.A0E = i17 & 67108863;
    }

    public void BJ5(byte[] bArr, int i) {
        if (i + 16 <= bArr.length) {
            if (this.A0D > 0) {
                A02();
            }
            int i2 = this.A0F;
            int i3 = this.A0E;
            int i4 = i2 + (i3 >>> 26);
            int i5 = this.A0G + (i4 >>> 26);
            int i6 = this.A0H + (i5 >>> 26);
            int i7 = i5 & 67108863;
            int i8 = this.A0I + (i6 >>> 26);
            int i9 = i6 & 67108863;
            int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
            int i11 = i8 & 67108863;
            int i12 = (i4 & 67108863) + (i10 >>> 26);
            int i13 = i10 & 67108863;
            int i14 = i13 + 5;
            int i15 = (i14 >>> 26) + i12;
            int i16 = (i15 >>> 26) + i7;
            int i17 = (i16 >>> 26) + i9;
            int i18 = 67108863 & i17;
            int i19 = ((i17 >>> 26) + i11) - 67108864;
            int i20 = (i19 >>> 31) - 1;
            int i21 = i20 ^ -1;
            int i22 = (i13 & i21) | (i14 & 67108863 & i20);
            this.A0E = i22;
            int i23 = (i12 & i21) | (i15 & 67108863 & i20);
            this.A0F = i23;
            int i24 = (i7 & i21) | (i16 & 67108863 & i20);
            this.A0G = i24;
            int i25 = (i18 & i20) | (i9 & i21);
            this.A0H = i25;
            int i26 = (i11 & i21) | (i19 & i20);
            this.A0I = i26;
            long j = (((long) (i22 | (i23 << 26))) & 4294967295L) + (((long) this.A00) & 4294967295L);
            long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.A01) & 4294967295L);
            long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.A02) & 4294967295L);
            BEB.A1T(bArr, (int) j, i);
            long j4 = j2 + (j >>> 32);
            BEB.A1T(bArr, (int) j4, i + 4);
            long j5 = j3 + (j4 >>> 32);
            BEB.A1T(bArr, (int) j5, i + 8);
            BEB.A1T(bArr, (int) ((((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (4294967295L & ((long) this.A03)) + (j5 >>> 32)), i + 12);
            reset();
            return;
        }
        throw new C28380DyQ("Output buffer is too short.");
    }

    public void BdA(E3O e3o) {
        byte[] bArr;
        E9Y e9y = this.A0J;
        if (e9y == null) {
            bArr = null;
        } else if (e3o instanceof DYm) {
            DYm dYm = (DYm) e3o;
            bArr = dYm.A01;
            e3o = dYm.A00;
        } else {
            throw AnonymousClass000.A0k("Poly1305 requires an IV when used with a block cipher.");
        }
        if (e3o instanceof C27190DYo) {
            byte[] bArr2 = ((C27190DYo) e3o).A00;
            if (bArr2.length == 32) {
                int i = 16;
                if (e9y == null || (bArr != null && bArr.length == 16)) {
                    int A0A2 = BEB.A0A(bArr2, 0);
                    int A0A3 = BEB.A0A(bArr2, 4);
                    int A0A4 = BEB.A0A(bArr2, 8);
                    int A0A5 = BEB.A0A(bArr2, 12);
                    this.A04 = 67108863 & A0A2;
                    int i2 = ((A0A2 >>> 26) | (A0A3 << 6)) & 67108611;
                    this.A05 = i2;
                    int i3 = ((A0A3 >>> 20) | (A0A4 << 12)) & 67092735;
                    this.A06 = i3;
                    int i4 = ((A0A4 >>> 14) | (A0A5 << 18)) & 66076671;
                    this.A07 = i4;
                    int i5 = (A0A5 >>> 8) & 1048575;
                    this.A08 = i5;
                    this.A09 = i2 * 5;
                    this.A0A = i3 * 5;
                    this.A0B = i4 * 5;
                    this.A0C = i5 * 5;
                    if (e9y != null) {
                        byte[] bArr3 = new byte[16];
                        e9y.BdC(new C27190DYo(bArr2, 16, 16), true);
                        e9y.CCe(bArr, bArr3, 0, 0);
                        bArr2 = bArr3;
                        i = 0;
                    }
                    this.A00 = BEB.A0A(bArr2, i);
                    this.A01 = BEB.A0A(bArr2, i + 4);
                    this.A02 = BEB.A0A(bArr2, i + 8);
                    this.A03 = BEB.A0A(bArr2, i + 12);
                    reset();
                    return;
                }
                throw AnonymousClass000.A0k("Poly1305 requires a 128 bit IV.");
            }
            throw AnonymousClass000.A0k("Poly1305 key must be 256 bits.");
        }
        throw AnonymousClass000.A0k("Poly1305 requires a key.");
    }

    public C27196DYv(E9Y e9y) {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A0D = 0;
        if (e9y.BNR() == 16) {
            this.A0J = e9y;
            return;
        }
        throw AnonymousClass000.A0k("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long A00(int i, int i2) {
        return BE7.A0C(i) * ((long) i2);
    }

    public static long A01(int i, int i2, long j) {
        return j + A00(i, i2);
    }
}
