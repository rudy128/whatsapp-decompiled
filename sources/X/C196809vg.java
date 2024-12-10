package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.9vg  reason: invalid class name and case insensitive filesystem */
public abstract class C196809vg {
    public static boolean A01(C19830z4 r10, C18030ve r11, AnonymousClass1QD r12) {
        if (C18020vd.A05(C18040vf.A02, r11, 6819)) {
            String string = r12.A03().getString("pref_income_verification_state", "not_required");
            long A0W = r10.A0W("payments_income_collection_timestamp");
            if (!TextUtils.equals(string, "collected")) {
                if (!TextUtils.equals(string, "pending")) {
                    if (A0W <= 0 || System.currentTimeMillis() >= r10.A0W("payments_income_collection_timestamp")) {
                        r12.A0N("pending");
                    } else {
                        r12.A0N("not_required");
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static C19760yx A00(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Object obj = str;
            if (TextUtils.isEmpty(str2)) {
                List asList = Arrays.asList(str.split("\\|"));
                if (asList.size() == 2) {
                    Object A0p = C108955ca.A0p(asList);
                    str2 = TextUtils.join(".", asList);
                    obj = A0p;
                }
            }
            return AnonymousClass8BR.A0B(obj, str2);
        }
        return null;
    }
}
