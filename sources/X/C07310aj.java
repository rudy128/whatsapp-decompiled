package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;

/* renamed from: X.0aj  reason: invalid class name and case insensitive filesystem */
public final class C07310aj<K, V> extends C19790z0<V> implements ImmutableCollection<V>, C18450wR {
    public final C07340am A00;

    public int A0B() {
        return this.A00.size();
    }

    public boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    public Iterator iterator() {
        return new AnonymousClass087(this.A00.A05());
    }

    public C07310aj(C07340am r1) {
        this.A00 = r1;
    }
}
