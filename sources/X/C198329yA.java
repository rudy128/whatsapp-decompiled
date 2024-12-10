package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9yA  reason: invalid class name and case insensitive filesystem */
public final class C198329yA {
    public final C18030ve A00;
    public final AnonymousClass00H A01 = C201811d.A00(49158);
    public final AnonymousClass00H A02;
    public final AnonymousClass11P A03;

    public C198329yA(AnonymousClass11P r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A03 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public static final AnonymousClass9MG A00(C20942Abw abw, BCT bct, UserJid userJid) {
        AnonymousClass8oR r12;
        C196189ub r0;
        C170058of r2 = (C170058of) bct.BPQ(userJid);
        if (abw instanceof AnonymousClass8oR) {
            r12 = (AnonymousClass8oR) abw;
        } else {
            r12 = null;
        }
        if (r2 == null) {
            if (r12 == null) {
                return AnonymousClass8oX.A00;
            }
        } else if (r12 == null || C18070vi.A18(r12.A05, r2.A01.A05)) {
            r12 = r2.A01;
            r0 = r2.A02;
            return new AnonymousClass8oW(AnonymousClass1D6.A01(r12, r0));
        }
        r0 = new C196189ub(0, false, false, false, false, false, false, false, false, false, false);
        return new AnonymousClass8oW(AnonymousClass1D6.A01(r12, r0));
    }
}
