package X;

/* renamed from: X.2mM  reason: invalid class name and case insensitive filesystem */
public final class C59472mM {
    public final AnonymousClass1KB A00;
    public final AnonymousClass2LJ A01;
    public final AnonymousClass00H A02;

    public final C139786zR A00() {
        AnonymousClass00H r4 = this.A02;
        return new C139786zR(C35051lZ.A00((C35051lZ) r4.get()).getBoolean("pref_auto_crossposting_on_fb", false), C35051lZ.A00((C35051lZ) r4.get()).getBoolean("pref_auto_crossposting_on_ig", false));
    }

    public final void A01(boolean z) {
        C17880vN.A1F(C18070vi.A02((C35051lZ) this.A02.get()), "pref_auto_crossposting_on_fb", z);
        this.A00.A0J(new C146787Qp(this, 39));
    }

    public final void A02(boolean z) {
        C17880vN.A1F(C18070vi.A02((C35051lZ) this.A02.get()), "pref_auto_crossposting_on_ig", z);
        this.A00.A0J(new C146787Qp(this, 41));
    }

    public C59472mM(AnonymousClass1KB r1, AnonymousClass2LJ r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
