package X;

public class C6R {
    public A5W A00;
    public String A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C6R) obj).A01);
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A01, AnonymousClass3MW.A1a(), 0);
    }
}
