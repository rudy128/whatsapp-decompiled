package X;

/* renamed from: X.4TQ  reason: invalid class name */
public final class AnonymousClass4TQ {
    public final C86974Tu A00;
    public final AnonymousClass206 A01;

    public AnonymousClass4TQ(C86974Tu r2, AnonymousClass206 r3) {
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TQ) {
                AnonymousClass4TQ r5 = (AnonymousClass4TQ) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass001.A0k(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PinnedMessagesUiState(message=");
        A10.append(this.A01);
        A10.append(", pinData=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
