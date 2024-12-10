package X;

/* renamed from: X.Cjs  reason: case insensitive filesystem */
public class C25662Cjs {
    public static final C25662Cjs A02 = new C25662Cjs(AnonymousClass00R.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return Float.toString(this.A00);
        }
        if (intValue != 1) {
            return "auto";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A00);
        return AnonymousClass000.A0y("%", A10);
    }

    public C25662Cjs(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
