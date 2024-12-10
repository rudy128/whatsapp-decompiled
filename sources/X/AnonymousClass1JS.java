package X;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1JS  reason: invalid class name */
public final class AnonymousClass1JS implements AnonymousClass1JQ {
    public final AtomicReference A00;

    public Iterator iterator() {
        AnonymousClass1JQ r0 = (AnonymousClass1JQ) this.A00.getAndSet((Object) null);
        if (r0 != null) {
            return r0.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }

    public AnonymousClass1JS(AnonymousClass1JQ r2) {
        this.A00 = new AtomicReference(r2);
    }
}
