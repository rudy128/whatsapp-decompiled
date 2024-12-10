package X;

/* renamed from: X.7Fl  reason: invalid class name and case insensitive filesystem */
public final class C143957Fl implements C1595584z {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143957Fl) {
                C143957Fl r5 = (C143957Fl) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public C143957Fl(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        return "Youth Consent Required";
    }
}
