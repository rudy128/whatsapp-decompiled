package X;

/* renamed from: X.6qi  reason: invalid class name and case insensitive filesystem */
public final class C134516qi {
    public final String A00;
    public final String A01;

    public C134516qi(String str, String str2) {
        C18070vi.A0d(str2, 3);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134516qi) {
                C134516qi r5 = (C134516qi) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A00, (C17880vN.A03(this.A01) + 69775676) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Params(query=");
        A10.append(this.A01);
        A10.append(", capability=");
        A10.append("IMAGE");
        A10.append(", imagineContextId=");
        return C17900vP.A0B(this.A00, A10);
    }
}
