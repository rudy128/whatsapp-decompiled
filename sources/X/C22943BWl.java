package X;

/* renamed from: X.BWl  reason: case insensitive filesystem */
public final class C22943BWl extends C3Y {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22943BWl) && this.A00 == ((C22943BWl) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C22943BWl(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportedConfigurationUpdateRequest(videoQuality=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
