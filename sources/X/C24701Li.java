package X;

/* renamed from: X.1Li  reason: invalid class name and case insensitive filesystem */
public final class C24701Li {
    public int A00;
    public int A01;
    public int A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24701Li) {
                C24701Li r5 = (C24701Li) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObserverCounts(totalCalls=");
        sb.append(this.A01);
        sb.append(", mainThreadCalls=");
        sb.append(this.A00);
        sb.append(", workerThreadCalls=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }
}
