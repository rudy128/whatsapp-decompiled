package X;

/* renamed from: X.4TJ  reason: invalid class name */
public final class AnonymousClass4TJ {
    public final AnonymousClass206 A00;
    public final C22821Di A01;

    public AnonymousClass4TJ(AnonymousClass206 r2, C22821Di r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TJ) {
                AnonymousClass4TJ r5 = (AnonymousClass4TJ) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommunityActivityUiState(lastActivityMessage=");
        A10.append(this.A00);
        A10.append(", onActivityClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
