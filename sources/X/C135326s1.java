package X;

/* renamed from: X.6s1  reason: invalid class name and case insensitive filesystem */
public final class C135326s1 {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135326s1) {
                C135326s1 r5 = (C135326s1) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, C17890vO.A02(this.A00, C17880vN.A03(this.A02)));
    }

    public C135326s1(String str, String str2, String str3) {
        C18070vi.A0o(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SearchLinkItem(title=");
        A10.append(this.A02);
        A10.append(", link=");
        A10.append(this.A00);
        A10.append(", thumbnailUrl=");
        return C17900vP.A0B(this.A01, A10);
    }
}
