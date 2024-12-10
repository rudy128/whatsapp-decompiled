package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9lj  reason: invalid class name and case insensitive filesystem */
public final class C190919lj {
    public final C26911Ty A00;
    public final A8Q A01;
    public final C18030ve A02;
    public final AnonymousClass10I A03;

    public C190919lj(C26911Ty r1, A8Q a8q, C18030ve r3, AnonymousClass10I r4) {
        C18070vi.A0s(a8q, r1, r4, r3);
        this.A01 = a8q;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void A00(UserJid userJid, String str, int i, int i2, int i3, boolean z) {
        Integer valueOf = Integer.valueOf(i3);
        Boolean valueOf2 = Boolean.valueOf(z);
        if (C18020vd.A05(C18040vf.A02, this.A02, 1514)) {
            this.A03.CGF(new C21401AjU(this, userJid, valueOf2, valueOf, str, (String) null, i2, i, 1));
        }
    }
}
