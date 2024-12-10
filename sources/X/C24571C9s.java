package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.C9s  reason: case insensitive filesystem */
public abstract class C24571C9s {
    public static void A00(C28512E4w e4w, C25649Cjf cjf, File file) {
        ArrayList A10 = C17880vN.A10(cjf.A01.values());
        if (!A10.isEmpty()) {
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                C24473C5o c5o = (C24473C5o) it.next();
                C28511E4v BFq = e4w.BFq(c5o);
                if (BFq != null) {
                    BFq.C09(cjf, c5o, file);
                }
            }
        }
    }
}
