package X;

/* renamed from: X.9rv  reason: invalid class name and case insensitive filesystem */
public final class C194559rv {
    public final String A00;
    public final String A01;
    public final long A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194559rv) {
                C194559rv r8 = (C194559rv) obj;
                if (this.A02 != r8.A02 || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass8BV.A00(this.A02) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A00);
    }

    public C194559rv(long j, String str, String str2) {
        this.A02 = j;
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorMessage(errorCode=");
        A10.append(this.A02);
        A10.append(", errorTitle=");
        A10.append(this.A01);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A00, A10);
    }
}
