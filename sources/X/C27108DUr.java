package X;

import java.util.Iterator;

/* renamed from: X.DUr  reason: case insensitive filesystem */
public class C27108DUr implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C27297DbS A01;

    public C27108DUr(C27297DbS dbS) {
        this.A01 = dbS;
        this.A00 = dbS.A00.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public void remove() {
        throw C17880vN.A0y();
    }
}
