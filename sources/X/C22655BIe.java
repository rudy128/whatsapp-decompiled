package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.whatsapp.KeyboardPopupLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.BIe  reason: case insensitive filesystem */
public class C22655BIe extends FrameLayout implements AnonymousClass009, ScaleGestureDetector.OnScaleGestureListener {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public AnonymousClass1L4 A0G;
    public C28480E2v A0H;
    public C28481E2w A0I;
    public BID A0J;
    public AnonymousClass031 A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public int[] A0U;
    public Rect A0V;
    public boolean A0W;
    public KeyboardPopupLayout A0X;
    public final C26281Cwc A0Y;
    public final ScaleGestureDetector A0Z;
    public final View A0a;
    public final ArrayList A0b;

    public static int A00(C22655BIe bIe, float f) {
        return (int) (((1.0f - bIe.A00) * f) / 2.0f);
    }

    public static int A01(C22655BIe bIe, int i) {
        return (int) (((1.0f - bIe.A00) * ((float) i)) / 2.0f);
    }

    public static void A02(C22655BIe bIe, float f) {
        if (bIe.A0D != null) {
            Iterator it = bIe.A0b.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                try {
                    int i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
                    if ((i & 48) == 48) {
                        view.setPivotY(0.0f);
                        C72463Mc.A14(view, view.getPaddingLeft(), (int) (((float) bIe.A08) * f));
                    }
                    if ((i & 80) == 80) {
                        view.setPivotY((float) view.getMeasuredHeight());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) (((float) bIe.A08) * f));
                    }
                    if ((i & 8388611) == 8388611) {
                        view.setPivotX(0.0f);
                        C72463Mc.A14(view, (int) (((float) bIe.A08) * f), view.getPaddingTop());
                    }
                    if ((i & 8388613) == 8388613) {
                        view.setPivotX((float) view.getMeasuredWidth());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) (((float) bIe.A08) * f), view.getPaddingBottom());
                    }
                } catch (Exception unused) {
                }
                float f2 = 1.0f / f;
                view.setScaleX(f2);
                view.setScaleY(f2);
            }
        }
    }

    public int A03(int i) {
        float f = (float) i;
        if (this.A06 > (getLeftOfDraggableArea() - ((int) (((1.0f - this.A00) * f) / 2.0f))) + (((getRightOfDraggableArea() - i) + A00(this, f)) / 2)) {
            return (getRightOfDraggableArea() - i) + A00(this, f);
        }
        return getLeftOfDraggableArea() - A00(this, f);
    }

    public void A06(boolean z) {
        if (this.A0D != null && !this.A0L) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new D5C(viewTreeObserver, this, z));
            requestLayout();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A0M) {
            canvas.clipRect(this.A0V);
        }
        super.dispatchDraw(canvas);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0K;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public int getBottomOfDraggableArea() {
        return (this.A0V.bottom - this.A01) - getPaddingBottom();
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    public int getLeftOfDraggableArea() {
        return this.A01 + this.A0V.left + getPaddingLeft();
    }

    public int getRightOfDraggableArea() {
        return (this.A0V.right - this.A01) - getPaddingRight();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0Y.A0H(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0D == null || !this.A0W) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            scaleFactor = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            scaleFactor = 0.67f;
        }
        this.A0D.setScaleX(scaleFactor);
        this.A0D.setScaleY(this.A00);
        A02(this, this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0D == null || !this.A0W) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0D;
        if (view != null && this.A0W) {
            boolean z = this.A0O;
            float f = this.A00;
            if (z) {
                if (f <= 0.85f) {
                    this.A0N = true;
                    C28480E2v e2v = this.A0H;
                    if (e2v != null) {
                        ((C27052DQx) e2v).A00.BKs(true);
                    }
                    BID bid = this.A0J;
                    if (bid != null) {
                        bid.A0B(0, AnonymousClass3Ma.A01(this.A0J.getContext(), getResources(), 2130968798, 2131099872));
                        this.A0J.setPlayerElevation(6);
                        this.A0J.setVisibility(0);
                    }
                }
                this.A0D.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125);
            } else {
                int i = (f > 0.85f ? 1 : (f == 0.85f ? 0 : -1));
                ViewPropertyAnimator animate = view.animate();
                float f2 = 1.0f;
                if (i <= 0) {
                    f2 = 0.67f;
                }
                animate.scaleX(f2).scaleY(f2).setDuration(125);
                this.A00 = f2;
            }
            this.A0D.setScaleX(this.A00);
            this.A0D.setScaleY(this.A00);
            A02(this, this.A00);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        C26281Cwc cwc = this.A0Y;
        if (cwc.A02 != 1 && !this.A0Z.isInProgress()) {
            if (this.A0D == null || motionEvent.getX() < ((float) (this.A06 + A01(this, this.A0D.getWidth()))) || motionEvent.getX() > ((float) ((this.A06 + this.A0D.getWidth()) - A01(this, this.A0D.getWidth()))) || motionEvent.getY() < ((float) (this.A07 + A01(this, this.A0D.getHeight())))) {
                return false;
            }
            if (motionEvent.getY() > ((float) (AnonymousClass3MW.A02(this.A0D, this.A07) - A01(this, this.A0D.getHeight())))) {
                return false;
            }
        }
        if (this.A0S || this.A0L || (view = this.A0D) == null || view.getVisibility() != 0) {
            return false;
        }
        this.A0Z.onTouchEvent(motionEvent);
        cwc.A0D(motionEvent);
        return true;
    }

    public void setConfiguration(Configuration configuration) {
        int i;
        if (this.A04 != this.A05 || this.A03 != this.A02) {
            ViewGroup.LayoutParams layoutParams = this.A0D.getLayoutParams();
            if (configuration.orientation == 2) {
                layoutParams.width = this.A04;
                i = this.A03;
            } else {
                layoutParams.width = this.A05;
                i = this.A02;
            }
            layoutParams.height = i;
            this.A0D.setLayoutParams(layoutParams);
            this.A0D.requestLayout();
        }
    }

    public void setControlView(BID bid) {
        this.A0J = bid;
        this.A0E = bid.findViewById(2131431358);
    }

    public C22655BIe(Context context, View view) {
        super(context);
        if (!this.A0Q) {
            this.A0Q = true;
            this.A0G = (AnonymousClass1L4) AnonymousClass3MW.A0O(generatedComponent()).A00.A2e.get();
        }
        this.A0W = true;
        this.A0P = false;
        this.A00 = 1.0f;
        this.A0M = true;
        this.A08 = 0;
        this.A0b = C17880vN.A0z(4);
        this.A0T = true;
        if (view == null) {
            this.A0a = this;
            view = this;
        } else {
            this.A0a = view;
        }
        int[] A1W = C108945cZ.A1W();
        view.getLocationInWindow(A1W);
        int i = A1W[0];
        this.A0V = new Rect(i, A1W[1], this.A0a.getWidth() + i, AnonymousClass3MW.A02(this.A0a, A1W[1]));
        C26281Cwc A012 = C26281Cwc.A01(this, new BLA(this));
        A012.A05 = (int) (((float) A012.A05) * (1.0f / 1.0f));
        this.A0Y = A012;
        A012.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0Z = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        View A0F2 = AnonymousClass3MZ.A0F(AnonymousClass1L9.A00(context));
        AnonymousClass1HF.A0g(A0F2, new D6T(this, 4));
        AnonymousClass1HF.A0T(A0F2);
        context.getResources().getConfiguration();
    }

    public int A04(int i) {
        float f = (float) i;
        int A092 = BE6.A09(getTopOfDraggableArea(), A00(this, f), (getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)));
        int max = Math.max((getBottomOfDraggableArea() - i) + ((int) (((1.0f - this.A00) * f) / 2.0f)), getTopOfDraggableArea() - A00(this, f));
        int i2 = this.A07;
        if (C108945cZ.A05(i2, A092) >= C108945cZ.A05(i2, max)) {
            return max;
        }
        return A092;
    }

    public void A05() {
        int[] A1W = C108945cZ.A1W();
        View view = this.A0a;
        view.getLocationInWindow(A1W);
        int A0I2 = BE6.A0I(A1W);
        this.A0V = new Rect(A0I2, A1W[1], view.getWidth() + A0I2, AnonymousClass3MW.A02(view, A1W[1]));
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A0Y.A0F()) {
            postInvalidateOnAnimation();
        }
    }

    public int getTopOfDraggableArea() {
        return getPaddingTop() + this.A01 + this.A0V.top;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0D;
        if (view != null && !this.A0O) {
            if (!this.A0L) {
                view.setScaleX(this.A00);
                this.A0D.setScaleY(this.A00);
            }
            View view2 = this.A0D;
            int i5 = this.A06;
            view2.layout(i5, this.A07, view2.getWidth() + i5, AnonymousClass3MW.A02(this.A0D, this.A07));
        }
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0D;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0F = null;
        this.A0D = view;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.A0D, "scaleX", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0D, "scaleY", new float[]{this.A00}), ObjectAnimator.ofFloat(this.A0D, "translationX", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0D, "translationY", new float[]{0.0f}), ObjectAnimator.ofFloat(this.A0D, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(130);
        BEQ.A00(animatorSet, this, 21);
        animatorSet.start();
        int[] iArr = this.A0U;
        if (iArr != null) {
            for (int findViewById : iArr) {
                View findViewById2 = this.A0D.findViewById(findViewById);
                if (findViewById2 != null) {
                    this.A0b.add(findViewById2);
                }
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0b.clear();
        this.A0D = null;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i) {
        this.A01 = i;
    }

    public void setClipToDependentView(boolean z) {
        this.A0M = z;
    }

    public void setDismissListener(C28480E2v e2v) {
        this.A0H = e2v;
    }

    public void setExitingFullScreen(boolean z) {
        this.A0N = z;
    }

    public void setFullscreen(boolean z) {
        this.A0O = z;
    }

    public void setIgnoreNextSoftInputHide(boolean z) {
        this.A0P = z;
    }

    public void setIsScalingEnabled(boolean z) {
        this.A0W = z;
    }

    public void setKeyboardLayout(KeyboardPopupLayout keyboardPopupLayout) {
        this.A0X = keyboardPopupLayout;
    }

    public void setLockChild(boolean z) {
        this.A0S = z;
    }

    public void setViewAddedListener(C28481E2w e2w) {
        this.A0I = e2w;
    }
}
