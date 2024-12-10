package X;

/* renamed from: X.Ckq  reason: case insensitive filesystem */
public final class C25720Ckq {
    public static final C25720Ckq A02 = new C25720Ckq(1);
    public C24757CIu A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((C25720Ckq) obj).A01;
        }
        return true;
    }

    public C25720Ckq(int i) {
        this.A01 = i;
    }

    public int hashCode() {
        return (((506447 + this.A01) * 31) + 1) * 31;
    }
}
