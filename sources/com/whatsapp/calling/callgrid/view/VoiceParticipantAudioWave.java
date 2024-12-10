package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass03S;
import X.AnonymousClass10E;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IY;
import X.C108945cZ;
import X.C109005cf;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18140vp;
import X.C27831Xu;
import X.C72463Mc;
import X.C88754aj;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.common.dextricks.StringTreeSet;
import java.util.Random;

public class VoiceParticipantAudioWave extends View implements AnonymousClass009 {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Paint A04;
    public Drawable A05;
    public C18030ve A06;
    public AnonymousClass031 A07;
    public C18140vp A08;
    public double[] A09;
    public double[] A0A;
    public double[] A0B;
    public float A0C;
    public int A0D;
    public int A0E;
    public ValueAnimator A0F;
    public boolean A0G;
    public boolean A0H;
    public final Interpolator A0I;
    public final Random A0J;

    public void setAudioLevel(float f) {
        A02(this, f, true);
    }

    private void A01(Context context, AttributeSet attributeSet) {
        C18030ve r1 = this.A06;
        C18040vf r2 = C18040vf.A02;
        this.A0D = C18020vd.A00(r2, r1, 1106);
        int min = Math.min(C18020vd.A00(r2, this.A06, 1213), StringTreeSet.OFFSET_BASE_ENCODING);
        this.A0E = min;
        if (min >= 127) {
            this.A0E = 0;
        }
        this.A01 = context.getResources().getDimensionPixelSize(2131169191);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, AnonymousClass4IY.A00, 0, 0);
            try {
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, this.A01);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = this.A04;
        paint.setStrokeCap(Paint.Cap.ROUND);
        AnonymousClass3MX.A19(getContext(), paint, AnonymousClass1YL.A00(context, 2130971957, 17170443));
        paint.setStrokeWidth((float) this.A01);
        A00();
    }

    public void A03() {
        if (!this.A0G) {
            this.A0G = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A08 = A0O.A8t;
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

    public void onDraw(Canvas canvas) {
        int i;
        Drawable drawable;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (!this.A0H || (drawable = this.A05) == null) {
            i = Integer.MAX_VALUE;
        } else {
            i = (this.A09.length - 5) / 2;
            int i2 = this.A01;
            int i3 = i2 * 9;
            int i4 = this.A02 + i2 + (i2 * 2 * i);
            int i5 = i3 / 2;
            drawable.setBounds(i4, C108945cZ.A06(this) - i5, i3 + i4, C108945cZ.A06(this) + i5);
            this.A05.draw(canvas2);
        }
        for (int i6 = 0; i6 < this.A09.length; i6++) {
            if (i6 < i || i6 >= i + 5) {
                int i7 = this.A01;
                int i8 = this.A02 + i7 + (i7 * 2 * i6);
                double d = this.A0B[i6];
                double d2 = this.A0A[i6];
                float f = ((float) (((d - d2) * ((double) this.A00)) + d2)) / 2.0f;
                canvas2.drawLine((float) i8, ((float) C108945cZ.A06(this)) - f, (float) (i8 + 1), ((float) C108945cZ.A06(this)) + f, this.A04);
            }
        }
    }

    public void setColor(int i) {
        Paint paint = this.A04;
        paint.setColor(i);
        Drawable drawable = this.A05;
        if (drawable != null) {
            C27831Xu.A0C(drawable, paint.getColor());
        }
        invalidate();
    }

    public void setMuteIconVisibility(boolean z) {
        if (this.A0H != z) {
            this.A0H = z;
            Drawable drawable = this.A05;
            if (drawable == null) {
                boolean A1Z = C72463Mc.A1Z(this.A08);
                Context context = getContext();
                int i = 2131233364;
                if (A1Z) {
                    i = 2131232421;
                }
                drawable = AnonymousClass03S.A01(context, i);
                this.A05 = drawable;
            }
            C27831Xu.A0C(drawable, this.A04.getColor());
            invalidate();
        }
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0J = C109005cf.A0G(this);
        this.A0I = new LinearInterpolator();
        A01(context, attributeSet);
    }

    private void A00() {
        int lineCount = getLineCount();
        if (lineCount > 0) {
            this.A09 = new double[lineCount];
            int i = lineCount / 2;
            double pow = Math.pow(3.0d / ((double) getHeight()), 1.0d / ((double) i));
            this.A09[i] = (double) getHeight();
            for (int i2 = 1; i - i2 >= 0; i2++) {
                double[] dArr = this.A09;
                int i3 = i - i2;
                dArr[i3] = dArr[i3 + 1] * pow;
                if (i + i2 < lineCount) {
                    dArr[i + i2] = dArr[i - i2];
                }
            }
            this.A0A = new double[lineCount];
            this.A0B = new double[lineCount];
        }
    }

    public static void A02(VoiceParticipantAudioWave voiceParticipantAudioWave, float f, boolean z) {
        long j;
        if (voiceParticipantAudioWave.getVisibility() == 0) {
            ValueAnimator valueAnimator = voiceParticipantAudioWave.A0F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            voiceParticipantAudioWave.A0A = voiceParticipantAudioWave.A0B;
            voiceParticipantAudioWave.A0B = new double[voiceParticipantAudioWave.A09.length];
            int i = voiceParticipantAudioWave.A0E;
            float f2 = (float) i;
            float max = Math.max(f, f2);
            float f3 = (max - f2) / ((float) (127 - i));
            int i2 = 1;
            while (true) {
                double[] dArr = voiceParticipantAudioWave.A09;
                if (i2 >= dArr.length - 1) {
                    break;
                }
                double[] dArr2 = voiceParticipantAudioWave.A0B;
                double d = dArr[i2];
                Random random = voiceParticipantAudioWave.A0J;
                if (random.nextFloat() < 0.3f) {
                    d = ((double) ((random.nextFloat() * 0.7f) + 0.3f)) * d;
                }
                dArr2[i2] = d * ((double) f3);
                i2++;
            }
            float[] A1V = C108945cZ.A1V();
            // fill-array-data instruction
            A1V[0] = 0;
            A1V[1] = 1065353216;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
            voiceParticipantAudioWave.A0F = ofFloat;
            if (z) {
                j = (long) voiceParticipantAudioWave.A0D;
            } else {
                j = 0;
            }
            ofFloat.setDuration(j);
            voiceParticipantAudioWave.A0F.setInterpolator(voiceParticipantAudioWave.A0I);
            voiceParticipantAudioWave.A0F.addUpdateListener(new C88754aj(voiceParticipantAudioWave, 4));
            voiceParticipantAudioWave.A0F.start();
            voiceParticipantAudioWave.A0C = max;
        }
    }

    private int getLineCount() {
        if (getWidth() == 0) {
            return 0;
        }
        int width = getWidth();
        int i = this.A01;
        int i2 = (width - i) / (i * 2);
        if (i2 % 2 == 0) {
            i2--;
        }
        this.A02 = (getWidth() - ((i2 * 2) * this.A01)) / 2;
        return i2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        A02(this, this.A0C, true);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0J = C109005cf.A0G(this);
        this.A0I = new LinearInterpolator();
        A01(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0J = C109005cf.A0G(this);
        this.A0I = new LinearInterpolator();
        A01(context, attributeSet);
    }

    public VoiceParticipantAudioWave(Context context) {
        super(context);
        this.A0J = C109005cf.A0G(this);
        this.A0I = new LinearInterpolator();
        A01(context, (AttributeSet) null);
    }

    public VoiceParticipantAudioWave(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A03();
    }
}
