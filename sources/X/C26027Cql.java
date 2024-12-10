package X;

import android.view.View;

/* renamed from: X.Cql  reason: case insensitive filesystem */
public final class C26027Cql {
    public C25050CVe A00;
    public C24307Bz4 A01;
    public C24307Bz4 A02;
    public BRG A03;
    public CZL A04;
    public boolean A05;
    public final CVQ A06;
    public final C26984DOg A07;
    public final C61212pJ A08;
    public final C24882COa A09 = ((C24882COa) AnonymousClass12Q.A01(32846));
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C23421Fz A0C;
    public final AnonymousClass1G3 A0D;

    public C26027Cql(CVQ cvq, C61212pJ r5) {
        C18070vi.A0d(cvq, 2);
        this.A08 = r5;
        this.A06 = cvq;
        C25701Ph A012 = C62922sD.A01(C25691Pg.SUSPEND, 0, 10);
        this.A0D = A012;
        this.A0C = new C25711Pi((AnonymousClass1OB) null, A012);
        C18110vm A013 = AnonymousClass1DF.A01(new C27768Dko(this));
        this.A0B = A013;
        C26984DOg dOg = new C26984DOg((CM1) A013.getValue());
        this.A07 = dOg;
        this.A0A = AnonymousClass1DF.A01(new C28237Dtx(dOg, 2));
    }

    public static void A00(C24307Bz4 bz4, C26027Cql cql) {
        BRF brf = new BRF(bz4);
        C25050CVe cVe = cql.A00;
        if (cVe != null) {
            cVe.A00(brf);
        }
        cql.A0D.CPw(brf);
    }

    public static final void A01(C26027Cql cql, String str) {
        C61212pJ r3 = cql.A08;
        C61212pJ.A00(r3, 1, 231941967);
        C61212pJ.A00(r3, 1, 231936990);
        A00(C24307Bz4.EFFECT_FETCH_STARTED, cql);
        CZL czl = cql.A04;
        if (czl == null) {
            C18070vi.A11("sparkEffectProcessor");
            throw null;
        }
        C27769Dkp dkp = new C27769Dkp(cql);
        C27770Dkq dkq = new C27770Dkq(cql);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarSparkEffectProcessor/setEffectById: Setting effect by ID ");
        C17890vO.A1A(A10, str);
        C188109gt r2 = (C188109gt) czl.A05.getValue();
        r2.A06.CGN(new C21456AkN(r2, dkp, dkq, str, 41));
    }

    public void A02() {
        CZL czl = this.A04;
        if (czl != null) {
            czl.A01.destroy();
            czl.A00.destroy();
        }
        this.A09.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = false;
    }

    public void A03() {
        CZL czl = this.A04;
        if (czl == null) {
            C18070vi.A11("sparkEffectProcessor");
            throw null;
        }
        View BXX = ((EDD) czl.A01.BP7(EDD.A00)).BXX();
        C18070vi.A0X(BXX);
        BXX.setVisibility(0);
    }

    public void A04(float f) {
        CZL czl = this.A04;
        if (czl == null) {
            C18070vi.A11("sparkEffectProcessor");
            throw null;
        }
        View BXX = ((EDD) czl.A01.BP7(EDD.A00)).BXX();
        C18070vi.A0X(BXX);
        BXX.setAlpha(f);
    }
}
