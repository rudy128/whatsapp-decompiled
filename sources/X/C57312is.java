package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.2is  reason: invalid class name and case insensitive filesystem */
public final class C57312is {
    public final String A00;
    public final C52432au A01;

    public BD1 A00(String str) {
        C59142lp r3 = this.A01.A00;
        BD1 bd1 = r3.A00;
        if (TextUtils.isEmpty(str)) {
            return bd1;
        }
        String str2 = ((AnonymousClass1KL) AnonymousClass1KL.A0C).A06;
        C18070vi.A0W(str2);
        if (str.equals(str2)) {
            return bd1;
        }
        if (!r3.A01.contains(str.toUpperCase(Locale.US))) {
            return null;
        }
        return bd1;
    }

    public C57312is(C52432au r1, String str) {
        this.A01 = r1;
        C17960vV.A06(str);
        this.A00 = str;
    }
}
