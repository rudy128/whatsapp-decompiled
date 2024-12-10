package X;

import com.whatsapp.util.Log;

/* renamed from: X.1ez  reason: invalid class name and case insensitive filesystem */
public abstract class C31081ez {
    public static final void A01(String str) {
        C18070vi.A0d(str, 0);
        Log.e(A00(str));
    }

    public static final void A02(String str) {
        C18070vi.A0d(str, 0);
        Log.i(A00(str));
    }

    public static final void A03(String str, Throwable th) {
        C18070vi.A0d(str, 0);
        Log.e(A00(str), th);
    }

    public static final String A00(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("[WAFFLE] ");
        sb.append(str);
        return sb.toString();
    }
}
