package X;

/* renamed from: X.34t  reason: invalid class name and case insensitive filesystem */
public final class C688034t implements B5K {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C688034t) && this.A00 == ((C688034t) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C688034t(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GenericEphemeralValues(expiration=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
