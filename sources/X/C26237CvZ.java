package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;

/* renamed from: X.CvZ  reason: case insensitive filesystem */
public class C26237CvZ {
    public static final SecureRandom A04 = new SecureRandom();
    public byte[] A00;
    public final CU8 A01;
    public final C24998CSy[] A02;
    public final C24960CRk[] A03;

    public static C26237CvZ A00(byte[] bArr) {
        byte[] bArr2 = bArr;
        short A022 = A02(bArr2, 0);
        byte b = bArr[2];
        boolean A1O = AnonymousClass000.A1O(b & 128);
        byte b2 = (byte) ((b >> 3) & 15);
        boolean A1O2 = AnonymousClass000.A1O(b & 4);
        boolean A1O3 = AnonymousClass000.A1O(b & 2);
        boolean A1O4 = AnonymousClass000.A1O(b & 1);
        byte b3 = bArr[3];
        short s = (short) ((byte) (b3 & 15));
        CU8 cu8 = new CU8(b2, A022, s, A02(bArr2, 4), A02(bArr2, 6), A02(bArr2, 8), A02(bArr2, 10), A1O, A1O2, A1O3, A1O4, AnonymousClass000.A1O(b3 & 128));
        int i = 12;
        int i2 = cu8.A05;
        C24960CRk[] cRkArr = new C24960CRk[i2];
        int i3 = 0;
        int i4 = 0;
        while (i4 < i2) {
            C25978Cpr A002 = C25978Cpr.A00(bArr2, i);
            int i5 = A002.A00;
            int i6 = i + i5;
            if (512 >= i6 + 4) {
                C24960CRk cRk = new C24960CRk(A002, i5 + 4, A02(bArr2, i6), A02(bArr2, i6 + 2));
                cRkArr[i4] = cRk;
                i += cRk.A00;
                i4++;
            } else {
                throw new C22641Cq("insufficient data");
            }
        }
        int i7 = cu8.A03;
        C24998CSy[] cSyArr = new C24998CSy[i7];
        while (i3 < i7) {
            C25978Cpr A003 = C25978Cpr.A00(bArr2, i);
            int i8 = A003.A00;
            int i9 = i + i8;
            int i10 = i9 + 10;
            if (512 >= i10) {
                short A023 = A02(bArr2, i9);
                short A024 = A02(bArr2, i9 + 2);
                int i11 = i9 + 4;
                byte b4 = ((bArr2[i11] << 24) & -16777216) | ((bArr2[i11 + 1] << 16) & 16711680) | ((bArr2[i11 + 2] << 8) & 65280) | (bArr2[i11 + 3] & 255);
                short A025 = A02(bArr2, i9 + 8);
                if (512 >= i10 + A025) {
                    C24998CSy cSy = new C24998CSy(A003, BE7.A1Z(bArr2, A025, i10), b4, i8 + 10 + A025, A023, A024);
                    cSyArr[i3] = cSy;
                    i += cSy.A00;
                    i3++;
                } else {
                    throw new C22641Cq("insufficient data");
                }
            } else {
                throw new C22641Cq("insufficient data");
            }
        }
        C26237CvZ cvZ = new C26237CvZ(cu8, cSyArr, cRkArr);
        cvZ.A00 = bArr2;
        return cvZ;
    }

    public static C26237CvZ A01(C24960CRk[] cRkArr) {
        return new C26237CvZ(new CU8((byte) 0, (short) A04.nextInt(65536), 0, 1, 0, 0, 0, false, false, false, true, false), new C24998CSy[0], cRkArr);
    }

    public static short A02(byte[] bArr, int i) {
        return (short) (((bArr[i] << 8) & 65280) | (bArr[i + 1] & 255));
    }

    public C26237CvZ(CU8 cu8, C24998CSy[] cSyArr, C24960CRk[] cRkArr) {
        this.A01 = cu8;
        this.A03 = cRkArr;
        this.A02 = cSyArr;
    }

    public static void A03(OutputStream outputStream, short s) {
        outputStream.write((byte) ((65280 & s) >>> 8));
        outputStream.write((byte) (s & 255));
    }

    public static void A04(byte[] bArr, int i, short s) {
        bArr[i] = (byte) ((65280 & s) >>> 8);
        bArr[i + 1] = (byte) (s & 255);
    }

    public byte[] A05() {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        try {
            CU8 cu8 = this.A01;
            byte[] bArr = new byte[12];
            A04(bArr, 0, cu8.A01);
            int i = 0;
            bArr[2] = 0;
            int i2 = 0;
            if (cu8.A0A) {
                i2 = 128;
            }
            byte b = (byte) i2;
            bArr[2] = b;
            byte b2 = (byte) (b | ((byte) ((cu8.A00 & 15) << 3)));
            bArr[2] = b2;
            byte b3 = 0;
            if (cu8.A07) {
                b3 = 4;
            }
            byte b4 = (byte) (b2 | b3);
            bArr[2] = b4;
            byte A002 = (byte) (b4 | AnonymousClass8BU.A00(cu8.A0B ? 1 : 0));
            bArr[2] = A002;
            BE6.A1N(bArr, A002, cu8.A09 ? 1 : 0, 2);
            bArr[3] = 0;
            if (cu8.A08) {
                i = 128;
            }
            byte b5 = (byte) i;
            bArr[3] = b5;
            BE6.A1N(bArr, b5, (byte) (cu8.A06 & 15), 3);
            A04(bArr, 4, cu8.A05);
            A04(bArr, 6, cu8.A03);
            A04(bArr, 8, cu8.A04);
            A04(bArr, 10, cu8.A02);
            A15.write(bArr);
            for (C24960CRk cRk : this.A03) {
                cRk.A01.A02(A15);
                A03(A15, cRk.A03);
                A03(A15, cRk.A02);
            }
            for (C24998CSy cSy : this.A02) {
                cSy.A02.A02(A15);
                A03(A15, cSy.A04);
                A03(A15, cSy.A03);
                int i3 = cSy.A01;
                A15.write((i3 >>> 24) & 255);
                A15.write((i3 >>> 16) & 255);
                A15.write((i3 >>> 8) & 255);
                A15.write(i3 & 255);
                byte[] bArr2 = cSy.A05;
                A03(A15, (short) bArr2.length);
                A15.write(bArr2);
            }
            return A15.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }
}
