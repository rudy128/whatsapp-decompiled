package X;

/* renamed from: X.4VC  reason: invalid class name */
public final class AnonymousClass4VC {
    public final C87174Uo A00;
    public final AnonymousClass1E7 A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VC) {
                AnonymousClass4VC r5 = (AnonymousClass4VC) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.A03;
        return AnonymousClass000.A0O(this.A00, (((((AnonymousClass000.A0N(bool, (((AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A04)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A06)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A05)) * 31);
    }

    public AnonymousClass4VC(C87174Uo r1, AnonymousClass1E7 r2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2) {
        this.A01 = r2;
        this.A04 = bool;
        this.A07 = str;
        this.A03 = bool2;
        this.A06 = str2;
        this.A02 = bool3;
        this.A05 = bool4;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactInfoUiState(contact=");
        A10.append(this.A01);
        A10.append(", shouldShowAsVerified=");
        A10.append(this.A04);
        A10.append(", titleText=");
        A10.append(this.A07);
        A10.append(", setTitleTextMessageYourself=");
        A10.append(this.A03);
        A10.append(", pushName=");
        A10.append(this.A06);
        A10.append(", isChatPSAJid=");
        A10.append(this.A02);
        A10.append(", shouldShowBusinessLayout=");
        A10.append(this.A05);
        A10.append(", encryptionInfoViewState=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
