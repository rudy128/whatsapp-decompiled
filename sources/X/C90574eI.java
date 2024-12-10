package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaViewPager;
import com.whatsapp.greenalert.GreenAlertActivity;
import com.whatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.4eI  reason: invalid class name and case insensitive filesystem */
public class C90574eI implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90574eI(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(ViewTreeObserver viewTreeObserver, Object obj, Object obj2, int i) {
        viewTreeObserver.addOnGlobalLayoutListener(new C90574eI(obj, obj2, i));
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        float f;
        View view;
        switch (this.A00) {
            case 0:
                AnonymousClass3MY.A1D(((C85814Ov) this.A02).A02, this);
                ((ViewTreeObserver.OnGlobalLayoutListener) this.A01).onGlobalLayout();
                return;
            case 1:
                AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                AnonymousClass3MY.A1D(r2.A0K, this);
                Rect A07 = AnonymousClass3MW.A07();
                r2.A0R.getWindowVisibleDisplayFrame(A07);
                int height = A07.height() + r2.A05;
                if (height != r2.A03) {
                    ((ViewGroup.LayoutParams) this.A02).height = height;
                    r2.A0K.requestLayout();
                    r2.A03 = height;
                    return;
                }
                return;
            case 2:
                AnonymousClass3MY.A1D((View) this.A01, this);
                GreenAlertActivity greenAlertActivity = (GreenAlertActivity) this.A02;
                WaViewPager waViewPager = greenAlertActivity.A02;
                if (waViewPager == null) {
                    C18070vi.A11("viewPager");
                    throw null;
                } else {
                    GreenAlertActivity.A0c(greenAlertActivity, waViewPager.getCurrentLogicalItem());
                    return;
                }
            case 3:
                ScrollView scrollView = (ScrollView) this.A02;
                if (((View) this.A01).hasFocus()) {
                    scrollView.smoothScrollBy(0, scrollView.getMaxScrollAmount());
                    return;
                }
                return;
            case 4:
                View view2 = (View) this.A02;
                AnonymousClass3MY.A1D(view2, this);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                view2.startAnimation(translateAnimation);
                return;
            case 5:
                AnonymousClass3MY.A1D((View) this.A01, this);
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) this.A02;
                TextView textView = userNoticeBottomSheetDialogFragment.A02;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                C72453Mb.A1D(userNoticeBottomSheetDialogFragment.A01);
                UserNoticeBottomSheetDialogFragment.A01(userNoticeBottomSheetDialogFragment);
                return;
            case 6:
                View view3 = (View) this.A01;
                AnonymousClass3MY.A1D(view3, this);
                ViewParent parent = view3.getParent();
                while ((parent instanceof View) && (view = (View) parent) != null) {
                    if (view instanceof ScrollView) {
                        ScrollView scrollView2 = (ScrollView) view;
                        if (scrollView2 != null) {
                            scrollView2.smoothScrollTo(0, view3.getTop());
                            return;
                        }
                        return;
                    }
                    parent = view.getParent();
                }
                return;
            case 7:
                View view4 = (View) this.A02;
                AnonymousClass3MY.A1D(view4, this);
                view4.animate().translationY(-((Context) this.A01).getResources().getDimension(2131167221)).setDuration(250).setInterpolator(new AnonymousClass1YX()).start();
                return;
            case 8:
                ScrollView scrollView3 = (ScrollView) this.A01;
                boolean A012 = AnonymousClass4W3.A01(scrollView3);
                View view5 = (View) this.A02;
                if (A012) {
                    f = view5.getResources().getDimension(2131168777);
                } else {
                    f = 0.0f;
                }
                view5.setElevation(f);
                viewTreeObserver = scrollView3.getViewTreeObserver();
                break;
            case 9:
                ((Runnable) this.A01).run();
                viewTreeObserver = ((View) this.A02).getViewTreeObserver();
                break;
            default:
                AnonymousClass3MY.A1D((View) this.A02, this);
                ((C18090vk) this.A01).invoke();
                return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
