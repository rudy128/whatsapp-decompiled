package X;

/* renamed from: X.4V1  reason: invalid class name */
public final class AnonymousClass4V1 {
    public final Integer A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V1) {
                AnonymousClass4V1 r5 = (AnonymousClass4V1) obj;
                if (this.A04 != r5.A04 || this.A05 != r5.A05 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A04) * 31, this.A05) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public AnonymousClass4V1(Integer num, Integer num2, Long l, String str, boolean z, boolean z2) {
        this.A04 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A02 = l;
        this.A01 = num;
        this.A00 = num2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubtitleUiState(isGroupAdderAContact=");
        A10.append(this.A04);
        A10.append(", groupType=");
        A10.append(0);
        A10.append(", isGroupCreatorMe=");
        A10.append(this.A05);
        A10.append(", creatorName=");
        A10.append(this.A03);
        A10.append(", createdDateMillis=");
        A10.append(this.A02);
        A10.append(", numMembers=");
        A10.append(this.A01);
        A10.append(", numContactMembers=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
