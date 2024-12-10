package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import java.util.Collections;
import java.util.Map;

public class BIJ extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public Interpolator A03;
    public Interpolator A04;
    public C28484E3o A05;
    public C28485E3p A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public D5D A0B;
    public RootHostView A0C;
    public C25813CmQ A0D;
    public boolean A0E;
    public final Animator.AnimatorListener A0F = new BEQ(this, 4);
    public final Animator.AnimatorListener A0G = new BEQ(this, 3);
    public final GestureDetector.OnGestureListener A0H;
    public final GestureDetector A0I;
    public final Runnable A0J = new C21466AkX((Object) this, 38);

    public BIJ(Context context, Integer num, boolean z) {
        super(context, (AttributeSet) null);
        GestureDetector.OnGestureListener d4b = new C26561D4b(this, 0);
        this.A0H = d4b;
        this.A09 = z;
        this.A07 = num;
        this.A0I = new GestureDetector(context, !z ? new BH1(this) : d4b);
    }

    public void A02() {
        View activityRootView;
        setAlpha(0.0f);
        if (this.A0A && this.A07.equals(AnonymousClass00R.A01) && (activityRootView = getActivityRootView()) != null) {
            D5D d5d = new D5D(activityRootView, false);
            this.A0B = d5d;
            d5d.A03.add(new D8M(activityRootView, this));
            this.A0B.onGlobalLayout();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new D59(this, 0));
    }

    public static void A00(BIJ bij) {
        AccessibilityManager A0O;
        if (bij.A00 != 0 && !bij.A0E) {
            Runnable runnable = bij.A0J;
            bij.removeCallbacks(runnable);
            int i = bij.A00;
            if (Build.VERSION.SDK_INT >= 29 && (A0O = BEA.A0O(bij)) != null && A0O.isEnabled()) {
                i = A0O.getRecommendedTimeoutMillis(i, 3);
            }
            bij.postDelayed(runnable, (long) i);
        }
    }

    private boolean A01() {
        if (!this.A08) {
            if (getTranslationY() > C108945cZ.A04(this) / 2.0f) {
                A03(this.A01);
            } else {
                A04((Animator.AnimatorListener) null, this.A02);
                return true;
            }
        }
        return true;
    }

    public void A03(int i) {
        ViewPropertyAnimator alpha;
        removeCallbacks(this.A0J);
        this.A0E = true;
        if (getContext() == null || !isAttachedToWindow()) {
            C28484E3o e3o = this.A05;
            if (e3o != null) {
                e3o.Brv();
                return;
            }
            return;
        }
        clearAnimation();
        if (this.A09) {
            clearAnimation();
            alpha = animate().setDuration((long) i).setInterpolator(this.A03).alpha(0.0f).scaleX(1.5f).scaleY(1.5f);
        } else {
            clearAnimation();
            boolean equals = this.A07.equals(AnonymousClass00R.A00);
            int height = getHeight();
            if (equals) {
                height = -height;
            }
            alpha = animate().setDuration((long) i).translationY((float) height).setInterpolator(this.A03).alpha(0.0f);
        }
        alpha.setListener(this.A0F);
        D5D d5d = this.A0B;
        if (d5d != null) {
            d5d.A03.clear();
            ViewTreeObserver viewTreeObserver = d5d.A02.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(d5d);
            }
            this.A0B = null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0I.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A08 = false;
            return true;
        } else if (action == 1 || action == 3) {
            A00(this);
            return A01();
        } else if (onTouchEvent || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void setBloksContentViewFromParseResult(DOZ doz, C26235CvV cvV) {
        C25813CmQ cmQ = this.A0D;
        if (cmQ != null) {
            cmQ.A01();
            this.A0D = null;
        }
        RootHostView rootHostView = this.A0C;
        if (rootHostView != null) {
            removeView(rootHostView);
        }
        Context context = doz.A00;
        if (!context.equals(getContext())) {
            C25913CoX.A01("bk.action.toast.ShowToastV2", "Different Android context for BloksHostingComponent and FoABloksPopoverView");
        }
        this.A0C = new BV8(context);
        CXY cxy = doz.A02;
        Map emptyMap = Collections.emptyMap();
        Map emptyMap2 = Collections.emptyMap();
        C25344Ce3.A00(cvV);
        C25344Ce3.A00(cxy);
        C25813CmQ cmQ2 = new C25813CmQ(context, BE6.A0Q(), cvV, cxy, emptyMap, emptyMap2);
        this.A0D = cmQ2;
        cmQ2.A03(this.A0C);
        setContentView(this.A0D.A00);
    }

    public void setContentView(View view) {
        if (view == null) {
            C25913CoX.A01("bk.action.toast.ShowToastV2", "Cannot add null Bloks content view to PopoverView container.");
        } else {
            addView(view);
        }
    }

    private View getActivityRootView() {
        Window window;
        Activity A002 = C20101A7f.A00(getContext());
        if (A002 == null || (window = A002.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().findViewById(16908290);
    }

    public void A04(Animator.AnimatorListener animatorListener, int i) {
        clearAnimation();
        animate().setDuration((long) i).translationY(0.0f).setInterpolator(this.A04).alpha(1.0f).setListener(animatorListener);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C25813CmQ cmQ = this.A0D;
        if (cmQ != null) {
            cmQ.A01();
            this.A0D = null;
            this.A0C = null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            removeCallbacks(this.A0J);
        } else if (action == 1 || action == 3) {
            A00(this);
            A01();
        }
        return this.A0I.onTouchEvent(motionEvent);
    }

    public void setAutoDismissDurationMs(int i) {
        this.A00 = i;
    }

    public void setDismissAnimationDurationMs(int i) {
        this.A01 = i;
    }

    public void setDismissAnimationEndListener(C28484E3o e3o) {
        this.A05 = e3o;
    }

    public void setDismissAnimationInterpolator(Interpolator interpolator) {
        this.A03 = interpolator;
    }

    public void setIsLastGestureFling(boolean z) {
        this.A08 = z;
    }

    public void setShowAboveKeyboard(boolean z) {
        this.A0A = z;
    }

    public void setShowAnimationDurationMs(int i) {
        this.A02 = i;
    }

    public void setShowAnimationEndListener(C28485E3p e3p) {
        this.A06 = e3p;
    }

    public void setShowAnimationInterpolator(Interpolator interpolator) {
        this.A04 = interpolator;
    }
}
