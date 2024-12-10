package X;

/* renamed from: X.1Ha  reason: invalid class name and case insensitive filesystem */
public final class C23631Ha extends C19880zA {
    public static final long serialVersionUID = 0;
    public final Object reference;

    public boolean equals(Object obj) {
        if (obj instanceof C23631Ha) {
            return this.reference.equals(((C23631Ha) obj).reference);
        }
        return false;
    }

    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.reference);
        sb.append(")");
        return sb.toString();
    }

    public C23631Ha(Object obj) {
        this.reference = obj;
    }
}
