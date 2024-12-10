package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.09A  reason: invalid class name */
public final class AnonymousClass09A extends AnonymousClass0XW implements C17670v2 {
    public Integer A00;
    public AnonymousClass1OS A01;

    public /* synthetic */ int BjB(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A00(r2, r3, this, i);
    }

    public /* synthetic */ int BjE(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A01(r2, r3, this, i);
    }

    public C16820tH Bja(C17500ul r10, C17530uo r11, long j) {
        int A03;
        Integer num = this.A00;
        int i = 0;
        if (num != AnonymousClass00R.A00) {
            A03 = 0;
        } else {
            A03 = Constraints.A03(j);
        }
        if (num == AnonymousClass00R.A01) {
            i = Constraints.A02(j);
        }
        AnonymousClass0XJ Bjb = r10.Bjb(C26229CvL.A03(A03, Constraints.A01(j), i, Constraints.A00(j)));
        int A032 = C28851b7.A03(Bjb.A01, Constraints.A03(j), Constraints.A01(j));
        int A033 = C28851b7.A03(Bjb.A00, Constraints.A02(j), Constraints.A00(j));
        return r11.BhL(AnonymousClass1D7.A0I(), new C11440k2(this, r11, Bjb, A032, A033), A032, A033);
    }

    public /* synthetic */ int Bjx(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A02(r2, r3, this, i);
    }

    public /* synthetic */ int Bk0(C16860tL r2, C17740v9 r3, int i) {
        return AnonymousClass0P3.A03(r2, r3, this, i);
    }

    public AnonymousClass09A(Integer num, AnonymousClass1OS r2) {
        this.A00 = num;
        this.A01 = r2;
    }

    public final AnonymousClass1OS A0N() {
        return this.A01;
    }

    public final void A0O(AnonymousClass1OS r1) {
        this.A01 = r1;
    }
}
