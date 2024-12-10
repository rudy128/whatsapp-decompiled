package X;

import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.70l  reason: invalid class name and case insensitive filesystem */
public abstract class C1402170l {
    public static final boolean A00(AnonymousClass12L r4, Jid jid) {
        C18070vi.A0d(r4, 0);
        if (jid == null) {
            return false;
        }
        C18030ve r2 = r4.A00;
        C18040vf r1 = C18040vf.A02;
        if (A02(jid, C18020vd.A01(r1, r2, 1035)) || A02(jid, C18020vd.A01(r1, r2, 1036))) {
            return true;
        }
        return false;
    }

    public static final boolean A01(AnonymousClass12L r2, Jid jid) {
        C18070vi.A0d(r2, 0);
        if (jid == null) {
            return false;
        }
        return A02(jid, C18020vd.A01(C18040vf.A02, r2.A00, 1035));
    }

    public static final boolean A02(Jid jid, String str) {
        Iterable iterable;
        if (str == null || AnonymousClass1YF.A0T(str)) {
            return false;
        }
        List A0v = C108965cb.A0v(str, ",", 0);
        if (!A0v.isEmpty()) {
            ListIterator A18 = C108955ca.A18(A0v);
            while (true) {
                if (A18.hasPrevious()) {
                    if (C108985cd.A08(A18) != 0) {
                        iterable = C108985cd.A0t(A0v, A18);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        iterable = C18460wS.A00;
        return C29431cG.A12(iterable).contains(jid.user);
    }
}
