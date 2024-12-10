package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AP1 implements C22423B7f {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AP1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
        this.A04 = obj3;
    }

    public final void C2S() {
        if (this.A00 != 0) {
            AnonymousClass8FG r8 = (AnonymousClass8FG) this.A01;
            AF1 af1 = (AF1) this.A02;
            Set set = (Set) this.A03;
            List list = (List) this.A04;
            C18070vi.A0k(set, list);
            ArrayList A13 = AnonymousClass000.A13();
            int i = 0;
            int i2 = 0;
            for (Object next : (List) list.get(0)) {
                if (A13.size() < 35) {
                    boolean contains = set.contains(next);
                    boolean contains2 = r8.A0B.contains(next);
                    if (contains) {
                        if (contains2) {
                            A13.add(next);
                            i2++;
                        } else if (i2 <= 5) {
                            A13.add(next);
                            i2++;
                        }
                    } else if (contains2 && i <= 30) {
                        A13.add(next);
                    }
                    i++;
                }
            }
            AnonymousClass8FG.A04(af1, r8, A13);
            r8.A0C = A13;
            return;
        }
        C19989A2b a2b = (C19989A2b) this.A01;
        C188619hi r3 = (C188619hi) this.A02;
        ArrayList arrayList = (ArrayList) this.A03;
        C22821Di r1 = (C22821Di) this.A04;
        C18070vi.A0k(arrayList, r1);
        if (a2b != null) {
            a2b.A03("qpl_business_ranking_end");
        }
        List list2 = r3.A0C;
        list2.clear();
        list2.addAll(arrayList);
        r1.invoke(new C169228kZ(r3));
    }
}
