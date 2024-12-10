package X;

/* renamed from: X.Dyf  reason: case insensitive filesystem */
public class C28395Dyf extends DZO {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int[] A01 = new int[64];
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;

    public C28395Dyf() {
        reset();
    }

    public static int A0F(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private void A0H(C28395Dyf dyf) {
        super.A0R(dyf);
        this.A02 = dyf.A02;
        this.A03 = dyf.A03;
        this.A04 = dyf.A04;
        this.A05 = dyf.A05;
        this.A06 = dyf.A06;
        this.A07 = dyf.A07;
        this.A08 = dyf.A08;
        this.A09 = dyf.A09;
        int[] iArr = dyf.A01;
        System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
        this.A00 = dyf.A00;
    }

    public void BJ6(byte[] bArr, int i) {
        A0Q();
        C26210Cuo.A02(bArr, this.A02, i);
        C26210Cuo.A02(bArr, this.A03, i + 4);
        C26210Cuo.A02(bArr, this.A04, i + 8);
        C26210Cuo.A02(bArr, this.A05, i + 12);
        C26210Cuo.A02(bArr, this.A06, i + 16);
        C26210Cuo.A02(bArr, this.A07, i + 20);
        C26210Cuo.A02(bArr, this.A08, i + 24);
        reset();
    }

    public String BMl() {
        return "SHA-224";
    }

    public int BQf() {
        return 28;
    }

    public void CFg(E8N e8n) {
        A0H((C28395Dyf) e8n);
    }

    public void reset() {
        super.reset();
        this.A02 = -1056596264;
        this.A03 = 914150663;
        this.A04 = 812702999;
        this.A05 = -150054599;
        this.A06 = -4191439;
        this.A07 = 1750603025;
        this.A08 = 1694076839;
        this.A09 = -1090891868;
        this.A00 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public static int A0G(int[] iArr, int i, int i2, int i3, int i4) {
        return (((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)))) + (((i ^ -1) & i3) ^ (i2 & i)) + iArr[i4];
    }

    public void A0T() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A01;
            DZO.A0E(iArr, i);
            i++;
        } while (i <= 63);
        int i2 = this.A02;
        int i3 = i2;
        int i4 = this.A03;
        int i5 = i4;
        int i6 = this.A04;
        int i7 = i6;
        int i8 = this.A05;
        int i9 = i8;
        int i10 = this.A06;
        int i11 = i10;
        int i12 = this.A07;
        int i13 = i12;
        int i14 = this.A08;
        int i15 = i14;
        int i16 = this.A09;
        int i17 = i16;
        int i18 = 0;
        int i19 = 0;
        do {
            int[] iArr2 = A0A;
            int A0J = BE6.A0J(iArr, i19, (((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)))) + (((i10 ^ -1) & i14) ^ (i12 & i10)) + iArr2[i19], i16);
            int i20 = i8 + A0J;
            int i21 = i2 & i4;
            int A0F = A0J + A0F(i2) + (((i2 & i6) ^ i21) ^ (i4 & i6));
            int i22 = i19 + 1;
            int A0J2 = BE6.A0J(iArr, i22, A0G(iArr2, i20, i10, i12, i22), i14);
            int i23 = i6 + A0J2;
            int i24 = A0F & i2;
            int A092 = A0J2 + DZO.A09(A0F & i4, i24, i21, A0F(A0F));
            int i25 = i22 + 1;
            int A0J3 = BE6.A0J(iArr, i25, A0G(iArr2, i23, i20, i10, i25), i12);
            int i26 = i4 + A0J3;
            int i27 = A092 & A0F;
            int A093 = A0J3 + DZO.A09(A092 & i2, i27, i24, A0F(A092));
            int i28 = i25 + 1;
            int A0J4 = BE6.A0J(iArr, i28, A0G(iArr2, i26, i23, i20, i28), i10);
            int i29 = i2 + A0J4;
            int i30 = A093 & A092;
            int A094 = A0J4 + DZO.A09(A093 & A0F, i30, i27, A0F(A093));
            int i31 = i28 + 1;
            int A0J5 = BE6.A0J(iArr, i31, A0G(iArr2, i29, i26, i23, i31), i20);
            i16 = A0F + A0J5;
            int i32 = A094 & A093;
            i8 = A0J5 + DZO.A09(A094 & A092, i32, i30, A0F(A094));
            int i33 = i31 + 1;
            int A0J6 = BE6.A0J(iArr, i33, A0G(iArr2, i16, i29, i26, i33), i23);
            i14 = A092 + A0J6;
            int i34 = i8 & A094;
            i6 = A0J6 + DZO.A09(i8 & A093, i34, i32, A0F(i8));
            int i35 = i33 + 1;
            int A0J7 = BE6.A0J(iArr, i35, A0G(iArr2, i14, i16, i29, i35), i26);
            i12 = A093 + A0J7;
            int i36 = i6 & i8;
            i4 = A0J7 + DZO.A09(i6 & A094, i36, i34, A0F(i6));
            int i37 = i35 + 1;
            int A0J8 = BE6.A0J(iArr, i37, A0G(iArr2, i12, i14, i16, i37), i29);
            i10 = A094 + A0J8;
            int i38 = i4 & i8;
            i2 = A0J8 + DZO.A09(i38, i4 & i6, i36, A0F(i4));
            i19 = i37 + 1;
            i18++;
        } while (i18 < 8);
        this.A02 = i3 + i2;
        this.A03 = i5 + i4;
        this.A04 = i7 + i6;
        this.A05 = i9 + i8;
        this.A06 = i11 + i10;
        this.A07 = i13 + i12;
        this.A08 = i15 + i14;
        this.A09 = i17 + i16;
        this.A00 = 0;
        int i39 = 0;
        do {
            iArr[i39] = 0;
            i39++;
        } while (i39 < 16);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dyf, X.E8N, X.DZO] */
    public E8N BFx() {
        ? dzo = new DZO(this);
        dzo.A01 = new int[64];
        dzo.A0H(this);
        return dzo;
    }
}
