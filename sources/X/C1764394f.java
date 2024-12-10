package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.94f  reason: invalid class name and case insensitive filesystem */
public final class C1764394f extends AnonymousClass8IQ {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C36531o3 A06;
    public final View A07;
    public final TextEmojiLabel A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final WaTextView A0E;
    public final WaTextView A0F;
    public final WaTextView A0G;
    public final WaTextView A0H;
    public final WaTextView A0I;
    public final WaTextView A0J;
    public final AnonymousClass11C A0K;
    public final C18030ve A0L;
    public final AnonymousClass1R2 A0M;
    public final C36401np A0N;

    private final void A01(int i, boolean z) {
        View view = this.A07;
        int i2 = i;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        WaTextView waTextView = this.A0G;
        waTextView.setVisibility(i);
        waTextView.setVisibility(i);
        this.A0I.setVisibility(i);
        this.A0J.setVisibility(i);
        this.A0A.setVisibility(i);
        this.A0B.setVisibility(i);
        this.A0E.setVisibility(i);
        this.A0F.setVisibility(i);
        this.A0C.setVisibility(i);
        this.A0D.setVisibility(i);
    }

    private final void A02(Context context, int i) {
        this.A02.setVisibility(i);
        this.A03.setVisibility(i);
        TextEmojiLabel textEmojiLabel = this.A08;
        textEmojiLabel.setVisibility(i);
        AnonymousClass3Ma.A1K(textEmojiLabel, this.A0K);
        AnonymousClass3Ma.A1L(this.A0L, textEmojiLabel);
        textEmojiLabel.setText(new SpannableString(this.A0N.A06(context, new C21427Aju(this, 29), context.getString(2131896982), "installment-learn-more", C72463Mc.A02(context))));
    }

    private final void A03(WaTextView waTextView, WaTextView waTextView2, C18000vb r6, String str, String str2, int i) {
        if (str2 == null || str2.length() == 0) {
            waTextView.setVisibility(8);
            waTextView2.setVisibility(8);
            return;
        }
        waTextView.setText(A00(r6, str, i));
        waTextView.setVisibility(0);
        waTextView2.setText(str2);
        waTextView2.setVisibility(0);
        int i2 = 5;
        int i3 = 3;
        if (AnonymousClass3MW.A1Z(r6)) {
            i3 = 5;
        }
        waTextView.setGravity(i3);
        if (AnonymousClass3MW.A1Z(r6)) {
            i2 = 3;
        }
        waTextView2.setGravity(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C183399Yc r35) {
        /*
            r34 = this;
            r1 = r35
            r2 = 0
            X.C18070vi.A0d(r1, r2)
            X.94I r1 = (X.AnonymousClass94I) r1
            X.0vb r5 = r1.A01
            X.AEn r3 = r1.A04
            X.AEU r8 = r3.A0D
            X.AE1 r10 = r8.A06
            java.lang.String r30 = r3.A07(r5, r10)
            java.lang.String r15 = r1.A06
            java.lang.String r0 = r1.A07
            r17 = r0
            X.AE1 r9 = r8.A04
            java.lang.String r32 = r3.A07(r5, r9)
            X.AE1 r0 = r8.A05
            r33 = r0
            java.lang.String r25 = r3.A07(r5, r0)
            r0 = r34
            X.1R2 r4 = r0.A0M
            boolean r6 = r4.A0r(r3)
            X.0vb r4 = r4.A05
            if (r6 == 0) goto L_0x0244
            java.lang.String r16 = r3.A05(r4)
        L_0x0038:
            X.AEh r6 = r1.A02
            r4 = 8
            if (r6 == 0) goto L_0x0233
            int r7 = r6.A01
            r18 = r7
            r11 = 1
            if (r7 <= r11) goto L_0x0233
            android.content.Context r7 = r1.A00
            r26 = r7
            X.ARR r7 = r6.A02
            if (r7 == 0) goto L_0x0082
            X.1KJ r11 = r7.A01
            X.1KN r7 = r7.A02
            java.lang.String r14 = r11.BLc(r5, r7)
            android.content.res.Resources r13 = r26.getResources()
            r12 = 2131893757(0x7f121dfd, float:1.94223E38)
            java.lang.Object[] r11 = X.AnonymousClass3MW.A1b()
            java.lang.String r7 = java.lang.String.valueOf(r18)
            X.AnonymousClass8BS.A1B(r7, r14, r11)
            java.lang.String r23 = r13.getString(r12, r11)
            X.C18070vi.A0X(r23)
            com.whatsapp.WaTextView r11 = r0.A02
            com.whatsapp.WaTextView r7 = r0.A03
            r24 = 2131891372(0x7f1214ac, float:1.9417462E38)
            r22 = 0
            r18 = r0
            r19 = r11
            r20 = r7
            r21 = r5
            r18.A03(r19, r20, r21, r22, r23, r24)
        L_0x0082:
            X.ARR r11 = r6.A03
            if (r11 == 0) goto L_0x0227
            int r6 = r11.getValue()
            if (r6 <= 0) goto L_0x0227
            X.1KJ r7 = r11.A01
            X.1KN r6 = r11.A02
            java.lang.String r23 = r7.BLc(r5, r6)
            com.whatsapp.WaTextView r7 = r0.A00
            com.whatsapp.WaTextView r6 = r0.A01
            r24 = 2131890388(0x7f1210d4, float:1.9415466E38)
            r22 = 0
            r18 = r0
            r19 = r7
            r20 = r6
            r21 = r5
            r18.A03(r19, r20, r21, r22, r23, r24)
            r7.setVisibility(r2)
            r6.setVisibility(r2)
        L_0x00ae:
            r11 = r26
            r0.A02(r11, r2)
        L_0x00b3:
            java.lang.String r11 = r1.A05
            if (r11 == 0) goto L_0x0220
            r24 = 2131893188(0x7f121bc4, float:1.9421145E38)
            r22 = 0
            r18 = r0
            r19 = r7
            r20 = r6
            r21 = r5
            r23 = r11
            r18.A03(r19, r20, r21, r22, r23, r24)
            X.BD6 r12 = r1.A03
            if (r12 == 0) goto L_0x00d4
            com.whatsapp.WaImageView r13 = r0.A09
            r11 = 10
            X.AFR.A00(r13, r12, r11)
        L_0x00d4:
            com.whatsapp.WaImageView r11 = r0.A09
            X.AnonymousClass8BU.A16(r11, r7, r6, r2)
        L_0x00d9:
            r6 = 0
            if (r10 != 0) goto L_0x021c
            r10 = r6
        L_0x00dd:
            if (r9 == 0) goto L_0x00e1
            java.lang.String r6 = r9.A02
        L_0x00e1:
            if (r30 == 0) goto L_0x00e9
            int r7 = r30.length()
            if (r7 != 0) goto L_0x011a
        L_0x00e9:
            if (r15 == 0) goto L_0x00f1
            int r7 = r15.length()
            if (r7 != 0) goto L_0x011a
        L_0x00f1:
            if (r32 == 0) goto L_0x00f9
            int r7 = r32.length()
            if (r7 != 0) goto L_0x011a
        L_0x00f9:
            if (r17 == 0) goto L_0x0101
            int r7 = r17.length()
            if (r7 != 0) goto L_0x011a
        L_0x0101:
            boolean r3 = r1.A08
            r0.A01(r4, r3)
        L_0x0106:
            com.whatsapp.WaTextView r5 = r0.A04
            r3 = r16
            r5.setText(r3)
            boolean r1 = r1.A09
            com.whatsapp.WaTextView r0 = r0.A05
            if (r1 == 0) goto L_0x024a
            r0.setVisibility(r2)
            r5.setVisibility(r2)
            return
        L_0x011a:
            boolean r7 = r1.A08
            r0.A01(r2, r7)
            com.whatsapp.WaTextView r9 = r0.A0G
            com.whatsapp.WaTextView r7 = r0.A0H
            r26 = 2131893254(0x7f121c06, float:1.942128E38)
            r24 = 0
            r20 = r0
            r21 = r9
            r22 = r7
            r23 = r5
            r20.A03(r21, r22, r23, r24, r25, r26)
            com.whatsapp.WaTextView r9 = r0.A0I
            com.whatsapp.WaTextView r7 = r0.A0J
            r31 = 2131893255(0x7f121c07, float:1.9421281E38)
            r25 = r0
            r26 = r9
            r27 = r7
            r28 = r5
            r29 = r10
            r25.A03(r26, r27, r28, r29, r30, r31)
            com.whatsapp.WaTextView r10 = r0.A0A
            com.whatsapp.WaTextView r9 = r0.A0B
            X.AE1 r11 = r8.A03
            if (r15 == 0) goto L_0x0214
            int r7 = r15.length()
            if (r7 == 0) goto L_0x0214
            if (r11 == 0) goto L_0x0214
            java.lang.String r8 = r11.A02
            if (r8 == 0) goto L_0x01b2
            int r7 = r8.length()
            if (r7 == 0) goto L_0x01b2
            r3 = 2131893190(0x7f121bc6, float:1.942115E38)
            java.lang.String r3 = r0.A00(r5, r8, r3)
        L_0x0168:
            r10.setText(r3)
            r10.setVisibility(r2)
            r9.setText(r15)
            r9.setVisibility(r2)
            boolean r8 = X.AnonymousClass3MW.A1Z(r5)
            r7 = 5
            r3 = 3
            if (r8 == 0) goto L_0x017d
            r3 = 5
        L_0x017d:
            r10.setGravity(r3)
            boolean r3 = X.AnonymousClass3MW.A1Z(r5)
            if (r3 == 0) goto L_0x0187
            r7 = 3
        L_0x0187:
            r9.setGravity(r7)
        L_0x018a:
            com.whatsapp.WaTextView r7 = r0.A0C
            com.whatsapp.WaTextView r3 = r0.A0D
            r14 = 2131893198(0x7f121bce, float:1.9421166E38)
            r8 = r0
            r9 = r7
            r10 = r3
            r11 = r5
            r12 = r24
            r13 = r17
            r8.A03(r9, r10, r11, r12, r13, r14)
            com.whatsapp.WaTextView r7 = r0.A0E
            com.whatsapp.WaTextView r3 = r0.A0F
            r33 = 2131893232(0x7f121bf0, float:1.9421235E38)
            r27 = r0
            r28 = r7
            r29 = r3
            r30 = r5
            r31 = r6
            r27.A03(r28, r29, r30, r31, r32, r33)
            goto L_0x0106
        L_0x01b2:
            X.ARR r11 = r3.A02(r11)
            X.C17960vV.A07(r33)
            X.C18070vi.A0X(r33)
            r7 = r33
            X.ARR r8 = r3.A02(r7)
            X.1KN r7 = r11.A02
            java.math.BigDecimal r11 = r7.A00
            X.1KN r7 = r8.A02
            java.math.BigDecimal r8 = r7.A00
            java.math.RoundingMode r7 = java.math.RoundingMode.HALF_UP
            java.math.BigDecimal r11 = r11.divide(r8, r7)
            r8 = 100
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r8)
            java.math.BigDecimal r8 = r11.multiply(r7)
            int r7 = r8.signum()
            if (r7 != 0) goto L_0x020f
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r7, r2)
        L_0x01e8:
            X.C18070vi.A0X(r8)
            X.1KJ r3 = r3.A0A
            if (r3 == 0) goto L_0x0204
            java.lang.String r11 = r3.BLb(r5, r8)
        L_0x01f3:
            X.C18070vi.A0b(r11)
            android.content.Context r8 = r10.getContext()
            r7 = 2131893191(0x7f121bc7, float:1.9421152E38)
            r3 = 1
            java.lang.String r3 = X.C17890vO.A0R(r8, r11, r3, r2, r7)
            goto L_0x0168
        L_0x0204:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r3 = ""
            java.lang.String r11 = X.AnonymousClass001.A1E(r8, r3, r7)
            goto L_0x01f3
        L_0x020f:
            java.math.BigDecimal r8 = r8.stripTrailingZeros()
            goto L_0x01e8
        L_0x0214:
            r10.setVisibility(r4)
            r9.setVisibility(r4)
            goto L_0x018a
        L_0x021c:
            java.lang.String r10 = r10.A02
            goto L_0x00dd
        L_0x0220:
            com.whatsapp.WaImageView r11 = r0.A09
            X.AnonymousClass8BU.A16(r11, r7, r6, r4)
            goto L_0x00d9
        L_0x0227:
            com.whatsapp.WaTextView r7 = r0.A00
            r7.setVisibility(r4)
            com.whatsapp.WaTextView r6 = r0.A01
            r6.setVisibility(r4)
            goto L_0x00ae
        L_0x0233:
            android.content.Context r6 = r1.A00
            r0.A02(r6, r4)
            com.whatsapp.WaTextView r7 = r0.A00
            r7.setVisibility(r4)
            com.whatsapp.WaTextView r6 = r0.A01
            r6.setVisibility(r4)
            goto L_0x00b3
        L_0x0244:
            java.lang.String r16 = r3.A06(r4)
            goto L_0x0038
        L_0x024a:
            r0.setVisibility(r4)
            r5.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764394f.A0B(X.9Yc):void");
    }

    public C1764394f(View view, C36531o3 r3, AnonymousClass11C r4, C18030ve r5, AnonymousClass1R2 r6, C36401np r7) {
        super(view);
        this.A0L = r5;
        this.A0N = r7;
        this.A0M = r6;
        this.A0K = r4;
        this.A06 = r3;
        this.A0G = AnonymousClass3Ma.A0N(view, 2131435902);
        this.A0H = AnonymousClass3Ma.A0N(view, 2131435900);
        this.A0I = AnonymousClass3Ma.A0N(view, 2131436026);
        this.A0J = AnonymousClass3Ma.A0N(view, 2131436025);
        this.A0A = AnonymousClass3Ma.A0N(view, 2131430047);
        this.A0B = AnonymousClass3Ma.A0N(view, 2131430046);
        this.A0C = AnonymousClass3Ma.A0N(view, 2131433253);
        this.A0D = AnonymousClass3Ma.A0N(view, 2131433251);
        this.A0E = AnonymousClass3Ma.A0N(view, 2131435429);
        this.A0F = AnonymousClass3Ma.A0N(view, 2131435427);
        this.A05 = AnonymousClass3Ma.A0N(view, 2131436321);
        this.A04 = AnonymousClass3Ma.A0N(view, 2131436320);
        this.A07 = C18070vi.A05(view, 2131429772);
        this.A02 = AnonymousClass3Ma.A0N(view, 2131431708);
        this.A03 = AnonymousClass3Ma.A0N(view, 2131431701);
        this.A00 = AnonymousClass3Ma.A0N(view, 2131430833);
        this.A09 = C108965cb.A0I(view, 2131430827);
        this.A01 = AnonymousClass3Ma.A0N(view, 2131430832);
        this.A08 = C72453Mb.A0c(view, 2131431705);
    }

    private final String A00(C18000vb r6, String str, int i) {
        String A0F2 = C18070vi.A0F(C108945cZ.A0D(this), i);
        if (str == null || str.length() == 0) {
            return A0F2;
        }
        boolean A1b = AnonymousClass3MY.A1b(r6);
        StringBuilder A10 = AnonymousClass000.A10();
        if (A1b) {
            C17900vP.A0c(A0F2, " (", str, ") ", A10);
        } else {
            C17900vP.A0c(" (", str, ") ", A0F2, A10);
        }
        return A10.toString();
    }
}
