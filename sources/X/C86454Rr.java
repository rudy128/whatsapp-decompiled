package X;

/* renamed from: X.4Rr  reason: invalid class name and case insensitive filesystem */
public final class C86454Rr {
    public final AnonymousClass1CJ A00;
    public final C18030ve A01;

    public final boolean A00(C46162Dk r5) {
        C179459Ia r1;
        C179459Ia r12;
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 3149)) {
            if (r5 != null) {
                r12 = r5.A04;
            } else {
                r12 = null;
            }
            if (r12 == C179459Ia.SUSPENDED) {
                return true;
            }
        }
        if (!C18020vd.A05(r2, r3, 5161)) {
            return false;
        }
        if (r5 != null) {
            r1 = r5.A04;
        } else {
            r1 = null;
        }
        if (r1 == C179459Ia.GEOSUSPENDED) {
            return true;
        }
        return false;
    }

    public final boolean A01(C29681ch r3) {
        C46162Dk r1;
        if (r3 == null) {
            return false;
        }
        C29691ci A002 = AnonymousClass1CJ.A00(this.A00, r3);
        if (A002 instanceof C46162Dk) {
            r1 = (C46162Dk) A002;
        } else {
            r1 = null;
        }
        return A00(r1);
    }

    public C86454Rr(AnonymousClass1CJ r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
