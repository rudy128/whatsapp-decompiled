package X;

import android.widget.HorizontalScrollView;

/* renamed from: X.5g6  reason: invalid class name and case insensitive filesystem */
public abstract class C110525g6 extends HorizontalScrollView implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A00() {
        AnonymousClass6FA r2 = (AnonymousClass6FA) this;
        if (!r2.A01) {
            r2.A01 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(r2);
            r2.A00 = AnonymousClass10E.A8r(A0X);
            r2.A00 = (AnonymousClass1UD) A0X.A14.get();
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
