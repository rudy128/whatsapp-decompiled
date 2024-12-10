package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0aZ  reason: invalid class name and case insensitive filesystem */
public final class C07210aZ extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ AnonymousClass00P A00;

    public C07210aZ(AnonymousClass00P r1) {
        this.A00 = r1;
    }

    public Iterator iterator() {
        return new C06730Zl(this.A00);
    }

    public int size() {
        return this.A00.size();
    }
}
