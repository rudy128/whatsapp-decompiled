package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D5j  reason: case insensitive filesystem */
public final class C26595D5j implements E8O {
    public final C27069DRu A00;
    public final List A01;
    public final List A02;
    public final C18100vl A03;
    public final C18100vl A04;

    public C26595D5j(C27069DRu dRu, C26251Cvq cvq, E3V e3v, C28644ECa eCa, List list) {
        String str;
        C27069DRu dRu2 = dRu;
        this.A00 = dRu2;
        this.A02 = list;
        Integer num = AnonymousClass00R.A0C;
        this.A04 = AnonymousClass1DF.A00(num, new C27456Dfl(this));
        this.A03 = AnonymousClass1DF.A00(num, new C27455Dfk(this));
        C26251Cvq cvq2 = cvq;
        C26038Cqy cqy = cvq2.A00;
        C27069DRu dRu3 = C26069Crj.A00;
        String str2 = dRu2.A00;
        int length = str2.length();
        List list2 = dRu2.A02;
        list2 = list2 == null ? C18460wS.A00 : list2;
        ArrayList A13 = AnonymousClass000.A13();
        int size = list2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C26047CrE crE = (C26047CrE) list2.get(i);
            C26038Cqy cqy2 = (C26038Cqy) crE.A02;
            int i3 = crE.A01;
            int i4 = crE.A00;
            if (i3 != i2) {
                A13.add(new C26047CrE(cqy, i2, i3));
            }
            A13.add(new C26047CrE(cqy.A02(cqy2), i3, i4));
            i++;
            i2 = i4;
        }
        if (i2 != length) {
            A13.add(new C26047CrE(cqy, i2, length));
        }
        if (A13.isEmpty()) {
            A13.add(new C26047CrE(cqy, 0, 0));
        }
        ArrayList A0g = C108975cc.A0g(A13);
        int size2 = A13.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C26047CrE crE2 = (C26047CrE) A13.get(i5);
            int i6 = crE2.A01;
            int i7 = crE2.A00;
            if (i6 != i7) {
                str = C108955ca.A0q(i6, i7, str2);
            } else {
                str = "";
            }
            C27069DRu dRu4 = new C27069DRu(str, C26069Crj.A00(dRu2, i6, i7), (List) null, (List) null);
            C26038Cqy cqy3 = (C26038Cqy) crE2.A02;
            if (cqy3.A03 == Integer.MIN_VALUE) {
                int i8 = cqy.A03;
                cqy3 = new C26038Cqy(cqy3.A05, cqy3.A06, cqy3.A07, cqy3.A02, i8, cqy3.A01, cqy3.A00, cqy3.A04);
            }
            String str3 = dRu4.A00;
            C26251Cvq cvq3 = new C26251Cvq(cqy.A02(cqy3), cvq2.A02);
            List list3 = dRu4.A03;
            list3 = list3 == null ? C18460wS.A00 : list3;
            List list4 = this.A02;
            ArrayList A14 = AnonymousClass000.A14(list4);
            int size3 = list4.size();
            for (int i9 = 0; i9 < size3; i9++) {
                C26047CrE.A00(A14, list4, i9, i6, i7);
            }
            ArrayList A0g2 = C108975cc.A0g(A14);
            int size4 = A14.size();
            for (int i10 = 0; i10 < size4; i10++) {
                C26047CrE crE3 = (C26047CrE) A14.get(i10);
                if (i6 > crE3.A01 || crE3.A00 > i7) {
                    throw AnonymousClass000.A0k("placeholder can not overlap with paragraph.");
                }
                A0g2.add(new C26047CrE(crE3.A02, crE3.A01 - i6, crE3.A00 - i6));
            }
            A0g.add(new C25182CaY(new C26596D5k(cvq3, e3v, eCa, str3, list3, A0g2), i6, i7));
        }
        this.A01 = A0g;
    }

    public boolean BSK() {
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C25182CaY) list.get(i)).A02.BSK()) {
                return true;
            }
        }
        return false;
    }

    public float BUS() {
        return C72453Mb.A00(this.A03);
    }

    public float BUy() {
        return C72453Mb.A00(this.A04);
    }
}
