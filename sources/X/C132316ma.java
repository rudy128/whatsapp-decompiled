package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6ma  reason: invalid class name and case insensitive filesystem */
public final class C132316ma {
    public float A00;
    public int A01;
    public final WeakReference A02;

    public C132316ma(AnonymousClass3uK r2, float f, int i) {
        this.A00 = f;
        this.A01 = i;
        this.A02 = AnonymousClass3MW.A0z(r2);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ItemViewInfo{visiblePercentage=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
