package X;

import java.util.Iterator;

/* renamed from: X.0Zn  reason: invalid class name and case insensitive filesystem */
public final class C06750Zn implements Iterator, C18450wR {
    public int A00;
    public final /* synthetic */ C06990aB A01;

    public C06750Zn(C06990aB r1) {
        this.A01 = r1;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01.size());
    }

    public Object next() {
        Object[] A04 = this.A01.A04();
        int i = this.A00;
        this.A00 = i + 1;
        Object obj = A04[i];
        C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return obj;
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
