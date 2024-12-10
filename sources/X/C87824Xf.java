package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.4Xf  reason: invalid class name and case insensitive filesystem */
public final class C87824Xf {
    public final Set A00;

    public C87824Xf(Set set) {
        C18070vi.A0d(set, 1);
        this.A00 = set;
    }

    public final int A01(String str) {
        Object obj;
        C18070vi.A0d(str, 0);
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C18070vi.A18(((C108635c2) obj).BTj(), str)) {
                break;
            }
        }
        C108635c2 r1 = (C108635c2) obj;
        if (r1 != null) {
            return r1.Bac();
        }
        return 22;
    }

    public final boolean A02(View view, String str, String str2) {
        C108635c2 A002;
        View BbT;
        C18070vi.A0d(view, 0);
        if (str2 == null || (A002 = A00(str, str2)) == null || (BbT = A002.BbT(view)) == null) {
            return false;
        }
        BbT.getParent().requestChildFocus(BbT, BbT);
        if (A002.BgM()) {
            C90574eI.A00(BbT.getViewTreeObserver(), BbT, this, 6);
        }
        if (A002.CLm()) {
            BbT.callOnClick();
        }
        return true;
    }

    private final C108635c2 A00(String str, String str2) {
        Object obj;
        Set set = this.A00;
        LinkedHashMap A13 = C17880vN.A13();
        for (Object next : set) {
            ((List) C72473Md.A0h(((C108635c2) next).BWD(), A13)).add(next);
        }
        List<C108635c2> list = (List) A13.get(str);
        if (list == null) {
            return null;
        }
        for (C108635c2 r6 : list) {
            if (r6.BgM()) {
                String BTj = r6.BTj();
                if (!C18070vi.A18(BTj, str2)) {
                    r6 = A00(BTj, str2);
                    if (r6 != null) {
                        return r6;
                    }
                }
            }
            String BTj2 = r6.BTj();
            if (!C18070vi.A18(BTj2, str2)) {
                String str3 = str2;
                while (true) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C18070vi.A18(((C108635c2) obj).BTj(), str3)) {
                            break;
                        }
                    }
                    C108635c2 r1 = (C108635c2) obj;
                    if (r1 == null || (str3 = r1.BWD()) == null) {
                        break;
                    } else if (str3.equals(BTj2)) {
                        return r6;
                    }
                }
            } else {
                return r6;
            }
        }
        return null;
    }
}
