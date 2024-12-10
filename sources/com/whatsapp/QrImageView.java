package com.whatsapp;

import X.AnonymousClass00R;
import X.AnonymousClass8BR;
import X.AnonymousClass8D5;
import X.AnonymousClass8D7;
import X.C17880vN;
import X.C17890vO;
import X.C20307AFp;
import X.C20453ALq;
import X.C22359B4n;
import X.C25088CWz;
import X.C25912CoW;
import X.C2V;
import X.C72453Mb;
import X.C84144If;
import X.CWH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class QrImageView extends AnonymousClass8D5 {
    public static final Random A07 = new Random();
    public C25088CWz A00;
    public ArrayList A01;
    public int A02;
    public Drawable A03;
    public boolean A04;
    public final Paint A05;
    public final RectF A06;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C84144If.A0I);
            this.A04 = obtainStyledAttributes.getBoolean(1, true);
            this.A02 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A00 = C25912CoW.A00(AnonymousClass00R.A01, "This is a sample QR Code", (Map) null);
            } catch (C2V e) {
                throw AnonymousClass8BR.A0x(e);
            }
        }
    }

    private void A01(C22359B4n b4n) {
        ArrayList arrayList = this.A01;
        if (arrayList == null || arrayList.isEmpty()) {
            CWH cwh = this.A00.A03;
            int i = cwh.A01 * cwh.A00;
            ArrayList A0z = C17880vN.A0z(i);
            this.A01 = A0z;
            for (int i2 = 0; i2 < i; i2++) {
                C17890vO.A1D(A0z, i2);
            }
        }
        AnonymousClass8D7 r2 = new AnonymousClass8D7(this);
        r2.setDuration(1200);
        r2.setInterpolator(new LinearInterpolator());
        if (b4n != null) {
            r2.setAnimationListener(new C20307AFp(b4n, this));
        }
        startAnimation(r2);
    }

    public void onDraw(Canvas canvas) {
        C25088CWz cWz = this.A00;
        if (cWz != null) {
            CWH cwh = cWz.A03;
            int i = cwh.A01;
            int i2 = cwh.A00;
            RectF rectF = this.A06;
            float width = rectF.width() / ((float) i);
            float height = rectF.height() / ((float) i2);
            Paint paint = this.A05;
            paint.setColor(-1);
            float paddingLeft = (float) getPaddingLeft();
            float paddingTop = (float) getPaddingTop();
            Canvas canvas2 = canvas;
            Paint paint2 = paint;
            Canvas canvas3 = canvas2;
            float f = paddingLeft;
            canvas3.drawRect(f, paddingTop, (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), paint2);
            paint.setColor(this.A02);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (cwh.A02[i4][i3] == 1) {
                        float f2 = rectF.left;
                        float f3 = (float) ((int) ((((float) i3) * width) + f2));
                        float f4 = rectF.top;
                        float f5 = f3;
                        canvas3.drawRect(f5, (float) ((int) ((((float) i4) * height) + f4)), f2 + (((float) (i3 + 1)) * width), f4 + (((float) (i4 + 1)) * height), paint2);
                    }
                }
            }
            paint.setColor(-1);
            if (this.A01 != null && !isInEditMode()) {
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    int A0H = C72453Mb.A0H(it);
                    int i5 = A0H % i;
                    int i6 = A0H / i;
                    float f6 = rectF.left;
                    float f7 = (float) ((int) ((((float) i5) * width) + f6));
                    float f8 = rectF.top;
                    float f9 = f7;
                    canvas3.drawRect(f9, (float) ((int) ((((float) i6) * height) + f8)), f6 + (((float) (i5 + 1)) * width), f8 + (((float) (i6 + 1)) * height), paint2);
                }
            }
            if (this.A03 != null) {
                ArrayList arrayList = this.A01;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A03.draw(canvas2);
                }
            }
        }
    }

    public void setQrCode(C25088CWz cWz, C22359B4n b4n) {
        this.A00 = cWz;
        if (this.A04 && isAttachedToWindow() && cWz != null) {
            A01(b4n);
        } else if (b4n != null) {
            C20453ALq aLq = (C20453ALq) b4n;
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = aLq.A01;
            IndiaUpiSecureQrCodeViewModel.A03(indiaUpiDisplaySecureQrCodeView.A0G, 3, aLq.A00);
        }
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = new RectF();
        this.A05 = new Paint();
        A00(context, attributeSet);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A04 && this.A00 != null) {
            A01((C22359B4n) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = null;
        clearAnimation();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r6 = r9.getMeasuredWidth()
            int r0 = r9.getPaddingLeft()
            int r6 = r6 - r0
            int r0 = r9.getPaddingRight()
            int r6 = r6 - r0
            int r5 = r9.getMeasuredHeight()
            int r0 = r9.getPaddingTop()
            int r5 = r5 - r0
            int r0 = r9.getPaddingBottom()
            int r5 = r5 - r0
            r8 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            if (r6 <= r5) goto L_0x0069
            int r0 = r6 - r5
            float r4 = (float) r0
            float r4 = r4 / r8
            r1 = r5
        L_0x0029:
            r0 = 0
        L_0x002a:
            android.graphics.RectF r3 = r9.A06
            float r2 = (float) r1
            r3.set(r7, r7, r2, r2)
            r3.offset(r4, r0)
            int r0 = r9.getPaddingLeft()
            float r1 = (float) r0
            int r0 = r9.getPaddingTop()
            float r0 = (float) r0
            r3.offset(r1, r0)
            android.graphics.drawable.Drawable r0 = r9.A03
            if (r0 == 0) goto L_0x0068
            r0 = 1049414861(0x3e8ccccd, float:0.275)
            float r2 = r2 * r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r4 = (int) r2
            int r6 = r6 - r4
            float r0 = (float) r6
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r3 = (int) r0
            int r0 = r9.getPaddingLeft()
            int r3 = r3 + r0
            int r5 = r5 - r4
            float r0 = (float) r5
            float r0 = r0 / r8
            float r0 = r0 + r1
            int r2 = (int) r0
            int r0 = r9.getPaddingTop()
            int r2 = r2 + r0
            int r1 = r3 + r4
            int r4 = r4 + r2
            android.graphics.drawable.Drawable r0 = r9.A03
            r0.setBounds(r3, r2, r1, r4)
        L_0x0068:
            return
        L_0x0069:
            if (r5 <= r6) goto L_0x0072
            int r0 = r5 - r6
            float r0 = (float) r0
            float r0 = r0 / r8
            r1 = r6
            r4 = 0
            goto L_0x002a
        L_0x0072:
            r1 = r6
            r4 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public QrImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = new RectF();
        this.A05 = new Paint();
        A00(context, attributeSet);
    }

    public void setQrCode(C25088CWz cWz) {
        setQrCode(cWz, (C22359B4n) null);
    }

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A06 = new RectF();
        this.A05 = new Paint();
        A00(context, attributeSet);
    }

    public QrImageView(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A06 = new RectF();
        this.A05 = new Paint();
        A00(context, (AttributeSet) null);
    }
}
