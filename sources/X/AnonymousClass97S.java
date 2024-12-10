package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.97S  reason: invalid class name */
public class AnonymousClass97S extends C20108A7n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass97S(AnonymousClass190 r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    public static final void A06(AnonymousClass8X1 r2, List list) {
        C18070vi.A0d(list, 1);
        Iterator it = C29431cG.A0q(list).iterator();
        while (it.hasNext()) {
            r2.A0J(C17880vN.A0v(it));
        }
    }

    public static UserJid A01(AnonymousClass190 r2, C20108A7n a7n, String str) {
        return (UserJid) AnonymousClass9SY.A00(r2, a7n.A06, UserJid.class, str);
    }

    public static final void A02(AnonymousClass1E9 r0, UserJid userJid, AnonymousClass8X7 r2, AnonymousClass8X1 r3) {
        if (r0 != null) {
            AnonymousClass8X7.A00(r0, r2);
        } else {
            r2.A0G();
        }
        if (userJid != null) {
            r3.A0K(userJid.getRawString());
        } else {
            r3.A0G();
        }
    }

    public static void A04(AnonymousClass8X7 r1, C20108A7n a7n) {
        AnonymousClass1BI r0 = a7n.A05;
        C17960vV.A07(r0);
        r1.A0J(r0.getRawString());
    }

    public static void A08(C20108A7n a7n, C48392Mh r2) {
        a7n.A0B = C22971Dz.A0B(r2.A01);
    }

    public static AnonymousClass1E9 A00(AnonymousClass190 r0, Jid jid, Class cls, String str) {
        return (AnonymousClass1E9) AnonymousClass9SY.A00(r0, jid, cls, str);
    }

    public static void A03(AnonymousClass1E9 r0, UserJid userJid, AnonymousClass8X7 r2, AnonymousClass8X1 r3, C20108A7n a7n) {
        A02(r0, userJid, r2, r3);
        A06(r3, a7n.A0B);
    }

    public static void A05(AnonymousClass8X1 r0, C179859Ke r1, AnonymousClass206 r2, C20108A7n a7n) {
        r0.A0I(r1);
        a7n.A06 = r2.A0H();
    }

    public static void A07(AnonymousClass206 r0, C20108A7n a7n) {
        a7n.A06 = r0.A0H();
    }
}
