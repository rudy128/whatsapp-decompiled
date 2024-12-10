package X;

/* renamed from: X.2kl  reason: invalid class name and case insensitive filesystem */
public class C58482kl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C58482kl r4 = (C58482kl) obj;
            if (this.A00 == r4.A00) {
                return C42171xk.A00(this.A02, r4.A02);
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A0l(this.A02);
    }

    public C58482kl(Object obj, int i, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
