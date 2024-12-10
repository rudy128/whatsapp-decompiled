package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.Date;

/* renamed from: X.8jn  reason: invalid class name and case insensitive filesystem */
public abstract class C168858jn extends AnonymousClass8IO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextEmojiLabel A05;
    public final TextEmojiLabel A06;
    public final TextEmojiLabel A07;
    public final C20114A7x A08;
    public final C182919Wf A09;
    public final C22536BBt A0A;
    public final C19973A1i A0B;
    public final C189919k4 A0C;
    public final C18000vb A0D;
    public final UserJid A0E;
    public final Date A0F = new Date();
    public final FrameLayout A0G;
    public final C20005A2v A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r3 != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C168738jb r19) {
        /*
            r18 = this;
            r1 = r18
            int r5 = r1.A05()
            r4 = 0
            android.widget.FrameLayout r3 = r1.A0G
            if (r5 != 0) goto L_0x028c
            android.view.View r0 = r1.A0H
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131168325(0x7f070c45, float:1.7950949E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r3.setPadding(r4, r0, r4, r4)
        L_0x001b:
            X.BBt r3 = r1.A0A
            X.AEv r2 = r3.BXb(r5)
            com.whatsapp.TextEmojiLabel r9 = r1.A06
            java.lang.String r0 = r2.A08
            r11 = 0
            r9.A0S(r0, r11, r4, r4)
            X.AEW r10 = r3.BNr()
            r8 = 1
            r6 = 8
            if (r10 == 0) goto L_0x0242
            boolean r0 = r10.A0Y
            if (r0 != r8) goto L_0x0242
        L_0x0036:
            r9.setSingleLine(r4)
            r0 = 2
            r9.setMaxLines(r0)
            com.whatsapp.TextEmojiLabel r0 = r1.A05
            r0.setVisibility(r6)
            X.9k4 r3 = r1.A0C
            android.view.View r0 = r1.A0H
            android.content.Context r8 = X.AnonymousClass3MY.A04(r0)
            r5 = 0
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x01e4
            X.ADp r0 = r0.A01
            if (r0 == 0) goto L_0x01e4
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x01e4
            java.lang.String r5 = X.C108975cc.A0e(r0)
        L_0x005b:
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0285
            if (r5 == 0) goto L_0x0285
            boolean r0 = X.AnonymousClass1YF.A0T(r5)
            if (r0 != 0) goto L_0x0285
            com.whatsapp.TextEmojiLabel r3 = r1.A07
        L_0x006b:
            r3.setVisibility(r4)
            r0 = 1
            r3.A0S(r5, r11, r4, r0)
        L_0x0072:
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0085
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x0085
            X.ADp r0 = r0.A01
            if (r0 == 0) goto L_0x0085
            boolean r3 = r0.A02
            r0 = 1
            if (r3 != 0) goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            r3 = 1
            if (r0 == 0) goto L_0x0199
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x0199
            X.ADp r0 = r0.A01
            if (r0 == 0) goto L_0x0199
            java.math.BigDecimal r0 = r0.A01
            if (r0 == 0) goto L_0x0199
            android.widget.TextView r7 = r1.A04
            r7.setVisibility(r4)
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x0196
            X.ADp r0 = r0.A01
            if (r0 == 0) goto L_0x0196
            java.math.BigDecimal r14 = r0.A01
        L_0x00a4:
            X.A6S r12 = r2.A07
            X.0vb r13 = r1.A0D
            java.util.Date r15 = r1.A0F
            android.content.Context r10 = r7.getContext()
            android.text.SpannableString r0 = X.A78.A01(r10, r11, r12, r13, r14, r15)
            android.content.Context r6 = r7.getContext()
            r5 = 2131894797(0x7f12220d, float:1.9424409E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r0 = r0.toString()
            r3[r4] = r0
            X.AnonymousClass3MY.A0y(r6, r7, r3, r5)
        L_0x00c4:
            com.whatsapp.jid.UserJid r5 = r1.A0E
            r6 = r1
            X.8jQ r6 = (X.C168658jQ) r6
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0168
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0168
        L_0x00d9:
            com.whatsapp.TextEmojiLabel r3 = r6.A06
            int r0 = r6.A02
            r3.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r3 = r6.A05
            int r0 = r6.A00
            r3.setTextColor(r0)
            android.widget.TextView r3 = r6.A04
            int r0 = r6.A01
            r3.setTextColor(r0)
            X.0vl r4 = r6.A04
            java.lang.Object r3 = X.AnonymousClass3MX.A14(r4)
            android.view.View r3 = (android.view.View) r3
            X.BBt r0 = r6.A0A
            boolean r0 = r0.BON()
            int r0 = X.C72453Mb.A07(r0)
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r6.A03
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            boolean r0 = r6.A0D()
            if (r0 == 0) goto L_0x0160
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r3 = X.AnonymousClass3MX.A14(r4)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r3 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r3
            X.9cw r0 = new X.9cw
            r0.<init>(r2, r6, r5)
        L_0x0121:
            r3.A05 = r0
        L_0x0123:
            android.widget.ImageView r9 = r1.A03
            X.AnonymousClass9PP.A00(r9)
            java.util.List r3 = r2.A0A
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = "ProductBaseViewHolder/bindViewInSection/no-product-images"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0135:
            java.util.List r3 = X.C29431cG.A0q(r3)
            boolean r0 = r2.A02()
            if (r0 != 0) goto L_0x015f
            boolean r0 = X.AnonymousClass000.A1a(r3)
            if (r0 == 0) goto L_0x015f
            X.9Wf r0 = r1.A09
            X.9Zz r12 = new X.9Zz
            r12.<init>(r0, r5)
            X.A2v r8 = r1.A0H
            java.lang.Object r10 = X.C29431cG.A0b(r3)
            X.AEI r10 = (X.AEI) r10
            r0 = 1
            X.ANY r14 = new X.ANY
            r14.<init>(r0)
            r15 = 2
            r13 = r11
            r8.A03(r9, r10, r11, r12, r13, r14, r15)
        L_0x015f:
            return
        L_0x0160:
            java.lang.Object r3 = X.AnonymousClass3MX.A14(r4)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r3 = (com.whatsapp.biz.catalog.view.widgets.QuantitySelector) r3
            r0 = 0
            goto L_0x0121
        L_0x0168:
            com.whatsapp.TextEmojiLabel r3 = r6.A06
            X.0vl r4 = r6.A03
            int r0 = X.C72453Mb.A0I(r4)
            r3.setTextColor(r0)
            com.whatsapp.TextEmojiLabel r3 = r6.A05
            int r0 = X.C72453Mb.A0I(r4)
            r3.setTextColor(r0)
            android.widget.TextView r3 = r6.A04
            int r0 = X.C72453Mb.A0I(r4)
            r3.setTextColor(r0)
            X.0vl r0 = r6.A04
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            X.C108965cb.A1N(r0)
            android.widget.ImageView r3 = r6.A03
            r0 = 1056964608(0x3f000000, float:0.5)
            r3.setAlpha(r0)
            goto L_0x0123
        L_0x0196:
            r14 = 0
            goto L_0x00a4
        L_0x0199:
            java.math.BigDecimal r0 = r2.A09
            if (r0 == 0) goto L_0x01dd
            X.A6S r0 = r2.A07
            if (r0 == 0) goto L_0x01dd
            android.widget.TextView r5 = r1.A04
            r5.setVisibility(r4)
            java.math.BigDecimal r4 = r2.A09
            X.A6S r14 = r2.A07
            X.AE5 r13 = r2.A04
            X.0vb r15 = r1.A0D
            java.util.Date r0 = r1.A0F
            android.content.Context r12 = r5.getContext()
            r16 = r4
            r17 = r0
            android.text.SpannableString r0 = X.A78.A01(r12, r13, r14, r15, r16, r17)
            android.text.SpannableStringBuilder r6 = X.AnonymousClass3MW.A09(r0)
            int r0 = r2.A00
            if (r3 != r0) goto L_0x01d8
            java.lang.String r0 = " • "
            android.text.SpannableStringBuilder r4 = r6.append(r0)
            android.content.Context r3 = r5.getContext()
            r0 = 2131893424(0x7f121cb0, float:1.9421624E38)
            java.lang.String r0 = r3.getString(r0)
            r4.append(r0)
        L_0x01d8:
            r5.setText(r6)
            goto L_0x00c4
        L_0x01dd:
            android.widget.TextView r0 = r1.A04
            r0.setVisibility(r6)
            goto L_0x00c4
        L_0x01e4:
            X.0vl r0 = r3.A00
            java.lang.Object r7 = X.AnonymousClass3MX.A14(r0)
            X.0vd r7 = (X.C18020vd) r7
            r3 = 8798(0x225e, float:1.2329E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r3)
            if (r0 == 0) goto L_0x005b
            X.AE6 r0 = r2.A05
            if (r0 == 0) goto L_0x005b
            java.util.List r0 = r0.A03
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r9 = r0.iterator()
        L_0x0202:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r7 = r9.next()
            r0 = r7
            X.ADA r0 = (X.ADA) r0
            java.lang.String r0 = r0.A00()
            java.lang.String r3 = X.AnonymousClass8BW.A0i(r0)
            java.lang.String r0 = "color"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0202
        L_0x021f:
            X.ADA r7 = (X.ADA) r7
            if (r7 == 0) goto L_0x005b
            java.util.List r7 = r7.A01()
            int r3 = r7.size()
            r0 = 1
            if (r3 <= r0) goto L_0x005b
            r5 = 2131887977(0x7f120769, float:1.9410576E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r0 = r7.size()
            X.C17880vN.A1T(r3, r0, r4)
            java.lang.String r5 = r8.getString(r5, r3)
            goto L_0x005b
        L_0x0240:
            r7 = r5
            goto L_0x021f
        L_0x0242:
            X.A1i r5 = r1.A0B
            X.A7x r3 = r1.A08
            com.whatsapp.jid.UserJid r0 = r1.A0E
            X.9Hv r7 = r3.A09(r0)
            X.0ve r5 = r5.A00
            r3 = 8798(0x225e, float:1.2329E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r3)
            if (r0 == 0) goto L_0x026c
            if (r10 == 0) goto L_0x0266
            java.lang.String r3 = "smb_meta_catalog"
            java.lang.String r0 = r10.A0E
            boolean r0 = r3.equals(r0)
            if (r0 != r8) goto L_0x0266
            goto L_0x0036
        L_0x0266:
            X.9Hv r0 = X.C179409Hv.SMB_META_CATALOG
            if (r7 != r0) goto L_0x026c
            goto L_0x0036
        L_0x026c:
            r9.setSingleLine(r8)
            com.whatsapp.TextEmojiLabel r0 = r1.A07
            r0.setVisibility(r6)
            java.lang.String r5 = r2.A0E
            if (r5 == 0) goto L_0x0282
            boolean r0 = X.AnonymousClass1YF.A0T(r5)
            if (r0 != 0) goto L_0x0282
            com.whatsapp.TextEmojiLabel r3 = r1.A05
            goto L_0x006b
        L_0x0282:
            com.whatsapp.TextEmojiLabel r0 = r1.A05
            goto L_0x0287
        L_0x0285:
            com.whatsapp.TextEmojiLabel r0 = r1.A07
        L_0x0287:
            r0.setVisibility(r6)
            goto L_0x0072
        L_0x028c:
            r3.setPadding(r4, r4, r4, r4)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168858jn.A0C(X.8jb):void");
    }

    public final boolean A0D() {
        return C108975cc.A1B(this.A0B.A01(this.A08.A09(this.A0E), this.A0A.BNr()) ? 1 : 0);
    }

    public C168858jn(View view, C20114A7x a7x, C182919Wf r7, C20005A2v a2v, C22536BBt bBt, C19973A1i a1i, C189919k4 r11, C18000vb r12, UserJid userJid) {
        super(view);
        this.A0D = r12;
        this.A0H = a2v;
        this.A0A = bBt;
        this.A0E = userJid;
        this.A09 = r7;
        this.A0C = r11;
        this.A08 = a7x;
        this.A0B = a1i;
        this.A0G = (FrameLayout) AnonymousClass3MX.A0C(view, 2131428897);
        this.A03 = C108975cc.A0B(view, 2131428907);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131428909);
        this.A06 = textEmojiLabel;
        TextEmojiLabel textEmojiLabel2 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131428906);
        this.A05 = textEmojiLabel2;
        this.A07 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131428910);
        TextView textView = (TextView) AnonymousClass3MX.A0C(view, 2131428908);
        this.A04 = textView;
        this.A02 = textEmojiLabel.getTextColors().getDefaultColor();
        this.A00 = textEmojiLabel2.getTextColors().getDefaultColor();
        this.A01 = textView.getTextColors().getDefaultColor();
    }
}
