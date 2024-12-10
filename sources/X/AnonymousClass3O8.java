package X;

import android.view.View;

/* renamed from: X.3O8  reason: invalid class name */
public abstract class AnonymousClass3O8 extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
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
