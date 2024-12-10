package X;

import android.os.Build;
import android.util.Log;

public abstract class A3G {
    public static String A00(String str) {
        int i = Build.VERSION.SDK_INT;
        String A0A = C17900vP.A0A("TRuntime.", str);
        if (i >= 26 || A0A.length() <= 23) {
            return A0A;
        }
        return AnonymousClass8BS.A0o(A0A, 23);
    }

    public static void A01(Object obj, String str, String str2) {
        String A00 = A00(str);
        if (Log.isLoggable(A00, 3)) {
            Log.d(A00, String.format(str2, AnonymousClass8BV.A1b(obj)));
        }
    }

    public static void A02(String str, String str2, Throwable th) {
        String A00 = A00(str);
        if (Log.isLoggable(A00, 6)) {
            Log.e(A00, str2, th);
        }
    }
}
