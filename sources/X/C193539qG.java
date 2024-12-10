package X;

/* renamed from: X.9qG  reason: invalid class name and case insensitive filesystem */
public final class C193539qG {
    public final AnonymousClass4ZN A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193539qG) {
                C193539qG r5 = (C193539qG) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C193539qG(AnonymousClass4ZN r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A01, 1664021350));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrivacyMessage(templateRes=");
        A10.append(2131888090);
        A10.append(", businessName=");
        A10.append(this.A01);
        A10.append(", postcodeType=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
