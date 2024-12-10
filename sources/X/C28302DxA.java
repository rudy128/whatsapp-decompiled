package X;

/* renamed from: X.DxA  reason: case insensitive filesystem */
public class C28302DxA extends AnonymousClass1By {
    public AnonymousClass1C0 A00;
    public C28339Dxl A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.DxA, java.lang.Object] */
    public static C28302DxA A01(Object obj) {
        if (obj == null || (obj instanceof C28302DxA)) {
            return (C28302DxA) obj;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        if (A05.A0K() < 1 || A05.A0K() > 2) {
            throw C28339Dxl.A02(A05);
        }
        obj2.A00 = AnonymousClass1C0.A02(C28339Dxl.A03(A05));
        if (A05.A0K() > 1) {
            obj2.A01 = C28339Dxl.A05(A05.A0M(1));
        }
        return obj2;
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        A0t.A02(this.A00);
        C28339Dxl dxl = this.A01;
        if (dxl != null) {
            A0t.A02(dxl);
        }
        return new C28357Dy3(A0t);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, X.Dwl] */
    public String toString() {
        AnonymousClass1Bx r3;
        StringBuffer A0s = BE6.A0s();
        A0s.append("Policy information: ");
        A0s.append(this.A00);
        C28339Dxl dxl = this.A01;
        if (dxl != null) {
            StringBuffer A0s2 = BE6.A0s();
            for (int i = 0; i < dxl.A0K(); i++) {
                if (A0s2.length() != 0) {
                    A0s2.append(", ");
                }
                AnonymousClass1Bx A0M = dxl.A0M(i);
                if (A0M instanceof C28277Dwl) {
                    r3 = A0M;
                } else if (A0M != null) {
                    C28339Dxl A05 = C28339Dxl.A05(A0M);
                    ? obj = new Object();
                    if (A05.A0K() == 2) {
                        obj.A01 = AnonymousClass1C0.A02(C28339Dxl.A03(A05));
                        obj.A00 = C28339Dxl.A04(A05);
                        r3 = obj;
                    } else {
                        throw C28339Dxl.A02(A05);
                    }
                } else {
                    r3 = null;
                }
                A0s2.append(r3);
            }
            A0s.append("[");
            A0s.append(A0s2);
            A0s.append("]");
        }
        return A0s.toString();
    }
}
