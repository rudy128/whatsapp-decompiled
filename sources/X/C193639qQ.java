package X;

/* renamed from: X.9qQ  reason: invalid class name and case insensitive filesystem */
public final class C193639qQ {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193639qQ) {
                C193639qQ r5 = (C193639qQ) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C193639qQ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HighlightRange(start=");
        A10.append(this.A01);
        A10.append(", end=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
