package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.5gH  reason: invalid class name and case insensitive filesystem */
public class C110585gH extends LinearLayout {
    public ValueAnimator A00;
    public int A01 = -1;
    public final /* synthetic */ TabLayout A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110585gH(Context context, TabLayout tabLayout) {
        super(context);
        this.A02 = tabLayout;
        setWillNotDraw(false);
    }

    public static void A00(View view, View view2, C110585gH r12, float f) {
        int round;
        int i;
        int i2;
        int round2;
        float sin;
        double cos;
        float A002;
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = r12.A02;
            Drawable drawable = tabLayout.A0J;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.A0J.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = r12.A02;
            C137076us r1 = tabLayout2.A0L;
            Drawable drawable2 = tabLayout2.A0J;
            if (r1 instanceof C114445qo) {
                if (f >= 0.5f) {
                    view = view2;
                }
                RectF A003 = C137076us.A00(view, tabLayout2);
                if (f < 0.5f) {
                    A002 = AnonymousClass1YW.A00(1.0f, 0.0f, 0.0f, 0.5f, f);
                } else {
                    A002 = AnonymousClass1YW.A00(0.0f, 1.0f, 0.5f, 1.0f, f);
                }
                drawable2.setBounds((int) A003.left, drawable2.getBounds().top, (int) A003.right, drawable2.getBounds().bottom);
                drawable2.setAlpha((int) (A002 * 255.0f));
            } else {
                if (r1 instanceof C114435qn) {
                    RectF A004 = C137076us.A00(view, tabLayout2);
                    RectF A005 = C137076us.A00(view2, tabLayout2);
                    float f2 = A004.left;
                    float f3 = A005.left;
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    if (f2 < f3) {
                        sin = (float) (1.0d - Math.cos(d));
                        cos = Math.sin(d);
                    } else {
                        sin = (float) Math.sin(d);
                        cos = 1.0d - Math.cos(d);
                    }
                    float f4 = (float) cos;
                    int i3 = (int) f2;
                    TimeInterpolator timeInterpolator = AnonymousClass1YW.A02;
                    round = i3 + Math.round(sin * ((float) (((int) f3) - i3)));
                    i = drawable2.getBounds().top;
                    i2 = (int) A004.right;
                    round2 = Math.round(f4 * ((float) (((int) A005.right) - i2)));
                } else {
                    RectF A006 = C137076us.A00(view, tabLayout2);
                    RectF A007 = C137076us.A00(view2, tabLayout2);
                    int i4 = (int) A006.left;
                    int i5 = (int) A007.left;
                    TimeInterpolator timeInterpolator2 = AnonymousClass1YW.A02;
                    round = i4 + Math.round(((float) (i5 - i4)) * f);
                    i = drawable2.getBounds().top;
                    i2 = (int) A006.right;
                    round2 = Math.round(f * ((float) (((int) A007.right) - i2)));
                }
                drawable2.setBounds(round, i, i2 + round2, drawable2.getBounds().bottom);
            }
        }
        r12.postInvalidateOnAnimation();
    }

    public static void A01(C110585gH r6, int i) {
        TabLayout tabLayout = r6.A02;
        if (tabLayout.A0F == 0) {
            View childAt = r6.getChildAt(i);
            Drawable drawable = tabLayout.A0J;
            RectF A002 = C137076us.A00(childAt, tabLayout);
            drawable.setBounds((int) A002.left, drawable.getBounds().top, (int) A002.right, drawable.getBounds().bottom);
            tabLayout.A02 = i;
        }
    }

    public void A02(int i) {
        TabLayout tabLayout = this.A02;
        Rect bounds = tabLayout.A0J.getBounds();
        tabLayout.A0J.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public void draw(Canvas canvas) {
        int i;
        TabLayout tabLayout = this.A02;
        int height = tabLayout.A0J.getBounds().height();
        if (height < 0) {
            height = tabLayout.A0J.getIntrinsicHeight();
        }
        int i2 = tabLayout.A08;
        if (i2 == 0) {
            i = getHeight() - height;
            height = getHeight();
        } else if (i2 != 1) {
            i = 0;
            if (i2 != 2) {
                if (i2 != 3) {
                    height = 0;
                }
                height = getHeight();
            }
        } else {
            i = (getHeight() - height) / 2;
            height = (getHeight() + height) / 2;
        }
        if (tabLayout.A0J.getBounds().width() > 0) {
            Rect bounds = tabLayout.A0J.getBounds();
            tabLayout.A0J.setBounds(bounds.left, i, bounds.right, height);
            tabLayout.A0J.draw(canvas);
        }
        super.draw(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            TabLayout tabLayout = this.A02;
            int i5 = tabLayout.A02;
            if (i5 == -1) {
                i5 = tabLayout.getSelectedTabPosition();
                tabLayout.A02 = i5;
            }
            A01(this, i5);
            return;
        }
        TabLayout tabLayout2 = this.A02;
        int selectedTabPosition = tabLayout2.getSelectedTabPosition();
        if (tabLayout2.A02 != selectedTabPosition) {
            View childAt = getChildAt(selectedTabPosition);
            View childAt2 = getChildAt(selectedTabPosition);
            if (childAt2 == null) {
                A01(this, tabLayout2.getSelectedTabPosition());
                return;
            }
            tabLayout2.A02 = selectedTabPosition;
            C26317Cxa cxa = new C26317Cxa(childAt, childAt2, this, 2);
            this.A00.removeAllUpdateListeners();
            this.A00.addUpdateListener(cxa);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            TabLayout tabLayout = this.A02;
            if (tabLayout.A05 == 1 || tabLayout.A03 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 > 0) {
                    if (i3 * childCount <= getMeasuredWidth() - (((int) AnonymousClass1YU.A00(getContext(), 16)) * 2)) {
                        boolean z = false;
                        for (int i5 = 0; i5 < childCount; i5++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                            if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i3;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.A05 = 0;
                        tabLayout.A0J(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (Build.VERSION.SDK_INT < 23 && this.A01 != i) {
            requestLayout();
            this.A01 = i;
        }
    }
}
