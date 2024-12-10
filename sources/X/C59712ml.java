package X;

/* renamed from: X.2ml  reason: invalid class name and case insensitive filesystem */
public final class C59712ml {
    public int A00 = 0;
    public int A01 = 0;
    public long A02 = 0;
    public String A03 = "";
    public boolean A04 = false;
    public boolean A05 = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59712ml) {
                C59712ml r8 = (C59712ml) obj;
                if (!(this.A01 == r8.A01 && this.A02 == r8.A02 && C18070vi.A18(this.A03, r8.A03) && this.A04 == r8.A04 && this.A05 == r8.A05 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(C17890vO.A02(this.A03, AnonymousClass001.A0K(this.A02, this.A01 * 31)), this.A04), this.A05) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupTrustSignalInfo(knownContacts=");
        A10.append(this.A01);
        A10.append(", sortTimestamp=");
        A10.append(this.A02);
        A10.append(", displayName=");
        A10.append(this.A03);
        A10.append(", isAdmin=");
        A10.append(this.A04);
        A10.append(", isCreatedByMe=");
        A10.append(this.A05);
        A10.append(", groupParticipantsCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
