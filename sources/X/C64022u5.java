package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2u5  reason: invalid class name and case insensitive filesystem */
public abstract class C64022u5 {
    public static final Map A00 = C17880vN.A11();

    public static void A00(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -46;
        bArr[3] = -48;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A01(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -4;
        bArr[3] = 61;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A03(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -35;
        bArr[3] = 48;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
        A00.put(str, abstractCollection);
    }

    public static void A05(byte[] bArr) {
        bArr[0] = -99;
        bArr[1] = -16;
    }

    public static void A08(byte[] bArr, byte b) {
        bArr[6] = b;
        bArr[7] = -58;
    }

    public static void A09(byte[] bArr, byte b) {
        bArr[6] = b;
        bArr[7] = -59;
        bArr[8] = -6;
    }

    public static byte[] A0A() {
        byte[] bArr = new byte[4];
        bArr[0] = 31;
        bArr[1] = 13;
        return bArr;
    }

    public static byte[] A0B(byte b, byte b2, int i) {
        byte[] bArr = new byte[i];
        bArr[0] = b;
        bArr[1] = b2;
        return bArr;
    }

    public static void A02(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[14] = 114;
        bArr[15] = 96;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A04(String str, AbstractCollection abstractCollection, byte[] bArr, byte b, int i) {
        bArr[i] = b;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A06(byte[] bArr) {
        bArr[3] = Byte.MIN_VALUE;
        bArr[4] = -14;
    }

    public static void A07(byte[] bArr) {
        bArr[9] = -50;
        bArr[10] = -80;
        bArr[11] = 12;
    }

    static {
        String[] strArr = {"e1.whatsapp.net", "e1.whatsapp.net."};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                ArrayList A13 = AnonymousClass000.A13();
                byte[] A0B = A0B((byte) 15, (byte) -59, 4);
                A0B[2] = -50;
                A04(str, A13, A0B, (byte) -39, 3);
                A01(str, A13, A0B((byte) 3, (byte) 33, 4));
                A00(str, A13, A0B((byte) 15, (byte) -59, 4));
                A03(str, A13, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused) {
            }
        }
        String[] strArr2 = {"e10.whatsapp.net", "e10.whatsapp.net."};
        int i2 = 0;
        do {
            String str2 = strArr2[i2];
            try {
                ArrayList A132 = AnonymousClass000.A13();
                byte[] A0B2 = A0B((byte) 15, (byte) -59, 4);
                A0B2[2] = -50;
                A04(str2, A132, A0B2, (byte) -39, 3);
                A01(str2, A132, A0B((byte) 3, (byte) 33, 4));
                A00(str2, A132, A0B((byte) 15, (byte) -59, 4));
                A03(str2, A132, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused2) {
            }
            i2++;
        } while (i2 < 2);
        String[] strArr3 = {"e11.whatsapp.net", "e11.whatsapp.net."};
        int i3 = 0;
        do {
            String str3 = strArr3[i3];
            try {
                ArrayList A133 = AnonymousClass000.A13();
                byte[] A0B3 = A0B((byte) 15, (byte) -59, 4);
                A0B3[2] = -50;
                A04(str3, A133, A0B3, (byte) -39, 3);
                A01(str3, A133, A0B((byte) 3, (byte) 33, 4));
                A00(str3, A133, A0B((byte) 15, (byte) -59, 4));
                A03(str3, A133, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused3) {
            }
            i3++;
        } while (i3 < 2);
        String[] strArr4 = {"e12.whatsapp.net", "e12.whatsapp.net."};
        int i4 = 0;
        do {
            String str4 = strArr4[i4];
            try {
                ArrayList A134 = AnonymousClass000.A13();
                byte[] A0B4 = A0B((byte) 15, (byte) -59, 4);
                A0B4[2] = -50;
                A04(str4, A134, A0B4, (byte) -39, 3);
                A01(str4, A134, A0B((byte) 3, (byte) 33, 4));
                A00(str4, A134, A0B((byte) 15, (byte) -59, 4));
                A03(str4, A134, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused4) {
            }
            i4++;
        } while (i4 < 2);
        String[] strArr5 = {"e13.whatsapp.net", "e13.whatsapp.net."};
        int i5 = 0;
        do {
            String str5 = strArr5[i5];
            try {
                ArrayList A135 = AnonymousClass000.A13();
                byte[] A0B5 = A0B((byte) 15, (byte) -59, 4);
                A0B5[2] = -50;
                A04(str5, A135, A0B5, (byte) -39, 3);
                A01(str5, A135, A0B((byte) 3, (byte) 33, 4));
                A00(str5, A135, A0B((byte) 15, (byte) -59, 4));
                A03(str5, A135, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused5) {
            }
            i5++;
        } while (i5 < 2);
        String[] strArr6 = {"e14.whatsapp.net", "e14.whatsapp.net."};
        int i6 = 0;
        do {
            String str6 = strArr6[i6];
            try {
                ArrayList A136 = AnonymousClass000.A13();
                byte[] A0B6 = A0B((byte) 15, (byte) -59, 4);
                A0B6[2] = -50;
                A04(str6, A136, A0B6, (byte) -39, 3);
                A01(str6, A136, A0B((byte) 3, (byte) 33, 4));
                A00(str6, A136, A0B((byte) 15, (byte) -59, 4));
                A03(str6, A136, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused6) {
            }
            i6++;
        } while (i6 < 2);
        String[] strArr7 = {"e15.whatsapp.net", "e15.whatsapp.net."};
        int i7 = 0;
        do {
            String str7 = strArr7[i7];
            try {
                ArrayList A137 = AnonymousClass000.A13();
                byte[] A0B7 = A0B((byte) 15, (byte) -59, 4);
                A0B7[2] = -50;
                A04(str7, A137, A0B7, (byte) -39, 3);
                A01(str7, A137, A0B((byte) 3, (byte) 33, 4));
                A00(str7, A137, A0B((byte) 15, (byte) -59, 4));
                A03(str7, A137, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused7) {
            }
            i7++;
        } while (i7 < 2);
        String[] strArr8 = {"e16.whatsapp.net", "e16.whatsapp.net."};
        int i8 = 0;
        do {
            String str8 = strArr8[i8];
            try {
                ArrayList A138 = AnonymousClass000.A13();
                byte[] A0B8 = A0B((byte) 15, (byte) -59, 4);
                A0B8[2] = -50;
                A04(str8, A138, A0B8, (byte) -39, 3);
                A01(str8, A138, A0B((byte) 3, (byte) 33, 4));
                A00(str8, A138, A0B((byte) 15, (byte) -59, 4));
                A03(str8, A138, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused8) {
            }
            i8++;
        } while (i8 < 2);
        String[] strArr9 = {"e2.whatsapp.net", "e2.whatsapp.net."};
        int i9 = 0;
        do {
            String str9 = strArr9[i9];
            try {
                ArrayList A139 = AnonymousClass000.A13();
                byte[] A0B9 = A0B((byte) 15, (byte) -59, 4);
                A0B9[2] = -50;
                A04(str9, A139, A0B9, (byte) -39, 3);
                A01(str9, A139, A0B((byte) 3, (byte) 33, 4));
                A00(str9, A139, A0B((byte) 15, (byte) -59, 4));
                A03(str9, A139, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused9) {
            }
            i9++;
        } while (i9 < 2);
        String[] strArr10 = {"e3.whatsapp.net", "e3.whatsapp.net."};
        int i10 = 0;
        do {
            String str10 = strArr10[i10];
            try {
                ArrayList A1310 = AnonymousClass000.A13();
                byte[] A0B10 = A0B((byte) 15, (byte) -59, 4);
                A0B10[2] = -50;
                A04(str10, A1310, A0B10, (byte) -39, 3);
                A01(str10, A1310, A0B((byte) 3, (byte) 33, 4));
                A00(str10, A1310, A0B((byte) 15, (byte) -59, 4));
                A03(str10, A1310, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused10) {
            }
            i10++;
        } while (i10 < 2);
        String[] strArr11 = {"e4.whatsapp.net", "e4.whatsapp.net."};
        int i11 = 0;
        do {
            String str11 = strArr11[i11];
            try {
                ArrayList A1311 = AnonymousClass000.A13();
                byte[] A0B11 = A0B((byte) 15, (byte) -59, 4);
                A0B11[2] = -50;
                A04(str11, A1311, A0B11, (byte) -39, 3);
                A01(str11, A1311, A0B((byte) 3, (byte) 33, 4));
                A00(str11, A1311, A0B((byte) 15, (byte) -59, 4));
                A03(str11, A1311, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused11) {
            }
            i11++;
        } while (i11 < 2);
        String[] strArr12 = {"e5.whatsapp.net", "e5.whatsapp.net."};
        int i12 = 0;
        do {
            String str12 = strArr12[i12];
            try {
                ArrayList A1312 = AnonymousClass000.A13();
                byte[] A0B12 = A0B((byte) 15, (byte) -59, 4);
                A0B12[2] = -50;
                A04(str12, A1312, A0B12, (byte) -39, 3);
                A01(str12, A1312, A0B((byte) 3, (byte) 33, 4));
                A00(str12, A1312, A0B((byte) 15, (byte) -59, 4));
                A03(str12, A1312, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused12) {
            }
            i12++;
        } while (i12 < 2);
        String[] strArr13 = {"e6.whatsapp.net", "e6.whatsapp.net."};
        int i13 = 0;
        do {
            String str13 = strArr13[i13];
            try {
                ArrayList A1313 = AnonymousClass000.A13();
                byte[] A0B13 = A0B((byte) 15, (byte) -59, 4);
                A0B13[2] = -50;
                A04(str13, A1313, A0B13, (byte) -39, 3);
                A01(str13, A1313, A0B((byte) 3, (byte) 33, 4));
                A00(str13, A1313, A0B((byte) 15, (byte) -59, 4));
                A03(str13, A1313, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused13) {
            }
            i13++;
        } while (i13 < 2);
        String[] strArr14 = {"e7.whatsapp.net", "e7.whatsapp.net."};
        int i14 = 0;
        do {
            String str14 = strArr14[i14];
            try {
                ArrayList A1314 = AnonymousClass000.A13();
                byte[] A0B14 = A0B((byte) 15, (byte) -59, 4);
                A0B14[2] = -50;
                A04(str14, A1314, A0B14, (byte) -39, 3);
                A01(str14, A1314, A0B((byte) 3, (byte) 33, 4));
                A00(str14, A1314, A0B((byte) 15, (byte) -59, 4));
                A03(str14, A1314, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused14) {
            }
            i14++;
        } while (i14 < 2);
        String[] strArr15 = {"e8.whatsapp.net", "e8.whatsapp.net."};
        int i15 = 0;
        do {
            String str15 = strArr15[i15];
            try {
                ArrayList A1315 = AnonymousClass000.A13();
                byte[] A0B15 = A0B((byte) 15, (byte) -59, 4);
                A0B15[2] = -50;
                A04(str15, A1315, A0B15, (byte) -39, 3);
                A01(str15, A1315, A0B((byte) 3, (byte) 33, 4));
                A00(str15, A1315, A0B((byte) 15, (byte) -59, 4));
                A03(str15, A1315, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused15) {
            }
            i15++;
        } while (i15 < 2);
        String[] strArr16 = {"e9.whatsapp.net", "e9.whatsapp.net."};
        int i16 = 0;
        do {
            String str16 = strArr16[i16];
            try {
                ArrayList A1316 = AnonymousClass000.A13();
                byte[] A0B16 = A0B((byte) 15, (byte) -59, 4);
                A0B16[2] = -50;
                A04(str16, A1316, A0B16, (byte) -39, 3);
                A01(str16, A1316, A0B((byte) 3, (byte) 33, 4));
                A00(str16, A1316, A0B((byte) 15, (byte) -59, 4));
                A03(str16, A1316, A0B((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused16) {
            }
            i16++;
        } while (i16 < 2);
        String[] strArr17 = {"g.whatsapp.net", "g.whatsapp.net."};
        for (int i17 = 0; i17 < 2; i17++) {
            String str17 = strArr17[i17];
            try {
                ArrayList A1317 = AnonymousClass000.A13();
                byte[] A0A = A0A();
                A0A[2] = 65;
                A04(str17, A1317, A0A, (byte) 50, 3);
                byte[] A0A2 = A0A();
                A0A2[2] = 88;
                A04(str17, A1317, A0A2, (byte) 61, 3);
                byte[] bArr = new byte[4];
                bArr[0] = 57;
                bArr[1] = -112;
                bArr[2] = -123;
                A04(str17, A1317, bArr, (byte) 33, 3);
                byte[] bArr2 = new byte[4];
                A05(bArr2);
                bArr2[2] = 19;
                A04(str17, A1317, bArr2, (byte) 54, 3);
                byte[] A0A3 = A0A();
                A0A3[2] = 93;
                A04(str17, A1317, A0A3, (byte) 54, 3);
                byte[] A0A4 = A0A();
                A0A4[2] = 66;
                A04(str17, A1317, A0A4, (byte) 51, 3);
                byte[] bArr3 = new byte[4];
                A05(bArr3);
                bArr3[2] = -27;
                A04(str17, A1317, bArr3, (byte) 61, 3);
                byte[] A0A5 = A0A();
                A0A5[2] = 70;
                A04(str17, A1317, A0A5, (byte) 50, 3);
                byte[] bArr4 = new byte[4];
                A05(bArr4);
                bArr4[2] = 11;
                A04(str17, A1317, bArr4, (byte) 54, 3);
                byte[] A0A6 = A0A();
                A0A6[2] = 71;
                A04(str17, A1317, A0A6, (byte) 50, 3);
                byte[] bArr5 = new byte[4];
                A05(bArr5);
                bArr5[2] = -15;
                A04(str17, A1317, bArr5, (byte) 61, 3);
                byte[] bArr6 = new byte[4];
                bArr6[0] = 57;
                bArr6[1] = -112;
                bArr6[2] = -75;
                A04(str17, A1317, bArr6, (byte) 33, 3);
                byte[] A0A7 = A0A();
                A0A7[2] = 67;
                A04(str17, A1317, A0A7, (byte) 53, 3);
                byte[] bArr7 = new byte[4];
                A05(bArr7);
                bArr7[2] = 14;
                A04(str17, A1317, bArr7, (byte) 53, 3);
                byte[] bArr8 = new byte[4];
                A05(bArr8);
                bArr8[2] = 3;
                A04(str17, A1317, bArr8, (byte) 55, 3);
                byte[] bArr9 = new byte[4];
                A05(bArr9);
                bArr9[2] = 22;
                A04(str17, A1317, bArr9, (byte) 54, 3);
                byte[] A0B17 = A0B((byte) 42, (byte) 3, 16);
                A0B17[2] = 40;
                A06(A0B17);
                A0B17[5] = 17;
                A08(A0B17, (byte) 0);
                A0B17[8] = -6;
                A0B17[9] = -50;
                A0B17[10] = -80;
                A0B17[11] = 12;
                A0B17[12] = 0;
                A0B17[13] = 0;
                A0B17[14] = 114;
                A04(str17, A1317, A0B17, (byte) 96, 15);
                byte[] A0B18 = A0B((byte) 42, (byte) 3, 16);
                A0B18[2] = 40;
                A06(A0B18);
                A0B18[5] = 17;
                A0B18[6] = 1;
                A0B18[7] = -54;
                A0B18[8] = -6;
                A07(A0B18);
                A0B18[12] = 0;
                A0B18[13] = 0;
                A02(str17, A1317, A0B18);
                byte[] A0B19 = A0B((byte) 42, (byte) 3, 16);
                A0B19[2] = 40;
                A0B19[3] = Byte.MIN_VALUE;
                A0B19[4] = -13;
                A0B19[5] = 66;
                A0B19[6] = 1;
                A0B19[7] = 33;
                A0B19[8] = -6;
                A07(A0B19);
                A0B19[12] = 0;
                A0B19[13] = 0;
                A02(str17, A1317, A0B19);
                byte[] A0B20 = A0B((byte) 42, (byte) 3, 16);
                A0B20[2] = 40;
                A06(A0B20);
                A0B20[5] = 52;
                A0B20[6] = 0;
                A0B20[7] = -57;
                A0B20[8] = -6;
                A07(A0B20);
                A0B20[12] = 0;
                A0B20[13] = 0;
                A02(str17, A1317, A0B20);
                byte[] A0B21 = A0B((byte) 42, (byte) 3, 16);
                A0B21[2] = 40;
                A06(A0B21);
                A0B21[5] = 52;
                A0B21[6] = 1;
                A0B21[7] = -57;
                A0B21[8] = -6;
                A07(A0B21);
                A0B21[12] = 0;
                A0B21[13] = 0;
                A02(str17, A1317, A0B21);
                byte[] A0B22 = A0B((byte) 42, (byte) 3, 16);
                A0B22[2] = 40;
                A06(A0B22);
                A0B22[5] = 3;
                A08(A0B22, (byte) 0);
                A0B22[8] = -6;
                A07(A0B22);
                A0B22[12] = 0;
                A0B22[13] = 0;
                A02(str17, A1317, A0B22);
                byte[] A0B23 = A0B((byte) 42, (byte) 3, 16);
                A0B23[2] = 40;
                A06(A0B23);
                A0B23[5] = 3;
                A0B23[6] = 1;
                A0B23[7] = -55;
                A0B23[8] = -6;
                A07(A0B23);
                A0B23[12] = 0;
                A0B23[13] = 0;
                A02(str17, A1317, A0B23);
                byte[] A0B24 = A0B((byte) 42, (byte) 3, 16);
                A0B24[2] = 40;
                A06(A0B24);
                A0B24[5] = 13;
                A08(A0B24, (byte) 0);
                A0B24[8] = -6;
                A07(A0B24);
                A0B24[12] = 0;
                A0B24[13] = 0;
                A02(str17, A1317, A0B24);
                byte[] A0B25 = A0B((byte) 42, (byte) 3, 16);
                A0B25[2] = 40;
                A06(A0B25);
                A0B25[5] = 13;
                A08(A0B25, (byte) 1);
                A0B25[8] = -6;
                A07(A0B25);
                A0B25[12] = 0;
                A0B25[13] = 0;
                A02(str17, A1317, A0B25);
                byte[] A0B26 = A0B((byte) 42, (byte) 3, 16);
                A0B26[2] = 40;
                A06(A0B26);
                A0B26[5] = 18;
                A08(A0B26, (byte) 0);
                A0B26[8] = -6;
                A07(A0B26);
                A0B26[12] = 0;
                A0B26[13] = 0;
                A02(str17, A1317, A0B26);
                byte[] A0B27 = A0B((byte) 42, (byte) 3, 16);
                A0B27[2] = 40;
                A06(A0B27);
                A0B27[5] = 18;
                A0B27[6] = 1;
                A0B27[7] = -60;
                A0B27[8] = -6;
                A07(A0B27);
                A0B27[12] = 0;
                A0B27[13] = 0;
                A02(str17, A1317, A0B27);
                byte[] A0B28 = A0B((byte) 42, (byte) 3, 16);
                A0B28[2] = 40;
                A0B28[3] = Byte.MIN_VALUE;
                A0B28[4] = -13;
                A0B28[5] = 90;
                A0B28[6] = 1;
                A0B28[7] = 33;
                A0B28[8] = -6;
                A07(A0B28);
                A0B28[12] = 0;
                A0B28[13] = 0;
                A02(str17, A1317, A0B28);
                byte[] A0B29 = A0B((byte) 42, (byte) 3, 16);
                A0B29[2] = 40;
                A06(A0B29);
                A0B29[5] = 44;
                A08(A0B29, (byte) 0);
                A0B29[8] = -6;
                A07(A0B29);
                A0B29[12] = 0;
                A0B29[13] = 0;
                A02(str17, A1317, A0B29);
                byte[] A0B30 = A0B((byte) 42, (byte) 3, 16);
                A0B30[2] = 40;
                A06(A0B30);
                A0B30[5] = 44;
                A08(A0B30, (byte) 1);
                A0B30[8] = -6;
                A07(A0B30);
                A0B30[12] = 0;
                A0B30[13] = 0;
                A02(str17, A1317, A0B30);
                byte[] A0B31 = A0B((byte) 42, (byte) 3, 16);
                A0B31[2] = 40;
                A06(A0B31);
                A0B31[5] = 1;
                A08(A0B31, (byte) 0);
                A0B31[8] = -6;
                A07(A0B31);
                A0B31[12] = 0;
                A0B31[13] = 0;
                A0B31[14] = 114;
                A04(str17, A1317, A0B31, (byte) 96, 15);
                byte[] A0B32 = A0B((byte) 42, (byte) 3, 16);
                A0B32[2] = 40;
                A06(A0B32);
                A0B32[5] = 49;
                A0B32[6] = 0;
                A0B32[7] = -57;
                A0B32[8] = -6;
                A07(A0B32);
                A0B32[12] = 0;
                A0B32[13] = 0;
                A0B32[14] = 114;
                A04(str17, A1317, A0B32, (byte) 96, 15);
                A00.put(str17, A1317);
            } catch (UnknownHostException unused17) {
            }
        }
        String[] strArr18 = {"v.whatsapp.net", "v.whatsapp.net."};
        int i18 = 0;
        do {
            String str18 = strArr18[i18];
            try {
                ArrayList A1318 = AnonymousClass000.A13();
                byte[] A0A8 = A0A();
                A0A8[2] = 65;
                A04(str18, A1318, A0A8, (byte) 49, 3);
                byte[] A0A9 = A0A();
                A0A9[2] = 88;
                A04(str18, A1318, A0A9, (byte) 60, 3);
                byte[] bArr10 = new byte[4];
                bArr10[0] = 57;
                bArr10[1] = -112;
                bArr10[2] = -123;
                A04(str18, A1318, bArr10, (byte) 32, 3);
                byte[] bArr11 = new byte[4];
                A05(bArr11);
                bArr11[2] = 19;
                A04(str18, A1318, bArr11, (byte) 53, 3);
                byte[] A0A10 = A0A();
                A0A10[2] = 93;
                A04(str18, A1318, A0A10, (byte) 53, 3);
                byte[] A0A11 = A0A();
                A0A11[2] = 66;
                A04(str18, A1318, A0A11, (byte) 56, 3);
                byte[] bArr12 = new byte[4];
                A05(bArr12);
                bArr12[2] = -27;
                A04(str18, A1318, bArr12, (byte) 60, 3);
                byte[] A0A12 = A0A();
                A0A12[2] = 70;
                A04(str18, A1318, A0A12, (byte) 49, 3);
                byte[] bArr13 = new byte[4];
                A05(bArr13);
                bArr13[2] = 11;
                A04(str18, A1318, bArr13, (byte) 53, 3);
                byte[] A0A13 = A0A();
                A0A13[2] = 71;
                A04(str18, A1318, A0A13, (byte) 49, 3);
                byte[] bArr14 = new byte[4];
                A05(bArr14);
                bArr14[2] = -15;
                A04(str18, A1318, bArr14, (byte) 60, 3);
                byte[] bArr15 = new byte[4];
                bArr15[0] = 57;
                bArr15[1] = -112;
                bArr15[2] = -75;
                A04(str18, A1318, bArr15, (byte) 32, 3);
                byte[] A0A14 = A0A();
                A0A14[2] = 67;
                A04(str18, A1318, A0A14, (byte) 52, 3);
                byte[] bArr16 = new byte[4];
                A05(bArr16);
                bArr16[2] = 14;
                A04(str18, A1318, bArr16, (byte) 52, 3);
                byte[] bArr17 = new byte[4];
                A05(bArr17);
                bArr17[2] = 3;
                A04(str18, A1318, bArr17, (byte) 54, 3);
                byte[] bArr18 = new byte[4];
                A05(bArr18);
                bArr18[2] = 22;
                A04(str18, A1318, bArr18, (byte) 53, 3);
                byte[] A0B33 = A0B((byte) 42, (byte) 3, 16);
                A0B33[2] = 40;
                A06(A0B33);
                A0B33[5] = 17;
                A09(A0B33, (byte) 0);
                A0B33[9] = -50;
                A0B33[10] = -80;
                A0B33[11] = 12;
                A0B33[12] = 0;
                A0B33[13] = 0;
                A0B33[14] = 1;
                A04(str18, A1318, A0B33, (byte) 103, 15);
                byte[] A0B34 = A0B((byte) 42, (byte) 3, 16);
                A0B34[2] = 40;
                A06(A0B34);
                A0B34[5] = 17;
                A0B34[6] = 1;
                A0B34[7] = -63;
                A0B34[8] = -6;
                A07(A0B34);
                A0B34[12] = 0;
                A0B34[13] = 0;
                A0B34[14] = 1;
                A04(str18, A1318, A0B34, (byte) 103, 15);
                byte[] A0B35 = A0B((byte) 42, (byte) 3, 16);
                A0B35[2] = 40;
                A0B35[3] = Byte.MIN_VALUE;
                A0B35[4] = -13;
                A0B35[5] = 66;
                A0B35[6] = 1;
                A0B35[7] = 32;
                A0B35[8] = -6;
                A07(A0B35);
                A0B35[12] = 0;
                A0B35[13] = 0;
                A0B35[14] = 1;
                A04(str18, A1318, A0B35, (byte) 103, 15);
                byte[] A0B36 = A0B((byte) 42, (byte) 3, 16);
                A0B36[2] = 40;
                A06(A0B36);
                A0B36[5] = 52;
                A08(A0B36, (byte) 0);
                A0B36[8] = -6;
                A07(A0B36);
                A0B36[12] = 0;
                A0B36[13] = 0;
                A0B36[14] = 1;
                A04(str18, A1318, A0B36, (byte) 103, 15);
                byte[] A0B37 = A0B((byte) 42, (byte) 3, 16);
                A0B37[2] = 40;
                A06(A0B37);
                A0B37[5] = 52;
                A08(A0B37, (byte) 1);
                A0B37[8] = -6;
                A07(A0B37);
                A0B37[12] = 0;
                A0B37[13] = 0;
                A0B37[14] = 1;
                A04(str18, A1318, A0B37, (byte) 103, 15);
                byte[] A0B38 = A0B((byte) 42, (byte) 3, 16);
                A0B38[2] = 40;
                A06(A0B38);
                A0B38[5] = 3;
                A09(A0B38, (byte) 0);
                A07(A0B38);
                A0B38[12] = 0;
                A0B38[13] = 0;
                A0B38[14] = 1;
                A04(str18, A1318, A0B38, (byte) 103, 15);
                byte[] A0B39 = A0B((byte) 42, (byte) 3, 16);
                A0B39[2] = 40;
                A06(A0B39);
                A0B39[5] = 3;
                A0B39[6] = 1;
                A0B39[7] = -63;
                A0B39[8] = -6;
                A07(A0B39);
                A0B39[12] = 0;
                A0B39[13] = 0;
                A0B39[14] = 1;
                A04(str18, A1318, A0B39, (byte) 103, 15);
                byte[] A0B40 = A0B((byte) 42, (byte) 3, 16);
                A0B40[2] = 40;
                A06(A0B40);
                A0B40[5] = 13;
                A09(A0B40, (byte) 0);
                A07(A0B40);
                A0B40[12] = 0;
                A0B40[13] = 0;
                A0B40[14] = 1;
                A04(str18, A1318, A0B40, (byte) 103, 15);
                byte[] A0B41 = A0B((byte) 42, (byte) 3, 16);
                A0B41[2] = 40;
                A06(A0B41);
                A0B41[5] = 13;
                A09(A0B41, (byte) 1);
                A07(A0B41);
                A0B41[12] = 0;
                A0B41[13] = 0;
                A0B41[14] = 1;
                A04(str18, A1318, A0B41, (byte) 103, 15);
                byte[] A0B42 = A0B((byte) 42, (byte) 3, 16);
                A0B42[2] = 40;
                A06(A0B42);
                A0B42[5] = 18;
                A09(A0B42, (byte) 0);
                A07(A0B42);
                A0B42[12] = 0;
                A0B42[13] = 0;
                A0B42[14] = 1;
                A04(str18, A1318, A0B42, (byte) 103, 15);
                byte[] A0B43 = A0B((byte) 42, (byte) 3, 16);
                A0B43[2] = 40;
                A06(A0B43);
                A0B43[5] = 18;
                A0B43[6] = 1;
                A0B43[7] = -47;
                A0B43[8] = -6;
                A07(A0B43);
                A0B43[12] = 0;
                A0B43[13] = 0;
                A0B43[14] = 1;
                A04(str18, A1318, A0B43, (byte) 103, 15);
                byte[] A0B44 = A0B((byte) 42, (byte) 3, 16);
                A0B44[2] = 40;
                A0B44[3] = Byte.MIN_VALUE;
                A0B44[4] = -13;
                A0B44[5] = 90;
                A0B44[6] = 1;
                A0B44[7] = 32;
                A0B44[8] = -6;
                A07(A0B44);
                A0B44[12] = 0;
                A0B44[13] = 0;
                A0B44[14] = 1;
                A04(str18, A1318, A0B44, (byte) 103, 15);
                byte[] A0B45 = A0B((byte) 42, (byte) 3, 16);
                A0B45[2] = 40;
                A06(A0B45);
                A0B45[5] = 44;
                A09(A0B45, (byte) 0);
                A07(A0B45);
                A0B45[12] = 0;
                A0B45[13] = 0;
                A0B45[14] = 1;
                A04(str18, A1318, A0B45, (byte) 103, 15);
                byte[] A0B46 = A0B((byte) 42, (byte) 3, 16);
                A0B46[2] = 40;
                A06(A0B46);
                A0B46[5] = 44;
                A09(A0B46, (byte) 1);
                A07(A0B46);
                A0B46[12] = 0;
                A0B46[13] = 0;
                A0B46[14] = 1;
                A04(str18, A1318, A0B46, (byte) 103, 15);
                byte[] A0B47 = A0B((byte) 42, (byte) 3, 16);
                A0B47[2] = 40;
                A06(A0B47);
                A0B47[5] = 1;
                A09(A0B47, (byte) 0);
                A07(A0B47);
                A0B47[12] = 0;
                A0B47[13] = 0;
                A0B47[14] = 1;
                A04(str18, A1318, A0B47, (byte) 103, 15);
                byte[] A0B48 = A0B((byte) 42, (byte) 3, 16);
                A0B48[2] = 40;
                A06(A0B48);
                A0B48[5] = 49;
                A08(A0B48, (byte) 0);
                A0B48[8] = -6;
                A07(A0B48);
                A0B48[12] = 0;
                A0B48[13] = 0;
                A0B48[14] = 1;
                A04(str18, A1318, A0B48, (byte) 103, 15);
                A00.put(str18, A1318);
            } catch (UnknownHostException unused18) {
            }
            i18++;
        } while (i18 < 2);
    }
}
