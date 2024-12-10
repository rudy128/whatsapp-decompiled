package X;

/* renamed from: X.3mo  reason: invalid class name and case insensitive filesystem */
public final class C76223mo extends AnonymousClass4EA {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76223mo) {
                C76223mo r5 = (C76223mo) obj;
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

    public C76223mo(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Visible(networkStateDrawableRes=");
        A10.append(this.A00);
        A10.append(", networkStateTextResId=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
