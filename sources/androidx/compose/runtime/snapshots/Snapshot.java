package androidx.compose.runtime.snapshots;

import X.AnonymousClass000;
import X.AnonymousClass0N4;
import X.AnonymousClass0t4;
import X.C05200Qx;
import X.C06400Ye;
import X.C22821Di;

public abstract class Snapshot {
    public int A00;
    public int A01;
    public C06400Ye A02;
    public boolean A03;

    public int A08() {
        return 0;
    }

    public abstract Snapshot A09(C22821Di r1);

    public abstract C22821Di A0A();

    public abstract C22821Di A0B();

    public void A0D() {
        this.A03 = true;
        synchronized (C05200Qx.A08) {
            int i = this.A01;
            if (i >= 0) {
                C05200Qx.A0T(i);
                this.A01 = -1;
            }
        }
    }

    public abstract void A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0J(AnonymousClass0t4 r1);

    public abstract boolean A0K();

    public Snapshot A02() {
        AnonymousClass0N4 r1 = C05200Qx.A05;
        Snapshot snapshot = (Snapshot) r1.A01();
        r1.A02(this);
        return snapshot;
    }

    public final void A03() {
        synchronized (C05200Qx.A08) {
            A0C();
            A0E();
        }
    }

    public void A0E() {
        int i = this.A01;
        if (i >= 0) {
            C05200Qx.A0T(i);
            this.A01 = -1;
        }
    }

    public void A0I(int i) {
        throw AnonymousClass000.A0n("Updating write count is not supported for this snapshot");
    }

    public /* synthetic */ Snapshot(C06400Ye r2, int i) {
        int i2;
        this.A02 = r2;
        this.A00 = i;
        if (i != 0) {
            i2 = C05200Qx.A00(A05(), i);
        } else {
            i2 = -1;
        }
        this.A01 = i2;
    }

    public int A04() {
        return this.A00;
    }

    public C06400Ye A05() {
        return this.A02;
    }

    public void A0C() {
        C05200Qx.A04 = C05200Qx.A04.A08(A04());
    }

    public void A06(int i) {
        this.A00 = i;
    }

    public void A07(C06400Ye r1) {
        this.A02 = r1;
    }
}
