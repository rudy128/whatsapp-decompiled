package X;

import java.util.Iterator;

public final /* synthetic */ class AVB implements AnonymousClass3L8 {
    public final /* synthetic */ int A00;

    public final void BKm(Iterable iterable) {
        int i = this.A00;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ((C123506Us) it.next()).A04(i);
        }
    }

    public /* synthetic */ AVB(int i) {
        this.A00 = i;
    }
}
