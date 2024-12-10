package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.DbM  reason: case insensitive filesystem */
public final class C27293DbM extends AbstractList<String> implements EE2, RandomAccess {
    public final EE2 A00;

    public C27293DbM(EE2 ee2) {
        this.A00 = ee2;
    }

    public final Object BXq(int i) {
        return this.A00.BXq(i);
    }

    public final List CTP() {
        return this.A00.CTP();
    }

    public final EE2 CTQ() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C27106DUn(this);
    }

    public final ListIterator listIterator(int i) {
        return new DV8(this, i);
    }

    public final int size() {
        return this.A00.size();
    }
}
