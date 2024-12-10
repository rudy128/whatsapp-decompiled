package X;

/* renamed from: X.4UX  reason: invalid class name */
public final class AnonymousClass4UX {
    public final AnonymousClass4CT A00;
    public final AnonymousClass4YA A01;
    public final AnonymousClass1EC A02;
    public final C22821Di A03;

    public AnonymousClass4UX(AnonymousClass4CT r2, AnonymousClass4YA r3, AnonymousClass1EC r4, C22821Di r5) {
        C18070vi.A0d(r5, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UX) {
                AnonymousClass4UX r5 = (AnonymousClass4UX) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MemberSuggestedGroupsUiState(parentJid=");
        A10.append(this.A02);
        A10.append(", suggestedGroupsCount=");
        A10.append(this.A01);
        A10.append(", onClick=");
        A10.append(this.A03);
        A10.append(", viewMode=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
