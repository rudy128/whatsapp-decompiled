package X;

/* renamed from: X.D6m  reason: case insensitive filesystem */
public class C26618D6m implements C22851Dl {
    public final int A00;
    public final Object A01;

    public C26618D6m(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r0 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        if (r10 != false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01a5;
                case 2: goto L_0x0186;
                case 3: goto L_0x0177;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r11.A01
            X.BqW r4 = (X.C23819BqW) r4
            X.CmC r12 = (X.C25800CmC) r12
            r7 = 0
            r2 = 1
            X.C18070vi.A0d(r12, r2)
            java.lang.CharSequence r8 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r10 = 1
            r9 = r0 ^ 1
            X.1bI r5 = r4.A0O
            r1 = 0
            if (r9 != 0) goto L_0x0025
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x0025
            r5 = r1
        L_0x0025:
            r3 = 8
            if (r5 == 0) goto L_0x0051
            android.view.View r6 = r5.A02()
            com.whatsapp.conversation.conversationrow.audio.TranscriptionView r6 = (com.whatsapp.conversation.conversationrow.audio.TranscriptionView) r6
            if (r6 == 0) goto L_0x0051
            if (r9 == 0) goto L_0x016d
            java.lang.Integer r0 = r4.A0A
            if (r0 == 0) goto L_0x0161
            int r5 = r0.intValue()
        L_0x003b:
            X.ByP r0 = r12.A02
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0044
            r5 = 0
        L_0x0044:
            X.0vk r1 = r12.A04
            X.9sU r0 = r12.A01
            r6.A00(r0, r8, r1)
            X.C72473Md.A11(r6, r5)
            r6.setVisibility(r7)
        L_0x0051:
            X.C4I r5 = r12.A00
            if (r5 != 0) goto L_0x0056
            r10 = 0
        L_0x0056:
            com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView r0 = r4.A00
            if (r0 != 0) goto L_0x0158
            if (r10 == 0) goto L_0x0077
            X.1bI r0 = r4.A0N
            android.view.View r1 = r0.A02()
            r0 = 2131427906(0x7f0b0242, float:1.8477441E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView r0 = (com.whatsapp.conversation.conversationrow.audio.TranscriptionStatusView) r0
            r4.A00 = r0
            if (r0 == 0) goto L_0x0077
        L_0x006f:
            if (r5 == 0) goto L_0x015c
            r0.A05(r5)
            r0.setVisibility(r7)
        L_0x0077:
            X.ByP r6 = r12.A02
            X.ByP r0 = r4.A02
            if (r6 == r0) goto L_0x0133
            r4.A02 = r6
            android.view.ViewGroup r5 = r4.A06
            X.1D6 r9 = r4.A0C
            if (r9 != 0) goto L_0x0097
            int r0 = r5.getPaddingStart()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r5.getPaddingEnd()
            X.1D6 r9 = X.AnonymousClass1D6.A00(r1, r0)
            r4.A0C = r9
        L_0x0097:
            X.1D6 r1 = r4.A0B
            if (r1 != 0) goto L_0x00b1
            android.view.ViewGroup$MarginLayoutParams r8 = X.C72463Mc.A0P(r5)
            int r0 = r8.getMarginStart()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r8.getMarginEnd()
            X.1D6 r1 = X.AnonymousClass1D6.A00(r1, r0)
            r4.A0B = r1
        L_0x00b1:
            int r0 = r6.ordinal()
            if (r0 == r7) goto L_0x0153
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.1D6 r9 = new X.1D6
            r9.<init>(r0, r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168777(0x7f070e09, float:1.7951865E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168774(0x7f070e06, float:1.795186E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r8, r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r0, r9)
        L_0x00e2:
            java.lang.Object r0 = r1.first
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r9 = r1.second
            X.1D6 r9 = (X.AnonymousClass1D6) r9
            int r8 = X.AnonymousClass3MZ.A04(r0)
            int r1 = X.C108955ca.A09(r0)
            X.0vb r0 = r4.A0D
            X.C27641Ww.A05(r5, r0, r8, r1)
            int r1 = X.AnonymousClass3MZ.A04(r9)
            int r0 = X.C108955ca.A09(r9)
            X.C27641Ww.A03(r5, r1, r0)
            android.view.ViewParent r1 = r5.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x014d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x014d
            r1.removeView(r5)
            X.ByP r0 = r4.A02
            int r0 = r0.ordinal()
            if (r0 == r7) goto L_0x0146
            if (r0 != r2) goto L_0x0172
            X.0vl r0 = r4.A0Q
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
        L_0x0121:
            android.view.ViewParent r2 = r0.getParent()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C18070vi.A0z(r2, r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = r2.indexOfChild(r0)
            r2.addView(r5, r0)
        L_0x0133:
            X.1bI r1 = r4.A0N
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x0145
            if (r10 != 0) goto L_0x0141
            X.ByP r0 = X.C24266ByP.FOOTER
            if (r6 != r0) goto L_0x0142
        L_0x0141:
            r3 = 0
        L_0x0142:
            r1.A04(r3)
        L_0x0145:
            return
        L_0x0146:
            X.0vl r0 = r4.A0P
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            goto L_0x0121
        L_0x014d:
            java.lang.String r0 = "ConversationRowVoiceNote/updateDateWrapperPosition date wrapper has no parent."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0133
        L_0x0153:
            X.1D6 r1 = X.AnonymousClass1D6.A01(r9, r1)
            goto L_0x00e2
        L_0x0158:
            if (r10 == 0) goto L_0x015c
            goto L_0x006f
        L_0x015c:
            r0.setVisibility(r3)
            goto L_0x0077
        L_0x0161:
            int r5 = r6.getPaddingBottom()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A0A = r0
            goto L_0x003b
        L_0x016d:
            r6.setVisibility(r3)
            goto L_0x0051
        L_0x0172:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0177:
            java.lang.Object r2 = r11.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 34
            X.4dU r0 = new X.4dU
            r0.<init>(r2, r12, r1)
            r2.setOnClickListener(r0)
            return
        L_0x0186:
            java.lang.Object r4 = r11.A01
            X.3sc r4 = (X.AnonymousClass3sc) r4
            android.content.res.Resources r3 = r4.getResources()
            r1 = 2131894660(0x7f122184, float:1.9424131E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r2 = 0
            r0[r2] = r12
            java.lang.String r1 = r3.getString(r1, r0)
            android.widget.TextView r0 = r4.A00
            r0.setText(r1)
            r4.setVisibility(r2)
            return
        L_0x01a5:
            java.lang.Object r0 = r11.A01
            X.3sn r0 = (X.C78433sn) r0
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            com.whatsapp.components.button.ThumbnailButton r1 = r0.A08
            if (r12 == 0) goto L_0x01b7
            r1.setImageBitmap(r12)
            r0 = 0
        L_0x01b3:
            r1.setVisibility(r0)
            return
        L_0x01b7:
            r0 = 0
            r1.setImageDrawable(r0)
            r0 = 8
            goto L_0x01b3
        L_0x01be:
            java.lang.Object r3 = r11.A01
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r3 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r3
            java.util.List r12 = (java.util.List) r12
            r1 = 0
            r2 = 1
            X.C18070vi.A0d(r12, r2)
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x01de
            X.1DT r1 = r3.A0E
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x01d5:
            r1.A0E(r0)
            X.1Dg r0 = r3.A09
            r0.A0F(r12)
            return
        L_0x01de:
            java.lang.Object r0 = r12.get(r1)
            boolean r0 = r0 instanceof X.AnonymousClass7ED
            if (r0 == 0) goto L_0x01ee
            X.1DT r1 = r3.A0E
            r0 = 3
        L_0x01e9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01d5
        L_0x01ee:
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0201
            X.1DT r1 = r3.A0B
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x0201
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0F(r0)
        L_0x0201:
            X.1DT r1 = r3.A0E
            r0 = 2
            goto L_0x01e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26618D6m.Bo9(java.lang.Object):void");
    }
}
