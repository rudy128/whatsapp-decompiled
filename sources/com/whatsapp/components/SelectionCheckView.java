package com.whatsapp.components;

import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.C72453Mb;
import X.C72463Mc;
import X.C74603c1;
import X.C84144If;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

public class SelectionCheckView extends FrameLayout {
    public ShapeDrawable A00;
    public View A01;
    public AnimationSet A02;
    public AnimationSet A03;
    public ScaleAnimation A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public int A0E;
    public boolean A0F = true;

    private ScaleAnimation A00(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        C72463Mc.A17(scaleAnimation, 100);
        scaleAnimation.setRepeatCount(0);
        C74603c1.A00(scaleAnimation, this, view, 1);
        return scaleAnimation;
    }

    private ScaleAnimation A01(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        C74603c1.A00(scaleAnimation, this, view, 2);
        return scaleAnimation;
    }

    public void A03(Context context, AttributeSet attributeSet) {
        String str;
        this.A0C = false;
        int i = 2131231807;
        int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130971138, 2131102453);
        int A023 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970064, 2131101205);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168609);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0N);
            i = obtainStyledAttributes.getResourceId(2, 2131231807);
            str = obtainStyledAttributes.getString(3);
            A022 = obtainStyledAttributes.getColor(4, A022);
            A023 = obtainStyledAttributes.getColor(0, A023);
            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        this.A0E = A022;
        if (str == null) {
            str = context.getString(2131888275);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ShapeDrawable A0P = C72453Mb.A0P();
        A0P.getPaint().setColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130971139, 2131102454));
        ShapeDrawable A0P2 = C72453Mb.A0P();
        this.A00 = A0P2;
        A0P2.getPaint().setColor(A023);
        FrameLayout A0B2 = AnonymousClass3Ma.A0B(this);
        this.A0A = A0B2;
        A0B2.setLayoutParams(layoutParams);
        this.A0A.setBackground(A0P);
        this.A0A.setForeground(this.A00);
        this.A0A.setVisibility(4);
        addView(this.A0A);
        ShapeDrawable A0P3 = C72453Mb.A0P();
        A0P3.getPaint().setColor(A022);
        this.A01 = C72453Mb.A0f(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 17);
        layoutParams2.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A01.setLayoutParams(layoutParams2);
        this.A01.setBackground(A0P3);
        this.A01.setVisibility(4);
        addView(this.A01);
        WaImageView A0f = C72453Mb.A0f(this);
        this.A0B = A0f;
        A0f.setLayoutParams(layoutParams);
        AnonymousClass4aX.A0D(this.A0B, AnonymousClass3MZ.A02(getContext(), getContext(), 2130971137, 2131102452));
        this.A0B.setImageDrawable(AnonymousClass3MZ.A0B(this, i));
        this.A0B.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.A0B.setVisibility(4);
        this.A0B.setContentDescription(str);
        addView(this.A0B);
    }

    private void A02() {
        ScaleAnimation A002 = A00(this.A0A);
        this.A06 = A002;
        A002.setStartOffset(20);
        this.A08 = A00(this.A01);
        ScaleAnimation A003 = A00(this.A0B);
        this.A04 = A003;
        A003.setStartOffset(10);
        AnimationSet animationSet = new AnimationSet(false);
        this.A02 = animationSet;
        animationSet.addAnimation(this.A06);
        this.A02.addAnimation(this.A08);
        this.A02.addAnimation(this.A04);
        this.A07 = A01(this.A0A);
        ScaleAnimation A012 = A01(this.A01);
        this.A09 = A012;
        A012.setStartOffset(20);
        ScaleAnimation A013 = A01(this.A0B);
        this.A05 = A013;
        A013.setStartOffset(10);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A03 = animationSet2;
        animationSet2.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A0C = true;
    }

    public void A04(boolean z, boolean z2) {
        int i;
        FrameLayout frameLayout;
        AnimationSet animationSet;
        if (this.A0D != z) {
            if (z) {
                if (z2) {
                    if (!this.A0C) {
                        A02();
                    }
                    setVisibility(0);
                    this.A0A.clearAnimation();
                    this.A01.clearAnimation();
                    this.A0B.clearAnimation();
                    this.A0A.setAnimation(this.A06);
                    this.A01.setAnimation(this.A08);
                    this.A0B.setAnimation(this.A04);
                    this.A0A.setForeground(this.A00);
                    animationSet = this.A02;
                } else {
                    i = 0;
                    setVisibility(0);
                    frameLayout = this.A0A;
                    frameLayout.setVisibility(i);
                    this.A01.setVisibility(i);
                    this.A0B.setVisibility(i);
                    this.A0D = z;
                }
            } else if (z2) {
                if (!this.A0C) {
                    A02();
                }
                this.A0A.clearAnimation();
                this.A01.clearAnimation();
                this.A0B.clearAnimation();
                this.A0A.setAnimation(this.A07);
                this.A01.setAnimation(this.A09);
                this.A0B.setAnimation(this.A05);
                this.A0A.setForeground((Drawable) null);
                animationSet = this.A03;
            } else {
                frameLayout = this.A0A;
                i = 4;
                frameLayout.setVisibility(i);
                this.A01.setVisibility(i);
                this.A0B.setVisibility(i);
                this.A0D = z;
            }
            animationSet.start();
            this.A0D = z;
        }
    }

    public boolean isEnabled() {
        return this.A0F;
    }

    public void setEnabled(boolean z) {
        int A022;
        if (this.A0F != z) {
            if (z) {
                A022 = this.A0E;
            } else {
                A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130970094, 2131101215);
            }
            ShapeDrawable A0P = C72453Mb.A0P();
            A0P.getPaint().setColor(A022);
            this.A01.setBackground(A0P);
            this.A0F = z;
        }
    }

    public void setIcon(int i) {
        this.A0B.setImageDrawable(AnonymousClass3MZ.A0B(this, i));
    }

    public void setSelectionBackground(int i) {
        this.A01.setBackgroundResource(i);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context, attributeSet);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03(context, attributeSet);
    }

    public void setSelectionBackground(Drawable drawable) {
        this.A01.setBackground(drawable);
    }

    public SelectionCheckView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A03(context, attributeSet);
    }

    public SelectionCheckView(Context context) {
        super(context);
        A03(context, (AttributeSet) null);
    }
}
