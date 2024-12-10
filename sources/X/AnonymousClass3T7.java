package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.3T7  reason: invalid class name */
public class AnonymousClass3T7 extends AnonymousClass8FK {
    public List A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final C37361pP A02;
    public final Set A03;

    public static void A00(AnonymousClass3T7 r11) {
        C86384Rk r0;
        AnonymousClass1DT r10 = r11.A01;
        List list = r11.A00;
        Set set = r11.A03;
        boolean A17 = C18070vi.A17(list, set);
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AEQ aeq = (AEQ) list.get(i);
            boolean contains = set.contains(aeq);
            C18070vi.A0b(aeq);
            if (!contains) {
                r0 = new C86384Rk(aeq, false);
            }
            A13.add(r0);
        }
        r10.A0E(A13);
    }

    public AnonymousClass3T7(Application application, C37361pP r4, List list, List list2) {
        super(application);
        HashSet A12 = C17880vN.A12();
        this.A03 = A12;
        this.A02 = r4;
        this.A00 = list;
        if (list2 != null) {
            A12.addAll(list2);
        }
        List list3 = (List) r4.A02("saved_all_categories");
        if (list3 != null) {
            this.A00 = list3;
        }
        Collection collection = (Collection) r4.A02("saved_selected_categories");
        if (collection != null) {
            Set set = this.A03;
            set.clear();
            set.addAll(collection);
        }
        A00(this);
    }
}
