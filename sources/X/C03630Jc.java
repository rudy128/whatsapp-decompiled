package X;

/* renamed from: X.0Jc  reason: invalid class name and case insensitive filesystem */
public final class C03630Jc {
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C03630Jc) {
                long j = this.A01;
                C03630Jc r8 = (C03630Jc) obj;
                long j2 = r8.A01;
                C02540Ek r0 = C05100Qk.A06;
                if (!(j == j2 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass001.A0I(this.A01));
    }

    public C03630Jc(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectionColors(selectionHandleColor=");
        AnonymousClass000.A1F(A10, this.A01);
        A10.append(", selectionBackgroundColor=");
        return AnonymousClass001.A1F(C05100Qk.A08(this.A00), A10);
    }
}
