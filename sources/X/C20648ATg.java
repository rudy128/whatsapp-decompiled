package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ATg  reason: case insensitive filesystem */
public class C20648ATg implements C22508BAp {
    public final C20079A6f A00;
    public final /* synthetic */ C20653ATl A01;

    public C20648ATg(C20079A6f a6f, C20653ATl aTl) {
        this.A01 = aTl;
        this.A00 = a6f;
    }

    public void BtA(C190599lD r4, int i) {
        C186579eQ r2 = this.A01.A0D;
        if (r2 != null) {
            C187229fT r1 = r2.A01;
            r1.A03 = null;
            r1.A04.clear();
            r1.A01 = 5;
            r1.A00 = i;
            r2.A00.A0F(r1);
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C195699tl r13 = (C195699tl) obj;
        C20653ATl aTl = this.A01;
        if (aTl.A0D != null) {
            List list = r13.A09;
            C196579vI.A01(this.A00, list);
            C186579eQ r7 = aTl.A0D;
            C187229fT r6 = r7.A01;
            r6.A03 = null;
            List list2 = r6.A04;
            list2.clear();
            r6.A02 = r13;
            List<AnonymousClass8nD> list3 = r13.A07;
            if (list3.isEmpty()) {
                r6.A01 = 2;
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                for (AnonymousClass8nD r9 : list3) {
                    A13.add(new C174128wH(new C825248h(r7, r9, 13), r9.A03, r9.A01, false));
                }
                C41731wy r92 = r7.A02.A00.A0S;
                if (r92.A06() != null && !list.isEmpty()) {
                    String A0q = C17880vN.A0q(r7.A03.A00, ((AEQ) r92.A06()).A01, new Object[1], 0, 2131887057);
                    A13.add(new C174358we(5));
                    A13.add(new C174128wH(new AnonymousClass48l(r7, 4), "", A0q, true));
                }
                r6.A01 = 1;
                list2.clear();
                list2.addAll(A13);
            }
            r7.A00.A0F(r6);
        }
    }
}
