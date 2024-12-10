package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.094  reason: invalid class name */
public final class AnonymousClass094 extends AnonymousClass0XW implements C17670v2 {
    public float A00;
    public Integer A01;

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A01(r2, r3, this, i);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A03(r2, r3, this, i);
    }

    public C16820tH Bja(C17500ul r6, C17530uo r7, long j) {
        int A03;
        int A012;
        int A02;
        int A002;
        if (!Constraints.A08(j) || this.A01 == AnonymousClass00R.A00) {
            A03 = Constraints.A03(j);
            A012 = Constraints.A01(j);
        } else {
            int A013 = Constraints.A01(j);
            A03 = C28851b7.A03(C22339B3q.A01(((float) A013) * this.A00), Constraints.A03(j), A013);
            A012 = A03;
        }
        if (!Constraints.A07(j) || this.A01 == AnonymousClass00R.A01) {
            A02 = Constraints.A02(j);
            A002 = Constraints.A00(j);
        } else {
            int A003 = Constraints.A00(j);
            A02 = C28851b7.A03(C22339B3q.A01(((float) A003) * this.A00), Constraints.A02(j), A003);
            A002 = A02;
        }
        AnonymousClass0XJ Bjb = r6.Bjb(C26229CvL.A03(A03, A012, A02, A002));
        return r7.BhL(AnonymousClass1D7.A0I(), new C09520gq(Bjb), Bjb.A01, Bjb.A00);
    }
}
