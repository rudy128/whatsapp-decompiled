package X;

/* renamed from: X.08f  reason: invalid class name and case insensitive filesystem */
public final class C013708f extends C03460Ig {
    public int A00;
    public int A01;
    public C17800vF A02;

    public C03460Ig A00() {
        return new C013708f(this.A02);
    }

    public void A01(C03460Ig r3) {
        synchronized (C04110Lw.A00) {
            C18070vi.A0z(r3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            C013708f r32 = (C013708f) r3;
            this.A02 = r32.A02;
            this.A00 = r32.A00;
            this.A01 = r32.A01;
        }
    }

    public C013708f(C17800vF r1) {
        this.A02 = r1;
    }

    public final C17800vF A02() {
        return this.A02;
    }

    public final void A03(C17800vF r1) {
        this.A02 = r1;
    }
}
