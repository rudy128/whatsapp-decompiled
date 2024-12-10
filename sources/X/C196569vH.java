package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.9vH  reason: invalid class name and case insensitive filesystem */
public abstract class C196569vH {
    public static final boolean A00(C193609qN r5, AEQ aeq) {
        if (r5 != null) {
            List<C22424B7g> list = r5.A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C22424B7g b7g : list) {
                    if ((b7g instanceof C20290AEy) && C18070vi.A18(((C20290AEy) b7g).A02, aeq.A01)) {
                        return true;
                    }
                    if ((b7g instanceof C20288AEw) && C18070vi.A18(((C20288AEw) b7g).A01, aeq.A01)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A01(C193609qN r4, AF0 af0) {
        if (r4 != null) {
            List<C20289AEx> list = r4.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C20289AEx aEx : list) {
                    if (C18070vi.A18(aEx.A03, af0.A0F)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
