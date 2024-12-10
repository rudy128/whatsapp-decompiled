package X;

import com.whatsapp.util.Log;

public abstract class A3S {
    public static final void A01(AnonymousClass2HL r1, C173578vJ r2, int i) {
        if (r2 != null) {
            r2.A03 = false;
        }
        if (r1 != null) {
            r1.A00 = false;
            r1.A08 = Integer.valueOf(i);
        }
    }

    public static final byte[] A02(AnonymousClass2HL r4, C173578vJ r5, byte[] bArr) {
        int length;
        String str;
        if (bArr == null || (length = bArr.length) == 0) {
            Log.w("DecryptUtil/removePadding/ axolotl derived null or empty plaintext from message");
            return null;
        }
        byte b = bArr[length - 1] & 255;
        if (b == 0) {
            str = "DecryptUtil/removePadding/ axolotl derived plaintext has invalid padding";
        } else if (b >= length) {
            str = "DecryptUtil/removePadding/ axolotl derived entire plaintext as padding";
        } else {
            int i = length - b;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        Log.w(str);
        A01(r4, r5, 10);
        return null;
    }

    public static final C166418cr A00(byte[] bArr) {
        C166418cr A01 = C166418cr.A01(bArr);
        C18070vi.A0X(A01);
        if (AnonymousClass000.A1O(A01.bitField0_ & 33554432)) {
            C164758a1 r0 = A01.deviceSentMessage_;
            if (r0 == null) {
                r0 = C164758a1.DEFAULT_INSTANCE;
            }
            A01 = r0.message_;
            if (A01 == null) {
                A01 = C166418cr.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(A01);
        }
        return A01;
    }
}
