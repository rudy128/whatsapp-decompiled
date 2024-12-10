package X;

import java.io.InputStream;

public class A42 {
    public static final byte[] A01 = {71, 79, 65};
    public final InputStream A00;

    public static void A00(A42 a42, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (length > 0) {
            int read = a42.A00.read(bArr, i, length);
            if (read != -1) {
                i += read;
                length -= read;
            } else {
                throw C17880vN.A0f("Closed before read completed!");
            }
        }
    }

    public A42(InputStream inputStream) {
        this.A00 = inputStream;
    }
}
