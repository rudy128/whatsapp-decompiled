package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08K  reason: invalid class name */
public final class AnonymousClass08K extends Snapshot {
    public final Snapshot A00;
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
            int A04 = A04();
            Snapshot snapshot = this.A00;
            if (A04 != snapshot.A04()) {
                A03();
            }
            snapshot.A0G();
            super.A0D();
        }
    }

    public /* bridge */ /* synthetic */ void A0J(AnonymousClass0t4 r2) {
        int i = C05200Qx.A00;
        throw AnonymousClass000.A0n("Cannot modify a state object in a read-only snapshot");
    }

    public AnonymousClass08K(Snapshot snapshot, C06400Ye r4, C22821Di r5, int i) {
        super(r4, i);
        this.A00 = snapshot;
        snapshot.A0F();
        if (r5 != null) {
            C22821Di A0A = snapshot.A0A();
            if (A0A != null) {
                r5 = new C11040jO(r5, A0A);
            }
        } else {
            r5 = snapshot.A0A();
        }
        this.A01 = r5;
    }

    public C22821Di A0A() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ void A0F() {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0G() {
        C04120Lx.A00();
        throw null;
    }

    /* renamed from: A0L */
    public AnonymousClass08K A09(C22821Di r5) {
        int A04 = A04();
        return new AnonymousClass08K(this.A00, A05(), r5, A04);
    }
}
