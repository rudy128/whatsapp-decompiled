package X;

import android.graphics.Bitmap;
import com.whatsapp.media.transcode.Mozjpeg;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.2om  reason: invalid class name and case insensitive filesystem */
public abstract class C60892om {
    public static final Mozjpeg A00 = new Object();

    public static byte[] A00(Bitmap bitmap, int i, boolean z, boolean z2) {
        BufferedInputStream bufferedInputStream;
        Bitmap bitmap2 = bitmap;
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            try {
                File createTempFile = File.createTempFile(C26511Sk.A0K(), (String) null);
                A00.A00(bitmap2, createTempFile.getAbsolutePath(), i, false, z, z2);
                if (createTempFile.length() > 0) {
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(createTempFile));
                        byte[] A04 = AnonymousClass1EY.A04(bufferedInputStream);
                        bufferedInputStream.close();
                        createTempFile.delete();
                        return A04;
                    } catch (Throwable th) {
                        createTempFile.delete();
                        throw th;
                    }
                }
            } catch (IOException e) {
                Log.e("BitmapCompressor/createCompressedByteArray", e);
                return null;
            }
        }
        return null;
        throw th;
    }
}
