package X;

/* renamed from: X.4hT  reason: invalid class name and case insensitive filesystem */
public final class C92524hT implements C106545Wg {
    public final C99704tK A00;
    public final C92594ha A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C92524hT) {
                C92524hT r5 = (C92524hT) obj;
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

    public C92524hT(C99704tK r1, C92594ha r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(cause=");
        A10.append(this.A00);
        A10.append(", previousEnablingState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
