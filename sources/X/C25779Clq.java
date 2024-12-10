package X;

/* renamed from: X.Clq  reason: case insensitive filesystem */
public final class C25779Clq {
    public static final C25779Clq A02 = new C25779Clq(C26054CrP.A02(0), C26054CrP.A02(0));
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25779Clq) {
                long j = this.A00;
                C25779Clq clq = (C25779Clq) obj;
                long j2 = clq.A00;
                C25759ClU[] clUArr = C26130Cst.A02;
                if (!(j == j2 && this.A01 == clq.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        C25759ClU[] clUArr = C26130Cst.A02;
        return AnonymousClass001.A0J(this.A01, AnonymousClass8BV.A00(j));
    }

    public C25779Clq(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextIndent(firstLine=");
        A10.append(C26130Cst.A01(this.A00));
        A10.append(", restLine=");
        return AnonymousClass001.A1F(C26130Cst.A01(this.A01), A10);
    }
}
