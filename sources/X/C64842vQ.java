package X;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.2vQ  reason: invalid class name and case insensitive filesystem */
public class C64842vQ implements AnonymousClass3KY {
    public final String A00;
    public final HashMap A01 = C17880vN.A11();

    public static boolean A00(String str, String str2) {
        HashMap hashMap = FileProvider.A05;
        int length = str.length();
        if (length > 0) {
            int i = length - 1;
            if (str.charAt(i) == '/') {
                str = str.substring(0, i);
            }
        }
        int length2 = str2.length();
        if (length2 > 0) {
            int i2 = length2 - 1;
            if (str2.charAt(i2) == '/') {
                str2 = str2.substring(0, i2);
            }
        }
        if (str.equals(str2) || str.startsWith(C17890vO.A0c(AnonymousClass000.A11(str2), '/'))) {
            return true;
        }
        return false;
    }

    public C64842vQ(String str) {
        this.A00 = str;
    }

    public File BRd(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.A01.get(decode);
        if (file != null) {
            File A0e = C17880vN.A0e(file, decode2);
            try {
                File canonicalFile = A0e.getCanonicalFile();
                if (A00(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw AnonymousClass000.A0k(AnonymousClass001.A1E(A0e, "Failed to resolve canonical path for ", AnonymousClass000.A10()));
            }
        } else {
            throw AnonymousClass000.A0k(AnonymousClass001.A1E(uri, "Unable to find configured root for ", AnonymousClass000.A10()));
        }
    }
}
