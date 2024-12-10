package X;

import java.util.Iterator;

/* renamed from: X.33w  reason: invalid class name and case insensitive filesystem */
public class C685733w implements AnonymousClass3L8 {
    public final int A00;
    public final Object A01;

    public C685733w(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BKm(Iterable iterable) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                C37231pB r2 = (C37231pB) obj;
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    ((C123506Us) it.next()).A03();
                }
                r2.A01.A04(new C685833x(r2));
                return;
            case 1:
                Integer num = (Integer) obj;
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((C123506Us) it2.next()).A07(num);
                }
                return;
            default:
                AnonymousClass206 r22 = (AnonymousClass206) obj;
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    ((C123506Us) it3.next()).A05(r22);
                }
                return;
        }
    }
}
