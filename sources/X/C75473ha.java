package X;

/* renamed from: X.3ha  reason: invalid class name and case insensitive filesystem */
public final class C75473ha extends AnonymousClass4E3 {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C75473ha) {
                C75473ha r8 = (C75473ha) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(this.A00) * 31) + this.A01.hashCode();
    }

    public C75473ha(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorCode=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A01, A10);
    }
}
