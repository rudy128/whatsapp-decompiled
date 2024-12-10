package X;

public final class BR8 extends C3B {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BR8) {
                BR8 br8 = (BR8) obj;
                if (!C18070vi.A18(this.A01, br8.A01) || !C18070vi.A18(this.A00, br8.A00)) {
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

    public BR8(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarGenerationError(requestId=");
        A10.append(this.A01);
        A10.append(", error=");
        return C17900vP.A0B(this.A00, A10);
    }
}
