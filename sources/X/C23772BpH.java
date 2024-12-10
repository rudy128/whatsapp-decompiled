package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.BpH  reason: case insensitive filesystem */
public class C23772BpH extends C25278Cca {
    public final Collection A00;

    public boolean A09(C25670Ck0 ck0, C25812CmP cmP, Object obj, Object obj2) {
        C24957CRh cRh = new C24957CRh(ck0, obj, obj2, cmP.A05);
        for (E6J BCK : this.A00) {
            try {
                if (!BCK.BCK(cRh)) {
                    return false;
                }
            } catch (C23741Bom unused) {
            }
        }
        return true;
    }

    public C23772BpH(E6J e6j) {
        this.A00 = Collections.singletonList(e6j);
    }

    public C23772BpH(Collection collection) {
        this.A00 = collection;
    }
}
