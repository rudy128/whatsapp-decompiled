package X;

public final class DMy implements BDh {
    public static final DMy A00 = new Object();
    public static final C25775Clm A01;
    public static final C25775Clm A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DMy, java.lang.Object] */
    static {
        C25718Cko cko = new C25718Cko("logSource");
        C24244By2 by2 = C24244By2.DEFAULT;
        A02 = C25718Cko.A00(cko, by2, 1);
        A01 = C25718Cko.A00(new C25718Cko("logEventDropped"), by2, 2);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        C25539Chc chc = (C25539Chc) obj;
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAs(A02, chc.A00);
        e8r.BAs(A01, chc.A01);
    }
}
