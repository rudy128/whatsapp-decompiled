package X;

/* renamed from: X.9rl  reason: invalid class name and case insensitive filesystem */
public final class C194459rl {
    public final int A00;
    public final int A01;
    public final int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194459rl) {
                C194459rl r5 = (C194459rl) obj;
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

    public C194459rl(int i, int i2, int i3) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProcessingParameters(round=");
        A10.append(this.A01);
        A10.append(", params=");
        A10.append(this.A00);
        A10.append(", retryCount=");
        return AnonymousClass001.A1L(A10, this.A02);
    }
}
