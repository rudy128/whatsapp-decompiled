package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.48p  reason: invalid class name */
public class AnonymousClass48p extends C72813Np {
    public static CharSequence A07;
    public static boolean A08;
    public Paint.FontMetricsInt A00;
    public C72633Mx A01;
    public boolean A02;
    public Context A03;
    public final int A04;
    public final int A05;
    public final CharSequence A06;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r2[0] == r6) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.A03
            if (r0 == 0) goto L_0x001b
            X.0ve r2 = X.AnonymousClass1J8.A00(r0)
            if (r2 == 0) goto L_0x001b
            X.0vf r1 = X.C18040vf.A01
            r0 = 12496(0x30d0, float:1.751E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.CharSequence r0 = A07
            if (r7 != r0) goto L_0x001b
            boolean r0 = A08
            return r0
        L_0x001b:
            A07 = r7
            boolean r0 = r7 instanceof android.text.Spanned
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x004a
            r2 = r7
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r6.A06
            int r1 = r0.length()
            int r1 = r1 + r8
            java.lang.Class<X.48p> r0 = X.AnonymousClass48p.class
            java.lang.Object[] r2 = r2.getSpans(r8, r1, r0)
            X.48p[] r2 = (X.AnonymousClass48p[]) r2
            char r1 = r7.charAt(r8)
            r0 = 65532(0xfffc, float:9.183E-41)
            if (r1 != r0) goto L_0x004a
            if (r2 == 0) goto L_0x004a
            int r0 = r2.length
            if (r0 <= 0) goto L_0x004a
            r0 = r2[r5]
            if (r0 != r6) goto L_0x004a
        L_0x0047:
            A08 = r4
            return r4
        L_0x004a:
            r3 = 0
        L_0x004b:
            java.lang.CharSequence r2 = r6.A06
            int r0 = r2.length()
            if (r3 >= r0) goto L_0x0047
            int r1 = r8 + r3
            int r0 = r7.length()
            if (r1 >= r0) goto L_0x0047
            char r1 = r2.charAt(r3)
            int r0 = r8 + r3
            char r0 = r7.charAt(r0)
            if (r1 == r0) goto L_0x006a
            A08 = r5
            return r5
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48p.A05(java.lang.CharSequence, int):boolean");
    }

    public AnonymousClass48p(Context context, Paint.FontMetricsInt fontMetricsInt, Drawable drawable, CharSequence charSequence) {
        super(drawable);
        this.A06 = charSequence;
        this.A05 = AnonymousClass3Ma.A00(context, 2130970299, 2131101293);
        this.A04 = (int) C72463Mc.A00(context);
        this.A00 = fontMetricsInt;
        this.A03 = context;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (A05(charSequence, i)) {
            Canvas canvas2 = canvas;
            float f2 = f;
            int i6 = i4;
            Paint paint2 = paint;
            if (this.A02) {
                C72633Mx r10 = this.A01;
                if (r10 == null) {
                    r10 = new C72633Mx(this.A05, paint2);
                    this.A01 = r10;
                }
                float f3 = (float) (A06().getBounds().right + this.A04);
                float f4 = ((float) i6) + r10.A00 + (r10.A01 / 2.0f);
                canvas2.drawLine(f2, f4, f + f3, f4, r10);
            }
            C72483Me.A0i(canvas, paint2, A06(), f2, i6);
        }
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A06().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A00;
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i3) + i4);
            fontMetricsInt.ascent = i4 - max;
            fontMetricsInt.descent = i3 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A05(charSequence, i)) {
            return bounds.right + this.A04;
        }
        return 0;
    }
}
