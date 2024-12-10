package X;

/* renamed from: X.4TB  reason: invalid class name */
public final class AnonymousClass4TB {
    public final AnonymousClass1E7 A00;
    public final String A01;

    public AnonymousClass4TB(AnonymousClass1E7 r2, String str) {
        C18070vi.A0d(r2, 2);
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TB) {
                AnonymousClass4TB r5 = (AnonymousClass4TB) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupChatUiState(groupName=");
        A10.append(this.A01);
        A10.append(", contact=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
