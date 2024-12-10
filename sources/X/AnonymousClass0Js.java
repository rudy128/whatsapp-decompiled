package X;

/* renamed from: X.0Js  reason: invalid class name */
public final class AnonymousClass0Js {
    public final boolean A00;
    public final C18090vk A01;
    public final C18090vk A02;

    public AnonymousClass0Js(C18090vk r1, C18090vk r2, boolean z) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = z;
    }

    public final C18090vk A00() {
        return this.A01;
    }

    public final C18090vk A01() {
        return this.A02;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScrollAxisRange(value=");
        A10.append(AnonymousClass000.A04(this.A02.invoke()));
        A10.append(", maxValue=");
        A10.append(AnonymousClass000.A04(this.A01.invoke()));
        A10.append(", reverseScrolling=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
