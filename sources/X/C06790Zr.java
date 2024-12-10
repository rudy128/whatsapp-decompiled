package X;

import java.util.Iterator;

/* renamed from: X.0Zr  reason: invalid class name and case insensitive filesystem */
public final class C06790Zr implements Iterator, C18450wR {
    public final AnonymousClass08A A00;

    public final void A00(Object obj, Object obj2) {
        this.A00.A06(obj, obj2);
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public void remove() {
        this.A00.remove();
    }

    public C06790Zr(C07370ap r5) {
        C06800Zs[] r2 = new C06800Zs[8];
        int i = 0;
        do {
            r2[i] = new AnonymousClass08F(this);
            i++;
        } while (i < 8);
        this.A00 = new AnonymousClass08A(r5, r2);
    }
}
