package X;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.1cC  reason: invalid class name and case insensitive filesystem */
public abstract class C29391cC extends C29381cB {
    public static final void A0H(List list, Comparator comparator) {
        C18070vi.A0d(list, 0);
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static final void A0G(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
