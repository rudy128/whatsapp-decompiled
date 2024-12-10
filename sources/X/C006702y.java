package X;

import java.util.Iterator;

/* renamed from: X.02y  reason: invalid class name and case insensitive filesystem */
public class C006702y extends AnonymousClass01N implements Iterator {
    public C001300r A00;
    public boolean A01 = true;
    public final /* synthetic */ C001200q A02;

    public C006702y(C001200q r2) {
        this.A02 = r2;
    }

    public void A00(C001300r r3) {
        C001300r r0 = this.A00;
        if (r3 == r0) {
            C001300r r1 = r0.A01;
            this.A00 = r1;
            boolean z = false;
            if (r1 == null) {
                z = true;
            }
            this.A01 = z;
        }
    }

    public boolean hasNext() {
        C001300r r0;
        if (this.A01) {
            r0 = this.A02.A02;
        } else {
            C001300r r02 = this.A00;
            if (r02 == null) {
                return false;
            }
            r0 = r02.A00;
        }
        if (r0 != null) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object next() {
        C001300r r0;
        if (this.A01) {
            this.A01 = false;
            r0 = this.A02.A02;
        } else {
            C001300r r02 = this.A00;
            if (r02 != null) {
                r0 = r02.A00;
            } else {
                r0 = null;
            }
        }
        this.A00 = r0;
        return r0;
    }
}
