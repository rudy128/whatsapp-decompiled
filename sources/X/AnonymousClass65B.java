package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* renamed from: X.65B  reason: invalid class name */
public class AnonymousClass65B extends C110785h5 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public Bitmap A06;
    public C18000vb A07;
    public AnonymousClass8B2 A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public Drawable A0D;
    public Drawable A0E;
    public Drawable A0F;
    public Long A0G;
    public final Paint A0H = C108945cZ.A0K(1);
    public final Paint A0I = C108945cZ.A0K(1);
    public final Paint A0J = C108945cZ.A0K(1);
    public final Paint A0K = C108945cZ.A0K(1);
    public final Map A0L = C17880vN.A13();
    public final C18100vl A0M = AnonymousClass1DF.A01(new C151237ly(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65B(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        A06();
        Drawable A002 = C24261Jm.A00(getContext(), 2131232942);
        this.A0F = A002;
        if (A002 != null) {
            A002.setCallback(this);
        }
        Context A042 = AnonymousClass3MY.A04(this);
        this.A01 = AnonymousClass3MW.A00(A042.getResources(), 2131168780);
        this.A00 = AnonymousClass3MW.A00(A042.getResources(), 2131168774);
        this.A05 = (float) AnonymousClass3MZ.A01(A042, 2131168774);
        this.A04 = AnonymousClass3MW.A00(A042.getResources(), 2131168777);
        this.A03 = AnonymousClass3MW.A00(A042.getResources(), 2131168781);
        Paint paint = this.A0H;
        AnonymousClass3MX.A19(A042, paint, 2131103220);
        paint.setAlpha(153);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.A0I;
        AnonymousClass3MX.A19(A042, paint2, AnonymousClass1YL.A00(A042, 2130971928, 2131103261));
        paint2.setStyle(style);
        Paint paint3 = this.A0J;
        AnonymousClass3MX.A19(A042, paint3, AnonymousClass1YL.A00(A042, 2130970097, 2131103383));
        paint3.setTextSize(AnonymousClass3MW.A00(A042.getResources(), 2131169432));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(C43421zm.A00());
        this.A02 = paint3.getTextSize();
        Context A043 = AnonymousClass3MY.A04(this);
        Paint paint4 = this.A0K;
        AnonymousClass3MX.A19(A043, paint4, C72463Mc.A03(A043));
        AnonymousClass3MW.A1P(paint4);
        paint4.setStrokeWidth(AnonymousClass3MW.A00(A043.getResources(), 2131168783));
        paint4.setShadowLayer(this.A03, 0.0f, 0.0f, -16777216);
    }

    public void A08(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A0F;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        if (r0 != null) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            r22 = this;
            r2 = 0
            r11 = r23
            X.C18070vi.A0d(r11, r2)
            r1 = r22
            super.onDraw(r11)
            r1.A08(r11)
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x00fd
            java.lang.Integer r0 = r1.A0A
            if (r0 == 0) goto L_0x00b2
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.String r6 = java.lang.String.valueOf(r0)
            android.graphics.Paint r5 = r1.A0J
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r7 = r6.length()
            java.util.Map r4 = X.C110785h5.A01(r1, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x0164
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x0046:
            int r3 = r4.right
            int r0 = r4.left
            int r3 = r3 - r0
            float r8 = (float) r3
            int r3 = r4.bottom
            int r0 = r4.top
            int r3 = r3 - r0
            float r7 = (float) r3
            float r4 = X.C108945cZ.A03(r1)
            float r4 = r4 - r8
            float r0 = r1.A04
            float r4 = r4 - r0
            float r3 = r1.A02
            float r0 = r1.A05
            float r3 = r3 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r0
            float r7 = r7 * r0
            float r4 = r4 + r8
            float r15 = r3 - r7
            float r19 = X.C108945cZ.A03(r1)
            float r20 = X.C108945cZ.A04(r1)
            android.graphics.Paint r0 = r1.A0H
            r17 = 0
            r16 = r11
            r18 = r17
            r21 = r0
            r16.drawRect(r17, r18, r19, r20, r21)
            android.graphics.Paint r9 = r1.A0I
            float r12 = r4 - r8
            float r10 = r1.A00
            float r12 = r12 - r10
            float r13 = r15 - r7
            float r0 = r1.A01
            float r13 = r13 - r0
            float r14 = r4 + r8
            float r14 = r14 + r10
            float r15 = r15 + r7
            float r15 = r15 + r0
            float r0 = r1.A03
            r16 = r0
            r17 = r0
            r18 = r9
            r11.drawRoundRect(r12, r13, r14, r15, r16, r17, r18)
            r11.drawText(r6, r4, r3, r5)
        L_0x009a:
            android.graphics.drawable.Drawable r4 = r1.A0E
            if (r4 == 0) goto L_0x00ac
            int r3 = r1.getWidth()
            int r0 = r1.getHeight()
            r4.setBounds(r2, r2, r3, r0)
            r4.draw(r11)
        L_0x00ac:
            return
        L_0x00ad:
            android.graphics.Rect r4 = X.C110785h5.A00(r5, r3, r4, r7, r2)
            goto L_0x0046
        L_0x00b2:
            android.graphics.drawable.Drawable r0 = r1.A0D
            if (r0 != 0) goto L_0x00c5
            android.content.Context r3 = r1.getContext()
            r0 = 2131231803(0x7f08043b, float:1.8079697E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r3, r0)
            r1.A0D = r0
            if (r0 == 0) goto L_0x009a
        L_0x00c5:
            r0 = 1073741824(0x40000000, float:2.0)
            r11.drawColor(r0)
            android.graphics.drawable.Drawable r0 = r1.A0D
            if (r0 == 0) goto L_0x00fb
            int r6 = r0.getIntrinsicWidth()
        L_0x00d2:
            android.graphics.drawable.Drawable r0 = r1.A0D
            if (r0 == 0) goto L_0x00f9
            int r5 = r0.getIntrinsicHeight()
        L_0x00da:
            int r0 = r1.getWidth()
            int r0 = r0 - r6
            int r4 = r0 / 2
            int r0 = r1.getHeight()
            int r0 = r0 - r5
            int r3 = r0 / 2
            android.graphics.drawable.Drawable r0 = r1.A0D
            if (r0 == 0) goto L_0x00f1
            int r6 = r6 + r4
            int r5 = r5 + r3
            r0.setBounds(r4, r3, r6, r5)
        L_0x00f1:
            android.graphics.drawable.Drawable r0 = r1.A0D
            if (r0 == 0) goto L_0x009a
            r0.draw(r11)
            goto L_0x009a
        L_0x00f9:
            r5 = 0
            goto L_0x00da
        L_0x00fb:
            r6 = 0
            goto L_0x00d2
        L_0x00fd:
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x009a
            java.lang.String r3 = "0"
            android.graphics.Paint r6 = r1.A0J
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            int r5 = r3.length()
            java.util.Map r4 = X.C110785h5.A01(r1, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x015f
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x0169
            android.graphics.Rect r4 = (android.graphics.Rect) r4
        L_0x0123:
            int r3 = r4.right
            int r0 = r4.left
            int r3 = r3 - r0
            float r6 = (float) r3
            int r3 = r4.bottom
            int r0 = r4.top
            int r3 = r3 - r0
            float r5 = (float) r3
            float r14 = X.C108945cZ.A03(r1)
            float r14 = r14 - r6
            float r0 = r1.A04
            float r14 = r14 - r0
            float r15 = r1.A02
            float r0 = r1.A05
            float r15 = r15 + r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r0
            float r5 = r5 * r0
            float r14 = r14 + r6
            float r15 = r15 - r5
            android.graphics.Paint r4 = r1.A0K
            float r12 = r14 - r6
            float r3 = r1.A00
            float r12 = r12 - r3
            float r13 = r15 - r5
            float r0 = r1.A01
            float r13 = r13 - r0
            float r14 = r14 + r6
            float r14 = r14 + r3
            float r15 = r15 + r5
            float r15 = r15 + r0
            float r0 = r1.A03
            r16 = r0
            r17 = r0
            r18 = r4
            r11.drawRoundRect(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x009a
        L_0x015f:
            android.graphics.Rect r4 = X.C110785h5.A00(r6, r3, r4, r5, r2)
            goto L_0x0123
        L_0x0164:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65B.onDraw(android.graphics.Canvas):void");
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public boolean verifyDrawable(Drawable drawable) {
        C18070vi.A0d(drawable, 0);
        if (drawable == this.A0F || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public void A07() {
        if (this.A0C && isSelected()) {
            setSelected(false);
            this.A0A = null;
            invalidate();
        }
    }

    public void A09(Integer num) {
        if (!this.A0C) {
            return;
        }
        if (!isSelected() || !C18070vi.A18(this.A0A, num)) {
            setSelected(true);
            this.A0A = num;
            invalidate();
        }
    }

    public final boolean A0A() {
        if (C18070vi.A19(this.A09, false)) {
            Toast.makeText(getContext(), 2131896087, 0).show();
        }
        return C72463Mc.A1Y(this.A09);
    }

    public final Paint getCaptionPaint() {
        return (Paint) this.A0M.getValue();
    }

    public Uri getUri() {
        AnonymousClass8B2 r0 = this.A08;
        if (r0 != null) {
            return r0.BLl();
        }
        return null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setFrameDrawable(Drawable drawable) {
        this.A0E = drawable;
        invalidate();
    }

    public void setMediaItem(AnonymousClass8B2 r12) {
        int type;
        int i;
        String A11;
        this.A08 = r12;
        if (r12 != null && (type = r12.getType()) != -1) {
            if (type == 0) {
                i = 2131889027;
            } else if (type == 1) {
                i = 2131889038;
            } else if (type == 2) {
                i = 2131889023;
            } else if (type == 3) {
                i = 2131889017;
            } else if (type == 4) {
                i = 2131889022;
            } else if (type == 6) {
                i = 2131889035;
            } else {
                return;
            }
            if (r12.BQH() > 0) {
                Context context = getContext();
                Object[] objArr = new Object[2];
                objArr[0] = AnonymousClass3Ma.A11(this, i);
                String format = AnonymousClass11Y.A04(getWhatsAppLocale(), 0).format(new Date(r12.BQH()));
                C18070vi.A0X(format);
                A11 = C17880vN.A0q(context, format, objArr, 1, 2131888890);
            } else {
                A11 = AnonymousClass3Ma.A11(this, i);
            }
            setContentDescription(A11);
            setId(i);
        }
    }

    public final void setSelectable(boolean z) {
        this.A0C = z;
        if (!z) {
            setSelected(false);
            this.A0A = null;
        }
        invalidate();
    }

    public final void setSelector(Drawable drawable) {
        Drawable drawable2 = this.A0F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            this.A0F = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
    }

    public static final String A05(int i) {
        ArrayList A0z = C17880vN.A0z(i);
        for (int i2 = 0; i2 < i; i2++) {
            A0z.add('0');
        }
        return C29431cG.A0g("", "", "", A0z, (C22821Di) null);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0F;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        Drawable drawable2 = this.A0F;
        if (drawable2 != null && drawable2.isStateful() && (drawable = this.A0F) != null) {
            drawable.setState(getDrawableState());
        }
    }

    public Long getDuration() {
        return this.A0G;
    }

    public final AnonymousClass8B2 getMediaItem() {
        return this.A08;
    }

    public final Bitmap getThumbnail() {
        return this.A06;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0F;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void setDuration(Long l) {
        this.A0G = l;
    }

    public final void setMediaSupported(Boolean bool) {
        this.A09 = bool;
    }

    public final void setMultiCheckEnabled(boolean z) {
        this.A0B = z;
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
    }

    public final void setThumbnail(Bitmap bitmap) {
        this.A06 = bitmap;
    }
}
