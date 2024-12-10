package X;

public final class DN2 implements BDh {
    public static final C25775Clm A00;
    public static final C25775Clm A01;
    public static final C25775Clm A02;
    public static final C25775Clm A03;
    public static final C25775Clm A04;
    public static final C25775Clm A05;
    public static final C25775Clm A06;
    public static final C25775Clm A07;
    public static final C25775Clm A08;
    public static final C25775Clm A09;
    public static final C25775Clm A0A;
    public static final C25775Clm A0B;
    public static final C25775Clm A0C;
    public static final C25775Clm A0D;
    public static final C25775Clm A0E;
    public static final DN2 A0F = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.DN2] */
    static {
        C25718Cko cko = new C25718Cko("projectNumber");
        C24244By2 by2 = C24244By2.DEFAULT;
        A0B = C25718Cko.A00(cko, by2, 1);
        A07 = C25718Cko.A00(new C25718Cko("messageId"), by2, 2);
        A06 = C25718Cko.A00(new C25718Cko("instanceId"), by2, 3);
        A08 = C25718Cko.A00(new C25718Cko("messageType"), by2, 4);
        A0C = C25718Cko.A00(new C25718Cko("sdkPlatform"), by2, 5);
        A09 = C25718Cko.A00(new C25718Cko("packageName"), by2, 6);
        A03 = C25718Cko.A00(new C25718Cko("collapseKey"), by2, 7);
        A0A = C25718Cko.A00(new C25718Cko("priority"), by2, 8);
        A0E = C25718Cko.A00(new C25718Cko("ttl"), by2, 9);
        A0D = C25718Cko.A00(new C25718Cko("topic"), by2, 10);
        A01 = C25718Cko.A00(new C25718Cko("bulkId"), by2, 11);
        A05 = C25718Cko.A00(new C25718Cko("event"), by2, 12);
        A00 = C25718Cko.A00(new C25718Cko("analyticsLabel"), by2, 13);
        A02 = C25718Cko.A00(new C25718Cko("campaignId"), by2, 14);
        A04 = C25718Cko.A00(new C25718Cko("composerLabel"), by2, 15);
    }

    public /* bridge */ /* synthetic */ void BK0(Object obj, Object obj2) {
        CU7 cu7 = (CU7) obj;
        C28580E8r e8r = (C28580E8r) obj2;
        e8r.BAr(A0B, cu7.A01);
        e8r.BAs(A07, cu7.A09);
        e8r.BAs(A06, cu7.A08);
        e8r.BAs(A08, cu7.A03);
        e8r.BAs(A0C, cu7.A04);
        e8r.BAs(A09, cu7.A0A);
        e8r.BAs(A03, cu7.A06);
        e8r.BAq(A0A, 0);
        e8r.BAq(A0E, cu7.A00);
        e8r.BAs(A0D, cu7.A0B);
        e8r.BAr(A01, 0);
        e8r.BAs(A05, cu7.A02);
        e8r.BAs(A00, cu7.A05);
        e8r.BAr(A02, 0);
        e8r.BAs(A04, cu7.A07);
    }
}
