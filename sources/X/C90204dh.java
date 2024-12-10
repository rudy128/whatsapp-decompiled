package X;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.whatsapp.calling.callgrid.view.FocusViewContainer;
import com.whatsapp.conversation.EditMessageActivity;
import com.whatsapp.expressionstray.ExpressionsTrayView;

/* renamed from: X.4dh  reason: invalid class name and case insensitive filesystem */
public class C90204dh implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90204dh(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ExpressionsTrayView expressionsTrayView;
        switch (this.A00) {
            case 2:
                C77913rm r2 = (C77913rm) this.A01;
                C18070vi.A0d(r2, 0);
                r2.setAnchorWidthView((View) this.A02);
                return;
            case 3:
                FocusViewContainer focusViewContainer = (FocusViewContainer) this.A01;
                Rect rect = focusViewContainer.A08;
                view.getGlobalVisibleRect(rect);
                Rect rect2 = (Rect) this.A02;
                int i9 = rect2.top - rect.top;
                int i10 = rect2.left - rect.left;
                float width = ((float) rect2.width()) / ((float) rect.width());
                float height = ((float) rect2.height()) / ((float) rect.height());
                focusViewContainer.A0B.setAlpha(0.0f);
                focusViewContainer.A0A.setAlpha(0.0f);
                FrameLayout frameLayout = focusViewContainer.A09;
                frameLayout.setPivotX(0.0f);
                frameLayout.setPivotY(0.0f);
                frameLayout.setScaleX(width);
                frameLayout.setScaleY(height);
                frameLayout.setTranslationX((float) i10);
                frameLayout.setTranslationY((float) i9);
                frameLayout.animate().setDuration(250).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new AnonymousClass3Mo(this, 2)).setInterpolator(new DecelerateInterpolator(1.5f));
                frameLayout.removeOnLayoutChangeListener(this);
                return;
            case 4:
                EditMessageActivity editMessageActivity = (EditMessageActivity) this.A01;
                Configuration configuration = (Configuration) this.A02;
                C18070vi.A0d(view, 2);
                View view2 = editMessageActivity.A00;
                if (view2 == null) {
                    C18070vi.A11("footerContainer");
                } else if (view2.getAlpha() == 0.0f) {
                    int i11 = i8 - i6;
                    boolean z = true;
                    if (configuration.keyboard == 1) {
                        z = false;
                    }
                    if (view.getHeight() < i11 || z) {
                        View view3 = editMessageActivity.A00;
                        if (view3 != null) {
                            view3.setAlpha(1.0f);
                            View view4 = editMessageActivity.A00;
                            if (view4 != null) {
                                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) view4.getHeight(), 0.0f);
                                translateAnimation.setInterpolator(AnonymousClass4IU.A00);
                                translateAnimation.setDuration(300);
                                View view5 = editMessageActivity.A00;
                                if (view5 != null) {
                                    view5.startAnimation(translateAnimation);
                                    return;
                                }
                            }
                        }
                        C18070vi.A11("footerContainer");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                throw null;
            case 5:
                AnonymousClass4aY r6 = (AnonymousClass4aY) this.A01;
                C86234Qv r4 = (C86234Qv) this.A02;
                int height2 = view.getHeight();
                int width2 = view.getWidth();
                int height3 = r6.A0R.getHeight();
                if (width2 > height2 || height2 < r4.A02.getHeight() || r6.A6e || height3 - height2 > AnonymousClass3MW.A04(r6).getDimensionPixelSize(2131167053)) {
                    r4.A00(false);
                    return;
                } else if (!AnonymousClass4aY.A26(r6) || (expressionsTrayView = r6.A3D) == null || expressionsTrayView.getVisibility() == 8) {
                    r4.A00(true);
                    return;
                } else {
                    return;
                }
            default:
                ((C77913rm) this.A01).setAnchorWidthView((View) this.A02);
                return;
        }
    }
}
