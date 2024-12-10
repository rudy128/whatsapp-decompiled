package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: X.CDm  reason: case insensitive filesystem */
public abstract class C24647CDm {
    public static byte[] A00(InputStream inputStream) {
        ByteArrayOutputStream A15 = C108945cZ.A15();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            if (read < 0) {
                return A15.toByteArray();
            }
            A15.write(bArr, 0, read);
        }
    }
}
