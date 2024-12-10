package X;

/* renamed from: X.3K3  reason: invalid class name */
public final class AnonymousClass3K3 extends AnonymousClass3BW {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass3K3) {
            return this.reference.equals(((AnonymousClass3K3) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public AnonymousClass3K3(Object obj) {
        this.reference = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Optional.of(");
        A10.append(this.reference);
        return AnonymousClass000.A0y(")", A10);
    }
}
