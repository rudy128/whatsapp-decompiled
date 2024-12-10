package X;

/* renamed from: X.4f6  reason: invalid class name and case insensitive filesystem */
public class C91074f6 implements AnonymousClass02j {
    public final int A00;
    public final Object A01;

    public C91074f6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass02n A00(AnonymousClass01C r1, C005302h r2, int i) {
        return r1.CDw(new C91074f6(r1, i), r2);
    }

    /* JADX WARNING: type inference failed for: r0v29, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03e6, code lost:
        r0 = "eventCreateOrEditViewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03ef, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03f3, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bkx(java.lang.Object r19) {
        /*
            r18 = this;
            r5 = r19
            r1 = r18
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x02ad;
                case 1: goto L_0x022f;
                case 2: goto L_0x03dc;
                case 3: goto L_0x039f;
                case 4: goto L_0x020d;
                case 5: goto L_0x01c8;
                case 6: goto L_0x01a2;
                case 7: goto L_0x02f0;
                case 8: goto L_0x0155;
                case 9: goto L_0x02c2;
                case 10: goto L_0x013d;
                case 11: goto L_0x0097;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r8 = r1.A01
            com.whatsapp.settings.chat.theme.ChatThemeActivity r8 = (com.whatsapp.settings.chat.theme.ChatThemeActivity) r8
            X.02m r5 = (X.C005702m) r5
            r6 = 0
            r4 = 1
            X.C18070vi.A0d(r5, r4)
            int r0 = r5.A00
            r1 = -1
            if (r0 != r1) goto L_0x0094
            android.content.Intent r3 = r5.A01
            if (r3 == 0) goto L_0x0095
            java.lang.String r0 = "request_code"
            int r0 = r3.getIntExtra(r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0027:
            r0 = 4
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r0 = 18
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r1[r6] = r7
            r0 = 19
            X.C17880vN.A1T(r1, r0, r4)
            r0 = 20
            X.AnonymousClass3Ma.A1S(r1, r0)
            r0 = 21
            X.C17890vO.A1G(r1, r0)
            java.util.List r0 = java.util.Arrays.asList(r1)
            X.C18070vi.A0X(r0)
            boolean r0 = X.C29431cG.A18(r0, r2)
            if (r0 == 0) goto L_0x005b
            X.1GP r1 = r8.getSupportFragmentManager()
            int r0 = r1.A0K()
            if (r0 <= 0) goto L_0x005b
            r1.A0b()
        L_0x005b:
            if (r3 == 0) goto L_0x0094
            android.net.Uri r6 = r3.getData()
            if (r6 == 0) goto L_0x0094
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r8.A02
            if (r0 == 0) goto L_0x03ed
            X.1wy r5 = r0.A0U
            X.1BI r4 = r0.A0Q
            boolean r3 = X.AnonymousClass000.A1X(r4)
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity"
            r2.setClassName(r1, r0)
            r2.setData(r6)
            java.lang.String r1 = X.C22971Dz.A06(r4)
            java.lang.String r0 = "chat_jid"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_using_global_wallpaper"
            r2.putExtra(r0, r3)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r2, r7)
            r5.A0F(r0)
        L_0x0094:
            return
        L_0x0095:
            r2 = 0
            goto L_0x0027
        L_0x0097:
            java.lang.Object r2 = r1.A01
            com.whatsapp.lists.ListsManagerFragment r2 = (com.whatsapp.lists.ListsManagerFragment) r2
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0094
            android.content.Intent r1 = r5.A01
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "EXTRA_SELECTED_RAW_JID_LIST"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            if (r0 == 0) goto L_0x00df
            java.util.List r1 = X.C29431cG.A0t(r0)
        L_0x00b6:
            com.whatsapp.lists.ListsManagerViewModel r7 = X.AnonymousClass3Ma.A0p(r2)
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            java.util.ArrayList r6 = X.C22971Dz.A0A(r0, r1)
            java.util.List r5 = r7.A09
            X.C18070vi.A0W(r5)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r5.iterator()
        L_0x00cd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r1 = r3.next()
            boolean r0 = r6.contains(r1)
            X.AnonymousClass3MZ.A1V(r1, r4, r0)
            goto L_0x00cd
        L_0x00df:
            java.lang.String r0 = "ListsManagerFragment/onActivityResult/selectedJids is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wS r1 = X.C18460wS.A00
            goto L_0x00b6
        L_0x00e7:
            java.util.List r0 = r7.A08
            r0.addAll(r4)
            r5.clear()
            r5.addAll(r6)
            boolean r0 = r7.A05
            r11 = r0 ^ 1
            X.1G4 r1 = r7.A0B
            java.lang.Object r0 = r1.getValue()
            X.4Zg r0 = (X.C88334Zg) r0
            boolean r12 = r0.A04
            java.lang.Object r0 = r1.getValue()
            X.4Zg r0 = (X.C88334Zg) r0
            java.util.List r10 = r0.A02
            r9 = 0
            java.lang.String r8 = X.C88334Zg.A00(r1)
            com.whatsapp.lists.ListsManagerViewModel.A05(r7, r8, r9, r10, r11, r12)
            X.1x1 r0 = r2.A04
            if (r0 != 0) goto L_0x0120
            X.1pm r1 = X.AnonymousClass3MZ.A0H(r2)
            com.whatsapp.lists.ListsManagerFragment$createList$1 r0 = new com.whatsapp.lists.ListsManagerFragment$createList$1
            r0.<init>(r2, r9)
            X.AnonymousClass3MX.A1Q(r0, r1)
        L_0x0120:
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0094
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x0094
            X.1Fv r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0094
            X.1pm r1 = X.C37561pk.A00(r0)
            com.whatsapp.lists.ListsManagerFragment$activityResultLauncher$1$1 r0 = new com.whatsapp.lists.ListsManagerFragment$activityResultLauncher$1$1
            r0.<init>(r2, r9)
            X.AnonymousClass3MX.A1Q(r0, r1)
            return
        L_0x013d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.group.newgroup.NewGroup r2 = (com.whatsapp.group.newgroup.NewGroup) r2
            X.02m r5 = (X.C005702m) r5
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0094
            android.content.Intent r1 = r5.A01
            java.lang.String r0 = "setting_values"
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            if (r0 == 0) goto L_0x0094
            r2.A03 = r0
            return
        L_0x0155:
            java.lang.Object r3 = r1.A01
            com.whatsapp.events.EventCreateOrEditFragment r3 = (com.whatsapp.events.EventCreateOrEditFragment) r3
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0094
            android.content.Intent r0 = r5.A01
            if (r0 == 0) goto L_0x0094
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x0094
            X.3VY r1 = r3.A0M
            if (r1 == 0) goto L_0x03e6
            java.lang.String r0 = "locations_string"
            java.lang.String r3 = r2.getString(r0)
            java.lang.String r0 = "latitude"
            double r11 = r2.getDouble(r0)
            java.lang.String r0 = "longitude"
            double r13 = r2.getDouble(r0)
            java.lang.String r0 = "vicinity"
            java.lang.String r4 = r2.getString(r0)
            java.lang.String r0 = "address"
            java.lang.String r8 = r2.getString(r0)
            r5 = 0
            r15 = 0
            r17 = 0
            r7 = r5
            r9 = r5
            r10 = r5
            com.whatsapp.location.PlaceInfo r2 = new com.whatsapp.location.PlaceInfo
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)
            r1.A0U(r2)
            return
        L_0x01a2:
            java.lang.Object r3 = r1.A01
            X.01E r3 = (X.AnonymousClass01E) r3
            X.02m r5 = (X.C005702m) r5
            boolean r2 = X.C72453Mb.A1Z(r5)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0094
            android.content.Intent r1 = r5.A01
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "extra_rate_limited"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0094
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r0 = r3.findViewById(r0)
            r0.setEnabled(r2)
            return
        L_0x01c8:
            java.lang.Object r6 = r1.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r6 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r6
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0094
            android.content.Intent r1 = r5.A01
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "cc"
            java.lang.String r4 = r1.getStringExtra(r0)
            java.lang.String r0 = "iso"
            java.lang.String r3 = r1.getStringExtra(r0)
            java.lang.String r0 = "country_name"
            java.lang.String r2 = r1.getStringExtra(r0)
            X.9gv r0 = r6.A04
            java.lang.String r1 = "phoneNumberEntryViewHolder"
            if (r0 == 0) goto L_0x03e9
            android.widget.EditText r0 = r0.A02
            r0.setText(r4)
            X.9gv r0 = r6.A04
            if (r0 == 0) goto L_0x03e9
            android.widget.TextView r0 = r0.A04
            r0.setText(r2)
            if (r3 == 0) goto L_0x0094
            X.9gv r0 = r6.A04
            if (r0 == 0) goto L_0x03e9
            com.whatsapp.components.PhoneNumberEntry r0 = r0.A05
            r0.A03(r3)
            return
        L_0x020d:
            java.lang.Object r0 = r1.A01
            com.whatsapp.community.communityInfo.CAGInfoFragment r0 = (com.whatsapp.community.communityInfo.CAGInfoFragment) r0
            X.02m r5 = (X.C005702m) r5
            r4 = 0
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            X.3zh r2 = r0.A0B
            if (r2 == 0) goto L_0x0094
            android.content.Intent r1 = r5.A01
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = "message_mute_clicked"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 != r3) goto L_0x0094
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A07 = r0
            return
        L_0x022f:
            java.lang.Object r2 = r1.A01
            com.whatsapp.community.CommunityAdminPickerActivity r2 = (com.whatsapp.community.CommunityAdminPickerActivity) r2
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x03fa
            X.0vl r0 = r2.A06
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.community.CommunityAdminPickerViewModel r3 = (com.whatsapp.community.CommunityAdminPickerViewModel) r3
            android.content.Intent r6 = r5.A01
            r2 = 0
            if (r6 == 0) goto L_0x0251
            java.lang.String r0 = "transfer_ownership_successful"
            boolean r2 = r6.getBooleanExtra(r0, r2)
        L_0x0251:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CommunityChatManager/isTransferOwnershipSuccessful:"
            X.C17900vP.A0n(r0, r1, r2)
            java.lang.String r5 = "transfer_ownership_admin_short_name"
            if (r2 == 0) goto L_0x028c
            X.1G4 r4 = r3.A01
        L_0x0260:
            java.lang.Object r3 = r4.getValue()
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            r2 = 0
            if (r6 == 0) goto L_0x028a
            java.lang.String r0 = "transfer_ownership_admin_jid"
            java.lang.String r0 = r6.getStringExtra(r0)
        L_0x026f:
            com.whatsapp.jid.UserJid r0 = r1.A04(r0)
            if (r6 == 0) goto L_0x0279
            java.lang.String r2 = r6.getStringExtra(r5)
        L_0x0279:
            X.4Y8 r1 = new X.4Y8
            r1.<init>(r0, r2)
            X.3ou r0 = new X.3ou
            r0.<init>(r1)
            boolean r0 = r4.BFK(r3, r0)
            if (r0 == 0) goto L_0x0260
            return
        L_0x028a:
            r0 = r2
            goto L_0x026f
        L_0x028c:
            if (r6 == 0) goto L_0x03f4
            java.lang.String r4 = r6.getStringExtra(r5)
            if (r4 == 0) goto L_0x0094
            X.1G4 r3 = r3.A01
        L_0x0296:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.4FF r0 = (X.AnonymousClass4FF) r0
            X.4Y8 r1 = r0.A00()
            X.3ov r0 = new X.3ov
            r0.<init>(r1, r4)
            boolean r0 = r3.BFK(r2, r0)
            if (r0 == 0) goto L_0x0296
            return
        L_0x02ad:
            java.lang.Object r2 = r1.A01
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment r2 = (com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment) r2
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L_0x03fe
            if (r1 != 0) goto L_0x0094
            X.C72463Mc.A1A(r2)
            return
        L_0x02c2:
            java.lang.Object r0 = r1.A01
            com.whatsapp.events.EventCreateOrEditFragment r0 = (com.whatsapp.events.EventCreateOrEditFragment) r0
            X.3VY r4 = r0.A0M
            if (r4 == 0) goto L_0x03e6
            X.17r r1 = r0.A04
            if (r1 == 0) goto L_0x02ec
            java.lang.String r0 = "temp_cover_image"
            java.io.File r3 = r1.A0b(r0)
            X.1G1 r2 = r4.A0N
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<com.whatsapp.events.EventCreateOrEditViewModel.CoverImageState>"
            X.C18070vi.A0z(r2, r0)
            X.1G3 r2 = (X.AnonymousClass1G3) r2
            X.2il r0 = r4.A0D
            boolean r1 = r0.A00()
            X.4Tb r0 = new X.4Tb
            r0.<init>(r3, r1)
            r2.CPw(r0)
            return
        L_0x02ec:
            java.lang.String r0 = "fMessageIO"
            goto L_0x03ef
        L_0x02f0:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsActivity r4 = (com.whatsapp.conversationslist.LockedConversationsActivity) r4
            X.02m r5 = (X.C005702m) r5
            r3 = 1
            X.C18070vi.A0d(r5, r3)
            java.lang.Integer r8 = r4.A05
            r6 = 0
            int r5 = r5.A00
            r2 = -1
            if (r5 == r2) goto L_0x0313
            r0 = 2
            if (r5 == r0) goto L_0x0313
            com.whatsapp.conversationslist.LockedConversationsActivity.A0Q(r4)
        L_0x0308:
            r0 = 0
            r4.A05 = r0
            X.1fA r1 = r4.A4b()
            r0 = 0
            r1.A00 = r0
            return
        L_0x0313:
            X.1fA r1 = r4.A4b()
            boolean r0 = X.AnonymousClass000.A1T(r5, r2)
            r1.A03 = r0
            X.1fA r0 = r4.A4b()
            if (r5 != r2) goto L_0x0324
            r6 = 1
        L_0x0324:
            r0.A01 = r6
            X.1Dv r7 = X.AnonymousClass1BI.A00
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getStringExtra(r1)
            X.1BI r6 = r7.A02(r0)
            android.content.Intent r0 = r4.A00
            r2 = 0
            if (r0 == 0) goto L_0x0391
            java.lang.String r0 = r0.getStringExtra(r1)
        L_0x033f:
            X.1BI r1 = r7.A02(r0)
            android.content.Intent r0 = r4.A00
            if (r0 == 0) goto L_0x0379
            if (r1 == 0) goto L_0x0379
            r4.A00 = r2
            r6 = r1
        L_0x034c:
            r0 = -1
            if (r5 != r0) goto L_0x0352
            com.whatsapp.conversationslist.LockedConversationsActivity.A03(r4)
        L_0x0352:
            X.00H r0 = r4.A04
            if (r0 == 0) goto L_0x0393
            X.4VV r1 = X.AnonymousClass3MX.A0a(r0)
            r0 = 0
            r1.A01(r3, r0)
            X.1LU r0 = new X.1LU
            r0.<init>()
            r2 = 2
            android.content.Intent r1 = r0.A1w(r4, r6, r2)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "fromNotification"
            r1.putExtra(r0, r3)
            r4.startActivity(r1)
            if (r5 != r2) goto L_0x0308
            r4.finish()
            goto L_0x0308
        L_0x0379:
            if (r6 != 0) goto L_0x034c
            com.whatsapp.conversationslist.LockedConversationsActivity.A03(r4)
            if (r8 == 0) goto L_0x0308
            X.00H r0 = r4.A04
            if (r0 == 0) goto L_0x0399
            X.4VV r1 = X.AnonymousClass3MX.A0a(r0)
            int r0 = r8.intValue()
            r1.A01(r0, r3)
            goto L_0x0308
        L_0x0391:
            r0 = r2
            goto L_0x033f
        L_0x0393:
            java.lang.String r0 = "chatLockLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0399:
            java.lang.String r0 = "chatLockLogger"
            X.C18070vi.A11(r0)
            throw r2
        L_0x039f:
            java.lang.Object r2 = r1.A01
            com.whatsapp.community.SelectCommunityForGroupActivity r2 = (com.whatsapp.community.SelectCommunityForGroupActivity) r2
            X.02m r5 = (X.C005702m) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x03d8
            android.content.Intent r0 = r5.A01
            if (r0 == 0) goto L_0x03c0
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x03c0
            java.lang.String r0 = "result_groups_to_be_hidden"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            if (r1 != 0) goto L_0x03c4
        L_0x03c0:
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
        L_0x03c4:
            X.0vl r0 = r2.A03
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r0)
            java.lang.String r0 = r0.getRawString()
            boolean r0 = r1.contains(r0)
            r2.A05 = r0
            r2.Bpb()
            return
        L_0x03d8:
            r2.Bnj()
            return
        L_0x03dc:
            java.lang.Object r0 = r1.A01
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity r0 = (com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity) r0
            X.02m r5 = (X.C005702m) r5
            com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkActivity.A0Q(r5, r0)
            return
        L_0x03e6:
            java.lang.String r0 = "eventCreateOrEditViewModel"
            goto L_0x03ef
        L_0x03e9:
            X.C18070vi.A11(r1)
            goto L_0x03f2
        L_0x03ed:
            java.lang.String r0 = "viewModel"
        L_0x03ef:
            X.C18070vi.A11(r0)
        L_0x03f2:
            r0 = 0
            throw r0
        L_0x03f4:
            java.lang.String r0 = "CommunityChatManager/onTransferOwnershipResult unexpected error result"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x03fa:
            r2.A5D()
            return
        L_0x03fe:
            com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment.A02(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91074f6.Bkx(java.lang.Object):void");
    }
}
