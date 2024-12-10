package androidx.transition;

import X.AnonymousClass1LG;
import X.BE6;
import X.C25842Cmw;
import X.C29051bX;
import java.util.ArrayList;

public class FragmentTransitionSupport extends C25842Cmw {
    public void A09(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        AnonymousClass1LG r5 = (AnonymousClass1LG) obj;
        int i = 0;
        if (r5 instanceof C29051bX) {
            C29051bX r52 = (C29051bX) r5;
            int size = r52.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = r52.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A09(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A09(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = r5.A0D;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = r5.A0E;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                ArrayList arrayList6 = r5.A0F;
                if (arrayList6.size() == arrayList.size() && arrayList6.containsAll(arrayList)) {
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            r5.A0E(BE6.A0R(arrayList2, i));
                            i++;
                        }
                    }
                    int size3 = arrayList.size();
                    while (true) {
                        size3--;
                        if (size3 >= 0) {
                            r5.A0G(BE6.A0R(arrayList, size3));
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
