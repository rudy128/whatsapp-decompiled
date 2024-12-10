package X;

/* renamed from: X.8gx  reason: invalid class name and case insensitive filesystem */
public final class C167788gx extends C180289Ly {
    public final Long A00;
    public final Long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167788gx) {
                C167788gx r5 = (C167788gx) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A0k(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public C167788gx(Long l, Long l2) {
        this.A01 = l;
        this.A00 = l2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(storageUsage=");
        A10.append(this.A01);
        A10.append(", storageLimit=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
