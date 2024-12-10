package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.A6v  reason: case insensitive filesystem */
public final class C20093A6v {
    public static final C20093A6v A00 = new Object();

    public static final boolean A01(C166398cp r2) {
        C18070vi.A0d(r2, 0);
        if (r2.interactiveMessageCase_ != 6 || !A02(r2, "review_and_pay")) {
            return false;
        }
        return true;
    }

    public static final ArrayList A00(C164818a7 r4) {
        EE9<AnonymousClass8Z3> ee9;
        if (r4 == null || (ee9 = r4.buttons_) == null) {
            return AnonymousClass000.A13();
        }
        ArrayList A0D = C29351c6.A0D(ee9);
        for (AnonymousClass8Z3 r0 : ee9) {
            String str = r0.name_;
            C18070vi.A0X(str);
            A0D.add(new C20253ADl(new C20271AEe(str, r0.buttonParamsJson_), false));
        }
        return C29431cG.A0m(A0D);
    }

    public static final boolean A02(C166398cp r2, String str) {
        AnonymousClass8Z3 r22;
        C164818a7 A0S = r2.A0S();
        if (A0S == null || A0S.buttons_.size() != 1) {
            r22 = null;
        } else {
            r22 = (AnonymousClass8Z3) A0S.buttons_.get(0);
        }
        if (r22 == null || !str.equals(r22.name_) || TextUtils.isEmpty(r22.buttonParamsJson_)) {
            return false;
        }
        return true;
    }
}
