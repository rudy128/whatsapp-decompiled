package X;

/* renamed from: X.0xy  reason: invalid class name and case insensitive filesystem */
public final class C19290xy {
    public final String A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19290xy)) {
            return false;
        }
        return this.A00.equals(((C19290xy) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encoding{name=\"");
        sb.append(this.A00);
        sb.append("\"}");
        return sb.toString();
    }

    public C19290xy(String str) {
        this.A00 = str;
    }
}
