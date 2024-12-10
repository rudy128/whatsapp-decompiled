package X;

/* renamed from: X.0Jb  reason: invalid class name */
public final class AnonymousClass0Jb {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0Jb) {
                AnonymousClass0Jb r5 = (AnonymousClass0Jb) obj;
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

    public AnonymousClass0Jb(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i < 0) {
            throw AnonymousClass000.A0k("negative start index");
        } else if (i2 < i) {
            throw AnonymousClass000.A0k("end index greater than start");
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Interval(start=");
        A10.append(this.A01);
        A10.append(", end=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
