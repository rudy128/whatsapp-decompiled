package com.whatsapp.textstatuscomposer.voice;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass88F;
import X.C108945cZ;
import X.C108985cd;
import X.C18070vi;
import X.C62762rw;
import X.C72463Mc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public final class VoiceStatusRecordingVisualizer extends View implements AnonymousClass009 {
    public long A00;
    public long A01;
    public AnonymousClass11P A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public AnonymousClass88F A06;
    public final float A07;
    public final float A08;
    public final Paint A09;
    public final Paint A0A;
    public final List A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = AnonymousClass10E.A6O(AnonymousClass3MW.A0O(generatedComponent()));
        }
        this.A0B = AnonymousClass000.A13();
        Paint A0K = C108945cZ.A0K(5);
        A0K.setStrokeCap(Paint.Cap.ROUND);
        AnonymousClass3MX.A19(context, A0K, C72463Mc.A03(context));
        this.A09 = A0K;
        Paint paint = new Paint(A0K);
        AnonymousClass3MX.A19(context, paint, 2131103235);
        this.A0A = paint;
        this.A07 = (float) C62762rw.A01(context, 4.3f);
        this.A08 = (float) C62762rw.A01(context, 2.5f);
        this.A01 = 750;
    }

    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        Paint paint;
        Object valueOf;
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas2, 0);
        super.onDraw(canvas2);
        if (this.A00 != 0) {
            getTime();
            f = ((float) (SystemClock.elapsedRealtime() - this.A00)) / ((float) this.A01);
            if (f > 1.0f) {
                this.A05 = false;
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        int A072 = C108985cd.A07(this, canvas2.getHeight());
        int totalSegmentsCount = getTotalSegmentsCount();
        for (int i = 0; i < totalSegmentsCount; i++) {
            List list = this.A0B;
            float f3 = 1.0f;
            if (i < list.size()) {
                f2 = AnonymousClass000.A04(list.get(i));
                if (i == AnonymousClass3MX.A01(list)) {
                    f3 = f;
                }
                paint = this.A09;
                if (f3 < 0.5f) {
                    valueOf = Float.valueOf(4.0f * f3 * f3 * f3);
                }
                valueOf = Double.valueOf(1.0d - (Math.pow((double) ((-2.0f * f3) + 2.0f), 3.0d) / 2.0d));
            } else {
                if (i == list.size()) {
                    paint = this.A09;
                } else {
                    paint = this.A0A;
                }
                f2 = 0.006f;
                valueOf = Double.valueOf(1.0d - (Math.pow((double) ((-2.0f * f3) + 2.0f), 3.0d) / 2.0d));
            }
            float A042 = AnonymousClass000.A04(valueOf);
            float f4 = this.A08;
            float f5 = (f4 / 2.0f) + (this.A07 * ((float) i));
            float f6 = (float) A072;
            float max = Math.max(0.006f, f2) * f6 * A042;
            float paddingTop = ((float) getPaddingTop()) + ((f6 - max) / 2.0f);
            paint.setStrokeWidth(f4);
            canvas2.drawLine(f5, paddingTop, f5, paddingTop + max, paint);
        }
        if (this.A05) {
            invalidate();
        }
    }

    public final void setTime(AnonymousClass11P r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass11P getTime() {
        AnonymousClass11P r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final void setListener(AnonymousClass88F r2) {
        this.A06 = r2;
        if (getWidth() > 0 && r2 != null) {
            r2.C4u(getTotalSegmentsCount());
        }
    }

    private final int getTotalSegmentsCount() {
        return ((int) Math.floor((double) ((((float) C72463Mc.A09(this)) - this.A08) / this.A07))) + 1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        AnonymousClass88F r1 = this.A06;
        if (r1 != null) {
            r1.C4u(getTotalSegmentsCount());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ VoiceStatusRecordingVisualizer(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceStatusRecordingVisualizer(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
