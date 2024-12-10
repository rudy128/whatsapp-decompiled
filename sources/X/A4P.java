package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class A4P {
    public final AnonymousClass9UO A00;

    public File A02(C179679Ix r6, InputStream inputStream, String str) {
        FileOutputStream A19;
        File A0e = C17880vN.A0e(A00(this), A01(r6, str, true));
        try {
            A19 = C108945cZ.A19(A0e);
            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A19.write(bArr, 0, read);
                } else {
                    A19.flush();
                    A19.close();
                    inputStream.close();
                    return A0e;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static File A00(A4P a4p) {
        File A0e = C17880vN.A0e(a4p.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0e.isFile()) {
            A0e.delete();
        }
        AnonymousClass8BV.A1H(A0e);
        return A0e;
    }

    public static String A01(C179679Ix r5, String str, boolean z) {
        String str2;
        if (z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(".temp");
            str2 = AnonymousClass000.A0y(r5.extension, A10);
        } else {
            str2 = r5.extension;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder A102 = AnonymousClass000.A10();
                for (byte valueOf : digest) {
                    Object[] A1a = AnonymousClass3MW.A1a();
                    A1a[0] = Byte.valueOf(valueOf);
                    A102.append(String.format("%02x", A1a));
                }
                replaceAll = A102.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        StringBuilder A103 = AnonymousClass000.A10();
        C17890vO.A10("lottie_cache_", replaceAll, str2, A103);
        return A103.toString();
    }

    public A4P(AnonymousClass9UO r1) {
        this.A00 = r1;
    }
}
