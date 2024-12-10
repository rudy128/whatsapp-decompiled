package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass1b8;
import X.AnonymousClass1bA;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass793;
import X.C108945cZ;
import X.C108965cb;
import X.C109885eB;
import X.C110925hV;
import X.C142687Ak;
import X.C23521Gp;
import X.C84144If;
import X.C90104dX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

public class PagerSlidingTabStrip extends HorizontalScrollView implements AnonymousClass009 {
    public static final int[] A0T;
    public float A00;
    public int A01;
    public int A02;
    public C23521Gp A03;
    public ViewPager A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public Locale A0K;
    public boolean A0L;
    public final LinearLayout A0M;
    public final int A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final LinearLayout.LayoutParams A0Q;
    public final LinearLayout.LayoutParams A0R;
    public final C142687Ak A0S;

    private void A00() {
        for (int i = 0; i < this.A02; i++) {
            View childAt = this.A0M.getChildAt(i);
            childAt.setBackgroundResource(this.A0N);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A0G);
                textView.setTypeface((Typeface) null, this.A0H);
                textView.setTextColor(this.A0F);
                textView.setAllCaps(true);
            }
        }
    }

    public void A03(View view, String str, int i) {
        LinearLayout.LayoutParams layoutParams;
        view.setFocusable(true);
        C90104dX.A00(view, this, i, 1);
        int i2 = this.A0E;
        view.setPadding(i2, 0, i2, 0);
        AnonymousClass1HF.A0f(view, new C110925hV(view, this, str, i));
        LinearLayout linearLayout = this.A0M;
        if (this.A0L) {
            layoutParams = this.A0R;
        } else {
            layoutParams = this.A0Q;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    public void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02 != 0) {
            int height = getHeight();
            Paint paint = this.A0P;
            paint.setColor(this.A0A);
            LinearLayout linearLayout = this.A0M;
            View childAt = linearLayout.getChildAt(this.A01);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.A00 > 0.0f && (i = this.A01) < this.A02 - 1) {
                View childAt2 = linearLayout.getChildAt(i + 1);
                float left2 = (float) childAt2.getLeft();
                float right2 = (float) childAt2.getRight();
                float f = this.A00;
                float f2 = 1.0f - f;
                left = (left2 * f) + (f2 * left);
                right = (right2 * f) + (f2 * right);
            }
            float f3 = (float) height;
            canvas2.drawRect(left, (float) (height - this.A0B), right, f3, paint);
            paint.setColor(this.A0I);
            canvas2.drawRect(0.0f, (float) (height - this.A0J), C108945cZ.A03(linearLayout), f3, paint);
            Paint paint2 = this.A0O;
            paint2.setColor(this.A07);
            for (int i2 = 0; i2 < this.A02 - 1; i2++) {
                View childAt3 = linearLayout.getChildAt(i2);
                int i3 = this.A08;
                canvas2.drawLine((float) childAt3.getRight(), (float) i3, (float) childAt3.getRight(), (float) (height - i3), paint2);
            }
        }
    }

    public static void A01(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        if (pagerSlidingTabStrip.A02 != 0) {
            int left = pagerSlidingTabStrip.A0M.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= pagerSlidingTabStrip.A0D;
            }
            if (left != pagerSlidingTabStrip.A0C) {
                pagerSlidingTabStrip.A0C = left;
                pagerSlidingTabStrip.scrollTo(left, 0);
            }
        }
    }

    public void A02() {
        String str;
        this.A0M.removeAllViews();
        this.A02 = this.A04.getAdapter().A0E();
        for (int i = 0; i < this.A02; i++) {
            CharSequence A0C2 = this.A04.getAdapter().A0C(i);
            if (A0C2 != null) {
                str = A0C2.toString();
            } else {
                str = "";
            }
            AnonymousClass1b8 adapter = this.A04.getAdapter();
            if (adapter instanceof AnonymousClass1bA) {
                A03(((AnonymousClass1bA) adapter).BW7(i), str, i);
            } else {
                TextView textView = new TextView(getContext());
                textView.setText(str);
                textView.setGravity(17);
                textView.setSingleLine();
                A03(textView, str, i);
            }
        }
        A00();
        AnonymousClass793.A00(getViewTreeObserver(), this, 1);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C109885eB r2 = (C109885eB) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A01 = r2.A00;
        requestLayout();
    }

    public void setShouldExpand(boolean z) {
        this.A0L = z;
        requestLayout();
    }

    public void setTextColor(int i) {
        this.A0F = i;
        A00();
    }

    public void setTextSize(int i) {
        this.A0G = i;
        A00();
    }

    public void setUnderlineColor(int i) {
        this.A0I = i;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.A04 = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.A0C = this.A0S;
            A02();
            return;
        }
        throw AnonymousClass000.A0n("ViewPager does not have adapter instance.");
    }

    static {
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 16842901;
        A1W[1] = 16842904;
        A0T = A1W;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
        this.A0S = new C142687Ak(this);
        this.A01 = 0;
        this.A00 = 0.0f;
        this.A0A = -10066330;
        this.A0I = 436207616;
        this.A07 = 436207616;
        this.A0L = true;
        this.A0D = 52;
        this.A0B = 3;
        this.A0J = 1;
        this.A08 = 12;
        this.A0E = 8;
        this.A09 = 1;
        this.A0G = 12;
        this.A0F = -10066330;
        this.A0H = 1;
        this.A0C = 0;
        this.A0N = 2131231073;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.A0M = linearLayout;
        linearLayout.setOrientation(0);
        C108965cb.A12(linearLayout, -1);
        addView(linearLayout);
        linearLayout.setImportantForAccessibility(2);
        DisplayMetrics A092 = AnonymousClass3Ma.A09(this);
        this.A0D = (int) TypedValue.applyDimension(1, (float) this.A0D, A092);
        this.A0B = (int) TypedValue.applyDimension(1, (float) this.A0B, A092);
        this.A0J = (int) TypedValue.applyDimension(1, (float) this.A0J, A092);
        this.A08 = (int) TypedValue.applyDimension(1, (float) this.A08, A092);
        this.A0E = (int) TypedValue.applyDimension(1, (float) this.A0E, A092);
        this.A09 = (int) TypedValue.applyDimension(1, (float) this.A09, A092);
        this.A0G = (int) TypedValue.applyDimension(2, (float) this.A0G, A092);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0T);
        this.A0G = obtainStyledAttributes.getDimensionPixelSize(0, this.A0G);
        this.A0F = obtainStyledAttributes.getColor(1, this.A0F);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C84144If.A0G);
        this.A0A = obtainStyledAttributes2.getColor(1, this.A0A);
        this.A07 = obtainStyledAttributes2.getColor(0, this.A07);
        this.A0E = obtainStyledAttributes2.getDimensionPixelSize(2, this.A0E);
        obtainStyledAttributes2.recycle();
        Paint A062 = AnonymousClass3MW.A06();
        this.A0P = A062;
        A062.setAntiAlias(true);
        C108945cZ.A1L(A062);
        Paint A063 = AnonymousClass3MW.A06();
        this.A0O = A063;
        A063.setAntiAlias(true);
        A063.setStrokeWidth((float) this.A09);
        this.A0Q = new LinearLayout.LayoutParams(-2, -1);
        this.A0R = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.A0K == null) {
            this.A0K = getResources().getConfiguration().locale;
        }
    }

    public int getTextColor() {
        return this.A0F;
    }

    public int getTextSize() {
        return this.A0G;
    }

    public Parcelable onSaveInstanceState() {
        return new C109885eB(super.onSaveInstanceState(), this.A01);
    }

    public void setOnPageChangeListener(C23521Gp r1) {
        this.A03 = r1;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }
}
