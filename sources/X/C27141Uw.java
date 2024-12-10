package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Uw  reason: invalid class name and case insensitive filesystem */
public final class C27141Uw {
    public final ArrayList A00 = new ArrayList();

    public final void A00(AnonymousClass3L6 r2) {
        this.A00.add(r2);
    }

    public final void A01(AnonymousClass3L6 r2) {
        this.A00.remove(r2);
    }

    public final void A02(AnonymousClass1BI r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass3L6 r0 = (AnonymousClass3L6) it.next();
            if (r0 != null) {
                r0.BvL(r3);
            }
        }
    }
}
