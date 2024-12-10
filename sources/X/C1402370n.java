package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.70n  reason: invalid class name and case insensitive filesystem */
public abstract class C1402370n {
    public static String A01(File file, MessageDigest messageDigest) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(C26511Sk.A0J(file));
        try {
            A02(bufferedInputStream, messageDigest);
            String encodeToString = Base64.encodeToString(messageDigest.digest(), 2);
            bufferedInputStream.close();
            return encodeToString;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A02(InputStream inputStream, MessageDigest messageDigest) {
        byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                messageDigest.update(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static String A00(File file) {
        try {
            return A01(file, C108945cZ.A1I());
        } catch (NoSuchAlgorithmException e) {
            throw new IOException(e);
        }
    }
}
