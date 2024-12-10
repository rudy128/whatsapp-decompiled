package X;

/* renamed from: X.09e  reason: invalid class name and case insensitive filesystem */
public class C016109e extends AnonymousClass0MZ {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C016109e(float[] fArr, int i) {
        super(fArr);
        this.A00 = i;
    }

    public String toString() {
        switch (this.A00) {
            case 0:
                return "Bradford";
            case 1:
                return "Ciecat02";
            default:
                return "VonKries";
        }
    }
}
