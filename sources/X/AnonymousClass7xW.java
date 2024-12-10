package X;

import com.whatsapp.avatar.home.AvatarHomeActivity;

/* renamed from: X.7xW  reason: invalid class name */
public final class AnonymousClass7xW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarHomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7xW(AvatarHomeActivity avatarHomeActivity) {
        super(1);
        this.this$0 = avatarHomeActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:221:0x030c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.6Sv r10 = (X.C123026Sv) r10
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            boolean r0 = r10 instanceof X.C115405tx
            if (r0 == 0) goto L_0x00a6
            com.whatsapp.avatar.home.AvatarHomeActivity r4 = r9.this$0
            X.5tx r10 = (X.C115405tx) r10
            com.whatsapp.avatar.home.AvatarHomeActivity.A03(r4)
            r4.CEx()
            android.widget.LinearLayout r0 = r4.A05
            java.lang.String r1 = "containerNewUser"
            r6 = 0
            if (r0 == 0) goto L_0x002c
            r3 = 0
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r4.A05
            if (r0 == 0) goto L_0x002c
            X.C1422478s.A00(r0, r3)
            android.widget.FrameLayout r0 = r4.A03
            if (r0 != 0) goto L_0x0030
            java.lang.String r1 = "containerAvatarSet"
        L_0x002c:
            X.C18070vi.A11(r1)
            throw r6
        L_0x0030:
            r5 = 8
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x003c
            java.lang.String r1 = "browseStickersTextView"
            goto L_0x002c
        L_0x003c:
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = "createProfilePhotoTextView"
            goto L_0x002c
        L_0x0046:
            r0.setVisibility(r5)
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x0050
            java.lang.String r1 = "privacyDivider"
            goto L_0x002c
        L_0x0050:
            r0.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r4.A0E
            if (r0 != 0) goto L_0x005a
            java.lang.String r1 = "deleteAvatarTextView"
            goto L_0x002c
        L_0x005a:
            r0.setVisibility(r5)
            X.1YQ r0 = r4.A07
            if (r0 != 0) goto L_0x0064
            java.lang.String r1 = "editAvatarFab"
            goto L_0x002c
        L_0x0064:
            r2 = 1
            r0.A04(r2)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r4.A0G
            if (r1 == 0) goto L_0x0075
            r1.A00 = r3
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0V(r4, r2)
        L_0x0075:
            com.whatsapp.productinfra.avatar.squid.AvatarSquidUpsellView r0 = r4.A0K
            if (r0 == 0) goto L_0x007c
            r0.setVisibility(r5)
        L_0x007c:
            com.whatsapp.WaImageView r0 = r4.A0A
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = "avatarSetImageView"
            goto L_0x002c
        L_0x0083:
            r0.setImageBitmap(r6)
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x030e
            android.view.View r1 = r4.A00
            r0 = 2131889287(0x7f120c87, float:1.9413233E38)
            X.C108955ca.A1H(r1, r0, r3)
            X.0vl r0 = r4.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r0 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r0
            X.1DT r1 = r0.A00
            X.5tx r0 = new X.5tx
            r0.<init>(r3)
            r1.A0F(r0)
            goto L_0x030e
        L_0x00a6:
            boolean r0 = r10 instanceof X.C115415ty
            if (r0 == 0) goto L_0x0204
            com.whatsapp.avatar.home.AvatarHomeActivity r4 = r9.this$0
            X.5ty r10 = (X.C115415ty) r10
            com.whatsapp.avatar.home.AvatarHomeActivity.A03(r4)
            android.widget.LinearLayout r0 = r4.A05
            java.lang.String r1 = "containerNewUser"
            r2 = 0
            if (r0 == 0) goto L_0x0200
            r5 = 8
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r4.A05
            if (r0 == 0) goto L_0x0200
            r0.setOnTouchListener(r2)
            android.widget.FrameLayout r0 = r4.A03
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "containerAvatarSet"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00ce:
            r3 = 0
            r0.setVisibility(r3)
            com.whatsapp.CircularProgressBar r0 = r4.A08
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "avatarLoadingProgressBar"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00dc:
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r0 = r4.A0A
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "avatarSetImageView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00e9:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r4.A0C
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "browseStickersTextView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x00f6:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r4.A0D
            if (r0 != 0) goto L_0x0103
            java.lang.String r0 = "createProfilePhotoTextView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0103:
            r0.setVisibility(r3)
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "privacyDivider"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0110:
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r4.A0E
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = "deleteAvatarTextView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x011d:
            r0.setVisibility(r3)
            X.1YQ r1 = r4.A07
            if (r1 != 0) goto L_0x012a
            java.lang.String r0 = "editAvatarFab"
            X.C18070vi.A11(r0)
            throw r2
        L_0x012a:
            r0 = 1
            r1.A05(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r4.A0G
            if (r1 == 0) goto L_0x013d
            boolean r0 = r10.A02
            r1.A00 = r0
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0V(r4, r3)
        L_0x013d:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0179
            r0 = 2131889286(0x7f120c86, float:1.9413231E38)
            r4.CNA(r0)
        L_0x0147:
            X.6St r1 = r10.A00
            boolean r0 = r1 instanceof X.C115325tp
            if (r0 == 0) goto L_0x0189
            X.5tp r1 = (X.C115325tp) r1
            android.graphics.Bitmap r1 = r1.A00
            boolean r6 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r4.A08
            if (r0 != 0) goto L_0x015e
            java.lang.String r2 = "avatarLoadingProgressBar"
        L_0x0159:
            X.C18070vi.A11(r2)
            r0 = 0
            throw r0
        L_0x015e:
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r0 = r4.A0A
            java.lang.String r2 = "avatarSetImageView"
            if (r0 == 0) goto L_0x0159
            r0.setImageBitmap(r1)
            com.whatsapp.WaImageView r1 = r4.A0A
            if (r1 == 0) goto L_0x0159
            r0 = 1
            r1.setClickable(r0)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x01fb
            java.lang.String r2 = "avatarPreviewErrorView"
            goto L_0x0159
        L_0x0179:
            r4.CEx()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0147
            android.view.View r1 = r4.A00
            r0 = 2131889285(0x7f120c85, float:1.941323E38)
            X.C108955ca.A1H(r1, r0, r3)
            goto L_0x0147
        L_0x0189:
            X.5tq r0 = X.C115335tq.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x01c2
            boolean r6 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r4.A08
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "avatarLoadingProgressBar"
            X.C18070vi.A11(r0)
            throw r2
        L_0x019d:
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r0 = r4.A0A
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x01aa
            X.C18070vi.A11(r1)
            throw r2
        L_0x01aa:
            r0.setImageBitmap(r2)
            com.whatsapp.WaImageView r0 = r4.A0A
            if (r0 != 0) goto L_0x01b5
            X.C18070vi.A11(r1)
            throw r2
        L_0x01b5:
            r0.setClickable(r3)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x0305
            java.lang.String r0 = "avatarPreviewErrorView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01c2:
            X.5tr r0 = X.C115345tr.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x030e
            boolean r6 = r10.A02
            com.whatsapp.CircularProgressBar r0 = r4.A08
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "avatarLoadingProgressBar"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01d6:
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r4.A0A
            java.lang.String r1 = "avatarSetImageView"
            if (r0 != 0) goto L_0x01e3
            X.C18070vi.A11(r1)
            throw r2
        L_0x01e3:
            r0.setImageBitmap(r2)
            com.whatsapp.WaImageView r0 = r4.A0A
            if (r0 != 0) goto L_0x01ee
            X.C18070vi.A11(r1)
            throw r2
        L_0x01ee:
            r0.setClickable(r3)
            android.view.View r0 = r4.A00
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = "avatarPreviewErrorView"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01fb:
            r0.setVisibility(r5)
            goto L_0x0308
        L_0x0200:
            X.C18070vi.A11(r1)
            throw r2
        L_0x0204:
            X.5tw r0 = X.C115395tw.A00
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x030e
            com.whatsapp.avatar.home.AvatarHomeActivity r5 = r9.this$0
            com.whatsapp.WaTextView r0 = r5.A0C
            java.lang.String r8 = "browseStickersTextView"
            r3 = 0
            if (r0 != 0) goto L_0x0219
            X.C18070vi.A11(r8)
            throw r3
        L_0x0219:
            r0.setOnClickListener(r3)
            com.whatsapp.WaTextView r0 = r5.A0C
            if (r0 != 0) goto L_0x0224
            X.C18070vi.A11(r8)
            throw r3
        L_0x0224:
            r4 = 0
            r0.setClickable(r4)
            com.whatsapp.WaTextView r0 = r5.A0D
            java.lang.String r7 = "createProfilePhotoTextView"
            if (r0 != 0) goto L_0x0232
            X.C18070vi.A11(r7)
            throw r3
        L_0x0232:
            r0.setOnClickListener(r3)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x023d
            X.C18070vi.A11(r7)
            throw r3
        L_0x023d:
            r0.setClickable(r4)
            com.whatsapp.WaTextView r0 = r5.A0E
            java.lang.String r6 = "deleteAvatarTextView"
            if (r0 != 0) goto L_0x024a
            X.C18070vi.A11(r6)
            throw r3
        L_0x024a:
            r0.setOnClickListener(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x0255
            X.C18070vi.A11(r6)
            throw r3
        L_0x0255:
            r0.setClickable(r4)
            android.widget.LinearLayout r0 = r5.A06
            java.lang.String r1 = "containerPrivacy"
            if (r0 != 0) goto L_0x0262
            X.C18070vi.A11(r1)
            throw r3
        L_0x0262:
            r0.setOnClickListener(r3)
            android.widget.LinearLayout r0 = r5.A06
            if (r0 != 0) goto L_0x026d
            X.C18070vi.A11(r1)
            throw r3
        L_0x026d:
            r0.setClickable(r4)
            r5.CEx()
            android.widget.LinearLayout r0 = r5.A05
            java.lang.String r2 = "containerNewUser"
            if (r0 == 0) goto L_0x0301
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A05
            if (r0 == 0) goto L_0x0301
            r0.setOnTouchListener(r3)
            android.widget.FrameLayout r0 = r5.A03
            if (r0 != 0) goto L_0x028f
            java.lang.String r0 = "containerAvatarSet"
            X.C18070vi.A11(r0)
            throw r3
        L_0x028f:
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r5.A08
            if (r0 != 0) goto L_0x029c
            java.lang.String r0 = "avatarLoadingProgressBar"
            X.C18070vi.A11(r0)
            throw r3
        L_0x029c:
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r5.A0A
            java.lang.String r2 = "avatarSetImageView"
            if (r0 != 0) goto L_0x02a9
            X.C18070vi.A11(r2)
            throw r3
        L_0x02a9:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r0 = r5.A0C
            if (r0 != 0) goto L_0x02b4
            X.C18070vi.A11(r8)
            throw r3
        L_0x02b4:
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r0 = r5.A0D
            if (r0 != 0) goto L_0x02bf
            X.C18070vi.A11(r7)
            throw r3
        L_0x02bf:
            r0.setVisibility(r4)
            android.view.View r0 = r5.A01
            if (r0 != 0) goto L_0x02cc
            java.lang.String r0 = "privacyDivider"
            X.C18070vi.A11(r0)
            throw r3
        L_0x02cc:
            r0.setVisibility(r4)
            com.whatsapp.WaTextView r0 = r5.A0E
            if (r0 != 0) goto L_0x02d7
            X.C18070vi.A11(r6)
            throw r3
        L_0x02d7:
            r0.setVisibility(r1)
            X.1YQ r1 = r5.A07
            if (r1 != 0) goto L_0x02e4
            java.lang.String r0 = "editAvatarFab"
            X.C18070vi.A11(r0)
            throw r3
        L_0x02e4:
            r0 = 1
            r1.A04(r0)
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r1 = r5.A0G
            if (r1 == 0) goto L_0x02f5
            r1.A00 = r4
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.avatar.home.AvatarHomeActivity.A0V(r5, r4)
        L_0x02f5:
            com.whatsapp.WaImageView r0 = r5.A0A
            if (r0 != 0) goto L_0x02fd
            X.C18070vi.A11(r2)
            throw r3
        L_0x02fd:
            r0.setImageBitmap(r3)
            goto L_0x030e
        L_0x0301:
            X.C18070vi.A11(r2)
            throw r3
        L_0x0305:
            r0.setVisibility(r3)
        L_0x0308:
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r0 = r4.A0G
            if (r0 == 0) goto L_0x030e
            r0.A00 = r6
        L_0x030e:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7xW.invoke(java.lang.Object):java.lang.Object");
    }
}
