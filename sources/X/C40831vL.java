package X;

/* renamed from: X.1vL  reason: invalid class name and case insensitive filesystem */
public final class C40831vL {
    public final long A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C40831vL) && this.A00 == ((C40831vL) obj).A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timestamp(timeInMillis=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public C40831vL(long j) {
        this.A00 = j;
    }
}
