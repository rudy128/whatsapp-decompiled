package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9pY  reason: invalid class name and case insensitive filesystem */
public class C193109pY {
    public final C193919qs A00;

    public C193109pY(C193919qs r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final List A00() {
        String A002 = this.A00.A00("newsletter_never_nudge_to_unmute_list_key");
        if (A002 == null || A002.length() == 0) {
            return C18460wS.A00;
        }
        String A0D = C29361c9.A0D(A002, 1);
        int length = A0D.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return C108985cd.A0s(C108985cd.A0o(C29361c9.A0Q(A0D, length), "\\s*"), 1);
    }

    public final List A01(C29681ch r5) {
        String A002 = this.A00.A00(r5.user);
        if (A002 == null || A002.length() == 0) {
            return C18460wS.A00;
        }
        String A0D = C29361c9.A0D(A002, 1);
        int length = A0D.length() - 1;
        if (length < 0) {
            length = 0;
        }
        List A0s = C108985cd.A0s(C108985cd.A0o(C29361c9.A0Q(A0D, length), "\\s*"), 1);
        ArrayList A0D2 = C29351c6.A0D(A0s);
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            C17880vN.A1R(A0D2, Long.parseLong(C17880vN.A0v(it)));
        }
        return A0D2;
    }

    public final void A02(C29681ch r4, List list) {
        String obj;
        C193919qs r2 = this.A00;
        String str = r4.user;
        if (list.isEmpty()) {
            obj = "";
        } else {
            obj = list.toString();
        }
        r2.A01(str, obj);
    }
}
