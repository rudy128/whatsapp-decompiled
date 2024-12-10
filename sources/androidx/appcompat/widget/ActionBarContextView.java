package androidx.appcompat.widget;

import X.AnonymousClass03I;
import X.AnonymousClass0Y0;
import X.AnonymousClass1HC;
import X.AnonymousClass1HF;
import X.C002401c;
import X.C002501d;
import X.C002801g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends ViewGroup {
    public int A00;
    public View A01;
    public AnonymousClass1HC A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public View A0A;
    public LinearLayout A0B;
    public TextView A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public AnonymousClass03I A0G;
    public ActionMenuView A0H;
    public final Context A0I;
    public final AnonymousClass0Y0 A0J;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A0J = new AnonymousClass0Y0(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(2130968591, typedValue, true) || (i2 = typedValue.resourceId) == 0) {
            this.A0I = context;
        } else {
            this.A0I = new ContextThemeWrapper(context, i2);
        }
        C002401c A002 = C002401c.A00(context, attributeSet, C002501d.A03, i, 0);
        setBackground(A002.A03(0));
        TypedArray typedArray = A002.A02;
        this.A08 = typedArray.getResourceId(5, 0);
        this.A07 = typedArray.getResourceId(4, 0);
        this.A00 = typedArray.getLayoutDimension(3, 0);
        this.A06 = typedArray.getResourceId(2, 2131623941);
        typedArray.recycle();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void A01() {
        if (this.A0B == null) {
            LayoutInflater.from(getContext()).inflate(2131623936, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.A0B = linearLayout;
            this.A0D = (TextView) linearLayout.findViewById(2131427478);
            this.A0C = (TextView) this.A0B.findViewById(2131427477);
            int i = this.A08;
            if (i != 0) {
                this.A0D.setTextAppearance(getContext(), i);
            }
            int i2 = this.A07;
            if (i2 != 0) {
                this.A0C.setTextAppearance(getContext(), i2);
            }
        }
        this.A0D.setText(this.A04);
        this.A0C.setText(this.A03);
        boolean z = !TextUtils.isEmpty(this.A04);
        boolean z2 = !TextUtils.isEmpty(this.A03);
        TextView textView = this.A0C;
        int i3 = 0;
        int i4 = 8;
        if (z2) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        LinearLayout linearLayout2 = this.A0B;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.A0B.getParent() == null) {
            addView(this.A0B);
        }
    }

    public AnonymousClass1HC A04(int i, long j) {
        AnonymousClass1HC A0B2;
        AnonymousClass1HC r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
        float f = 0.0f;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            A0B2 = AnonymousClass1HF.A0B(this);
            f = 1.0f;
        } else {
            A0B2 = AnonymousClass1HF.A0B(this);
        }
        A0B2.A03(f);
        A0B2.A08(j);
        AnonymousClass0Y0 r02 = this.A0J;
        r02.A00(A0B2, i);
        A0B2.A0B(r02);
        return A0B2;
    }

    public void A06() {
        AnonymousClass03I r0 = this.A0G;
        if (r0 != null) {
            r0.A0L();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass02B r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x0066
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            int r1 = r4.A06
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r4, r0)
            r4.A01 = r0
        L_0x0015:
            r4.addView(r0)
        L_0x0018:
            android.view.View r1 = r4.A01
            r0 = 2131427512(0x7f0b00b8, float:1.8476642E38)
            android.view.View r1 = r1.findViewById(r0)
            r4.A09 = r1
            X.0Rb r0 = new X.0Rb
            r0.<init>(r5, r4)
            r1.setOnClickListener(r0)
            X.01m r3 = r5.A02()
            X.03I r0 = r4.A0G
            if (r0 == 0) goto L_0x0036
            r0.A0A()
        L_0x0036:
            android.content.Context r1 = r4.getContext()
            X.03I r0 = new X.03I
            r0.<init>(r1)
            r4.A0G = r0
            r0.A0E()
            r1 = -2
            r0 = -1
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r0)
            X.03I r1 = r4.A0G
            android.content.Context r0 = r4.A0I
            r3.A0N(r0, r1)
            X.03I r0 = r4.A0G
            X.01z r1 = r0.A09(r4)
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r4.A0H = r1
            r0 = 0
            r1.setBackground(r0)
            androidx.appcompat.widget.ActionMenuView r0 = r4.A0H
            r4.addView(r0, r2)
            return
        L_0x0066:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0018
            android.view.View r0 = r4.A01
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.A07(X.02B):void");
    }

    /* renamed from: getAnimatedVisibility$AbsActionBarView */
    public int getAnimatedVisibility() {
        if (this.A02 != null) {
            return this.A0J.A00;
        }
        return getVisibility();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        boolean z2 = C002801g.A01;
        boolean z3 = true;
        if (getLayoutDirection() == 1) {
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            z3 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.A01;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
            if (z3) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i8;
            }
            int A002 = i6 + A00(this.A01, i6, paddingTop, paddingTop2, z3);
            if (z3) {
                paddingLeft = A002 - i5;
            } else {
                paddingLeft = A002 + i5;
            }
        }
        LinearLayout linearLayout = this.A0B;
        if (!(linearLayout == null || this.A0A != null || linearLayout.getVisibility() == 8)) {
            paddingLeft += A00(this.A0B, paddingLeft, paddingTop, paddingTop2, z3);
        }
        View view2 = this.A0A;
        if (view2 != null) {
            A00(view2, paddingLeft, paddingTop, paddingTop2, z3);
        }
        if (z3) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.A0H;
        if (actionMenuView != null) {
            A00(actionMenuView, paddingRight, paddingTop, paddingTop2, !z3);
        }
    }

    public void setCustomView(View view) {
        View view2 = this.A0A;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0A = view;
        if (view != null) {
            LinearLayout linearLayout = this.A0B;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.A0B = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A03 = charSequence;
        A01();
    }

    public void setTitle(CharSequence charSequence) {
        this.A04 = charSequence;
        A01();
        AnonymousClass1HF.A0n(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.A05) {
            requestLayout();
        }
        this.A05 = z;
    }

    public static int A00(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public void A05() {
        removeAllViews();
        this.A0A = null;
        this.A0H = null;
        this.A0G = null;
        View view = this.A09;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return this.A00;
    }

    public int getContentHeight$AbsActionBarView() {
        return this.A00;
    }

    public CharSequence getSubtitle() {
        return this.A03;
    }

    public CharSequence getTitle() {
        return this.A04;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C002501d.A00, 2130968594, 0);
        this.A00 = obtainStyledAttributes.getLayoutDimension(13, 0);
        obtainStyledAttributes.recycle();
        AnonymousClass03I r0 = this.A0G;
        if (r0 != null) {
            r0.A0C();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass03I r0 = this.A0G;
        if (r0 != null) {
            r0.A0I();
            this.A0G.A0B();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0E = false;
        }
        if (!this.A0E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0E = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0E = false;
            return true;
        }
        return true;
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.A00;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.A01;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                int max = Math.max(0, paddingLeft - view.getMeasuredWidth());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
                paddingLeft = max - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.A0H;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                ActionMenuView actionMenuView2 = this.A0H;
                actionMenuView2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - actionMenuView2.getMeasuredWidth());
            }
            LinearLayout linearLayout = this.A0B;
            if (linearLayout != null && this.A0A == null) {
                if (this.A05) {
                    this.A0B.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.A0B.getMeasuredWidth();
                    boolean z = false;
                    if (measuredWidth <= paddingLeft) {
                        z = true;
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.A0B;
                    int i6 = 8;
                    if (z) {
                        i6 = 0;
                    }
                    linearLayout2.setVisibility(i6);
                } else {
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                    paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                }
            }
            View view2 = this.A0A;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = Integer.MIN_VALUE;
                if (i7 != -2) {
                    i8 = 1073741824;
                    if (i7 >= 0) {
                        paddingLeft = Math.min(i7, paddingLeft);
                    }
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i3 = Integer.MIN_VALUE;
                } else if (i9 >= 0) {
                    i5 = Math.min(i9, i5);
                }
                this.A0A.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.A00 <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0F = false;
        }
        if (!this.A0F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0F = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0F = false;
            return true;
        }
        return true;
    }

    /* renamed from: setVisibility$AbsActionBarView */
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            AnonymousClass1HC r0 = this.A02;
            if (r0 != null) {
                r0.A01();
            }
            super.setVisibility(i);
        }
    }

    public void setContentHeight(int i) {
        this.A00 = i;
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968617);
    }
}
