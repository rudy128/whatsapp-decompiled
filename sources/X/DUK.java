package X;

import java.util.Comparator;

public class DUK implements Comparator {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DUK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        if (this.A00 != 0) {
            int compare = ((Comparator) this.A02).compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            AnonymousClass1BI A002 = ((C5I) obj).A01.A00();
            AnonymousClass1BI r4 = ((C25177CaT) this.A01).A00;
            if (C18070vi.A18(A002, r4)) {
                i = 0;
            } else {
                i = 1;
            }
            if (C18070vi.A18(((C5I) obj2).A01.A00(), r4)) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            return C40151uF.A00(i, i2);
        }
        C199029zJ A0R = BE7.A0R(C108985cd.A0J(obj), obj2, 1);
        Object A003 = C25974Cph.A00((C23736Boh) this.A02, A0R, (E8A) this.A01);
        if (A003 instanceof Integer) {
            return AnonymousClass000.A0M(A003);
        }
        C25913CoX.A01("bk.action.array.SortedArray", "Got non-integer result while evaluating comparator predicate");
        return 0;
    }
}
