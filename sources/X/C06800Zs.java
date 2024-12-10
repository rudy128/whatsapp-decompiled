package X;

import java.util.Iterator;

/* renamed from: X.0Zs  reason: invalid class name and case insensitive filesystem */
public abstract class C06800Zs implements Iterator, C18450wR {
    public int A00;
    public int A01;
    public Object[] A02 = C05180Qv.A04.A02;

    public final void A06(Object[] objArr, int i) {
        A07(objArr, i, 0);
    }

    public final boolean A09() {
        return this.A01 < this.A02.length;
    }

    public final C05180Qv A01() {
        Object obj = this.A02[this.A01];
        C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C05180Qv) obj;
    }

    public final Object A02() {
        return this.A02[this.A01];
    }

    public final void A03() {
        this.A01 += 2;
    }

    public final void A04() {
        this.A01++;
    }

    public final void A07(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean A08() {
        return AnonymousClass000.A1U(this.A01, this.A00);
    }

    public final int A00() {
        return this.A01;
    }

    public final Object[] A0A() {
        return this.A02;
    }

    public boolean hasNext() {
        return A08();
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }

    public final void A05(int i) {
        this.A01 = i;
    }
}
