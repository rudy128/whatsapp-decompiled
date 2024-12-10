package X;

/* renamed from: X.9oU  reason: invalid class name and case insensitive filesystem */
public final class C192489oU {
    public C222119a A00;
    public final AnonymousClass1HA A01;
    public final C18030ve A02;

    public final void A00(String str) {
        C18030ve r2 = this.A02;
        if (C18020vd.A05(C18040vf.A02, r2, 2396)) {
            C222119a r1 = this.A00;
            if (r1 != null) {
                r1.A0C(4);
            }
            C222219b r3 = new C222219b(r2, 185473396);
            C222119a A012 = this.A01.A01(r3, "QrScanFlow");
            this.A00 = A012;
            r3.A04 = true;
            C18070vi.A0b(A012);
            A012.A0D(str, -1);
            A012.A0A("entry_point", str, false);
            A012.A07("scan_qr_code");
        }
    }

    public final void A01(short s) {
        C222119a r1;
        if (C18020vd.A05(C18040vf.A02, this.A02, 2396) && (r1 = this.A00) != null) {
            r1.A06("scan_qr_code");
            r1.A0C(s);
            this.A00 = null;
        }
    }

    public C192489oU(AnonymousClass1HA r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
    }
}
