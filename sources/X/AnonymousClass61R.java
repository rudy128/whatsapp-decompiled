package X;

/* renamed from: X.61R  reason: invalid class name */
public final class AnonymousClass61R extends AS1 {
    public final AnonymousClass11P A00;

    public void A00(C29621ca r2) {
        r2.A0L("password_pem");
    }

    public void A01(C29591cX r5) {
        C108985cd.A1A(C108945cZ.A0t("supported_certificates"), r5, "rsa2048");
        C108985cd.A1A(C108945cZ.A0t("fetch_password_pem"), r5, "true");
        C29591cX A0t = C108945cZ.A0t("auth_metadata");
        C108965cb.A1I(A0t, "timestamp", AnonymousClass11P.A00(this.A00));
        C108965cb.A1H(A0t, "version", 1);
        C108955ca.A1P(A0t, r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61R(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass1OZ r5) {
        super(r3, r5, "fb:graphql", 18);
        C18070vi.A0o(r4, r3, r5);
        this.A00 = r4;
    }
}
