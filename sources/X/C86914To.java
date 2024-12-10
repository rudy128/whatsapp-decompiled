package X;

/* renamed from: X.4To  reason: invalid class name and case insensitive filesystem */
public final class C86914To {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86914To) {
                C86914To r5 = (C86914To) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A00) + this.A01.hashCode();
    }

    public C86914To(String str, String str2) {
        C18070vi.A0j(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LanguageItem(language=");
        A10.append(this.A00);
        A10.append(", languageTag=");
        return C17900vP.A0B(this.A01, A10);
    }
}
