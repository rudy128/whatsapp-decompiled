package X;

/* renamed from: X.Cls  reason: case insensitive filesystem */
public final class C25781Cls {
    public static final C25781Cls A02 = new C25781Cls(0, 0);
    public final long A00;
    public final long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25781Cls cls = (C25781Cls) obj;
            if (!(this.A01 == cls.A01 && this.A00 == cls.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public C25781Cls(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[timeUs=");
        A10.append(this.A01);
        A10.append(", position=");
        A10.append(this.A00);
        return AnonymousClass000.A0z(A10);
    }
}
