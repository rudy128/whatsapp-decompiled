package X;

/* renamed from: X.AdG  reason: case insensitive filesystem */
public final class C21024AdG implements C22388B5r {
    public final C188779hy A00;

    public C21024AdG(C188779hy r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21024AdG) && C18070vi.A18(this.A00, ((C21024AdG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnDeviceSwitchingVerified(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
