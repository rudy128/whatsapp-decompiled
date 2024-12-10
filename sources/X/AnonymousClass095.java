package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.095  reason: invalid class name */
public final class AnonymousClass095 extends AnonymousClass0XW implements C17670v2 {
    public float A00;
    public float A01;

    public C16820tH Bja(C17500ul r6, C17530uo r7, long j) {
        int A03;
        int A02;
        float f = this.A01;
        if (AnonymousClass000.A1P(Float.compare(f, Float.NaN)) || Constraints.A03(j) != 0) {
            A03 = Constraints.A03(j);
        } else {
            A03 = r7.CG9(f);
            int A012 = Constraints.A01(j);
            if (A03 > A012) {
                A03 = A012;
            }
            if (A03 < 0) {
                A03 = 0;
            }
        }
        int A013 = Constraints.A01(j);
        float f2 = this.A00;
        if (AnonymousClass000.A1P(Float.compare(f2, Float.NaN)) || Constraints.A02(j) != 0) {
            A02 = Constraints.A02(j);
        } else {
            A02 = r7.CG9(f2);
            int A002 = Constraints.A00(j);
            if (A02 > A002) {
                A02 = A002;
            }
            if (A02 < 0) {
                A02 = 0;
            }
        }
        AnonymousClass0XJ Bjb = r6.Bjb(C26229CvL.A03(A03, A013, A02, Constraints.A00(j)));
        return r7.BhL(AnonymousClass1D7.A0I(), new C09570gv(Bjb), Bjb.A01, Bjb.A00);
    }

    public int BjB(C16860tL r4, C17740v9 r5, int i) {
        int i2;
        int Bj9 = r4.Bj9(i);
        float f = this.A00;
        if (!AnonymousClass000.A1P(Float.compare(f, Float.NaN))) {
            i2 = r5.CG9(f);
        } else {
            i2 = 0;
        }
        if (Bj9 < i2) {
            return i2;
        }
        return Bj9;
    }

    public int BjE(C16860tL r4, C17740v9 r5, int i) {
        int i2;
        int BjC = r4.BjC(i);
        float f = this.A01;
        if (!AnonymousClass000.A1P(Float.compare(f, Float.NaN))) {
            i2 = r5.CG9(f);
        } else {
            i2 = 0;
        }
        if (BjC < i2) {
            return i2;
        }
        return BjC;
    }

    public int Bjx(C16860tL r4, C17740v9 r5, int i) {
        int i2;
        int Bjv = r4.Bjv(i);
        float f = this.A00;
        if (!AnonymousClass000.A1P(Float.compare(f, Float.NaN))) {
            i2 = r5.CG9(f);
        } else {
            i2 = 0;
        }
        if (Bjv < i2) {
            return i2;
        }
        return Bjv;
    }

    public int Bk0(C16860tL r4, C17740v9 r5, int i) {
        int i2;
        int Bjy = r4.Bjy(i);
        float f = this.A01;
        if (!AnonymousClass000.A1P(Float.compare(f, Float.NaN))) {
            i2 = r5.CG9(f);
        } else {
            i2 = 0;
        }
        if (Bjy < i2) {
            return i2;
        }
        return Bjy;
    }
}
