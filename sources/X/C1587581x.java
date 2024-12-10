package X;

/* renamed from: X.81x  reason: invalid class name and case insensitive filesystem */
public final class C1587581x extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $index = 1;

    public C1587581x() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Collection doesn't contain element at index ");
        A10.append(this.$index);
        throw new IndexOutOfBoundsException(C17890vO.A0c(A10, '.'));
    }
}
