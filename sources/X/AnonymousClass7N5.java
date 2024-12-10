package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7N5  reason: invalid class name */
public class AnonymousClass7N5 implements C28540E6o {
    public final int A00;
    public final Object A01;

    public AnonymousClass7N5(AnonymousClass7MH r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final Object BCH(Object obj, Object obj2, Object obj3) {
        Object valueOf;
        if (this.A00 != 0) {
            AnonymousClass7MH r1 = (AnonymousClass7MH) this.A01;
            List list = (List) obj;
            int A0M = AnonymousClass000.A0M(obj2);
            int A0M2 = AnonymousClass000.A0M(obj3);
            C18070vi.A0h(r1, list);
            List list2 = r1.A05;
            list2.clear();
            int A012 = C22339B3q.A01(((float) A0M) * (((float) A0M2) / 4.0f));
            int i = A0M2 + A012;
            while (A012 < i) {
                if (A012 < 0 || A012 >= list.size()) {
                    valueOf = Float.valueOf(0.0f);
                } else {
                    valueOf = list.get(A012);
                }
                list2.add(valueOf);
                A012++;
            }
            return list2;
        }
        Object obj4 = this.A01;
        List list3 = (List) obj;
        int A0M3 = AnonymousClass000.A0M(obj2);
        int A0M4 = AnonymousClass000.A0M(obj3);
        C18070vi.A0h(obj4, list3);
        int A013 = A0M3 + C22339B3q.A01((((float) A0M3) / 4.0f) * (((float) A0M4) / 150.0f));
        ArrayList A0z = C17880vN.A0z(A013);
        AnonymousClass6WC.A00(list3, A0z, A013);
        return A0z;
    }
}
