package X;

/* renamed from: X.8og  reason: invalid class name and case insensitive filesystem */
public final class C170068og extends AnonymousClass9MI {
    public final C196189ub A00;
    public final AnonymousClass8oP A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170068og) {
                C170068og r5 = (C170068og) obj;
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

    public C170068og(C196189ub r1, AnonymousClass8oP r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(tokens=");
        A10.append(this.A01);
        A10.append(", loggingTracker=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
