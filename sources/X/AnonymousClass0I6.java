package X;

/* renamed from: X.0I6  reason: invalid class name */
public final class AnonymousClass0I6 {
    public final int A00;
    public final String A01;

    public AnonymousClass0I6(String str, int i) {
        str.getClass();
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append(", uid: ");
        A10.append(this.A00);
        return A10.toString();
    }
}
