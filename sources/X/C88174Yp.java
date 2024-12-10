package X;

import java.util.Iterator;

/* renamed from: X.4Yp  reason: invalid class name and case insensitive filesystem */
public final class C88174Yp {
    public final AnonymousClass00H A00;
    public final C18100vl A01;

    public final boolean A01(AnonymousClass206 r4) {
        if (r4.A05 <= 0 || r4.A0q) {
            return false;
        }
        Iterator A0h = C17890vO.A0h(this.A00);
        while (A0h.hasNext()) {
            if (C18070vi.A19(((C108545bs) A0h.next()).BfJ(r4), false)) {
                return false;
            }
        }
        return A00(this, r4).BfK();
    }

    public final boolean A02(AnonymousClass206 r4) {
        if (r4.A0v.A02 && C446824j.A03(r4.A0C, 4)) {
            return false;
        }
        Iterator A0h = C17890vO.A0h(this.A00);
        while (A0h.hasNext()) {
            if (C18070vi.A19(((C108545bs) A0h.next()).Bg4(r4), false)) {
                return false;
            }
        }
        return A00(this, r4).Bg5();
    }

    public final boolean A03(AnonymousClass206 r4) {
        if (!r4.A0v.A02) {
            Iterator A0h = C17890vO.A0h(this.A00);
            while (A0h.hasNext()) {
                if (C18070vi.A19(((C108545bs) A0h.next()).BgD(r4), false)) {
                }
            }
            return A00(this, r4).BgE(r4);
        }
        return false;
    }

    public final boolean A04(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        Iterator A0h = C17890vO.A0h(this.A00);
        while (A0h.hasNext()) {
            if (C18070vi.A19(((C108545bs) A0h.next()).BgT(r4), false)) {
                return false;
            }
        }
        return A00(this, r4).BgU();
    }

    public final boolean A05(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        Iterator A0h = C17890vO.A0h(this.A00);
        while (A0h.hasNext()) {
            if (C18070vi.A19(((C108545bs) A0h.next()).BgW(r4), false)) {
                return false;
            }
        }
        return A00(this, r4).BgX();
    }

    public static C437320s A00(C88174Yp r1, AnonymousClass206 r2) {
        return (C437320s) ((AnonymousClass20Z) r1.A01.getValue()).A00(r2.A0u);
    }

    public C88174Yp(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r3;
        this.A01 = AnonymousClass1DF.A01(new C102625He(r2));
    }
}
