package X;

/* renamed from: X.Bsh  reason: case insensitive filesystem */
public final class C23947Bsh extends C4S {
    public final C4V A00;
    public final DPM A01;

    public C23947Bsh(DPM dpm, C4V c4v) {
        C18070vi.A0d(c4v, 2);
        this.A01 = dpm;
        this.A00 = c4v;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23947Bsh) {
                C23947Bsh bsh = (C23947Bsh) obj;
                if (!C18070vi.A18(this.A01, bsh.A01) || !C18070vi.A18(this.A00, bsh.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NonNull(wireType=");
        A10.append(this.A01);
        A10.append(", value=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
