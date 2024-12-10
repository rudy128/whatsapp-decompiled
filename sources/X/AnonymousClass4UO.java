package X;

/* renamed from: X.4UO  reason: invalid class name */
public final class AnonymousClass4UO {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UO) {
                AnonymousClass4UO r5 = (AnonymousClass4UO) obj;
                if (!(this.A01 == r5.A01 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass4UO(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WDSButtonState(normal=");
        A10.append(this.A01);
        A10.append(", pressed=");
        A10.append(this.A02);
        A10.append(", disabled=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
