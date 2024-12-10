package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.4s7  reason: invalid class name and case insensitive filesystem */
public final class C99014s7 implements Iterator, C18450wR {
    public int A00;
    public final Object[] A01;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01.length);
    }

    public Object next() {
        try {
            Object[] objArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public C99014s7(Object[] objArr) {
        this.A01 = objArr;
    }
}
