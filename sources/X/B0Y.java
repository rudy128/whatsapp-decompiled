package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;

public final class B0Y extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AER $productListInfo;
    public final /* synthetic */ AnonymousClass8F5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B0Y(AnonymousClass8F5 r2, AER aer) {
        super(1);
        this.this$0 = r2;
        this.$productListInfo = aer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        RandomAccess randomAccess;
        AN6 an6 = (AN6) obj;
        C18070vi.A0d(an6, 0);
        AnonymousClass8F5 r1 = this.this$0;
        C22801Dg r11 = r1.A02;
        AER aer = this.$productListInfo;
        if (an6.A00 == 0) {
            C185569cn r12 = r1.A05.A00;
            float f = (float) C108965cb.A08(r12.A01.A00).heightPixels;
            float f2 = r12.A00;
            if (f < f2) {
                i = 1;
            } else {
                i = (int) Math.ceil((double) (f / f2));
            }
        } else {
            i = 0;
        }
        int A1Z = C72453Mb.A1Z(aer);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        LinkedHashMap A133 = C17880vN.A13();
        for (C20254ADm aDm : aer.A02) {
            String str = aDm.A00;
            List<C20243ADb> list = aDm.A01;
            ArrayList A134 = AnonymousClass000.A13();
            for (C20243ADb aDb : list) {
                A134.add(aDb.A00);
                A1Z++;
            }
            A13.add(str);
            A132.add(A134);
        }
        List list2 = an6.A01;
        if (list2 == null) {
            randomAccess = C18460wS.A00;
        } else {
            ArrayList A135 = AnonymousClass000.A13();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C20287AEv A0B = AnonymousClass8BS.A0B(it);
                String str2 = A0B.A0H;
                if (!A133.containsKey(str2)) {
                    A133.put(str2, A0B);
                }
            }
            int size = A13.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList A136 = AnonymousClass000.A13();
                for (Object obj2 : (List) A132.get(i2)) {
                    C20287AEv aEv = (C20287AEv) A133.get(obj2);
                    if (aEv != null) {
                        A136.add(new ANM(aEv));
                    }
                }
                if (!A136.isEmpty()) {
                    String A1H = C108945cZ.A1H(A13, i2);
                    if (!(A1H == null || A1H.length() == 0)) {
                        A135.add(new ANL(A1H));
                    }
                    A135.addAll(A136);
                }
            }
            int size2 = A1Z - list2.size();
            if (size2 > i) {
                size2 = i;
            }
            for (int i3 = 0; i3 < size2; i3++) {
                A135.add(new Object());
            }
            randomAccess = A135;
        }
        r11.A0E(randomAccess);
        return C27621Wu.A00;
    }
}
