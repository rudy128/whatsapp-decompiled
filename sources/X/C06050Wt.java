package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0Wt  reason: invalid class name and case insensitive filesystem */
public final class C06050Wt implements C17500ul {
    public final C16860tL A00;
    public final Integer A01;
    public final Integer A02;

    public Object BWC() {
        return this.A00.BWC();
    }

    public int Bj9(int i) {
        return this.A00.Bj9(i);
    }

    public int BjC(int i) {
        return this.A00.BjC(i);
    }

    public AnonymousClass0XJ Bjb(long j) {
        int Bjv;
        int Bjy;
        Integer num = this.A02;
        Integer num2 = AnonymousClass00R.A00;
        int i = 32767;
        Integer num3 = this.A01;
        Integer num4 = AnonymousClass00R.A01;
        C16860tL r1 = this.A00;
        if (num == num2) {
            int A002 = Constraints.A00(j);
            if (num3 == num4) {
                Bjy = r1.BjC(A002);
            } else {
                Bjy = r1.Bjy(A002);
            }
            if (Constraints.A07(j)) {
                i = Constraints.A00(j);
            }
            return new AnonymousClass0AI(Bjy, i);
        }
        int A012 = Constraints.A01(j);
        if (num3 == num4) {
            Bjv = r1.Bj9(A012);
        } else {
            Bjv = r1.Bjv(A012);
        }
        if (Constraints.A08(j)) {
            i = Constraints.A01(j);
        }
        return new AnonymousClass0AI(i, Bjv);
    }

    public int Bjv(int i) {
        return this.A00.Bjv(i);
    }

    public int Bjy(int i) {
        return this.A00.Bjy(i);
    }

    public C06050Wt(C16860tL r1, Integer num, Integer num2) {
        this.A00 = r1;
        this.A01 = num;
        this.A02 = num2;
    }
}
