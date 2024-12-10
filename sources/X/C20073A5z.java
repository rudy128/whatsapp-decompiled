package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.A5z  reason: case insensitive filesystem */
public abstract class C20073A5z {
    public static final C21568AmF A00 = new C21568AmF();

    public static byte[] A01(String str, int i) {
        try {
            return A00.A00(str, 1, i);
        } catch (Exception e) {
            throw new C180099Lc(C17900vP.A0C("exception decoding Hex string: ", AnonymousClass000.A10(), e), e);
        }
    }

    public static byte[] A00(String str) {
        try {
            return A00.A00(str, 0, str.length());
        } catch (Exception e) {
            throw new C180099Lc(C17900vP.A0C("exception decoding Hex string: ", AnonymousClass000.A10(), e), e);
        }
    }

    public static byte[] A02(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        try {
            A00.BK1(A15, bArr, i, i2);
            return A15.toByteArray();
        } catch (Exception e) {
            throw new C180109Ld(C17900vP.A0C("exception encoding Hex string: ", AnonymousClass000.A10(), e), e);
        }
    }
}
