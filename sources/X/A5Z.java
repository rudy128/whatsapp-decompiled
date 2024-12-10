package X;

import android.util.Log;

public abstract class A5Z {
    public static final Object A00 = C17880vN.A0p();
    public static volatile A5Z A01;

    public void A02(String str) {
        if (((C162188Jp) this).A00 <= 2) {
            Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
        }
    }

    public void A03(String str, String str2) {
        if (((C162188Jp) this).A00 <= 3) {
            Log.d(str, str2);
        }
    }

    public void A07(String str, String str2, Throwable th) {
        if (((C162188Jp) this).A00 <= 3) {
            Log.d(str, str2, th);
        }
    }

    public static A5Z A00() {
        A5Z a5z;
        synchronized (A00) {
            if (A01 == null) {
                A01 = new C162188Jp(3);
            }
            a5z = A01;
        }
        return a5z;
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = AnonymousClass8BS.A0o(str, 20);
        }
        return AnonymousClass000.A0y(str, sb);
    }

    public void A08(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public void A09(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    public void A0A(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void A04(String str, String str2) {
        Log.e(str, str2);
    }

    public void A05(String str, String str2) {
        Log.i(str, str2);
    }

    public void A06(String str, String str2) {
        Log.w(str, str2);
    }
}
