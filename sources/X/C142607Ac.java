package X;

/* renamed from: X.7Ac  reason: invalid class name and case insensitive filesystem */
public final class C142607Ac implements C24051Ir {
    public final C33251iW A00;
    public final AnonymousClass8BG A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1BI A03;
    public final C191569mo A04;
    public final AnonymousClass1W6 A05;
    public final C32021gV A06;
    public final AnonymousClass10I A07;
    public final boolean A08;

    public C142607Ac(C33251iW r2, AnonymousClass8BG r3, AnonymousClass1CJ r4, AnonymousClass1BI r5, C191569mo r6, AnonymousClass1W6 r7, C32021gV r8, AnonymousClass10I r9, boolean z) {
        C18070vi.A0d(r7, 5);
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = z;
        this.A02 = r4;
        this.A05 = r7;
        this.A01 = r3;
        this.A06 = r8;
        this.A04 = r6;
        this.A00 = r2;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        C18070vi.A0d(cls, 0);
        if (cls.equals(C111215j4.class)) {
            AnonymousClass1CJ r3 = this.A02;
            AnonymousClass1W6 r6 = this.A05;
            C32021gV r7 = this.A06;
            return new C111215j4(this.A00, this.A01, r3, this.A03, this.A04, r6, r7, this.A07, this.A08);
        }
        throw AnonymousClass000.A0k(AnonymousClass001.A1E(cls, "Unknown class ", AnonymousClass000.A10()));
    }

    public /* synthetic */ AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        return C60282nh.A00(this, cls);
    }
}
