package X;

import android.view.View;

/* renamed from: X.7O0  reason: invalid class name */
public class AnonymousClass7O0 implements AnonymousClass88T {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7O0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CA3() {
        View view;
        int i;
        if (this.A00 != 0) {
            view = (View) this.A02;
            i = 8;
        } else {
            view = (View) this.A02;
            i = 8;
            ((View) this.A01).setVisibility(8);
        }
        view.setVisibility(i);
        view.setAlpha(0.0f);
    }
}
