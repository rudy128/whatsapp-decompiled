package X;

/* renamed from: X.6zW  reason: invalid class name and case insensitive filesystem */
public final class C139836zW {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139836zW) {
                C139836zW r5 = (C139836zW) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A01), this.A00);
    }

    public C139836zW(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UsernamePinEntryViewState(isInProgress=");
        A10.append(this.A01);
        A10.append(", isError=");
        return C17900vP.A0F(A10, this.A00);
    }

    public C139836zW() {
        this(false, false);
    }
}
