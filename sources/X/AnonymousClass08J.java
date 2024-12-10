package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08J  reason: invalid class name */
public final class AnonymousClass08J extends Snapshot {
    public int A00 = 1;
    public final C22821Di A01;

    public C22821Di A0B() {
        return null;
    }

    public void A0H() {
    }

    public boolean A0K() {
        return true;
    }

    public void A0D() {
        if (!this.A03) {
            A0G();
            super.A0D();
        }
    }

    public void A0F() {
        this.A00++;
    }

    public void A0G() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            A03();
        }
    }

    public void A0J(AnonymousClass0t4 r2) {
        int i = C05200Qx.A00;
        throw AnonymousClass000.A0n("Cannot modify a state object in a read-only snapshot");
    }

    public AnonymousClass08J(C06400Ye r2, C22821Di r3, int i) {
        super(r2, i);
        this.A01 = r3;
    }

    public Snapshot A09(C22821Di r4) {
        C05200Qx.A0U(this);
        return new AnonymousClass08K(this, A05(), r4, A04());
    }

    public C22821Di A0A() {
        return this.A01;
    }
}
