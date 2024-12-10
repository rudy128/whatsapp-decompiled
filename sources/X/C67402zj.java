package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2zj  reason: invalid class name and case insensitive filesystem */
public final class C67402zj implements AnonymousClass1L0 {
    public final C54152dg A00;
    public final C30781eV A01;
    public final C30801eX A02;
    public final AnonymousClass1KF A03;

    public /* synthetic */ void Bqg() {
    }

    public void Bqh() {
        C30781eV r6 = this.A01;
        Iterator A15 = AnonymousClass000.A15(r6.A02);
        while (A15.hasNext()) {
            C30741eR r3 = (C30741eR) C17890vO.A0P(A15);
            if (r3 instanceof C30751eS) {
                C30751eS r32 = (C30751eS) r3;
                ((AnonymousClass10I) r32.A07.get()).CGF(new C70573Bq(r32, 20));
            } else if (r3 instanceof C30761eT) {
                AnonymousClass00H r5 = ((C30761eT) r3).A00;
                ArrayList A04 = ((A5T) r5.get()).A04();
                ArrayList<AnonymousClass8oT> arrayList = new ArrayList<>();
                Iterator it = A04.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (System.currentTimeMillis() - ((AnonymousClass2DX) next).A00 > AnonymousClass2DX.A05) {
                        arrayList.add(next);
                    }
                }
                for (AnonymousClass8oT r0 : arrayList) {
                    ((A5T) r5.get()).A05(r0.A00);
                }
            } else if (!(r3 instanceof C30791eW)) {
                AnonymousClass00H r52 = ((C30771eU) r3).A00;
                List A05 = ((A5S) r52.get()).A05();
                ArrayList<AnonymousClass8oT> arrayList2 = new ArrayList<>();
                for (Object next2 : A05) {
                    if (System.currentTimeMillis() - ((AnonymousClass8oQ) next2).A00 > AnonymousClass8oQ.A03) {
                        arrayList2.add(next2);
                    }
                }
                for (AnonymousClass8oT r02 : arrayList2) {
                    ((A5S) r52.get()).A06(r02.A00);
                }
            }
        }
        AnonymousClass00H r62 = ((C54222dn) r6.A01.get()).A00;
        List A052 = ((A5S) r62.get()).A05();
        ArrayList<A1A> A13 = AnonymousClass000.A13();
        for (Object next3 : A052) {
            if (System.currentTimeMillis() - ((A1A) next3).A00 > A1A.A05) {
                A13.add(next3);
            }
        }
        for (A1A a1a : A13) {
            ((A5S) r62.get()).A06(a1a.A03);
        }
        this.A03.A02();
    }

    public void Bqi() {
        C30801eX r1 = this.A02;
        C30801eX.A01(r1, r1.A01);
        C30801eX.A01(r1, r1.A00);
        C54152dg r3 = this.A00;
        if (C18020vd.A05(C18040vf.A02, r3.A02, 12526)) {
            C48142Li r6 = r3.A00;
            ArrayList A04 = r6.A04();
            ArrayList<C62442rP> A13 = AnonymousClass000.A13();
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (System.currentTimeMillis() - ((C62442rP) next).A00 >= C62442rP.A03) {
                    A13.add(next);
                }
            }
            for (C62442rP r0 : A13) {
                r6.A05(r0.A01);
            }
        }
    }

    public C67402zj(C54152dg r1, C30781eV r2, C30801eX r3, AnonymousClass1KF r4) {
        C18070vi.A0s(r2, r4, r3, r1);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }
}
