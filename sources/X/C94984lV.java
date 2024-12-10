package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lV  reason: invalid class name and case insensitive filesystem */
public abstract class C94984lV implements C108445bi {
    public final C18030ve A00;
    public final C88174Yp A01;

    public boolean BRj() {
        return true;
    }

    public C94984lV(C18030ve r1, C88174Yp r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A00(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            C88174Yp r1 = this.A01;
            if (!r1.A05(A0Y) || (!A0Y.A0q && r1.A01(A0Y))) {
                return true;
            }
        }
        return false;
    }
}
