package X;

import android.view.View;

/* renamed from: X.7J6  reason: invalid class name */
public class AnonymousClass7J6 implements AnonymousClass87P {
    public final int A00;
    public final Object A01;

    public AnonymousClass7J6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CFU() {
        View view;
        if (this.A00 != 0) {
            view = (View) this.A01;
        } else {
            view = ((AnonymousClass7JF) this.A01).A0P;
        }
        view.invalidate();
    }
}
