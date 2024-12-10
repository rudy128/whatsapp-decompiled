package X;

import java.util.Iterator;

/* renamed from: X.DNl  reason: case insensitive filesystem */
public class C26963DNl implements E6I {
    public final E6I A00;

    public C26963DNl(E6I e6i) {
        this.A00 = e6i;
    }

    public boolean CP3(DFL dfl) {
        C25708Cke A01 = C25995CqB.A01();
        int i = dfl.A05;
        int[] A002 = A01.A00(i);
        for (int A0F : A002) {
            Iterator it = dfl.A0F(A0F).iterator();
            while (it.hasNext()) {
                DFL A0d = BE6.A0d(it);
                if (A0d != null && this.A00.CP3(A0d)) {
                    return true;
                }
            }
        }
        int[] A012 = C25995CqB.A01().A01(i);
        for (int A09 : A012) {
            DFL A092 = dfl.A09(A09);
            if (A092 != null && this.A00.CP3(A092)) {
                return true;
            }
        }
        return false;
    }
}
