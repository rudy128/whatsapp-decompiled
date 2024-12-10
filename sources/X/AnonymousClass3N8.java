package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.whatsapp.util.Log;

/* renamed from: X.3N8  reason: invalid class name */
public final class AnonymousClass3N8 extends Drawable {
    public boolean A00;
    public boolean A01;
    public final Paint A02;
    public final Paint A03;
    public final Paint A04;
    public final RectF A05 = AnonymousClass3MW.A08();
    public final RectF A06 = AnonymousClass3MW.A08();
    public final RectF A07 = AnonymousClass3MW.A08();
    public final RectF A08 = AnonymousClass3MW.A08();
    public final Paint A09;
    public final AnonymousClass4P1 A0A;

    public AnonymousClass3N8(AnonymousClass4P1 r4) {
        C18070vi.A0d(r4, 1);
        this.A0A = r4;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.A04 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.A03 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(r4.A03);
        AnonymousClass3MW.A1P(paint3);
        this.A02 = paint3;
        Paint paint4 = new Paint(1);
        AnonymousClass3MZ.A1D(r4.A04, paint4);
        this.A09 = paint4;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        C18070vi.A0d(canvas, 0);
        canvas.drawOval(this.A07, this.A04);
        canvas.drawOval(this.A06, this.A03);
        if (!this.A00) {
            RectF rectF = this.A05;
            canvas2.drawLine(rectF.left, rectF.bottom, rectF.right, rectF.top, this.A02);
            canvas.drawOval(this.A08, this.A09);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public boolean onStateChange(int[] iArr) {
        C18070vi.A0d(iArr, 0);
        boolean z = this.A01;
        boolean A0V = C200410p.A0V(iArr, 16842913);
        if (z != A0V) {
            this.A01 = A0V;
            A00(this, getBounds().width());
            int i = getBounds().left;
            int i2 = getBounds().top;
            int i3 = getBounds().right;
            int i4 = getBounds().bottom;
            float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
            this.A07.set(((float) i) + strokeWidth, ((float) i2) + strokeWidth, ((float) i3) - strokeWidth, ((float) i4) - strokeWidth);
            invalidateSelf();
        }
        return AnonymousClass000.A1S(z ? 1 : 0, this.A01 ? 1 : 0);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass3N8 r6, int r7) {
        /*
            boolean r0 = r6.A01
            r1 = 0
            r5 = 1020054733(0x3ccccccd, float:0.025)
            android.graphics.Paint r4 = r6.A04
            float r3 = (float) r7
            if (r0 == 0) goto L_0x002f
            r0 = 1033476506(0x3d99999a, float:0.075)
            float r0 = r0 * r3
            r4.setStrokeWidth(r0)
            r4.setPathEffect(r1)
            X.4P1 r2 = r6.A0A
            int r0 = r2.A07
        L_0x0019:
            r4.setColor(r0)
        L_0x001c:
            android.graphics.Paint r1 = r6.A03
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x002c
            int r0 = r2.A00
        L_0x0024:
            r1.setColor(r0)
            float r3 = r3 * r5
            r1.setStrokeWidth(r3)
            return
        L_0x002c:
            int r0 = r2.A01
            goto L_0x0024
        L_0x002f:
            float r0 = r3 * r5
            r4.setStrokeWidth(r0)
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0043
            X.4P1 r2 = r6.A0A
            int r0 = r2.A05
            r4.setColor(r0)
            r4.setPathEffect(r1)
            goto L_0x001c
        L_0x0043:
            r0 = 1027868943(0x3d44090f, float:0.0478602)
            float r1 = r3 * r0
            r0 = 2
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            r1 = 0
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r2, r1)
            r4.setPathEffect(r0)
            X.4P1 r2 = r6.A0A
            int r0 = r2.A06
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3N8.A00(X.3N8, int):void");
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i;
        int i7 = i3 - i;
        int i8 = i2;
        int i9 = i4;
        if (i7 != i4 - i2) {
            Log.w("Only squire bounds are supported");
        }
        A00(this, i7);
        float strokeWidth = this.A04.getStrokeWidth() * 0.5f;
        float f = (float) i6;
        float f2 = (float) i8;
        float f3 = (float) i5;
        float f4 = (float) i9;
        this.A07.set(f + strokeWidth, f2 + strokeWidth, f3 - strokeWidth, f4 - strokeWidth);
        float f5 = (float) i7;
        float f6 = f5 * 0.075f;
        Paint paint = this.A03;
        float strokeWidth2 = (paint.getStrokeWidth() * 0.5f) + f6;
        this.A06.set(f + strokeWidth2, f2 + strokeWidth2, f3 - strokeWidth2, f4 - strokeWidth2);
        this.A02.setStrokeWidth(0.05f * f5);
        float f7 = f5 * 0.8f;
        float sqrt = ((float) Math.sqrt((double) (f7 * f7 * 0.5f))) * 0.5f;
        float f8 = ((float) (i + i3)) * 0.5f;
        float f9 = f8 + sqrt;
        this.A05.set(f8 - sqrt, (((float) (i2 + i4)) * 0.5f) - sqrt, f9, f9);
        float strokeWidth3 = f6 + paint.getStrokeWidth();
        this.A08.set(f + strokeWidth3, f2 + strokeWidth3, f3 - strokeWidth3, f4 - strokeWidth3);
        super.setBounds(i6, i8, i5, i9);
    }
}
