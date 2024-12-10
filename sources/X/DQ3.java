package X;

public final class DQ3 implements EBR {
    public static final DQS A02 = new Object();
    public final String A00;
    public final String A01;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        Object A002 = c5x.A00(this.A01);
        Object A003 = c5x.A00(this.A00);
        if (A002 != null && A003 != null) {
            return !C26168Cti.A03(A003, A002);
        }
        throw new ClassCastException("Either variable or expected value or both is/are null");
    }

    public DQ3(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
