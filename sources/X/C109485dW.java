package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import com.whatsapp.TextData;

/* renamed from: X.5dW  reason: invalid class name and case insensitive filesystem */
public abstract class C109485dW extends Drawable {
    public static final AnonymousClass88E A09;
    public float A00;
    public Layout A01;
    public int A02;
    public int A03;
    public final Paint A04 = C108945cZ.A0K(1);
    public final TextData A05;
    public final CharSequence A06;
    public final Integer A07;
    public final Typeface A08;

    public C109485dW(Context context, Typeface typeface, TextData textData, AnonymousClass11C r6, AnonymousClass1KW r7, C18010vc r8, Integer num, String str) {
        this.A05 = textData;
        this.A08 = typeface;
        this.A07 = num;
        this.A06 = AnonymousClass1EG.A02(C26302CxJ.A0C(r6, r8, C43251zV.A05(context, r7, str)));
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    static {
        Object obj;
        if (Build.VERSION.SDK_INT >= 23) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        A09 = (AnonymousClass88E) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r0 != null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setBounds(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            super.setBounds(r12, r13, r14, r15)
            boolean r5 = r11 instanceof X.AnonymousClass6IZ
            if (r5 == 0) goto L_0x00f4
            int r1 = r14 - r12
            float r0 = (float) r1
            float r3 = r11.A00
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r2
            float r0 = r0 - r3
            int r6 = (int) r0
            int r0 = java.lang.Math.abs(r1)
            float r1 = (float) r0
            float r1 = r1 * r2
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r6 = r6 - r0
            int r15 = r15 - r13
            float r0 = (float) r15
            float r0 = r0 - r3
            int r4 = (int) r0
            int r0 = X.C108945cZ.A05(r14, r12)
            float r1 = (float) r0
            float r1 = r1 * r2
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r4 = r4 - r0
        L_0x002d:
            int r0 = r11.A02
            if (r0 != r4) goto L_0x0036
            int r0 = r11.A03
            if (r0 != r6) goto L_0x0036
        L_0x0035:
            return
        L_0x0036:
            r11.A03 = r6
            r11.A02 = r4
            r0 = 1
            android.text.TextPaint r7 = new android.text.TextPaint
            r7.<init>(r0)
            if (r5 == 0) goto L_0x00ee
            float r1 = (float) r4
            r0 = 1093664768(0x41300000, float:11.0)
            float r1 = r1 / r0
        L_0x0046:
            r7.setTextSize(r1)
            com.whatsapp.TextData r0 = r11.A05
            r5 = 0
            if (r0 == 0) goto L_0x00eb
            int r1 = r0.textColor
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 == 0) goto L_0x00eb
            if (r0 == 0) goto L_0x00eb
        L_0x0058:
            r7.setColor(r1)
            android.graphics.Typeface r0 = r7.getTypeface()
            r7.setTypeface(r0)
            java.lang.CharSequence r2 = r11.A06
            if (r2 == 0) goto L_0x0035
            int r1 = r2.length()
            r0 = 100
            if (r1 <= r0) goto L_0x0070
            r1 = 100
        L_0x0070:
            java.lang.CharSequence r3 = r2.subSequence(r5, r1)
        L_0x0074:
            if (r3 == 0) goto L_0x0035
        L_0x0076:
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0035
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00b3
            android.graphics.Paint$FontMetricsInt r10 = X.C43431zn.A00(r7)
            float r1 = r7.getTextSize()
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r9 = (int) r1
            r2 = r3
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r3.length()
            java.lang.Class<X.48p> r0 = X.AnonymousClass48p.class
            r8 = 0
            java.lang.Object[] r2 = r2.getSpans(r5, r1, r0)
            X.48p[] r2 = (X.AnonymousClass48p[]) r2
            if (r2 == 0) goto L_0x00b3
            int r1 = r2.length
        L_0x00a3:
            if (r8 >= r1) goto L_0x00b3
            r0 = r2[r8]
            r0.A00 = r10
            android.graphics.drawable.Drawable r0 = r0.A06()
            r0.setBounds(r5, r5, r9, r9)
            int r8 = r8 + 1
            goto L_0x00a3
        L_0x00b3:
            X.88E r0 = A09
            android.text.StaticLayout r1 = r0.BHW(r7, r3, r6)
            r11.A01 = r1
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Layout"
            X.C18070vi.A0z(r1, r0)
            int r0 = r1.getHeight()
            if (r0 <= r4) goto L_0x0035
            float r2 = r7.getTextSize()
            int r0 = r4 / 8
            r1 = 2
            int r0 = java.lang.Math.max(r1, r0)
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e0
            int r0 = r3.length()
            int r0 = r0 / r1
            java.lang.CharSequence r3 = r3.subSequence(r5, r0)
            goto L_0x0074
        L_0x00e0:
            float r1 = r7.getTextSize()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r7.setTextSize(r1)
            goto L_0x0076
        L_0x00eb:
            r1 = -1
            goto L_0x0058
        L_0x00ee:
            float r1 = X.C108945cZ.A02(r4)
            goto L_0x0046
        L_0x00f4:
            int r14 = r14 - r12
            float r1 = (float) r14
            float r4 = r11.A00
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r0
            float r1 = r1 - r4
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.sqrt(r0)
            double r2 = r2 / r0
            int r6 = (int) r2
            int r15 = r15 - r13
            float r2 = (float) r15
            float r2 = r2 - r4
            double r2 = (double) r2
            double r2 = r2 / r0
            int r4 = (int) r2
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109485dW.setBounds(int, int, int, int):void");
    }
}
