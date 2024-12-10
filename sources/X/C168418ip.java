package X;

/* renamed from: X.8ip  reason: invalid class name and case insensitive filesystem */
public final class C168418ip extends AnonymousClass9M2 {
    public final Object A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168418ip) {
                C168418ip r5 = (C168418ip) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C168418ip(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(request=");
        A10.append(this.A00);
        A10.append(", response=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
