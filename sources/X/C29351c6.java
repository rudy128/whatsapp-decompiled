package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1c6  reason: invalid class name and case insensitive filesystem */
public abstract class C29351c6 extends AnonymousClass1ZU {
    public static final int A0C(Iterable iterable, int i) {
        C18070vi.A0d(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final ArrayList A0F(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C29401cD.A0J((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static ArrayList A0D(Iterable iterable) {
        return new ArrayList(A0C(iterable, 10));
    }

    public static ArrayList A0E(Iterable iterable) {
        return new ArrayList(A0C(iterable, 10));
    }
}
