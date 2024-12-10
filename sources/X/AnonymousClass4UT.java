package X;

/* renamed from: X.4UT  reason: invalid class name */
public final class AnonymousClass4UT {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1E7 A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UT) {
                AnonymousClass4UT r5 = (AnonymousClass4UT) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17880vN.A03(this.A03), this.A01), this.A00));
    }

    public AnonymousClass4UT(AnonymousClass1E7 r1, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = z;
        this.A00 = z2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AdhocParticipantItemRow(name=");
        A10.append(this.A03);
        A10.append(", isSelected=");
        A10.append(this.A01);
        A10.append(", isEnabled=");
        A10.append(this.A00);
        A10.append(", contact=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
