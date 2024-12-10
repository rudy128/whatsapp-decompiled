package X;

public final class DN0 implements BDh {
    public static final DN0 A00 = new Object();
    public static final C25775Clm A01;
    public static final C25775Clm A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.DN0] */
    static {
        C25718Cko cko = new C25718Cko("startMs");
        C24244By2 by2 = C24244By2.DEFAULT;
        A02 = C25718Cko.A00(cko, by2, 1);
        A01 = C25718Cko.A00(new C25718Cko("endMs"), by2, 2);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        C24870CNo cNo = (C24870CNo) obj;
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAr(A02, cNo.A01);
        e8r.BAr(A01, cNo.A00);
    }
}
