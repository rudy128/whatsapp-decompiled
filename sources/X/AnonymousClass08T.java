package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.08T  reason: invalid class name */
public final class AnonymousClass08T extends AnonymousClass0KV implements Iterator, C18450wR {
    public Object next() {
        Map.Entry entry = this.A02;
        if (entry != null) {
            A01();
            return entry.getKey();
        }
        throw new IllegalStateException();
    }

    public AnonymousClass08T(C06960a8 r1, Iterator it) {
        super(r1, it);
    }
}
