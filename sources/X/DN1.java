package X;

public final class DN1 implements BDh {
    public static final DN1 A00 = new Object();
    public static final C25775Clm A01;
    public static final C25775Clm A02;
    public static final C25775Clm A03;
    public static final C25775Clm A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.DN1] */
    static {
        C25718Cko cko = new C25718Cko("window");
        C24244By2 by2 = C24244By2.DEFAULT;
        A04 = C25718Cko.A00(cko, by2, 1);
        A03 = C25718Cko.A00(new C25718Cko("logSourceMetrics"), by2, 2);
        A02 = C25718Cko.A00(new C25718Cko("globalMetrics"), by2, 3);
        A01 = C25718Cko.A00(new C25718Cko("appNamespace"), by2, 4);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        C198399yH r3 = (C198399yH) obj;
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAs(A04, r3.A01);
        e8r.BAs(A03, r3.A03);
        e8r.BAs(A02, r3.A00);
        e8r.BAs(A01, r3.A02);
    }
}
