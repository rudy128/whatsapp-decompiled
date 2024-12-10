package X;

/* renamed from: X.4m6  reason: invalid class name and case insensitive filesystem */
public final class C95354m6 implements C72113Kr {
    public final AnonymousClass11S A00;
    public final AnonymousClass1VE A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass4QJ A03;

    public void Bqf() {
        C81063yd r3 = new C81063yd();
        r3.A00 = Boolean.valueOf(C17880vN.A1W(AnonymousClass1VE.A00(this.A01), "privacy_always_relay"));
        AnonymousClass18K r2 = this.A02;
        r2.CC7(r3);
        if (!this.A00.A0N()) {
            C81053yc r1 = new C81053yc();
            r1.A00 = Boolean.valueOf(this.A03.A00());
            r2.CC7(r1);
        }
    }

    public C95354m6(AnonymousClass11S r2, AnonymousClass1VE r3, AnonymousClass18K r4, AnonymousClass4QJ r5) {
        C18070vi.A0j(r2, r4);
        C18070vi.A0d(r3, 4);
        this.A00 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }
}
