package X;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: X.9PY  reason: invalid class name */
public abstract class AnonymousClass9PY {
    public static long A00(DFL dfl) {
        Object A00 = DFL.A00(dfl, 35);
        if (A00 != null) {
            if (A00 instanceof String) {
                String str = (String) A00;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        return Long.parseLong(str);
                    } catch (NumberFormatException e) {
                        Log.e("WaRcCountDownTimer", AnonymousClass001.A1E(A00, "Invalid long value:", AnonymousClass000.A10()), e);
                        return 0;
                    }
                }
            } else if (A00 instanceof Number) {
                return C17880vN.A05(A00);
            } else {
                throw AnonymousClass000.A0k("Attempting to extract unrecognized type from countdown timer component");
            }
        }
        return 0;
    }
}
