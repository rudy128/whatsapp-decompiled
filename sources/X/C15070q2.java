package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0q2  reason: invalid class name and case insensitive filesystem */
public final class C15070q2 extends AnonymousClass11G implements C36001nB {
    public static final C15070q2 A00 = new C15070q2();

    public C15070q2() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C17500ul) obj2, (C17530uo) obj, ((Constraints) obj3).A0B());
    }

    public static final C16820tH A00(C17500ul r4, C17530uo r5, long j) {
        AnonymousClass0XJ Bjb = r4.Bjb(j);
        C17090tj r0 = AnonymousClass0GQ.A00;
        int CG9 = r5.CG9(30.0f * 2.0f);
        int A0W = Bjb.A0W() - CG9;
        if (A0W < 0) {
            A0W = 0;
        }
        int A0V = Bjb.A0V() - CG9;
        if (A0V < 0) {
            A0V = 0;
        }
        return r5.BhL(AnonymousClass1D7.A0I(), new C10900jA(Bjb, CG9), A0W, A0V);
    }
}
