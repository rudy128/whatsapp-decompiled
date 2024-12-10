package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: X.Cla  reason: case insensitive filesystem */
public final class C25764Cla {
    public final String A00;

    public static String A00(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder A11 = AnonymousClass000.A11(str2);
                A11.append(" [");
                str2 = BEA.A0m(join, A11);
            }
        }
        return AnonymousClass001.A1H(" : ", str2, AnonymousClass000.A11(str));
    }

    public final void A01(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", A00(this.A00, str, objArr), th);
        }
    }

    public final void A02(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public final void A03(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", A00(this.A00, str, objArr));
        }
    }

    public C25764Cla(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UID: [");
        A10.append(myUid);
        A10.append("]  PID: [");
        A10.append(myPid);
        this.A00 = AnonymousClass000.A0y("] ", A10).concat(str);
    }
}
