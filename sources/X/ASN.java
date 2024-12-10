package X;

public abstract class ASN implements B83, B85, C436820m {
    public void A00(AnonymousClass8X7 r4, AnonymousClass23N r5) {
        AnonymousClass205 r2 = r5.A0v;
        r4.A0J(C22971Dz.A06(r2.A00));
        AnonymousClass1BI A0H = r5.A0H();
        if (!(r5 instanceof AnonymousClass23Q) || !C42701yb.A01(A0H)) {
            r4.A0K(r2.A02);
        } else {
            r4.A0K(false);
            AnonymousClass8X7.A01(A0H, r4);
        }
        String str = r5.A01;
        if (str == null) {
            str = r2.A01;
        }
        r4.A0H(str);
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        if (r5 instanceof AnonymousClass23N) {
            AnonymousClass23N r52 = (AnonymousClass23N) r5;
            AnonymousClass8X8 r2 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r2);
            C166408cq r0 = ((C166368cm) A01.A00).key_;
            if (r0 == null) {
                r0 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r0);
            A00(A0f, r52);
            A01.A0H(A0f);
            A01.A0G(C179839Kc.REVOKE);
            r2.A0N(A01);
            return;
        }
        throw AnonymousClass000.A0k("FMessageRevokedProtobuf/not supported message");
    }
}
