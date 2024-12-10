package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1GE;
import X.AnonymousClass1KB;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5E1;
import X.AnonymousClass5E2;
import X.C146427Pb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C23381Fv;
import X.C72453Mb;
import X.C88754aj;
import X.C99774tR;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.Timer;

public final class VoiceChatMiniPillWave extends View implements AnonymousClass009, AnonymousClass1GE {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass1KB A05;
    public C18030ve A06;
    public AnonymousClass031 A07;
    public boolean A08;
    public ValueAnimator A09;
    public Timer A0A;
    public boolean A0B;
    public boolean A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final int A0F;
    public final Paint A0G;
    public final float[] A0H;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceChatMiniPillWave(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void BrH(AnonymousClass1F9 r1) {
    }

    public void C0B(AnonymousClass1F9 r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = true;
    }

    public void C3z(AnonymousClass1F9 r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = false;
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public void onDetachedFromWindow() {
        AnonymousClass1F9 r1;
        C23381Fv lifecycle;
        setWithRandomAnimation(false);
        Context context = getContext();
        if (!(!(context instanceof AnonymousClass1F9) || (r1 = (AnonymousClass1F9) context) == null || (lifecycle = r1.getLifecycle()) == null)) {
            lifecycle.A06(this);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas2, 0);
        super.onDraw(canvas2);
        float[] fArr = this.A0H;
        int length = fArr.length;
        C18100vl r6 = this.A0D;
        C18100vl r5 = this.A0E;
        float width = ((((float) getWidth()) - (((float) (length + 1)) * C72453Mb.A00(r6))) - (((float) length) * C72453Mb.A00(r5))) / 2.0f;
        int i = this.A01;
        float f = 0.0f;
        if (i > 0) {
            f = ((float) i) / ((float) (127 - this.A04));
        }
        float height = ((float) getHeight()) - this.A00;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            float A002 = ((((float) i3) * (C72453Mb.A00(r6) + C72453Mb.A00(r5))) - (C72453Mb.A00(r5) / 2.0f)) + width;
            Paint paint = this.A0G;
            paint.setColor(this.A02);
            paint.setStrokeWidth(C72453Mb.A00(r5) + (2.0f * C72453Mb.A00(r6)));
            float f2 = fArr[i2] * f;
            float f3 = this.A00;
            float f4 = ((1.0f - f2) * f3 * 0.5f) + height;
            float f5 = ((f2 + 1.0f) * f3 * 0.5f) + height;
            float f6 = A002;
            Paint paint2 = paint;
            canvas2.drawLine(A002, f4, f6, f5, paint2);
            paint.setColor(this.A03);
            paint.setStrokeWidth(C72453Mb.A00(r5));
            canvas2.drawLine(A002, f4, f6, f5, paint2);
            i2 = i3;
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    private final float getLineBorderWidth() {
        return C72453Mb.A00(this.A0D);
    }

    private final float getLineWidth() {
        return C72453Mb.A00(this.A0E);
    }

    public final void A00(int i) {
        if (!this.A0B) {
            ValueAnimator valueAnimator = this.A09;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.A01, i - this.A04});
            ofInt.setDuration((long) this.A0F);
            ofInt.setInterpolator(new LinearInterpolator());
            C88754aj.A00(ofInt, this, 8);
            ofInt.start();
            this.A09 = ofInt;
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final int getBorderColor() {
        return this.A02;
    }

    public final int getColor() {
        return this.A03;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public final float getWaveMaxHeight() {
        return this.A00;
    }

    public final boolean getWithRandomAnimation() {
        return this.A0C;
    }

    public final void setWithRandomAnimation(boolean z) {
        Timer timer;
        this.A0C = z;
        if (!z) {
            getGlobalUI().A0J(new C146427Pb(this, 23));
            Timer timer2 = this.A0A;
            if (timer2 != null) {
                timer2.cancel();
            }
            timer = null;
        } else if (this.A0A == null) {
            timer = new Timer("VoiceChatMiniPillWave", false);
            timer.schedule(new C99774tR(this), 0, (long) this.A0F);
        } else {
            return;
        }
        this.A0A = timer;
    }

    public void onAttachedToWindow() {
        AnonymousClass1F9 r1;
        C23381Fv lifecycle;
        super.onAttachedToWindow();
        Context context = getContext();
        if ((context instanceof AnonymousClass1F9) && (r1 = (AnonymousClass1F9) context) != null && (lifecycle = r1.getLifecycle()) != null) {
            lifecycle.A05(this);
        }
    }

    public final void setBorderColor(int i) {
        this.A02 = i;
    }

    public final void setColor(int i) {
        this.A03 = i;
    }

    public final void setWaveMaxHeight(float f) {
        this.A00 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatMiniPillWave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A05 = AnonymousClass10E.A12(A0O);
        }
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.A0G = paint;
        this.A0H = new float[]{0.5f, 1.0f, 0.5f};
        this.A0E = AnonymousClass1DF.A01(new AnonymousClass5E2(context));
        this.A0D = AnonymousClass1DF.A01(new AnonymousClass5E1(context));
        this.A02 = AnonymousClass3Ma.A00(context, 2130970830, 2131102245);
        this.A03 = AnonymousClass3Ma.A00(context, 2130970817, 2131102224);
        this.A00 = AnonymousClass3MW.A00(context.getResources(), 2131165584);
        C18030ve abProps = getAbProps();
        C18040vf r2 = C18040vf.A02;
        this.A0F = C18020vd.A00(r2, abProps, 1106);
        int min = Math.min(C18020vd.A00(r2, getAbProps(), 1213), StringTreeSet.OFFSET_BASE_ENCODING);
        this.A04 = min;
        if (min >= 127) {
            this.A04 = 0;
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public /* synthetic */ VoiceChatMiniPillWave(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VoiceChatMiniPillWave(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
