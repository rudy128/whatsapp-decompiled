package X;

/* renamed from: X.Dx0  reason: case insensitive filesystem */
public class C28292Dx0 extends AnonymousClass1By {
    public AnonymousClass1Bx A00;
    public AnonymousClass1C0 A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Dx0, java.lang.Object] */
    public static C28292Dx0 A01(Object obj) {
        AnonymousClass1Bx r0;
        if (obj instanceof C28292Dx0) {
            return (C28292Dx0) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        if (A05.A0K() < 1 || A05.A0K() > 2) {
            throw C28339Dxl.A02(A05);
        }
        obj2.A01 = AnonymousClass1C0.A02(C28339Dxl.A03(A05));
        if (A05.A0K() == 2) {
            r0 = A05.A0M(1);
        } else {
            r0 = null;
        }
        obj2.A00 = r0;
        return obj2;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A01);
        AnonymousClass1Bx r0 = this.A00;
        if (r0 != null) {
            A0t.A02(r0);
        }
        return new C28357Dy3(A0t);
    }
}
