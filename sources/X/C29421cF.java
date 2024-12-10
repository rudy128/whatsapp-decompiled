package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cF  reason: invalid class name and case insensitive filesystem */
public abstract class C29421cF extends C29411cE {
    public static final List A0R(Class cls, Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final void A0S(List list) {
        C18070vi.A0d(list, 0);
        Collections.reverse(list);
    }
}
