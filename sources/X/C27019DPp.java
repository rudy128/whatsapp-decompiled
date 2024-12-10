package X;

/* renamed from: X.DPp  reason: case insensitive filesystem */
public final class C27019DPp implements EBR {
    public static final DQE A02 = new Object();
    public final String A00;
    public final String A01;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        Object A002 = c5x.A00(this.A01);
        Object A003 = c5x.A00(this.A00);
        if (A002 != null && A003 != null) {
            return C26168Cti.A02(A002, A003);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public C27019DPp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
