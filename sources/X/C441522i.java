package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.22i  reason: invalid class name and case insensitive filesystem */
public final class C441522i extends AnonymousClass21V {
    public Integer A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;

    public final Boolean A1G() {
        List list = this.A08;
        if (list == null) {
            return null;
        }
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C18070vi.A18(((C136276tY) it.next()).A00, true)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
