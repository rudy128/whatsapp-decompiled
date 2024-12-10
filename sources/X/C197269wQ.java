package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.9wQ  reason: invalid class name and case insensitive filesystem */
public abstract class C197269wQ {
    public static final Pattern A00 = Pattern.compile("[0-9]+");

    public static boolean A00(C18030ve r3, String str) {
        if (!C18020vd.A05(C18040vf.A02, r3, 1458)) {
            return false;
        }
        String A0I = r3.A0I(1459);
        if (TextUtils.isEmpty(A0I) || TextUtils.isEmpty(str) || !A0I.contains(str)) {
            return false;
        }
        return true;
    }
}
