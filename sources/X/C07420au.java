package X;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0au  reason: invalid class name and case insensitive filesystem */
public final class C07420au<K, V> extends AnonymousClass3F0<K> implements ImmutableSet<K>, Collection, C18450wR {
    public final C07340am A00;

    public int A0B() {
        return this.A00.size();
    }

    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public Iterator iterator() {
        return new AnonymousClass086(this.A00.A05());
    }

    public C07420au(C07340am r1) {
        this.A00 = r1;
    }
}
