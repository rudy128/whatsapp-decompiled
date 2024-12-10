package com.whatsapp.conversation.waveforms;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass4IQ;
import X.AnonymousClass74M;
import X.C108945cZ;
import X.C108985cd;
import X.C108995ce;
import X.C143607Eb;
import X.C1595484y;
import X.C17960vV;
import X.C62762rw;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VoiceVisualizer extends View {
    public static final int[] A0L = C108945cZ.A1W();
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C1595484y A05;
    public boolean A06;
    public float A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public final float A0B;
    public final LinkedList A0C;
    public final List A0D;
    public final List A0E;
    public final float A0F;
    public final float A0G;
    public final float A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;

    public void setPlaybackPercentage(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            this.A00 = f;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.6jF, java.lang.Object] */
    public VoiceVisualizer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = new LinkedList();
        this.A0E = AnonymousClass000.A13();
        this.A0D = AnonymousClass000.A13();
        Paint A0K2 = C108945cZ.A0K(5);
        this.A0J = A0K2;
        Paint A0K3 = C108945cZ.A0K(5);
        this.A0K = A0K3;
        Paint A0K4 = C108945cZ.A0K(5);
        this.A0I = A0K4;
        this.A04 = 166;
        this.A0A = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass4IQ.A01, 0, 0);
        try {
            ? obj = new Object();
            obj.A06 = obtainStyledAttributes.getColor(5, -7829368);
            obj.A05 = obtainStyledAttributes.getColor(4, -16711936);
            obj.A03 = obtainStyledAttributes.getColor(0, -16711936);
            obj.A04 = obtainStyledAttributes.getColor(2, 0);
            obj.A01 = (float) obtainStyledAttributes.getDimensionPixelOffset(6, C62762rw.A01(context, 5.0f));
            obj.A02 = (float) obtainStyledAttributes.getDimensionPixelOffset(7, C62762rw.A01(context, 3.0f));
            obj.A00 = (float) obtainStyledAttributes.getDimensionPixelOffset(1, C62762rw.A01(context, 0.0f));
            float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(3, C62762rw.A01(context, 0.0f));
            Paint.Cap cap = Paint.Cap.ROUND;
            int i2 = obj.A06;
            int i3 = obj.A05;
            int i4 = obj.A03;
            float f = obj.A01;
            float f2 = obj.A02;
            float f3 = obj.A00;
            int i5 = obj.A04;
            obtainStyledAttributes.recycle();
            A0K2.setStrokeCap(cap);
            A0K3.setStrokeCap(cap);
            this.A0B = f;
            this.A0G = 1.8f * f;
            this.A0F = f * 2.0f;
            this.A0H = f2;
            this.A07 = f3;
            this.A08 = dimensionPixelSize;
            A0K4.setStrokeWidth(dimensionPixelSize);
            setSegmentColor(i2);
            setProgressColor(i3);
            this.A01 = i4;
            this.A02 = i5;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private float A00(MotionEvent motionEvent) {
        int[] iArr = A0L;
        getLocationInWindow(iArr);
        return Math.max(Math.min((motionEvent.getRawX() - ((float) (iArr[0] + getPaddingLeft()))) / (((float) (getWidth() - (getPaddingRight() + getPaddingLeft()))) * getScaleX()), 1.0f), 0.0f);
    }

    private void A01(Canvas canvas, Paint paint, float f, int i) {
        float A012;
        double pow;
        Canvas canvas2 = canvas;
        int A072 = C108985cd.A07(this, canvas2.getHeight());
        float f2 = this.A0B;
        float f3 = f * f2;
        float width = ((float) (canvas2.getWidth() - getPaddingRight())) - f3;
        List list = this.A0D;
        Paint paint2 = paint;
        if (!list.isEmpty()) {
            int i2 = 0;
            for (int i3 = i - 1; i3 >= 0; i3--) {
                A02(canvas2, paint2, 1.0f, AnonymousClass000.A04(list.get(i3)), width, A072, i2);
                i2++;
            }
            return;
        }
        Iterator descendingIterator = this.A0C.descendingIterator();
        boolean z = false;
        int i4 = 0;
        while (descendingIterator.hasNext()) {
            float A042 = AnonymousClass000.A04(descendingIterator.next());
            if (z) {
                descendingIterator.remove();
            } else {
                float f4 = (((float) i4) * f2) + f3;
                float width2 = ((float) (canvas2.getWidth() - getPaddingLeft())) - f4;
                if (width2 < f4) {
                    A012 = C108945cZ.A01(width2, this.A0G, 1.0f);
                } else {
                    A012 = C108945cZ.A01(f4, this.A0F, 1.0f);
                }
                if (A012 < 0.5f) {
                    pow = (double) (4.0f * A012 * A012 * A012);
                } else {
                    pow = 1.0d - (Math.pow((double) ((A012 * -2.0f) + 2.0f), 3.0d) / 2.0d);
                }
                if (A02(canvas2, paint2, (float) pow, A042, width, A072, i4)) {
                    i4++;
                } else {
                    descendingIterator.remove();
                    z = true;
                }
            }
        }
    }

    private boolean A02(Canvas canvas, Paint paint, float f, float f2, float f3, int i, int i2) {
        float f4 = f3 - (this.A0B * ((float) i2));
        float f5 = this.A0H;
        if (f4 < ((float) getPaddingLeft()) - f5) {
            return false;
        }
        float f6 = (float) i;
        float max = Math.max(0.006f, f2) * f6 * f;
        float paddingTop = ((float) getPaddingTop()) + ((f6 - max) / 2.0f);
        paint.setStrokeWidth(f5);
        Canvas canvas2 = canvas;
        float f7 = f4;
        canvas2.drawLine(f4, paddingTop, f7, paddingTop + max, paint);
        return true;
    }

    private int getDesiredWidth() {
        return (int) (((float) this.A0D.size()) * this.A0B);
    }

    private void setProgressColor(int i) {
        this.A0J.setColor(i);
    }

    private void setSegmentColor(int i) {
        this.A0K.setColor(i);
    }

    public void A03(List list, float f) {
        C17960vV.A0C(this.A0C.isEmpty());
        List list2 = this.A0E;
        list2.clear();
        List list3 = this.A0D;
        list3.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            list2.add(Float.valueOf(number.floatValue()));
            list3.add(Float.valueOf(number.floatValue()));
        }
        setPlaybackPercentage(f);
        requestLayout();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A05 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            if (this.A0A) {
                this.A0A = false;
                AnonymousClass74M.A05(((C143607Eb) this.A05).A00);
            }
        } else if (actionMasked == 2) {
            float A002 = A00(motionEvent);
            if (!this.A0A) {
                if (C108945cZ.A00(A002, this.A09) >= 0.015f) {
                    this.A0A = true;
                    setPlaybackPercentage(A002);
                    AnonymousClass74M r6 = ((C143607Eb) this.A05).A00;
                    r6.A1A.A02++;
                    if (r6.A0I != null) {
                        r6.A0T.removeCallbacks(r6.A1J);
                        r6.A04 = -1;
                    }
                }
                return true;
            }
            setPlaybackPercentage(A002);
            AnonymousClass74M r3 = ((C143607Eb) this.A05).A00;
            AnonymousClass74M.A0F(r3, (int) (((float) r3.A05) * A002), true);
            return true;
        } else if (actionMasked == 0) {
            this.A09 = A00(motionEvent);
            return true;
        }
        return false;
    }

    public void setProgressBubbleRadius(float f) {
        this.A07 = f;
        invalidate();
    }

    public void setProgressBubbleStokeWidth(float f) {
        this.A08 = f;
        invalidate();
    }

    public float getPlaybackPercentage() {
        return this.A00;
    }

    public float getSegmentSpacingPx() {
        return this.A0B;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        int size;
        super.onDraw(canvas);
        LinkedList linkedList = this.A0C;
        if (!linkedList.isEmpty() || !this.A0D.isEmpty()) {
            List list = this.A0D;
            float f = 1.0f;
            if (list.isEmpty()) {
                size = linkedList.size();
                long j = this.A03;
                if (j != 0) {
                    f = (((float) (SystemClock.elapsedRealtime() - j)) * 1.0f) / ((float) this.A04);
                } else {
                    f = 0.0f;
                }
            } else {
                size = list.size();
            }
            A01(canvas, this.A0K, f, size);
            if (this.A00 > 0.0f) {
                canvas.save();
                canvas.clipRect(((float) getPaddingLeft()) - this.A0B, 0.0f, (((float) C108995ce.A03(this)) * this.A00) + ((float) getPaddingLeft()), C108945cZ.A04(this));
                A01(canvas, this.A0J, f, size);
                canvas.restore();
            }
            if (this.A07 != 0.0f) {
                float f2 = this.A0H / 2.0f;
                float A032 = ((((float) C108995ce.A03(this)) - f2) * this.A00) + (((float) getPaddingLeft()) - f2);
                float A042 = C108945cZ.A04(this) / 2.0f;
                Paint paint = this.A0I;
                C108945cZ.A1L(paint);
                paint.setColor(this.A01);
                canvas.drawCircle(A032, A042, this.A07, paint);
                AnonymousClass3MW.A1P(paint);
                paint.setColor(this.A02);
                canvas.drawCircle(A032, A042, this.A07 + this.A08, paint);
            }
            if (this.A06) {
                invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 >= 100000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            java.util.List r3 = r8.A0E
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003a
            r5 = r6
        L_0x0011:
            r4 = 1
            if (r6 <= 0) goto L_0x001a
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 1
            if (r6 < r0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            int r0 = X.C108945cZ.A05(r5, r6)
            float r0 = (float) r0
            float r7 = r8.A0B
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0027
            r4 = 0
        L_0x0027:
            if (r1 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0068
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0068
            float r0 = (float) r6
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r5 = (int) r0
            goto L_0x003f
        L_0x003a:
            int r5 = r8.getDesiredWidth()
            goto L_0x0011
        L_0x003f:
            java.util.List r0 = r8.A0D     // Catch:{ Exception | OutOfMemoryError -> 0x0045 }
            X.AnonymousClass6WC.A00(r3, r0, r5)     // Catch:{ Exception | OutOfMemoryError -> 0x0045 }
            goto L_0x0064
        L_0x0045:
            r4 = move-exception
            java.util.Locale r3 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            X.C17880vN.A1T(r2, r6, r0)
            java.lang.Float r1 = java.lang.Float.valueOf(r7)
            r0 = 1
            r2[r0] = r1
            r0 = 2
            X.C17880vN.A1T(r2, r5, r0)
            java.lang.String r0 = "widthUpperBound %d / segmentSpacing %.2f = maxNumSegments %d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.e(r0, r4)
            throw r4
        L_0x0064:
            int r5 = r8.getDesiredWidth()
        L_0x0068:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 == r0) goto L_0x0074
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r0) goto L_0x007c
            int r6 = java.lang.Math.min(r5, r6)
        L_0x0074:
            int r0 = android.view.View.MeasureSpec.getSize(r10)
            r8.setMeasuredDimension(r6, r0)
            return
        L_0x007c:
            r6 = r5
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.waveforms.VoiceVisualizer.onMeasure(int, int):void");
    }

    private void setProgressBubbleColor(int i) {
        this.A01 = i;
    }

    private void setProgressBubbleStrokeColor(int i) {
        this.A02 = i;
    }

    public void setOnVoiceVisualizerChangeListener(C1595484y r1) {
        this.A05 = r1;
    }

    public VoiceVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VoiceVisualizer(Context context) {
        this(context, (AttributeSet) null);
    }
}
