package com.whatsapp.voicerecorder;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IJ;
import X.CIZ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

public class VoiceNoteSeekBar extends AppCompatSeekBar implements AnonymousClass009 {
    public SeekBar.OnSeekBarChangeListener A00;
    public CIZ A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public final Paint A0D;
    public final RectF A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        if (r3 != 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r4 = r12.getWidth()     // Catch:{ all -> 0x00ac }
            int r2 = r12.getPaddingLeft()     // Catch:{ all -> 0x00ac }
            int r0 = r12.getPaddingRight()     // Catch:{ all -> 0x00ac }
            int r4 = r4 - r2
            int r4 = r4 - r0
            boolean r0 = r12.isPressed()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0028
            int r0 = r12.A0B     // Catch:{ all -> 0x00ac }
            int r0 = r0 * 3
            int r7 = r0 / 4
        L_0x001b:
            int r3 = r12.getProgress()     // Catch:{ all -> 0x00ac }
            int r0 = r12.getMax()     // Catch:{ all -> 0x00ac }
            r10 = 0
            r1 = 0
            if (r0 <= 0) goto L_0x0030
            goto L_0x002d
        L_0x0028:
            int r0 = r12.A0B     // Catch:{ all -> 0x00ac }
            int r7 = r0 / 2
            goto L_0x001b
        L_0x002d:
            float r1 = (float) r3     // Catch:{ all -> 0x00ac }
            float r0 = (float) r0     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r0
        L_0x0030:
            float r0 = (float) r4     // Catch:{ all -> 0x00ac }
            float r1 = r1 * r0
            int r9 = (int) r1     // Catch:{ all -> 0x00ac }
            int r9 = r9 + r2
            int r8 = r12.getPaddingTop()     // Catch:{ all -> 0x00ac }
            int r0 = X.C72473Md.A04(r12)     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r8 = r8 + r0
            android.graphics.Paint r6 = r12.A0D     // Catch:{ all -> 0x00ac }
            int r0 = r12.A08     // Catch:{ all -> 0x00ac }
            X.AnonymousClass3MZ.A1D(r0, r6)     // Catch:{ all -> 0x00ac }
            boolean r0 = r12.A03     // Catch:{ all -> 0x00ac }
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0070
            android.graphics.RectF r4 = r12.A0E     // Catch:{ all -> 0x00ac }
            int r0 = r12.A0C     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r0 = r8 - r0
            float r5 = (float) r0     // Catch:{ all -> 0x00ac }
            int r0 = r12.getWidth()     // Catch:{ all -> 0x00ac }
            float r1 = (float) r0     // Catch:{ all -> 0x00ac }
            int r0 = r12.A0C     // Catch:{ all -> 0x00ac }
            int r0 = r0 / 2
            int r0 = r0 + r8
            float r0 = (float) r0     // Catch:{ all -> 0x00ac }
            r4.set(r10, r5, r1, r0)     // Catch:{ all -> 0x00ac }
            float r1 = r4.height()     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r11
            float r0 = r4.height()     // Catch:{ all -> 0x00ac }
            float r0 = r0 / r11
            r13.drawRoundRect(r4, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x0070:
            int r0 = r12.A09     // Catch:{ all -> 0x00ac }
            r6.setColor(r0)     // Catch:{ all -> 0x00ac }
            boolean r0 = r12.A04     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x007c
            r1 = 1
            if (r3 == 0) goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            boolean r0 = r12.A03     // Catch:{ all -> 0x00ac }
            if (r0 != 0) goto L_0x0084
            if (r1 != 0) goto L_0x00aa
            goto L_0x0087
        L_0x0084:
            if (r1 != 0) goto L_0x00aa
            goto L_0x00a4
        L_0x0087:
            android.graphics.RectF r5 = r12.A0E     // Catch:{ all -> 0x00ac }
            float r4 = (float) r2     // Catch:{ all -> 0x00ac }
            int r0 = r12.A0C     // Catch:{ all -> 0x00ac }
            int r3 = r0 / 2
            int r0 = r8 - r3
            float r2 = (float) r0     // Catch:{ all -> 0x00ac }
            float r1 = (float) r9     // Catch:{ all -> 0x00ac }
            int r3 = r3 + r8
            float r0 = (float) r3     // Catch:{ all -> 0x00ac }
            r5.set(r4, r2, r1, r0)     // Catch:{ all -> 0x00ac }
            float r1 = r5.height()     // Catch:{ all -> 0x00ac }
            float r1 = r1 / r11
            float r0 = r5.height()     // Catch:{ all -> 0x00ac }
            float r0 = r0 / r11
            r13.drawRoundRect(r5, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            float r2 = (float) r9     // Catch:{ all -> 0x00ac }
            float r1 = (float) r8     // Catch:{ all -> 0x00ac }
            float r0 = (float) r7     // Catch:{ all -> 0x00ac }
            r13.drawCircle(r2, r1, r0, r6)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r12)
            return
        L_0x00ac:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicerecorder.VoiceNoteSeekBar.onDraw(android.graphics.Canvas):void");
    }

    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(this.A0B * 2, i, 0), View.resolveSizeAndState(this.A0B * 2, i2, 0));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public int getProgressColor() {
        return this.A09;
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.A00 = onSeekBarChangeListener;
        super.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setProgressColor(int i) {
        this.A09 = i;
        invalidate();
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A0D = AnonymousClass3MZ.A0A();
        this.A0E = AnonymousClass3MW.A08();
        this.A0B = 20;
        this.A0C = 10;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A0A = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A09 = AnonymousClass3Ma.A00(context, 2130971746, 2131102883);
        this.A08 = AnonymousClass3Ma.A00(context, 2130971745, 2131102882);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IJ.A00);
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(2, this.A0B);
            this.A0C = obtainStyledAttributes.getDimensionPixelSize(3, this.A0C);
            this.A09 = obtainStyledAttributes.getInteger(1, this.A09);
            this.A08 = obtainStyledAttributes.getInteger(0, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    private void A01(MotionEvent motionEvent) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int x = (int) motionEvent.getX();
        if (x < paddingLeft) {
            f = 0.0f;
        } else {
            int i2 = width - paddingRight;
            f = 1.0f;
            if (x <= i2) {
                f = ((float) (x - paddingLeft)) / ((float) i);
            }
        }
        int max = (int) ((f * ((float) getMax())) + 0.0f);
        setProgress(max);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.A00;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged((SeekBar) null, max, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r5.A06 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (java.lang.Math.abs(r6.getX() - r5.A07) > ((float) r5.A0A)) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r3 = 0
            if (r0 != 0) goto L_0x0008
            return r3
        L_0x0008:
            X.CIZ r4 = r5.A01
            if (r4 != 0) goto L_0x001e
            android.content.Context r2 = r5.getContext()
            r0 = 7
            X.5dy r1 = new X.5dy
            r1.<init>(r5, r0)
            r0 = 0
            X.CIZ r4 = new X.CIZ
            r4.<init>(r2, r1, r0)
            r5.A01 = r4
        L_0x001e:
            android.view.GestureDetector r0 = r4.A00
            r0.onTouchEvent(r6)
            int r1 = r6.getAction()
            r2 = 1
            if (r1 == 0) goto L_0x006f
            if (r1 == r2) goto L_0x004f
            r0 = 2
            if (r1 == r0) goto L_0x0047
            r0 = 3
            if (r1 != r0) goto L_0x0046
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0043
        L_0x0036:
            r5.A06 = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r5.A00
            if (r1 == 0) goto L_0x0040
            r0 = 0
            r1.onStopTrackingTouch(r0)
        L_0x0040:
            r5.setPressed(r3)
        L_0x0043:
            r5.invalidate()
        L_0x0046:
            return r2
        L_0x0047:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x008c
            r5.A01(r6)
            return r2
        L_0x004f:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0057
            r5.A01(r6)
            goto L_0x0036
        L_0x0057:
            r5.A06 = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r5.A00
            if (r1 == 0) goto L_0x0061
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x0061:
            r5.A01(r6)
            r5.A06 = r3
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r5.A00
            if (r1 == 0) goto L_0x0043
            r0 = 0
            r1.onStopTrackingTouch(r0)
            goto L_0x0043
        L_0x006f:
            android.view.ViewParent r1 = r5.getParent()
        L_0x0073:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009e
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            boolean r0 = r0.shouldDelayChildPressedState()
            if (r0 == 0) goto L_0x0087
            float r0 = r6.getX()
            r5.A07 = r0
            return r2
        L_0x0087:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0073
        L_0x008c:
            float r1 = r6.getX()
            float r0 = r5.A07
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r5.A0A
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0046
        L_0x009e:
            r5.setPressed(r2)
            r5.invalidate()
            r5.A06 = r2
            android.widget.SeekBar$OnSeekBarChangeListener r1 = r5.A00
            if (r1 == 0) goto L_0x00ae
            r0 = 0
            r1.onStartTrackingTouch(r0)
        L_0x00ae:
            r5.A01(r6)
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x0046
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voicerecorder.VoiceNoteSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setHideProgressBar(boolean z) {
        this.A03 = z;
    }

    public void setHideProgressWhenPlaybackPositionAtStart(boolean z) {
        this.A04 = z;
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A0D = AnonymousClass3MZ.A0A();
        this.A0E = AnonymousClass3MW.A08();
        this.A0B = 20;
        this.A0C = 10;
        A00(context, attributeSet);
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public VoiceNoteSeekBar(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A0D = AnonymousClass3MZ.A0A();
        this.A0E = AnonymousClass3MW.A08();
        this.A0B = 20;
        this.A0C = 10;
        A00(context, (AttributeSet) null);
    }
}
