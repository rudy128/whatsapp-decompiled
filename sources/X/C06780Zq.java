package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.0Zq  reason: invalid class name and case insensitive filesystem */
public final class C06780Zq implements Iterator, C18450wR {
    public int A00;
    public final int A01;
    public final C06390Yd A02;
    public final int A03;

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A03);
    }

    public /* bridge */ /* synthetic */ Object next() {
        C06390Yd r3 = this.A02;
        int A022 = r3.A02();
        int i = this.A01;
        if (A022 == i) {
            int i2 = this.A00;
            this.A00 = AnonymousClass000.A0S(r3.A0G(), i2) + i2;
            return new C06380Yc(r3, i2, i);
        }
        throw new ConcurrentModificationException();
    }

    public C06780Zq(C06390Yd r2, int i, int i2) {
        this.A02 = r2;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = r2.A02();
        if (r2.A0E()) {
            throw new ConcurrentModificationException();
        }
    }

    public void remove() {
        throw AnonymousClass000.A12();
    }
}
