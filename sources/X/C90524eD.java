package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.4eD  reason: invalid class name and case insensitive filesystem */
public class C90524eD implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass4aY A03;
    public final /* synthetic */ boolean A04;

    public C90524eD(View view, ViewGroup viewGroup, AnonymousClass4aY r3, int i, boolean z) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A04 = z;
        this.A01 = view;
        this.A00 = i;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        AnonymousClass3MY.A1D(viewGroup, this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A04) {
            this.A03.A2B.startAnimation(translateAnimation);
        }
        AnonymousClass4aY r6 = this.A03;
        if (viewGroup == r6.A0V && r6.A0S.getVisibility() == 0) {
            r6.A0S.startAnimation(translateAnimation);
        }
        if (AnonymousClass4ZT.A01(r6)) {
            r6.A0W.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        Drawable background = r6.A27.A02.getBackground();
        C18070vi.A0X(background);
        View view = r6.A27.A02;
        Drawable background2 = view.getBackground();
        if (!(background2 instanceof AnonymousClass3NK)) {
            background2 = new AnonymousClass3NK(view.getBackground());
            view.setBackground(background2);
        }
        AnonymousClass3NK r1 = (AnonymousClass3NK) background2;
        r1.A00 = height;
        r1.invalidateSelf();
        C72923Oa r2 = new C72923Oa(background, this, r1, height);
        r2.setStartTime(-1);
        r2.setDuration(250);
        C74613c2.A00(r2, this, 7);
        r6.A27.A02.startAnimation(r2);
    }
}
