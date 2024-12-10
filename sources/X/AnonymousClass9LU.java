package X;

/* renamed from: X.9LU  reason: invalid class name */
public class AnonymousClass9LU extends Exception {
    public int a;
    public String b;

    public AnonymousClass9LU() {
    }

    public AnonymousClass9LU(AnonymousClass9Hf r2) {
        super(r2.j);
        this.a = r2.i;
        this.b = r2.j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error ");
        A10.append(this.a);
        A10.append(" : ");
        return AnonymousClass000.A0y(this.b, A10);
    }
}
