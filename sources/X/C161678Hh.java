package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.8Hh  reason: invalid class name and case insensitive filesystem */
public class C161678Hh extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final /* synthetic */ C1763391t A01;

    public C161678Hh(C1763391t r2) {
        this.A01 = r2;
    }

    public int A0Q() {
        return this.A00.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:289:0x077c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r19, int r20) {
        /*
            r18 = this;
            r1 = r19
            boolean r0 = r1 instanceof X.AnonymousClass8IR
            r2 = r18
            r3 = r20
            if (r0 != 0) goto L_0x07b4
            boolean r0 = r1 instanceof X.AnonymousClass8IJ
            if (r0 == 0) goto L_0x07a3
            X.8IJ r1 = (X.AnonymousClass8IJ) r1
            java.util.List r0 = r2.A00
            java.lang.Object r0 = r0.get(r3)
            X.9Yd r0 = (X.C183409Yd) r0
            boolean r2 = r1 instanceof X.C1766094w
            if (r2 != 0) goto L_0x0044
            boolean r2 = r1 instanceof X.AnonymousClass95B
            if (r2 == 0) goto L_0x0045
            X.95B r1 = (X.AnonymousClass95B) r1
            X.95c r0 = (X.C1766695c) r0
            android.widget.TextView r4 = r1.A01
            java.lang.String r2 = r0.A01
            r4.setText(r2)
            java.lang.String r2 = r0.A01
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 8
            if (r2 == 0) goto L_0x0038
            r4.setVisibility(r3)
        L_0x0038:
            com.whatsapp.WaImageView r2 = r1.A02
            r2.setVisibility(r3)
            android.view.View r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
        L_0x0041:
            r1.setOnClickListener(r0)
        L_0x0044:
            return
        L_0x0045:
            boolean r2 = r1 instanceof X.AnonymousClass950
            if (r2 == 0) goto L_0x008a
            X.950 r1 = (X.AnonymousClass950) r1
            X.95k r0 = (X.C1767495k) r0
            android.widget.TextView r3 = r1.A01
            java.lang.String r2 = r0.A04
            r3.setText(r2)
            android.widget.TextView r5 = r1.A00
            java.lang.String r2 = r0.A03
            r5.setText(r2)
            android.view.View r4 = r1.A0H
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r4)
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            boolean r3 = X.C17890vO.A1R(r1)
            android.graphics.drawable.Drawable r2 = r0.A00
            if (r2 == 0) goto L_0x0077
            r1 = 0
            if (r3 == 0) goto L_0x0086
            r5.setCompoundDrawables(r1, r1, r2, r1)
        L_0x0077:
            android.view.View$OnClickListener r1 = r0.A01
            if (r1 == 0) goto L_0x007e
            r4.setOnClickListener(r1)
        L_0x007e:
            android.view.View$OnLongClickListener r0 = r0.A02
            if (r0 == 0) goto L_0x0044
            r4.setOnLongClickListener(r0)
            return
        L_0x0086:
            r5.setCompoundDrawables(r2, r1, r1, r1)
            goto L_0x0077
        L_0x008a:
            boolean r2 = r1 instanceof X.AnonymousClass958
            if (r2 == 0) goto L_0x00a7
            X.958 r1 = (X.AnonymousClass958) r1
            X.95W r0 = (X.AnonymousClass95W) r0
            X.206 r3 = r0.A00
            X.22g r3 = (X.C441322g) r3
            X.73a r2 = r1.A00
            r1 = 0
            r0 = 0
            r2.A06(r0, r3, r1)
            boolean r0 = X.AnonymousClass25A.A11(r3)
            if (r0 == 0) goto L_0x073c
            r2.A04()
            return
        L_0x00a7:
            boolean r2 = r1 instanceof X.AnonymousClass95I
            if (r2 == 0) goto L_0x0195
            X.95I r1 = (X.AnonymousClass95I) r1
            X.95n r0 = (X.C1767795n) r0
            int r3 = r0.A01
            r2 = -1
            r12 = 0
            r4 = 8
            com.whatsapp.WaTextView r6 = r1.A06
            if (r3 == r2) goto L_0x016a
            r6.setVisibility(r4)
            com.whatsapp.WaImageView r3 = r1.A05
            r3.setVisibility(r12)
            android.content.Context r7 = r1.A00
            int r2 = r0.A01
            android.graphics.drawable.Drawable r2 = X.AnonymousClass03S.A01(r7, r2)
            r3.setImageDrawable(r2)
            java.lang.CharSequence r2 = r0.A06
            r3.setContentDescription(r2)
        L_0x00d1:
            int r2 = r0.A02
            com.whatsapp.WaTextView r5 = r1.A07
            if (r2 == 0) goto L_0x0154
            X.C43421zm.A04(r5)
            int r2 = r0.A02
            r5.setText(r2)
            android.content.res.Resources r3 = r7.getResources()
            int r2 = r0.A03
            X.AnonymousClass8BS.A14(r3, r5, r2)
            java.lang.CharSequence r2 = r0.A08
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00f7
            android.widget.TextView r3 = r1.A03
            java.lang.CharSequence r2 = r0.A08
        L_0x00f4:
            r3.setText(r2)
        L_0x00f7:
            java.lang.String r2 = r0.A0C
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            com.whatsapp.TextEmojiLabel r5 = r1.A04
            if (r2 != 0) goto L_0x0151
            X.0ve r2 = r1.A09
            X.AnonymousClass3Ma.A1L(r2, r5)
            X.11C r2 = r1.A08
            X.AnonymousClass3Ma.A1K(r5, r2)
            java.lang.String r9 = r0.A0C
            java.util.Map r10 = r0.A0D
            android.content.res.Resources r3 = r7.getResources()
            int r2 = X.C72463Mc.A02(r7)
            int r11 = r3.getColor(r2)
            r8 = 0
            android.text.SpannableStringBuilder r2 = X.A3H.A01(r7, r8, r9, r10, r11, r12)
        L_0x0120:
            r5.setText(r2)
            java.lang.CharSequence r2 = r0.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            android.widget.TextView r3 = r1.A02
            if (r2 != 0) goto L_0x014d
            java.lang.CharSequence r2 = r0.A0A
            r3.setText(r2)
            r3.setVisibility(r12)
        L_0x0135:
            java.lang.CharSequence r2 = r0.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x077c
            android.widget.TextView r2 = r1.A01
            java.lang.CharSequence r1 = r0.A09
            r2.setText(r1)
            r2.setVisibility(r12)
            android.view.View$OnClickListener r0 = r0.A04
            r2.setOnClickListener(r0)
            return
        L_0x014d:
            r3.setVisibility(r4)
            goto L_0x0135
        L_0x0151:
            java.lang.CharSequence r2 = r0.A0B
            goto L_0x0120
        L_0x0154:
            r5.A0L()
            java.lang.CharSequence r2 = r0.A07
            r5.setText(r2)
            r3 = 2130971197(0x7f040a3d, float:1.7551126E38)
            r2 = 2131102532(0x7f060b44, float:1.7817505E38)
            X.C72463Mc.A0y(r7, r5, r3, r2)
            android.widget.TextView r3 = r1.A03
            java.lang.String r2 = ""
            goto L_0x00f4
        L_0x016a:
            android.graphics.drawable.Drawable r5 = r6.getBackground()
            android.content.Context r7 = r1.A00
            android.content.res.Resources r3 = r7.getResources()
            int r2 = r0.A03
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r5.setColorFilter(r3, r2)
            java.lang.CharSequence r2 = r0.A05
            r6.setText(r2)
            java.lang.CharSequence r2 = r0.A06
            r6.setContentDescription(r2)
            float r3 = r0.A00
            r2 = 0
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00d1
            r6.setTextSize(r3)
            goto L_0x00d1
        L_0x0195:
            boolean r2 = r1 instanceof X.AnonymousClass95E
            if (r2 == 0) goto L_0x01c2
            X.95E r1 = (X.AnonymousClass95E) r1
            X.95b r0 = (X.C1766595b) r0
            android.content.Context r3 = r1.A01
            X.8DC r2 = new X.8DC
            r2.<init>(r3, r0)
            android.widget.ListView r5 = r1.A03
            r5.setAdapter(r2)
            boolean r0 = r0.A01
            r4 = 0
            r3 = 8
            if (r0 == 0) goto L_0x074a
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x074a
            android.view.View r2 = r1.A02
            r2.setVisibility(r4)
            r5.setVisibility(r3)
            r0 = 17
            X.AFR.A00(r2, r1, r0)
            return
        L_0x01c2:
            boolean r2 = r1 instanceof X.AnonymousClass957
            if (r2 == 0) goto L_0x01d4
            X.957 r1 = (X.AnonymousClass957) r1
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.95o r0 = (X.C1767895o) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x0041
        L_0x01d4:
            boolean r2 = r1 instanceof X.AnonymousClass95A
            if (r2 == 0) goto L_0x020d
            X.95A r1 = (X.AnonymousClass95A) r1
            X.95e r0 = (X.C1766895e) r0
            android.widget.LinearLayout r3 = r1.A01
            android.view.View$OnClickListener r2 = r0.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r3 = r1.A00
            int r2 = X.AnonymousClass8BY.A00(r3)
            X.AnonymousClass4aX.A0D(r3, r2)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0044
            com.whatsapp.WaTextView r1 = r1.A02
            r0 = 2131893868(0x7f121e6c, float:1.9422525E38)
            r1.setText(r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131231968(0x7f0804e0, float:1.8080032E38)
            X.AnonymousClass3MX.A1B(r1, r3, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 2131102104(0x7f060998, float:1.7816637E38)
            X.AnonymousClass8BS.A10(r1, r3, r0)
            return
        L_0x020d:
            boolean r2 = r1 instanceof X.AnonymousClass95J
            if (r2 == 0) goto L_0x0340
            X.95J r1 = (X.AnonymousClass95J) r1
            X.95m r0 = (X.C1767695m) r0
            java.lang.String r2 = r0.A09
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 8
            if (r2 != 0) goto L_0x0339
            android.widget.TextView r3 = r1.A06
            java.lang.String r2 = r0.A09
            r3.setText(r2)
            android.widget.TextView r3 = r1.A05
            java.lang.String r2 = r0.A08
            r3.setText(r2)
            java.lang.String r2 = r0.A0A
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x023c
            android.widget.TextView r3 = r1.A07
            java.lang.String r2 = r0.A0A
            r3.setText(r2)
        L_0x023c:
            X.1E7 r2 = r0.A05
            if (r2 == 0) goto L_0x032e
            X.1Vd r4 = r1.A0C
            android.content.Context r3 = r1.A00
            java.lang.String r2 = "payment-transaction-payee-payer-detail"
            X.1pZ r3 = r4.A06(r3, r2)
            X.1E7 r2 = r0.A05
            android.widget.ImageView r8 = r1.A02
            r3.A07(r8, r2)
        L_0x0251:
            android.view.View$OnClickListener r2 = r0.A04
            r4 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0327
            android.widget.RelativeLayout r10 = r1.A04
            android.content.res.Resources r9 = X.AnonymousClass000.A0Y(r10)
            r7 = 2131886118(0x7f120026, float:1.9406806E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = r0.A08
            java.lang.String r2 = X.AnonymousClass3MW.A0x(r9, r2, r3, r6, r7)
            X.AnonymousClass1Y5.A06(r10, r2)
            android.content.res.Resources r9 = X.AnonymousClass000.A0Y(r10)
            r7 = 2131886119(0x7f120027, float:1.9406808E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = r0.A08
            java.lang.String r2 = X.AnonymousClass3MW.A0x(r9, r2, r3, r6, r7)
            r10.setContentDescription(r2)
            android.view.View$OnClickListener r2 = r0.A04
            r10.setOnClickListener(r2)
            com.whatsapp.WaImageView r2 = r1.A09
            r2.setVisibility(r6)
        L_0x0287:
            int r2 = r0.A01
            r8.setVisibility(r2)
            android.widget.ProgressBar r3 = r1.A03
            int r2 = r0.A02
            r3.setVisibility(r2)
            java.lang.String r2 = r0.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02da
            java.lang.String r2 = r0.A06
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02da
            X.1np r7 = r1.A0F
            com.whatsapp.TextEmojiLabel r3 = r1.A08
            android.content.Context r8 = r3.getContext()
            java.lang.String r9 = r0.A07
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r2 = "incentive-blurb-cashback-help"
            r11[r6] = r2
            java.lang.String[] r12 = new java.lang.String[r4]
            X.1LC r2 = r1.A0A
            java.lang.String r0 = r0.A06
            X.AnonymousClass8BW.A17(r2, r0, r12, r6)
            java.lang.Runnable[] r10 = new java.lang.Runnable[r4]
            r0 = 46
            X.C21422Ajp.A00(r10, r0, r6)
            android.text.SpannableString r2 = r7.A04(r8, r9, r10, r11, r12)
            X.11C r0 = r1.A0D
            X.AnonymousClass3Ma.A1K(r3, r0)
            X.0ve r0 = r1.A0E
            X.AnonymousClass3Ma.A1L(r0, r3)
            r3.setText(r2)
        L_0x02d4:
            android.view.View r0 = r1.A01
            r0.setVisibility(r6)
            return
        L_0x02da:
            java.lang.String r2 = r0.A07
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0753
            android.view.View$OnClickListener r2 = r0.A03
            if (r2 == 0) goto L_0x0753
            java.lang.String r2 = r0.A07
            android.text.Spanned r11 = android.text.Html.fromHtml(r2)
            java.lang.String r2 = r11.toString()
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r2)
            int r3 = r2.length()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Object[] r9 = r11.getSpans(r6, r3, r2)
            int r8 = r9.length
            r7 = 0
        L_0x0301:
            if (r7 >= r8) goto L_0x031a
            r2 = r9[r7]
            X.8Cx r5 = new X.8Cx
            r5.<init>(r1, r0)
            int r4 = r11.getSpanStart(r2)
            int r3 = r11.getSpanEnd(r2)
            r2 = 33
            r10.setSpan(r5, r4, r3, r2)
            int r7 = r7 + 1
            goto L_0x0301
        L_0x031a:
            com.whatsapp.TextEmojiLabel r2 = r1.A08
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r0)
            r2.setText(r10)
            goto L_0x02d4
        L_0x0327:
            com.whatsapp.WaImageView r2 = r1.A09
            r2.setVisibility(r5)
            goto L_0x0287
        L_0x032e:
            X.1VW r3 = r1.A0B
            android.widget.ImageView r8 = r1.A02
            int r2 = r0.A00
            r3.A09(r8, r2)
            goto L_0x0251
        L_0x0339:
            android.widget.RelativeLayout r2 = r1.A04
            r2.setVisibility(r5)
            goto L_0x023c
        L_0x0340:
            boolean r2 = r1 instanceof X.AnonymousClass956
            if (r2 == 0) goto L_0x0357
            X.956 r1 = (X.AnonymousClass956) r1
            X.95a r0 = (X.C1766495a) r0
            if (r0 == 0) goto L_0x0044
            android.widget.TextView r2 = r1.A00
            java.lang.String r1 = r0.A01
            r2.setText(r1)
            int r0 = r0.A00
            r2.setVisibility(r0)
            return
        L_0x0357:
            boolean r2 = r1 instanceof X.C1766294y
            if (r2 == 0) goto L_0x0373
            X.94y r1 = (X.C1766294y) r1
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.payments.ui.viewholder.viewdata.TransactionDetailShareSectionViewData"
            X.C18070vi.A0z(r0, r2)
            X.95Y r0 = (X.AnonymousClass95Y) r0
            com.whatsapp.ListItemWithLeftIcon r1 = r1.A00
            if (r1 != 0) goto L_0x036f
            java.lang.String r0 = "shareRow"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x036f:
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x0041
        L_0x0373:
            boolean r2 = r1 instanceof X.AnonymousClass955
            if (r2 == 0) goto L_0x0386
            X.955 r1 = (X.AnonymousClass955) r1
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.payments.ui.viewholder.viewdata.TransactionDetailPaymentHomeViewData"
            X.C18070vi.A0z(r0, r2)
            X.95X r0 = (X.AnonymousClass95X) r0
            com.whatsapp.ListItemWithLeftIcon r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x0041
        L_0x0386:
            boolean r2 = r1 instanceof X.AnonymousClass95G
            if (r2 == 0) goto L_0x03c6
            X.95G r1 = (X.AnonymousClass95G) r1
            X.95i r0 = (X.C1767295i) r0
            if (r0 == 0) goto L_0x0044
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x0759
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x0759
            com.whatsapp.TextEmojiLabel r11 = r1.A02
            android.content.Context r7 = r11.getContext()
            X.0ve r13 = r1.A04
            X.1KB r10 = r1.A01
            X.1L9 r9 = r1.A00
            X.11C r12 = r1.A03
            android.content.Context r6 = r11.getContext()
            r5 = 2131893472(0x7f121ce0, float:1.9421721E38)
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            r3 = 0
            java.lang.String r2 = r0.A01
            java.lang.String r14 = X.C17880vN.A0q(r6, r2, r4, r3, r5)
            java.lang.String r15 = r0.A01
            X.129 r1 = r1.A05
            java.lang.String r0 = r0.A00
            android.net.Uri r8 = r1.A03(r0)
            X.C26302CxJ.A0K(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x03c6:
            boolean r2 = r1 instanceof X.AnonymousClass952
            if (r2 == 0) goto L_0x03ee
            X.952 r1 = (X.AnonymousClass952) r1
            X.95d r0 = (X.C1766795d) r0
            android.widget.LinearLayout r3 = r1.A01
            android.view.View$OnClickListener r2 = r0.A00
            r3.setOnClickListener(r2)
            android.widget.ImageView r3 = r1.A00
            int r2 = X.AnonymousClass8BY.A00(r3)
            X.AnonymousClass4aX.A0D(r3, r2)
            boolean r2 = r0.A01
            android.widget.TextView r1 = r1.A02
            r0 = 2131899401(0x7f123409, float:1.9433747E38)
            if (r2 == 0) goto L_0x03ea
            r0 = 2131896977(0x7f122a91, float:1.942883E38)
        L_0x03ea:
            r1.setText(r0)
            return
        L_0x03ee:
            boolean r2 = r1 instanceof X.AnonymousClass95D
            if (r2 == 0) goto L_0x049f
            X.95D r1 = (X.AnonymousClass95D) r1
            X.95h r0 = (X.C1767195h) r0
            X.9NU r2 = r0.A02
            if (r2 == 0) goto L_0x0044
            X.A6R r5 = r1.A04
            android.view.View r6 = r1.A00
            X.B8b r10 = r0.A01
            X.AW0 r8 = r2.A01
            X.206 r11 = r2.A02
            android.widget.Button r7 = r1.A02
            android.widget.Button r3 = r1.A03
            android.widget.Button r2 = r1.A01
            X.9nl r9 = r0.A00
            r0 = 8
            r6.setVisibility(r0)
            int r1 = r8.A02
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 != r0) goto L_0x0450
            r0 = 2131434581(0x7f0b1c55, float:1.849098E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 2131434597(0x7f0b1c65, float:1.8491012E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 8
            r2.setVisibility(r0)
            r1.setVisibility(r0)
            r0 = 0
            r6.setVisibility(r0)
            r3.setVisibility(r0)
            X.1QS r1 = r5.A05
            java.lang.String r0 = r8.A0G
            X.2is r1 = r1.A04(r0)
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r8.A0I
            X.BD1 r2 = r1.A00(r0)
            if (r2 == 0) goto L_0x0044
            android.content.Context r1 = r6.getContext()
            r0 = 23
            X.AnonymousClass3Ma.A1F(r3, r2, r1, r11, r0)
            return
        L_0x0450:
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0765
            com.whatsapp.jid.UserJid r3 = r8.A0D
            r0 = 2131434581(0x7f0b1c55, float:1.849098E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r6, r0)
            r0 = 2131434597(0x7f0b1c65, float:1.8491012E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r6, r0)
            r1 = 8
            if (r3 == 0) goto L_0x0761
            boolean r0 = X.A6R.A02(r8, r5)
            if (r0 != 0) goto L_0x0761
            boolean r0 = r8.A0P
            if (r0 != 0) goto L_0x0761
            X.AnonymousClass8BU.A16(r4, r2, r6, r1)
            if (r7 == 0) goto L_0x0044
            r2 = 0
            r6.setVisibility(r2)
            r7.setVisibility(r2)
            int r0 = r8.A02
            r1 = 19
            if (r0 != r1) goto L_0x0487
            r2 = 1
        L_0x0487:
            X.A6R.A01(r7, r8, r5, r2)
            int r0 = r8.A02
            if (r0 == r1) goto L_0x0044
            r17 = 4
            X.78H r11 = new X.78H
            r12 = r5
            r13 = r7
            r14 = r10
            r15 = r8
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.setOnClickListener(r11)
            return
        L_0x049f:
            boolean r2 = r1 instanceof X.AnonymousClass959
            if (r2 == 0) goto L_0x0503
            X.959 r1 = (X.AnonymousClass959) r1
            X.95g r0 = (X.C1767095g) r0
            if (r0 == 0) goto L_0x0044
            android.widget.TextView r3 = r1.A02
            java.lang.String r2 = r0.A01
            r3.setText(r2)
            boolean r2 = r0.A02
            android.widget.ImageView r4 = r1.A01
            if (r2 == 0) goto L_0x04e1
            r2 = 2131233335(0x7f080a37, float:1.8082805E38)
            r4.setImageResource(r2)
            r2 = 1127481344(0x43340000, float:180.0)
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102747(0x7f060c1b, float:1.781794E38)
            android.content.res.ColorStateList r2 = X.C19740yt.A03(r3, r2)
            X.C28081Yu.A00(r2, r4)
            android.view.View r3 = r1.A00
            android.content.Context r2 = r3.getContext()
            r1 = 2131233107(0x7f080953, float:1.8082342E38)
        L_0x04d8:
            X.AnonymousClass3MY.A0v(r2, r3, r1)
            android.view.View$OnClickListener r0 = r0.A00
            r3.setOnClickListener(r0)
            return
        L_0x04e1:
            r2 = 2131233422(0x7f080a8e, float:1.8082981E38)
            r4.setImageResource(r2)
            r2 = 0
            r4.setRotation(r2)
            android.content.Context r3 = r4.getContext()
            r2 = 2131102748(0x7f060c1c, float:1.7817943E38)
            android.content.res.ColorStateList r2 = X.C19740yt.A03(r3, r2)
            X.C28081Yu.A00(r2, r4)
            android.view.View r3 = r1.A00
            android.content.Context r2 = r3.getContext()
            r1 = 2131233106(0x7f080952, float:1.808234E38)
            goto L_0x04d8
        L_0x0503:
            boolean r2 = r1 instanceof X.AnonymousClass95H
            if (r2 == 0) goto L_0x0577
            X.95H r1 = (X.AnonymousClass95H) r1
            X.95l r0 = (X.C1767595l) r0
            android.widget.Button r5 = r1.A02
            android.view.View$OnClickListener r2 = r0.A01
            r5.setOnClickListener(r2)
            android.widget.ImageView r6 = r1.A03
            int r2 = r0.A00
            r6.setImageResource(r2)
            android.content.Context r8 = r1.A00
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131103224(0x7f060df8, float:1.7818908E38)
            int r3 = r3.getColor(r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r3, r2)
            android.widget.TextView r3 = r1.A05
            java.lang.CharSequence r2 = r0.A04
            r3.setText(r2)
            android.widget.TextView r7 = r1.A04
            java.lang.CharSequence r2 = r0.A02
            r7.setText(r2)
            com.whatsapp.TextEmojiLabel r3 = r1.A06
            java.lang.CharSequence r2 = r0.A03
            r3.setText(r2)
            boolean r2 = r0.A06
            if (r2 == 0) goto L_0x0551
            android.content.res.Resources r4 = r8.getResources()
            r3 = 2130969369(0x7f040319, float:1.7547418E38)
            r2 = 2131100372(0x7f0602d4, float:1.7813124E38)
            X.AnonymousClass8BW.A0z(r8, r4, r5, r3, r2)
        L_0x0551:
            boolean r2 = r0.A07
            r4 = 8
            if (r2 == 0) goto L_0x055e
            java.lang.CharSequence r2 = r0.A02
            if (r2 != 0) goto L_0x055e
            r7.setVisibility(r4)
        L_0x055e:
            boolean r3 = r0.A05
            r2 = 0
            if (r3 == 0) goto L_0x0573
            r6.setVisibility(r2)
        L_0x0566:
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0776
            r5.setVisibility(r4)
            android.view.View r0 = r1.A01
            r0.setVisibility(r2)
            return
        L_0x0573:
            r6.setVisibility(r4)
            goto L_0x0566
        L_0x0577:
            boolean r2 = r1 instanceof X.C1765994v
            if (r2 != 0) goto L_0x0044
            boolean r2 = r1 instanceof X.AnonymousClass95F
            if (r2 == 0) goto L_0x061e
            X.95F r1 = (X.AnonymousClass95F) r1
            X.95j r0 = (X.C1767395j) r0
            android.widget.TextView r5 = r1.A03
            java.lang.CharSequence r2 = r0.A03
            r5.setText(r2)
            android.view.View r2 = r1.A0H
            android.content.res.Resources r6 = r2.getResources()
            android.content.Context r4 = r2.getContext()
            r3 = 2130970705(0x7f040851, float:1.7550128E38)
            r2 = 2131102112(0x7f0609a0, float:1.7816653E38)
            X.AnonymousClass8BW.A0z(r4, r6, r5, r3, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r2)
            java.lang.CharSequence r2 = r0.A02
            r5.setContentDescription(r2)
            boolean r6 = r0.A04
            if (r6 == 0) goto L_0x0614
            X.AnonymousClass9RK.A00(r5)
        L_0x05ae:
            java.lang.CharSequence r3 = r0.A01
            r7 = 0
            if (r3 == 0) goto L_0x05bb
            android.widget.TextView r2 = r1.A02
            r2.setVisibility(r7)
            r2.setText(r3)
        L_0x05bb:
            X.0ve r4 = r1.A04
            r2 = 605(0x25d, float:8.48E-43)
            X.0vf r3 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r3, r4, r2)
            if (r2 != 0) goto L_0x05cf
            r2 = 629(0x275, float:8.81E-43)
            boolean r2 = X.C18020vd.A05(r3, r4, r2)
            if (r2 == 0) goto L_0x0044
        L_0x05cf:
            X.AEX r4 = r0.A00
            if (r4 == 0) goto L_0x0782
            android.view.View r0 = r1.A00
            r0.setVisibility(r7)
            int r0 = r4.A0C
            r5.setTextColor(r0)
            if (r6 == 0) goto L_0x05e5
            r0 = 1057635697(0x3f0a3d71, float:0.54)
            r5.setAlpha(r0)
        L_0x05e5:
            android.widget.ImageView r3 = r1.A01
            int r0 = r4.A0A
            r3.setBackgroundColor(r0)
            java.lang.String r2 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x05f7
            r3.setContentDescription(r2)
        L_0x05f7:
            int r0 = r4.A0D
            float r2 = (float) r0
            int r0 = r4.A09
            float r0 = (float) r0
            float r2 = r2 / r0
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r5 = r0.width
            float r0 = (float) r5
            float r0 = r0 / r2
            int r6 = (int) r0
            X.AnonymousClass3MX.A1F(r3, r6)
            r3.requestLayout()
            X.72F r2 = r1.A05
            r7 = 1
            r2.A03(r3, r4, r5, r6, r7)
            return
        L_0x0614:
            int r2 = r5.getPaintFlags()
            r2 = r2 & -17
            r5.setPaintFlags(r2)
            goto L_0x05ae
        L_0x061e:
            boolean r2 = r1 instanceof X.AnonymousClass95K
            if (r2 == 0) goto L_0x0654
            X.95K r1 = (X.AnonymousClass95K) r1
            X.95W r0 = (X.AnonymousClass95W) r0
            X.206 r4 = r0.A00
            java.lang.String r0 = r4.A0P()
            java.lang.CharSequence r0 = X.AnonymousClass1EG.A02(r0)
            android.text.SpannableStringBuilder r7 = X.AnonymousClass3MW.A09(r0)
            X.1gc r5 = r1.A01
            android.content.Context r6 = X.C108945cZ.A0D(r1)
            X.205 r0 = r4.A0v
            X.1BI r8 = r0.A00
            java.util.List r9 = r4.A0h
            r10 = 1
            r5.A06(r6, r7, r8, r9, r10)
            com.whatsapp.text.ReadMoreTextView r3 = r1.A02
            X.AnonymousClass95K.A00(r7, r3, r1, r10)
            X.4RR r2 = r1.A00
            X.AQG r0 = new X.AQG
            r0.<init>(r1)
            r2.A00(r3, r0, r4, r7)
            return
        L_0x0654:
            boolean r2 = r1 instanceof X.AnonymousClass95C
            if (r2 == 0) goto L_0x0687
            X.95C r1 = (X.AnonymousClass95C) r1
            X.95Z r0 = (X.AnonymousClass95Z) r0
            android.widget.LinearLayout r2 = r1.A01
            android.view.View$OnClickListener r0 = r0.A00
            r2.setOnClickListener(r0)
            android.widget.ImageView r2 = r1.A00
            int r0 = X.AnonymousClass8BY.A00(r2)
            X.AnonymousClass4aX.A0D(r2, r0)
            com.whatsapp.WaTextView r3 = r1.A02
            X.0ve r0 = r1.A03
            int r2 = X.AnonymousClass8BX.A03(r0)
            r0 = 2
            r1 = 2131895952(0x7f122690, float:1.9426752E38)
            if (r2 == r0) goto L_0x0683
            r0 = 3
            r1 = 2131895953(0x7f122691, float:1.9426754E38)
            if (r2 == r0) goto L_0x0683
            r1 = 2131895951(0x7f12268f, float:1.942675E38)
        L_0x0683:
            r3.setText(r1)
            return
        L_0x0687:
            boolean r2 = r1 instanceof X.AnonymousClass954
            if (r2 == 0) goto L_0x06b1
            X.954 r1 = (X.AnonymousClass954) r1
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            com.whatsapp.payments.ui.widget.ContactMerchantView r2 = r1.A00
            X.95Q r0 = (X.AnonymousClass95Q) r0
            X.1BI r0 = r0.A00
            r2.A00(r0)
            android.view.View r2 = r1.A0H
            r1 = 2131169532(0x7f0710fc, float:1.7953397E38)
            android.content.res.Resources r0 = r2.getResources()
            int r1 = r0.getDimensionPixelOffset(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r2)
            r0.bottomMargin = r1
            r2.setLayoutParams(r0)
            return
        L_0x06b1:
            boolean r2 = r1 instanceof X.C1766394z
            if (r2 == 0) goto L_0x06cc
            X.94z r1 = (X.C1766394z) r1
            X.95M r0 = (X.AnonymousClass95M) r0
            android.widget.TextView r3 = r1.A01
            java.lang.String r2 = r0.A01
            r3.setText(r2)
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0044
            android.widget.TextView r1 = r1.A00
            r1.setText(r0)
            r0 = 0
            goto L_0x0786
        L_0x06cc:
            boolean r2 = r1 instanceof X.C1766194x
            if (r2 == 0) goto L_0x06da
            X.94x r1 = (X.C1766194x) r1
            android.view.View r1 = r1.A00
            X.95V r0 = (X.AnonymousClass95V) r0
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x0041
        L_0x06da:
            boolean r2 = r1 instanceof X.C1765894u
            if (r2 == 0) goto L_0x06fa
            boolean r4 = r0 instanceof X.AnonymousClass95L
            r3 = 8
            r2 = 0
            if (r4 == 0) goto L_0x078a
            X.95L r0 = (X.AnonymousClass95L) r0
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x078a
            android.view.View r1 = r1.A0H
            r0 = 2131436568(0x7f0b2418, float:1.849501E38)
            X.AnonymousClass3MY.A1B(r1, r0, r3)
            r0 = 2131434767(0x7f0b1d0f, float:1.8491357E38)
            X.C72463Mc.A16(r1, r0, r2)
            return
        L_0x06fa:
            boolean r2 = r1 instanceof X.AnonymousClass951
            if (r2 == 0) goto L_0x072e
            X.951 r1 = (X.AnonymousClass951) r1
            X.95O r0 = (X.AnonymousClass95O) r0
            java.lang.String r5 = r0.A00
            r4 = 0
            r3 = 8
            android.widget.TextView r2 = r1.A01
            if (r5 == 0) goto L_0x0725
            r2.setText(r5)
            r2.setVisibility(r4)
            android.widget.Space r2 = r1.A00
            r2.setVisibility(r3)
        L_0x0716:
            android.widget.TextView r2 = r1.A02
            android.text.SpannableStringBuilder r1 = r0.A02
            r2.setText(r1)
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0799
            X.AnonymousClass9RK.A00(r2)
            return
        L_0x0725:
            r2.setVisibility(r3)
            android.widget.Space r2 = r1.A00
            r2.setVisibility(r4)
            goto L_0x0716
        L_0x072e:
            X.953 r1 = (X.AnonymousClass953) r1
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.95U r0 = (X.AnonymousClass95U) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r1.A00
            android.view.View$OnClickListener r0 = r0.A00
            goto L_0x0041
        L_0x073c:
            boolean r0 = X.AnonymousClass25A.A12(r3)
            if (r0 == 0) goto L_0x0746
            r2.A05()
            return
        L_0x0746:
            r2.A03()
            return
        L_0x074a:
            android.view.View r0 = r1.A02
            r0.setVisibility(r3)
            r5.setVisibility(r4)
            return
        L_0x0753:
            android.view.View r0 = r1.A01
            r0.setVisibility(r5)
            return
        L_0x0759:
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            java.lang.String r0 = r0.A02
            r1.setText(r0)
            return
        L_0x0761:
            r6.setVisibility(r1)
            return
        L_0x0765:
            int r1 = r8.A02
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x076f
            X.A6R.A00(r6, r2, r8, r5)
            return
        L_0x076f:
            r13 = 1
            java.lang.String r12 = "payment_transaction_details"
            r5.A05(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0776:
            r5.setVisibility(r2)
            android.view.View r0 = r1.A01
            goto L_0x077e
        L_0x077c:
            android.widget.TextView r0 = r1.A01
        L_0x077e:
            r0.setVisibility(r4)
            return
        L_0x0782:
            android.view.View r1 = r1.A00
            r0 = 8
        L_0x0786:
            r1.setVisibility(r0)
            return
        L_0x078a:
            android.view.View r1 = r1.A0H
            r0 = 2131436568(0x7f0b2418, float:1.849501E38)
            X.AnonymousClass3MY.A1B(r1, r0, r2)
            r0 = 2131434767(0x7f0b1d0f, float:1.8491357E38)
            X.C72463Mc.A16(r1, r0, r3)
            return
        L_0x0799:
            int r0 = r2.getPaintFlags()
            r0 = r0 & -17
            r2.setPaintFlags(r0)
            return
        L_0x07a3:
            boolean r0 = r1 instanceof X.C1765794t
            if (r0 != 0) goto L_0x07b4
            java.lang.String r1 = "PaymentComponentListActivity"
            java.lang.String r0 = "unsupported holder"
            java.lang.String r0 = X.AnonymousClass1QE.A01(r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x07b4:
            X.8IR r1 = (X.AnonymousClass8IR) r1
            java.util.List r0 = r2.A00
            java.lang.Object r0 = r0.get(r3)
            X.9Yd r0 = (X.C183409Yd) r0
            r1.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161678Hh.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        return this.A01.A4b(viewGroup, i);
    }

    public int getItemViewType(int i) {
        return ((C183409Yd) this.A00.get(i)).A00;
    }
}
