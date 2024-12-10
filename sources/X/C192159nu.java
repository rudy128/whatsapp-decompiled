package X;

/* renamed from: X.9nu  reason: invalid class name and case insensitive filesystem */
public class C192159nu {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C192159nu r5 = (C192159nu) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C192159nu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A00;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }
}
