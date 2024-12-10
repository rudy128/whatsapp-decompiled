package X;

/* renamed from: X.DPs  reason: case insensitive filesystem */
public final class C27022DPs implements EBR {
    public static final DQH A02 = new Object();
    public final Object A00;
    public final Object A01;

    public boolean BKb(C5x c5x) {
        Object obj;
        C18070vi.A0d(c5x, 0);
        Object obj2 = this.A01;
        Object A0Y = BEB.A0Y(c5x, obj2, obj2 instanceof String ? 1 : 0);
        if (A0Y != null && (obj = this.A00) != null) {
            return C26168Cti.A03(obj, A0Y);
        }
        throw new ClassCastException("Either variable or expected value or both are null");
    }

    public C27022DPs(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }
}
