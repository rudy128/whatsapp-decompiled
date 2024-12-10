package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.3F1  reason: invalid class name */
public class AnonymousClass3F1 extends C29751co implements ListIterator, C18450wR {
    public final /* synthetic */ C19800z1 A00;

    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3F1(C19800z1 r2, int i) {
        super(r2);
        this.A00 = r2;
        C29761cp.A03(i, r2.size());
        this.A00 = i;
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public int nextIndex() {
        return this.A00;
    }

    public Object previous() {
        if (hasPrevious()) {
            C19800z1 r1 = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return r1.get(i);
        }
        throw new NoSuchElementException();
    }
}
