package X;

/* renamed from: X.4Uz  reason: invalid class name and case insensitive filesystem */
public final class C87284Uz {
    public int A00;
    public final AnonymousClass4CT A01;
    public final C59802mu A02;
    public final AnonymousClass1E7 A03;
    public final AnonymousClass1E7 A04;
    public final AnonymousClass1OS A05;

    public C87284Uz(AnonymousClass4CT r2, C59802mu r3, AnonymousClass1E7 r4, AnonymousClass1E7 r5, AnonymousClass1OS r6, int i) {
        C18070vi.A0d(r2, 4);
        this.A02 = r3;
        this.A00 = i;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87284Uz) {
                C87284Uz r5 = (C87284Uz) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || this.A00 != r5.A00 || !C18070vi.A18(this.A05, r5.A05) || this.A01 != r5.A01 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A05, (AnonymousClass000.A0L(this.A02) + this.A00) * 31))));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(suggestion=");
        A10.append(this.A02);
        A10.append(", subgroupApprovalState=");
        A10.append(this.A00);
        A10.append(", onAction=");
        A10.append(this.A05);
        A10.append(", userView=");
        A10.append(this.A01);
        A10.append(", groupContact=");
        A10.append(this.A04);
        A10.append(", creatorContact=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
