package X;

/* renamed from: X.APv  reason: case insensitive filesystem */
public final class C20561APv implements C22438B7u {
    public final C57652jQ A00;
    public final AnonymousClass00H A01;

    public C20561APv(C57652jQ r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public Object CGG(C198589ya r11, C179319Hm r12, BCS bcs, String str, C30391dr r15) {
        C31781g7 A0s = AnonymousClass8BX.A0s(r15);
        AnonymousClass00H r3 = this.A01;
        Class<AnonymousClass120> cls = AnonymousClass120.class;
        AnonymousClass120 r0 = (AnonymousClass120) AnonymousClass3MW.A0c(r3).A01(cls);
        C20564APy aPy = new C20564APy(r11, r12, this, bcs, A0s);
        r0.A08(aPy);
        C19880zA r1 = r0.A05;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("deleteVNameCert");
        }
        ((AnonymousClass120) AnonymousClass3MW.A0c(r3).A01(cls)).A09(aPy);
        if (r12 == C179319Hm.PAIRING) {
            if (bcs != null) {
                bcs.BiF(9, -14);
            }
        } else if (r12 == C179319Hm.UNPAIRING && r11 != null) {
            C198589ya.A00(r11, -14L, (String) null, 3);
        }
        A0s.resumeWith(new C184379ar(AnonymousClass9I9.RESET_IDENTITY_FAILED, false));
        return A0s.A0C();
    }
}
