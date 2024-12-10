package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: X.6IX  reason: invalid class name */
public class AnonymousClass6IX extends C114455qp {
    public int A00;
    public AnonymousClass11C A01;
    public C18000vb A02;
    public AnonymousClass88D A03;
    public boolean A04;
    public ValueAnimator A05;
    public boolean A06;
    public final C18100vl A07 = AnonymousClass1DF.A01(new C154147qf(this));
    public final C18100vl A08 = AnonymousClass1DF.A01(new C154167qh(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C154177qi(this));
    public final int A0A = 2131625030;
    public final C18100vl A0B = AnonymousClass1DF.A01(new C154157qg(this));

    public static void A00(AnonymousClass6IX r3) {
        r3.A00 = -1;
        r3.A04 = true;
        r3.A0E(new AnonymousClass7BQ(r3, 4));
        r3.setSelectedTabIndicator((Drawable) null);
        r3.setTabRippleColor((ColorStateList) null);
        r3.setTabMode(0);
        r3.setTabGravity(1);
    }

    private final AnonymousClass7BQ getOnTabSelectedListener() {
        return new AnonymousClass7BQ(this, 4);
    }

    private final View getSlidingTabIndicator() {
        View childAt = getChildAt(0);
        C18070vi.A0X(childAt);
        return childAt;
    }

    public final void A0E(AnonymousClass8B5 r2) {
        C18070vi.A0d(r2, 0);
        super.A0E(r2);
    }

    public void onMeasure(int i, int i2) {
        View view;
        C136836uU A082 = A08(0);
        if (!(A082 == null || (view = A082.A01) == null)) {
            view.measure(0, 0);
            i2 = View.MeasureSpec.makeMeasureSpec(C108985cd.A06(this, view.getMeasuredHeight()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public static final void A02(AnonymousClass6IX r7) {
        int i;
        int i2;
        View view;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View view2;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        if (r7.A06) {
            ArrayList arrayList = r7.A0h;
            if (arrayList.size() != 0) {
                C136836uU A082 = r7.A08(0);
                if (A082 == null || (view2 = A082.A01) == null) {
                    i = 0;
                } else {
                    int width = view2.getWidth();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                        i5 = 0;
                    } else {
                        i5 = marginLayoutParams4.leftMargin;
                    }
                    int i7 = width + i5;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                        i6 = 0;
                    } else {
                        i6 = marginLayoutParams3.rightMargin;
                    }
                    i = i7 + i6;
                }
                int width2 = (r7.getWidth() - i) / 2;
                C136836uU A083 = r7.A08(AnonymousClass000.A0Q(arrayList));
                if (A083 == null || (view = A083.A01) == null) {
                    i2 = 0;
                } else {
                    int width3 = view.getWidth();
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                        i3 = 0;
                    } else {
                        i3 = marginLayoutParams2.leftMargin;
                    }
                    int i8 = width3 + i3;
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                        i4 = 0;
                    } else {
                        i4 = marginLayoutParams.rightMargin;
                    }
                    i2 = i8 + i4;
                }
                int width4 = (r7.getWidth() - i2) / 2;
                View childAt = r7.getChildAt(0);
                C18070vi.A0X(childAt);
                childAt.setPaddingRelative(width2, 0, width4, 0);
                r7.addOnLayoutChangeListener(new C1420978d((Object) r7, 21));
                return;
            }
        }
        View childAt2 = r7.getChildAt(0);
        C18070vi.A0X(childAt2);
        childAt2.setPaddingRelative(0, 0, 0, 0);
    }

    public int getDisabledTabTextColor() {
        return C72453Mb.A0I(this.A07);
    }

    public final C1422378r getFlingListener() {
        return (C1422378r) this.A0B.getValue();
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public int getTabIndicatorColor() {
        return C72453Mb.A0I(this.A08);
    }

    public int getTabTextColor() {
        return C72453Mb.A0I(this.A09);
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setShouldCenterSelectedTab(boolean z) {
        C1422378r r0;
        if (this.A06 != z) {
            this.A06 = z;
            if (z) {
                setTabGravity(0);
                r0 = getFlingListener();
            } else {
                setTabGravity(1);
                View childAt = getChildAt(0);
                C18070vi.A0X(childAt);
                childAt.setPaddingRelative(0, 0, 0, 0);
                r0 = null;
            }
            setOnTouchListener(r0);
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new C1420978d((Object) this, 20));
            } else {
                A02(this);
            }
        }
    }

    public AnonymousClass6IX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0K();
        A00(this);
    }

    public static final void A03(AnonymousClass6IX r8, int i, int i2) {
        Drawable drawable;
        Drawable drawable2;
        float f;
        View view;
        View view2;
        C136836uU A082;
        View view3;
        Drawable background;
        if (r8.isEnabled() && i != i2) {
            ValueAnimator valueAnimator = r8.A05;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int A072 = C108945cZ.A07(r8);
            int i3 = 0;
            while (true) {
                drawable = null;
                if (i3 >= A072) {
                    break;
                }
                if (!(i3 == i || i3 == i2 || (A082 = r8.A08(i3)) == null || (view3 = A082.A01) == null || (background = view3.getBackground()) == null)) {
                    background.setAlpha(0);
                }
                i3++;
            }
            C136836uU A083 = r8.A08(i);
            if (A083 == null || (view2 = A083.A01) == null) {
                drawable2 = null;
            } else {
                drawable2 = view2.getBackground();
            }
            float f2 = 0.5f;
            if (drawable2 != null) {
                f = (((float) drawable2.getAlpha()) / 255.0f) * 0.5f;
            } else {
                f = 0.5f;
            }
            C136836uU A084 = r8.A08(i2);
            if (!(A084 == null || (view = A084.A01) == null || (drawable = view.getBackground()) == null)) {
                f2 = 0.5f + (C28851b7.A02(1.0f - (((float) drawable.getAlpha()) / 255.0f), 0.0f, 1.0f) * (1.0f - 0.5f));
            }
            if (f < f2) {
                float[] A1V = C108945cZ.A1V();
                A1V[0] = f;
                A1V[1] = f2;
                ValueAnimator duration = ValueAnimator.ofFloat(A1V).setDuration((long) ((f2 - f) * 400.0f));
                r8.A05 = duration;
                if (duration != null) {
                    duration.addUpdateListener(new C26315CxY(drawable, drawable2, 9));
                }
                ValueAnimator valueAnimator2 = r8.A05;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            }
        }
    }

    public void A0I(C136836uU r2, boolean z) {
        if (isEnabled()) {
            super.A0I(r2, z);
        }
    }

    public final C136836uU A0L(int i, boolean z) {
        C136836uU A072 = A07();
        A072.A01 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(A072.A02), A072.A02, getTabViewRes());
        C110595gJ r0 = A072.A02;
        if (r0 != null) {
            r0.A04();
        }
        A072.A01(i);
        C109475dV r2 = new C109475dV(C72453Mb.A0I(this.A08));
        r2.setAlpha(0);
        View view = A072.A01;
        if (view != null) {
            view.setBackground(r2);
        }
        A0H(A072, C108945cZ.A07(this), z);
        int selectedTabPosition = getSelectedTabPosition();
        if (selectedTabPosition < 0) {
            selectedTabPosition = 0;
        }
        this.A00 = selectedTabPosition;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new C1420978d((Object) this, 19));
            return A072;
        }
        A02(this);
        return A072;
    }

    public int getTabViewRes() {
        return this.A0A;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setEnabled(boolean z) {
        View view;
        int A0I;
        ValueAnimator valueAnimator;
        if (isEnabled() != z) {
            super.setEnabled(z);
            if (!isEnabled() && (valueAnimator = this.A05) != null) {
                valueAnimator.cancel();
            }
            int A072 = C108945cZ.A07(this);
            for (int i = 0; i < A072; i++) {
                C136836uU A082 = A08(i);
                if (!(A082 == null || (view = A082.A01) == null)) {
                    TextView A0E = C17880vN.A0E(view, 16908308);
                    if (!isEnabled()) {
                        view.getBackground().setAlpha(0);
                        if (A0E != null) {
                            A0I = C72453Mb.A0I(this.A07);
                        }
                    } else if (A0E != null) {
                        A0I = C72453Mb.A0I(this.A09);
                    }
                    A0E.setTextColor(A0I);
                }
            }
            if (isEnabled()) {
                A03(this, -1, this.A00);
            }
        }
    }

    public final void setOnTabSelectedListener(AnonymousClass88D r1) {
        this.A03 = r1;
    }

    public final void setSelectedTabIndicator(Drawable drawable) {
        super.setSelectedTabIndicator(drawable);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(this);
    }
}
