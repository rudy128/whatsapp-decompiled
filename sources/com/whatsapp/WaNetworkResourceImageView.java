package com.whatsapp;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4R2;
import X.C0L;
import X.C18070vi;
import X.C29471cL;
import X.C72483Me;
import X.C84054Hr;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;

public final class WaNetworkResourceImageView extends WaImageView {
    public Bitmap A00;
    public AnonymousClass4R2 A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void A06(C0L c0l, boolean z) {
        C0L c0l2 = c0l;
        C18070vi.A0d(c0l, 0);
        measure(0, 0);
        AnonymousClass4R2 r0 = this.A01;
        if (r0 != null) {
            r0.A00(this, c0l2, getMeasuredWidth(), getMeasuredHeight(), z);
        }
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap A002 = C84054Hr.A00(bitmap, getWidth(), getHeight());
        this.A00 = A002;
        canvas.drawBitmap(A002, (float) ((getWidth() - A002.getWidth()) >> 1), (float) ((getHeight() - A002.getHeight()) >> 1), (Paint) null);
    }

    public void A05() {
        if (!this.A02) {
            this.A02 = true;
            this.A01 = (AnonymousClass4R2) C72483Me.A0P(this).A00.ADs.get();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A05();
        if (attributeSet != null && this.A00 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29471cL.A04);
            C18070vi.A0X(obtainStyledAttributes);
            String string = obtainStyledAttributes.getString(0);
            C0L[] values = C0L.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    this.A00 = null;
                    break;
                }
                C0L c0l = values[i2];
                if (C18070vi.A18(c0l.id, string)) {
                    measure(0, 0);
                    AnonymousClass4R2 r6 = this.A01;
                    if (r6 != null) {
                        r6.A00(this, c0l, getMeasuredWidth(), getMeasuredHeight(), true);
                    }
                } else {
                    i2++;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ WaNetworkResourceImageView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WaNetworkResourceImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
