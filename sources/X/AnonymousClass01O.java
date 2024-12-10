package X;

import java.util.Iterator;

/* renamed from: X.01O  reason: invalid class name */
public abstract class AnonymousClass01O extends AnonymousClass01N implements Iterator {
    public C001300r A00;
    public C001300r A01;

    public abstract C001300r A01(C001300r r1);

    public abstract C001300r A02(C001300r r1);

    public void A00(C001300r r3) {
        C001300r r0;
        C001300r r1 = this.A00;
        if (r1 == r3 && r3 == this.A01) {
            r1 = null;
            this.A01 = null;
            this.A00 = null;
        }
        if (r1 == r3) {
            r1 = A01(r1);
            this.A00 = r1;
        }
        C001300r r02 = this.A01;
        if (r02 == r3) {
            if (r02 == r1 || r1 == null) {
                r0 = null;
            } else {
                r0 = A02(r02);
            }
            this.A01 = r0;
        }
    }

    public boolean hasNext() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        C001300r r0;
        C001300r r1 = this.A01;
        C001300r r02 = this.A00;
        if (r1 == r02 || r02 == null) {
            r0 = null;
        } else {
            r0 = A02(r1);
        }
        this.A01 = r0;
        return r1;
    }
}
