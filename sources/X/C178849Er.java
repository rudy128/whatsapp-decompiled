package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Er  reason: invalid class name and case insensitive filesystem */
public class C178849Er extends C178869Et implements C22469B9b {
    public final Object A00;

    public C29621ca BVP() {
        return (C29621ca) this.A00;
    }

    public C178849Er(List list) {
        C29591cX A0t = C108945cZ.A0t("sub_group_suggestion");
        if (C20121A8g.A0C(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C178709Ed.A00(A0t, it);
            }
        }
        this.A00 = A0t.A03();
    }

    public C178849Er(C178759Ei r7, C178709Ed r8, C178709Ed r9, C178719Ee r10, C178719Ee r11, C178719Ee r12, String str) {
        C18070vi.A0d(str, 1);
        C29591cX A0t = C108945cZ.A0t("sub_group_suggestion");
        C20121A8g.A0B(A0t, r8);
        if (r10 != null) {
            C178719Ee.A00(A0t, r10);
        }
        C20121A8g.A0B(A0t, r9);
        if (r11 != null) {
            C178719Ee.A00(A0t, r11);
        }
        if (r12 != null) {
            C178719Ee.A00(A0t, r12);
        }
        C29591cX A0t2 = C108945cZ.A0t("subject");
        if (AnonymousClass8BS.A1O(str, 1, 65536)) {
            A0t2.A07(str);
        }
        C108955ca.A1P(A0t2, A0t);
        AnonymousClass8BW.A1E(A0t, r7);
        this.A00 = A0t.A03();
    }
}
