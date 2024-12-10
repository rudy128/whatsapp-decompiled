package X;

public final class DMx implements BDh {
    public static final DMx A00 = new Object();
    public static final C25775Clm A01;
    public static final C25775Clm A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.DMx, java.lang.Object] */
    static {
        C25718Cko cko = new C25718Cko("eventsDroppedCount");
        C24244By2 by2 = C24244By2.DEFAULT;
        A01 = C25718Cko.A00(cko, by2, 1);
        A02 = C25718Cko.A00(new C25718Cko("reason"), by2, 3);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        C183759Zm r4 = (C183759Zm) obj;
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAr(A01, r4.A00);
        e8r.BAs(A02, r4.A01);
    }
}
