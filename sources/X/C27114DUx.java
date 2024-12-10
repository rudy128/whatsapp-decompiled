package X;

import java.util.Iterator;

/* renamed from: X.DUx  reason: case insensitive filesystem */
public final class C27114DUx implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ DSN A02;

    public C27114DUx() {
    }

    public C27114DUx(DSN dsn) {
        this.A02 = dsn;
        this.A00 = 0;
        this.A01 = dsn.A01();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(((C23271BeL) this.A02).zza[i]);
        }
        throw BE6.A14();
    }

    public final void remove() {
        throw C17880vN.A0y();
    }
}
