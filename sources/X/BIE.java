package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class BIE extends FrameLayout {
    public static final View.OnTouchListener A0B = new D51(0);
    public int A00;
    public ColorStateList A01;
    public Rect A02;
    public C28011Ym A03;
    public C26155CtN A04;
    public boolean A05;
    public PorterDuff.Mode A06;
    public final float A07;
    public final float A08;
    public final int A09;
    public final int A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1Xq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BIE(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r4 = 0
            android.content.Context r0 = X.C27771Xm.A00(r6, r7, r4, r4)
            r5.<init>(r0, r7)
            android.content.Context r2 = r5.getContext()
            int[] r0 = X.C27781Xn.A0g
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r7, r0)
            r0 = 6
            r1 = 6
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0022
            int r0 = r3.getDimensionPixelSize(r1, r4)
            float r0 = (float) r0
            X.AnonymousClass1HF.A0W(r5, r0)
        L_0x0022:
            r0 = 2
            int r0 = r3.getInt(r0, r4)
            r5.A00 = r0
            r0 = 8
            boolean r0 = r3.hasValue(r0)
            if (r0 != 0) goto L_0x0039
            r0 = 9
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0044
        L_0x0039:
            X.1Yp r1 = X.C28011Ym.A01(r2, r7, r4, r4)
            X.1Ym r0 = new X.1Ym
            r0.<init>(r1)
            r5.A03 = r0
        L_0x0044:
            r0 = 3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = r3.getFloat(r0, r4)
            r5.A08 = r0
            r0 = 4
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r2, r3, r0)
            r5.setBackgroundTintList(r0)
            r0 = 5
            r2 = -1
            int r1 = r3.getInt(r0, r2)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass1YU.A01(r0, r1)
            r5.setBackgroundTintMode(r0)
            r0 = 1
            float r0 = r3.getFloat(r0, r4)
            r5.A07 = r0
            r0 = 0
            int r0 = r3.getDimensionPixelSize(r0, r2)
            r5.A0A = r0
            r0 = 7
            int r0 = r3.getDimensionPixelSize(r0, r2)
            r5.A09 = r0
            r3.recycle()
            android.view.View$OnTouchListener r0 = A0B
            r5.setOnTouchListener(r0)
            r0 = 1
            r5.setFocusable(r0)
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            if (r0 != 0) goto L_0x00bd
            float r2 = r5.A08
            r1 = 2130969148(0x7f04023c, float:1.754697E38)
            r0 = 2130969128(0x7f040228, float:1.754693E38)
            int r1 = X.AnonymousClass1ZA.A03(r5, r1)
            int r0 = X.AnonymousClass1ZA.A03(r5, r0)
            int r3 = X.AnonymousClass1ZA.A00(r2, r1, r0)
            X.1Ym r1 = r5.A03
            if (r1 == 0) goto L_0x00be
            android.os.Handler r0 = X.C26155CtN.A0M
            X.1Xq r2 = new X.1Xq
            r2.<init>((X.C28011Ym) r1)
            X.BE7.A1C(r2, r3)
        L_0x00ad:
            android.content.res.ColorStateList r0 = r5.A01
            android.graphics.drawable.Drawable r1 = X.C27831Xu.A02(r2)
            if (r0 == 0) goto L_0x00ba
            android.content.res.ColorStateList r0 = r5.A01
            X.C27831Xu.A03(r0, r1)
        L_0x00ba:
            r5.setBackground(r1)
        L_0x00bd:
            return
        L_0x00be:
            android.content.res.Resources r1 = r5.getResources()
            android.os.Handler r0 = X.C26155CtN.A0M
            r0 = 2131167925(0x7f070ab5, float:1.7950137E38)
            float r1 = r1.getDimension(r0)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r0 = 0
            r2.setShape(r0)
            r2.setCornerRadius(r1)
            r2.setColor(r3)
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIE.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public float getActionTextColorAlpha() {
        return this.A07;
    }

    public int getAnimationMode() {
        return this.A00;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.A08;
    }

    public int getMaxInlineActionWidth() {
        return this.A09;
    }

    public int getMaxWidth() {
        return this.A0A;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.A01 == null)) {
            drawable = C27831Xu.A02(drawable.mutate());
            C27831Xu.A03(this.A01, drawable);
            C27831Xu.A07(this.A06, drawable);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        if (getBackground() != null) {
            Drawable A022 = C27831Xu.A02(getBackground().mutate());
            C27831Xu.A03(colorStateList, A022);
            C27831Xu.A07(this.A06, A022);
            if (A022 != getBackground()) {
                super.setBackgroundDrawable(A022);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.A06 = mode;
        if (getBackground() != null) {
            Drawable A022 = C27831Xu.A02(getBackground().mutate());
            C27831Xu.A07(mode, A022);
            if (A022 != getBackground()) {
                super.setBackgroundDrawable(A022);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnTouchListener onTouchListener;
        if (onClickListener != null) {
            onTouchListener = null;
        } else {
            onTouchListener = A0B;
        }
        setOnTouchListener(onTouchListener);
        super.setOnClickListener(onClickListener);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C26155CtN ctN = this.A04;
        if (ctN != null) {
            ctN.A06();
        }
        AnonymousClass1HF.A0T(this);
    }

    public void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        C26155CtN ctN = this.A04;
        if (ctN != null) {
            C26218Cv5 A002 = C26218Cv5.A00();
            E2U e2u = ctN.A07;
            synchronized (A002.A03) {
                if (!C26218Cv5.A03(e2u, A002)) {
                    CQC cqc = A002.A01;
                    if (cqc == null || e2u == null || cqc.A02.get() != e2u) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                C27080DTf.A00(C26155CtN.A0M, ctN, 22);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C26155CtN ctN = this.A04;
        if (ctN != null && ctN.A09) {
            C26155CtN.A03(ctN);
            ctN.A09 = false;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A0A;
        if (i3 > 0 && getMeasuredWidth() > i3) {
            super.onMeasure(BE7.A06(i3), i2);
        }
    }

    public void setBackground(Drawable drawable) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.A05 && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.A02 = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            C26155CtN ctN = this.A04;
            if (ctN != null) {
                C26155CtN.A04(ctN);
            }
        }
    }

    public void setAnimationMode(int i) {
        this.A00 = i;
    }
}
