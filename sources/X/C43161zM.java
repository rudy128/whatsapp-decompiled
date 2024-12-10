package X;

/* renamed from: X.1zM  reason: invalid class name and case insensitive filesystem */
public final class C43161zM extends C43151zL {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C43161zM) && Float.compare(this.A00, ((C43161zM) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Small(strokeWidth=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C43161zM(float f) {
        super(2131169498);
        this.A00 = f;
    }
}
