package X;

import com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet;

/* renamed from: X.81M  reason: invalid class name */
public final class AnonymousClass81M extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81M(StickerInfoBottomSheet stickerInfoBottomSheet) {
        super(1);
        this.this$0 = stickerInfoBottomSheet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ec, code lost:
        if (r7 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        if (r7 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
        if (r8.length() <= 0) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r25) {
        /*
            r24 = this;
            r1 = r25
            X.6Tq r1 = (X.C123236Tq) r1
            X.6HV r0 = X.AnonymousClass6HV.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.String r12 = "sticker"
            r3 = r24
            if (r0 == 0) goto L_0x002d
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r1 = r3.this$0
            X.77d r0 = r1.A05
            if (r0 == 0) goto L_0x0207
            X.00H r0 = r1.A0J
            if (r0 == 0) goto L_0x01fa
            X.1KB r2 = X.C108945cZ.A0a(r0)
            r1 = 2131896420(0x7f122864, float:1.94277E38)
            r0 = 1
            r2.A08(r1, r0)
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = r3.this$0
            r0.A28()
        L_0x002a:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002d:
            boolean r0 = r1 instanceof X.AnonymousClass6HU
            if (r0 == 0) goto L_0x002a
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r4 = r3.this$0
            X.6HU r1 = (X.AnonymousClass6HU) r1
            X.6u8 r0 = r1.A00
            r4.A06 = r0
            X.1bI r0 = r4.A0A
            if (r0 == 0) goto L_0x0091
            android.view.View r14 = r0.A02()
            com.whatsapp.stickers.StickerView r14 = (com.whatsapp.stickers.StickerView) r14
            if (r14 == 0) goto L_0x0091
            com.whatsapp.CircularProgressBar r0 = r4.A01
            X.C72453Mb.A1D(r0)
            r0 = 0
            r14.setVisibility(r0)
            r0 = 1
            r14.A02 = r0
            r14.setFocusable(r0)
            android.content.Context r1 = X.AnonymousClass3MY.A04(r14)
            X.77d r0 = r4.A05
            if (r0 == 0) goto L_0x0207
            X.C108955ca.A1B(r1, r14, r0)
            X.00H r0 = r4.A0K
            if (r0 == 0) goto L_0x0204
            java.lang.Object r2 = r0.get()
            X.1Sw r2 = (X.C26631Sw) r2
            X.77d r15 = r4.A05
            if (r15 == 0) goto L_0x0207
            X.0vl r0 = r4.A0Y
            int r17 = X.C72453Mb.A0I(r0)
            int r18 = X.C72453Mb.A0I(r0)
            r1 = 4
            X.7MK r0 = new X.7MK
            r0.<init>(r14, r1)
            r19 = 1
            r20 = 0
            r23 = r20
            X.2my r13 = new X.2my
            r16 = r0
            r21 = r19
            r22 = r20
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.A06(r13)
        L_0x0091:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r4 = r3.this$0
            X.6u8 r6 = r4.A06
            java.lang.String r11 = "stickerInfo"
            if (r6 == 0) goto L_0x0200
            java.lang.String r8 = r6.A02
            java.lang.String r7 = r6.A03
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00ac
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131896520(0x7f1228c8, float:1.9427904E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x00ac:
            if (r7 == 0) goto L_0x01f0
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x01f0
        L_0x00b4:
            r0 = 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = X.AnonymousClass1EG.A0F(r7, r0)
        L_0x00bc:
            if (r8 == 0) goto L_0x00c2
            java.lang.String r8 = X.AnonymousClass1EG.A0F(r8, r0)
        L_0x00c2:
            X.6Ra r1 = r4.A07
            if (r1 == 0) goto L_0x01fd
            X.6Ra r0 = X.C122606Ra.TRANSPARENT_IMAGE
            if (r1 != r0) goto L_0x00d5
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131889179(0x7f120c1b, float:1.9413014E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x00d5:
            if (r8 != 0) goto L_0x01ec
            if (r7 == 0) goto L_0x013d
        L_0x00d9:
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x00e8
            if (r8 == 0) goto L_0x00e8
            int r0 = r8.length()
            r10 = 1
            if (r0 > 0) goto L_0x00e9
        L_0x00e8:
            r10 = 0
        L_0x00e9:
            X.1bI r0 = r4.A09
            if (r0 == 0) goto L_0x013d
            android.view.View r9 = r0.A02()
            if (r9 == 0) goto L_0x013d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r8 == 0) goto L_0x00fc
            r1.append(r8)
        L_0x00fc:
            if (r7 == 0) goto L_0x0108
            if (r8 == 0) goto L_0x0105
            java.lang.String r0 = " - "
            r1.append(r0)
        L_0x0105:
            r1.append(r7)
        L_0x0108:
            java.lang.String r0 = r1.toString()
            r9.setContentDescription(r0)
            r0 = 1
            X.AnonymousClass1HF.A0q(r9, r0)
            r0 = 2131435746(0x7f0b20e2, float:1.8493343E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r9, r0)
            r0 = 2131428484(0x7f0b0484, float:1.8478614E38)
            android.view.View r2 = X.C18070vi.A05(r9, r0)
            r0 = 2131435749(0x7f0b20e5, float:1.8493349E38)
            android.widget.TextView r1 = X.AnonymousClass3Ma.A0E(r9, r0)
            r0 = 8
            if (r8 == 0) goto L_0x01e7
            r5.setText(r8)
            X.C43421zm.A04(r5)
        L_0x0132:
            if (r7 == 0) goto L_0x01e2
            r1.setText(r7)
        L_0x0137:
            if (r10 == 0) goto L_0x013a
            r0 = 0
        L_0x013a:
            r2.setVisibility(r0)
        L_0x013d:
            boolean r0 = r6.A08
            r2 = 8
            if (r0 == 0) goto L_0x01da
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x01da
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x020b
            java.lang.Object r7 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r7 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r7
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "Style2"
            boolean r0 = X.C18070vi.A18(r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x01da
            X.6RS r5 = X.AnonymousClass6RS.STICKER_RECEIVED
            X.00H r0 = r7.A01
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 9859(0x2683, float:1.3815E-41)
            java.lang.String r1 = X.C108955ca.A0v(r1, r0)
            java.lang.String r0 = r5.value
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r6)
            if (r0 == 0) goto L_0x01da
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x01da
            X.6RP r1 = r7.A00()
            X.6RP r0 = X.AnonymousClass6RP.DISABLED
            if (r1 == r0) goto L_0x01da
            X.1bI r0 = r4.A08
            r2 = 0
            if (r0 == 0) goto L_0x018e
            android.view.View r0 = r0.A02()
            if (r0 == 0) goto L_0x018e
            r0.setVisibility(r6)
        L_0x018e:
            X.1bI r0 = r4.A08
            if (r0 == 0) goto L_0x019f
            android.view.View r1 = r0.A02()
            if (r1 == 0) goto L_0x019f
            r0 = 2131435559(0x7f0b2027, float:1.8492964E38)
            android.view.View r2 = r1.findViewById(r0)
        L_0x019f:
            X.00H r0 = r4.A0E
            if (r0 == 0) goto L_0x020b
            java.lang.Object r0 = r0.get()
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r0 = (com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration) r0
            r0.A02(r5)
            if (r2 == 0) goto L_0x01b3
            r0 = 24
            X.AnonymousClass78P.A00(r2, r4, r0)
        L_0x01b3:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = r3.this$0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r6 = X.C108965cb.A0c(r0)
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = r3.this$0
            boolean r8 = r0.A0R
            X.6Ra r5 = r0.A07
            if (r5 == 0) goto L_0x01fd
            X.77d r3 = r0.A05
            if (r3 == 0) goto L_0x0207
            X.6u8 r4 = r0.A06
            if (r4 == 0) goto L_0x0200
            X.1OX r1 = X.C41561wd.A00(r6)
            X.0wl r0 = r6.A0N
            r7 = 0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1 r2 = new com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$getStickerInfoOption$1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass3MW.A1X(r0, r2, r1)
            goto L_0x002a
        L_0x01da:
            X.1bI r0 = r4.A08
            if (r0 == 0) goto L_0x01b3
            r0.A04(r2)
            goto L_0x01b3
        L_0x01e2:
            r1.setVisibility(r0)
            goto L_0x0137
        L_0x01e7:
            r5.setVisibility(r0)
            goto L_0x0132
        L_0x01ec:
            if (r7 == 0) goto L_0x00e8
            goto L_0x00d9
        L_0x01f0:
            if (r8 == 0) goto L_0x00c2
            int r0 = r8.length()
            if (r0 <= 0) goto L_0x00c2
            goto L_0x00b4
        L_0x01fa:
            java.lang.String r0 = "globalUI"
            goto L_0x020d
        L_0x01fd:
            java.lang.String r0 = "origin"
            goto L_0x020d
        L_0x0200:
            X.C18070vi.A11(r11)
            goto L_0x0210
        L_0x0204:
            java.lang.String r0 = "stickerImageFileLoader"
            goto L_0x020d
        L_0x0207:
            X.C18070vi.A11(r12)
            goto L_0x0210
        L_0x020b:
            java.lang.String r0 = "avatarSquidConfiguration"
        L_0x020d:
            X.C18070vi.A11(r0)
        L_0x0210:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81M.invoke(java.lang.Object):java.lang.Object");
    }
}
