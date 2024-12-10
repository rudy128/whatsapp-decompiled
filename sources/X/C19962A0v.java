package X;

/* renamed from: X.A0v  reason: case insensitive filesystem */
public class C19962A0v {
    public final int A00;
    public final C198769ys A01;
    public final A03 A02;

    public int A00(long j) {
        C198769ys r6 = this.A01;
        if (r6 != null) {
            int i = r6.A03;
            if (i != 2 && i != 1) {
                A03 a03 = this.A02;
                if (a03 != null && ((long) a03.A01) == r6.A05) {
                    return 2;
                }
                if (r6.A06 > j || j >= r6.A04) {
                    return 3;
                }
                return 1;
            } else if (r6.A06 > j || j >= r6.A04) {
                return 0;
            } else {
                return 4;
            }
        }
        return 0;
    }

    public C19962A0v(C198769ys r1, A03 a03, int i) {
        this.A01 = r1;
        this.A02 = a03;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncentiveResult{offerInfo=");
        A10.append(this.A01);
        A10.append(", accountIncentiveEligibility=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }

    public C19962A0v(C198769ys r2, A03 a03) {
        this.A01 = r2;
        this.A02 = a03;
        this.A00 = 6;
    }
}
