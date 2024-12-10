package X;

import java.util.Set;

/* renamed from: X.9wS  reason: invalid class name and case insensitive filesystem */
public abstract class C197289wS {
    public static Set A00;

    static {
        String[] strArr = new String[9];
        strArr[0] = "payments:settings";
        strArr[1] = "payments:transaction";
        strArr[2] = "payments:account-details";
        strArr[3] = "payments:request";
        strArr[4] = "payments:verify-number";
        strArr[5] = "payments:account-select";
        strArr[6] = "payments:bank-select";
        strArr[7] = "payments:enter-card";
        A00 = AnonymousClass8BR.A12(C18070vi.A0O("payments:setup-pin", strArr, 8));
    }

    public static final boolean A00(String str) {
        if (str == null) {
            return false;
        }
        return A00.contains(str);
    }
}
