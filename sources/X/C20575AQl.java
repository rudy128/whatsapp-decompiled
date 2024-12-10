package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AQl  reason: case insensitive filesystem */
public final class C20575AQl implements C72113Kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public void Bqf() {
        C194969sa r3;
        if (C18020vd.A05(C18040vf.A02, ((C131996m0) this.A04.get()).A01, 3981)) {
            AnonymousClass00H r4 = this.A01;
            ArrayList A042 = ((A5T) r4.get()).A04();
            ArrayList<C196009uJ> A13 = AnonymousClass000.A13();
            Iterator it = A042.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C196009uJ r7 = (C196009uJ) next;
                C184559b9 r32 = (C184559b9) this.A00.get();
                C72453Mb.A1R(r7);
                int intValue = r7.A02.intValue();
                if (intValue == 0) {
                    AnonymousClass00H r33 = r32.A00;
                    r3 = new C194969sa(((C131996m0) r33.get()).A00("dc_days_delay", 7), ((C131996m0) r33.get()).A00("dc_days_length", 2));
                } else if (intValue == 1) {
                    r3 = new C194969sa(0, 0);
                } else {
                    throw AnonymousClass3MW.A14();
                }
                if (System.currentTimeMillis() > r7.A00 + r3.A00 + r3.A01) {
                    A13.add(next);
                }
            }
            for (C196009uJ r0 : A13) {
                ((A5T) r4.get()).A05(r0.A01);
            }
            AnonymousClass00H r5 = this.A03;
            ArrayList A043 = ((A5T) r5.get()).A04();
            ArrayList<C195409tI> A132 = AnonymousClass000.A13();
            Iterator it2 = A043.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C195409tI r1 = (C195409tI) next2;
                C18070vi.A0b(r1);
                if (((C190079kL) this.A02.get()).A00(r1)) {
                    A132.add(next2);
                }
            }
            for (C195409tI r02 : A132) {
                ((A5T) r5.get()).A05(r02.A02);
            }
        }
    }

    public C20575AQl(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A04 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r5;
    }
}
