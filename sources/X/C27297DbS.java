package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.DbS  reason: case insensitive filesystem */
public class C27297DbS extends AbstractList<String> implements EE5, RandomAccess {
    public final EE5 A00;

    public EE5 Bb0() {
        return this;
    }

    public Object BXq(int i) {
        return this.A00.BXq(i);
    }

    public List Bay() {
        return this.A00.Bay();
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public Iterator iterator() {
        return new C27108DUr(this);
    }

    public ListIterator listIterator(int i) {
        return new DVA(this, i);
    }

    public int size() {
        return this.A00.size();
    }

    public C27297DbS(EE5 ee5) {
        this.A00 = ee5;
    }

    public void BAo(DSQ dsq) {
        throw C17880vN.A0y();
    }
}
