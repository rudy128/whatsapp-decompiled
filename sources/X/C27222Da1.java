package X;

/* renamed from: X.Da1  reason: case insensitive filesystem */
public class C27222Da1 extends RuntimeException {
    public static void A00(C26045Cr9 cr9, String str, Throwable th) {
        C27222Da1 da1 = new C27222Da1(str, th);
        CJN cjn = cr9.A03;
        BUP bup = new BUP(da1);
        C22807BPv bPv = cjn.A00;
        E49 e49 = bPv.A02;
        if (e49 != null) {
            e49.Bxl(bup);
        }
        C22807BPv.A01(bPv, bup);
    }

    public C27222Da1(String str, Throwable th) {
        super(str, th);
    }
}
