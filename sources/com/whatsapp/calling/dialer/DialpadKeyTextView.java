package com.whatsapp.calling.dialer;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaTextView;

public final class DialpadKeyTextView extends WaTextView {
    public String A00;
    public final Rect A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialpadKeyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A01 = AnonymousClass3MW.A07();
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        getPaint().setColor(getCurrentTextColor());
        String str = this.A00;
        if (str == null) {
            C18070vi.A11("textStr");
            throw null;
        }
        Rect rect = this.A01;
        canvas.drawText(str, -((float) rect.left), -((float) rect.top), getPaint());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A00 = AnonymousClass3Ma.A13(this);
        TextPaint paint = getPaint();
        String str = this.A00;
        if (str == null) {
            C18070vi.A11("textStr");
            throw null;
        }
        int length = str.length();
        Rect rect = this.A01;
        paint.getTextBounds(str, 0, length, rect);
        setMeasuredDimension(View.resolveSize(rect.width(), i), View.resolveSize(rect.height(), i2));
    }

    public /* synthetic */ DialpadKeyTextView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DialpadKeyTextView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
