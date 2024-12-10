package X;

/* renamed from: X.08e  reason: invalid class name and case insensitive filesystem */
public final class C013608e extends C03460Ig {
    public int A00;
    public C17820vH A01;

    public C03460Ig A00() {
        return new C013608e(this.A01);
    }

    public void A01(C03460Ig r3) {
        C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C013608e r32 = (C013608e) r3;
        synchronized (C04120Lx.A00) {
            this.A01 = r32.A01;
            this.A00 = r32.A00;
        }
    }

    public C013608e(C17820vH r1) {
        this.A01 = r1;
    }

    public final C17820vH A02() {
        return this.A01;
    }

    public final void A03(C17820vH r1) {
        this.A01 = r1;
    }
}
