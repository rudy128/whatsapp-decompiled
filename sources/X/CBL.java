package X;

import android.util.Log;

public abstract class CBL {
    public static void A00(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            boolean isLoggable = Log.isLoggable("Vision", 3);
            String format = String.format(str, objArr);
            if (isLoggable) {
                Log.e("Vision", format, th);
                return;
            }
            String valueOf = String.valueOf(th);
            StringBuilder A0s = BEA.A0s(valueOf, BE8.A0C(format) + 2);
            A0s.append(format);
            Log.e("Vision", AnonymousClass001.A1H(": ", valueOf, A0s));
        }
    }
}
