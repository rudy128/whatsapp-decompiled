package X;

import android.widget.FrameLayout;

/* renamed from: X.5fZ  reason: invalid class name and case insensitive filesystem */
public abstract class C110395fZ extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A03() {
        C122106Mu r2 = (C122106Mu) this;
        if (!r2.A00) {
            r2.A00 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(r2);
            r2.A03 = AnonymousClass10E.A8r(A0X);
            r2.A01 = AnonymousClass3Ma.A0a(A0X);
            r2.A02 = AnonymousClass10E.A6Q(A0X);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
