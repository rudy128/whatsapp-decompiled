package X;

import android.view.View;

/* renamed from: X.CiJ  reason: case insensitive filesystem */
public final class C25579CiJ {
    public View A00;
    public final DOZ A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public static final void A00(C25579CiJ ciJ, DFL dfl, boolean z, boolean z2) {
        ((C25080CWp) ciJ.A04.getValue()).A01 = true;
        C20046A4p a4p = new C20046A4p();
        a4p.A03(Boolean.valueOf(z), 0);
        C199029zJ A0R = BE7.A0R(a4p, Boolean.valueOf(z2), 1);
        C25681CkC.A03(ciJ.A01, dfl, A0R, (E8A) ciJ.A03.getValue());
    }

    public C25579CiJ(DOZ doz, DFL dfl) {
        this.A01 = doz;
        Integer num = AnonymousClass00R.A0C;
        this.A03 = AnonymousClass1DF.A00(num, new C27484DgD(dfl));
        this.A02 = AnonymousClass1DF.A00(num, new C27483DgC(dfl));
        this.A04 = AnonymousClass1DF.A00(num, new DlW(this, dfl));
    }
}
