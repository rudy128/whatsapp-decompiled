package X;

/* renamed from: X.4FL  reason: invalid class name */
public final class AnonymousClass4FL {
    public C18090vk A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FL) {
                AnonymousClass4FL r5 = (AnonymousClass4FL) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass3MX.A03(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewArchivedSubgroupsUiState(expanded=");
        A10.append(this.A01);
        A10.append(", onClick=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
