package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.67s  reason: invalid class name and case insensitive filesystem */
public class C1193367s extends C136976ui {
    public final C25311Ns A00;
    public final AnonymousClass1SB A01;
    public final AnonymousClass10I A02;

    public C1193367s(C25311Ns r2, AnonymousClass7IY r3, AnonymousClass1SB r4, AnonymousClass10I r5) {
        super(r3, 30);
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass8AP r5) {
        AnonymousClass7IZ r52 = (AnonymousClass7IZ) r5;
        super.A0C(r52);
        AnonymousClass8B0 r3 = r52.A01;
        if (r3 instanceof AnonymousClass7JE) {
            this.A02.CGF(new C70643By(this, r3, 3));
        }
    }

    public void A0B(int i) {
        Object A04 = A04(i);
        if (A04 instanceof AnonymousClass7JE) {
            this.A02.CGF(new C70643By(this, A04, 2));
        }
        super.A0B(i);
    }

    public ArrayList A0D(int i) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A05().iterator();
        while (it.hasNext()) {
            AnonymousClass8B0 r1 = (AnonymousClass8B0) it.next();
            if (r1.BZ7() == i) {
                A13.add(r1);
            }
        }
        return A13;
    }

    public void A0E(AnonymousClass8B0 r2) {
        if (r2.BE6()) {
            super.A0A(r2);
        }
    }
}
