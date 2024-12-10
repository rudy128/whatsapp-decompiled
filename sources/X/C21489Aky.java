package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.Aky  reason: case insensitive filesystem */
public final class C21489Aky implements Iterator, C18450wR {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C21489Aky(char c, char c2) {
        this.A03 = 1;
        this.A02 = 122;
        this.A01 = true;
        this.A00 = 65;
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return Character.valueOf((char) i);
    }

    public boolean hasNext() {
        return this.A01;
    }

    public C21489Aky() {
    }
}
