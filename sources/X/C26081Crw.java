package X;

import java.util.List;

/* renamed from: X.Crw  reason: case insensitive filesystem */
public final class C26081Crw {
    public static final C26081Crw A00 = new Object();

    public static final void A00(DFL dfl, E6E e6e, int i) {
        C18070vi.A0d(dfl, 0);
        ThreadLocal threadLocal = C24724CHl.A02;
        Object obj = threadLocal.get();
        threadLocal.set(Integer.valueOf(i));
        try {
            A00.A01(dfl, e6e);
        } finally {
            threadLocal.set(obj);
        }
    }

    private final boolean A01(DFL dfl, E6E e6e) {
        if (!e6e.CRs(dfl)) {
            C25708Cke A01 = C25995CqB.A01();
            int i = dfl.A05;
            int[] A012 = A01.A01(i);
            int length = A012.length;
            int i2 = 0;
            while (i2 < length) {
                DFL A09 = dfl.A09(A012[i2]);
                if (A09 == null || !A01(A09, e6e)) {
                    i2++;
                }
            }
            for (int A0F : C25995CqB.A01().A00(i)) {
                List A0F2 = dfl.A0F(A0F);
                int A08 = BE7.A08(A0F2);
                for (int i3 = 0; i3 < A08; i3++) {
                    DFL A0G = AnonymousClass8BR.A0G(A0F2, i3);
                    if (A0G != null && A01(A0G, e6e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
