package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.6lp  reason: invalid class name and case insensitive filesystem */
public final class C131886lp {
    public final C24921Me A00;
    public final C18140vp A01;

    public final AnonymousClass7C7 A00(AnonymousClass1E7 r7, boolean z) {
        Jid A012;
        C122636Rd r4;
        int i;
        C122636Rd r1;
        boolean A1Z = C72473Md.A1Z(this.A01);
        C24921Me r0 = this.A00;
        if (A1Z) {
            String A0J = r0.A0J(r7);
            if (A0J == null) {
                return null;
            }
            if (z) {
                i = 2131896300;
                r1 = C122636Rd.A0J;
            } else {
                i = 2131896535;
                r1 = C122636Rd.A0K;
            }
            return AnonymousClass720.A00(r1, A0J, AnonymousClass3MW.A1a(), i).A02();
        }
        String A0I = r0.A0I(r7);
        if (A0I == null || (A012 = AnonymousClass1E7.A01(r7)) == null) {
            return null;
        }
        if (z) {
            r4 = C122636Rd.A0J;
        } else {
            r4 = C122636Rd.A0K;
        }
        AnonymousClass482 r3 = new AnonymousClass482(A0I);
        int i2 = 2131896534;
        if (z) {
            i2 = 2131896299;
        }
        AnonymousClass720 r12 = new AnonymousClass720(r4, r3, C72453Mb.A0q(i2), 2131102073);
        List A0t = C29431cG.A0t(C18070vi.A0M(A012));
        r12.A06 = A0t;
        r12.A08 = AnonymousClass000.A1a(A0t);
        return r12.A02();
    }

    public C131886lp(C24921Me r1, C18140vp r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
