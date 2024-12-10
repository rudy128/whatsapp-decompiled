package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.DbO  reason: case insensitive filesystem */
public final class C27295DbO extends AbstractList<String> implements EE3, RandomAccess {
    public final EE3 A00;

    public final EE3 CTa() {
        return this;
    }

    public final Object CTH(int i) {
        return this.A00.CTH(i);
    }

    public final List CTW() {
        return this.A00.CTW();
    }

    public final /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final Iterator iterator() {
        return new C27107DUo(this);
    }

    public final ListIterator listIterator(int i) {
        return new DV9(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C27295DbO(EE3 ee3) {
        this.A00 = ee3;
    }

    public final void CT3(DSO dso) {
        throw C17880vN.A0y();
    }
}
