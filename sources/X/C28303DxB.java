package X;

/* renamed from: X.DxB  reason: case insensitive filesystem */
public class C28303DxB extends AnonymousClass1By {
    public C28339Dxl A00;
    public C28309DxH A01;

    public C28309DxH A0D() {
        if (this.A01 == null) {
            C28339Dxl dxl = this.A00;
            if (dxl.A0K() == 3) {
                this.A01 = C28309DxH.A02(dxl.A0M(2));
            }
        }
        return this.A01;
    }

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.DxB, java.lang.Object] */
    public static C28303DxB A01(Object obj) {
        if (obj instanceof C28303DxB) {
            return (C28303DxB) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        if (A05.A0K() < 2 || A05.A0K() > 3) {
            throw C28339Dxl.A02(A05);
        }
        obj2.A00 = A05;
        return obj2;
    }
}
