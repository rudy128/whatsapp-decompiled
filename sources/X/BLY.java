package X;

import android.os.Bundle;

public class BLY extends AnonymousClass1DT implements E0J {
    public AnonymousClass1F9 A00;
    public C26622D6q A01;
    public C24494C6m A02;
    public final Bundle A03;
    public final C24494C6m A04;

    public void A07() {
        C24494C6m c6m = this.A04;
        c6m.A06 = true;
        c6m.A05 = false;
        c6m.A02 = false;
        c6m.A02();
    }

    public void A08() {
        C24494C6m c6m = this.A04;
        c6m.A06 = false;
        c6m.A03();
    }

    public C24494C6m A0G(boolean z) {
        C24494C6m c6m = this.A04;
        c6m.A00();
        c6m.A02 = true;
        C26622D6q d6q = this.A01;
        if (d6q != null) {
            A0D(d6q);
            if (z && d6q.A00) {
                d6q.A01.Bx8();
            }
        }
        E0J e0j = c6m.A01;
        if (e0j == null) {
            throw AnonymousClass000.A0n("No listener register");
        } else if (e0j == this) {
            c6m.A01 = null;
            if ((d6q == null || d6q.A00) && !z) {
                return c6m;
            }
            c6m.A01();
            c6m.A05 = true;
            c6m.A06 = false;
            c6m.A02 = false;
            c6m.A03 = false;
            c6m.A04 = false;
            return this.A02;
        } else {
            throw AnonymousClass000.A0k("Attempting to unregister the wrong listener");
        }
    }

    public void A0H() {
        AnonymousClass1F9 r1 = this.A00;
        C26622D6q d6q = this.A01;
        if (r1 != null && d6q != null) {
            super.A0D(d6q);
            A0A(r1, d6q);
        }
    }

    public String toString() {
        StringBuilder A0t = BE6.A0t(64);
        BEA.A1K(this, "LoaderInfo{", A0t);
        BE8.A1F(A0t, " #");
        A0t.append(" : ");
        C7M.A00(this.A04, A0t);
        return AnonymousClass000.A0y("}}", A0t);
    }

    public BLY(Bundle bundle, C24494C6m c6m, C24494C6m c6m2) {
        this.A03 = bundle;
        this.A04 = c6m;
        this.A02 = c6m2;
        if (c6m.A01 == null) {
            c6m.A01 = this;
            return;
        }
        throw AnonymousClass000.A0n("There is already a listener registered");
    }

    public void A0D(C22851Dl r2) {
        super.A0D(r2);
        this.A00 = null;
        this.A01 = null;
    }

    public void A0F(Object obj) {
        super.A0F(obj);
        C24494C6m c6m = this.A02;
        if (c6m != null) {
            c6m.A01();
            c6m.A05 = true;
            c6m.A06 = false;
            c6m.A02 = false;
            c6m.A03 = false;
            c6m.A04 = false;
            this.A02 = null;
        }
    }
}
