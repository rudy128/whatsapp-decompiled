package X;

/* renamed from: X.6r7  reason: invalid class name and case insensitive filesystem */
public final class C134766r7 {
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134766r7) {
                C134766r7 r5 = (C134766r7) obj;
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

    public C134766r7(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OptionData(mediaQuality=");
        A10.append(this.A00);
        A10.append(", title=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
