package X;

/* renamed from: X.9AQ  reason: invalid class name */
public final class AnonymousClass9AQ extends AnonymousClass9Mn {
    public final long A00;
    public final String A01;

    public AnonymousClass9AQ(long j, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9AQ) {
                AnonymousClass9AQ r8 = (AnonymousClass9AQ) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A01, AnonymousClass8BV.A00(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorCode=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        return C17900vP.A0B(this.A01, A10);
    }
}
