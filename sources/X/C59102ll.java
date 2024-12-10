package X;

/* renamed from: X.2ll  reason: invalid class name and case insensitive filesystem */
public class C59102ll {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59102ll)) {
            return false;
        }
        C59102ll r4 = (C59102ll) obj;
        return this.A00 == r4.A00 && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        return C17890vO.A02(this.A01, 31) + this.A00;
    }

    public C59102ll(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FileDownloadToken{reportType=");
        A10.append(this.A00);
        A10.append(", fileHash='");
        A10.append(this.A01);
        A10.append('\'');
        return C17890vO.A0b(A10);
    }
}
