package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass190;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass85J;
import X.C121786Lm;
import X.C1405671z;
import X.C17880vN;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ShapePickerView extends RelativeLayout implements AnonymousClass009, AnonymousClass85J {
    public ValueAnimator A00;
    public Bitmap A01;
    public Bitmap A02;
    public AnonymousClass190 A03;
    public AnonymousClass10I A04;
    public AnonymousClass031 A05;
    public RectF A06;
    public C1405671z A07;
    public C121786Lm A08;
    public boolean A09;
    public final Paint A0A;

    public void A00() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A03 = AnonymousClass3MY.A0N(A0O);
            this.A04 = AnonymousClass10E.AL1(A0O);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4.A02 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02() {
        /*
            r4 = this;
            X.6Lm r0 = r4.A08
            X.C17890vO.A0t(r0)
            android.animation.ValueAnimator r0 = r4.A00
            if (r0 == 0) goto L_0x000c
            r0.cancel()
        L_0x000c:
            r3 = 0
            r4.A06 = r3
            android.graphics.Bitmap r2 = r4.A01
            if (r2 != 0) goto L_0x0018
            android.graphics.Bitmap r0 = r4.A02
            r1 = 0
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r1 = 1
            if (r2 == 0) goto L_0x0020
            r2.recycle()
            r4.A01 = r3
        L_0x0020:
            android.graphics.Bitmap r0 = r4.A02
            if (r0 == 0) goto L_0x0029
            r0.recycle()
            r4.A02 = r3
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerView.A02():boolean");
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A0A);
        }
        super.draw(canvas);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        this.A0A = AnonymousClass3MZ.A0A();
    }

    public void A01(Bitmap bitmap, C1405671z r11) {
        if (A02()) {
            invalidate();
        }
        if (r11.A04 <= 0 || r11.A03 <= 0) {
            this.A03.A0F("shape-picker-doodle-view-state-dimen", r11.toString(), C17880vN.A11(), true);
            return;
        }
        this.A07 = r11;
        this.A02 = bitmap;
        RectF rectF = r11.A0B;
        this.A06 = new RectF(rectF);
        C121786Lm r2 = new C121786Lm(r11.A05, new Rect(0, 0, r11.A04, r11.A03), new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), this);
        this.A08 = r2;
        this.A04.CGD(r2, bitmap);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1405671z r1 = this.A07;
        if (r1 != null && this.A02 != null && !r1.A0B.equals(this.A06)) {
            A01(this.A02.copy(Bitmap.Config.ARGB_8888, true), this.A07);
        }
    }

    public ShapePickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public ShapePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0A = AnonymousClass3MZ.A0A();
    }

    public ShapePickerView(Context context) {
        super(context);
        A00();
        this.A0A = AnonymousClass3MZ.A0A();
    }
}
