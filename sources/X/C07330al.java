package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.0al  reason: invalid class name and case insensitive filesystem */
public abstract class C07330al<E> extends C19800z1<E> implements C17800vF<E> {
    public boolean containsAll(Collection collection) {
        if (collection == null || !collection.isEmpty()) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public C17800vF CEY(Collection collection) {
        return CEZ(new C09860hP(collection));
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return new C07320ak(this, i, i2);
    }

    public C17800vF BAx(Collection collection) {
        C07360ao BDf = BDf();
        BDf.addAll(collection);
        return BDf.A0V();
    }

    public C17800vF CEV(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf != -1) {
            return CEb(indexOf);
        }
        return this;
    }

    public boolean contains(Object obj) {
        return AnonymousClass000.A1S(indexOf(obj), -1);
    }

    public Iterator iterator() {
        return listIterator();
    }
}
