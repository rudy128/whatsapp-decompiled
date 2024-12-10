package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ie  reason: invalid class name and case insensitive filesystem */
public final class C189179ie {
    public final List A00;

    public C189179ie(C186369e5 r5) {
        C18070vi.A0d(r5, 1);
        C192949pI[] r3 = new C192949pI[7];
        C196019uK r0 = r5.A01;
        C18070vi.A0d(r0, 1);
        r3[0] = new C192949pI(r0);
        AnonymousClass8KK r1 = r5.A00;
        C18070vi.A0d(r1, 1);
        r3[1] = new C192949pI(r1);
        C196019uK r02 = r5.A03;
        C18070vi.A0d(r02, 1);
        r3[2] = new C192949pI(r02);
        C196019uK r2 = r5.A02;
        r3[3] = new C192949pI(r2);
        r3[4] = new C192949pI(r2);
        r3[5] = new C192949pI(r2);
        this.A00 = C18070vi.A0O(new C192949pI(r2), r3, 6);
    }

    public final boolean A00(A2t a2t) {
        List list = this.A00;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C192949pI r1 = (C192949pI) next;
            if (r1.A01(a2t) && r1.A02(r1.A00.A04())) {
                A13.add(next);
            }
        }
        if (AnonymousClass000.A1a(A13)) {
            A5Z A002 = A5Z.A00();
            String str = C197029w2.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Work ");
            A10.append(a2t.A0M);
            A10.append(" constrained by ");
            AnonymousClass8BW.A16(A002, C29431cG.A0h(", ", A13, C22290B1s.A00), str, A10);
        }
        return A13.isEmpty();
    }
}
