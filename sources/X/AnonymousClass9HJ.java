package X;

/* renamed from: X.9HJ  reason: invalid class name */
public final class AnonymousClass9HJ extends AnonymousClass9HK {
    public final Throwable A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9HJ) {
                AnonymousClass9HJ r5 = (AnonymousClass9HJ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
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

    public AnonymousClass9HJ(Object obj, Throwable th) {
        this.A01 = obj;
        this.A00 = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Exception(request=");
        A10.append(this.A01);
        A10.append(", error=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
