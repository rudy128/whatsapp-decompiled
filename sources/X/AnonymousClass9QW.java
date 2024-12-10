package X;

import java.util.Iterator;

/* renamed from: X.9QW  reason: invalid class name */
public abstract class AnonymousClass9QW {
    public static final BDd A00(C192929pG r2) {
        BDd bDd;
        C18070vi.A0d(r2, 0);
        Iterator it = r2.A00.iterator();
        while (true) {
            bDd = null;
            if (!it.hasNext()) {
                break;
            }
            B4K b4k = (B4K) it.next();
            if ((b4k instanceof BDd) && (bDd = (BDd) b4k) != null) {
                break;
            }
        }
        return bDd;
    }
}
