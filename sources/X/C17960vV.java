package X;

import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.0vV  reason: invalid class name and case insensitive filesystem */
public abstract class C17960vV {
    public static final ConditionVariable A00 = new ConditionVariable();
    public static volatile Boolean A01;

    public static void A01() {
        String obj;
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty((CharSequence) null)) {
            obj = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) null);
            sb2.append(" ");
            obj = sb2.toString();
        }
        sb.append(obj);
        sb.append("should not be run in main thread");
        A0F(!C22781De.A03(), sb.toString());
    }

    public static void A03() {
        A00.open();
    }

    public static void A05(View view) {
        A08(view, "");
    }

    public static void A06(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("");
        }
    }

    public static void A07(Object obj) {
        A08(obj, "");
    }

    public static void A08(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void A0A(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A0C(boolean z) {
        A0G(z, "");
    }

    public static void A0D(boolean z) {
        A0H(z, "");
    }

    public static void A0F(boolean z, String str) {
        if (!z) {
            Log.e((Throwable) new AssertionError(str));
        }
    }

    public static void A0G(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A0H(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void A0I(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("");
        }
    }

    public static void A0J(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("");
        }
    }

    public static void A00() {
        A01();
    }

    public static void A02() {
        A0F(C22781De.A03(), "should be run in ui main thread");
    }

    public static void A04(HandlerThread handlerThread) {
        boolean z = false;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            z = true;
        }
        A0D(z);
    }

    public static void A09(String str, Throwable th) {
        A07(th);
        A07(str);
        Log.e(str, th);
    }

    public static void A0B(Throwable th) {
        A07(th);
        Log.e(th);
    }

    public static void A0E(boolean z) {
        A01 = Boolean.valueOf(z);
    }
}
