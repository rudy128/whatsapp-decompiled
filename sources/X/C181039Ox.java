package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

@Deprecated
/* renamed from: X.9Ox  reason: invalid class name and case insensitive filesystem */
public abstract class C181039Ox {
    @Deprecated
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        C18210vx.A00(inputStream);
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return A15.toByteArray();
            }
            A15.write(bArr, 0, read);
        }
    }
}
