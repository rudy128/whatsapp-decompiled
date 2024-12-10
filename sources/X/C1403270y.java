package X;

import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.70y  reason: invalid class name and case insensitive filesystem */
public class C1403270y {
    public static File A00;

    public static synchronized File A00(C218617r r9, C18010vc r10, C26551So r11, String str, int i) {
        File file;
        synchronized (C1403270y.class) {
            A00 = C26511Sk.A0G(r9, r10, r11, str, 0, i);
            SharedPreferences.Editor edit = r10.A05(C19620yd.A09).edit();
            edit.putString("external_file_image", A00.getAbsolutePath());
            edit.apply();
            file = A00;
        }
        return file;
    }

    public static synchronized File A01(C18010vc r3) {
        File file;
        String A0r;
        synchronized (C1403270y.class) {
            if (A00 == null && (A0r = C17880vN.A0r(r3.A05(C19620yd.A09), "external_file_image")) != null) {
                A00 = C108945cZ.A17(A0r);
            }
            file = A00;
        }
        return file;
    }
}
