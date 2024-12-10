package X;

/* renamed from: X.6Pk  reason: invalid class name */
public final class AnonymousClass6Pk extends AnonymousClass6U7 {
    public final C27881Xz A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6Pk) {
                AnonymousClass6Pk r5 = (AnonymousClass6Pk) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17900vP.A00(this.A01) * 31);
    }

    public AnonymousClass6Pk(C27881Xz r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextButton(text=");
        A10.append(this.A01);
        A10.append(", buttonVariant=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass6Pk() {
        this(C27881Xz.TONAL, (String) null);
    }
}
