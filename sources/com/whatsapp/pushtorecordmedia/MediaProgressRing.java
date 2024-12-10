package com.whatsapp.pushtorecordmedia;

import X.AnonymousClass1F9;
import X.AnonymousClass3MW;
import X.AnonymousClass6Z1;
import X.AnonymousClass7AQ;
import X.C146517Pk;
import X.C1607889x;
import X.C18070vi;
import X.C22851Dl;
import X.C41111vp;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public final class MediaProgressRing extends View {
    public C1607889x A00;
    public Runnable A01;
    public boolean A02;
    public float A03;
    public final C22851Dl A04 = new AnonymousClass7AQ(this, 28);
    public final Paint A05 = AnonymousClass3MW.A06();
    public final RectF A06 = AnonymousClass3MW.A08();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaProgressRing(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00(attributeSet);
    }

    public void onDraw(Canvas canvas) {
        float value;
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        C1607889x r0 = this.A00;
        if (r0 != null) {
            int BUQ = r0.BUQ();
            if (BUQ == 0) {
                value = 0.0f;
            } else {
                value = ((float) r0.getValue()) / ((float) BUQ);
            }
            canvas2.drawArc(this.A06, -90.0f, value * 360.0f, false, this.A05);
            if (this.A02) {
                postInvalidateOnAnimation();
            }
        }
    }

    public final void A01() {
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int getColor() {
        return this.A05.getColor();
    }

    public final void setColor(int i) {
        this.A05.setColor(i);
    }

    private final void A00(AttributeSet attributeSet) {
        Context context = getContext();
        this.A03 = AnonymousClass3MW.A00(context.getResources(), 2131166286);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z1.A00);
            C18070vi.A0X(obtainStyledAttributes);
            setColor(obtainStyledAttributes.getColor(0, -16777216));
            obtainStyledAttributes.recycle();
        }
        Paint paint = this.A05;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.BUTT);
        AnonymousClass3MW.A1P(paint);
        paint.setStrokeWidth(this.A03);
    }

    public final void A02(AnonymousClass1F9 r4, C1607889x r5) {
        C18070vi.A0h(r4, r5);
        A01();
        this.A00 = r5;
        C41111vp BZB = r5.BZB();
        BZB.A0A(r4, this.A04);
        this.A01 = new C146517Pk(this, BZB, 15);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A06;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        float f = this.A03 / 2.0f;
        rectF.inset(f, f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaProgressRing(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaProgressRing(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A00((AttributeSet) null);
    }
}
