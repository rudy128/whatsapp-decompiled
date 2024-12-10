package X;

/* renamed from: X.DNw  reason: case insensitive filesystem */
public final class C26974DNw implements E6J {
    public final E6J A00;

    public boolean BCK(C24957CRh cRh) {
        return this.A00.BCK(cRh);
    }

    public String toString() {
        String str;
        String obj = this.A00.toString();
        boolean startsWith = obj.startsWith("(");
        StringBuilder A10 = AnonymousClass000.A10();
        if (startsWith) {
            A10.append("[?");
            A10.append(obj);
            str = "]";
        } else {
            A10.append("[?(");
            A10.append(obj);
            str = ")]";
        }
        return AnonymousClass000.A0y(str, A10);
    }

    public C26974DNw(E6J e6j) {
        this.A00 = e6j;
    }

    public C26974DNw() {
    }
}
