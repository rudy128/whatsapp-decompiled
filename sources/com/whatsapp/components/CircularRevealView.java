package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3Mo;
import X.C72473Md;
import X.C90714eW;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public class CircularRevealView extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public final Animator.AnimatorListener A06;
    public final Paint A07;
    public final Path A08;
    public final RectF A09;
    public final Animation.AnimationListener A0A;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = C72473Md.A0F(this);
        this.A08 = new Path();
        this.A09 = AnonymousClass3MW.A08();
        this.A0A = new C90714eW(this, 0);
        this.A06 = new AnonymousClass3Mo(this, 7);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setColor(int i) {
    }

    public void setDuration(int i) {
        this.A02 = i;
    }

    public void setShouldClearOnRestart(boolean z) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = C72473Md.A0F(this);
        this.A08 = new Path();
        this.A09 = AnonymousClass3MW.A08();
        this.A0A = new C90714eW(this, 0);
        this.A06 = new AnonymousClass3Mo(this, 7);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A07 = C72473Md.A0F(this);
        this.A08 = new Path();
        this.A09 = AnonymousClass3MW.A08();
        this.A0A = new C90714eW(this, 0);
        this.A06 = new AnonymousClass3Mo(this, 7);
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public CircularRevealView(Context context) {
        super(context);
        this.A07 = C72473Md.A0F(this);
        this.A08 = new Path();
        this.A09 = AnonymousClass3MW.A08();
        this.A0A = new C90714eW(this, 0);
        this.A06 = new AnonymousClass3Mo(this, 7);
    }
}
