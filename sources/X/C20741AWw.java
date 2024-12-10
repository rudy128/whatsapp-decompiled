package X;

/* renamed from: X.AWw  reason: case insensitive filesystem */
public final class C20741AWw implements B5N {
    public final C193139pb A00;
    public final Long A01;
    public final Long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20741AWw) {
                C20741AWw aWw = (C20741AWw) obj;
                if (!C18070vi.A18(this.A00, aWw.A00) || !C18070vi.A18(this.A01, aWw.A01) || !C18070vi.A18(this.A02, aWw.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public C20741AWw(C193139pb r1, Long l, Long l2) {
        this.A00 = r1;
        this.A01 = l;
        this.A02 = l2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Exists(credentialId=");
        A10.append(this.A00);
        A10.append(", creationTimeMillis=");
        A10.append(this.A01);
        A10.append(", lastUsedTimeMillis=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
