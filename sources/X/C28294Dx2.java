package X;

import java.util.Enumeration;

/* renamed from: X.Dx2  reason: case insensitive filesystem */
public class C28294Dx2 extends AnonymousClass1By {
    public C28269Dwd A00;
    public C28292Dx0 A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Dx2, java.lang.Object] */
    public static C28294Dx2 A01(Object obj) {
        if (obj instanceof C28294Dx2) {
            return (C28294Dx2) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        if (A05.A0K() == 2) {
            Enumeration A0L = A05.A0L();
            obj2.A01 = C28292Dx0.A01(A0L.nextElement());
            obj2.A00 = C28269Dwd.A02(A0L.nextElement());
            return obj2;
        }
        throw C28339Dxl.A02(A05);
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A01);
        return C28339Dxl.A07(this.A00, A0t);
    }
}
