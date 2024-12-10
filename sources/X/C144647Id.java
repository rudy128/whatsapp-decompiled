package X;

import java.util.Iterator;

/* renamed from: X.7Id  reason: invalid class name and case insensitive filesystem */
public class C144647Id implements AnonymousClass3L8 {
    public final int A00;

    public C144647Id(int i) {
        this.A00 = i;
    }

    public final void BKm(Iterable iterable) {
        switch (this.A00) {
            case 0:
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C123506Us r1 = (C123506Us) it.next();
                    if (r1 instanceof AnonymousClass682) {
                        AnonymousClass682.A01((AnonymousClass682) r1);
                    }
                }
                return;
            case 1:
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((C123506Us) it2.next()).A02();
                }
                return;
            case 2:
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    C123506Us r12 = (C123506Us) it3.next();
                    if (r12 instanceof AnonymousClass682) {
                        AnonymousClass682.A01((AnonymousClass682) r12);
                    }
                }
                return;
            default:
                Iterator it4 = iterable.iterator();
                while (it4.hasNext()) {
                    C123506Us r13 = (C123506Us) it4.next();
                    if (r13 instanceof AnonymousClass682) {
                        AnonymousClass682.A01((AnonymousClass682) r13);
                    }
                }
                return;
        }
    }
}
