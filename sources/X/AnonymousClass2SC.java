package X;

/* renamed from: X.2SC  reason: invalid class name */
public class AnonymousClass2SC {
    public int A00;
    public AnonymousClass1BI A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2SC r5 = (AnonymousClass2SC) obj;
            if (this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A01);
        A10.append(" ");
        return C17880vN.A0t(A10, this.A00);
    }
}
