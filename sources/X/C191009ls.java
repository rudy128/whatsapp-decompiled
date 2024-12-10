package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9ls  reason: invalid class name and case insensitive filesystem */
public final class C191009ls {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass1PM A02;
    public final C18140vp A03;

    public final int A00(AnonymousClass1BI r4, String str, boolean z) {
        C42741yf A012;
        if (z || !(r4 instanceof UserJid)) {
            C22951Dx r0 = PhoneUserJid.Companion;
            PhoneUserJid A013 = C22951Dx.A01(str);
            AnonymousClass1PM r1 = this.A02;
            A012 = r1.A01(A013);
            if (A012 == null) {
                ((C191919nP) this.A03.get()).A00(A013).get();
                A012 = r1.A01(A013);
            }
        } else {
            A012 = this.A02.A01((UserJid) r4);
        }
        return AnonymousClass9Q5.A00(A012);
    }

    public C191009ls(AnonymousClass1PM r1, AnonymousClass00H r2, AnonymousClass00H r3, C18140vp r4) {
        C18070vi.A0s(r1, r4, r2, r3);
        this.A02 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r3;
    }
}
