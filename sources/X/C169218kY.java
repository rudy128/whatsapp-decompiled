package X;

/* renamed from: X.8kY  reason: invalid class name and case insensitive filesystem */
public final class C169218kY extends AnonymousClass9M5 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C169218kY) && this.A00 == ((C169218kY) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C169218kY(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(errorCode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
