package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.ParseException;

/* renamed from: X.A3b  reason: case insensitive filesystem */
public abstract class C20011A3b {
    public static byte[][] A01(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = new byte[i2];
        byte[][] bArr4 = {bArr2, bArr3};
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr4;
    }

    public static byte[][] A02(byte[] bArr, int i, int i2, int i3) {
        String obj;
        if (bArr != null && i2 >= 0) {
            int i4 = i + i2;
            if (bArr.length >= i4 + i3) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                byte[] bArr4 = new byte[i3];
                byte[][] bArr5 = {bArr2, bArr3, bArr4};
                System.arraycopy(bArr, i4, bArr4, 0, i3);
                return bArr5;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Input too small: ");
        if (bArr == null) {
            obj = null;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArr) {
                stringBuffer.append("(byte)0x");
                char[] cArr = C182229To.A00;
                stringBuffer.append(cArr[(b >> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
                stringBuffer.append(", ");
            }
            obj = stringBuffer.toString();
        }
        throw new ParseException(AnonymousClass000.A0y(obj, A10), 0);
    }

    public static byte[] A00(byte[]... bArr) {
        try {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            for (byte[] write : bArr) {
                A15.write(write);
            }
            return A15.toByteArray();
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
