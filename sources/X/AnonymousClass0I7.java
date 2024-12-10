package X;

/* renamed from: X.0I7  reason: invalid class name */
public class AnonymousClass0I7 {
    public final Object A00;
    public final String A01;

    public AnonymousClass0I7(Object obj, String str) {
        this.A00 = obj;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[");
        A10.append(this.A01);
        A10.append(", ");
        A10.append(C05110Ql.A07(this.A00.getClass()));
        return AnonymousClass000.A0z(A10);
    }
}
