package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.1JT  reason: invalid class name */
public final class AnonymousClass1JT implements Iterator, C18450wR {
    public int A00 = -2;
    public Object A01;
    public final /* synthetic */ AnonymousClass1JR A02;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AnonymousClass1JT(AnonymousClass1JR r2) {
        this.A02 = r2;
    }

    private final void A00() {
        Object invoke;
        int i = this.A00;
        AnonymousClass1JR r0 = this.A02;
        if (i == -2) {
            invoke = r0.A00.invoke();
        } else {
            C22821Di r1 = r0.A01;
            Object obj = this.A01;
            C18070vi.A0b(obj);
            invoke = r1.invoke(obj);
        }
        this.A01 = invoke;
        int i2 = 1;
        if (invoke == null) {
            i2 = 0;
        }
        this.A00 = i2;
    }

    public boolean hasNext() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 1) {
            return false;
        }
        return true;
    }

    public Object next() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            C18070vi.A0z(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
