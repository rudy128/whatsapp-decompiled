package com.whatsapp.bloks.ui.widgets.rangeslider;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.BHO;
import X.C108945cZ;
import X.C26025Cqj;
import X.C26561D4b;
import X.C26988DOk;
import X.C28466E2h;
import X.C28467E2i;
import X.CZQ;
import X.E6W;
import X.E6X;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.StringTreeSet;

public class WaRangeSeekBar extends FrameLayout implements E6W, E6X, C28466E2h {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public C28467E2i A05;
    public Integer A06;
    public int A07;
    public int A08;
    public Paint A09;
    public Paint A0A;
    public Paint A0B;
    public Paint A0C;
    public Paint A0D;
    public CZQ A0E;

    public static void A01(WaRangeSeekBar waRangeSeekBar) {
        C28467E2i e2i = waRangeSeekBar.A05;
        if (e2i != null) {
            C26988DOk dOk = (C26988DOk) e2i;
            C26025Cqj.A01(dOk.A01, waRangeSeekBar.A03, waRangeSeekBar.A02, dOk.A00);
        }
    }

    public static void A02(WaRangeSeekBar waRangeSeekBar) {
        C28467E2i e2i = waRangeSeekBar.A05;
        if (e2i != null) {
            C26988DOk dOk = (C26988DOk) e2i;
            C26025Cqj.A01(dOk.A01, waRangeSeekBar.A03, waRangeSeekBar.A02, dOk.A00);
        }
    }

    private float getCurrentPosition() {
        if (this.A06 == AnonymousClass00R.A00) {
            return getStartThumbX();
        }
        return getEndThumbX();
    }

    private float getEndThumbX() {
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private int getLeftBound() {
        return this.A04;
    }

    private float getStartThumbX() {
        float f = this.A03;
        float f2 = this.A01;
        float f3 = this.A00;
        float f4 = (float) this.A04;
        return (((f - f2) / (f3 - f2)) * (((float) (getWidth() - this.A04)) - f4)) + f4;
    }

    private void setCurrentPosition(float f) {
        if (this.A06 != null) {
            float f2 = (float) this.A04;
            float f3 = this.A01;
            float f4 = this.A00;
            float width = (((f - f2) / (((float) (getWidth() - this.A04)) - f2)) * (f4 - f3)) + f3;
            if (this.A06 == AnonymousClass00R.A00) {
                float f5 = this.A02;
                this.A03 = Math.min(Math.max(f3, f5), Math.max(Math.min(f3, f5), width));
            } else {
                float f6 = this.A03;
                this.A02 = Math.min(Math.max(f6, f4), Math.max(Math.min(f6, f4), width));
            }
            invalidate();
            A02(this);
        }
    }

    public float getRangeEndValue() {
        return this.A02;
    }

    public float getRangeStartValue() {
        return this.A03;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0E.A02(motionEvent);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        BHO bho = (BHO) parcelable;
        super.onRestoreInstanceState(bho.getSuperState());
        float f = bho.A01;
        float f2 = bho.A00;
        if (f >= this.A01 && f2 <= this.A00 && f <= f2) {
            this.A03 = f;
            this.A02 = f2;
            invalidate();
            A02(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        if (r2 <= 0) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            X.CZQ r4 = r8.A0E
            java.lang.Integer r0 = r4.A0G
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            boolean r0 = X.AnonymousClass000.A1Z(r0, r2)
            r7 = 1
            r3 = 3
            if (r0 != 0) goto L_0x001b
            r4.A02(r9)
            java.lang.Integer r0 = r4.A0G
            int r0 = r0.intValue()
            if (r0 == r3) goto L_0x00ee
        L_0x0019:
            r0 = 1
            return r0
        L_0x001b:
            X.E6W r0 = r4.A0D
            if (r0 == 0) goto L_0x00ee
            int r0 = r4.A05
            if (r0 <= 0) goto L_0x00ee
            android.view.VelocityTracker r0 = r4.A0B
            if (r0 != 0) goto L_0x002d
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.A0B = r0
        L_0x002d:
            r0.addMovement(r9)
            int r1 = r9.getAction()
            float r5 = r9.getX()
            float r6 = r9.getY()
            if (r1 == r7) goto L_0x0067
            r0 = 2
            if (r1 == r0) goto L_0x0044
            if (r1 == r3) goto L_0x0067
            goto L_0x0019
        L_0x0044:
            float r0 = r4.A00
            float r2 = r5 - r0
            float r0 = r4.A01
            float r1 = r6 - r0
            r4.A00 = r5
            r4.A01 = r6
            float r0 = r4.A02
            float r0 = r0 + r2
            r4.A02 = r0
            float r0 = r4.A03
            float r0 = r0 + r1
            r4.A03 = r0
            X.E6W r1 = r4.A0D
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            float r0 = r1.getCurrentPosition()
            float r0 = r0 + r2
            r1.setCurrentPosition(r0)
            goto L_0x0019
        L_0x0067:
            android.view.VelocityTracker r3 = r4.A0B
            r0 = 0
            r4.A0B = r0
            X.CZQ.A00(r4)
            int r0 = r4.A06
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r0, r1)
            java.lang.Integer r1 = r4.A0F
            if (r1 == r2) goto L_0x00e9
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x00e9
            float r0 = r3.getYVelocity()
        L_0x0083:
            int r2 = (int) r0
            X.CZQ.A00(r4)
            int r1 = r4.A07
            int r0 = java.lang.Math.abs(r2)
            if (r0 <= r1) goto L_0x00a6
            if (r2 < 0) goto L_0x0093
            if (r2 <= 0) goto L_0x009d
        L_0x0093:
            X.E6W r1 = r4.A0D
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r1 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r1
            r0 = 0
            r1.A06 = r0
            A01(r1)
        L_0x009d:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r4.A0G = r0
            r3.recycle()
            goto L_0x0019
        L_0x00a6:
            X.E6X r0 = r4.A0E
            if (r0 == 0) goto L_0x0093
            X.CZQ.A00(r4)
            int r1 = r4.A08
            float r0 = r4.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0093
            float r0 = r4.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0093
            X.E6X r2 = r4.A0E
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.C108945cZ.A00(r6, r0)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            r2.setCurrentThumb(r5)
            r2.setCurrentPosition(r5)
            r0 = 0
            r2.A06 = r0
            A01(r2)
            goto L_0x009d
        L_0x00e9:
            float r0 = r3.getXVelocity()
            goto L_0x0083
        L_0x00ee:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.CZQ] */
    private void A00() {
        int i;
        Context context = getContext();
        ? obj = new Object();
        obj.A00 = -1.0f;
        obj.A01 = -1.0f;
        obj.A02 = 0.0f;
        obj.A03 = 0.0f;
        obj.A0F = null;
        obj.A0G = AnonymousClass00R.A00;
        obj.A0B = null;
        int i2 = 0;
        obj.A05 = 0;
        obj.A0C = null;
        obj.A0D = null;
        obj.A0E = null;
        obj.A0A = new GestureDetector(context, new C26561D4b(obj, 1));
        obj.A09 = context;
        this.A0E = obj;
        Integer[] numArr = {AnonymousClass00R.A0C, AnonymousClass00R.A0N};
        int i3 = 0;
        obj.A05 = 0;
        do {
            Integer num = numArr[i2];
            if (num != null) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 8;
                        break;
                    default:
                        i = 1;
                        break;
                }
                int i4 = i | i3;
                obj.A05 = i4;
                i3 = i4;
            }
            i2++;
        } while (i2 < 2);
        obj.A0C = this;
        obj.A0D = this;
        obj.A0E = this;
        Resources A0Y = AnonymousClass000.A0Y(this);
        Paint A062 = AnonymousClass3MW.A06();
        this.A09 = A062;
        A062.setColor(AnonymousClass3Ma.A01(getContext(), A0Y, 2130970828, 2131102239));
        this.A09.setAntiAlias(true);
        this.A09.setStrokeWidth(AnonymousClass3MW.A00(A0Y, 2131169283));
        Paint A063 = AnonymousClass3MW.A06();
        this.A0A = A063;
        A063.setColor(AnonymousClass3Ma.A01(getContext(), A0Y, 2130971113, 2131102439));
        this.A0A.setStrokeWidth(AnonymousClass3MW.A00(A0Y, 2131169283));
        Paint A064 = AnonymousClass3MW.A06();
        this.A0B = A064;
        A064.setColor(AnonymousClass3Ma.A01(getContext(), A0Y, 2130970828, 2131102239));
        this.A0B.setAlpha(StringTreeSet.OFFSET_BASE_ENCODING);
        this.A0B.setAntiAlias(true);
        Paint A065 = AnonymousClass3MW.A06();
        this.A0C = A065;
        A065.setColor(AnonymousClass3Ma.A01(getContext(), A0Y, 2130970828, 2131102239));
        this.A0C.setAntiAlias(true);
        Paint A066 = AnonymousClass3MW.A06();
        this.A0D = A066;
        A066.setColor(AnonymousClass3Ma.A01(getContext(), A0Y, 2130970828, 2131102239));
        this.A0D.setAntiAlias(true);
        this.A04 = A0Y.getDimensionPixelSize(2131169280);
        this.A07 = A0Y.getDimensionPixelSize(2131169281);
        this.A08 = A0Y.getDimensionPixelSize(2131169282);
        this.A03 = Float.NaN;
        this.A02 = Float.NaN;
    }

    private int getCenterY() {
        return getMeasuredHeight() / 2;
    }

    private int getRightBound() {
        return getWidth() - this.A04;
    }

    private void setCurrentThumb(float f) {
        int i;
        Integer num;
        float A002 = C108945cZ.A00(getEndThumbX(), f);
        float A003 = C108945cZ.A00(getStartThumbX(), f);
        if (A002 == A003) {
            i = (getStartThumbX() > f ? 1 : (getStartThumbX() == f ? 0 : -1));
        } else {
            i = (A002 > A003 ? 1 : (A002 == A003 ? 0 : -1));
        }
        if (i < 0) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        this.A06 = num;
    }

    public void BsK(float f) {
        setCurrentThumb(f);
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean C8P(float f, float f2) {
        if (C108945cZ.A00(f2, (float) (getMeasuredHeight() / 2)) > ((float) (this.A04 * 2))) {
            return false;
        }
        setCurrentThumb(f);
        setCurrentPosition(f);
        this.A06 = null;
        A01(this);
        return true;
    }

    public void dispatchDraw(Canvas canvas) {
        float measuredHeight = (float) (getMeasuredHeight() / 2);
        float startThumbX = getStartThumbX();
        float endThumbX = getEndThumbX();
        canvas.save();
        canvas.drawLine((float) this.A04, measuredHeight, (float) (getWidth() - this.A04), measuredHeight, this.A0A);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A04, this.A0B);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A04, this.A0B);
        Canvas canvas2 = canvas;
        float f = measuredHeight;
        canvas2.drawLine(startThumbX, f, endThumbX, measuredHeight, this.A09);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A07, this.A0C);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A07, this.A0C);
        canvas.drawCircle(startThumbX, measuredHeight, (float) this.A08, this.A0D);
        canvas.drawCircle(endThumbX, measuredHeight, (float) this.A08, this.A0D);
        canvas.restore();
    }

    public Parcelable onSaveInstanceState() {
        return new BHO(super.onSaveInstanceState(), this.A03, this.A02);
    }

    public void setRangeSeekBarChangeListener(C28467E2i e2i) {
        this.A05 = e2i;
    }

    public WaRangeSeekBar(Context context) {
        super(context);
        A00();
    }

    public WaRangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
