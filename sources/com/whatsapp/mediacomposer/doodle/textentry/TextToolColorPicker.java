package com.whatsapp.mediacomposer.doodle.textentry;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass6Z2;
import X.AnonymousClass85L;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TextToolColorPicker extends View implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public AnonymousClass85L A04;
    public AnonymousClass031 A05;
    public boolean A06;
    public int[] A07;
    public boolean A08;
    public final Paint A09;
    public final Paint A0A;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass6Z2.A02);
            this.A02 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A06 = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void A01() {
        if (!this.A08) {
            this.A08 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r1 != r12.A00) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSizeChanged(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00cd
            int r1 = X.C72473Md.A07(r12, r13)
        L_0x0008:
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)
            r12.A00 = r1
            int[] r0 = r12.A07
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length
            if (r0 >= r1) goto L_0x001a
        L_0x0016:
            int[] r0 = new int[r1]
            r12.A07 = r0
        L_0x001a:
            int[] r0 = X.C137296vE.A01(r1)
            r12.A07 = r0
            android.graphics.Path r4 = X.C108945cZ.A0L()
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            r4.setFillType(r0)
            r0 = 8
            float[] r5 = new float[r0]
            int r0 = r12.A02
            float r1 = (float) r0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r1 = r1 / r0
            java.util.Arrays.fill(r5, r1)
            boolean r1 = r12.A06
            if (r1 == 0) goto L_0x00c9
            int r0 = r12.A00
        L_0x003d:
            int r0 = r0 + -1
            float r3 = (float) r0
            if (r1 == 0) goto L_0x00c5
            int r0 = r12.A02
        L_0x0044:
            int r0 = r0 + -1
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r2, r3, r0)
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r4.addRoundRect(r1, r5, r0)
            android.graphics.Bitmap r1 = r12.A03
            if (r1 == 0) goto L_0x0071
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00c0
            int r1 = r1.getHeight()
        L_0x005f:
            int r0 = r12.A02
            if (r1 != r0) goto L_0x0071
            boolean r1 = r12.A06
            android.graphics.Bitmap r0 = r12.A03
            if (r1 == 0) goto L_0x00bb
            int r1 = r0.getWidth()
        L_0x006d:
            int r0 = r12.A00
            if (r1 == r0) goto L_0x007f
        L_0x0071:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00b6
            int r1 = r12.A00
            int r0 = r12.A02
        L_0x0079:
            android.graphics.Bitmap r0 = X.C108945cZ.A0H(r1, r0)
            r12.A03 = r0
        L_0x007f:
            android.graphics.Bitmap r0 = r12.A03
            android.graphics.Canvas r6 = X.C108945cZ.A0I(r0)
            android.graphics.Paint r11 = r12.A09
            X.AnonymousClass3MW.A1P(r11)
            r6.save()
            r6.clipPath(r4)
            r11.setStrokeWidth(r2)
            r1 = 0
        L_0x0094:
            int r0 = r12.A00
            if (r1 >= r0) goto L_0x00d3
            int[] r0 = r12.A07
            r0 = r0[r1]
            r11.setColor(r0)
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00af
            float r7 = (float) r1
            r8 = 0
            r9 = r7
            int r0 = r12.A02
            float r10 = (float) r0
        L_0x00a9:
            r6.drawLine(r7, r8, r9, r10, r11)
            int r1 = r1 + 1
            goto L_0x0094
        L_0x00af:
            r7 = 0
            float r10 = (float) r1
            r8 = r10
            int r0 = r12.A02
            float r9 = (float) r0
            goto L_0x00a9
        L_0x00b6:
            int r1 = r12.A02
            int r0 = r12.A00
            goto L_0x0079
        L_0x00bb:
            int r1 = r0.getHeight()
            goto L_0x006d
        L_0x00c0:
            int r1 = r1.getWidth()
            goto L_0x005f
        L_0x00c5:
            int r0 = r12.A00
            goto L_0x0044
        L_0x00c9:
            int r0 = r12.A02
            goto L_0x003d
        L_0x00cd:
            int r1 = X.C108985cd.A07(r12, r14)
            goto L_0x0008
        L_0x00d3:
            r6.restore()
            android.graphics.Paint r5 = r12.A0A
            android.content.Context r3 = r12.getContext()
            android.content.Context r2 = r12.getContext()
            r1 = 2130969159(0x7f040247, float:1.7546992E38)
            r0 = 2131100168(0x7f060208, float:1.781271E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.AnonymousClass3MX.A19(r3, r5, r0)
            X.AnonymousClass3MW.A1P(r5)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131168797(0x7f070e1d, float:1.7951906E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            r5.setStrokeWidth(r0)
            r6.drawPath(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onSizeChanged(int, int, int, int):void");
    }

    public void setColorAndInvalidate(int i) {
        this.A01 = i;
        invalidate();
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A09 = AnonymousClass3MW.A06();
        this.A0A = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public void draw(Canvas canvas) {
        float width;
        float paddingTop;
        super.draw(canvas);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            if (this.A06) {
                width = (float) getPaddingLeft();
            } else {
                width = ((float) (getWidth() - this.A02)) / 2.0f;
            }
            if (this.A06) {
                paddingTop = ((float) (getHeight() - this.A02)) / 2.0f;
            } else {
                paddingTop = (float) getPaddingTop();
            }
            canvas.drawBitmap(bitmap, width, paddingTop, this.A09);
        }
    }

    public int getColor() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r6 != 6) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        if (r6 != 1) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r6 = r8.getActionMasked()
            int r1 = r8.getPointerCount()
            r0 = 0
            r4 = 1
            if (r1 <= r4) goto L_0x000d
            return r0
        L_0x000d:
            r5 = 6
            if (r6 == 0) goto L_0x0021
            if (r6 == r4) goto L_0x0021
            r0 = 2
            if (r6 == r0) goto L_0x0021
            r0 = 3
            if (r6 == r0) goto L_0x0069
            r0 = 5
            if (r6 == r0) goto L_0x0021
            if (r6 == r5) goto L_0x0021
        L_0x001d:
            r7.invalidate()
            return r4
        L_0x0021:
            X.85L r0 = r7.A04
            if (r0 == 0) goto L_0x001d
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x007b
            float r0 = r8.getX()
        L_0x002d:
            int r1 = (int) r0
            if (r1 >= 0) goto L_0x0031
            r1 = 0
        L_0x0031:
            int r0 = r7.A00
            if (r1 < r0) goto L_0x0037
            int r1 = r0 + -1
        L_0x0037:
            int[] r0 = r7.A07
            r3 = r0[r1]
            int r0 = r7.A01
            if (r3 == r0) goto L_0x0065
            r7.A01 = r3
            X.85L r0 = r7.A04
            X.7JI r0 = (X.AnonymousClass7JI) r0
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = r0.A00
            X.6jM r0 = r2.A07
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "textEntryInfo"
        L_0x004d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0052:
            X.6pZ r1 = r0.A06
            r1.A03 = r3
            int r0 = r1.A02
            r1.A01(r3, r0)
            com.whatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r2.A05
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = "doodleEditText"
            goto L_0x004d
        L_0x0062:
            r0.A0L(r3)
        L_0x0065:
            if (r6 == r5) goto L_0x0069
            if (r6 != r4) goto L_0x001d
        L_0x0069:
            X.85L r0 = r7.A04
            X.7JI r0 = (X.AnonymousClass7JI) r0
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r0 = r0.A00
            com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker r1 = r0.A08
            java.lang.String r0 = "textToolColorPicker"
            if (r1 == 0) goto L_0x004d
            int r0 = r1.A01
            X.C137296vE.A00(r1, r0)
            goto L_0x001d
        L_0x007b:
            float r0 = r8.getY()
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.textentry.TextToolColorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A01 = i;
    }

    public void setListener(AnonymousClass85L r1) {
        this.A04 = r1;
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A09 = AnonymousClass3MW.A06();
        this.A0A = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A09 = AnonymousClass3MW.A06();
        this.A0A = AnonymousClass3MZ.A0A();
        A00(context, attributeSet);
    }

    public TextToolColorPicker(Context context) {
        super(context);
        A01();
        this.A09 = AnonymousClass3MW.A06();
        this.A0A = AnonymousClass3MZ.A0A();
    }

    public TextToolColorPicker(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
