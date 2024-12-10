package X;

import java.util.Set;

/* renamed from: X.2tV  reason: invalid class name and case insensitive filesystem */
public abstract class C63672tV {
    public static final AnonymousClass77K A00(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        C692236j A02 = A02(r1);
        if (A02 != null) {
            return A02.A03;
        }
        return null;
    }

    public static final boolean A04(AnonymousClass206 r3) {
        Set set;
        Set set2;
        C692236j A02 = A02(r3);
        if (A02 == null) {
            return false;
        }
        AnonymousClass205 r1 = r3.A0v;
        C18070vi.A0W(r1);
        if (!C22971Dz.A0a(r1.A00)) {
            return false;
        }
        if ((!r1.A02 || A02.A00 == 3) && !A02.A09 && (((set = A02.A05) == null || set.isEmpty()) && (((set2 = A02.A04) == null || set2.isEmpty()) && !A02.A07 && !A02.A06 && !A02.A08 && A02.A02 == null))) {
            return false;
        }
        return true;
    }

    public static final synchronized C692236j A02(AnonymousClass206 r2) {
        C692236j r0;
        synchronized (C63672tV.class) {
            C18070vi.A0d(r2, 0);
            r0 = (C692236j) AnonymousClass206.A01(r2, C692236j.class);
        }
        return r0;
    }

    public static final void A03(AnonymousClass206 r1, C692236j r2) {
        AnonymousClass206.A05(r1, r2, C692236j.class);
    }

    public static final C692236j A01(AnonymousClass206 r1) {
        if (A02(r1) == null) {
            A03(r1, new C692236j());
        }
        C692236j A02 = A02(r1);
        if (A02 != null) {
            return A02;
        }
        throw C17880vN.A0g();
    }
}
