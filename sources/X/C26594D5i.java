package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.D5i  reason: case insensitive filesystem */
public final class C26594D5i implements EA0 {
    public final long A00;
    public final C26043Cr7 A01;
    public final C26596D5k A02;
    public final CharSequence A03;
    public final List A04;
    public final C18100vl A05;
    public final int A06;

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r9 <= r13.A01.A08.getEllipsisStart(r10)) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x012a, code lost:
        if (r6 != 6) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0130, code lost:
        if (r6 != 4) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018f, code lost:
        if (r1.length == 0) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0197 A[LOOP:1: B:102:0x0195->B:103:0x0197, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26594D5i(X.C26596D5k r23, int r24, long r25, boolean r27) {
        /*
            r22 = this;
            r13 = r22
            r13.<init>()
            r6 = r23
            r13.A02 = r6
            r5 = r24
            r13.A06 = r5
            r8 = r25
            r13.A00 = r8
            int r0 = androidx.compose.ui.unit.Constraints.A02(r8)
            if (r0 != 0) goto L_0x024d
            int r0 = androidx.compose.ui.unit.Constraints.A03(r8)
            if (r0 != 0) goto L_0x024d
            r4 = 1
            r3 = 0
            if (r5 < r4) goto L_0x0246
            X.Cvq r2 = r6.A02
            r12 = 0
            if (r27 == 0) goto L_0x0049
            X.CrN r0 = r2.A02
            long r0 = r0.A02
            long r10 = X.C26054CrP.A02(r3)
            X.ClU[] r7 = X.C26130Cst.A02
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            long r10 = X.C26130Cst.A01
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x0049
            X.Cqy r0 = r2.A00
            int r1 = r0.A02
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0049
            r0 = 5
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 == r0) goto L_0x0049
            r12 = 1
        L_0x0049:
            java.lang.CharSequence r10 = r6.A06
            if (r12 == 0) goto L_0x0075
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r10 instanceof android.text.Spannable
            if (r0 != 0) goto L_0x005d
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r10)
            r10 = r0
        L_0x005d:
            android.text.Spannable r10 = (android.text.Spannable) r10
            X.D4Q r7 = new X.D4Q
            r7.<init>()
            int r0 = r10.length()
            int r6 = r0 + -1
            int r0 = r10.length()
            int r1 = r0 + -1
            r0 = 33
            r10.setSpan(r7, r6, r1, r0)
        L_0x0075:
            r13.A03 = r10
            X.Cqy r1 = r2.A00
            int r6 = r1.A02
            if (r6 != r4) goto L_0x0119
            r15 = 3
        L_0x007e:
            r16 = 0
        L_0x0080:
            int r0 = r1.A00
            r6 = 2
            if (r0 != r6) goto L_0x0115
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 32
            r18 = 4
            if (r7 > r0) goto L_0x008f
            r18 = 2
        L_0x008f:
            int r7 = r1.A01
            r1 = r7 & 255(0xff, float:3.57E-43)
            boolean r0 = X.BE8.A1T(r1)
            r19 = 0
            if (r0 != 0) goto L_0x009f
            if (r1 != r6) goto L_0x010f
            r19 = 1
        L_0x009f:
            int r0 = r7 >> 8
            r1 = r0 & 255(0xff, float:3.57E-43)
            boolean r0 = X.BE8.A1T(r1)
            r20 = 0
            if (r0 != 0) goto L_0x00af
            if (r1 != r6) goto L_0x0103
            r20 = 1
        L_0x00af:
            int r0 = r7 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            boolean r1 = X.AnonymousClass000.A1T(r0, r4)
            r21 = 0
            if (r1 != 0) goto L_0x00bf
            if (r0 != r6) goto L_0x00bf
            r21 = 1
        L_0x00bf:
            r6 = 0
            if (r27 == 0) goto L_0x0101
            android.text.TextUtils$TruncateAt r14 = android.text.TextUtils.TruncateAt.END
        L_0x00c4:
            r17 = r5
            X.Cr7 r1 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r27 == 0) goto L_0x0145
            boolean r0 = r1.A0A
            android.text.Layout r7 = r1.A08
            if (r0 == 0) goto L_0x00fc
            int r0 = r1.A04
            int r0 = r0 + -1
            int r0 = r7.getLineBottom(r0)
        L_0x00da:
            int r7 = r1.A05
            int r0 = r0 + r7
            int r7 = r1.A02
            int r0 = r0 + r7
            int r7 = r1.A03
            int r0 = r0 + r7
            int r7 = androidx.compose.ui.unit.Constraints.A00(r8)
            if (r0 <= r7) goto L_0x0145
            if (r5 <= r4) goto L_0x0145
            int r9 = r1.A04
            r0 = 0
        L_0x00ee:
            if (r0 >= r9) goto L_0x0134
            float r10 = r1.A02(r0)
            float r8 = (float) r7
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0135
            int r0 = r0 + 1
            goto L_0x00ee
        L_0x00fc:
            int r0 = r7.getHeight()
            goto L_0x00da
        L_0x0101:
            r14 = r6
            goto L_0x00c4
        L_0x0103:
            r0 = 3
            if (r1 != r0) goto L_0x0109
            r20 = 2
            goto L_0x00af
        L_0x0109:
            r0 = 4
            if (r1 != r0) goto L_0x00af
            r20 = 3
            goto L_0x00af
        L_0x010f:
            r0 = 3
            if (r1 != r0) goto L_0x009f
            r19 = 2
            goto L_0x009f
        L_0x0115:
            r18 = 0
            goto L_0x008f
        L_0x0119:
            r0 = 2
            if (r6 != r0) goto L_0x011f
            r15 = 4
            goto L_0x007e
        L_0x011f:
            r0 = 3
            if (r6 != r0) goto L_0x0125
            r15 = 2
            goto L_0x007e
        L_0x0125:
            r0 = 5
            if (r6 == r0) goto L_0x012c
            r0 = 6
            r15 = 1
            if (r6 == r0) goto L_0x007e
        L_0x012c:
            r15 = 0
            r0 = 4
            r16 = 1
            if (r6 == r0) goto L_0x0080
            goto L_0x007e
        L_0x0134:
            r0 = r9
        L_0x0135:
            if (r0 < 0) goto L_0x0142
            if (r0 == r5) goto L_0x0142
            if (r0 >= r4) goto L_0x013c
            r0 = 1
        L_0x013c:
            r17 = r0
            X.Cr7 r1 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0142:
            r13.A01 = r1
            goto L_0x0147
        L_0x0145:
            r13.A01 = r1
        L_0x0147:
            X.D5k r0 = r13.A02
            X.BGL r8 = r0.A05
            X.0Hv r7 = r2.A06()
            long r0 = r13.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r1 = (float) r0
            float r0 = r13.BSR()
            long r0 = X.AnonymousClass001.A0p(r1, r0)
            long r4 = X.AnonymousClass0QG.A01
            float r2 = r2.A03()
            r8.A00(r7, r2, r0)
            X.Cr7 r0 = r13.A01
            android.text.Layout r1 = r0.A08
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0191
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r0 = "null cannot be cast to non-null type android.text.Spanned"
            X.C18070vi.A0z(r2, r0)
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.CharSequence r0 = r1.getText()
            int r1 = r0.length()
            java.lang.Class<X.BGU> r0 = X.BGU.class
            java.lang.Object[] r1 = r2.getSpans(r3, r1, r0)
            X.BGU[] r1 = (X.BGU[]) r1
            int r0 = r1.length
            if (r0 != 0) goto L_0x0193
        L_0x0191:
            X.BGU[] r1 = new X.BGU[r3]
        L_0x0193:
            int r9 = r1.length
            r8 = 0
        L_0x0195:
            if (r8 >= r9) goto L_0x01b5
            r7 = r1[r8]
            long r4 = r13.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r4)
            float r2 = (float) r0
            float r0 = r13.BSR()
            long r4 = X.AnonymousClass001.A0p(r2, r0)
            X.0uU r2 = r7.A00
            X.0QG r0 = new X.0QG
            r0.<init>(r4)
            r2.setValue(r0)
            int r8 = r8 + 1
            goto L_0x0195
        L_0x01b5:
            java.lang.CharSequence r8 = r13.A03
            boolean r0 = r8 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x01cd
            X.0wS r7 = X.C18460wS.A00
        L_0x01bd:
            r13.A04 = r7
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.Dfj r0 = new X.Dfj
            r0.<init>(r13)
            X.0vl r0 = X.AnonymousClass1DF.A00(r1, r0)
            r13.A05 = r0
            return
        L_0x01cd:
            r2 = r8
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r8.length()
            java.lang.Class<X.BGj> r0 = X.C22623BGj.class
            java.lang.Object[] r0 = r2.getSpans(r3, r1, r0)
            int r5 = r0.length
            java.util.ArrayList r7 = X.C17880vN.A0z(r5)
            r4 = 0
        L_0x01e0:
            if (r4 >= r5) goto L_0x01bd
            r0 = r8
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r0.getSpanStart(r6)
            int r9 = r0.getSpanEnd(r6)
            X.Cr7 r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r10 = r0.getLineForOffset(r2)
            int r0 = r13.A06
            boolean r11 = X.C108975cc.A1C(r10, r0)
            X.Cr7 r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisCount(r10)
            if (r0 <= 0) goto L_0x0210
            X.Cr7 r0 = r13.A01
            android.text.Layout r0 = r0.A08
            int r0 = r0.getEllipsisStart(r10)
            r1 = 1
            if (r9 > r0) goto L_0x0211
        L_0x0210:
            r1 = 0
        L_0x0211:
            X.Cr7 r0 = r13.A01
            int r0 = r0.A06(r10)
            boolean r0 = X.C108975cc.A1D(r9, r0)
            if (r1 != 0) goto L_0x0240
            if (r0 != 0) goto L_0x0240
            if (r11 != 0) goto L_0x0240
            X.Cr7 r0 = r13.A01
            android.text.Layout r0 = r0.A08
            boolean r0 = r0.isRtlCharAt(r2)
            if (r0 == 0) goto L_0x023d
            X.By3 r0 = X.C24245By3.Rtl
        L_0x022d:
            int r1 = r0.ordinal()
            X.Cr7 r0 = r13.A01
            r0.A04(r2, r3)
            java.lang.String r0 = "getWidthPx"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x023d:
            X.By3 r0 = X.C24245By3.Ltr
            goto L_0x022d
        L_0x0240:
            r7.add(r6)
            int r4 = r4 + 1
            goto L_0x01e0
        L_0x0246:
            java.lang.String r0 = "maxLines should be greater than 0"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x024d:
            java.lang.String r0 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26594D5i.<init>(X.D5k, int, long, boolean):void");
    }

    private final C26043Cr7 A00(TextUtils.TruncateAt truncateAt, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        C26131Csu csu;
        CharSequence charSequence = this.A03;
        float A012 = (float) Constraints.A01(this.A00);
        C26596D5k d5k = this.A02;
        BGL bgl = d5k.A05;
        int i8 = d5k.A01;
        C25738Cl8 cl8 = d5k.A03;
        C26251Cvq cvq = d5k.A02;
        BGM bgm = CE7.A00;
        C25772Clj clj = cvq.A01;
        if (clj == null || (csu = clj.A00) == null) {
            z = false;
        } else {
            z = csu.A01;
        }
        return new C26043Cr7(bgl, truncateAt, cl8, charSequence, A012, i, i8, i3, i5, i6, i7, i4, i2, z);
    }

    public float A02() {
        return this.A02.BUy();
    }

    public boolean BQe() {
        return this.A01.A0A;
    }

    public float BRl() {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        C26043Cr7 cr7 = this.A01;
        float f = (float) cr7.A05;
        if (0 != cr7.A04 - 1 || (fontMetricsInt = cr7.A06) == null) {
            lineBaseline = (float) cr7.A08.getLineBaseline(0);
        } else {
            lineBaseline = cr7.A03(0) - ((float) fontMetricsInt.ascent);
        }
        return f + lineBaseline;
    }

    public float BSR() {
        int height;
        C26043Cr7 cr7 = this.A01;
        boolean z = cr7.A0A;
        Layout layout = cr7.A08;
        if (z) {
            height = layout.getLineBottom(cr7.A04 - 1);
        } else {
            height = layout.getHeight();
        }
        return (float) (height + cr7.A05 + cr7.A02 + cr7.A03);
    }

    public float BTo() {
        float lineBaseline;
        C26043Cr7 cr7 = this.A01;
        int i = cr7.A04 - 1;
        float f = (float) cr7.A05;
        Paint.FontMetricsInt fontMetricsInt = cr7.A06;
        if (fontMetricsInt != null) {
            lineBaseline = cr7.A03(i) - ((float) fontMetricsInt.ascent);
        } else {
            lineBaseline = (float) cr7.A08.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public float BUS() {
        return this.A02.A03.A01();
    }

    public float Bbp() {
        return (float) Constraints.A01(this.A00);
    }

    public void CB4(C16960tV r8, AnonymousClass0NG r9, C02000Cg r10, C25827Cme cme, long j) {
        BGL bgl = this.A02.A05;
        C16790tE r5 = bgl.A03;
        AnonymousClass0WR r4 = (AnonymousClass0WR) r5;
        int i = r4.A00;
        if (j != C05100Qk.A05) {
            r5.CIO(j);
            r4.A02 = null;
            r4.A01.setShader((Shader) null);
        }
        bgl.A01(r9);
        bgl.A03(cme);
        bgl.A02(r10);
        r5.CI6(3);
        A01(r8);
        r5.CI6(i);
    }

    public void CB5(C03380Hv r8, C16960tV r9, AnonymousClass0NG r10, C02000Cg r11, C25827Cme cme, float f) {
        BGL bgl = this.A02.A05;
        C16790tE r5 = bgl.A03;
        int i = ((AnonymousClass0WR) r5).A00;
        long A0p = AnonymousClass001.A0p((float) Constraints.A01(this.A00), BSR());
        long j = AnonymousClass0QG.A01;
        bgl.A00(r8, f, A0p);
        bgl.A01(r10);
        bgl.A03(cme);
        bgl.A02(r11);
        r5.CI6(3);
        A01(r9);
        r5.CI6(i);
    }

    private final void A01(C16960tV r8) {
        Canvas A002 = AnonymousClass0M0.A00(r8);
        C26043Cr7 cr7 = this.A01;
        boolean z = cr7.A0A;
        if (z) {
            A002.save();
            A002.clipRect(0.0f, 0.0f, (float) Constraints.A01(this.A00), BSR());
        }
        if (A002.getClipBounds(cr7.A07)) {
            int i = cr7.A05;
            if (i != 0) {
                A002.translate(0.0f, (float) i);
            }
            C22591BEq bEq = C25430Cfc.A01;
            bEq.A00 = A002;
            cr7.A08.draw(bEq);
            if (i != 0) {
                A002.translate(0.0f, -1.0f * ((float) i));
            }
        }
        if (z) {
            A002.restore();
        }
    }
}
