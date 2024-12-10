package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0wT  reason: invalid class name and case insensitive filesystem */
public final class C18470wT implements ListIterator, C18450wR {
    public static final C18470wT A00 = new Object();

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object next() {
        throw new NoSuchElementException();
    }

    public /* bridge */ /* synthetic */ Object previous() {
        throw new NoSuchElementException();
    }
}
