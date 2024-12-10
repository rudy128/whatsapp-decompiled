package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.9ob  reason: invalid class name and case insensitive filesystem */
public final class C192559ob {
    public final C20114A7x A00;
    public final AnonymousClass00H A01;
    public final C26911Ty A02;
    public final C193719qY A03;

    public final C194359rb A00(AEW aew, Set set) {
        C179409Hv r0;
        UserJid userJid;
        C19973A1i a1i = (C19973A1i) this.A01.get();
        if (aew == null || (userJid = aew.A09) == null) {
            r0 = null;
        } else {
            r0 = this.A00.A09(userJid);
        }
        if (!a1i.A01(r0, aew) || set == null) {
            return null;
        }
        C193719qY r02 = this.A03;
        return new C194359rb(set, r02.A01, r02.A00);
    }

    public final void A01(UserJid userJid, Set set, C22821Di r6) {
        this.A02.A0D(new C20473AMk(r6, this, set, 2), userJid);
    }

    public C192559ob(C26911Ty r1, C20114A7x a7x, C193719qY r3, AnonymousClass00H r4) {
        C18070vi.A0o(a7x, r1, r4);
        this.A00 = a7x;
        this.A02 = r1;
        this.A01 = r4;
        this.A03 = r3;
    }
}
