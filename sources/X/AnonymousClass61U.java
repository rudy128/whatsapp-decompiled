package X;

/* renamed from: X.61U  reason: invalid class name */
public final class AnonymousClass61U extends AS1 {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public void A00(C29621ca r2) {
        r2.A0L("password_pem");
    }

    public void A01(C29591cX r4) {
        AnonymousClass00H r1 = this.A01;
        Integer num = C108945cZ.A0q(r1).A00;
        if (num != null) {
            C108945cZ.A0q(r1).A03(num.intValue(), "fetch_certificate");
        }
        C108955ca.A1P(C108945cZ.A0t("password_pem"), r4);
        C108955ca.A1P(C108945cZ.A0t("payload_enc_certificates"), r4);
        C108985cd.A1A(C108945cZ.A0t("timestamp"), r4, String.valueOf(AnonymousClass11P.A00(this.A00)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61U(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass1OZ r5, AnonymousClass00H r6) {
        super(r3, r5, "avatars", 99);
        C18070vi.A0s(r4, r6, r3, r5);
        this.A00 = r4;
        this.A01 = r6;
    }
}
