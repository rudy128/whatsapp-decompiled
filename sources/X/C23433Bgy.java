package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.Bgy  reason: case insensitive filesystem */
public abstract class C23433Bgy extends C27286DbF implements List, RandomAccess {
    public static final C23435Bh0 A00 = new C23434Bgz(C23432Bgx.A02, 0);

    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    if (hasNext) {
                        if (!hasNext2 || ((next = it.next()) != (next2 = it2.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!hasNext2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (BE8.A1Y(obj, this, i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj != null) {
            int size = size();
            do {
                size--;
                if (size >= 0) {
                }
            } while (!BE8.A1Y(obj, this, size));
            return size;
        }
        return -1;
    }

    /* renamed from: A02 */
    public C23433Bgy subList(int i, int i2) {
        if (this instanceof C23431Bgw) {
            C23431Bgw bgw = (C23431Bgw) this;
            C25875Cnj.A02(i, i2, bgw.A01);
            int i3 = bgw.A00;
            return bgw.zzc.subList(i + i3, i2 + i3);
        }
        C25875Cnj.A02(i, i2, size());
        int i4 = i2 - i;
        if (i4 == size()) {
            return this;
        }
        if (i4 == 0) {
            return C23432Bgx.A02;
        }
        return new C23431Bgw(this, i, i4);
    }

    /* renamed from: A03 */
    public final C23435Bh0 listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw BE6.A0l(C25875Cnj.A00(i, size, "index"));
        } else if (isEmpty()) {
            return A00;
        } else {
            return new C23434Bgz(this, i);
        }
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw C17880vN.A0y();
    }

    public final boolean contains(Object obj) {
        return AnonymousClass000.A1Q(indexOf(obj));
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass000.A0O(get(i2), i * 31);
        }
        return i;
    }

    @Deprecated
    public final Object remove(int i) {
        throw C17880vN.A0y();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw C17880vN.A0y();
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }
}
