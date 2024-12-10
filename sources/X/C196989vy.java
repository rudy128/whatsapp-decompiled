package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.9vy  reason: invalid class name and case insensitive filesystem */
public abstract class C196989vy {
    public static final void A00(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static final byte[] A01(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(DefaultCrypto.BUFFER_SIZE, inputStream.available()));
        A00(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C18070vi.A0X(byteArray);
        return byteArray;
    }
}
