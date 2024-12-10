package X;

/* renamed from: X.CqG  reason: case insensitive filesystem */
public final class C25999CqG {
    public final C24247By5 A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25999CqG) {
                C25999CqG cqG = (C25999CqG) obj;
                if (!(this.A00 == cqG.A00 && this.A01 == cqG.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A00, 1174926970) + 1231) * 31, this.A01) + 1237;
    }

    public C25999CqG(C24247By5 by5, boolean z) {
        this.A00 = by5;
        this.A01 = z;
    }

    public /* synthetic */ C25999CqG(C24247By5 by5, AnonymousClass1Y1 r4, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(C24247By5.Inherit, false);
    }

    public C25999CqG() {
        this.A00 = C24247By5.Inherit;
        this.A01 = true;
    }
}
