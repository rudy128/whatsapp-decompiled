package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Recomposer;
import java.lang.ref.WeakReference;

/* renamed from: X.05G  reason: invalid class name */
public abstract class AnonymousClass05G extends ViewGroup {
    public AnonymousClass0D1 A00;
    public WeakReference A01;
    public IBinder A02;
    public C16640sl A03;
    public C18090vk A04 = C06240Xn.A00.Bdh(this);
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public void A04(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public abstract void A05(C17130tn r1, int i);

    public void A06(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void A00() {
        if (!this.A05) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Cannot add views to ");
            A10.append(getClass().getSimpleName());
            throw new UnsupportedOperationException(AnonymousClass000.A0y("; only Compose content is supported", A10));
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A01(AnonymousClass05G r6) {
        IllegalStateException A0n;
        if (r6.A03 == null) {
            try {
                r6.A05 = true;
                AnonymousClass0D1 r2 = r6.A00;
                if (r2 == null) {
                    r2 = AnonymousClass0QD.A00(r6);
                    if (r2 == null) {
                        ViewParent parent = r6.getParent();
                        while (true) {
                            if (parent instanceof View) {
                                r2 = AnonymousClass0QD.A00((View) parent);
                                parent = parent.getParent();
                                if (r2 != null) {
                                    break;
                                }
                            } else {
                                WeakReference weakReference = r6.A01;
                                if (weakReference == null || (r2 = (AnonymousClass0D1) weakReference.get()) == null || !A02(r2)) {
                                    View view = r6;
                                    if (!r6.isAttachedToWindow()) {
                                        StringBuilder A10 = AnonymousClass000.A10();
                                        A10.append("Cannot locate windowRecomposer; View ");
                                        A10.append(r6);
                                        A0n = AnonymousClass000.A0o(" is not attached to a window", A10);
                                    } else {
                                        while (true) {
                                            ViewParent parent2 = view.getParent();
                                            if (!(parent2 instanceof View) || ((View) parent2).getId() == 16908290) {
                                                AnonymousClass0D1 A002 = AnonymousClass0QD.A00(view);
                                            } else {
                                                view = (View) parent2;
                                            }
                                        }
                                        AnonymousClass0D1 A0022 = AnonymousClass0QD.A00(view);
                                        if (A0022 == null) {
                                            r2 = AnonymousClass0MB.A00(view);
                                        } else if (A0022 instanceof Recomposer) {
                                            r2 = (Recomposer) A0022;
                                        } else {
                                            A0n = AnonymousClass000.A0n("root viewTreeParentCompositionContext is not a Recomposer");
                                        }
                                    }
                                    throw A0n;
                                }
                            }
                        }
                    }
                    if (A02(r2) && r2 != null) {
                        r6.A01 = new WeakReference(r2);
                    }
                }
                r6.A03 = AnonymousClass0O2.A00(r2, r6, AnonymousClass0LC.A01(new C12730mE(r6), -656146368, true));
                r6.A05 = false;
            } catch (Throwable th) {
                r6.A05 = false;
                throw th;
            }
        }
    }

    public static final boolean A02(AnonymousClass0D1 r1) {
        if (!(r1 instanceof Recomposer) || ((AnonymousClass0CU) ((Recomposer) r1).A0i().getValue()).compareTo(AnonymousClass0CU.ShuttingDown) > 0) {
            return true;
        }
        return false;
    }

    private final void setParentContext(AnonymousClass0D1 r3) {
        if (this.A00 != r3) {
            this.A00 = r3;
            if (r3 != null) {
                this.A01 = null;
            }
            C16640sl r0 = this.A03;
            if (r0 != null) {
                r0.dispose();
                this.A03 = null;
                if (isAttachedToWindow()) {
                    A01(this);
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A02 != iBinder) {
            this.A02 = iBinder;
            this.A01 = null;
        }
    }

    public final void A03() {
        C16640sl r0 = this.A03;
        if (r0 != null) {
            r0.dispose();
        }
        this.A03 = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return AnonymousClass000.A1W(this.A03);
    }

    public boolean isTransitionGroup() {
        if (!this.A06 || super.isTransitionGroup()) {
            return true;
        }
        return false;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A07 = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((C17140to) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(C17060tg r2) {
        C18090vk r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
        this.A04 = r2.Bdh(this);
    }

    public AnonymousClass05G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public void addView(View view, int i, int i2) {
        A00();
        super.addView(view, i, i2);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final boolean getShowLayoutBounds() {
        return this.A07;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            A01(this);
        }
    }

    public final void onMeasure(int i, int i2) {
        A01(this);
        A04(i, i2);
    }

    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A06 = true;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A06(z, i, i2, i3, i4);
    }

    public final void setParentCompositionContext(AnonymousClass0D1 r1) {
        setParentContext(r1);
    }

    public void addView(View view) {
        A00();
        super.addView(view);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A00();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, int i) {
        A00();
        super.addView(view, i);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, layoutParams);
    }
}
