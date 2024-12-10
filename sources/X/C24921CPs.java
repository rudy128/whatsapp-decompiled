package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.CPs  reason: case insensitive filesystem */
public class C24921CPs {
    public int A00 = 0;
    public CZT A01;
    public final List A02 = AnonymousClass000.A13();

    public C24921CPs(C24322BzJ bzJ, C26052CrM crM, CZT czt) {
        List list = (List) crM.A00.get(bzJ);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        DUR.A00(12, this.A02);
        this.A01 = czt;
    }
}
