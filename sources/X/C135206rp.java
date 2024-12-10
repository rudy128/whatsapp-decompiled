package X;

/* renamed from: X.6rp  reason: invalid class name and case insensitive filesystem */
public final class C135206rp {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135206rp) {
                C135206rp r5 = (C135206rp) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public C135206rp(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RollingPromptModel(previousIndex=");
        A10.append(this.A01);
        A10.append(", newIndex=");
        A10.append(this.A00);
        A10.append(", prompt=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
