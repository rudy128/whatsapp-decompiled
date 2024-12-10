package X;

import java.util.List;

public final class CYP {
    public final Object A00 = C17880vN.A0p();
    public final List A01 = AnonymousClass8BT.A0z();

    public final C27080DTf A00(E6G e6g) {
        COA coa = new COA(e6g, new C27979DpG(this));
        synchronized (this.A00) {
            this.A01.add(coa);
        }
        return new C27080DTf((Object) coa, 41);
    }

    public final void A01(Object obj) {
        List<COA> A0t;
        synchronized (this.A00) {
            A0t = C29431cG.A0t(this.A01);
        }
        for (COA coa : A0t) {
            E6G e6g = coa.A01;
            if (e6g != null) {
                e6g.C5q(obj);
            }
        }
    }
}
