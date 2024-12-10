package X;

/* renamed from: X.4Tq  reason: invalid class name and case insensitive filesystem */
public final class C86934Tq {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86934Tq) {
                C86934Tq r8 = (C86934Tq) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, AnonymousClass000.A0I(this.A00) * 31);
    }

    public C86934Tq(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Point(x=");
        A10.append(this.A00);
        A10.append(", y=");
        return C17900vP.A0E(A10, this.A01);
    }
}
