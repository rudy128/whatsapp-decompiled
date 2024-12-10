package X;

/* renamed from: X.3hj  reason: invalid class name and case insensitive filesystem */
public final class C75563hj extends AnonymousClass4E4 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C75563hj) && this.A00 == ((C75563hj) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C75563hj(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Local(drawableRes=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
