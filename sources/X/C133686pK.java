package X;

import java.util.Iterator;

/* renamed from: X.6pK  reason: invalid class name and case insensitive filesystem */
public abstract class C133686pK {
    public AnonymousClass87I A00;
    public boolean A01;
    public boolean A02;
    public final C139596z7 A03;

    public C133686pK(C139596z7 r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
    }

    public final C131976ly A00(String str, boolean z, boolean z2) {
        C18070vi.A0d(str, 0);
        C131976ly r2 = new C131976ly();
        if (this.A02) {
            C139596z7 r6 = this.A03;
            AnonymousClass7IL r8 = new AnonymousClass7IL(r2, 1);
            C17960vV.A02();
            if (z2) {
                Iterator A15 = AnonymousClass000.A15(r6.A09);
                while (A15.hasNext()) {
                    for (A34 A0B : (Iterable) C17890vO.A0P(A15)) {
                        A0B.A0B(true);
                    }
                }
            }
            AnonymousClass8AO r9 = r6.A06;
            C122596Qz r7 = C122596Qz.ANY;
            C121906Ly r5 = new C121906Ly(r6, r7, r8, r9, z);
            r6.A08.CGD(r5, str);
            C139596z7.A00(r5, r6, r7);
        }
        return r2;
    }

    public final synchronized void A01(Integer num) {
        if (!this.A01) {
            this.A01 = true;
            C139596z7 r3 = this.A03;
            C131586lL r1 = new C131586lL(this);
            C17960vV.A02();
            r3.A08.CGD(new AnonymousClass6MP(num, r1, r3, 0), new String[0]);
        }
    }
}
