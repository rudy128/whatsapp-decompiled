package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.8ni  reason: invalid class name and case insensitive filesystem */
public class C169878ni extends AnonymousClass4FG {
    public WaImageView A00;
    public final Resources A01;
    public final C18000vb A02;
    public final C18030ve A03;
    public final AnonymousClass1QO A04;
    public final AnonymousClass1R2 A05;
    public final AnonymousClass3M2 A06 = new C21085AeF(this, 2);
    public final C32021gV A07;
    public final AnonymousClass10I A08;

    public static WaImageView A00(Context context, ImageView.ScaleType scaleType, int i) {
        WaImageView waImageView = new WaImageView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167718);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131167716);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(2131167717);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2);
        layoutParams.setMargins(0, 0, dimensionPixelSize3, 0);
        waImageView.setLayoutParams(layoutParams);
        waImageView.setScaleType(scaleType);
        waImageView.setBackground(C40501uo.A00(context.getTheme(), context.getResources(), 2131232572));
        waImageView.setImageDrawable(C40501uo.A00((Resources.Theme) null, context.getResources(), i));
        return waImageView;
    }

    public C169878ni(AnonymousClass118 r3, C18000vb r4, C18030ve r5, AnonymousClass1QO r6, AnonymousClass1R2 r7, C32021gV r8, AnonymousClass10I r9) {
        this.A03 = r5;
        this.A08 = r9;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = AnonymousClass3MW.A05(r3);
        this.A07 = r8;
        this.A04 = r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fd A[SYNTHETIC, Splitter:B:72:0x01fd] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.widget.FrameLayout r14, X.AnonymousClass3uP r15, X.AnonymousClass206 r16, X.C20285AEt r17) {
        /*
            r13 = this;
            r14.removeAllViews()
            java.lang.String r0 = "payment_method"
            r6 = r17
            boolean r0 = X.AnonymousClass8BU.A1S(r6, r0)
            if (r0 != 0) goto L_0x035e
            java.lang.String r0 = "payment_status"
            boolean r0 = X.AnonymousClass8BU.A1S(r6, r0)
            if (r0 != 0) goto L_0x035e
            android.content.Context r8 = r14.getContext()
            X.8ey r5 = new X.8ey
            r5.<init>(r8)
            r14.addView(r5)
            X.AEn r10 = r6.A02
            X.C17960vV.A07(r10)
            android.content.res.Resources r7 = r13.A01
            X.0ve r1 = r13.A03
            r4 = 0
            X.C18070vi.A0d(r1, r4)
            r0 = 4248(0x1098, float:5.953E-42)
            X.0vf r11 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r11, r1, r0)
            r0 = 2
            if (r2 == r0) goto L_0x01f8
            r0 = 3
            r3 = 2131888284(0x7f12089c, float:1.9411199E38)
            if (r2 == r0) goto L_0x0042
            r3 = 2131888282(0x7f12089a, float:1.9411195E38)
        L_0x0042:
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            java.lang.String r0 = r10.A0K
            java.lang.String r2 = X.AnonymousClass3MW.A0x(r7, r0, r2, r4, r3)
            com.whatsapp.TextEmojiLabel r0 = r5.A07
            r0.setText(r2)
            java.lang.String r2 = "captured"
            java.lang.String r0 = r10.A07
            boolean r9 = r2.equals(r0)
            X.1QO r7 = r13.A04
            java.lang.String r2 = r10.A0I
            java.util.List r0 = r10.A0Q
            boolean r0 = r7.A0N(r2, r0)
            r3 = 8
            if (r0 != 0) goto L_0x0077
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0077
            X.0ve r2 = r7.A02
            r0 = 3771(0xebb, float:5.284E-42)
            boolean r0 = X.C18020vd.A05(r11, r2, r0)
            if (r0 == 0) goto L_0x01f1
        L_0x0077:
            if (r9 == 0) goto L_0x01f1
            X.1bI r0 = r5.A0F
            X.AnonymousClass3MY.A1T(r0, r4)
        L_0x007e:
            boolean r0 = r10.A08()
            if (r0 != 0) goto L_0x01d8
            com.whatsapp.TextEmojiLabel r9 = r5.A05
            r9.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r5.A09
            r0.setVisibility(r3)
        L_0x008e:
            X.1R2 r2 = r13.A05
            boolean r0 = r2.A0r(r10)
            if (r0 == 0) goto L_0x01c5
            X.0vb r0 = r13.A02
            java.lang.String r0 = r10.A05(r0)
            com.whatsapp.TextEmojiLabel r12 = r5.A04
            java.lang.CharSequence r0 = r15.A1p(r0)
            r12.setText(r0)
            r12.setVisibility(r4)
            r9.A0L()
            X.AnonymousClass9RK.A00(r9)
        L_0x00ae:
            r0 = 11527(0x2d07, float:1.6153E-41)
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            if (r0 == 0) goto L_0x01af
            X.AEE r0 = r6.A05
            if (r0 == 0) goto L_0x01af
            X.AEi r9 = r0.A00
            if (r9 == 0) goto L_0x01af
            java.lang.String r0 = r9.A07
            java.lang.String r12 = "application/pdf"
            boolean r0 = r12.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x01af
            java.lang.String r9 = r9.A04
            if (r9 == 0) goto L_0x01a5
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x01a5
            com.whatsapp.WaTextView r0 = r5.A0C
            r0.setText(r9)
        L_0x00d7:
            android.view.View r0 = r5.A00
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r9 = r5.A0A
            r9.setVisibility(r4)
            r0 = 0
            android.graphics.drawable.Drawable r0 = X.C137486vX.A01(r8, r12, r0, r4)
            r9.setImageDrawable(r0)
            android.view.View r0 = r5.A01
            r0.setVisibility(r4)
            android.view.View r0 = r5.A02
            r0.setVisibility(r3)
        L_0x00f3:
            java.lang.String r8 = r10.A0G
            X.0ve r9 = r7.A02
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = X.C18020vd.A05(r11, r9, r0)
            r7 = 8
            if (r0 != 0) goto L_0x019c
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = X.C18020vd.A05(r11, r9, r0)
            if (r0 != 0) goto L_0x019c
        L_0x0109:
            com.whatsapp.TextEmojiLabel r0 = r5.A03
            r0.setVisibility(r7)
            if (r7 != 0) goto L_0x0113
            r0.setText(r8)
        L_0x0113:
            X.AEU r12 = r10.A0D
            java.lang.String r7 = r12.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x014b
            r0 = 5574(0x15c6, float:7.811E-42)
            boolean r0 = X.C18020vd.A05(r11, r9, r0)
            if (r0 != 0) goto L_0x012f
            r0 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = X.C18020vd.A05(r11, r9, r0)
            if (r0 == 0) goto L_0x014b
        L_0x012f:
            com.whatsapp.TextEmojiLabel r0 = r5.A08
            r0.setVisibility(r3)
        L_0x0134:
            com.whatsapp.TextEmojiLabel r0 = r5.A06
            r0.setVisibility(r3)
        L_0x0139:
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r12 = r1.A0J(r0)
            java.lang.String r8 = "updated_order_bubble_subtext"
            boolean r0 = r12.has(r8)
            r7 = r16
            if (r0 == 0) goto L_0x0219
            goto L_0x01fd
        L_0x014b:
            com.whatsapp.TextEmojiLabel r7 = r5.A08
            java.lang.String r0 = r10.A0L
            java.lang.CharSequence r0 = r15.A1p(r0)
            r7.setText(r0)
            java.util.List r0 = r12.A09
            if (r0 == 0) goto L_0x0134
            int r7 = r12.A00()
            if (r7 == 0) goto L_0x0134
            X.C17960vV.A07(r0)
            int r8 = r0.size()
            r7 = 1
            if (r8 != r7) goto L_0x018c
            android.content.Context r12 = r14.getContext()
            r8 = 2131888287(0x7f12089f, float:1.9411205E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Object r0 = r0.get(r4)
            X.AET r0 = (X.AET) r0
            int r0 = r0.A01
            X.C17880vN.A1T(r7, r0, r4)
            java.lang.String r0 = r12.getString(r8, r7)
        L_0x0182:
            com.whatsapp.TextEmojiLabel r7 = r5.A06
            java.lang.CharSequence r0 = r15.A1p(r0)
            r7.setText(r0)
            goto L_0x0139
        L_0x018c:
            int r8 = r12.A00()
            android.content.res.Resources r7 = X.AnonymousClass000.A0Y(r14)
            r0 = 2131755459(0x7f1001c3, float:1.9141798E38)
            java.lang.String r0 = X.C72473Md.A0k(r7, r8, r0)
            goto L_0x0182
        L_0x019c:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0109
            r7 = 0
            goto L_0x0109
        L_0x01a5:
            com.whatsapp.WaTextView r9 = r5.A0C
            r0 = 2131897363(0x7f122c13, float:1.9429613E38)
            r9.setText(r0)
            goto L_0x00d7
        L_0x01af:
            com.whatsapp.WaImageView r0 = r5.A0A
            r0.setVisibility(r3)
            android.view.View r0 = r5.A00
            r0.setVisibility(r3)
            android.view.View r0 = r5.A01
            r0.setVisibility(r3)
            android.view.View r0 = r5.A02
            r0.setVisibility(r4)
            goto L_0x00f3
        L_0x01c5:
            com.whatsapp.TextEmojiLabel r0 = r5.A04
            r0.setVisibility(r3)
            X.C43421zm.A04(r9)
            int r0 = r9.getPaintFlags()
            r0 = r0 & -17
            r9.setPaintFlags(r0)
            goto L_0x00ae
        L_0x01d8:
            X.0vb r0 = r13.A02
            java.lang.String r0 = r10.A06(r0)
            com.whatsapp.TextEmojiLabel r9 = r5.A05
            java.lang.CharSequence r0 = r15.A1p(r0)
            r9.setText(r0)
            r9.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r0 = r5.A09
            r0.setVisibility(r4)
            goto L_0x008e
        L_0x01f1:
            X.1bI r0 = r5.A0F
            X.AnonymousClass3MY.A1T(r0, r3)
            goto L_0x007e
        L_0x01f8:
            r3 = 2131888283(0x7f12089b, float:1.9411197E38)
            goto L_0x0042
        L_0x01fd:
            int r0 = r12.getInt(r8)     // Catch:{ JSONException -> 0x0213 }
            if (r0 == 0) goto L_0x0219
            X.1bI r8 = r5.A0G
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r8)
            r0 = 2131893282(0x7f121c22, float:1.9421336E38)
            r1.setText(r0)
            X.AnonymousClass3MY.A1T(r8, r4)
            goto L_0x023f
        L_0x0213:
            r8 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_bubble_subtext"
            com.whatsapp.util.Log.e(r0, r8)
        L_0x0219:
            X.ADZ r0 = r10.A0E
            if (r0 == 0) goto L_0x0352
            int r8 = r0.A00
            r0 = 1
            if (r8 <= r0) goto L_0x0352
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0352
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = X.C18020vd.A05(r11, r1, r0)
            if (r0 == 0) goto L_0x0352
            X.1bI r0 = r5.A0G
            X.AnonymousClass3MY.A1T(r0, r4)
            android.widget.TextView r1 = X.AnonymousClass3MX.A0M(r0)
            r0 = 2131893281(0x7f121c21, float:1.9421334E38)
            r1.setText(r0)
        L_0x023f:
            r0 = 8160(0x1fe0, float:1.1435E-41)
            boolean r0 = X.C18020vd.A05(r11, r9, r0)
            if (r0 == 0) goto L_0x02e5
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x02e5
            boolean r0 = r2.A0p(r10)
            if (r0 != 0) goto L_0x02e5
            X.1bI r8 = r5.A0E
            android.view.View r1 = r8.A02()
            r0 = 2131436058(0x7f0b221a, float:1.8493976E38)
            android.view.ViewGroup r9 = X.AnonymousClass3MW.A0D(r1, r0)
            java.util.HashSet r10 = r2.A0g(r10, r7)
            r0 = 6
            boolean r0 = X.C108965cb.A1Z(r10, r0)
            if (r0 == 0) goto L_0x0288
            android.content.Context r2 = r5.getContext()
            r1 = 2131232821(0x7f080835, float:1.8081762E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            com.whatsapp.WaImageView r0 = A00(r2, r0, r1)
            r9.addView(r0)
            android.view.View r0 = r8.A02()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0288
            X.AnonymousClass3MY.A1T(r8, r4)
        L_0x0288:
            boolean r0 = X.C108965cb.A1Z(r10, r4)
            if (r0 != 0) goto L_0x0295
            r0 = 5
            boolean r0 = X.C108965cb.A1Z(r10, r0)
            if (r0 == 0) goto L_0x02c2
        L_0x0295:
            android.content.Context r2 = r5.getContext()
            r1 = 2131231043(0x7f080143, float:1.8078156E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            com.whatsapp.WaImageView r0 = A00(r2, r0, r1)
            r9.addView(r0)
            android.content.Context r2 = r5.getContext()
            r1 = 2131231042(0x7f080142, float:1.8078154E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            com.whatsapp.WaImageView r0 = A00(r2, r0, r1)
            r9.addView(r0)
            android.view.View r0 = r8.A02()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x02c2
            X.AnonymousClass3MY.A1T(r8, r4)
        L_0x02c2:
            boolean r0 = X.C108965cb.A1Z(r10, r3)
            if (r0 == 0) goto L_0x02e5
            android.content.Context r2 = r5.getContext()
            r1 = 2131231722(0x7f0803ea, float:1.8079533E38)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            com.whatsapp.WaImageView r0 = A00(r2, r0, r1)
            r9.addView(r0)
            android.view.View r0 = r8.A02()
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x02e5
            X.AnonymousClass3MY.A1T(r8, r4)
        L_0x02e5:
            com.whatsapp.WaImageView r0 = r5.A0B
            r13.A00 = r0
            r8 = 0
            X.AEn r0 = r6.A02
            if (r0 == 0) goto L_0x0302
            X.AEU r0 = r0.A0D
            java.util.List r1 = r0.A09
            if (r1 == 0) goto L_0x0302
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0302
            java.lang.Object r0 = r1.get(r4)
            X.AET r0 = (X.AET) r0
            java.lang.String r8 = r0.A00
        L_0x0302:
            X.36u r0 = r7.A0O()
            if (r0 == 0) goto L_0x0339
            byte[] r0 = r0.A01()
            if (r0 == 0) goto L_0x0339
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r7, r0)
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0339
            X.1gV r2 = r13.A07
            com.whatsapp.WaImageView r1 = r13.A00
            X.3M2 r0 = r13.A06
            r2.A0D(r1, r7, r0)
        L_0x0321:
            X.AEE r0 = r6.A05
            if (r0 == 0) goto L_0x0359
            java.lang.String r1 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0359
            X.1bI r0 = r5.A0D
            android.view.View r0 = X.AnonymousClass3MY.A0I(r0, r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            return
        L_0x0339:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            com.whatsapp.WaImageView r0 = r13.A00
            if (r1 != 0) goto L_0x034e
            X.9Ay r2 = new X.9Ay
            r2.<init>(r0, r8)
            X.10I r1 = r13.A08
            java.lang.String[] r0 = new java.lang.String[r4]
            r1.CGD(r2, r0)
            goto L_0x0321
        L_0x034e:
            r0.setVisibility(r3)
            goto L_0x0321
        L_0x0352:
            X.1bI r0 = r5.A0G
            X.AnonymousClass3MY.A1T(r0, r3)
            goto L_0x023f
        L_0x0359:
            X.1bI r0 = r5.A0D
            r0.A04(r3)
        L_0x035e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169878ni.A01(android.widget.FrameLayout, X.3uP, X.206, X.AEt):void");
    }
}
