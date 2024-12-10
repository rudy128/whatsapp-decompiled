package X;

/* renamed from: X.6qp  reason: invalid class name and case insensitive filesystem */
public final class C134586qp {
    public int A00 = 0;
    public long A01 = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134586qp) {
                C134586qp r8 = (C134586qp) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(this.A01) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnsentSessionBackOffData(lastRetryTimeStamp=");
        A10.append(this.A01);
        A10.append(", retryCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
