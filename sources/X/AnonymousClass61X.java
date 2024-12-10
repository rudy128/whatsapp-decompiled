package X;

/* renamed from: X.61X  reason: invalid class name */
public abstract class AnonymousClass61X extends AS1 {
    public final AnonymousClass11P A00;

    public AnonymousClass61X(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass1OZ r5) {
        super(r3, r5, "fb:graphql", 18);
        this.A00 = r4;
    }

    public void A01(C29591cX r5) {
        C108985cd.A1A(C108945cZ.A0t("supported_certificates"), r5, "rsa2048");
        C29591cX A0t = C108945cZ.A0t("auth_metadata");
        C108965cb.A1I(A0t, "timestamp", AnonymousClass11P.A00(this.A00));
        C108965cb.A1H(A0t, "version", 1);
        C108955ca.A1P(A0t, r5);
    }
}
