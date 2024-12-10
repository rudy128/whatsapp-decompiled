package X;

/* renamed from: X.4FK  reason: invalid class name */
public final class AnonymousClass4FK {
    public int A00;
    public C18090vk A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4FK) {
                AnonymousClass4FK r5 = (AnonymousClass4FK) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewAllSubgroupsUiState(extraGroupsCount=");
        A10.append(this.A00);
        A10.append(", onClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
