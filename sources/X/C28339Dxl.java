package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.Dxl  reason: case insensitive filesystem */
public abstract class C28339Dxl extends AnonymousClass1Bz implements Iterable {
    public AnonymousClass1Bx[] A00 = C26135Csy.A03;

    public static AnonymousClass1Bx A03(C28339Dxl dxl) {
        return dxl.A0M(0);
    }

    public static AnonymousClass1Bx A04(C28339Dxl dxl) {
        return dxl.A0M(1);
    }

    public boolean A0H() {
        return true;
    }

    public boolean A0I(AnonymousClass1Bz r6) {
        if (r6 instanceof C28339Dxl) {
            C28339Dxl dxl = (C28339Dxl) r6;
            int A0K = A0K();
            if (dxl.A0K() == A0K) {
                int i = 0;
                while (i < A0K) {
                    AnonymousClass1Bz CP9 = this.A00[i].CP9();
                    AnonymousClass1Bz CP92 = dxl.A00[i].CP9();
                    if (CP9 == CP92 || CP9.A0I(CP92)) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int length = this.A00.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.A00[length].CP9().hashCode();
        }
    }

    public Iterator iterator() {
        return new C27109DUs(this.A00);
    }

    public static IllegalArgumentException A02(C28339Dxl dxl) {
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(dxl.A0K());
        return new IllegalArgumentException(sb.toString());
    }

    public static C28339Dxl A05(Object obj) {
        if (obj == null || (obj instanceof C28339Dxl)) {
            return (C28339Dxl) obj;
        }
        if (obj instanceof EEM) {
            return A05(((AnonymousClass1Bx) obj).CP9());
        }
        if (obj instanceof byte[]) {
            try {
                return A05(AnonymousClass1Bz.A01((byte[]) obj));
            } catch (IOException e) {
                throw AnonymousClass000.A0k(C17900vP.A0C("failed to construct sequence from byte[]: ", AnonymousClass000.A10(), e));
            }
        } else {
            if (obj instanceof AnonymousClass1Bx) {
                AnonymousClass1Bz CP9 = ((AnonymousClass1Bx) obj).CP9();
                if (CP9 instanceof C28339Dxl) {
                    return (C28339Dxl) CP9;
                }
            }
            throw BEB.A0T(obj, "unknown object in getInstance: ", AnonymousClass000.A10());
        }
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.Dy1, java.lang.Object, X.Dxl] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.Dxl] */
    public static C28339Dxl A06(C28341Dxn dxn, boolean z) {
        if (!z) {
            AnonymousClass1Bx A02 = C28341Dxn.A02(dxn);
            if (dxn.A02) {
                if (dxn instanceof C28361Dy7) {
                    ? obj = new Object();
                    if (A02 != null) {
                        obj.A00 = new AnonymousClass1Bx[]{A02};
                        return obj;
                    }
                    throw AnonymousClass000.A0s("'element' cannot be null");
                }
                ? obj2 = new Object();
                if (A02 != null) {
                    obj2.A00 = new AnonymousClass1Bx[]{A02};
                    obj2.A00 = -1;
                    return obj2;
                }
                throw AnonymousClass000.A0s("'element' cannot be null");
            } else if (A02 instanceof C28339Dxl) {
                C28339Dxl dxl = (C28339Dxl) A02;
                if (dxn instanceof C28361Dy7) {
                    return dxl;
                }
                return (C28339Dxl) dxl.A0F();
            } else {
                throw BEB.A0T(dxn, "unknown object in getInstance: ", AnonymousClass000.A10());
            }
        } else if (dxn.A02) {
            return A05(C28341Dxn.A02(dxn));
        } else {
            throw AnonymousClass000.A0k("object implicit - explicit expected.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dy1, java.lang.Object, X.Dxl] */
    public static C28355Dy1 A08(C26135Csy csy) {
        ? obj = new Object();
        obj.A00 = csy.A03();
        obj.A00 = -1;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dy3, java.lang.Object, X.Dxl, X.1Bz] */
    public AnonymousClass1Bz A0E() {
        AnonymousClass1Bx[] r0 = this.A00;
        ? obj = new Object();
        obj.A00 = r0;
        obj.A00 = -1;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Dy1, java.lang.Object, X.Dxl, X.1Bz] */
    public AnonymousClass1Bz A0F() {
        AnonymousClass1Bx[] r0 = this.A00;
        ? obj = new Object();
        obj.A00 = r0;
        obj.A00 = -1;
        return obj;
    }

    public int A0K() {
        int length;
        if (!(this instanceof C28356Dy2)) {
            return this.A00.length;
        }
        C28356Dy2 dy2 = (C28356Dy2) this;
        synchronized (dy2) {
            C28356Dy2.A09(dy2);
            length = dy2.A00.length;
        }
        return length;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.DUd, java.lang.Object] */
    public Enumeration A0L() {
        C27101DUf dUf;
        if (!(this instanceof C28356Dy2)) {
            return new C27101DUf(this);
        }
        C28356Dy2 dy2 = (C28356Dy2) this;
        synchronized (dy2) {
            byte[] bArr = dy2.A00;
            if (bArr != null) {
                ? obj = new Object();
                obj.A01 = new C24178Bwo(bArr, true);
                obj.A00 = C27099DUd.A00(obj);
                dUf = obj;
            } else {
                dUf = new C27101DUf((C28339Dxl) dy2);
            }
        }
        return dUf;
    }

    public AnonymousClass1Bx A0M(int i) {
        AnonymousClass1Bx r0;
        if (!(this instanceof C28356Dy2)) {
            return this.A00[i];
        }
        C28356Dy2 dy2 = (C28356Dy2) this;
        synchronized (dy2) {
            C28356Dy2.A09(dy2);
            r0 = dy2.A00[i];
        }
        return r0;
    }

    public static C28357Dy3 A07(AnonymousClass1Bx r0, C26135Csy csy) {
        csy.A02(r0);
        return new C28357Dy3(csy);
    }

    public String toString() {
        int A0K = A0K();
        if (A0K == 0) {
            return "[]";
        }
        StringBuffer A0s = BE6.A0s();
        A0s.append('[');
        int i = 0;
        while (true) {
            A0s.append(this.A00[i]);
            i++;
            if (i >= A0K) {
                A0s.append(']');
                return A0s.toString();
            }
            A0s.append(", ");
        }
    }
}
