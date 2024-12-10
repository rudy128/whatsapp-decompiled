package X;

/* renamed from: X.6se  reason: invalid class name and case insensitive filesystem */
public final class C135716se {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135716se) {
                C135716se r5 = (C135716se) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A03, C17890vO.A02(this.A02, C17890vO.A02(this.A01, C17880vN.A03(this.A00))));
    }

    public C135716se(String str, String str2, String str3, String str4) {
        C18070vi.A0s(str, str2, str3, str4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineSuggestionResponse(imageUri=");
        A10.append(this.A00);
        A10.append(", intent=");
        A10.append(this.A01);
        A10.append(", prompt=");
        A10.append(this.A02);
        A10.append(", shortPrompt=");
        return C17900vP.A0B(this.A03, A10);
    }
}
