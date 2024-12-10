package X;

/* renamed from: X.Dyi  reason: case insensitive filesystem */
public class C28398Dyi extends DZO {
    public int A00;
    public int[] A01 = new int[16];
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;

    public C28398Dyi() {
        reset();
    }

    public static int A0F(int i, int i2, int i3) {
        int i4 = i + i2;
        return ((i4 >>> 17) | (i4 << 15)) + i3;
    }

    public static int A0G(int i, int i2, int i3, int i4) {
        int i5 = i + i2 + i3;
        return ((i5 >>> 27) | (i5 << 5)) + i4;
    }

    public static int A0K(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3 + i4;
        return ((i6 >>> 26) | (i6 << 6)) + i5;
    }

    public static int A0L(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3 + i4;
        return ((i6 >>> 25) | (i6 << 7)) + i5;
    }

    public static int A0M(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3 + i4;
        return ((i6 >>> 24) | (i6 << 8)) + i5;
    }

    public static int A0N(int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2 + i3 + i4;
        return ((i6 >>> 19) | (i6 << 13)) + i5;
    }

    private void A0O(C28398Dyi dyi) {
        super.A0R(dyi);
        this.A02 = dyi.A02;
        this.A03 = dyi.A03;
        this.A04 = dyi.A04;
        this.A05 = dyi.A05;
        this.A06 = dyi.A06;
        int[] iArr = dyi.A01;
        System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
        this.A00 = dyi.A00;
    }

    public static void A0P(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public void BJ6(byte[] bArr, int i) {
        A0Q();
        A0P(bArr, this.A02, i);
        A0P(bArr, this.A03, i + 4);
        A0P(bArr, this.A04, i + 8);
        A0P(bArr, this.A05, i + 12);
        A0P(bArr, this.A06, i + 16);
        reset();
    }

    public String BMl() {
        return "RIPEMD160";
    }

    public int BQf() {
        return 20;
    }

    public void CFg(E8N e8n) {
        A0O((C28398Dyi) e8n);
    }

    public void reset() {
        super.reset();
        this.A02 = 1732584193;
        this.A03 = -271733879;
        this.A04 = -1732584194;
        this.A05 = 271733878;
        this.A06 = -1009589776;
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

    public static int A0H(int i, int i2, int i3, int i4) {
        return i4 + (i3 ^ (i2 | (i ^ -1)));
    }

    public static int A0I(int i, int i2, int i3, int i4) {
        int i5 = i + i2 + i3;
        return ((i5 >>> 18) | (i5 << 14)) + i4;
    }

    public static int A0J(int i, int i2, int i3, int i4) {
        int i5 = i + i2 + i3;
        return ((i5 >>> 20) | (i5 << 12)) + i4;
    }

    public void A0T() {
        int i = this.A02;
        int i2 = this.A03;
        int i3 = this.A04;
        int i4 = this.A05;
        int i5 = this.A06;
        int i6 = i5;
        int[] iArr = this.A01;
        int A0I = BE6.A0I(iArr);
        int i7 = ((i2 ^ i3) ^ i4) + i + A0I;
        int A0A = DZO.A0A(i7, 21, i7 << 11, i5);
        int A002 = DZO.A00(i3);
        int i8 = iArr[1];
        int i9 = ((A0A ^ i2) ^ A002) + i5 + i8;
        int A0A2 = DZO.A0A(i9, 18, i9 << 14, i4);
        int A003 = DZO.A00(i2);
        int i10 = iArr[2];
        int A0F = A0F(((A0A2 ^ A0A) ^ A003) + i4, i10, A002);
        int A004 = DZO.A00(A0A);
        int A09 = DZO.A09(A0F, A0A2, A004, A002);
        int i11 = iArr[3];
        int i12 = A09 + i11;
        int A0A3 = DZO.A0A(i12, 20, i12 << 12, A003);
        int A005 = DZO.A00(A0A2);
        int A092 = DZO.A09(A0A3, A0F, A005, A003);
        int i13 = iArr[4];
        int i14 = A092 + i13;
        int A0A4 = DZO.A0A(i14, 27, i14 << 5, A004);
        int A006 = DZO.A00(A0F);
        int A093 = DZO.A09(A0A4, A0A3, A006, A004);
        int i15 = iArr[5];
        int i16 = A093 + i15;
        int A0A5 = DZO.A0A(i16, 24, i16 << 8, A005);
        int A007 = DZO.A00(A0A3);
        int A094 = DZO.A09(A0A5, A0A4, A007, A005);
        int i17 = iArr[6];
        int A012 = DZO.A01(A094 + i17, A006);
        int A008 = DZO.A00(A0A4);
        int A095 = DZO.A09(A012, A0A5, A008, A006);
        int i18 = iArr[7];
        int i19 = A095 + i18;
        int A0A6 = DZO.A0A(i19, 23, i19 << 9, A007);
        int A009 = DZO.A00(A0A5);
        int A096 = DZO.A09(A0A6, A012, A009, A007);
        int i20 = iArr[8];
        int A042 = DZO.A04(A096, i20, A008);
        int A0010 = DZO.A00(A012);
        int A097 = DZO.A09(A042, A0A6, A0010, A008);
        int i21 = iArr[9];
        int i22 = A097 + i21;
        int A0A7 = DZO.A0A(i22, 19, i22 << 13, A009);
        int A0011 = DZO.A00(A0A6);
        int A098 = DZO.A09(A0A7, A042, A0011, A009);
        int i23 = iArr[10];
        int i24 = A098 + i23;
        int A0A8 = DZO.A0A(i24, 18, i24 << 14, A0010);
        int A0012 = DZO.A00(A042);
        int A099 = DZO.A09(A0A8, A0A7, A0012, A0010);
        int i25 = iArr[11];
        int A0F2 = A0F(A099, i25, A0011);
        int A0013 = DZO.A00(A0A7);
        int A0910 = DZO.A09(A0F2, A0A8, A0013, A0011);
        int i26 = iArr[12];
        int A022 = DZO.A02(A0910 + i26, A0012);
        int A0014 = DZO.A00(A0A8);
        int A0911 = DZO.A09(A022, A0F2, A0014, A0012);
        int i27 = iArr[13];
        int A013 = DZO.A01(A0911 + i27, A0013);
        int A0015 = DZO.A00(A0F2);
        int A0912 = DZO.A09(A013, A022, A0015, A0013);
        int i28 = iArr[14];
        int A052 = DZO.A05(A0912, i28, A0014);
        int A0016 = DZO.A00(A022);
        int A0913 = DZO.A09(A052, A013, A0016, A0014);
        int i29 = iArr[15];
        int i30 = A0913 + i29;
        int A0A9 = DZO.A0A(i30, 24, i30 << 8, A0015);
        int A0017 = DZO.A00(A013);
        int A0H = A0H(i4, i3, i2, i) + i15 + 1352829926;
        int i31 = i6;
        int A0A10 = DZO.A0A(A0H, 24, A0H << 8, i31);
        int A053 = DZO.A05(A0H(A002, i2, A0A10, i31) + i28, 1352829926, i4);
        int A054 = DZO.A05(A0H(A003, A0A10, A053, i4) + i18, 1352829926, A002);
        int A0018 = DZO.A00(A0A10);
        int A043 = DZO.A04(A0H(A0018, A053, A054, A002) + A0I, 1352829926, A003);
        int A0019 = DZO.A00(A053);
        int A0N = A0N(A003, A043 ^ ((A0019 ^ -1) | A054), i21, 1352829926, A0018);
        int A0020 = DZO.A00(A054);
        int A032 = DZO.A03(A0H(A0020, A043, A0N, A0018) + i10, 1352829926, A0019);
        int A0021 = DZO.A00(A043);
        int A033 = DZO.A03(A0H(A0021, A0N, A032, A0019) + i25, 1352829926, A0020);
        int A0022 = DZO.A00(A0N);
        int A0G = A0G(A0H(A0022, A032, A033, A0020), i13, 1352829926, A0021);
        int A0023 = DZO.A00(A032);
        int A0L = A0L(A0021, A0G ^ ((A0023 ^ -1) | A033), i27, 1352829926, A0022);
        int A0024 = DZO.A00(A033);
        int A0L2 = A0L(A0022, A0L ^ (A0G | (A0024 ^ -1)), i17, 1352829926, A0023);
        int A0025 = DZO.A00(A0G);
        int A0M = A0M(A0023, A0L2 ^ ((A0025 ^ -1) | A0L), i29, 1352829926, A0024);
        int A0026 = DZO.A00(A0L);
        int A044 = DZO.A04(A0H(A0026, A0L2, A0M, A0024) + i20, 1352829926, A0025);
        int A0027 = DZO.A00(A0L2);
        int A0I2 = A0I(A0H(A0027, A0M, A044, A0025), i8, 1352829926, A0026);
        int A0028 = DZO.A00(A0M);
        int A0I3 = A0I(A0H(A0028, A044, A0I2, A0026), i23, 1352829926, A0027);
        int A0029 = DZO.A00(A044);
        int A0J = A0J(A0H(A0029, A0I2, A0I3, A0027), i11, 1352829926, A0028);
        int A0030 = DZO.A00(A0I2);
        int A0K = A0K(A0028, A0J ^ ((A0030 ^ -1) | A0I3), i26, 1352829926, A0029);
        int A0031 = DZO.A00(A0I3);
        int A014 = DZO.A01(DZO.A08(A052, A0A9, A0017, A0015) + i18 + 1518500249, A0016);
        int A0032 = DZO.A00(A052);
        int A0K2 = A0K(A0016, BE8.A08(A0A9, A014, A0032), i13, 1518500249, A0017);
        int A0033 = DZO.A00(A0A9);
        int A0M2 = A0M(A0017, BE8.A08(A014, A0K2, A0033), i27, 1518500249, A0032);
        int A0034 = DZO.A00(A014);
        int A0N2 = A0N(A0032, BE8.A08(A0K2, A0M2, A0034), i8, 1518500249, A0033);
        int A0035 = DZO.A00(A0K2);
        int A045 = DZO.A04(DZO.A08(A0M2, A0N2, A0035, A0033) + i23, 1518500249, A0034);
        int A0036 = DZO.A00(A0M2);
        int A055 = DZO.A05(DZO.A08(A0N2, A045, A0036, A0034) + i17, 1518500249, A0035);
        int A0037 = DZO.A00(A0N2);
        int A0L3 = A0L(A0035, BE8.A08(A045, A055, A0037), i29, 1518500249, A0036);
        int A0038 = DZO.A00(A045);
        int A034 = DZO.A03(DZO.A08(A055, A0L3, A0038, A0036) + i11, 1518500249, A0037);
        int A0039 = DZO.A00(A055);
        int A0L4 = A0L(A0037, BE8.A08(A0L3, A034, A0039), i26, 1518500249, A0038);
        int A0040 = DZO.A00(A0L3);
        int A0J2 = A0J(DZO.A08(A034, A0L4, A0040, A0038), A0I, 1518500249, A0039);
        int A0041 = DZO.A00(A034);
        int A035 = DZO.A03(DZO.A08(A0L4, A0J2, A0041, A0039) + i21, 1518500249, A0040);
        int A0042 = DZO.A00(A0L4);
        int A056 = DZO.A05(DZO.A08(A0J2, A035, A0042, A0040) + i15, 1518500249, A0041);
        int A0043 = DZO.A00(A0J2);
        int A046 = DZO.A04(DZO.A08(A035, A056, A0043, A0041) + i10, 1518500249, A0042);
        int A0044 = DZO.A00(A035);
        int A0L5 = A0L(A0042, BE8.A08(A056, A046, A0044), i28, 1518500249, A0043);
        int A0045 = DZO.A00(A056);
        int A0N3 = A0N(A0043, BE8.A08(A046, A0L5, A0045), i25, 1518500249, A0044);
        int A0046 = DZO.A00(A046);
        int i32 = A0N3 ^ -1;
        int A0J3 = A0J(A0044 + ((i32 & A0046) | (A0L5 & A0N3)), i20, 1518500249, A0045);
        int A0047 = DZO.A00(A0L5);
        int A057 = DZO.A05(DZO.A0B(A0K, A0031, A0J, A0029, i17), 1548603684, A0030);
        int A0048 = DZO.A00(A0J);
        int A0N4 = A0N(A0030, DZO.A06(A057, A0048, A0K), i25, 1548603684, A0031);
        int A0049 = DZO.A00(A0K);
        int A0F3 = A0F(DZO.A0B(A0N4, A0049, A057, A0031, i11), 1548603684, A0048);
        int A0050 = DZO.A00(A057);
        int A0L6 = A0L(A0048, DZO.A06(A0F3, A0050, A0N4), i18, 1548603684, A0049);
        int A0051 = DZO.A00(A0N4);
        int A0J4 = A0J(A0049 + DZO.A06(A0L6, A0051, A0F3), A0I, 1548603684, A0050);
        int A0052 = DZO.A00(A0F3);
        int A0M3 = A0M(A0050, DZO.A06(A0J4, A0052, A0L6), i27, 1548603684, A0051);
        int A0053 = DZO.A00(A0L6);
        int A058 = DZO.A05(DZO.A0B(A0M3, A0053, A0J4, A0051, i15), 1548603684, A0052);
        int A0054 = DZO.A00(A0J4);
        int A047 = DZO.A04(DZO.A0B(A058, A0054, A0M3, A0052, i23), 1548603684, A0053);
        int A0055 = DZO.A00(A0M3);
        int A0L7 = A0L(A0053, DZO.A06(A047, A0055, A058), i28, 1548603684, A0054);
        int A0056 = DZO.A00(A058);
        int A0L8 = A0L(A0054, DZO.A06(A0L7, A0056, A047), i29, 1548603684, A0055);
        int A0057 = DZO.A00(A047);
        int A0J5 = A0J(A0055 + DZO.A06(A0L8, A0057, A0L7), i20, 1548603684, A0056);
        int A0058 = DZO.A00(A0L7);
        int A0L9 = A0L(A0056, DZO.A06(A0J5, A0058, A0L8), i26, 1548603684, A0057);
        int A0059 = DZO.A00(A0L8);
        int A0K3 = A0K(A0057, DZO.A06(A0L9, A0059, A0J5), i13, 1548603684, A0058);
        int A0060 = DZO.A00(A0J5);
        int A0F4 = A0F(DZO.A0B(A0K3, A0060, A0L9, A0058, i21), 1548603684, A0059);
        int A0061 = DZO.A00(A0L9);
        int A0N5 = A0N(A0059, DZO.A06(A0F4, A0061, A0K3), i8, 1548603684, A0060);
        int A0062 = DZO.A00(A0K3);
        int A048 = DZO.A04(DZO.A0B(A0N5, A0062, A0F4, A0060, i10), 1548603684, A0061);
        int A0063 = DZO.A00(A0F4);
        int A049 = DZO.A04(A0045 + ((A0J3 | i32) ^ A0047) + i11, 1859775393, A0046);
        int A0064 = DZO.A00(A0N3);
        int A0N6 = A0N(A0046, (A049 | (A0J3 ^ -1)) ^ A0064, i23, 1859775393, A0047);
        int A0065 = DZO.A00(A0J3);
        int A0K4 = A0K(A0047, (A0N6 | (A049 ^ -1)) ^ A0065, i28, 1859775393, A0064);
        int A0066 = DZO.A00(A049);
        int A0L10 = A0L(A0064, (A0K4 | (A0N6 ^ -1)) ^ A0066, i13, 1859775393, A0065);
        int A0067 = DZO.A00(A0N6);
        int A0I4 = A0I(DZO.A07(A0K4, A0L10, A0067, A0065), i21, 1859775393, A0066);
        int A0068 = DZO.A00(A0K4);
        int A059 = DZO.A05(DZO.A0D(A0L10, A0I4, A0068, A0066, i29), 1859775393, A0067);
        int A0069 = DZO.A00(A0L10);
        int A0N7 = A0N(A0067, (A059 | (A0I4 ^ -1)) ^ A0069, i20, 1859775393, A0068);
        int A0070 = DZO.A00(A0I4);
        int A0F5 = A0F(DZO.A0D(A059, A0N7, A0070, A0068, i8), 1859775393, A0069);
        int A0071 = DZO.A00(A059);
        int A0I5 = A0I(DZO.A07(A0N7, A0F5, A0071, A0069), i10, 1859775393, A0070);
        int A0072 = DZO.A00(A0N7);
        int A0M4 = A0M(A0070, (A0I5 | (A0F5 ^ -1)) ^ A0072, i18, 1859775393, A0071);
        int A0073 = DZO.A00(A0F5);
        int A0N8 = A0N(A0071, (A0M4 | (A0I5 ^ -1)) ^ A0073, A0I, 1859775393, A0072);
        int A0074 = DZO.A00(A0I5);
        int A0K5 = A0K(A0072, (A0N8 | (A0M4 ^ -1)) ^ A0074, i17, 1859775393, A0073);
        int A0075 = DZO.A00(A0M4);
        int A0G2 = A0G(DZO.A07(A0N8, A0K5, A0075, A0073), i27, 1859775393, A0074);
        int A0076 = DZO.A00(A0N8);
        int A0J6 = A0J(DZO.A07(A0K5, A0G2, A0076, A0074), i25, 1859775393, A0075);
        int A0077 = DZO.A00(A0K5);
        int A0L11 = A0L(A0075, (A0J6 | (A0G2 ^ -1)) ^ A0077, i15, 1859775393, A0076);
        int A0078 = DZO.A00(A0G2);
        int A0G3 = A0G(DZO.A07(A0J6, A0L11, A0078, A0076), i26, 1859775393, A0077);
        int A0079 = DZO.A00(A0J6);
        int A0510 = DZO.A05(DZO.A0D(A0N5, A048, A0063, A0061, i29), 1836072691, A0062);
        int A0080 = DZO.A00(A0N5);
        int A0L12 = A0L(A0062, (A0510 | (A048 ^ -1)) ^ A0080, i15, 1836072691, A0063);
        int A0081 = DZO.A00(A048);
        int A0F6 = A0F(DZO.A0D(A0510, A0L12, A0081, A0063, i8), 1836072691, A0080);
        int A0082 = DZO.A00(A0510);
        int A0410 = DZO.A04(DZO.A0D(A0L12, A0F6, A0082, A0080, i11), 1836072691, A0081);
        int A0083 = DZO.A00(A0L12);
        int A0M5 = A0M(A0081, (A0410 | (A0F6 ^ -1)) ^ A0083, i18, 1836072691, A0082);
        int A0084 = DZO.A00(A0F6);
        int A0K6 = A0K(A0082, (A0M5 | (A0410 ^ -1)) ^ A0084, i28, 1836072691, A0083);
        int A0085 = DZO.A00(A0410);
        int A0K7 = A0K(A0083, (A0K6 | (A0M5 ^ -1)) ^ A0085, i17, 1836072691, A0084);
        int A0086 = DZO.A00(A0M5);
        int A0I6 = A0I(DZO.A07(A0K6, A0K7, A0086, A0084), i21, 1836072691, A0085);
        int A0087 = DZO.A00(A0K6);
        int A0J7 = A0J(DZO.A07(A0K7, A0I6, A0087, A0085), i25, 1836072691, A0086);
        int A0088 = DZO.A00(A0K7);
        int A0N9 = A0N(A0086, (A0J7 | (A0I6 ^ -1)) ^ A0088, i20, 1836072691, A0087);
        int A0089 = DZO.A00(A0I6);
        int A0G4 = A0G(DZO.A07(A0J7, A0N9, A0089, A0087), i26, 1836072691, A0088);
        int A0090 = DZO.A00(A0J7);
        int A0I7 = A0I(DZO.A07(A0N9, A0G4, A0090, A0088), i10, 1836072691, A0089);
        int A0091 = DZO.A00(A0N9);
        int A0N10 = A0N(A0089, (A0I7 | (A0G4 ^ -1)) ^ A0091, i23, 1836072691, A0090);
        int A0092 = DZO.A00(A0G4);
        int A0N11 = A0N(A0090, (A0N10 | (A0I7 ^ -1)) ^ A0092, A0I, 1836072691, A0091);
        int A0093 = DZO.A00(A0I7);
        int A0L13 = A0L(A0091, (A0N11 | (A0N10 ^ -1)) ^ A0093, i13, 1836072691, A0092);
        int A0094 = DZO.A00(A0N10);
        int A0G5 = A0G(DZO.A07(A0N11, A0L13, A0094, A0092), i27, 1836072691, A0093);
        int A0095 = DZO.A00(A0N11);
        int A0411 = DZO.A04(DZO.A0B(A0G3, A0079, A0L11, A0077, i8), -1894007588, A0078);
        int A0096 = DZO.A00(A0L11);
        int A0J8 = A0J(A0078 + DZO.A06(A0411, A0096, A0G3), i21, -1894007588, A0079);
        int A0097 = DZO.A00(A0G3);
        int A0I8 = A0I(A0079 + DZO.A06(A0J8, A0097, A0411), i25, -1894007588, A0096);
        int A0098 = DZO.A00(A0411);
        int A0F7 = A0F(DZO.A0B(A0I8, A0098, A0J8, A0096, i23), -1894007588, A0097);
        int A0099 = DZO.A00(A0J8);
        int A0I9 = A0I(A0097 + DZO.A06(A0F7, A0099, A0I8), A0I, -1894007588, A0098);
        int A00100 = DZO.A00(A0I8);
        int A0F8 = A0F(DZO.A0B(A0I9, A00100, A0F7, A0098, i20), -1894007588, A0099);
        int A00101 = DZO.A00(A0F7);
        int A0511 = DZO.A05(DZO.A0B(A0F8, A00101, A0I9, A0099, i26), -1894007588, A00100);
        int A00102 = DZO.A00(A0I9);
        int A0M6 = A0M(A00100, DZO.A06(A0511, A00102, A0F8), i13, -1894007588, A00101);
        int A00103 = DZO.A00(A0F8);
        int A0512 = DZO.A05(DZO.A0B(A0M6, A00103, A0511, A00101, i27), -1894007588, A00102);
        int A00104 = DZO.A00(A0511);
        int A0I10 = A0I(A00102 + DZO.A06(A0512, A00104, A0M6), i11, -1894007588, A00103);
        int A00105 = DZO.A00(A0M6);
        int A0G6 = A0G(A00103 + DZO.A06(A0I10, A00105, A0512), i18, -1894007588, A00104);
        int A00106 = DZO.A00(A0512);
        int A0K8 = A0K(A00104, DZO.A06(A0G6, A00106, A0I10), i29, -1894007588, A00105);
        int A00107 = DZO.A00(A0I10);
        int A0M7 = A0M(A00105, DZO.A06(A0K8, A00107, A0G6), i28, -1894007588, A00106);
        int A00108 = DZO.A00(A0G6);
        int A0K9 = A0K(A00106, DZO.A06(A0M7, A00108, A0K8), i15, -1894007588, A00107);
        int A00109 = DZO.A00(A0K8);
        int A0G7 = A0G(A00107 + DZO.A06(A0K9, A00109, A0M7), i17, -1894007588, A00108);
        int A00110 = DZO.A00(A0M7);
        int A0J9 = A0J(A00108 + DZO.A06(A0G7, A00110, A0K9), i10, -1894007588, A00109);
        int A00111 = DZO.A00(A0K9);
        int A0F9 = A0F(DZO.A08(A0L13, A0G5, A0095, A0093) + i20, 2053994217, A0094);
        int A00112 = DZO.A00(A0L13);
        int A0G8 = A0G(DZO.A08(A0G5, A0F9, A00112, A0094), i17, 2053994217, A0095);
        int A00113 = DZO.A00(A0G5);
        int A0M8 = A0M(A0095, BE8.A08(A0F9, A0G8, A00113), i13, 2053994217, A00112);
        int A00114 = DZO.A00(A0F9);
        int A0412 = DZO.A04(DZO.A08(A0G8, A0M8, A00114, A00112) + i8, 2053994217, A00113);
        int A00115 = DZO.A00(A0G8);
        int A0I11 = A0I(DZO.A08(A0M8, A0412, A00115, A00113), i11, 2053994217, A00114);
        int A00116 = DZO.A00(A0M8);
        int A0I12 = A0I(DZO.A08(A0412, A0I11, A00116, A00114), i25, 2053994217, A00115);
        int A00117 = DZO.A00(A0412);
        int A0K10 = A0K(A00115, BE8.A08(A0I11, A0I12, A00117), i29, 2053994217, A00116);
        int A00118 = DZO.A00(A0I11);
        int A0I13 = A0I(DZO.A08(A0I12, A0K10, A00118, A00116), A0I, 2053994217, A00117);
        int A00119 = DZO.A00(A0I12);
        int A0K11 = A0K(A00117, BE8.A08(A0K10, A0I13, A00119), i15, 2053994217, A00118);
        int A00120 = DZO.A00(A0K10);
        int A0513 = DZO.A05(DZO.A08(A0I13, A0K11, A00120, A00118) + i26, 2053994217, A00119);
        int A00121 = DZO.A00(A0I13);
        int A0J10 = A0J(DZO.A08(A0K11, A0513, A00121, A00119), i10, 2053994217, A00120);
        int A00122 = DZO.A00(A0K11);
        int A0514 = DZO.A05(DZO.A08(A0513, A0J10, A00122, A00120) + i27, 2053994217, A00121);
        int A00123 = DZO.A00(A0513);
        int A0J11 = A0J(DZO.A08(A0J10, A0514, A00123, A00121), i21, 2053994217, A00122);
        int A00124 = DZO.A00(A0J10);
        int A0G9 = A0G(DZO.A08(A0514, A0J11, A00124, A00122), i18, 2053994217, A00123);
        int A00125 = DZO.A00(A0514);
        int A0F10 = A0F(DZO.A08(A0J11, A0G9, A00125, A00123) + i23, 2053994217, A00124);
        int A00126 = DZO.A00(A0J11);
        int A0M9 = A0M(A00124, BE8.A08(A0G9, A0F10, A00126), i28, 2053994217, A00125);
        int A00127 = DZO.A00(A0G9);
        int A0515 = DZO.A05(A0H(A00111, A0G7, A0J9, A00109) + i13, -1454113458, A00110);
        int A00128 = DZO.A00(A0G7);
        int A0F11 = A0F(A0H(A00128, A0J9, A0515, A00110) + A0I, -1454113458, A00111);
        int A00129 = DZO.A00(A0J9);
        int A0G10 = A0G(A0H(A00129, A0515, A0F11, A00111), i15, -1454113458, A00128);
        int A00130 = DZO.A00(A0515);
        int A0413 = DZO.A04(A0H(A00130, A0F11, A0G10, A00128) + i21, -1454113458, A00129);
        int A00131 = DZO.A00(A0F11);
        int A0K12 = A0K(A00129, A0413 ^ ((A00131 ^ -1) | A0G10), i18, -1454113458, A00130);
        int A00132 = DZO.A00(A0G10);
        int A0M10 = A0M(A00130, A0K12 ^ (A0413 | (A00132 ^ -1)), i26, -1454113458, A00131);
        int A00133 = DZO.A00(A0413);
        int A0N12 = A0N(A00131, A0M10 ^ ((A00133 ^ -1) | A0K12), i10, -1454113458, A00132);
        int A00134 = DZO.A00(A0K12);
        int A0J12 = A0J(A0H(A00134, A0M10, A0N12, A00132), i23, -1454113458, A00133);
        int A00135 = DZO.A00(A0M10);
        int A0G11 = A0G(A0H(A00135, A0N12, A0J12, A00133), i28, -1454113458, A00134);
        int A00136 = DZO.A00(A0N12);
        int A0J13 = A0J(A0H(A00136, A0J12, A0G11, A00134), i8, -1454113458, A00135);
        int A00137 = DZO.A00(A0J12);
        int A0N13 = A0N(A00135, A0J13 ^ ((A00137 ^ -1) | A0G11), i11, -1454113458, A00136);
        int A00138 = DZO.A00(A0G11);
        int A0I14 = A0I(A0H(A00138, A0J13, A0N13, A00136), i20, -1454113458, A00137);
        int A00139 = DZO.A00(A0J13);
        int A0414 = DZO.A04(A0H(A00139, A0N13, A0I14, A00137) + i25, -1454113458, A00138);
        int A00140 = DZO.A00(A0N13);
        int A0M11 = A0M(A00138, A0414 ^ ((A00140 ^ -1) | A0I14), i17, -1454113458, A00139);
        int A00141 = DZO.A00(A0I14);
        int A0G12 = A0G(A0H(A00141, A0414, A0M11, A00139), i29, -1454113458, A00140);
        int A00142 = DZO.A00(A0414);
        int A0K13 = A0K(A00140, A0G12 ^ ((A00142 ^ -1) | A0M11), i27, -1454113458, A00141);
        int A00143 = DZO.A00(A0M11);
        int A0C = DZO.A0C(A0M9, A0F10, A00127, A00125, i26);
        int A0A11 = DZO.A0A(A0C, 24, A0C << 8, A00126);
        int A00144 = DZO.A00(A0F10);
        int A0G13 = A0G(A00126, (A0A11 ^ A0M9) ^ A00144, i29, A00127);
        int A00145 = DZO.A00(A0M9);
        int A0J14 = A0J(A00127, (A0G13 ^ A0A11) ^ A00145, i23, A00144);
        int A00146 = DZO.A00(A0A11);
        int A0516 = DZO.A05(DZO.A09(A0J14, A0G13, A00146, A00144), i13, A00145);
        int A00147 = DZO.A00(A0G13);
        int A0J15 = A0J(A00145, (A0516 ^ A0J14) ^ A00147, i8, A00146);
        int A00148 = DZO.A00(A0J14);
        int A0G14 = A0G(A00146, (A0J15 ^ A0516) ^ A00148, i15, A00147);
        int A00149 = DZO.A00(A0516);
        int A0I15 = A0I(A00147, (A0G14 ^ A0J15) ^ A00149, i20, A00148);
        int A00150 = DZO.A00(A0J15);
        int A023 = DZO.A02(DZO.A0C(A0I15, A0G14, A00150, A00148, i18), A00149);
        int A00151 = DZO.A00(A0G14);
        int A0C2 = DZO.A0C(A023, A0I15, A00151, A00149, i17);
        int A0A12 = DZO.A0A(A0C2, 24, A0C2 << 8, A00150);
        int A00152 = DZO.A00(A0I15);
        int A0C3 = DZO.A0C(A0A12, A023, A00152, A00150, i10);
        int A0A13 = DZO.A0A(A0C3, 19, A0C3 << 13, A00151);
        int A00153 = DZO.A00(A023);
        int A024 = DZO.A02(DZO.A0C(A0A13, A0A12, A00153, A00151, i27), A00152);
        int A00154 = DZO.A00(A0A12);
        int A0G15 = A0G(A00152, (A024 ^ A0A13) ^ A00154, i28, A00153);
        int A00155 = DZO.A00(A0A13);
        int A0F12 = A0F(DZO.A09(A0G15, A024, A00155, A00153), A0I, A00154);
        int A00156 = DZO.A00(A024);
        int A0C4 = DZO.A0C(A0F12, A0G15, A00156, A00154, i11);
        int A0A14 = DZO.A0A(A0C4, 19, A0C4 << 13, A00155);
        int A00157 = DZO.A00(A0G15);
        int A0415 = DZO.A04(DZO.A09(A0A14, A0F12, A00157, A00155), i21, A00156);
        int A00158 = DZO.A00(A0F12);
        int A0416 = DZO.A04(DZO.A09(A0415, A0A14, A00158, A00156), i25, A00157);
        this.A03 = i3 + A00143 + A00158;
        this.A04 = i4 + A00142 + A00157;
        this.A05 = i6 + A00141 + A0416;
        this.A06 = i + A0K13 + A0415;
        this.A02 = DZO.A00(A0A14) + A0G12 + i2;
        this.A00 = 0;
        for (int i33 = 0; i33 != iArr.length; i33++) {
            iArr[i33] = 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dyi, X.E8N, X.DZO] */
    public E8N BFx() {
        ? dzo = new DZO(this);
        dzo.A01 = new int[16];
        dzo.A0O(this);
        return dzo;
    }
}
