package X;

/* renamed from: X.4V7  reason: invalid class name */
public final class AnonymousClass4V7 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V7) {
                AnonymousClass4V7 r5 = (AnonymousClass4V7) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A01);
        return ((C17890vO.A02(this.A04, C17890vO.A02(this.A00, C17890vO.A02(this.A02, (C17890vO.A02(this.A03, A032) - 595646709) * 31))) + C17900vP.A00(this.A05)) * 31) + this.A06.hashCode();
    }

    public AnonymousClass4V7(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompleteCreateParam(fbid=");
        A10.append(this.A01);
        A10.append(", personaVersionId=");
        A10.append(this.A03);
        A10.append(", audience=");
        A10.append("ONLY_ME");
        A10.append(", name=");
        A10.append(this.A02);
        A10.append(", description=");
        A10.append(this.A00);
        A10.append(", tagline=");
        A10.append(this.A04);
        A10.append(", updatedImageId=");
        A10.append(this.A05);
        A10.append(", updatedImagePrompt=");
        return C17900vP.A0B(this.A06, A10);
    }
}
