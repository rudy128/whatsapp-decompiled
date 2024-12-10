package X;

import android.view.View;

/* renamed from: X.6Ic  reason: invalid class name */
public class AnonymousClass6Ic extends C89564cf {
    public Runnable A00;
    public final View A01;
    public final C111085iA A02;
    public final View A03;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A03.removeCallbacks(runnable);
        }
        C70643By r3 = new C70643By(this, charSequence, 6);
        this.A00 = r3;
        this.A03.postDelayed(r3, 500);
    }

    public AnonymousClass6Ic(View view, View view2, C111085iA r3) {
        this.A03 = view;
        this.A01 = view2;
        this.A02 = r3;
    }
}
