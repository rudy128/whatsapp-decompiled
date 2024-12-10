package X;

import android.widget.FrameLayout;

/* renamed from: X.5fb  reason: invalid class name and case insensitive filesystem */
public abstract class C110415fb extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A02() {
        if (this instanceof C122126Mw) {
            C122126Mw r1 = (C122126Mw) this;
            if (!r1.A02) {
                r1.A02 = true;
                r1.generatedComponent();
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
