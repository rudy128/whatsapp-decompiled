package X;

import android.text.TextUtils;

/* renamed from: X.9xV  reason: invalid class name and case insensitive filesystem */
public class C197929xV {
    public final C191339mR A00;
    public final C188439hQ A01;

    public C197929xV(C191339mR r1, C188439hQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(String str) {
        if (TextUtils.isEmpty(str) || str.length() > 255 || str.equalsIgnoreCase("facebook2@icici") || !AnonymousClass8BU.A1V(str, AnonymousClass9U9.A02)) {
            return false;
        }
        return true;
    }
}
