package X;

/* renamed from: X.6rw  reason: invalid class name and case insensitive filesystem */
public final class C135276rw {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135276rw) {
                C135276rw r5 = (C135276rw) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A02);
    }

    public C135276rw(Integer num, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FixedCanvasSize(width=");
        A10.append(this.A01);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", maxEdge=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
