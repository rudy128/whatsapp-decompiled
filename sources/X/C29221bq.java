package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.1bq  reason: invalid class name and case insensitive filesystem */
public abstract class C29221bq extends FrameLayout implements C008003p {
    public static final C29241bs A0U = new Object();
    public static final C29241bs A0V = new Object();
    public static final int[] A0W = {16842912};
    public float A00 = 0.0f;
    public int A01 = -1;
    public int A02;
    public ValueAnimator A03;
    public Drawable A04;
    public AnonymousClass03G A05;
    public C29341c3 A06;
    public C29241bs A07 = A0U;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H;
    public int A0I;
    public ColorStateList A0J;
    public ColorStateList A0K;
    public Drawable A0L;
    public Drawable A0M;
    public boolean A0N;
    public final ImageView A0O;
    public final View A0P;
    public final ViewGroup A0Q;
    public final FrameLayout A0R;
    public final TextView A0S;
    public final TextView A0T;

    public static int A00(Context context, int i) {
        int i2;
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C27781Xn.A0i);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                if (Build.VERSION.SDK_INT >= 22) {
                    i2 = typedValue.getComplexUnit();
                } else {
                    i2 = (typedValue.data >> 0) & 15;
                }
                int i3 = typedValue.data;
                if (i2 == 2) {
                    return Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density);
                }
                return TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
            }
        }
        return 0;
    }

    public boolean CCE() {
        return false;
    }

    public abstract int getItemDefaultMarginResId();

    public abstract int getItemLayoutResId();

    private void A01() {
        Drawable drawable = this.A04;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.A0K != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.A08 && getActiveIndicatorDrawable() != null && this.A0R != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(AnonymousClass1ZD.A02(this.A0K), (Drawable) null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(AnonymousClass1ZD.A01(this.A0K), (Drawable) null, (Drawable) null);
            }
        }
        FrameLayout frameLayout = this.A0R;
        if (frameLayout != null) {
            frameLayout.setBackground(rippleDrawable);
        }
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    private void A02(float f, float f2) {
        this.A0D = f - f2;
        this.A0C = (f2 * 1.0f) / f;
        this.A0B = (f * 1.0f) / f2;
    }

    public static void A04(C29221bq r6, float f, float f2) {
        View view = r6.A0P;
        if (view != null) {
            C29241bs r3 = r6.A07;
            TimeInterpolator timeInterpolator = AnonymousClass1YW.A00;
            float f3 = 0.4f + (f * (1.0f - 0.4f));
            view.setScaleX(f3);
            if (!(r3 instanceof C29251bt)) {
                f3 = 1.0f;
            }
            view.setScaleY(f3);
            float f4 = 0.0f;
            if (f2 == 0.0f) {
                f4 = 0.8f;
            }
            float f5 = 0.2f;
            if (f2 == 0.0f) {
                f5 = 1.0f;
            }
            view.setAlpha(AnonymousClass1YW.A00(0.0f, 1.0f, f4, f5, f));
        }
        r6.A00 = f;
    }

    public static void A05(C29221bq r5, int i) {
        int i2;
        View view = r5.A0P;
        if (view != null) {
            int min = Math.min(r5.A0F, i - (r5.A0G * 2));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!r5.A09 || r5.A02 != 2) {
                i2 = r5.A0E;
            } else {
                i2 = min;
            }
            layoutParams.height = i2;
            layoutParams.width = min;
            view.setLayoutParams(layoutParams);
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.A0R;
        if (frameLayout == null) {
            return this.A0O;
        }
        return frameLayout;
    }

    private int getSuggestedIconHeight() {
        int i;
        C29341c3 r0 = this.A06;
        if (r0 != null) {
            i = r0.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((ViewGroup.MarginLayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.A0O.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        C29341c3 r0 = this.A06;
        if (r0 == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = r0.getMinimumWidth() - this.A06.A08.A03.A0E.intValue();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, marginLayoutParams.leftMargin) + this.A0O.getMeasuredWidth() + Math.max(minimumWidth, marginLayoutParams.rightMargin);
    }

    public void BdW(AnonymousClass03G r4) {
        CharSequence title;
        this.A05 = r4;
        refreshDrawableState();
        setChecked(r4.isChecked());
        setEnabled(r4.isEnabled());
        setIcon(r4.getIcon());
        setTitle(r4.getTitle());
        setId(r4.getItemId());
        if (!TextUtils.isEmpty(r4.getContentDescription())) {
            setContentDescription(r4.getContentDescription());
        }
        if (!TextUtils.isEmpty(r4.getTooltipText())) {
            title = r4.getTooltipText();
        } else {
            title = r4.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            AnonymousClass03N.A00(this, title);
        }
        int i = 8;
        if (r4.isVisible()) {
            i = 0;
        }
        setVisibility(i);
        this.A0A = true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.A0R;
        if (frameLayout != null && this.A08) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.A0P;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.A0Q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        return getSuggestedIconHeight() + marginLayoutParams.topMargin + viewGroup.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.A0Q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), marginLayoutParams.leftMargin + viewGroup.getMeasuredWidth() + marginLayoutParams.rightMargin);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        AnonymousClass03G r1 = this.A05;
        if (r1 != null && r1.isCheckable() && r1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0W);
        }
        return onCreateDrawableState;
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.A0P;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            A01();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.A08 = z;
        A01();
        View view = this.A0P;
        if (view != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.A0E = i;
        A05(this, getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.A0G = i;
        A05(this, getWidth());
    }

    public void setActiveIndicatorWidth(int i) {
        this.A0F = i;
        A05(this, getWidth());
    }

    public void setBadge(C29341c3 r4) {
        ImageView imageView;
        C29341c3 r0 = this.A06;
        if (r0 != r4) {
            if (!(r0 == null || (imageView = this.A0O) == null)) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                if (this.A06 != null) {
                    setClipChildren(true);
                    setClipToPadding(true);
                    C60292nl.A01(imageView, this.A06);
                    this.A06 = null;
                }
            }
            this.A06 = r4;
            ImageView imageView2 = this.A0O;
            if (imageView2 != null && r4 != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C60292nl.A00(imageView2, this.A06);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        if (r10.A0N != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r11) {
        /*
            r10 = this;
            android.widget.TextView r6 = r10.A0S
            int r0 = r6.getWidth()
            r5 = 2
            int r0 = r0 / r5
            float r0 = (float) r0
            r6.setPivotX(r0)
            int r0 = r6.getBaseline()
            float r0 = (float) r0
            r6.setPivotY(r0)
            android.widget.TextView r4 = r10.A0T
            int r0 = r4.getWidth()
            int r0 = r0 / r5
            float r0 = (float) r0
            r4.setPivotX(r0)
            int r0 = r4.getBaseline()
            float r0 = (float) r0
            r4.setPivotY(r0)
            r3 = 0
            if (r11 == 0) goto L_0x002c
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x002c:
            boolean r0 = r10.A08
            if (r0 == 0) goto L_0x014c
            boolean r0 = r10.A0A
            if (r0 == 0) goto L_0x014c
            boolean r0 = r10.isAttachedToWindow()
            if (r0 == 0) goto L_0x014c
            android.animation.ValueAnimator r0 = r10.A03
            if (r0 == 0) goto L_0x0044
            r0.cancel()
            r0 = 0
            r10.A03 = r0
        L_0x0044:
            float[] r1 = new float[r5]
            r2 = 0
            float r0 = r10.A00
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r10.A03 = r1
            X.2uI r0 = new X.2uI
            r0.<init>(r10, r3, r2)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r3 = r10.A03
            android.content.Context r2 = r10.getContext()
            r1 = 2130970548(0x7f0407b4, float:1.754981E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A02
            android.animation.TimeInterpolator r0 = X.C29101bc.A01(r0, r2, r1)
            r3.setInterpolator(r0)
            android.animation.ValueAnimator r3 = r10.A03
            android.content.Context r2 = r10.getContext()
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131492904(0x7f0c0028, float:1.8609273E38)
            int r1 = r1.getInteger(r0)
            r0 = 2130970532(0x7f0407a4, float:1.7549777E38)
            int r0 = X.AnonymousClass1Z9.A00(r2, r0, r1)
            long r0 = (long) r0
            r3.setDuration(r0)
            android.animation.ValueAnimator r0 = r10.A03
            r0.start()
        L_0x008f:
            int r1 = r10.A02
            r0 = -1
            r2 = 17
            r8 = 49
            r7 = 4
            r3 = 0
            if (r1 == r0) goto L_0x00b9
            if (r1 == 0) goto L_0x00bd
            r0 = 1
            if (r1 == r0) goto L_0x00fa
            if (r1 != r5) goto L_0x00b2
            android.view.View r1 = r10.getIconOrContainer()
            int r0 = r10.A0I
            A03(r1, r0, r2)
            r0 = 8
            r6.setVisibility(r0)
            r4.setVisibility(r0)
        L_0x00b2:
            r10.refreshDrawableState()
            r10.setSelected(r11)
            return
        L_0x00b9:
            boolean r0 = r10.A0N
            if (r0 == 0) goto L_0x00fa
        L_0x00bd:
            android.view.View r1 = r10.getIconOrContainer()
            int r0 = r10.A0I
            if (r11 == 0) goto L_0x00e2
            A03(r1, r0, r8)
            android.view.ViewGroup r8 = r10.A0Q
            int r5 = r10.A0H
            int r2 = r8.getPaddingLeft()
            int r1 = r8.getPaddingTop()
            int r0 = r8.getPaddingRight()
            r8.setPadding(r2, r1, r0, r5)
            r6.setVisibility(r3)
        L_0x00de:
            r4.setVisibility(r7)
            goto L_0x00b2
        L_0x00e2:
            A03(r1, r0, r2)
            android.view.ViewGroup r5 = r10.A0Q
            int r2 = r5.getPaddingLeft()
            int r1 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            r5.setPadding(r2, r1, r0, r3)
            r6.setVisibility(r7)
            goto L_0x00de
        L_0x00fa:
            android.view.ViewGroup r9 = r10.A0Q
            int r5 = r10.A0H
            int r2 = r9.getPaddingLeft()
            int r1 = r9.getPaddingTop()
            int r0 = r9.getPaddingRight()
            r9.setPadding(r2, r1, r0, r5)
            android.view.View r2 = r10.getIconOrContainer()
            int r0 = r10.A0I
            if (r11 == 0) goto L_0x0131
            float r1 = (float) r0
            float r0 = r10.A0D
            float r1 = r1 + r0
            int r0 = (int) r1
            A03(r2, r0, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setVisibility(r3)
            float r0 = r10.A0C
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            goto L_0x00de
        L_0x0131:
            A03(r2, r0, r8)
            float r0 = r10.A0B
            r6.setScaleX(r0)
            r6.setScaleY(r0)
            r6.setVisibility(r7)
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r0)
            r4.setScaleY(r0)
            r4.setVisibility(r3)
            goto L_0x00b2
        L_0x014c:
            A04(r10, r3, r3)
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29221bq.setChecked(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.A0L) {
            this.A0L = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C27831Xu.A02(drawable).mutate();
                this.A0M = drawable;
                ColorStateList colorStateList = this.A0J;
                if (colorStateList != null) {
                    C27831Xu.A04(colorStateList, drawable);
                }
            }
            this.A0O.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.A0O;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.A0J = colorStateList;
        if (this.A05 != null && (drawable = this.A0M) != null) {
            C27831Xu.A04(colorStateList, drawable);
            this.A0M.invalidateSelf();
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.A04 = drawable;
        A01();
    }

    public void setItemPaddingBottom(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            AnonymousClass03G r0 = this.A05;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.A0I != i) {
            this.A0I = i;
            AnonymousClass03G r0 = this.A05;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A0K = colorStateList;
        A01();
    }

    public void setLabelVisibilityMode(int i) {
        C29241bs r0;
        if (this.A02 != i) {
            this.A02 = i;
            if (!this.A09 || i != 2) {
                r0 = A0U;
            } else {
                r0 = A0V;
            }
            this.A07 = r0;
            A05(this, getWidth());
            AnonymousClass03G r02 = this.A05;
            if (r02 != null) {
                setChecked(r02.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            AnonymousClass03G r0 = this.A05;
            if (r0 != null) {
                setChecked(r0.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        TextView textView = this.A0S;
        C29261bv.A08(textView, i);
        int A002 = A00(textView.getContext(), i);
        if (A002 != 0) {
            textView.setTextSize(0, (float) A002);
        }
        A02(this.A0T.getTextSize(), textView.getTextSize());
        textView.setTypeface(textView.getTypeface(), 1);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.A0T;
        C29261bv.A08(textView, i);
        int A002 = A00(textView.getContext(), i);
        if (A002 != 0) {
            textView.setTextSize(0, (float) A002);
        }
        A02(textView.getTextSize(), this.A0S.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.A0T.setTextColor(colorStateList);
            this.A0S.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A0T.setText(charSequence);
        this.A0S.setText(charSequence);
        AnonymousClass03G r0 = this.A05;
        if (r0 == null || TextUtils.isEmpty(r0.getContentDescription())) {
            setContentDescription(charSequence);
        }
        AnonymousClass03G r02 = this.A05;
        if (r02 != null && !TextUtils.isEmpty(r02.getTooltipText())) {
            charSequence = this.A05.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            AnonymousClass03N.A00(this, charSequence);
        }
    }

    public C29221bq(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.A0R = (FrameLayout) findViewById(2131432923);
        this.A0P = findViewById(2131432922);
        ImageView imageView = (ImageView) findViewById(2131432924);
        this.A0O = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(2131432925);
        this.A0Q = viewGroup;
        TextView textView = (TextView) findViewById(2131432927);
        this.A0T = textView;
        TextView textView2 = (TextView) findViewById(2131432926);
        this.A0S = textView2;
        setBackgroundResource(2131232690);
        this.A0I = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.A0H = viewGroup.getPaddingBottom();
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        A02(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C64702vC(this, 0));
        }
    }

    public static void A03(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C29221bq) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public C29341c3 getBadge() {
        return this.A06;
    }

    public int getItemBackgroundResId() {
        return 2131232690;
    }

    public AnonymousClass03G getItemData() {
        return this.A05;
    }

    public int getItemPosition() {
        return this.A01;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C29341c3 r0 = this.A06;
        if (r0 != null && r0.isVisible()) {
            AnonymousClass03G r02 = this.A05;
            CharSequence title = r02.getTitle();
            if (!TextUtils.isEmpty(r02.getContentDescription())) {
                title = this.A05.getContentDescription();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(title);
            sb.append(", ");
            sb.append(this.A06.A06());
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        C26228CvK cvK = new C26228CvK(accessibilityNodeInfo);
        cvK.A0a(C25476CgV.A00(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            cvK.A0f(false);
            cvK.A0M(C26137Ct0.A08);
        }
        cvK.A0V(getResources().getString(2131899098));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C449425j(this, i, 1));
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.A09 = z;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        C29301bz r0;
        super.setEnabled(z);
        this.A0T.setEnabled(z);
        this.A0S.setEnabled(z);
        this.A0O.setEnabled(z);
        if (z) {
            r0 = C29301bz.A00(getContext());
        } else {
            r0 = null;
        }
        AnonymousClass1HF.A0j(this, r0);
    }

    public void setItemPosition(int i) {
        this.A01 = i;
    }

    public void setItemBackground(int i) {
        Drawable A002;
        if (i == 0) {
            A002 = null;
        } else {
            A002 = C24261Jm.A00(getContext(), i);
        }
        setItemBackground(A002);
    }
}
