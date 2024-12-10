package X;

/* renamed from: X.CaQ  reason: case insensitive filesystem */
public final class C25174CaQ {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25174CaQ) {
                C25174CaQ caQ = (C25174CaQ) obj;
                if (!(this.A01 == caQ.A01 && this.A00 == caQ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass8BV.A00(this.A01));
    }

    public C25174CaQ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArgoLocationValue(line=");
        A10.append(this.A01);
        A10.append(", column=");
        return C17900vP.A0E(A10, this.A00);
    }
}
