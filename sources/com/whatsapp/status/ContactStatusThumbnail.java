package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3qJ;
import X.AnonymousClass4IH;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.Map;

public class ContactStatusThumbnail extends AnonymousClass3qJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Map A05 = C17880vN.A11();
    public final RectF A06 = AnonymousClass3MW.A08();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(context, attributeSet);
    }

    public void A06(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        if (this.A00 > 0) {
            this.A04.setStrokeWidth(this.A00);
            AnonymousClass3MW.A1P(this.A04);
            this.A04.setStrokeCap(Paint.Cap.ROUND);
            RectF rectF = this.A06;
            float f = 0.0f;
            rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            float f2 = this.A00 / 2.0f;
            rectF.inset(f2, f2);
            this.A04.setColor(this.A01);
            canvas.drawOval(rectF, this.A04);
            int i2 = this.A00;
            float f3 = 360.0f / ((float) i2);
            if (i2 != 1) {
                if (f3 <= 24.0f) {
                    f = f3 / 2.0f;
                } else {
                    f = 12.0f;
                }
            }
            this.A04.setStrokeWidth(this.A00 - 1.0f);
            int i3 = this.A00;
            float f4 = -90.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                Paint paint = this.A04;
                Map map = this.A05;
                if (map.containsKey(Integer.valueOf(i4))) {
                    Object A0w = AnonymousClass000.A0w(map, i4);
                    if (A0w != null) {
                        i = AnonymousClass000.A0M(A0w);
                    } else {
                        throw C17890vO.A0K();
                    }
                } else if (i4 < this.A04) {
                    i = this.A03;
                } else {
                    i = this.A02;
                }
                paint.setColor(i);
                canvas2.drawArc(rectF, f4 + (f / 2.0f), f3 - f, false, this.A04);
                f4 += f3;
            }
        }
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IH.A00);
            C18070vi.A0X(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getInteger(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(2, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = AnonymousClass3Ma.A00(context, 2130969197, 2131100213);
    }

    public void A07(int i, int i2) {
        this.A04 = i;
        this.A00 = i2;
        invalidate();
    }

    public final int getTotalCount() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A05();
        A00(context, (AttributeSet) null);
    }
}
