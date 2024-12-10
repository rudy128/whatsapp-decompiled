package X;

import java.util.NoSuchElementException;

/* renamed from: X.2AN  reason: invalid class name */
public final class AnonymousClass2AN extends AnonymousClass1IZ {
    public static final Object SENTINEL = C17880vN.A0p();
    public Object valueOrSentinel;

    public boolean hasNext() {
        if (this.valueOrSentinel != SENTINEL) {
            return true;
        }
        return false;
    }

    public Object next() {
        Object obj = this.valueOrSentinel;
        Object obj2 = SENTINEL;
        if (obj != obj2) {
            this.valueOrSentinel = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public AnonymousClass2AN(Object obj) {
        this.valueOrSentinel = obj;
    }
}
