package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* renamed from: X.DbK  reason: case insensitive filesystem */
public final class C27291DbK extends AbstractList implements EE1, RandomAccess {
    public final EE1 A00;

    public final EE1 CTZ() {
        return this;
    }

    public final List CTe() {
        return this.A00.CTe();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C23268BeI) this.A00).get(i);
    }

    public final Iterator iterator() {
        return new C27105DUm(this);
    }

    public final ListIterator listIterator(int i) {
        return new DV7(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C27291DbK(EE1 ee1) {
        this.A00 = ee1;
    }
}
