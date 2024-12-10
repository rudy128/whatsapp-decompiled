package com.whatsapp.text;

import X.AnonymousClass1Y1;
import X.AnonymousClass20T;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C28851b7;
import X.C72463Mc;
import X.C72483Me;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import com.whatsapp.WaTextView;
import java.util.Iterator;

public final class TrimmedMultiLineTextView extends WaTextView {
    public Integer A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public static final float A0F(Layout layout) {
        Iterator it = C28851b7.A08(0, layout.getLineCount()).iterator();
        if (!it.hasNext()) {
            return 0.0f;
        }
        AnonymousClass20T r2 = (AnonymousClass20T) it;
        float lineWidth = layout.getLineWidth(r2.A00());
        while (it.hasNext()) {
            lineWidth = Math.max(lineWidth, layout.getLineWidth(r2.A00()));
        }
        Float valueOf = Float.valueOf(lineWidth);
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        return 0.0f;
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            int width = getLayout().getWidth();
            Layout layout = getLayout();
            C18070vi.A0X(layout);
            int ceil = (int) ((float) Math.ceil((double) A0F(layout)));
            if (width != ceil) {
                int i = (-(width - ceil)) / 2;
                this.A00 = Integer.valueOf(i);
                canvas.save();
                canvas.translate((float) i, 0.0f);
                super.onDraw(canvas);
                this.A00 = null;
                canvas.restore();
                return;
            }
        }
        super.onDraw(canvas);
    }

    public void A0I() {
        if (!this.A01) {
            this.A01 = true;
            C72483Me.A0s(C72463Mc.A0X(this), this);
        }
    }

    public int getCompoundPaddingRight() {
        Integer num = this.A00;
        if (num != null) {
            return num.intValue();
        }
        return super.getCompoundPaddingRight();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getLayout() != null && getLayout().getLineCount() >= 2) {
            Layout layout = getLayout();
            C18070vi.A0X(layout);
            setMeasuredDimension(getMeasuredWidth() - (getLayout().getWidth() - ((int) ((float) Math.ceil((double) A0F(layout))))), getMeasuredHeight());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public /* synthetic */ TrimmedMultiLineTextView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrimmedMultiLineTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
