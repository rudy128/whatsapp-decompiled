package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.7F4  reason: invalid class name */
public final class AnonymousClass7F4 implements C72113Kr {
    public final C24751Ln A00;
    public final C26331Rs A01;
    public final AnonymousClass00H A02;
    public final C26811To A03;
    public final AnonymousClass1CJ A04;

    public void Bqf() {
        C26811To r3 = this.A03;
        if (r3.A0T()) {
            ArrayList A032 = C26331Rs.A03(this.A01, "pnForLidChat", false);
            HashSet A12 = C17880vN.A12();
            Iterator it = A032.iterator();
            while (it.hasNext()) {
                A12.add(((C116975yw) it.next()).A00);
            }
            Set A0I = this.A04.A0I();
            C18070vi.A0X(A0I);
            Set A08 = AnonymousClass1b2.A08(AnonymousClass1b2.A0A(new C157957yv(this), new C147157Sa(new C157947yu(A12), AnonymousClass1b2.A0A(AnonymousClass83X.A00, new C99434so(A0I, 4)), false)));
            if (C108945cZ.A1U(A08)) {
                r3.A0N(A08);
            }
        }
    }

    public AnonymousClass7F4(C26811To r1, AnonymousClass1CJ r2, C24751Ln r3, C26331Rs r4, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r1, r3, r4, r5);
        this.A04 = r2;
        this.A03 = r1;
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }
}
