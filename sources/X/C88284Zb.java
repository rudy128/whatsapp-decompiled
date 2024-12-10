package X;

/* renamed from: X.4Zb  reason: invalid class name and case insensitive filesystem */
public final class C88284Zb {
    public static final AnonymousClass4PQ A02 = new Object();
    public final int A00;
    public final int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88284Zb) {
                C88284Zb r5 = (C88284Zb) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C88284Zb(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WDSIconStyle(content=");
        A10.append(this.A01);
        A10.append(", background=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C88284Zb() {
        this(0, 0);
    }
}
