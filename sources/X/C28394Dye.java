package X;

/* renamed from: X.Dye  reason: case insensitive filesystem */
public class C28394Dye extends DZO {
    public int A00;
    public int[] A01 = new int[16];
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    public C28394Dye() {
        reset();
    }

    public static void A0F(C28394Dye dye, C28394Dye dye2) {
        super.A0R(dye2);
        dye.A02 = dye2.A02;
        dye.A03 = dye2.A03;
        dye.A04 = dye2.A04;
        dye.A05 = dye2.A05;
        int[] iArr = dye2.A01;
        System.arraycopy(iArr, 0, dye.A01, 0, iArr.length);
        dye.A00 = dye2.A00;
    }

    public static void A0G(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public void BJ6(byte[] bArr, int i) {
        A0Q();
        A0G(bArr, this.A02, i);
        A0G(bArr, this.A03, i + 4);
        A0G(bArr, this.A04, i + 8);
        A0G(bArr, this.A05, i + 12);
        reset();
    }

    public String BMl() {
        return "MD5";
    }

    public int BQf() {
        return 16;
    }

    public void CFg(E8N e8n) {
        A0F(this, (C28394Dye) e8n);
    }

    public void reset() {
        super.reset();
        this.A02 = 1732584193;
        this.A03 = -271733879;
        this.A04 = -1732584194;
        this.A05 = 271733878;
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

    public void A0T() {
        int i = this.A02;
        int i2 = i;
        int i3 = this.A03;
        int i4 = this.A04;
        int i5 = this.A05;
        int A08 = DZO.A08(i4, i3, i5, i);
        int[] iArr = this.A01;
        int i6 = iArr[0];
        int A012 = DZO.A01((A08 + i6) - 680876936, i3);
        int A082 = DZO.A08(i3, A012, i4, i5);
        int i7 = iArr[1];
        int i8 = (A082 + i7) - 389564586;
        int A0A = DZO.A0A(i8, 20, i8 << 12, A012);
        int A083 = DZO.A08(A012, A0A, i3, i4);
        int i9 = iArr[2];
        int i10 = A083 + i9 + 606105819;
        int A0A2 = DZO.A0A(i10, 15, i10 << 17, A0A);
        int A084 = DZO.A08(A0A, A0A2, A012, i3);
        int i11 = iArr[3];
        int i12 = (A084 + i11) - 1044525330;
        int A0A3 = DZO.A0A(i12, 10, i12 << 22, A0A2);
        int A085 = DZO.A08(A0A2, A0A3, A0A, A012);
        int i13 = iArr[4];
        int A013 = DZO.A01((A085 + i13) - 176418897, A0A3);
        int A086 = DZO.A08(A0A3, A013, A0A2, A0A);
        int i14 = iArr[5];
        int i15 = A086 + i14 + 1200080426;
        int A0A4 = DZO.A0A(i15, 20, i15 << 12, A013);
        int A087 = DZO.A08(A013, A0A4, A0A3, A0A2);
        int i16 = iArr[6];
        int i17 = (A087 + i16) - 1473231341;
        int A0A5 = DZO.A0A(i17, 15, i17 << 17, A0A4);
        int A088 = DZO.A08(A0A4, A0A5, A013, A0A3);
        int i18 = iArr[7];
        int i19 = (A088 + i18) - 45705983;
        int A0A6 = DZO.A0A(i19, 10, i19 << 22, A0A5);
        int A089 = DZO.A08(A0A5, A0A6, A0A4, A013);
        int i20 = iArr[8];
        int A014 = DZO.A01(A089 + i20 + 1770035416, A0A6);
        int A0810 = DZO.A08(A0A6, A014, A0A5, A0A4);
        int i21 = iArr[9];
        int i22 = (A0810 + i21) - 1958414417;
        int A0A7 = DZO.A0A(i22, 20, i22 << 12, A014);
        int A0811 = DZO.A08(A014, A0A7, A0A6, A0A5);
        int i23 = iArr[10];
        int i24 = (A0811 + i23) - 42063;
        int A0A8 = DZO.A0A(i24, 15, i24 << 17, A0A7);
        int A0812 = DZO.A08(A0A7, A0A8, A014, A0A6);
        int i25 = iArr[11];
        int i26 = (A0812 + i25) - 1990404162;
        int A0A9 = DZO.A0A(i26, 10, i26 << 22, A0A8);
        int A0813 = DZO.A08(A0A8, A0A9, A0A7, A014);
        int i27 = iArr[12];
        int A015 = DZO.A01(A0813 + i27 + 1804603682, A0A9);
        int A0814 = DZO.A08(A0A9, A015, A0A8, A0A7);
        int i28 = iArr[13];
        int i29 = (A0814 + i28) - 40341101;
        int A0A10 = DZO.A0A(i29, 20, i29 << 12, A015);
        int i30 = A0A10 ^ -1;
        int i31 = iArr[14];
        int i32 = ((A0A8 + ((i30 & A0A9) | (A015 & A0A10))) + i31) - 1502002290;
        int A0A11 = DZO.A0A(i32, 15, i32 << 17, A0A10);
        int i33 = A0A11 ^ -1;
        int i34 = iArr[15];
        int i35 = A0A9 + ((i33 & A015) | (A0A10 & A0A11)) + i34 + 1236535329;
        int A0A12 = DZO.A0A(i35, 10, i35 << 22, A0A11);
        int i36 = ((A015 + ((A0A12 & A0A10) | (A0A11 & i30))) + i7) - 165796510;
        int A0A13 = DZO.A0A(i36, 27, i36 << 5, A0A12);
        int A052 = DZO.A05(A0A10 + ((A0A13 & A0A11) | (A0A12 & i33)) + i16, -1069501632, A0A13);
        int A0B = DZO.A0B(A052, A0A12, A0A13, A0A11, i25) + 643717713;
        int A0A14 = DZO.A0A(A0B, 18, A0B << 14, A052);
        int A0B2 = DZO.A0B(A0A14, A0A13, A052, A0A12, i6) - 373897302;
        int A0A15 = DZO.A0A(A0B2, 12, A0B2 << 20, A0A14);
        int A0B3 = DZO.A0B(A0A15, A052, A0A14, A0A13, i14) - 701558691;
        int A0A16 = DZO.A0A(A0B3, 27, A0B3 << 5, A0A15);
        int A053 = DZO.A05(DZO.A0B(A0A16, A0A14, A0A15, A052, i23), 38016083, A0A16);
        int A0B4 = DZO.A0B(A053, A0A15, A0A16, A0A14, i34) - 660478335;
        int A0A17 = DZO.A0A(A0B4, 18, A0B4 << 14, A053);
        int A0B5 = DZO.A0B(A0A17, A0A16, A053, A0A15, i13) - 405537848;
        int A0A18 = DZO.A0A(A0B5, 12, A0B5 << 20, A0A17);
        int A0B6 = DZO.A0B(A0A18, A053, A0A17, A0A16, i21) + 568446438;
        int A0A19 = DZO.A0A(A0B6, 27, A0B6 << 5, A0A18);
        int A054 = DZO.A05(DZO.A0B(A0A19, A0A17, A0A18, A053, i31), -1019803690, A0A19);
        int A0B7 = DZO.A0B(A054, A0A18, A0A19, A0A17, i11) - 187363961;
        int A0A20 = DZO.A0A(A0B7, 18, A0B7 << 14, A054);
        int A0B8 = DZO.A0B(A0A20, A0A19, A054, A0A18, i20) + 1163531501;
        int A0A21 = DZO.A0A(A0B8, 12, A0B8 << 20, A0A20);
        int A0B9 = DZO.A0B(A0A21, A054, A0A20, A0A19, i28) - 1444681467;
        int A0A22 = DZO.A0A(A0B9, 27, A0B9 << 5, A0A21);
        int A055 = DZO.A05(DZO.A0B(A0A22, A0A20, A0A21, A054, i9), -51403784, A0A22);
        int A0B10 = DZO.A0B(A055, A0A21, A0A22, A0A20, i18) + 1735328473;
        int A0A23 = DZO.A0A(A0B10, 18, A0B10 << 14, A055);
        int A0B11 = DZO.A0B(A0A23, A0A22, A055, A0A21, i27) - 1926607734;
        int A0A24 = DZO.A0A(A0B11, 12, A0B11 << 20, A0A23);
        int A0C = DZO.A0C(A0A24, A0A23, A055, A0A22, i14) - 378558;
        int A0A25 = DZO.A0A(A0C, 28, A0C << 4, A0A24);
        int A042 = DZO.A04(DZO.A0C(A0A25, A0A24, A0A23, A055, i20), -2022574463, A0A25);
        int A0C2 = DZO.A0C(A042, A0A25, A0A24, A0A23, i25) + 1839030562;
        int A0A26 = DZO.A0A(A0C2, 16, A0C2 << 16, A042);
        int A0C3 = DZO.A0C(A0A26, A042, A0A25, A0A24, i31) - 35309556;
        int A0A27 = DZO.A0A(A0C3, 9, A0C3 << 23, A0A26);
        int A0C4 = DZO.A0C(A0A27, A0A26, A042, A0A25, i7) - 1530992060;
        int A0A28 = DZO.A0A(A0C4, 28, A0C4 << 4, A0A27);
        int A043 = DZO.A04(DZO.A0C(A0A28, A0A27, A0A26, A042, i13), 1272893353, A0A28);
        int A0C5 = DZO.A0C(A043, A0A28, A0A27, A0A26, i18) - 155497632;
        int A0A29 = DZO.A0A(A0C5, 16, A0C5 << 16, A043);
        int A0C6 = DZO.A0C(A0A29, A043, A0A28, A0A27, i23) - 1094730640;
        int A0A30 = DZO.A0A(A0C6, 9, A0C6 << 23, A0A29);
        int A0C7 = DZO.A0C(A0A30, A0A29, A043, A0A28, i28) + 681279174;
        int A0A31 = DZO.A0A(A0C7, 28, A0C7 << 4, A0A30);
        int A044 = DZO.A04(DZO.A0C(A0A31, A0A30, A0A29, A043, i6), -358537222, A0A31);
        int A0C8 = DZO.A0C(A044, A0A31, A0A30, A0A29, i11) - 722521979;
        int A0A32 = DZO.A0A(A0C8, 16, A0C8 << 16, A044);
        int A0C9 = DZO.A0C(A0A32, A044, A0A31, A0A30, i16) + 76029189;
        int A0A33 = DZO.A0A(A0C9, 9, A0C9 << 23, A0A32);
        int A0C10 = DZO.A0C(A0A33, A0A32, A044, A0A31, i21) - 640364487;
        int A0A34 = DZO.A0A(A0C10, 28, A0C10 << 4, A0A33);
        int A045 = DZO.A04(DZO.A0C(A0A34, A0A33, A0A32, A044, i27), -421815835, A0A34);
        int A0C11 = DZO.A0C(A045, A0A34, A0A33, A0A32, i34) + 530742520;
        int A0A35 = DZO.A0A(A0C11, 16, A0C11 << 16, A045);
        int A0C12 = DZO.A0C(A0A35, A045, A0A34, A0A33, i9) - 995338651;
        int A0A36 = DZO.A0A(A0C12, 9, A0C12 << 23, A0A35);
        int A022 = DZO.A02(DZO.A0D(A045, A0A36, A0A35, A0A34, i6) - 198630844, A0A36);
        int A002 = DZO.A00(DZO.A0D(A0A35, A022, A0A36, A045, i18) + 1126891415) + A022;
        int A032 = DZO.A03(DZO.A0D(A0A36, A002, A022, A0A35, i31), -1416354905, A002);
        int A0D = DZO.A0D(A022, A032, A002, A0A36, i14) - 57434055;
        int A0A37 = DZO.A0A(A0D, 11, A0D << 21, A032);
        int A023 = DZO.A02(DZO.A0D(A002, A0A37, A032, A022, i27) + 1700485571, A0A37);
        int A003 = DZO.A00(DZO.A0D(A032, A023, A0A37, A002, i11) - 1894986606) + A023;
        int A033 = DZO.A03(DZO.A0D(A0A37, A003, A023, A032, i23), -1051523, A003);
        int A0D2 = DZO.A0D(A023, A033, A003, A0A37, i7) - 2054922799;
        int A0A38 = DZO.A0A(A0D2, 11, A0D2 << 21, A033);
        int A024 = DZO.A02(DZO.A0D(A003, A0A38, A033, A023, i20) + 1873313359, A0A38);
        int A004 = DZO.A00(DZO.A0D(A033, A024, A0A38, A003, i34) - 30611744) + A024;
        int A034 = DZO.A03(DZO.A0D(A0A38, A004, A024, A033, i16), -1560198380, A004);
        int A0D3 = DZO.A0D(A024, A034, A004, A0A38, i28) + 1309151649;
        int A0A39 = DZO.A0A(A0D3, 11, A0D3 << 21, A034);
        int A025 = DZO.A02(DZO.A0D(A004, A0A39, A034, A024, i13) - 145523070, A0A39);
        int A005 = DZO.A00(DZO.A0D(A034, A025, A0A39, A004, i25) - 1120210379) + A025;
        int A035 = DZO.A03(DZO.A0D(A0A39, A005, A025, A034, i9), 718787259, A005);
        int A0D4 = DZO.A0D(A025, A035, A005, A0A39, i21) - 343485551;
        int A0A40 = DZO.A0A(A0D4, 11, A0D4 << 21, A035);
        this.A02 = i2 + A025;
        this.A03 = i3 + A0A40;
        this.A04 = i4 + A035;
        this.A05 = i5 + A005;
        this.A00 = 0;
        for (int i37 = 0; i37 != iArr.length; i37++) {
            iArr[i37] = 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dye, X.E8N, X.DZO] */
    public E8N BFx() {
        ? dzo = new DZO(this);
        dzo.A01 = new int[16];
        A0F(dzo, this);
        return dzo;
    }
}
