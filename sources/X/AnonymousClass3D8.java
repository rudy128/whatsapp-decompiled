package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3D8  reason: invalid class name */
public final class AnonymousClass3D8 implements Iterator, C18450wR {
    public long A00;
    public boolean A01;
    public final long A02;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object next() {
        long j = this.A00;
        if (j != this.A02) {
            this.A00 = 1 + j;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return new C42731ye(j);
    }

    public AnonymousClass3D8(long j) {
        long j2 = 65536;
        this.A02 = j;
        boolean z = AnonymousClass04C.A00(65536, j) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? j : j2;
    }

    public boolean hasNext() {
        return this.A01;
    }
}
