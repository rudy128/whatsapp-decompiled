package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Ee  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143637Ee implements C43451zp {
    public final /* synthetic */ C112405lQ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public final void BpK(Object obj) {
        C112405lQ r5 = this.A00;
        List list = this.A01;
        boolean z = this.A02;
        C25734Cl4 cl4 = (C25734Cl4) obj;
        C18070vi.A0d(list, 1);
        if (cl4 != null) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C108985cd.A1O(A13, it);
            }
            if (A13.size() == list.size() && z) {
                list = C29431cG.A0l(AnonymousClass6B8.A00, list);
            }
            r5.A02 = list;
            cl4.A02(r5);
        }
    }

    public /* synthetic */ C143637Ee(C112405lQ r1, List list, boolean z) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = z;
    }
}
