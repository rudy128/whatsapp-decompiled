package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class BF9 extends Drawable {
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public Path A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final RectF A06;
    public final Integer A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint[] A0D;
    public final Paint[] A0E;
    public final Path[] A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final RectF A0J;
    public final boolean A0K;

    public int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0125, code lost:
        if (r0.A09 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012a, code lost:
        if (r0.A0A != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x022b, code lost:
        if (r0.A09 != false) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0230, code lost:
        if (r0.A0A != false) goto L_0x0181;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Integer r1 = r0.A07
            boolean r1 = A02(r1)
            r13 = r20
            if (r1 == 0) goto L_0x012e
            r4 = 2
            boolean[] r7 = new boolean[r4]
            boolean r6 = r0.A0B
            r10 = 0
            r7[r10] = r6
            boolean r3 = r0.A08
            r12 = 1
            r7[r12] = r3
            r5 = 0
            r2 = 0
        L_0x001b:
            boolean r1 = r7[r5]
            if (r1 == 0) goto L_0x0021
            int r2 = r2 + 1
        L_0x0021:
            int r5 = r5 + 1
            if (r5 < r4) goto L_0x001b
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0128
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r5 = r9.left
            float r8 = r0.A01
            float r5 = r5 + r8
            float r1 = r9.top
            float r1 = r1 + r8
            r13.translate(r5, r1)
            android.graphics.Path[] r1 = r0.A0F
            r5 = r1[r10]
            android.graphics.Paint[] r1 = r0.A0D
            r1 = r1[r10]
            r13.drawPath(r5, r1)
            float r5 = -r8
            float r1 = r0.A02
            float r15 = r5 - r1
            float r16 = r9.width()
            float r8 = r8 * r11
            float r16 = r16 - r8
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r10]
            r14 = 0
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x005e:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.right
            float r7 = r0.A01
            float r10 = r10 - r7
            float r9 = r8.top
            boolean r1 = X.AnonymousClass000.A1O(r6)
            float r1 = (float) r1
            float r1 = r1 * r7
            float r9 = r9 + r1
            r13.translate(r10, r9)
            if (r6 == 0) goto L_0x0082
            android.graphics.Path[] r1 = r0.A0F
            r6 = r1[r12]
            android.graphics.Paint[] r1 = r0.A0D
            r1 = r1[r12]
            r13.drawPath(r6, r1)
        L_0x0082:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x009b
            float r1 = r0.A02
            float r16 = r7 + r1
            float r17 = r8.height()
            float r1 = (float) r2
            float r1 = r1 * r7
            float r17 = r17 - r1
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r12]
            r14 = 0
            r15 = r14
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x009b:
            r13.restoreToCount(r5)
        L_0x009e:
            if (r3 == 0) goto L_0x0123
            int r7 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r5 = r8.right
            float r6 = r0.A01
            float r5 = r5 - r6
            float r1 = r8.bottom
            float r1 = r1 - r6
            r13.translate(r5, r1)
            android.graphics.Path[] r1 = r0.A0F
            r5 = r1[r4]
            android.graphics.Paint[] r1 = r0.A0D
            r1 = r1[r4]
            r13.drawPath(r5, r1)
            float r1 = r8.width()
            float r14 = -r1
            float r11 = r11 * r6
            float r14 = r14 + r11
            float r1 = r0.A02
            float r6 = r6 + r1
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r4]
            r15 = 0
            r16 = r15
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x00d5:
            int r4 = r13.save()
            android.graphics.RectF r7 = r0.A06
            float r8 = r7.left
            float r5 = r0.A01
            float r8 = r8 + r5
            float r6 = r7.bottom
            boolean r1 = X.AnonymousClass000.A1O(r3)
            float r1 = (float) r1
            float r1 = r1 * r5
            float r6 = r6 - r1
            r13.translate(r8, r6)
            r6 = 3
            if (r3 == 0) goto L_0x00fa
            android.graphics.Path[] r1 = r0.A0F
            r3 = r1[r6]
            android.graphics.Paint[] r1 = r0.A0D
            r1 = r1[r6]
            r13.drawPath(r3, r1)
        L_0x00fa:
            boolean r1 = r0.A09
            if (r1 == 0) goto L_0x0116
            float r14 = -r5
            float r1 = r0.A02
            float r14 = r14 - r1
            float r1 = r7.height()
            float r3 = -r1
            float r1 = (float) r2
            float r1 = r1 * r5
            float r3 = r3 + r1
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r6]
            r15 = 0
            r16 = r15
            r17 = r3
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0116:
            r13.restoreToCount(r4)
        L_0x0119:
            android.graphics.Path r1 = r0.A00
            if (r1 == 0) goto L_0x0234
            android.graphics.Paint r0 = r0.A0I
            r13.drawPath(r1, r0)
            return
        L_0x0123:
            boolean r1 = r0.A09
            if (r1 == 0) goto L_0x0119
            goto L_0x00d5
        L_0x0128:
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x009e
            goto L_0x005e
        L_0x012e:
            android.graphics.Path[] r1 = r0.A0F
            r2 = 0
            r4 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0D
            r3 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0E
            r18 = r1[r2]
            r1 = 2
            boolean[] r9 = new boolean[r1]
            boolean r6 = r0.A0B
            r9[r2] = r6
            boolean r2 = r0.A08
            r1 = 1
            r9[r1] = r2
            r8 = 2
            r7 = 0
            r1 = 0
        L_0x014a:
            boolean r5 = r9[r7]
            if (r5 == 0) goto L_0x0150
            int r1 = r1 + 1
        L_0x0150:
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x014a
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x022e
            int r9 = r13.save()
            android.graphics.RectF r10 = r0.A06
            float r7 = r10.left
            float r8 = r0.A01
            float r7 = r7 + r8
            float r5 = r10.top
            float r5 = r5 + r8
            r13.translate(r7, r5)
            r13.drawPath(r4, r3)
            float r7 = -r8
            float r5 = r0.A02
            float r15 = r7 - r5
            float r16 = r10.width()
            float r8 = r8 * r12
            float r16 = r16 - r8
            r14 = 0
            r17 = r7
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r9)
        L_0x0181:
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r11 = r9.right
            float r8 = r0.A01
            float r11 = r11 - r8
            float r10 = r9.top
            boolean r5 = X.AnonymousClass000.A1O(r6)
            float r5 = (float) r5
            float r5 = r5 * r8
            float r10 = r10 + r5
            r13.translate(r11, r10)
            r5 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r5)
            if (r6 == 0) goto L_0x01a2
            r13.drawPath(r4, r3)
        L_0x01a2:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01b9
            float r6 = -r8
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.height()
            float r5 = (float) r1
            float r5 = r5 * r8
            float r16 = r16 - r5
            r14 = 0
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01b9:
            r13.restoreToCount(r7)
        L_0x01bc:
            if (r2 == 0) goto L_0x0229
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A06
            float r6 = r9.right
            float r7 = r0.A01
            float r6 = r6 - r7
            float r5 = r9.bottom
            float r5 = r5 - r7
            r13.translate(r6, r5)
            r5 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r5)
            r13.drawPath(r4, r3)
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.width()
            float r12 = r12 * r7
            float r16 = r16 - r12
            r14 = 0
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r8)
        L_0x01ec:
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A06
            float r10 = r8.left
            float r7 = r0.A01
            float r10 = r10 + r7
            float r9 = r8.bottom
            boolean r5 = X.AnonymousClass000.A1O(r2)
            float r5 = (float) r5
            float r5 = r5 * r7
            float r9 = r9 - r5
            r13.translate(r10, r9)
            r5 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r5)
            if (r2 == 0) goto L_0x020d
            r13.drawPath(r4, r3)
        L_0x020d:
            boolean r2 = r0.A09
            if (r2 == 0) goto L_0x0224
            float r3 = -r7
            float r2 = r0.A02
            float r15 = r3 - r2
            float r16 = r8.height()
            float r1 = (float) r1
            float r1 = r1 * r7
            float r16 = r16 - r1
            r14 = 0
            r17 = r3
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0224:
            r13.restoreToCount(r6)
            goto L_0x0119
        L_0x0229:
            boolean r5 = r0.A09
            if (r5 == 0) goto L_0x0119
            goto L_0x01ec
        L_0x022e:
            boolean r5 = r0.A0A
            if (r5 == 0) goto L_0x01bc
            goto L_0x0181
        L_0x0234:
            float r3 = r0.A01
            r2 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0257
            float r1 = r0.A0G
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            boolean r1 = r0.A0K
            if (r1 == 0) goto L_0x0254
            android.graphics.RectF r2 = r0.A06
            android.graphics.Paint r1 = r0.A0H
            r13.drawRoundRect(r2, r3, r3, r1)
            android.graphics.RectF r1 = r0.A0J
        L_0x024e:
            android.graphics.Paint r0 = r0.A0I
            r13.drawRoundRect(r1, r3, r3, r0)
            return
        L_0x0254:
            android.graphics.RectF r1 = r0.A06
            goto L_0x024e
        L_0x0257:
            android.graphics.RectF r1 = r0.A06
            android.graphics.Paint r0 = r0.A0I
            r13.drawRect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BF9.draw(android.graphics.Canvas):void");
    }

    public boolean getPadding(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.A09) {
            f = this.A02;
        } else {
            f = 0.0f;
        }
        if (this.A0A) {
            f2 = this.A02;
        } else {
            f2 = 0.0f;
        }
        boolean z = this.A0B;
        if (z) {
            float f6 = this.A02;
            if (this.A0K) {
                f4 = 0.0f;
            } else {
                f4 = this.A01;
            }
            f3 = f6 + f4;
        } else {
            f3 = 0.0f;
        }
        if (this.A08) {
            float f7 = this.A02;
            if (!this.A0K) {
                f5 = this.A01;
            }
            f5 += f7;
            if (z) {
                float f8 = this.A0G;
                f3 -= f8;
                f5 += f8;
            }
        }
        rect.set((int) f, (int) f3, (int) f2, (int) f5);
        return true;
    }

    /* JADX WARNING: type inference failed for: r11v11, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0208, code lost:
        if (r16 == false) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x020a, code lost:
        r12 = r6.A04;
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020c, code lost:
        if (r12 == null) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x020e, code lost:
        r13 = false;
        r12.eraseColor(0);
        r24 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c5, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c5, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r34) {
        /*
            r33 = this;
            r6 = r33
            r1 = r34
            super.onBoundsChange(r1)
            android.graphics.RectF r4 = r6.A06
            int r0 = r1.left
            float r9 = (float) r0
            float r5 = r6.A02
            float r9 = r9 + r5
            boolean r8 = r6.A0B
            int r0 = r1.top
            float r3 = (float) r0
            if (r8 == 0) goto L_0x0017
            float r3 = r3 + r5
        L_0x0017:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r5
            boolean r7 = r6.A08
            int r0 = r1.bottom
            float r0 = (float) r0
            if (r7 == 0) goto L_0x0023
            float r0 = r0 - r5
        L_0x0023:
            r4.set(r9, r3, r2, r0)
            android.graphics.RectF r10 = r6.A0J
            int r0 = r1.left
            float r9 = (float) r0
            float r9 = r9 + r5
            int r0 = r1.top
            float r3 = (float) r0
            if (r8 == 0) goto L_0x0035
            float r3 = r3 + r5
            float r0 = r6.A0G
            float r3 = r3 - r0
        L_0x0035:
            int r0 = r1.right
            float r2 = (float) r0
            float r2 = r2 - r5
            int r0 = r1.bottom
            float r1 = (float) r0
            if (r7 == 0) goto L_0x0042
            float r1 = r1 - r5
            float r0 = r6.A0G
            float r1 = r1 - r0
        L_0x0042:
            r10.set(r9, r3, r2, r1)
            boolean r0 = r6.A09
            if (r0 == 0) goto L_0x024c
            if (r8 == 0) goto L_0x024c
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x024c
            if (r7 == 0) goto L_0x024c
            r0 = 0
            r6.A00 = r0
        L_0x0054:
            float r4 = r6.A01
            float r3 = -r4
            android.graphics.RectF r23 = new android.graphics.RectF
            r0 = r23
            r0.<init>(r3, r3, r4, r4)
            android.graphics.RectF r22 = new android.graphics.RectF
            r1 = r22
            r1.<init>(r0)
            float r2 = -r5
            r1.inset(r2, r2)
            java.lang.Integer r0 = r6.A07
            r16 = r0
            boolean r7 = r6.A0C
            float r12 = A00(r0, r7)
            int[] r1 = A0M
            r0 = 6
            int[] r29 = java.util.Arrays.copyOf(r1, r0)
            r11 = 3
            int[] r1 = new int[r11]
            r1 = {-15173646, -15173646, -15173646} // fill-array
            if (r7 == 0) goto L_0x008e
            boolean r0 = A02(r16)
            if (r0 == 0) goto L_0x008e
            A01(r1)
            A01(r29)
        L_0x008e:
            int[] r0 = new int[r11]
            r32 = r0
            r10 = 0
            r7 = r1[r10]
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r9 = r12 * r0
            r0 = r32
            X.C25346Ce5.A01(r0, r9, r7, r10)
            r13 = 1
            r7 = r1[r13]
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r8 = r12 * r0
            r0 = r32
            X.C25346Ce5.A01(r0, r8, r7, r13)
            r14 = 2
            r1 = r1[r14]
            r7 = 0
            X.C25346Ce5.A01(r0, r7, r1, r14)
            boolean r21 = A02(r16)
            r0 = 4
            if (r21 == 0) goto L_0x022d
            int[] r1 = new int[r11]
            int r0 = r6.A03
            X.C25346Ce5.A01(r1, r9, r0, r10)
            X.C25346Ce5.A01(r1, r8, r0, r13)
            X.C25346Ce5.A01(r1, r7, r0, r14)
            float[] r0 = new float[r11]
            r20 = r0
            r0 = {0, 1056964608, 1065353216} // fill-array
            android.graphics.Rect r0 = r6.getBounds()
            float r27 = X.BE6.A02(r0)
            float r8 = r5 + r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r0
            float r27 = r27 - r8
            float[] r30 = A0L
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.REPEAT
            r0 = 0
            android.graphics.LinearGradient r14 = new android.graphics.LinearGradient
            r26 = r7
            r28 = r7
            r24 = r14
            r25 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
        L_0x00ef:
            float r19 = r4 + r5
            r28 = r1
            if (r21 == 0) goto L_0x00f7
            r28 = r32
        L_0x00f7:
            android.graphics.Shader$TileMode r31 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r18 = new android.graphics.RadialGradient
            r17 = 0
            r26 = r7
            r24 = r18
            r25 = r7
            r27 = r19
            r29 = r20
            r30 = r31
            r24.<init>(r25, r26, r27, r28, r29, r30)
            boolean r7 = A02(r16)
            if (r7 == 0) goto L_0x011a
            int r8 = android.os.Build.VERSION.SDK_INT
            r7 = 29
            r16 = 1
            if (r8 < r7) goto L_0x011c
        L_0x011a:
            r16 = 0
        L_0x011c:
            r9 = 0
            r8 = 0
        L_0x011e:
            android.graphics.Path[] r10 = r6.A0F
            int r7 = r10.length
            if (r9 >= r7) goto L_0x028b
            r7 = r10[r9]
            r7.reset()
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
            r7.setFillType(r10)
            android.graphics.Paint[] r10 = r6.A0D
            r11 = r10[r9]
            r10 = r18
            r11.setShader(r10)
            r11 = 180(0xb4, float:2.52E-43)
            r10 = 90
            if (r8 == r10) goto L_0x0214
            if (r8 == r11) goto L_0x01ef
            r10 = 270(0x10e, float:3.78E-43)
            if (r8 == r10) goto L_0x01d7
            r7.moveTo(r3, r0)
            r7.rLineTo(r2, r0)
            float r28 = r2 - r4
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r26 = r0
            r27 = r0
            r24 = r11
            r29 = r1
            r30 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            if (r21 == 0) goto L_0x0199
            if (r16 == 0) goto L_0x0199
            android.graphics.Bitmap r12 = r6.A05
            if (r12 == 0) goto L_0x0199
            r0 = 0
            r12.eraseColor(r0)
            r13 = 1
        L_0x0166:
            r28 = r19
            android.graphics.Paint r10 = X.AnonymousClass3MW.A06()
            X.C108945cZ.A1L(r10)
            r0 = 1
            r10.setDither(r0)
            r10.setShader(r11)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r12)
            if (r13 == 0) goto L_0x01d3
            r13 = r17
            r11 = r19
            r0.translate(r13, r11)
            float r11 = -r11
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
        L_0x0189:
            r24 = r0
            r26 = r11
            r29 = r10
            r24.drawRect(r25, r26, r27, r28, r29)
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r11 = new android.graphics.BitmapShader
            r11.<init>(r12, r0, r0)
        L_0x0199:
            r0 = 1127481344(0x43340000, float:180.0)
            float r13 = (float) r8
            float r15 = r13 + r0
            r12 = 0
            r10 = 1119092736(0x42b40000, float:90.0)
            r0 = r22
            r7.arcTo(r0, r15, r10, r12)
            r0 = 1132920832(0x43870000, float:270.0)
            float r13 = r13 + r0
            r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0 = r23
            r7.arcTo(r0, r13, r10, r12)
            r7.close()
            if (r21 == 0) goto L_0x01c5
            if (r14 == 0) goto L_0x01c5
            r0 = 180(0xb4, float:2.52E-43)
            if (r8 == r0) goto L_0x01bd
            if (r8 != 0) goto L_0x01c5
        L_0x01bd:
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.ComposeShader r0 = new android.graphics.ComposeShader
            r0.<init>(r11, r14, r7)
            r11 = r0
        L_0x01c5:
            android.graphics.Paint[] r0 = r6.A0E
            r0 = r0[r9]
            r0.setShader(r11)
            int r8 = r8 + 90
            int r9 = r9 + 1
            r0 = 0
            goto L_0x011e
        L_0x01d3:
            r27 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            goto L_0x0189
        L_0x01d7:
            r7.moveTo(r0, r4)
            r7.rLineTo(r0, r5)
            float r27 = r2 - r4
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r26 = r0
            r28 = r0
            r24 = r11
            r29 = r32
            r30 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0199
        L_0x01ef:
            r7.moveTo(r4, r0)
            r7.rLineTo(r5, r0)
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r26 = r0
            r27 = r0
            r24 = r11
            r28 = r19
            r29 = r1
            r30 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            if (r21 == 0) goto L_0x0199
            if (r16 == 0) goto L_0x0199
            android.graphics.Bitmap r12 = r6.A04
            if (r12 == 0) goto L_0x0199
            r13 = 0
            r12.eraseColor(r13)
            goto L_0x0166
        L_0x0214:
            r7.moveTo(r0, r3)
            r7.rLineTo(r0, r2)
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r26 = r0
            r28 = r0
            r24 = r11
            r27 = r19
            r29 = r32
            r30 = r20
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0199
        L_0x022d:
            int[] r1 = new int[r0]
            int r15 = r6.A03
            r0 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r0
            X.C25346Ce5.A01(r1, r12, r15, r10)
            X.C25346Ce5.A01(r1, r9, r15, r13)
            X.C25346Ce5.A01(r1, r8, r15, r14)
            X.C25346Ce5.A01(r1, r7, r15, r11)
            r0 = 4
            float[] r0 = new float[r0]
            r20 = r0
            r0 = {0, 1048576000, 1061158912, 1065353216} // fill-array
            r0 = 0
            r14 = 0
            goto L_0x00ef
        L_0x024c:
            android.graphics.Path r0 = r6.A00
            if (r0 != 0) goto L_0x0256
            android.graphics.Path r0 = X.C108945cZ.A0L()
            r6.A00 = r0
        L_0x0256:
            r0.reset()
            r3 = 0
            if (r8 == 0) goto L_0x0289
            float r1 = r6.A01
        L_0x025e:
            if (r7 == 0) goto L_0x0262
            float r3 = r6.A01
        L_0x0262:
            r0 = 8
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r1
            r0 = 1
            r2[r0] = r1
            r0 = 2
            r2[r0] = r1
            X.BE9.A1N(r2, r1, r3)
            r0 = 5
            r2[r0] = r3
            r0 = 6
            r2[r0] = r3
            r0 = 7
            r2[r0] = r3
            android.graphics.Path r1 = r6.A00
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r4, r2, r0)
            android.graphics.Path r0 = r6.A00
            r0.close()
            goto L_0x0054
        L_0x0289:
            r1 = 0
            goto L_0x025e
        L_0x028b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BF9.onBoundsChange(android.graphics.Rect):void");
    }

    public void setAlpha(int i) {
        for (Paint alpha : this.A0D) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0E) {
            alpha2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0D) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0E) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (r1 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BF9(android.content.Context r11, X.E6Q r12, java.lang.Integer r13, int r14, int r15) {
        /*
            r10 = this;
            r10.<init>()
            r0 = 1094713344(0x41400000, float:12.0)
            float r5 = X.C24515C7j.A00(r11, r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r3 = X.C24515C7j.A00(r11, r0)
            boolean r0 = A02(r13)
            if (r0 == 0) goto L_0x001c
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 < r1) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0031
            float r5 = r5 + r3
            int r3 = (int) r5
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r0)     // Catch:{ all -> 0x002f }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)     // Catch:{ all -> 0x002f }
            r4 = r1
            goto L_0x0032
        L_0x002f:
            java.lang.Integer r13 = X.AnonymousClass00R.A01
        L_0x0031:
            r0 = r4
        L_0x0032:
            r10.A05 = r4
            r10.A04 = r0
            r10.A07 = r13
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = X.C24515C7j.A00(r11, r0)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            r0 = 1094713344(0x41400000, float:12.0)
            float r0 = X.C24515C7j.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x0121;
                case 1: goto L_0x0121;
                default: goto L_0x0058;
            }
        L_0x0058:
            r0 = 5
        L_0x0059:
            float r0 = (float) r0
            float r0 = X.C24515C7j.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A0G = r0
            boolean r6 = r12.BeR()
            r10.A0C = r6
            r7 = -13350828(0xffffffffff344854, float:-2.3963659E38)
            if (r6 == 0) goto L_0x0072
            r7 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
        L_0x0072:
            r10.A03 = r7
            r0 = r15 & 1
            boolean r9 = X.AnonymousClass000.A1T(r0, r2)
            r10.A0B = r9
            r1 = 2
            r0 = r15 & 2
            boolean r8 = X.AnonymousClass000.A1T(r0, r1)
            r10.A09 = r8
            r3 = 4
            r0 = r15 & 4
            boolean r5 = X.AnonymousClass000.A1T(r0, r3)
            r10.A0A = r5
            r1 = 8
            r0 = r15 & 8
            boolean r1 = X.AnonymousClass000.A1T(r0, r1)
            r10.A08 = r1
            r4 = 0
            if (r9 == 0) goto L_0x00a2
            if (r8 == 0) goto L_0x00a2
            if (r5 == 0) goto L_0x00a2
            r0 = 1
            if (r1 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            r10.A0K = r0
            android.graphics.Paint r1 = X.AnonymousClass3MW.A06()
            r10.A0I = r1
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r1.setColor(r14)
            r1.setAntiAlias(r2)
            android.graphics.Paint r5 = X.AnonymousClass3MW.A06()
            r10.A0H = r5
            r5.setStyle(r0)
            r5.setColor(r7)
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r1 = A00(r13, r6)
            float r1 = r1 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            int r0 = X.BE6.A04(r1, r0)
            r5.setAlpha(r0)
            r5.setAntiAlias(r2)
            boolean r0 = A02(r13)
            if (r0 != 0) goto L_0x00dd
            r3 = 1
        L_0x00dd:
            android.graphics.Path[] r0 = new android.graphics.Path[r3]
            r10.A0F = r0
            android.graphics.RectF r0 = X.AnonymousClass3MW.A08()
            r10.A06 = r0
            android.graphics.RectF r0 = X.AnonymousClass3MW.A08()
            r10.A0J = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r3]
            r10.A0D = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r3]
            r10.A0E = r0
        L_0x00f5:
            android.graphics.Path[] r1 = r10.A0F
            android.graphics.Path r0 = X.C108945cZ.A0L()
            r1[r4] = r0
            android.graphics.Paint[] r1 = r10.A0D
            r0 = 4
            android.graphics.Paint r0 = X.C108945cZ.A0K(r0)
            X.C108945cZ.A1L(r0)
            r1[r4] = r0
            android.graphics.Paint[] r0 = r10.A0D
            r0 = r0[r4]
            r0.setAntiAlias(r2)
            android.graphics.Paint[] r1 = r10.A0E
            r0 = 4
            android.graphics.Paint r0 = X.C108945cZ.A0K(r0)
            X.C108945cZ.A1L(r0)
            r1[r4] = r0
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x00f5
            return
        L_0x0121:
            r0 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BF9.<init>(android.content.Context, X.E6Q, java.lang.Integer, int, int):void");
    }

    public static float A00(Integer num, boolean z) {
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 1:
                    return 0.2f;
                case 2:
                    return 1.0f;
                case 3:
                    return 0.6f;
                default:
                    return 0.1f;
            }
        } else {
            switch (intValue) {
                case 1:
                case 3:
                    return 0.05f;
                case 2:
                    return 0.2f;
                default:
                    return 0.1f;
            }
        }
    }

    public static void A01(int[] iArr) {
        int A002 = C25346Ce5.A00(-14931149, 0.2f);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int alpha = Color.alpha(i2);
            int alpha2 = Color.alpha(A002);
            int i3 = (255 - alpha2) * alpha;
            int i4 = i3 + alpha2;
            iArr[i] = Color.argb(Math.min(255, i4), ((Color.red(i2) * i3) + (Color.red(A002) * alpha2)) / i4, ((Color.green(i2) * i3) + (Color.green(A002) * alpha2)) / i4, ((i3 * Color.blue(i2)) + (Color.blue(A002) * alpha2)) / i4);
        }
    }

    public static boolean A02(Integer num) {
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                return false;
            default:
                return true;
        }
    }
}
