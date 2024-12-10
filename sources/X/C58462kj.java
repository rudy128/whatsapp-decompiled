package X;

/* renamed from: X.2kj  reason: invalid class name and case insensitive filesystem */
public class C58462kj {
    public final String A00;
    public final C59482mN A01;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C58462kj)) {
            return false;
        }
        C58462kj r4 = (C58462kj) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }

    public C58462kj(String str, C59482mN r2) {
        this.A00 = str;
        this.A01 = r2;
    }
}
