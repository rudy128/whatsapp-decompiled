package X;

/* renamed from: X.0Je  reason: invalid class name and case insensitive filesystem */
public final class C03650Je {
    public final AnonymousClass0IM A00 = new AnonymousClass0IM();
    public final AnonymousClass0IM A01 = new AnonymousClass0IM();

    public final void A00(AnonymousClass0XV r3) {
        AnonymousClass0IM r1 = this.A00;
        if (r3.A08 != null) {
            r1.A00.remove(r3);
            AnonymousClass0IM r12 = this.A01;
            if (r3.A08 != null) {
                r12.A00.remove(r3);
                return;
            }
            throw AnonymousClass000.A0n("DepthSortedSet.remove called on an unattached node");
        }
        throw AnonymousClass000.A0n("DepthSortedSet.remove called on an unattached node");
    }

    public final void A01(AnonymousClass0XV r3, boolean z) {
        AnonymousClass0IM r1 = this.A00;
        if (!z) {
            if (!r1.A00.contains(r3)) {
                r1 = this.A01;
            } else {
                return;
            }
        }
        if (r3.A08 != null) {
            r1.A00.add(r3);
            return;
        }
        throw AnonymousClass000.A0n("DepthSortedSet.add called on an unattached node");
    }

    public final boolean A02() {
        if (!this.A01.A00.isEmpty() || !this.A00.A00.isEmpty()) {
            return false;
        }
        return true;
    }
}
