package X;

/* renamed from: X.DPw  reason: case insensitive filesystem */
public final class C27026DPw implements EBR {
    public static final DQL A02 = new Object();
    public final Object A00;
    public final Object A01;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        Object obj = this.A01;
        Integer A002 = C26168Cti.A00(BEB.A0Y(c5x, obj, obj instanceof String ? 1 : 0), this.A00);
        if (A002 == null) {
            throw BE6.A0v("The data type is unsupported for this operation");
        } else if (A002.intValue() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public C27026DPw(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
