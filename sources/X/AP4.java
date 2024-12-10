package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AP4 implements BAX {
    public final /* synthetic */ AP5 A00;

    public AP4(AP5 ap5) {
        this.A00 = ap5;
    }

    public void Bmu(List list) {
        AP5 ap5 = this.A00;
        C195699tl r5 = ap5.A09.A05;
        if (r5 != null) {
            C198469yO r4 = ap5.A0D;
            int i = 0;
            while (true) {
                List list2 = r4.A03;
                if (i < list2.size()) {
                    AF0 af0 = (AF0) list2.get(i);
                    if (list.contains(af0.A0E)) {
                        AF0 A002 = AF0.A00(af0);
                        A002.A01 = 2;
                        list2.set(i, A002);
                    }
                    i++;
                } else {
                    List list3 = r5.A09;
                    list3.clear();
                    list3.addAll(list2);
                    AP5.A06(ap5);
                    return;
                }
            }
        }
    }

    public void Bmv(Map map) {
        AP5 ap5 = this.A00;
        C18070vi.A0d(map, 0);
        LinkedHashMap A0b = C108995ce.A0b(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            String str = ((AF0) A16.getValue()).A0F;
            C18070vi.A0W(str);
            List list = ((AF0) A16.getValue()).A05;
            if (list == null) {
                list = C18460wS.A00;
            }
            List list2 = ((AF0) A16.getValue()).A06;
            if (list2 == null) {
                list2 = C18460wS.A00;
            }
            A0b.put(key, new C194849sO(str, ((AF0) A16.getValue()).A04, list, list2));
        }
        LinkedHashMap A0b2 = C108995ce.A0b(A0b);
        Iterator A152 = AnonymousClass000.A15(A0b);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            A0b2.put(((C194849sO) A162.getValue()).A00, A162.getValue());
        }
        ap5.A0E(A0b2);
    }
}
