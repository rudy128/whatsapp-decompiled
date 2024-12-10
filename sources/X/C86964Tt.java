package X;

/* renamed from: X.4Tt  reason: invalid class name and case insensitive filesystem */
public final class C86964Tt {
    public final int A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86964Tt) {
                C86964Tt r8 = (C86964Tt) obj;
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

    public C86964Tt(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BubbleInflationInfo(inflationTimeMs=");
        A10.append(this.A01);
        A10.append(", messageType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
