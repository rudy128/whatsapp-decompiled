package X;

/* renamed from: X.4TI  reason: invalid class name */
public final class AnonymousClass4TI {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TI) {
                AnonymousClass4TI r5 = (AnonymousClass4TI) obj;
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

    public AnonymousClass4TI(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SuggestionsListData(titleStringId=");
        A10.append(this.A01);
        A10.append(", count=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
