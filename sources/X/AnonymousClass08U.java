package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08U  reason: invalid class name */
public final class AnonymousClass08U extends AnonymousClass0KV implements Iterator, C18450wR {
    public Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A01();
            return entry.getValue();
        }
        throw new IllegalStateException();
    }

    public AnonymousClass08U(C06960a8 r1, Iterator it) {
        super(r1, it);
    }
}
