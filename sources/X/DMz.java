package X;

public final class DMz implements BDh {
    public static final DMz A00 = new Object();
    public static final C25775Clm A01;
    public static final C25775Clm A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DMz, java.lang.Object] */
    static {
        C25718Cko cko = new C25718Cko("currentCacheSizeBytes");
        C24244By2 by2 = C24244By2.DEFAULT;
        A01 = C25718Cko.A00(cko, by2, 1);
        A02 = C25718Cko.A00(new C25718Cko("maxCacheSizeBytes"), by2, 2);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAr(A01, ((C24869CNn) obj).A00);
        e8r.BAr(A02, 10485760);
    }
}
