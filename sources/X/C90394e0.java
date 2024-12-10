package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: X.4e0  reason: invalid class name and case insensitive filesystem */
public class C90394e0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final ViewGroup A00;

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A00;
        AnonymousClass3MY.A1D(viewGroup, this);
        Drawable background = viewGroup.getBackground();
        if (background instanceof AnonymousClass3NK) {
            AnonymousClass3NK.A00(((AnonymousClass3NK) background).A01, viewGroup);
        }
    }

    public C90394e0(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }
}
