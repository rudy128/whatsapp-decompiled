package X;

/* renamed from: X.40d  reason: invalid class name */
public class AnonymousClass40d extends C98964s0 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass40d(AnonymousClass11S r2, C24921Me r3, Object obj, int i) {
        super(r2, r3, 1);
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((AnonymousClass1E7) obj, (AnonymousClass1E7) obj2);
    }

    public int A01(AnonymousClass1E7 r2, AnonymousClass1E7 r3) {
        if (r2.A0K() == null && r3.A0K() != null) {
            return 1;
        }
        if (r2.A0K() == null || r3.A0K() != null) {
            return super.compare(r2, r3);
        }
        return -1;
    }
}
