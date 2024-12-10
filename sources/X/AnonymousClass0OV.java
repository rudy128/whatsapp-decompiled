package X;

/* renamed from: X.0OV  reason: invalid class name */
public final class AnonymousClass0OV {
    public final int A00;
    public final long A01;
    public final C24245By3 A02;

    public static final AnonymousClass0OV A01(C24245By3 by3, int i, long j) {
        return new AnonymousClass0OV(by3, i, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0OV) {
                AnonymousClass0OV r8 = (AnonymousClass0OV) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A01, (AnonymousClass000.A0L(this.A02) + this.A00) * 31);
    }

    public AnonymousClass0OV(C24245By3 by3, int i, long j) {
        this.A02 = by3;
        this.A00 = i;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnchorInfo(direction=");
        A10.append(this.A02);
        A10.append(", offset=");
        A10.append(this.A00);
        A10.append(", selectableId=");
        A10.append(this.A01);
        return AnonymousClass001.A1J(A10);
    }
}
