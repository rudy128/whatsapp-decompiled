package X;

/* renamed from: X.DPq  reason: case insensitive filesystem */
public final class C27020DPq implements EBR {
    public static final DQF A02 = new Object();
    public final Object A00;
    public final Object A01;

    public boolean BKb(C5x c5x) {
        Object obj;
        C18070vi.A0d(c5x, 0);
        Object obj2 = this.A01;
        Object A0Y = BEB.A0Y(c5x, obj2, obj2 instanceof String ? 1 : 0);
        if (A0Y != null && (obj = this.A00) != null) {
            return C26168Cti.A02(obj, A0Y);
        }
        throw new ClassCastException("Either variable or expected value or both are null");
    }

    public C27020DPq(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
