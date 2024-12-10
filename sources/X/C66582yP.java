package X;

import java.util.List;

/* renamed from: X.2yP  reason: invalid class name and case insensitive filesystem */
public class C66582yP implements C41121vq {
    public final int A00;
    public final C70483Bg A01;
    public final C58792lG A02;
    public final AnonymousClass1E7 A03;
    public final List A04;

    public C66582yP(C70483Bg r7, C58792lG r8, AnonymousClass1E7 r9) {
        this(r7, r8, r9, (List) null, -1);
    }

    public int BTW() {
        return 2;
    }

    public int hashCode() {
        Object[] objArr = new Object[6];
        AnonymousClass000.A1L(objArr, 2);
        objArr[1] = this.A01;
        objArr[2] = this.A03;
        objArr[3] = this.A02;
        objArr[4] = this.A04;
        return AnonymousClass000.A0P(Integer.valueOf(this.A00), objArr, 5);
    }

    public /* bridge */ /* synthetic */ AnonymousClass1BI BTb() {
        AnonymousClass1E7 A012 = this.A01.A01();
        if (A012 == null) {
            return null;
        }
        return (AnonymousClass1BI) AnonymousClass1E7.A01(A012);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C66582yP)) {
            return false;
        }
        C66582yP r4 = (C66582yP) obj;
        if (!this.A01.A03().equals(r4.A01.A03()) || !C42171xk.A00(this.A03, r4.A03) || !C42171xk.A00(this.A02, r4.A02) || !C42171xk.A00(this.A04, r4.A04) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public C70483Bg BO2() {
        return this.A01;
    }

    public int BYi() {
        return this.A00;
    }

    public C66582yP(C70483Bg r1, C58792lG r2, AnonymousClass1E7 r3, List list, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = list;
        this.A00 = i;
    }
}
