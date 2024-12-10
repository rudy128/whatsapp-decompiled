package X;

/* renamed from: X.CaI  reason: case insensitive filesystem */
public final class C25167CaI {
    public final Object A00;
    public final Runnable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25167CaI) {
                C25167CaI caI = (C25167CaI) obj;
                if (!C18070vi.A18(this.A00, caI.A00) || !C18070vi.A18(this.A01, caI.A01)) {
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

    public C25167CaI(Runnable runnable, Object obj) {
        this.A00 = obj;
        this.A01 = runnable;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubscribeResult(snapshot=");
        A10.append(this.A00);
        A10.append(", cancelToken=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
