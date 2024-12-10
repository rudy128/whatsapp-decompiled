package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3vK  reason: invalid class name and case insensitive filesystem */
public final class C79373vK extends C95084lf {
    public final AnonymousClass11S A00;

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        if (!super.CMC(collection) || this.A00.A0N()) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AnonymousClass25A.A0p(C17880vN.A0Y(it))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79373vK(AnonymousClass11S r1, C87794Wz r2) {
        super(r2);
        C18070vi.A0j(r2, r1);
        this.A00 = r1;
    }
}
