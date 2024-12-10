package X;

/* renamed from: X.7Cy  reason: invalid class name and case insensitive filesystem */
public final class C143327Cy implements AnonymousClass8B6 {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143327Cy) {
                C143327Cy r5 = (C143327Cy) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, C17880vN.A03(this.A01));
    }

    public C143327Cy(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotShimmer(title=");
        A10.append(this.A01);
        A10.append(", subtitle=");
        return C17900vP.A0B(this.A00, A10);
    }
}
