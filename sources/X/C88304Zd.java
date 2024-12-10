package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.4Zd  reason: invalid class name and case insensitive filesystem */
public final class C88304Zd {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final AnonymousClass1CJ A02;

    public static boolean A00(AnonymousClass11S r4, C88304Zd r5, AnonymousClass1BI r6, C436420i r7) {
        if (r4.A0O(r6) && A01(r5, r7)) {
            if (C18020vd.A05(C18040vf.A02, r5.A01, 4579)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A02(AnonymousClass206 r5) {
        List A0T;
        if (!(r5 instanceof C48392Mh)) {
            return false;
        }
        C436420i r52 = (C436420i) r5;
        if (r52.A00 == 12 && (A0T = r52.A0T()) != null && A0T.size() == 1) {
            return A00(this.A00, this, (AnonymousClass1BI) A0T.get(0), r52);
        }
        return false;
    }

    public final boolean A03(AnonymousClass206 r4) {
        if (!(r4 instanceof C48392Mh)) {
            return false;
        }
        C436420i r42 = (C436420i) r4;
        if (r42.A00 == 11) {
            return A00(this.A00, this, r42.A0H(), r42);
        }
        return false;
    }

    public final boolean A04(AnonymousClass206 r5) {
        List A0T;
        if (!(r5 instanceof C48392Mh)) {
            return false;
        }
        C436420i r52 = (C436420i) r5;
        if (r52.A00 == 20 && (A0T = r52.A0T()) != null && A0T.size() == 1) {
            return A00(this.A00, this, (AnonymousClass1BI) A0T.get(0), r52);
        }
        return false;
    }

    public static final boolean A01(C88304Zd r3, C436420i r4) {
        GroupJid A0f;
        AnonymousClass1BI r0 = r4.A0v.A00;
        if (r0 == null || (A0f = AnonymousClass3MW.A0f(r0)) == null || r3.A02.A06(A0f) != 0) {
            return false;
        }
        return true;
    }

    public C88304Zd(AnonymousClass11S r1, AnonymousClass1CJ r2, C18030ve r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A01 = r3;
        this.A00 = r1;
        this.A02 = r2;
    }
}
