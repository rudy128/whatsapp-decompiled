package X;

/* renamed from: X.1tM  reason: invalid class name and case insensitive filesystem */
public abstract class C39611tM {
    public final int A00;
    public final Object A01;

    public static boolean A00(int i) {
        return i == 9 || i == 8 || i == 10 || i == 50 || i == 52;
    }

    public static boolean A01(C39611tM r3, Object obj) {
        if (r3 == obj) {
            return true;
        }
        if (!(obj instanceof C39611tM)) {
            return false;
        }
        C39611tM r4 = (C39611tM) obj;
        return C42171xk.A00(r3.A01, r4.A01) && C42171xk.A00(Integer.valueOf(r3.A00), Integer.valueOf(r4.A00));
    }

    public C39611tM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
