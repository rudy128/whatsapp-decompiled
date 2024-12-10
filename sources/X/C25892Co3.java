package X;

import com.whatsapp.util.Log;
import java.security.MessageDigest;

/* renamed from: X.Co3  reason: case insensitive filesystem */
public abstract class C25892Co3 {
    public static byte[] A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C27197DYw A00 = A00(bArr, bArr2);
        C27196DYv dYv = new C27196DYv();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        dYv.BdA(new C27190DYo(bArr4));
        byte[] bArr5 = bArr3;
        int length = bArr3.length;
        int max = Math.max(length - 16, 0);
        byte[] bArr6 = new byte[16];
        byte[] bArr7 = new byte[16];
        byte[] bArr8 = new byte[max];
        dYv.update(bArr3, 16, max);
        dYv.BJ5(bArr6, 0);
        System.arraycopy(bArr3, 0, bArr7, 0, Math.min(length, 16));
        if (MessageDigest.isEqual(bArr6, bArr7)) {
            A00.A03(bArr5, bArr8, 16, max, 0);
            return bArr8;
        }
        Log.w("XSalsa20Poly1305/decrypt Presented MAC doesn't match calculated MAC (MAC prepended)");
        throw new DZr();
    }

    public static C27197DYw A00(byte[] bArr, byte[] bArr2) {
        C27197DYw dYw = new C27197DYw();
        DYm dYm = new DYm(new C27190DYo(bArr), bArr2);
        byte[] bArr3 = dYm.A01;
        if (bArr3.length == 24) {
            E3O e3o = dYm.A00;
            if (e3o == null) {
                boolean z = dYw.A04;
                StringBuilder A10 = AnonymousClass000.A10();
                if (z) {
                    A10.append("XSalsa20");
                    throw AnonymousClass001.A12(" doesn't support re-init with null key", A10);
                }
                A10.append("XSalsa20");
                throw AnonymousClass000.A0o(" KeyParameter can not be null for first initialisation", A10);
            } else if (e3o instanceof C27190DYo) {
                byte[] bArr4 = ((C27190DYo) e3o).A00;
                if (bArr4.length == 32) {
                    int i = 16;
                    int[] iArr = dYw.A06;
                    int[] iArr2 = C27197DYw.A08;
                    iArr[0] = iArr2[4];
                    iArr[5] = iArr2[5];
                    iArr[10] = iArr2[6];
                    iArr[15] = iArr2[7];
                    int i2 = 0;
                    int i3 = 0;
                    do {
                        i3++;
                        C26210Cuo.A05(bArr4, iArr, i2, i3);
                        i2 += 4;
                    } while (i3 < 4);
                    int i4 = 0;
                    do {
                        C26210Cuo.A05(bArr4, iArr, i, i4 + 11);
                        i += 4;
                        i4++;
                    } while (i4 < 4);
                    int i5 = 0;
                    int i6 = 0;
                    do {
                        C26210Cuo.A05(bArr3, iArr, i5, i6 + 6);
                        i5 += 4;
                        i6++;
                    } while (i6 < 2);
                    int i7 = 8;
                    int i8 = 0;
                    do {
                        C26210Cuo.A05(bArr3, iArr, i7, i8 + 8);
                        i7 += 4;
                        i8++;
                    } while (i8 < 2);
                    int[] iArr3 = new int[16];
                    C27197DYw.A02(iArr, iArr3);
                    iArr[1] = iArr3[0] - iArr[0];
                    iArr[2] = iArr3[5] - iArr[5];
                    iArr[3] = iArr3[10] - iArr[10];
                    iArr[4] = iArr3[15] - iArr[15];
                    iArr[11] = iArr3[6] - iArr[6];
                    iArr[12] = iArr3[7] - iArr[7];
                    iArr[13] = iArr3[8] - iArr[8];
                    iArr[14] = iArr3[9] - iArr[9];
                    int i9 = 16;
                    int i10 = 0;
                    do {
                        C26210Cuo.A05(bArr3, iArr, i9, i10 + 6);
                        i9 += 4;
                        i10++;
                    } while (i10 < 2);
                    int i11 = 0;
                    dYw.A03 = 0;
                    dYw.A00 = 0;
                    dYw.A01 = 0;
                    dYw.A02 = 0;
                    iArr[9] = 0;
                    iArr[8] = 0;
                    byte[] bArr5 = dYw.A05;
                    int[] iArr4 = dYw.A07;
                    C27197DYw.A02(iArr, iArr4);
                    int i12 = 0;
                    do {
                        BEB.A1T(bArr5, iArr4[i12], i11);
                        i11 += 4;
                        i12++;
                    } while (i12 < 16);
                    dYw.A04 = true;
                    return dYw;
                }
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("XSalsa20");
                throw AnonymousClass001.A12(" requires a 256 bit key", A102);
            } else {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("XSalsa20");
                throw AnonymousClass001.A12(" Init parameters must contain a KeyParameter (or null for re-init)", A103);
            }
        } else {
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("XSalsa20");
            A104.append(" requires exactly ");
            A104.append(24);
            throw AnonymousClass001.A12(" bytes of IV", A104);
        }
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C27197DYw A00 = A00(bArr, bArr2);
        C27196DYv dYv = new C27196DYv();
        byte[] bArr4 = new byte[32];
        A00.A03(bArr4, bArr4, 0, 32, 0);
        int length = bArr3.length;
        byte[] bArr5 = new byte[(length + 16)];
        A00.A03(bArr3, bArr5, 0, length, 16);
        dYv.BdA(new C27190DYo(bArr4));
        dYv.update(bArr5, 16, length);
        dYv.BJ5(bArr5, 0);
        return bArr5;
    }
}
