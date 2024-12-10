package X;

/* renamed from: X.1ea  reason: invalid class name and case insensitive filesystem */
public final class C30831ea implements C30721eP {
    public final AnonymousClass1CJ A00;

    public C30831ea(AnonymousClass1CJ r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BBP(C30531e6 r3, AnonymousClass1BI r4) {
        C46162Dk r1;
        C18070vi.A0z(r4, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        r3.A0F = r4.user;
        r3.A09 = 5;
        C29691ci A002 = AnonymousClass1CJ.A00(this.A00, r4);
        if ((A002 instanceof C46162Dk) && (r1 = (C46162Dk) A002) != null) {
            r3.A0B = Long.valueOf(r1.A0G);
        }
    }

    public boolean CM3(AnonymousClass1BI r2) {
        return C22971Dz.A0V(r2);
    }
}
