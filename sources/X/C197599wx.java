package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9wx  reason: invalid class name and case insensitive filesystem */
public final class C197599wx {
    public final AnonymousClass00H A00 = C201811d.A00(49469);

    public static final ADA A00(String str, List list) {
        boolean z;
        boolean z2 = list instanceof Collection;
        boolean z3 = true;
        if (!z2 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next() instanceof C168178iR) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z2 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next() instanceof C168168iQ) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z3 = false;
        if (!z || !z3) {
            Object A0c = C29431cG.A0c(list);
            if (A0c instanceof C168178iR) {
                if (str == null) {
                    str = "";
                }
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : list) {
                    if (next instanceof C168178iR) {
                        A13.add(next);
                    }
                }
                return new C168158iP(str, A13);
            } else if (A0c instanceof C168168iQ) {
                if (str == null) {
                    str = "";
                }
                ArrayList A132 = AnonymousClass000.A13();
                for (Object next2 : list) {
                    if (next2 instanceof C168168iQ) {
                        A132.add(next2);
                    }
                }
                return new C168148iO(str, A132);
            }
        }
        return null;
    }
}
