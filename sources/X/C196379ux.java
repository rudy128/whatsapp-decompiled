package X;

import android.util.Log;
import java.util.Set;

/* renamed from: X.9ux  reason: invalid class name and case insensitive filesystem */
public abstract class C196379ux {
    public static void A00(String str) {
        Set set = AnonymousClass9T1.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, (Throwable) null);
            set.add(str);
        }
    }

    public static void A01(String str, Throwable th) {
        Set set = AnonymousClass9T1.A00;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }
}
