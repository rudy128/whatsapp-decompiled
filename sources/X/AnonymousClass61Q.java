package X;

/* renamed from: X.61Q  reason: invalid class name */
public abstract class AnonymousClass61Q extends AnonymousClass7GR {
    public final AnonymousClass11P A00;

    public C29621ca A00(C54612eQ r2, String str, int i) {
        C18070vi.A0d(str, 1);
        C29591cX A002 = AnonymousClass6YF.A00(str, i);
        A01(A002, r2);
        return A002.A03();
    }

    public void A01(C29591cX r5, C54612eQ r6) {
        if (r6 != null) {
            C29591cX A0t = C108945cZ.A0t("encryption_metadata");
            C29591cX.A01(A0t, "version", "1");
            C29591cX.A01(A0t, "algorithm", "rsa2048");
            C29591cX A0t2 = C108945cZ.A0t("encrypted_key");
            C129006h6 r2 = r6.A01;
            C108965cb.A1G(A0t2, A0t, r2.A01);
            C108965cb.A1G(C108945cZ.A0t("encrypted_data"), A0t, r2.A00);
            C108965cb.A1G(C108945cZ.A0t("nonce"), A0t, r2.A02);
            C29591cX A0t3 = C108945cZ.A0t("auth_tag");
            A0t3.A01 = r2.A03;
            r5.A05(C29591cX.A00(A0t3, A0t));
            C108985cd.A1A(C108945cZ.A0t("timestamp"), r5, String.valueOf(AnonymousClass11P.A00(this.A00)));
            C1418477e r1 = r6.A02;
            if (r1 != null) {
                C108985cd.A1A(C108945cZ.A0t("fbid"), r5, String.valueOf(C108985cd.A09(r1)));
            }
        }
    }

    public AnonymousClass61Q(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass1OZ r3) {
        super(r1, r3);
        this.A00 = r2;
    }
}
