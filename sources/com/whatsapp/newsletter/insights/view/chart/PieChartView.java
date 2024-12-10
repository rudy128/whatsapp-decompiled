package com.whatsapp.newsletter.insights.view.chart;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3O5;
import X.AnonymousClass5JD;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C72453Mb;
import X.C72473Md;
import X.C86944Tr;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class PieChartView extends AnonymousClass3O5 implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public List A01;
    public boolean A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05;
    public final C18100vl A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PieChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        float f = 270.0f;
        for (C86944Tr r2 : this.A01) {
            Paint paint = this.A04;
            AnonymousClass3MX.A19(getContext(), paint, r2.A01);
            float f2 = r2.A00 * 360.0f;
            if (!AnonymousClass3MY.A1b(getWhatsAppLocale())) {
                f2 = -f2;
            }
            float f3 = f2 * this.A00;
            canvas2.drawArc(this.A05, f, f3, false, paint);
            f += f3;
        }
        List list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                float f4 = 0.0f;
                if (it.hasNext()) {
                    if (((C86944Tr) it.next()).A00 > 0.0f && (i = i + 1) < 0) {
                        AnonymousClass1ZU.A0A();
                        throw null;
                    }
                } else if (i > 1) {
                    float width = ((float) getWidth()) / 2.0f;
                    float height = ((float) getHeight()) / 2.0f;
                    C18100vl r3 = this.A06;
                    Paint paint2 = this.A04;
                    Paint paint3 = this.A03;
                    canvas2.drawRect(width - (C72453Mb.A00(r3) / 2.0f), -paint2.getStrokeWidth(), width + (C72453Mb.A00(r3) / 2.0f), height, paint3);
                    for (C86944Tr r0 : this.A01) {
                        float f5 = r0.A00 * 360.0f;
                        if (!AnonymousClass3MY.A1b(getWhatsAppLocale())) {
                            f5 = -f5;
                        }
                        f4 += f5 * this.A00;
                        canvas.save();
                        canvas.rotate(f4, width, height);
                        canvas2.drawRect(width - (C72453Mb.A00(r3) / 2.0f), -paint2.getStrokeWidth(), width + (C72453Mb.A00(r3) / 2.0f), height, paint3);
                        canvas.restore();
                    }
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void setSlices(List list) {
        C18070vi.A0d(list, 0);
        if (!C18070vi.A18(this.A01, list)) {
            this.A01 = list;
            A04();
        }
    }

    private final float getSliceMargin() {
        return C72453Mb.A00(this.A06);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final List getSlices() {
        return this.A01;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float strokeWidth = this.A04.getStrokeWidth() / 2.0f;
        this.A05.set(strokeWidth, strokeWidth, ((float) getMeasuredWidth()) - strokeWidth, ((float) getMeasuredHeight()) - strokeWidth);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PieChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A02 = true;
        if (!this.A02) {
            this.A02 = true;
            this.A01 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A01 = C18460wS.A00;
        this.A05 = AnonymousClass3MW.A08();
        Paint A07 = AnonymousClass3Ma.A07();
        AnonymousClass3MW.A1P(A07);
        A07.setStrokeWidth(AnonymousClass3MW.A00(getResources(), 2131167176));
        this.A04 = A07;
        Paint A072 = AnonymousClass3Ma.A07();
        A072.setColor(AnonymousClass3Ma.A00(context, 2130970830, 2131100157));
        this.A03 = A072;
        this.A06 = AnonymousClass1DF.A01(new AnonymousClass5JD(this));
    }

    public /* synthetic */ PieChartView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PieChartView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
