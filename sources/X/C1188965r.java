package X;

/* renamed from: X.65r  reason: invalid class name and case insensitive filesystem */
public abstract class C1188965r extends C42061xY {
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        if (r2 == 1) goto L_0x019e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(java.lang.Object r12, java.util.List r13) {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.C116025wG
            if (r0 == 0) goto L_0x0013
            r2 = r11
            X.5wG r2 = (X.C116025wG) r2
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            com.whatsapp.TextEmojiLabel r1 = r2.A00
            r0 = 11
            X.C89994dM.A00(r1, r2, r12, r0)
        L_0x0012:
            return
        L_0x0013:
            boolean r0 = r11 instanceof X.C115985wC
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = X.C108965cb.A09(r11, r12)
            r0 = 2
            X.C89874dA.A00(r1, r12, r0)
            return
        L_0x0020:
            boolean r0 = r11 instanceof X.C116015wF
            if (r0 == 0) goto L_0x003a
            r0 = r11
            X.5wF r0 = (X.C116015wF) r0
            android.content.Context r1 = X.C108945cZ.A0D(r0)
            android.widget.FrameLayout r0 = r0.A00
            r0.removeAllViews()
            X.C18070vi.A0b(r1)
            java.lang.String r0 = "getBusinessFilter"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x003a:
            boolean r0 = r11 instanceof X.C115995wD
            if (r0 == 0) goto L_0x0048
            r2 = 0
            android.view.View r1 = X.C108965cb.A09(r11, r2)
            r0 = 1
            X.C89874dA.A00(r1, r2, r0)
            return
        L_0x0048:
            boolean r0 = r11 instanceof X.C115975wB
            if (r0 != 0) goto L_0x0012
            boolean r0 = r11 instanceof X.C116005wE
            if (r0 == 0) goto L_0x0068
            r1 = r11
            X.5wE r1 = (X.C116005wE) r1
            X.1tM r12 = (X.C39611tM) r12
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            com.whatsapp.WaTextView r1 = r1.A00
            java.lang.Object r0 = r12.A01
            X.C18070vi.A0X(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            r1.setText(r0)
            return
        L_0x0068:
            boolean r0 = r11 instanceof X.C116055wJ
            if (r0 == 0) goto L_0x00fd
            r8 = r11
            X.5wJ r8 = (X.C116055wJ) r8
            X.6FE r12 = (X.AnonymousClass6FE) r12
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            android.view.View r0 = r8.A00
            android.content.Context r7 = X.AnonymousClass3MY.A04(r0)
            android.view.View r1 = r8.A0H
            r0 = 2131433966(0x7f0b19ee, float:1.8489733E38)
            android.view.View r9 = X.C18070vi.A05(r1, r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.removeAllViews()
            r0 = 2131887135(0x7f12041f, float:1.9408869E38)
            java.lang.String r6 = X.C18070vi.A0F(r7, r0)
            java.util.List r10 = r12.A00
            int r5 = r10.size()
            r4 = 0
        L_0x0097:
            if (r4 >= r5) goto L_0x01b9
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r7)
            r0 = 2131624395(0x7f0e01cb, float:1.8875969E38)
            android.view.View r1 = X.AnonymousClass3MX.A09(r1, r9, r0)
            r0 = 2131433802(0x7f0b194a, float:1.84894E38)
            android.view.View r2 = X.C18070vi.A05(r1, r0)
            r0 = 12
            if (r4 <= 0) goto L_0x00bb
            android.view.ViewGroup$MarginLayoutParams r3 = X.C72463Mc.A0P(r2)
            int r0 = X.C43531zx.A00(r2, r0)
            int r0 = -r0
            r3.setMarginStart(r0)
        L_0x00bb:
            int r0 = r4 * 12
            int r0 = 48 - r0
            int r0 = X.C43531zx.A00(r2, r0)
            float r0 = (float) r0
            r2.setElevation(r0)
            r9.addView(r1)
            X.C18070vi.A0b(r1)
            r0 = 2131434160(0x7f0b1ab0, float:1.8490126E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton"
            X.C18070vi.A0z(r3, r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.Object r2 = r10.get(r4)
            X.1E7 r2 = (X.AnonymousClass1E7) r2
            X.6oK r0 = r8.A02
            X.C18070vi.A0h(r2, r3)
            X.7E2 r1 = new X.7E2
            r1.<init>(r3, r0, r2)
            X.1Lf r0 = r8.A03
            r0.registerObserver(r1)
            java.util.List r0 = r8.A05
            r0.add(r1)
            X.1pZ r0 = r8.A04
            r0.A07(r3, r2)
            int r4 = r4 + 1
            goto L_0x0097
        L_0x00fd:
            boolean r0 = r11 instanceof X.C115955w9
            if (r0 == 0) goto L_0x0180
            r6 = r11
            X.5w9 r6 = (X.C115955w9) r6
            X.6FI r12 = (X.AnonymousClass6FI) r12
            r5 = 0
            X.C18070vi.A0d(r12, r5)
            X.A6f r0 = r12.A00
            java.lang.String r3 = r0.A07
            r4 = 0
            if (r3 == 0) goto L_0x0177
            boolean r0 = r0.A05()
            r2 = 2131891812(0x7f121664, float:1.9418355E38)
            if (r0 == 0) goto L_0x011d
            r2 = 2131891810(0x7f121662, float:1.941835E38)
        L_0x011d:
            android.view.View r9 = r6.A0H
            android.content.Context r1 = r9.getContext()
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = X.AnonymousClass3Ma.A10(r1, r3, r0, r5, r2)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0138
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[Internal] "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x0138:
            int r7 = X.AnonymousClass1YF.A0F(r2, r3, r5, r5)
            r0 = -1
            if (r7 == r0) goto L_0x0168
            int r3 = r3.length()
            int r3 = r3 + r7
            android.text.SpannableStringBuilder r2 = X.AnonymousClass3MW.A09(r2)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            r2.setSpan(r0, r7, r3, r5)
            android.content.Context r1 = r9.getContext()
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r1 = X.C19740yt.A00(r1, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r2.setSpan(r0, r7, r3, r5)
            com.whatsapp.WaTextView r0 = r6.A00
            r0.setText(r2)
        L_0x0168:
            com.whatsapp.wds.components.button.WDSButton r1 = r6.A01
            boolean r0 = r12.A03
            if (r0 != 0) goto L_0x0170
            r4 = 8
        L_0x0170:
            r1.setVisibility(r4)
            X.C89874dA.A00(r1, r12, r5)
            return
        L_0x0177:
            com.whatsapp.WaTextView r1 = r6.A00
            r0 = 2131891811(0x7f121663, float:1.9418353E38)
            r1.setText(r0)
            goto L_0x0168
        L_0x0180:
            boolean r0 = r11 instanceof X.C116045wI
            if (r0 == 0) goto L_0x01c1
            r4 = r11
            X.5wI r4 = (X.C116045wI) r4
            X.1tM r12 = (X.C39611tM) r12
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            com.whatsapp.WaTextView r3 = r4.A01
            java.lang.Object r0 = r12.A01
            int r2 = X.AnonymousClass000.A0M(r0)
            r0 = -1
            if (r2 == r0) goto L_0x019e
            r1 = 1
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            if (r2 != r1) goto L_0x01a1
        L_0x019e:
            r0 = 2131887139(0x7f120423, float:1.9408877E38)
        L_0x01a1:
            r3.setText(r0)
            X.0ve r2 = r4.A02
            r1 = 11276(0x2c0c, float:1.5801E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0012
            com.whatsapp.WaImageView r1 = r4.A00
            r0 = 2131233626(0x7f080b5a, float:1.8083395E38)
            r1.setImageResource(r0)
            return
        L_0x01b9:
            X.6oK r1 = r8.A02
            com.whatsapp.TextEmojiLabel r0 = r8.A01
            r1.A00(r7, r0, r6)
            return
        L_0x01c1:
            r4 = r11
            X.5wH r4 = (X.C116035wH) r4
            X.1tM r12 = (X.C39611tM) r12
            android.view.View r0 = X.C108965cb.A09(r4, r12)
            android.content.Context r3 = r0.getContext()
            r0 = 2131887135(0x7f12041f, float:1.9408869E38)
            java.lang.String r2 = X.C18070vi.A0F(r3, r0)
            java.lang.Object r0 = r12.A01
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x01e7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[Internal] "
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x01e7:
            X.6oK r1 = r4.A01
            com.whatsapp.TextEmojiLabel r0 = r4.A00
            r1.A00(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188965r.A0H(java.lang.Object, java.util.List):void");
    }
}
