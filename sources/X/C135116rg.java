package X;

/* renamed from: X.6rg  reason: invalid class name and case insensitive filesystem */
public final class C135116rg {
    public final int A00;
    public final AnonymousClass77S A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135116rg) {
                C135116rg r5 = (C135116rg) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + this.A00;
    }

    public C135116rg(AnonymousClass77S r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyCrosspostEligibilityCheckPayload(enforcedEncryptedUniqueId=");
        A10.append(this.A01);
        A10.append(", expTimeSec=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
