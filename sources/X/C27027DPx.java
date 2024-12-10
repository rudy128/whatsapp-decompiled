package X;

/* renamed from: X.DPx  reason: case insensitive filesystem */
public final class C27027DPx implements EBR {
    public static final DQM A02 = new Object();
    public final String A00;
    public final String A01;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        Integer A002 = C26168Cti.A00(c5x.A00(this.A01), c5x.A00(this.A00));
        if (A002 != null) {
            return C108975cc.A1A(A002.intValue());
        }
        throw BE6.A0v("The data type is unsupported for this operation");
    }

    public C27027DPx(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
