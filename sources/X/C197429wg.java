package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.9wg  reason: invalid class name and case insensitive filesystem */
public abstract class C197429wg {
    public static final C22529BBm A00 = new C21569AmG();

    public static byte[] A00(byte[] bArr) {
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            A00.BK1(byteArrayOutputStream, bArr, 0, length);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new C180109Ld(C17900vP.A0C("exception encoding base64 string: ", AnonymousClass000.A10(), e), e);
        }
    }
}
