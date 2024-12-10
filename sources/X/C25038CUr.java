package X;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: X.CUr  reason: case insensitive filesystem */
public abstract class C25038CUr {
    public static final C25038CUr A00 = new C23359Bfl(new C25804CmH("base16()", "0123456789ABCDEF".toCharArray()));
    public static final C25038CUr A01;
    public static final C25038CUr A02;
    public static final C25038CUr A03 = new C23360Bfm(new C25804CmH("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final C25038CUr A04 = new C23360Bfm(new C25804CmH("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');

    public final String A00(byte[] bArr, int i) {
        int length = bArr.length;
        C25874Cni.A02(0, i, length);
        C23360Bfm bfm = (C23360Bfm) this;
        C25804CmH cmH = bfm.A00;
        int i2 = cmH.A03;
        StringBuilder A0t = BE6.A0t(cmH.A02 * CBC.A00(i, i2, RoundingMode.CEILING));
        try {
            if (bfm instanceof C23358Bfk) {
                int i3 = 0;
                C25874Cni.A02(0, i, length);
                for (int i4 = i; i4 >= 3; i4 -= 3) {
                    int i5 = i3 + 1;
                    int i6 = i5 + 1;
                    byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                    char[] cArr = cmH.A07;
                    BE6.A1G(A0t, cArr, b >>> 18);
                    BE6.A1G(A0t, cArr, (b >>> 12) & 63);
                    BE6.A1G(A0t, cArr, (b >>> 6) & 63);
                    BE6.A1G(A0t, cArr, b & 63);
                    i3 = i6 + 1;
                }
                if (i3 < i) {
                    bfm.A01(A0t, bArr, i3, i - i3);
                }
            } else if (bfm instanceof C23359Bfl) {
                C23359Bfl bfl = (C23359Bfl) bfm;
                C25874Cni.A02(0, i, length);
                for (int i7 = 0; i7 < i; i7++) {
                    byte b2 = bArr[i7] & 255;
                    char[] cArr2 = bfl.A00;
                    BE6.A1G(A0t, cArr2, b2);
                    BE6.A1G(A0t, cArr2, b2 | 256);
                }
            } else {
                C25874Cni.A02(0, i, length);
                for (int i8 = 0; i8 < i; i8 += i2) {
                    bfm.A01(A0t, bArr, i8, BE6.A09(i, i8, i2));
                }
            }
            return A0t.toString();
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    static {
        C25804CmH cmH = new C25804CmH("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        C23360Bfm bfm = new C23360Bfm(cmH, '=');
        if (cmH.A07.length == 64) {
            A01 = bfm;
            C25804CmH cmH2 = new C25804CmH("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
            C23360Bfm bfm2 = new C23360Bfm(cmH2, '=');
            if (cmH2.A07.length == 64) {
                A02 = bfm2;
                return;
            }
            throw BE6.A0j();
        }
        throw BE6.A0j();
    }
}
