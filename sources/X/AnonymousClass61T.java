package X;

import com.whatsapp.util.Log;

/* renamed from: X.61T  reason: invalid class name */
public final class AnonymousClass61T extends AS1 {
    public final AnonymousClass11P A00;
    public final AnonymousClass19T A01;

    public void A00(C29621ca r2) {
        r2.A0L("password_pem");
    }

    public void A01(C29591cX r5) {
        Log.i("SupportUser/Fetch Certificate");
        AnonymousClass19T r2 = this.A01;
        r2.markerPoint(376777540, 376777540, "fetchCertificates");
        r2.markerPoint(376777108, 376777108, "fetchCertificates");
        C108985cd.A1A(C108945cZ.A0t("supported_certificates"), r5, "rsa2048");
        C108985cd.A1A(C108945cZ.A0t("fetch_password_pem"), r5, "true");
        C29591cX A0t = C108945cZ.A0t("auth_metadata");
        C108965cb.A1I(A0t, "timestamp", AnonymousClass11P.A00(this.A00));
        C108965cb.A1H(A0t, "version", 1);
        C29591cX.A01(A0t, "use_case", "support");
        C108955ca.A1P(A0t, r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass61T(AnonymousClass190 r3, AnonymousClass11P r4, AnonymousClass1OZ r5, AnonymousClass19T r6) {
        super(r3, r5, "fb:graphql", 18);
        C18070vi.A0s(r4, r6, r3, r5);
        this.A00 = r4;
        this.A01 = r6;
    }
}
