package X;

/* renamed from: X.CqI  reason: case insensitive filesystem */
public final class C26001CqI {
    public static final C26001CqI A02 = new C26001CqI();
    public byte A00;
    public boolean A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C26001CqI)) {
                return false;
            }
            C26001CqI cqI = (C26001CqI) obj;
            if (!(this.A00 == cqI.A00 && this.A01 == cqI.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(new Boolean(this.A01), new Byte(this.A00).hashCode());
    }

    public C26001CqI(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C26001CqI() {
        this.A00 = 3;
        this.A01 = true;
    }
}
