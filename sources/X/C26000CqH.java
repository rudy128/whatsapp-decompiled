package X;

import android.view.WindowInsetsAnimation;

/* renamed from: X.CqH  reason: case insensitive filesystem */
public final class C26000CqH {
    public final C33321id A00;
    public final C33321id A01;

    public static C26000CqH A00(WindowInsetsAnimation.Bounds bounds) {
        return new C26000CqH(bounds);
    }

    public C26000CqH(C33321id r1, C33321id r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public WindowInsetsAnimation.Bounds A01() {
        return C22673BJo.A00(this);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Bounds{lower=");
        A10.append(this.A00);
        A10.append(" upper=");
        return AnonymousClass8BX.A0d(this.A01, A10);
    }

    public C26000CqH(WindowInsetsAnimation.Bounds bounds) {
        this.A00 = C22673BJo.A02(bounds);
        this.A01 = C22673BJo.A01(bounds);
    }
}
