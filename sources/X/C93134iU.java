package X;

/* renamed from: X.4iU  reason: invalid class name and case insensitive filesystem */
public final class C93134iU implements C107135Yn {
    public final String A00;
    public final boolean A01;

    public boolean Beh(C107135Yn r3) {
        C18070vi.A0d(r3, 0);
        if (!this.A01 || !(r3 instanceof C93124iT) || !C18070vi.A18(this.A00, ((C93124iT) r3).A00)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93134iU) {
                C93134iU r5 = (C93134iU) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3MX.A03(this.A01) + this.A00.hashCode();
    }

    public C93134iU(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ResumeSticky(shouldDisableNonStickyEffects=");
        A10.append(this.A01);
        A10.append(", productSessionId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
