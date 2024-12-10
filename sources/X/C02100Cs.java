package X;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
public final class C02100Cs {
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final void A00(float f, float f2, float f3, float f4) {
        this.A01 = Math.max(f, this.A01);
        this.A03 = Math.max(f2, this.A03);
        this.A02 = Math.min(f3, this.A02);
        this.A00 = Math.min(f4, this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MutableRect(");
        C02460Ec.A00(A10, this.A01);
        A10.append(", ");
        C02460Ec.A00(A10, this.A03);
        A10.append(", ");
        C02460Ec.A00(A10, this.A02);
        A10.append(", ");
        C02460Ec.A00(A10, this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
