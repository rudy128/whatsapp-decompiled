package X;

import java.util.Map;

/* renamed from: X.0ap  reason: invalid class name and case insensitive filesystem */
public class C07370ap<K, V> extends C27302DbY<K, V> implements C17830vI<K, V> {
    public int A00;
    public int A01;
    public C07340am A02;
    public C05180Qv A03;
    public AnonymousClass0EQ A04 = new Object();
    public Object A05;

    public Object put(Object obj, Object obj2) {
        this.A05 = null;
        this.A03 = this.A03.A0T(this, obj, obj2, AnonymousClass001.A0l(obj), 0);
        return this.A05;
    }

    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C05180Qv A0U = this.A03.A0U(this, obj, obj2, AnonymousClass001.A0l(obj), 0);
        if (A0U == null) {
            A0U = C05180Qv.A04;
            C18070vi.A0z(A0U, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A03 = A0U;
        if (size != size()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0EQ] */
    /* renamed from: A01 */
    public C07340am BDO() {
        C05180Qv r2 = this.A03;
        C07340am r1 = this.A02;
        if (r2 != r1.A05()) {
            this.A04 = new Object();
            r1 = new C07340am(r2, size());
        }
        this.A02 = r1;
        return r1;
    }

    public void A04(int i) {
        this.A00 = i;
        this.A01++;
    }

    public void clear() {
        C05180Qv r1 = C05180Qv.A04;
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A03 = r1;
        A04(0);
    }

    public boolean containsKey(Object obj) {
        return this.A03.A0X(obj, AnonymousClass001.A0l(obj), 0);
    }

    public Object get(Object obj) {
        return this.A03.A0W(obj, AnonymousClass001.A0l(obj), 0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.0JI, java.lang.Object] */
    public void putAll(Map map) {
        C07340am r6;
        C07370ap r0;
        if ((!(map instanceof C07340am) || (r6 = (C07340am) map) == null) && (!(map instanceof C07370ap) || (r0 = (C07370ap) map) == null || (r6 = r0.BDO()) == null)) {
            super.putAll(map);
            return;
        }
        ? obj = new Object();
        obj.A00 = 0;
        int size = size();
        C05180Qv r2 = this.A03;
        C05180Qv A052 = r6.A05();
        C18070vi.A0z(A052, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.A03 = r2.A0R(this, A052, obj, 0);
        int size2 = (r6.size() + size) - obj.A00;
        if (size != size2) {
            A04(size2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0EQ] */
    public C07370ap(C07340am r2) {
        this.A02 = r2;
        this.A03 = r2.A05();
        this.A00 = r2.size();
    }

    public final int A00() {
        return this.A01;
    }

    public final C05180Qv A02() {
        return this.A03;
    }

    public final AnonymousClass0EQ A03() {
        return this.A04;
    }

    public final void A05(int i) {
        this.A01 = i;
    }

    public final void A06(AnonymousClass0EQ r1) {
        this.A04 = r1;
    }

    public final void A07(Object obj) {
        this.A05 = obj;
    }

    public Object remove(Object obj) {
        this.A05 = null;
        C05180Qv A0S = this.A03.A0S(this, obj, AnonymousClass001.A0l(obj), 0);
        if (A0S == null) {
            A0S = C05180Qv.A04;
            C18070vi.A0z(A0S, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.A03 = A0S;
        return this.A05;
    }
}
