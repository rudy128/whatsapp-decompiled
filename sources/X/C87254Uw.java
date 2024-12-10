package X;

/* renamed from: X.4Uw  reason: invalid class name and case insensitive filesystem */
public final class C87254Uw {
    public final int A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass4ZN A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C87254Uw(AnonymousClass1E7 r2, AnonymousClass4ZN r3, int i, boolean z, boolean z2, boolean z3) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A05 = z;
        this.A00 = i;
        this.A03 = z2;
        this.A04 = z3;
        this.A02 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87254Uw) {
                C87254Uw r5 = (C87254Uw) obj;
                if (!(C18070vi.A18(this.A01, r5.A01) && this.A05 == r5.A05 && this.A00 == r5.A00 && this.A03 == r5.A03 && this.A04 == r5.A04 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A05) + this.A00) * 31, this.A03), this.A04) + AnonymousClass001.A0k(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantListItem(contact=");
        A10.append(this.A01);
        A10.append(", selected=");
        A10.append(this.A05);
        A10.append(", nameContext=");
        A10.append(this.A00);
        A10.append(", isFirstItem=");
        A10.append(this.A03);
        A10.append(", isLastItem=");
        A10.append(this.A04);
        A10.append(", subtitle=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
