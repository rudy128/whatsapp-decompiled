package X;

/* renamed from: X.99n  reason: invalid class name */
public final class AnonymousClass99n extends ASN {
    public final AnonymousClass00H A00;

    public AnonymousClass99n(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.REVOKE || a6d.A00 == 8) {
            return null;
        }
        C166368cm r4 = a6d.A08.protocolMessage_;
        if (r4 == null && (r4 = C166368cm.DEFAULT_INSTANCE) == null) {
            throw C17880vN.A0g();
        }
        AnonymousClass23Q r3 = new AnonymousClass23Q(a6d.A0A, a6d.A03);
        C166408cq r0 = r4.key_;
        C166408cq r2 = r0;
        if (r0 == null) {
            r0 = C166408cq.DEFAULT_INSTANCE;
        }
        r3.A01 = r0.id_;
        C22931Dv r1 = AnonymousClass1BI.A00;
        if (r2 == null) {
            r2 = C166408cq.DEFAULT_INSTANCE;
        }
        AnonymousClass1BI A02 = r1.A02(r2.participant_);
        if (C42701yb.A01(A02)) {
            r3.A0d(A02);
        }
        return r3;
    }

    public void A00(AnonymousClass8X7 r5, AnonymousClass23N r6) {
        C18070vi.A0h(r5, r6);
        AnonymousClass205 r3 = r6.A0v;
        C18070vi.A0X(r3);
        AnonymousClass1BI A0H = r6.A0H();
        ((C191029lu) this.A00.get()).A00(A0H, r5, r3, C42701yb.A01(A0H));
        super.A00(r5, r6);
    }
}
