package X;

/* renamed from: X.4U3  reason: invalid class name */
public final class AnonymousClass4U3 {
    public final A2B A00;
    public final C22821Di A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4U3) {
                AnonymousClass4U3 r5 = (AnonymousClass4U3) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A00), this.A02));
    }

    public AnonymousClass4U3(A2B a2b, C22821Di r2, boolean z) {
        C72473Md.A1I(a2b, r2);
        this.A00 = a2b;
        this.A02 = z;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ManageSubgroupUiState(subgroup=");
        A10.append(this.A00);
        A10.append(", isHiddenSubgroup=");
        A10.append(this.A02);
        A10.append(", onGroupVisibilityClick=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
