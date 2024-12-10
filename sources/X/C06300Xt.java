package X;

/* renamed from: X.0Xt  reason: invalid class name and case insensitive filesystem */
public final class C06300Xt implements EBT {
    public final int A00;
    public final int A01;
    public final EBT A02;

    public int CB1(int i) {
        int CB1 = this.A02.CB1(i);
        if (i < 0 || i > this.A00 || (CB1 >= 0 && CB1 <= this.A01)) {
            return CB1;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OffsetMapping.originalToTransformed returned invalid mapping: ");
        A10.append(i);
        A10.append(" -> ");
        A10.append(CB1);
        A10.append(" is not in range of transformed text [0, ");
        A10.append(this.A01);
        A10.append(']');
        throw AnonymousClass000.A0m(A10);
    }

    public int CPo(int i) {
        int CPo = this.A02.CPo(i);
        if (i < 0 || i > this.A01 || (CPo >= 0 && CPo <= this.A00)) {
            return CPo;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OffsetMapping.transformedToOriginal returned invalid mapping: ");
        A10.append(i);
        A10.append(" -> ");
        A10.append(CPo);
        A10.append(" is not in range of original text [0, ");
        A10.append(this.A00);
        A10.append(']');
        throw AnonymousClass000.A0m(A10);
    }

    public C06300Xt(EBT ebt, int i, int i2) {
        this.A02 = ebt;
        this.A00 = i;
        this.A01 = i2;
    }
}
