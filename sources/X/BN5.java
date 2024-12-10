package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;

public class BN5 extends C26642D7p {
    public C26049CrJ A00;
    public C26049CrJ A01;
    public C26049CrJ A02;
    public C26049CrJ A03;
    public C26049CrJ A04;
    public C26049CrJ A05;
    public C26049CrJ A06;
    public C26049CrJ A07;
    public C26049CrJ A08;
    public C26049CrJ A09;
    public final Matrix A0A = C108945cZ.A0J();
    public final Paint A0B = new BEs(this, 0);
    public final Paint A0C = new BEs(this, 1);
    public final RectF A0D = AnonymousClass3MW.A08();
    public final C001100p A0E = new C001100p();
    public final C39801tf A0F;
    public final C38631rd A0G;
    public final StringBuilder A0H = BE6.A0t(2);
    public final List A0I = AnonymousClass000.A13();
    public final Map A0J = C17880vN.A11();
    public final C22734BMx A0K;

    private List A00(C24945CQv cQv, String str, float f, float f2, float f3, boolean z) {
        String str2;
        float measureText;
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i4 = 0;
        float f6 = 0.0f;
        while (true) {
            str2 = str;
            if (i >= str2.length()) {
                break;
            }
            char charAt = str2.charAt(i);
            if (z) {
                C24945CQv cQv2 = cQv;
                C25077CWm cWm = (C25077CWm) AnonymousClass0LW.A00(this.A0F.A06, C108945cZ.A09(cQv2.A03, C17890vO.A02(cQv2.A01, charAt * 31)));
                if (cWm != null) {
                    measureText = ((float) cWm.A00) * f2 * C40171uH.A00();
                } else {
                    i++;
                }
            } else {
                measureText = this.A0B.measureText(str2.substring(i, i + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i4 = i;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i2++;
                List list = this.A0I;
                for (int size = list.size(); size < i2; size++) {
                    list.add(new CMT());
                }
                CMT cmt = (CMT) list.get(i2 - 1);
                if (i4 == i3) {
                    String substring = str2.substring(i3, i);
                    String trim = substring.trim();
                    cmt.A01 = trim;
                    cmt.A00 = (f4 - f7) - (((float) (trim.length() - substring.length())) * f6);
                    i3 = i;
                    i4 = i;
                    f4 = f7;
                    f5 = f7;
                } else {
                    String substring2 = str2.substring(i3, i4 - 1);
                    String trim2 = substring2.trim();
                    cmt.A01 = trim2;
                    cmt.A00 = ((f4 - f5) - (((float) (substring2.length() - trim2.length())) * f6)) - f6;
                    f4 = f5;
                    i3 = i4;
                }
            }
            i++;
        }
        if (f4 > 0.0f) {
            i2++;
            List list2 = this.A0I;
            for (int size2 = list2.size(); size2 < i2; size2++) {
                list2.add(new CMT());
            }
            CMT cmt2 = (CMT) list2.get(i2 - 1);
            cmt2.A01 = str2.substring(i3);
            cmt2.A00 = f4;
        }
        return this.A0I.subList(0, i2);
    }

    public static void A03(Canvas canvas, CXZ cxz, float f, int i) {
        float f2;
        float f3;
        float f4;
        PointF pointF = cxz.A07;
        PointF pointF2 = cxz.A08;
        float A002 = C40171uH.A00();
        float f5 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (cxz.A01 * A002) + pointF.y;
        }
        float f6 = (((float) i) * cxz.A01 * A002) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f5 = pointF2.x;
        }
        int intValue = cxz.A09.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                f4 = f3 + f5;
            } else if (intValue == 2) {
                f4 = f3 + (f5 / 2.0f);
                f /= 2.0f;
            } else {
                return;
            }
            f3 = f4 - f;
        }
        canvas.translate(f3, f6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0386, code lost:
        if (r2.containsKey(r1) != false) goto L_0x0388;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038e, code lost:
        if (r1 == null) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f3, code lost:
        if (r1 == null) goto L_0x01f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.graphics.Canvas r30, android.graphics.Matrix r31, int r32) {
        /*
            r29 = this;
            r7 = r29
            X.BMx r0 = r7.A0K
            java.lang.Object r6 = r0.A05()
            X.CXZ r6 = (X.CXZ) r6
            X.1tf r0 = r7.A0F
            r26 = r0
            java.util.Map r1 = r0.A09
            java.lang.String r0 = r6.A0A
            java.lang.Object r5 = r1.get(r0)
            X.CQv r5 = (X.C24945CQv) r5
            if (r5 == 0) goto L_0x01f8
            r8 = r30
            r8.save()
            r2 = r31
            r8.concat(r2)
            X.CrJ r0 = r7.A01
            if (r0 != 0) goto L_0x01e5
            X.CrJ r0 = r7.A00
            if (r0 != 0) goto L_0x01e5
            android.graphics.Paint r4 = r7.A0B
            int r0 = r6.A04
        L_0x0030:
            r4.setColor(r0)
            X.CrJ r0 = r7.A03
            if (r0 != 0) goto L_0x01d9
            X.CrJ r0 = r7.A02
            if (r0 != 0) goto L_0x01d9
            android.graphics.Paint r3 = r7.A0C
            int r0 = r6.A05
        L_0x003f:
            r3.setColor(r0)
            X.Cc7 r0 = r7.A0K
            X.CrJ r0 = r0.A02
            r1 = 100
            if (r0 != 0) goto L_0x01cf
            r0 = 100
        L_0x004c:
            int r0 = r0 * 255
            int r0 = r0 / r1
            int r0 = r0 * r32
            int r0 = r0 / 255
            r4.setAlpha(r0)
            r3.setAlpha(r0)
            X.CrJ r0 = r7.A05
            if (r0 != 0) goto L_0x01c6
            X.CrJ r0 = r7.A04
            if (r0 != 0) goto L_0x01c6
            float r1 = r6.A03
            float r0 = X.C40171uH.A00()
            float r1 = r1 * r0
            r3.setStrokeWidth(r1)
        L_0x006b:
            X.1rd r10 = r7.A0G
            java.util.Map r0 = r10.A0Q
            if (r0 != 0) goto L_0x01f9
            X.1tf r0 = r10.A0G
            X.04B r0 = r0.A06
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x01f9
            X.CrJ r0 = r7.A06
            if (r0 == 0) goto L_0x01c2
            float r9 = X.C26049CrJ.A01(r0)
        L_0x0081:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r0
            X.C40171uH.A01(r2)
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r23 = java.util.Arrays.asList(r0)
            int r22 = r23.size()
            int r0 = r6.A06
            float r2 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            X.CrJ r0 = r7.A08
            if (r0 != 0) goto L_0x00b7
            X.CrJ r0 = r7.A07
            if (r0 == 0) goto L_0x00bc
        L_0x00b7:
            float r0 = X.C26049CrJ.A01(r0)
            float r2 = r2 + r0
        L_0x00bc:
            r21 = 0
            r20 = -1
        L_0x00c0:
            r1 = r22
            r0 = r21
            if (r0 >= r1) goto L_0x01f5
            r1 = r23
            java.lang.String r13 = X.C17880vN.A0w(r1, r0)
            android.graphics.PointF r0 = r6.A08
            if (r0 != 0) goto L_0x01be
            r0 = 0
        L_0x00d1:
            r17 = 1
            r11 = r7
            r12 = r5
            r14 = r0
            r15 = r9
            r16 = r2
            java.util.List r19 = r11.A00(r12, r13, r14, r15, r16, r17)
            r18 = 0
        L_0x00df:
            int r1 = r19.size()
            r0 = r18
            if (r0 >= r1) goto L_0x01ba
            r1 = r19
            java.lang.Object r11 = r1.get(r0)
            X.CMT r11 = (X.CMT) r11
            int r20 = r20 + 1
            r8.save()
            float r1 = r11.A00
            r0 = r20
            A03(r8, r6, r1, r0)
            java.lang.String r0 = r11.A01
            r25 = r0
            r17 = 0
        L_0x0101:
            int r1 = r25.length()
            r0 = r17
            if (r0 >= r1) goto L_0x01b3
            r1 = r25
            char r0 = r1.charAt(r0)
            java.lang.String r11 = r5.A01
            java.lang.String r1 = r5.A03
            int r0 = r0 * 31
            int r0 = X.C17890vO.A02(r11, r0)
            int r1 = X.C108945cZ.A09(r1, r0)
            r0 = r26
            X.04B r0 = r0.A06
            java.lang.Object r14 = X.AnonymousClass0LW.A00(r0, r1)
            X.CWm r14 = (X.C25077CWm) r14
            if (r14 == 0) goto L_0x01af
            java.util.Map r13 = r7.A0J
            boolean r0 = r13.containsKey(r14)
            if (r0 == 0) goto L_0x0177
            java.util.List r12 = X.AnonymousClass8BS.A0t(r14, r13)
        L_0x0135:
            r11 = 0
        L_0x0136:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x01a1
            java.lang.Object r0 = r12.get(r11)
            X.D7j r0 = (X.C26636D7j) r0
            android.graphics.Path r1 = r0.BWP()
            android.graphics.RectF r0 = r7.A0D
            r13 = 0
            r1.computeBounds(r0, r13)
            android.graphics.Matrix r0 = r7.A0A
            r13 = r0
            r0.reset()
            float r0 = r6.A00
            float r15 = -r0
            float r0 = X.C40171uH.A00()
            float r15 = r15 * r0
            r0 = 0
            r13.preTranslate(r0, r15)
            r13.preScale(r9, r9)
            r1.transform(r13)
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0172
            A01(r8, r4, r1)
            r0 = r3
        L_0x016c:
            A01(r8, r0, r1)
            int r11 = r11 + 1
            goto L_0x0136
        L_0x0172:
            A01(r8, r3, r1)
            r0 = r4
            goto L_0x016c
        L_0x0177:
            java.util.List r0 = r14.A01
            r24 = r0
            int r16 = r24.size()
            java.util.ArrayList r12 = X.C17880vN.A0z(r16)
            r11 = 0
        L_0x0184:
            r0 = r16
            if (r11 >= r0) goto L_0x019d
            r0 = r24
            java.lang.Object r15 = r0.get(r11)
            X.1vW r15 = (X.C40931vW) r15
            X.D7j r1 = new X.D7j
            r0 = r26
            r1.<init>(r0, r10, r15, r7)
            r12.add(r1)
            int r11 = r11 + 1
            goto L_0x0184
        L_0x019d:
            r13.put(r14, r12)
            goto L_0x0135
        L_0x01a1:
            double r0 = r14.A00
            float r11 = (float) r0
            float r11 = r11 * r9
            float r0 = X.C40171uH.A00()
            float r11 = r11 * r0
            float r11 = r11 + r2
            r0 = 0
            r8.translate(r11, r0)
        L_0x01af:
            int r17 = r17 + 1
            goto L_0x0101
        L_0x01b3:
            r8.restore()
            int r18 = r18 + 1
            goto L_0x00df
        L_0x01ba:
            int r21 = r21 + 1
            goto L_0x00c0
        L_0x01be:
            float r0 = r0.x
            goto L_0x00d1
        L_0x01c2:
            float r9 = r6.A02
            goto L_0x0081
        L_0x01c6:
            float r0 = X.C26049CrJ.A01(r0)
            r3.setStrokeWidth(r0)
            goto L_0x006b
        L_0x01cf:
            java.lang.Object r0 = r0.A05()
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x004c
        L_0x01d9:
            android.graphics.Paint r3 = r7.A0C
            java.lang.Object r0 = r0.A05()
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x003f
        L_0x01e5:
            android.graphics.Paint r4 = r7.A0B
            java.lang.Object r0 = r0.A05()
            int r0 = X.AnonymousClass000.A0M(r0)
            goto L_0x0030
        L_0x01f1:
            android.graphics.Typeface r1 = r5.A00
            if (r1 != 0) goto L_0x0205
        L_0x01f5:
            r8.restore()
        L_0x01f8:
            return
        L_0x01f9:
            X.CrJ r0 = r7.A09
            if (r0 == 0) goto L_0x035e
            java.lang.Object r1 = r0.A05()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x035e
        L_0x0205:
            java.lang.String r9 = r6.A0B
            r4.setTypeface(r1)
            X.CrJ r0 = r7.A06
            if (r0 == 0) goto L_0x035a
            float r2 = X.C26049CrJ.A01(r0)
        L_0x0212:
            float r0 = X.C40171uH.A00()
            float r0 = r0 * r2
            r4.setTextSize(r0)
            android.graphics.Typeface r0 = r4.getTypeface()
            r3.setTypeface(r0)
            float r0 = r4.getTextSize()
            r3.setTextSize(r0)
            int r0 = r6.A06
            float r1 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r0
            X.CrJ r0 = r7.A08
            if (r0 != 0) goto L_0x0236
            X.CrJ r0 = r7.A07
            if (r0 == 0) goto L_0x023b
        L_0x0236:
            float r0 = X.C26049CrJ.A01(r0)
            float r1 = r1 + r0
        L_0x023b:
            float r0 = X.C40171uH.A00()
            float r1 = r1 * r0
            float r27 = X.BE7.A01(r1, r2)
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r9.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r21 = java.util.Arrays.asList(r0)
            int r20 = r21.size()
            r13 = 0
            r19 = -1
        L_0x0267:
            r0 = r20
            if (r13 >= r0) goto L_0x01f5
            r0 = r21
            java.lang.String r24 = X.C17880vN.A0w(r0, r13)
            android.graphics.PointF r0 = r6.A08
            if (r0 != 0) goto L_0x0356
            r0 = 0
        L_0x0276:
            r18 = 0
            r17 = 0
            r22 = r7
            r23 = r5
            r25 = r0
            r26 = r18
            r28 = r17
            java.util.List r16 = r22.A00(r23, r24, r25, r26, r27, r28)
            r14 = 0
        L_0x0289:
            int r0 = r16.size()
            if (r14 >= r0) goto L_0x0352
            r0 = r16
            java.lang.Object r2 = r0.get(r14)
            X.CMT r2 = (X.CMT) r2
            int r19 = r19 + 1
            r8.save()
            float r1 = r2.A00
            r0 = r19
            A03(r8, r6, r1, r0)
            java.lang.String r0 = r2.A01
            r22 = r0
            r12 = 0
        L_0x02a8:
            int r10 = r22.length()
            if (r12 >= r10) goto L_0x034b
            r15 = r12
            r0 = r22
            int r1 = r0.codePointAt(r12)
            int r11 = java.lang.Character.charCount(r1)
            int r11 = r11 + r12
        L_0x02ba:
            if (r11 >= r10) goto L_0x02fa
            r0 = r22
            int r9 = r0.codePointAt(r11)
            int r2 = java.lang.Character.getType(r9)
            r0 = 16
            if (r2 == r0) goto L_0x02f1
            int r2 = java.lang.Character.getType(r9)
            r0 = 27
            if (r2 == r0) goto L_0x02f1
            int r2 = java.lang.Character.getType(r9)
            r0 = 6
            if (r2 == r0) goto L_0x02f1
            int r2 = java.lang.Character.getType(r9)
            r0 = 28
            if (r2 == r0) goto L_0x02f1
            int r2 = java.lang.Character.getType(r9)
            r0 = 8
            if (r2 == r0) goto L_0x02f1
            int r2 = java.lang.Character.getType(r9)
            r0 = 19
            if (r2 != r0) goto L_0x02fa
        L_0x02f1:
            int r0 = java.lang.Character.charCount(r9)
            int r11 = r11 + r0
            int r1 = r1 * 31
            int r1 = r1 + r9
            goto L_0x02ba
        L_0x02fa:
            X.00p r10 = r7.A0E
            long r1 = (long) r1
            int r0 = r10.A01(r1)
            if (r0 < 0) goto L_0x032a
            java.lang.Object r9 = r10.A05(r1)
            java.lang.String r9 = (java.lang.String) r9
        L_0x0309:
            int r0 = r9.length()
            int r12 = r12 + r0
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0325
            A02(r8, r4, r9)
            r0 = r3
        L_0x0316:
            A02(r8, r0, r9)
            float r1 = r4.measureText(r9)
            float r1 = r1 + r27
            r0 = r18
            r8.translate(r1, r0)
            goto L_0x02a8
        L_0x0325:
            A02(r8, r3, r9)
            r0 = r4
            goto L_0x0316
        L_0x032a:
            java.lang.StringBuilder r0 = r7.A0H
            r9 = r0
            r0 = r17
            r9.setLength(r0)
        L_0x0332:
            if (r15 >= r11) goto L_0x0343
            r0 = r22
            int r0 = r0.codePointAt(r15)
            r9.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r15 = r15 + r0
            goto L_0x0332
        L_0x0343:
            java.lang.String r9 = r9.toString()
            r10.A0A(r1, r9)
            goto L_0x0309
        L_0x034b:
            r8.restore()
            int r14 = r14 + 1
            goto L_0x0289
        L_0x0352:
            int r13 = r13 + 1
            goto L_0x0267
        L_0x0356:
            float r0 = r0.x
            goto L_0x0276
        L_0x035a:
            float r2 = r6.A02
            goto L_0x0212
        L_0x035e:
            java.util.Map r2 = r10.A0Q
            if (r2 == 0) goto L_0x0392
            java.lang.String r1 = r5.A01
            r9 = r1
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0388
            java.lang.String r1 = r5.A02
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x0388
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r5.A03
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0392
        L_0x0388:
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
        L_0x038e:
            if (r1 == 0) goto L_0x01f1
            goto L_0x0205
        L_0x0392:
            android.graphics.drawable.Drawable$Callback r0 = r10.getCallback()
            if (r0 == 0) goto L_0x01f1
            X.CSi r13 = r10.A0J
            if (r13 != 0) goto L_0x03af
            android.graphics.drawable.Drawable$Callback r1 = r10.getCallback()
            X.6Ss r0 = r10.A0E
            X.CSi r13 = new X.CSi
            r13.<init>(r1, r0)
            r10.A0J = r13
            java.lang.String r0 = r10.A0O
            if (r0 == 0) goto L_0x03af
            r13.A01 = r0
        L_0x03af:
            X.Ca2 r12 = r13.A03
            java.lang.String r11 = r5.A01
            java.lang.String r10 = r5.A03
            r12.A00 = r11
            r12.A01 = r10
            java.util.Map r9 = r13.A05
            java.lang.Object r1 = r9.get(r12)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L_0x0205
            java.util.Map r2 = r13.A04
            java.lang.Object r1 = r2.get(r11)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L_0x03fe
            X.6Ss r0 = r13.A00
            if (r0 == 0) goto L_0x0424
            X.5oS r0 = (X.C114035oS) r0
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet r0 = r0.A00
            r0.A14()
            android.graphics.Typeface r0 = X.C43421zm.A01()
        L_0x03dc:
            android.graphics.Typeface r1 = r5.A00
            if (r1 != 0) goto L_0x03fe
            if (r0 != 0) goto L_0x03fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "fonts/"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r13.A01
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            android.content.res.AssetManager r0 = r13.A02
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r0, r1)
        L_0x03fa:
            r2.put(r11, r0)
            r1 = r0
        L_0x03fe:
            java.lang.String r0 = "Italic"
            boolean r2 = r10.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r10.contains(r0)
            if (r2 == 0) goto L_0x041f
            int r2 = X.C72453Mb.A05(r0)
        L_0x0410:
            int r0 = r1.getStyle()
            if (r0 == r2) goto L_0x041a
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
        L_0x041a:
            r9.put(r12, r1)
            goto L_0x038e
        L_0x041f:
            boolean r2 = X.AnonymousClass000.A1O(r0)
            goto L_0x0410
        L_0x0424:
            r0 = 0
            goto L_0x03dc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BN5.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.BMx, X.CrJ] */
    public BN5(C38631rd r3, C40941vX r4) {
        super(r3, r4);
        this.A0G = r3;
        this.A0F = r4.A09;
        ? crJ = new C26049CrJ(r4.A0B.A00);
        this.A0K = crJ;
        crJ.A0A(this);
        A0C(crJ);
        C24946CQw cQw = r4.A0C;
        if (cQw != null) {
            C41971xP r0 = cQw.A00;
            if (r0 != null) {
                C26049CrJ BHA = r0.BHA();
                this.A00 = BHA;
                BHA.A0A(this);
                A0C(this.A00);
            }
            C41971xP r02 = cQw.A01;
            if (r02 != null) {
                C26049CrJ BHA2 = r02.BHA();
                this.A02 = BHA2;
                BHA2.A0A(this);
                A0C(this.A02);
            }
            C40561uu r03 = cQw.A02;
            if (r03 != null) {
                C26049CrJ BHA3 = r03.BHA();
                this.A04 = BHA3;
                BHA3.A0A(this);
                A0C(this.A04);
            }
            C40561uu r04 = cQw.A03;
            if (r04 != null) {
                C26049CrJ BHA4 = r04.BHA();
                this.A07 = BHA4;
                BHA4.A0A(this);
                A0C(this.A07);
            }
        }
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    public void BBs(C25723Ckt ckt, Object obj) {
        C26049CrJ crJ;
        super.BBs(ckt, obj);
        if (obj == EBL.A0Z) {
            C26049CrJ crJ2 = this.A01;
            if (crJ2 != null) {
                this.A0M.remove(crJ2);
            }
            if (ckt == null) {
                this.A01 = null;
                return;
            }
            C22732BMv bMv = new C22732BMv(ckt, (Object) null);
            this.A01 = bMv;
            bMv.A0A(this);
            crJ = this.A01;
        } else if (obj == EBL.A0c) {
            C26049CrJ crJ3 = this.A03;
            if (crJ3 != null) {
                this.A0M.remove(crJ3);
            }
            if (ckt == null) {
                this.A03 = null;
                return;
            }
            C22732BMv bMv2 = new C22732BMv(ckt, (Object) null);
            this.A03 = bMv2;
            bMv2.A0A(this);
            crJ = this.A03;
        } else if (obj == EBL.A0O) {
            C26049CrJ crJ4 = this.A05;
            if (crJ4 != null) {
                this.A0M.remove(crJ4);
            }
            if (ckt == null) {
                this.A05 = null;
                return;
            }
            C22732BMv bMv3 = new C22732BMv(ckt, (Object) null);
            this.A05 = bMv3;
            bMv3.A0A(this);
            crJ = this.A05;
        } else if (obj == EBL.A0Q) {
            C26049CrJ crJ5 = this.A08;
            if (crJ5 != null) {
                this.A0M.remove(crJ5);
            }
            if (ckt == null) {
                this.A08 = null;
                return;
            }
            C22732BMv bMv4 = new C22732BMv(ckt, (Object) null);
            this.A08 = bMv4;
            bMv4.A0A(this);
            crJ = this.A08;
        } else if (obj == EBL.A0P) {
            C26049CrJ crJ6 = this.A06;
            if (crJ6 != null) {
                this.A0M.remove(crJ6);
            }
            if (ckt == null) {
                this.A06 = null;
                return;
            }
            C22732BMv bMv5 = new C22732BMv(ckt, (Object) null);
            this.A06 = bMv5;
            bMv5.A0A(this);
            crJ = this.A06;
        } else if (obj == EBL.A07) {
            C26049CrJ crJ7 = this.A09;
            if (crJ7 != null) {
                this.A0M.remove(crJ7);
            }
            if (ckt == null) {
                this.A09 = null;
                return;
            }
            C22732BMv bMv6 = new C22732BMv(ckt, (Object) null);
            this.A09 = bMv6;
            bMv6.A0A(this);
            crJ = this.A09;
        } else if (obj == "dynamic_text") {
            this.A0K.A0C(ckt);
            return;
        } else {
            return;
        }
        A0C(crJ);
    }

    public void BNg(Matrix matrix, RectF rectF, boolean z) {
        super.BNg(matrix, rectF, z);
        C39801tf r2 = this.A0F;
        BE7.A13(rectF, BE6.A02(r2.A04), r2.A04.height());
    }
}
