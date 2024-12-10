package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Eo  reason: invalid class name and case insensitive filesystem */
public class C178819Eo extends C178869Et implements C22469B9b {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    public C178819Eo(List list, int i) {
        C29591cX A0t = C108945cZ.A0t("accept_pay");
        if (i != 0) {
            C29591cX.A01(A0t, "service", "UPI");
            if (C29601cY.A05(list, 1, 10)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0t.A05(((C20121A8g) it.next()).BVP());
                }
            }
        } else {
            C29591cX.A01(A0t, "service", "FBPAY");
            if (C29601cY.A05(list, 1, 10)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    A0t.A05(((C20121A8g) it2.next()).BVP());
                }
            }
        }
        this.A00 = A0t.A03();
    }
}
