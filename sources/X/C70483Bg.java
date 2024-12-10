package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.3Bg  reason: invalid class name and case insensitive filesystem */
public final class C70483Bg implements Cloneable {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final List A04 = Collections.synchronizedList(AnonymousClass000.A13());

    public final boolean A05(C178119Bw r8, boolean z) {
        Object obj;
        Object obj2;
        C18070vi.A0d(r8, 0);
        List list = this.A04;
        if (!list.isEmpty()) {
            Object obj3 = list.get(list.size() - 1);
            C18070vi.A0X(obj3);
            C178119Bw r5 = (C178119Bw) obj3;
            C18030ve r6 = this.A03;
            C18070vi.A0d(r5, 1);
            if ((!z && (r8.A0O() || r5.A0O())) || !A87.A04(r8.A01, r5.A01)) {
                return false;
            }
            if (z) {
                obj = r8.A0C;
                obj2 = r5.A0C;
            } else {
                obj = r8.A04.A01;
                obj2 = r5.A04.A01;
            }
            if (!C42171xk.A00(obj, obj2) || !C42171xk.A00(r8.A0E, r5.A0E) || r8.A0V() != r5.A0V() || r8.A0J != r5.A0J || r8.A0S() != r5.A0S() || r8.A0R() != r5.A0R()) {
                return false;
            }
            if ((r8.A0U() != r5.A0U() && C18020vd.A05(C18040vf.A02, r6, 6307)) || !C42171xk.A00(r8.A0F, r5.A0F)) {
                return false;
            }
        }
        list.add(r8);
        return true;
    }

    public final List A03() {
        List A0t;
        List list = this.A04;
        C18070vi.A0W(list);
        synchronized (list) {
            A0t = C29431cG.A0t(list);
        }
        return A0t;
    }

    public Object clone() {
        C70483Bg r4 = new C70483Bg(this.A00, this.A01, this.A02, this.A03);
        List<C178119Bw> list = this.A04;
        C18070vi.A0W(list);
        synchronized (list) {
            for (C178119Bw A08 : list) {
                r4.A04.add(A08.clone());
            }
        }
        return r4;
    }

    public C70483Bg(AnonymousClass1M9 r2, C24921Me r3, AnonymousClass11P r4, C18030ve r5) {
        C18070vi.A0s(r4, r5, r2, r3);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final int A00() {
        C178119Bw A0C = C18070vi.A0C(this);
        if (A0C == null) {
            return 3;
        }
        if (A0C.A0B != null) {
            if (A0C.A06 == 5) {
                return 4;
            }
            return 5;
        } else if (A0C.A04.A03) {
            return 0;
        } else {
            if (A0C.A06 == 5 || A0C.A06 == 6) {
                return 1;
            }
            return 2;
        }
    }

    public final AnonymousClass1E7 A01() {
        C178119Bw A0C = C18070vi.A0C(this);
        if (A0C != null) {
            return this.A00.A0H(A0C.A04.A01);
        }
        return null;
    }

    public final String A02() {
        C178119Bw A0C = C18070vi.A0C(this);
        if (A0C == null) {
            return null;
        }
        boolean A0O = A0C.A0O();
        StringBuilder A10 = AnonymousClass000.A10();
        if (A0O) {
            A10.append("G:");
            C89444cT r1 = A0C.A04;
            A10.append(C22971Dz.A06(r1.A01));
            A10.append(' ');
            A10.append(r1.A03);
            A10.append(' ');
            A10.append(r1.A02);
            A10.append(' ');
            A10.append(r1.A00);
        } else {
            A10.append("O:");
            A10.append(C22971Dz.A06(A0C.A04.A01));
            A10.append(' ');
            A10.append(A0C.A01);
        }
        return A10.toString();
    }

    public final boolean A04() {
        C178119Bw A0C = C18070vi.A0C(this);
        if (A0C != null) {
            return A0C.A0O();
        }
        return false;
    }

    public String toString() {
        AnonymousClass1E7 A012 = A01();
        if (A012 == null) {
            return "Empty CallGroup";
        }
        String A0I = this.A01.A0I(A012);
        if (A0I == null) {
            return "Invalid Contact CallGroup";
        }
        return A0I;
    }
}
