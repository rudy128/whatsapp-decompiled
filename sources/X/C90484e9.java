package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.4e9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C90484e9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C74563bx A02;
    public final /* synthetic */ boolean A03;

    public final void onGlobalLayout() {
        C74563bx r0 = this.A02;
        View view = this.A00;
        ViewGroup viewGroup = this.A01;
        boolean z = this.A03;
        AnonymousClass4aY r3 = r0.A03;
        Drawable background = r3.A27.A02.getBackground();
        C18070vi.A0X(background);
        if (background instanceof AnonymousClass3NK) {
            C85814Ov r2 = r3.A27;
            Drawable drawable = ((AnonymousClass3NK) background).A01;
            C18070vi.A0d(drawable, 0);
            AnonymousClass3NK.A00(drawable, r2.A02);
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(0);
        view.startAnimation(translateAnimation);
        if (viewGroup == r3.A0V && r3.A0S.getVisibility() == 0) {
            r3.A0S.startAnimation(translateAnimation);
        }
        if (AnonymousClass4ZT.A01(r3)) {
            r3.A0W.startAnimation(translateAnimation);
        }
        if (z) {
            r3.A2B.startAnimation(translateAnimation);
        }
        r3.A06 = 0;
        ViewGroup viewGroup2 = r3.A0V;
        if (viewGroup == viewGroup2) {
            viewGroup2.removeAllViews();
            r3.A2I = null;
        }
    }

    public /* synthetic */ C90484e9(View view, ViewGroup viewGroup, C74563bx r3, boolean z) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A03 = z;
    }
}
