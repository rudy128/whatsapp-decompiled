package X;

/* renamed from: X.965  reason: invalid class name */
public final class AnonymousClass965 extends AnonymousClass9MY {
    public final C188449hR A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass965) {
                AnonymousClass965 r5 = (AnonymousClass965) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17880vN.A03(this.A01));
    }

    public AnonymousClass965(C188449hR r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactFound(upiNumber=");
        A10.append(this.A01);
        A10.append(", data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
