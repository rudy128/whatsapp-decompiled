package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0a3  reason: invalid class name and case insensitive filesystem */
public abstract class C06910a3 implements ListIterator, C18450wR {
    public int A00;
    public int A01;

    public abstract Object next();

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public C06910a3(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final void A04() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void A05() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public void add(Object obj) {
        throw AnonymousClass000.A12();
    }

    public int nextIndex() {
        return this.A00;
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }

    public void set(Object obj) {
        throw AnonymousClass000.A12();
    }

    public final void A06(int i) {
        this.A00 = i;
    }

    public final void A07(int i) {
        this.A01 = i;
    }
}
