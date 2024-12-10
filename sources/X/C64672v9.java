package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.2v9  reason: invalid class name and case insensitive filesystem */
public class C64672v9 implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64672v9(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A00 != 0) {
            View view2 = (View) this.A02;
            view2.removeOnAttachStateChangeListener(this);
            AnonymousClass1HF.A0U(view2);
            return;
        }
        C35821mr r1 = (C35821mr) this.A02;
        Fragment fragment = r1.A02;
        r1.A03();
        C39461t7.A02((ViewGroup) fragment.A0B.getParent(), ((AnonymousClass1GS) this.A01).A00).A08();
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
