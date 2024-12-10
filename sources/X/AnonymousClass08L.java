package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08L  reason: invalid class name */
public final class AnonymousClass08L extends Snapshot {
    public final Snapshot A00;
    public final Snapshot A01;
    public final C22821Di A02;
    public final boolean A03;

    public AnonymousClass08L(Snapshot snapshot, C22821Di r4, boolean z) {
        super(AnonymousClass0EV.A00(), 0);
        this.A00 = snapshot;
        this.A03 = z;
        C22821Di A0A = snapshot.A0A();
        this.A02 = C05200Qx.A0P(r4, A0A == null ? ((Snapshot) C05200Qx.A09.get()).A0A() : A0A, false);
        this.A01 = this;
    }

    public void A0D() {
        Snapshot snapshot;
        this.A03 = true;
        if (this.A03 && (snapshot = this.A00) != null) {
            snapshot.A0D();
        }
    }

    public static Snapshot A00(AnonymousClass08L r0) {
        Snapshot snapshot = r0.A00;
        if (snapshot == null) {
            return (Snapshot) C05200Qx.A09.get();
        }
        return snapshot;
    }

    public int A04() {
        return A00(this).A04();
    }

    public C06400Ye A05() {
        return A00(this).A05();
    }

    public Snapshot A09(C22821Di r4) {
        return C05200Qx.A04(A00(this).A09((C22821Di) null), C05200Qx.A0P(r4, A0A(), true), true);
    }

    public C22821Di A0A() {
        return this.A02;
    }

    public C22821Di A0B() {
        return null;
    }

    public /* bridge */ /* synthetic */ void A0F() {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0G() {
        C04120Lx.A00();
        throw null;
    }

    public void A0H() {
        A00(this).A0H();
    }

    public void A0J(AnonymousClass0t4 r2) {
        A00(this).A0J(r2);
    }

    public boolean A0K() {
        return A00(this).A0K();
    }
}
