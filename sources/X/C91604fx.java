package X;

/* renamed from: X.4fx  reason: invalid class name and case insensitive filesystem */
public class C91604fx implements C22851Dl {
    public final int A00;
    public final Object A01;

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e2, code lost:
        r0 = 0;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e3, code lost:
        r4.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        r1.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04b6, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0526, code lost:
        r1 = r2.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x052c, code lost:
        if (X.C72473Md.A1X(r1) != false) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0532, code lost:
        if (X.C72473Md.A1W(r1) == false) goto L_0x0538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0534, code lost:
        r8 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0538, code lost:
        r2.A01 = r8;
        r1 = r2.A00;
        r2.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0542, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0544, code lost:
        X.C73083Ox.A00(r2, r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0549, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054a, code lost:
        r2.getFilter().filter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0551, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06fe, code lost:
        r0 = r1.A05;
        r0.clear();
        r0.putAll(r8);
        r1.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0709, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07c2, code lost:
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0161, code lost:
        r0 = 8;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0242, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0245, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bo9(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0864;
                case 1: goto L_0x03e4;
                case 2: goto L_0x07fa;
                case 3: goto L_0x07e6;
                case 4: goto L_0x03a0;
                case 5: goto L_0x07dc;
                case 6: goto L_0x034f;
                case 7: goto L_0x07d0;
                case 8: goto L_0x0310;
                case 9: goto L_0x02e7;
                case 10: goto L_0x07ca;
                case 11: goto L_0x07ca;
                case 12: goto L_0x02cd;
                case 13: goto L_0x02b7;
                case 14: goto L_0x029f;
                case 15: goto L_0x0781;
                case 16: goto L_0x021f;
                case 17: goto L_0x0203;
                case 18: goto L_0x0760;
                case 19: goto L_0x01a1;
                case 20: goto L_0x0727;
                case 21: goto L_0x0031;
                case 22: goto L_0x070a;
                case 23: goto L_0x0006;
                case 24: goto L_0x0006;
                case 25: goto L_0x0165;
                case 26: goto L_0x011f;
                case 27: goto L_0x06f6;
                case 28: goto L_0x010e;
                case 29: goto L_0x0571;
                case 30: goto L_0x0552;
                case 31: goto L_0x051e;
                case 32: goto L_0x00c1;
                case 33: goto L_0x00e4;
                case 34: goto L_0x050c;
                case 35: goto L_0x0503;
                case 36: goto L_0x00b3;
                case 37: goto L_0x04fc;
                case 38: goto L_0x04f2;
                case 39: goto L_0x04ba;
                case 40: goto L_0x04ae;
                case 41: goto L_0x04a1;
                case 42: goto L_0x0464;
                case 43: goto L_0x044d;
                case 44: goto L_0x0440;
                case 45: goto L_0x03fa;
                case 46: goto L_0x0082;
                case 47: goto L_0x0076;
                case 48: goto L_0x03f2;
                case 49: goto L_0x006b;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r3 = r14.A01
            android.content.Context r3 = (android.content.Context) r3
            X.1A3 r8 = (X.AnonymousClass1A3) r8
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A00(r0)
            if (r2 == 0) goto L_0x0030
            java.lang.Integer r1 = X.C17880vN.A0k()
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass1LU.A1D(r3, r2, r1, r0, r0)
            r3.startActivity(r0)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r4 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            java.util.List r8 = (java.util.List) r8
            X.3Wp r1 = r4.A1J
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r1.A00 = r8
            r1.notifyDataSetChanged()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0053
            android.view.View r1 = r4.A02
            r0 = 8
        L_0x004c:
            r1.setVisibility(r0)
            X.3Wp r0 = r4.A1J
            goto L_0x0242
        L_0x0053:
            android.widget.TextView r3 = r4.A0C
            X.0vb r0 = r4.A0m
            java.text.NumberFormat r2 = r0.A0L()
            int r0 = r8.size()
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r3.setText(r0)
            android.view.View r1 = r4.A02
            r0 = 0
            goto L_0x004c
        L_0x006b:
            java.lang.Object r1 = r14.A01
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x0030
            goto L_0x007e
        L_0x0076:
            java.lang.Object r1 = r14.A01
            com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog r1 = (com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog) r1
            X.4Mi r0 = r1.A00
            if (r0 == 0) goto L_0x0030
        L_0x007e:
            r1.A28()
            return
        L_0x0082:
            java.lang.Object r5 = r14.A01
            com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog r5 = (com.whatsapp.ml.v2.storageusage.MLRemoveModelDialog) r5
            X.4Mi r2 = r5.A00
            if (r2 == 0) goto L_0x0030
            com.whatsapp.ml.v2.storageusage.MLModelStorageUsageActivity r0 = r2.A01
            X.0vl r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.ml.v2.storageusage.MLModelStorageUsageViewModel r1 = (com.whatsapp.ml.v2.storageusage.MLModelStorageUsageViewModel) r1
            X.4V4 r0 = r2.A00
            X.73b r4 = r1.A02
            X.708 r3 = r0.A00
            X.5O8 r2 = new X.5O8
            r2.<init>(r0, r1)
            X.00H r0 = r4.A02
            java.lang.Object r1 = r0.get()
            com.whatsapp.ml.v2.repo.MLModelRepository r1 = (com.whatsapp.ml.v2.repo.MLModelRepository) r1
            X.7w2 r0 = new X.7w2
            r0.<init>(r4, r3, r2)
            r1.A05(r3, r0)
            r5.A28()
            return
        L_0x00b3:
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1B()
            if (r0 == 0) goto L_0x0030
            r0.invalidateOptionsMenu()
            return
        L_0x00c1:
            java.lang.Object r2 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            int r1 = X.AnonymousClass000.A0M(r15)
            if (r1 != 0) goto L_0x00cf
            android.view.View r4 = r2.A06
            goto L_0x02e2
        L_0x00cf:
            r0 = 1
            if (r1 != r0) goto L_0x0030
            android.view.View r1 = r2.A06
            r0 = 8
            r1.setVisibility(r0)
            X.1Tv r1 = r2.A0e
            X.1E7 r0 = r2.A0u
            r1.A00(r0)
            com.whatsapp.group.GroupChatInfoActivity.A1G(r2)
            return
        L_0x00e4:
            java.lang.Object r2 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.1CJ r1 = r2.A0H
            X.1EC r0 = r2.A1K
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x0152
            X.4Cw r0 = X.C82974Cw.SUSPENDED
            if (r15 != r0) goto L_0x0152
            X.00H r0 = r2.A1p
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r0 = r2.A1K
            X.1EC r1 = r1.A05(r0)
            if (r1 == 0) goto L_0x0030
            X.11t r0 = r2.A0a
            com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment r0 = r0.BP2(r1)
            r2.CMl(r0)
            return
        L_0x010e:
            java.lang.Object r1 = r14.A01
            X.1FO r1 = (X.AnonymousClass1FO) r1
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            r1.A2v(r0)
            if (r0 != 0) goto L_0x0030
            r1.C3A()
            return
        L_0x011f:
            java.lang.Object r3 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            int r1 = X.AnonymousClass000.A0M(r15)
            com.whatsapp.ListItemWithLeftIcon r4 = r3.A0N
            if (r4 == 0) goto L_0x0030
            r0 = 2
            r2 = 0
            if (r1 != r0) goto L_0x0143
            r0 = 2131890366(0x7f1210be, float:1.9415422E38)
            r4.setTitle((int) r0)
            com.whatsapp.ListItemWithLeftIcon r1 = r3.A0N
            r0 = 2131233299(0x7f080a13, float:1.8082732E38)
        L_0x013a:
            r1.setIcon((int) r0)
            com.whatsapp.ListItemWithLeftIcon r0 = r3.A0N
            r0.setVisibility(r2)
            return
        L_0x0143:
            r0 = 3
            if (r1 != r0) goto L_0x0161
            r0 = 2131890370(0x7f1210c2, float:1.941543E38)
            r4.setTitle((int) r0)
            com.whatsapp.ListItemWithLeftIcon r1 = r3.A0N
            r0 = 2131233298(0x7f080a12, float:1.808273E38)
            goto L_0x013a
        L_0x0152:
            X.4Cw r0 = X.C82974Cw.DEACTIVATED
            if (r15 != r0) goto L_0x0030
            X.11t r0 = r2.A0a
            com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment r0 = r0.BP1()
            r2.CMl(r0)
            android.view.View r4 = r2.A07
        L_0x0161:
            r0 = 8
            goto L_0x02e3
        L_0x0165:
            java.lang.Object r4 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.1A3 r8 = (X.AnonymousClass1A3) r8
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A00(r0)
            if (r3 == 0) goto L_0x0030
            X.0ve r0 = r4.A0E
            boolean r2 = X.C87484Vt.A01(r0)
            X.1LU r1 = r4.A1I
            r0 = 0
            if (r2 == 0) goto L_0x0190
            r0 = 34
        L_0x0190:
            android.content.Intent r3 = r1.A1w(r4, r3, r0)
            X.1L9 r2 = r4.A01
            java.lang.String r1 = "args_conversation_screen_entry_point"
            r0 = 3
            android.content.Intent r0 = r3.putExtra(r1, r0)
            r2.A09(r4, r0)
            return
        L_0x01a1:
            java.lang.Object r2 = r14.A01
            com.whatsapp.group.GroupAdminPickerActivity r2 = (com.whatsapp.group.GroupAdminPickerActivity) r2
            X.1A3 r8 = (X.AnonymousClass1A3) r8
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r8.A00()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A00(r0)
            java.lang.String r0 = r2.A0L
            if (r0 == 0) goto L_0x086c
            java.lang.String r0 = r2.A0J
            if (r0 == 0) goto L_0x086c
            X.1FU r8 = X.AnonymousClass3MZ.A0P(r2)
            java.lang.String r7 = r2.A0K
            X.1EC r6 = r2.A0E
            java.lang.String r5 = r2.A0L
            java.lang.String r4 = r2.A0J
            java.lang.String r3 = "message"
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.C18070vi.A0s(r9, r6, r5, r4)
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r2 = new com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            r1.putString(r3, r7)
            java.lang.String r0 = "admin_jid"
            X.AnonymousClass3MY.A15(r1, r9, r0)
            java.lang.String r0 = "group_jid"
            X.AnonymousClass3MY.A15(r1, r6, r0)
            java.lang.String r0 = "raw_parent_jid"
            r1.putString(r0, r4)
            java.lang.String r0 = "group_subject"
            r1.putString(r0, r5)
            r2.A1R(r1)
            java.lang.String r0 = "join_request_reason"
            r8.CMk(r2, r0)
            return
        L_0x0203:
            java.lang.Object r1 = r14.A01
            com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment r1 = (com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment) r1
            java.util.Set r8 = (java.util.Set) r8
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            com.whatsapp.WaTextView r5 = r1.A01
            if (r5 == 0) goto L_0x0030
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0879
            X.5bp r0 = r1.A03
            if (r0 == 0) goto L_0x0030
            r0.onDismiss()
            return
        L_0x021f:
            java.lang.Object r2 = r14.A01
            com.whatsapp.gallery.GalleryFragmentBase r2 = (com.whatsapp.gallery.GalleryFragmentBase) r2
            X.4EW r8 = (X.AnonymousClass4EW) r8
            boolean r0 = r8 instanceof X.AnonymousClass40L
            if (r0 == 0) goto L_0x0246
            X.40L r8 = (X.AnonymousClass40L) r8
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0239
            java.util.ArrayList r0 = r2.A0L
            r0.clear()
            X.3XJ r0 = r2.A0A
            r0.notifyDataSetChanged()
        L_0x0239:
            java.util.List r1 = r8.A01
            java.util.ArrayList r0 = r2.A0L
            r0.addAll(r1)
            X.3XJ r0 = r2.A0A
        L_0x0242:
            r0.notifyDataSetChanged()
            return
        L_0x0246:
            boolean r0 = r8 instanceof X.AnonymousClass40K
            if (r0 == 0) goto L_0x0030
            X.40K r8 = (X.AnonymousClass40K) r8
            android.view.View r0 = r2.A01
            X.C72453Mb.A1B(r0)
            int r0 = r8.A00
            r2.A00 = r0
            com.whatsapp.gallery.GalleryFragmentBase.A03(r2)
            X.3XJ r1 = r2.A0A
            android.database.Cursor r0 = r8.A01
            android.database.Cursor r0 = r1.A0U(r0)
            if (r0 == 0) goto L_0x0265
            r0.close()
        L_0x0265:
            com.whatsapp.gallery.viewmodel.GalleryViewModel r5 = r2.A0C
            java.lang.String r6 = r2.A0K
            android.content.Context r1 = r2.A14()
            X.0vb r0 = r2.A05
            X.7Gy r4 = new X.7Gy
            r4.<init>(r1, r0)
            r0 = 31
            X.4sV r8 = X.C99244sV.A00(r2, r0)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1yT r0 = r5.A01
            if (r0 == 0) goto L_0x0285
            r0.A01()
        L_0x0285:
            X.1OB r0 = r5.A03
            X.AnonymousClass3Ma.A1R(r0)
            X.1OX r2 = X.C41561wd.A00(r5)
            X.0wl r1 = r5.A07
            r7 = 0
            com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1 r3 = new com.whatsapp.gallery.viewmodel.GalleryViewModel$loadSections$1
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.1e4 r0 = X.C30451dy.A02(r0, r1, r3, r2)
            r5.A03 = r0
            return
        L_0x029f:
            java.lang.Object r3 = r14.A01
            X.3Z8 r3 = (X.AnonymousClass3Z8) r3
            X.4NK r0 = r3.A00
            boolean r2 = r0.A00
            android.widget.RadioButton r1 = r3.A01
            boolean r0 = r1.isChecked()
            if (r2 == r0) goto L_0x0030
            X.4NK r0 = r3.A00
            boolean r0 = r0.A00
            r1.setChecked(r0)
            return
        L_0x02b7:
            java.lang.Object r2 = r14.A01
            X.4NK r2 = (X.AnonymousClass4NK) r2
            boolean r1 = X.AnonymousClass000.A1Z(r15, r2)
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0030
            r2.A00 = r1
            if (r1 == 0) goto L_0x0030
            X.1DT r0 = r2.A01
            r0.A0E(r2)
            return
        L_0x02cd:
            java.lang.Object r4 = r14.A01
            X.3bn r4 = (X.C74513bn) r4
            if (r15 == 0) goto L_0x0030
            X.4XK r3 = r4.A07
            X.1BI r0 = r4.A0C
            java.lang.String r2 = r0.getRawString()
            r1 = 4
            r0 = 1
            X.AnonymousClass4XK.A00(r3, r2, r1, r0)
            android.view.View r4 = r4.A00
        L_0x02e2:
            r0 = 0
        L_0x02e3:
            r4.setVisibility(r0)
            return
        L_0x02e7:
            java.lang.Object r4 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r4 = (com.whatsapp.conversationslist.ConversationsFragment) r4
            X.4Cs r0 = X.C82934Cs.DISMISS_BUTTON
            if (r15 != r0) goto L_0x0030
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131888139(0x7f12080b, float:1.9410905E38)
            java.lang.String r3 = r1.getString(r0)
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r4)
            r0 = 2131897301(0x7f122bd5, float:1.9429488E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 13
            X.4dF r0 = new X.4dF
            r0.<init>(r4, r1)
            r4.A2F(r3, r2, r0)
            return
        L_0x0310:
            java.lang.Object r3 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.4FO r8 = (X.AnonymousClass4FO) r8
            X.4Cs r0 = r8.A03
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x08b6
            r0 = 1
            if (r1 != r0) goto L_0x0030
            X.1E7 r0 = r8.A04
            X.1BI r2 = r0.A0J
            if (r2 == 0) goto L_0x0030
            X.6yE r1 = r8.A05
            if (r1 == 0) goto L_0x0345
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0345
            int r0 = r1.A01
            if (r0 <= 0) goto L_0x0345
            int r1 = r8.A00
            X.1rA r0 = r3.A1V
            if (r0 == 0) goto L_0x0341
            int r0 = r0.getCount()
            int r1 = r1 + r0
        L_0x0341:
            com.whatsapp.conversationslist.ConversationsFragment.A0j(r3, r2, r1)
            return
        L_0x0345:
            android.view.View r1 = r8.A01
            if (r1 == 0) goto L_0x0030
            android.view.View r0 = r8.A02
            com.whatsapp.conversationslist.ConversationsFragment.A0E(r1, r0, r3, r2)
            return
        L_0x034f:
            java.lang.Object r2 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            java.lang.String r8 = (java.lang.String) r8
            boolean r1 = r2.A3r
            boolean r0 = r2.A3s
            r3 = 0
            if (r1 != 0) goto L_0x0373
            if (r0 != 0) goto L_0x0373
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0373
            com.whatsapp.conversation.headerfooter.InteropView r0 = r2.A1O
            r0.setVisibility(r3)
            X.1qw r1 = r2.A1m
            com.whatsapp.conversation.headerfooter.InteropView r0 = r2.A1O
            r1.BBD(r0, r3)
            r0 = 1
            r2.A3s = r0
        L_0x0373:
            boolean r0 = r2.A3s
            if (r0 == 0) goto L_0x038d
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x038d
            com.whatsapp.conversation.headerfooter.InteropView r1 = r2.A1O
            r0 = 8
            r1.setVisibility(r0)
            X.1qw r1 = r2.A1m
            com.whatsapp.conversation.headerfooter.InteropView r0 = r2.A1O
            r1.CEk(r0)
            r2.A3s = r3
        L_0x038d:
            boolean r0 = r2.A3s
            if (r0 == 0) goto L_0x0396
            com.whatsapp.conversation.headerfooter.InteropView r0 = r2.A1O
            r0.setContentIndicatorText(r8)
        L_0x0396:
            boolean r0 = r2.A3r
            if (r0 == 0) goto L_0x0030
            com.whatsapp.conversation.headerfooter.InteropView r0 = r2.A1P
            r0.setContentIndicatorText(r8)
            return
        L_0x03a0:
            java.lang.Object r5 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            java.util.Map r8 = (java.util.Map) r8
            X.5jJ r0 = r5.A2U
            java.util.List r0 = r0.A0U()
            java.util.Iterator r4 = r0.iterator()
        L_0x03b0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r3 = r4.next()
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1rA r0 = r5.A1V
            if (r0 == 0) goto L_0x03b0
            android.view.View r0 = com.whatsapp.conversationslist.ConversationsFragment.A03(r5, r3)
            if (r0 != 0) goto L_0x03df
            r1 = 0
        L_0x03c7:
            boolean r0 = r1 instanceof X.C42071xZ
            if (r0 == 0) goto L_0x03b0
            X.1xZ r1 = (X.C42071xZ) r1
            java.lang.Object r2 = r8.get(r3)
            X.6yE r2 = (X.C139106yE) r2
            X.1yD r1 = r1.A0A
            boolean r0 = r1 instanceof X.C42471yE
            if (r0 == 0) goto L_0x03b0
            X.1yE r1 = (X.C42471yE) r1
            r1.CRM(r3, r2)
            goto L_0x03b0
        L_0x03df:
            java.lang.Object r1 = r0.getTag()
            goto L_0x03c7
        L_0x03e4:
            java.lang.Object r1 = r14.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            boolean r0 = X.AnonymousClass000.A1Y(r15)
            if (r0 == 0) goto L_0x0030
            X.AnonymousClass4aY.A1w(r1)
            return
        L_0x03f2:
            java.lang.Object r0 = r14.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r0 = (com.whatsapp.newsletter.NewsletterInfoActivity) r0
            com.whatsapp.newsletter.NewsletterInfoActivity.A1B(r0)
            return
        L_0x03fa:
            java.lang.Object r3 = r14.A01
            com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity r3 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoActivity) r3
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            X.0vl r0 = r3.A0H
            java.lang.Object r5 = r0.getValue()
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel r5 = (com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel) r5
            X.4ca r2 = r3.A09
            r1 = 0
            if (r2 != 0) goto L_0x0417
            java.lang.String r0 = "integratorInfo"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0417:
            com.whatsapp.WaEditText r0 = r3.A07
            if (r0 == 0) goto L_0x041f
            android.text.Editable r1 = r0.getText()
        L_0x041f:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            int r0 = r2.A00
            X.1D6 r4 = X.AnonymousClass1D6.A00(r1, r0)
            java.util.List r3 = X.C18070vi.A0M(r4)
            X.1OX r2 = X.C41561wd.A00(r5)
            r1 = 0
            com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1 r0 = new com.whatsapp.interopui.compose.InteropComposeEnterInfoViewModel$onCreateChatButtonClicked$1
            r0.<init>(r5, r3, r4, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            goto L_0x07c2
        L_0x0440:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            X.C18070vi.A0h(r1, r8)
            r8.dismiss()
            goto L_0x04b6
        L_0x044d:
            java.lang.Object r0 = r14.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r0 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r0
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            X.C18070vi.A0h(r0, r8)
            r8.dismiss()
            X.4Po r2 = X.C72473Md.A0V(r0)
            r1 = 0
            r0 = 17
            r2.A00(r0, r1)
            return
        L_0x0464:
            java.lang.Object r1 = r14.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            boolean r9 = X.C18070vi.A16(r1, r8)
            r8.dismiss()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r4 = X.AnonymousClass3MZ.A0v(r1)
            com.whatsapp.WaEditText r0 = r1.A0A
            r2 = 0
            if (r0 != 0) goto L_0x0480
            java.lang.String r0 = "titleEditText"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0480:
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x049f
            java.lang.String r5 = r0.toString()
        L_0x048a:
            java.lang.String r6 = com.whatsapp.inappbugreporting.InAppBugReportingActivity.A03(r1)
            android.net.Uri[] r8 = r1.A0P
            java.lang.String r7 = r1.A0O
            r4.A0U(r5, r6, r7, r8, r9)
            X.4Po r1 = X.C72473Md.A0V(r1)
            r0 = 16
            r1.A00(r0, r2)
            return
        L_0x049f:
            r5 = r2
            goto L_0x048a
        L_0x04a1:
            java.lang.Object r0 = r14.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            r8.dismiss()
            r0.run()
            return
        L_0x04ae:
            java.lang.Object r1 = r14.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
        L_0x04b6:
            r1.finish()
            return
        L_0x04ba:
            java.lang.Object r5 = r14.A01
            com.whatsapp.group.GroupProfileEmojiEditor r5 = (com.whatsapp.group.GroupProfileEmojiEditor) r5
            X.4Mb r8 = (X.C85094Mb) r8
            int r0 = r8.A00
            r4 = 1
            if (r0 != 0) goto L_0x04e9
            X.00H r0 = r5.A0F
            java.lang.Object r3 = r0.get()
            X.1oy r3 = (X.C37101oy) r3
            android.widget.ImageView r2 = r5.A03
            android.graphics.drawable.Drawable r1 = r8.A01
            X.C17960vV.A07(r1)
            android.content.res.Resources r0 = r5.getResources()
            android.graphics.Bitmap r1 = r3.A00(r0, r1, r2)
            r5.A00 = r1
            if (r1 == 0) goto L_0x04e9
            android.widget.ImageView r0 = r5.A04
            r0.setImageBitmap(r1)
            r5.invalidateOptionsMenu()
            return
        L_0x04e9:
            X.1KB r1 = r5.A05
            r0 = 2131889985(0x7f120f41, float:1.941465E38)
            r1.A08(r0, r4)
            return
        L_0x04f2:
            java.lang.Object r0 = r14.A01
            com.whatsapp.group.GroupParticipantsSearchFragment r0 = (com.whatsapp.group.GroupParticipantsSearchFragment) r0
            java.util.Map r8 = (java.util.Map) r8
            X.3Ox r1 = r0.A05
            goto L_0x06fe
        L_0x04fc:
            java.lang.Object r2 = r14.A01
            X.3Ox r2 = (X.C73083Ox) r2
            java.util.List r8 = (java.util.List) r8
            goto L_0x0526
        L_0x0503:
            java.lang.Object r1 = r14.A01
            com.whatsapp.group.GroupMembersSelector r1 = (com.whatsapp.group.GroupMembersSelector) r1
            r0 = 0
            com.whatsapp.group.GroupMembersSelector.A0z(r1, r0)
            return
        L_0x050c:
            java.lang.Object r0 = r14.A01
            X.4VH r0 = (X.AnonymousClass4VH) r0
            X.1L9 r2 = r0.A00
            X.1FU r1 = r0.A01
            X.1EC r0 = r0.A04
            android.content.Intent r0 = X.AnonymousClass1LU.A0m(r1, r0)
            r2.A08(r1, r0)
            return
        L_0x051e:
            java.lang.Object r0 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.util.List r8 = (java.util.List) r8
            X.3Ox r2 = r0.A14
        L_0x0526:
            com.whatsapp.group.GroupChatInfoActivity r1 = r2.A07
            boolean r0 = X.C72473Md.A1X(r1)
            if (r0 != 0) goto L_0x0534
            boolean r0 = X.C72473Md.A1W(r1)
            if (r0 == 0) goto L_0x0538
        L_0x0534:
            java.util.List r8 = java.util.Collections.emptyList()
        L_0x0538:
            r2.A01 = r8
            java.lang.String r1 = r2.A00
            r2.A00 = r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x054a
            java.util.List r0 = r2.A01
            X.C73083Ox.A00(r2, r0)
            return
        L_0x054a:
            android.widget.Filter r0 = r2.getFilter()
            r0.filter(r1)
            return
        L_0x0552:
            java.lang.Object r0 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.lang.Number r8 = (java.lang.Number) r8
            int r4 = r8.intValue()
            com.whatsapp.group.GroupChatInfoActivity.A1I(r0, r4)
            android.widget.TextView r3 = r0.A0F
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131755314(0x7f100132, float:1.9141504E38)
            r0 = 1
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r8, r0)
            X.AnonymousClass3MX.A1E(r2, r3, r0, r1, r4)
            return
        L_0x0571:
            java.lang.Object r7 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r7 = (com.whatsapp.group.GroupChatInfoActivity) r7
            X.4NO r8 = (X.AnonymousClass4NO) r8
            X.3TV r0 = r7.A16
            r6 = 0
            r0.A00 = r6
            X.1DT r2 = r0.A02
            boolean r1 = r0.A01
            r0 = 1
            if (r1 != 0) goto L_0x0584
            r0 = 0
        L_0x0584:
            X.AnonymousClass3MY.A1L(r2, r0)
            java.util.List r0 = r8.A00
            int r5 = r0.size()
            boolean r4 = r8.A02
            android.view.View r1 = r7.A00
            r0 = 2131430500(0x7f0b0c64, float:1.8482703E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r1, r0)
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r3 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r3
            X.1E7 r2 = r7.A0u
            X.1EC r1 = r7.A1K
            X.3zh r0 = r7.A10
            r3.A0A(r2, r0, r1, r4)
            r7.A4d()
            X.4XY r0 = r7.A0T
            r0.A01()
            android.view.View r1 = r7.A00
            r0 = 2131430718(0x7f0b0d3e, float:1.8483145E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r1, r0)
            X.3cj r8 = (X.C74793cj) r8
            X.0ve r2 = r7.A0E
            r1 = 3181(0xc6d, float:4.458E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x06ef
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r8.setIcon((int) r0)
            r8.setVisibility(r6)
            X.0z4 r1 = r7.A0A
            X.1E7 r0 = r7.A0u
            X.1BI r0 = r0.A0J
            long r3 = r1.A0S(r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x06e0
            X.0vb r0 = r7.A0m
            java.util.Locale r1 = r0.A0N()
            r0 = 1
            java.text.DateFormat r2 = java.text.DateFormat.getDateInstance(r0, r1)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            java.lang.String r0 = r2.format(r0)
        L_0x05f2:
            r8.setDescription((java.lang.CharSequence) r0)
        L_0x05f5:
            r0 = 47
            X.C89944dH.A00(r8, r7, r0)
            r7.A4d()
        L_0x05fd:
            X.126 r2 = r7.A1A
            X.1EC r1 = r7.A1K
            X.1M9 r0 = r2.A08
            X.1E7 r0 = r0.A0G(r1)
            if (r0 != 0) goto L_0x06d6
            r0 = 0
        L_0x060a:
            r8 = 1
            int r9 = r0 + 1
            int r0 = r9 * 9
            int r0 = r0 / 10
            r2 = 8
            if (r5 <= r0) goto L_0x06cf
            if (r5 > r9) goto L_0x06cf
            boolean r0 = X.AnonymousClass3MZ.A1Z(r7)
            if (r0 == 0) goto L_0x06cf
            android.widget.TextView r0 = r7.A0E
            r0.setVisibility(r6)
            android.widget.TextView r4 = r7.A0E
            r3 = 2131893533(0x7f121d1d, float:1.9421845E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            int r0 = java.lang.Math.min(r5, r9)
            X.C17880vN.A1T(r1, r0, r6)
            X.C17880vN.A1T(r1, r9, r8)
            X.AnonymousClass3MY.A0y(r7, r4, r1, r3)
        L_0x0638:
            if (r5 == 0) goto L_0x06be
            boolean r0 = X.C72473Md.A1X(r7)
            if (r0 != 0) goto L_0x06be
            boolean r0 = X.C72473Md.A1W(r7)
            if (r0 != 0) goto L_0x06be
            X.126 r1 = r7.A1A
            X.1E7 r0 = r7.A0u
            int r0 = r1.A0I(r0)
            if (r0 == r8) goto L_0x06be
            android.view.View r0 = r7.A04
            r0.setVisibility(r6)
            int r1 = X.AnonymousClass3Ma.A04(r7)
            r0 = 3
            if (r1 != r0) goto L_0x06b8
            boolean r0 = X.AnonymousClass3MZ.A1Z(r7)
            if (r0 != 0) goto L_0x06b8
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r6)
        L_0x0667:
            r0 = 2131432072(0x7f0b1288, float:1.8485891E38)
            X.AnonymousClass3MX.A1H(r7, r0, r6)
        L_0x066d:
            X.10I r1 = r7.A05
            r0 = 16
            X.AnonymousClass3MY.A1U(r1, r7, r0)
            android.view.View r1 = r7.A00
            r0 = 2131431319(0x7f0b0f97, float:1.8484364E38)
            X.1bI r4 = X.C28931bI.A00(r1, r0)
            X.1E7 r3 = r7.A0u
            if (r3 == 0) goto L_0x06b4
            int r1 = X.AnonymousClass3Ma.A04(r7)
            r0 = 2
            if (r1 != r0) goto L_0x06b4
            boolean r0 = r3.A0n
            if (r0 == 0) goto L_0x06b4
            X.0ve r0 = r7.A0E
            boolean r0 = X.AnonymousClass3MX.A1Z(r0)
            if (r0 == 0) goto L_0x06b4
            android.view.View r1 = X.AnonymousClass3MY.A0I(r4, r6)
            r0 = 7
            X.AnonymousClass3MY.A1E(r1, r7, r4, r0)
        L_0x069c:
            X.2H8 r1 = r7.A32()
            if (r1 == 0) goto L_0x06ae
            if (r5 <= 0) goto L_0x06ae
            int r0 = X.C64002u3.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
        L_0x06ae:
            java.lang.String r0 = "update_group_participants"
            r7.A3C(r0)
            return
        L_0x06b4:
            r4.A04(r2)
            goto L_0x069c
        L_0x06b8:
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r2)
            goto L_0x0667
        L_0x06be:
            android.view.View r0 = r7.A04
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.A0B
            r0.setVisibility(r2)
            r0 = 2131432072(0x7f0b1288, float:1.8485891E38)
            X.AnonymousClass3MX.A1H(r7, r0, r2)
            goto L_0x066d
        L_0x06cf:
            android.widget.TextView r0 = r7.A0E
            r0.setVisibility(r2)
            goto L_0x0638
        L_0x06d6:
            X.1MZ r0 = r2.A0O
            int r0 = r0.A02(r1)
            int r0 = r0 + -1
            goto L_0x060a
        L_0x06e0:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05f5
            r0 = 2131890998(0x7f121336, float:1.9416704E38)
            java.lang.String r0 = r7.getString(r0)
            goto L_0x05f2
        L_0x06ef:
            r0 = 8
            r8.setVisibility(r0)
            goto L_0x05fd
        L_0x06f6:
            java.lang.Object r0 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r0 = (com.whatsapp.group.GroupChatInfoActivity) r0
            java.util.Map r8 = (java.util.Map) r8
            X.3Ox r1 = r0.A14
        L_0x06fe:
            java.util.Map r0 = r1.A05
            r0.clear()
            r0.putAll(r8)
            r1.notifyDataSetChanged()
            return
        L_0x070a:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            android.app.Activity r1 = X.AnonymousClass1L9.A00(r0)
            X.1FU r1 = (X.AnonymousClass1FU) r1
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L_0x0723
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r1.CNA(r0)
            return
        L_0x0723:
            r1.CEx()
            return
        L_0x0727:
            java.lang.Object r4 = r14.A01
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.3oH r3 = r4.A0W
            android.view.View r2 = r4.A01
            android.widget.LinearLayout r1 = r4.A0A
            X.3Ox r0 = r4.A14
            r3.A0H(r2, r1, r0)
            X.3TV r2 = r4.A16
            r0 = 0
            r2.A01 = r0
            X.1DT r1 = r2.A02
            boolean r0 = r2.A00
            boolean r0 = X.AnonymousClass000.A1O(r0)
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1bI r0 = r4.A0O
            android.view.View r0 = r0.A02()
            X.C17960vV.A05(r0)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x075a
            X.3oS r0 = r4.A1G
            r0.A0T()
        L_0x075a:
            java.lang.String r0 = "GroupChatInfoActivity/updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0760:
            java.lang.Object r1 = r14.A01
            com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase r1 = (com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase) r1
            java.util.Set r8 = (java.util.Set) r8
            r0 = 1
            X.C18070vi.A0d(r8, r0)
            boolean r0 = r1 instanceof com.whatsapp.gallery.selectedmedia.SelectedMediaStripFragment
            if (r0 == 0) goto L_0x077c
            com.whatsapp.gallery.selectedmedia.SelectedMediaStripFragment r1 = (com.whatsapp.gallery.selectedmedia.SelectedMediaStripFragment) r1
            X.0vl r0 = r1.A00
        L_0x0772:
            java.lang.Object r0 = r0.getValue()
            X.5l8 r0 = (X.C112225l8) r0
            r0.A0V(r8)
            return
        L_0x077c:
            com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment r1 = (com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment) r1
            X.0vl r0 = r1.A0C
            goto L_0x0772
        L_0x0781:
            java.lang.Object r0 = r14.A01
            com.whatsapp.events.EventCreateOrEditFragment r0 = (com.whatsapp.events.EventCreateOrEditFragment) r0
            android.content.DialogInterface r8 = (android.content.DialogInterface) r8
            X.3VY r5 = r0.A0M
            if (r5 != 0) goto L_0x0792
            java.lang.String r0 = "eventCreateOrEditViewModel"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0792:
            X.23z r4 = r5.A0T()
            if (r4 == 0) goto L_0x07c2
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x07c6
            X.1G1 r0 = r5.A0O
            java.lang.Object r0 = r0.getValue()
            X.4YY r0 = (X.AnonymousClass4YY) r0
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x07c6
            X.1OX r3 = X.C41561wd.A00(r5)
            X.0wl r1 = r5.A0J
            r2 = 0
            com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCancel$1 r0 = new com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCancel$1
            r0.<init>(r4, r5, r2)
            java.lang.Integer r1 = X.AnonymousClass3MW.A0w(r1, r0, r3)
            X.4Tc r0 = new X.4Tc
            r0.<init>(r1, r2)
            X.AnonymousClass3VY.A04(r0, r5)
        L_0x07c2:
            r8.dismiss()
            return
        L_0x07c6:
            X.AnonymousClass3VY.A00(r4, r5)
            goto L_0x07c2
        L_0x07ca:
            java.lang.Object r0 = r14.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x07d0:
            java.lang.Object r0 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.lang.String r8 = (java.lang.String) r8
            X.1rK r0 = r0.A1M
            r0.setContentIndicatorText(r8)
            return
        L_0x07dc:
            java.lang.Object r0 = r14.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            java.util.List r8 = (java.util.List) r8
            com.whatsapp.conversationslist.ConversationsFragment.A0n(r0, r8)
            return
        L_0x07e6:
            java.lang.Object r0 = r14.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.1GP r1 = X.AnonymousClass3MW.A0K(r0)
            java.lang.String r0 = "search_fragment_conversation"
            androidx.fragment.app.Fragment r0 = r1.A0Q(r0)
            com.whatsapp.conversation.ConversationSearchFragment r0 = (com.whatsapp.conversation.ConversationSearchFragment) r0
            r0.A26()
            return
        L_0x07fa:
            java.lang.Object r3 = r14.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.4Ud r8 = (X.C87064Ud) r8
            r3.A2P()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "conversation/search/ first-visible:"
            r1.append(r0)
            com.whatsapp.conversation.ConversationListView r0 = r3.A2B
            int r0 = r0.getFirstVisiblePosition()
            r1.append(r0)
            java.lang.String r0 = " header-count:"
            r1.append(r0)
            com.whatsapp.conversation.ConversationListView r0 = r3.A2B
            int r0 = r0.getHeaderViewsCount()
            r1.append(r0)
            java.lang.String r0 = " searchData:"
            X.C17900vP.A0Y(r8, r0, r1)
            X.49e r0 = r3.A2D
            X.C17890vO.A0t(r0)
            X.1BI r0 = r3.A3R
            boolean r1 = X.C22971Dz.A0V(r0)
            X.4MT r0 = r3.A2N
            if (r1 == 0) goto L_0x0861
            X.1W1 r11 = r0.A01
        L_0x0839:
            X.5cQ r0 = r3.A2Q
            X.11P r9 = r0.getTime()
            X.1NJ r12 = r3.A33
            X.5cQ r0 = r3.A2Q
            X.122 r10 = r0.getCoreMessageStore()
            X.1W6 r13 = r0.getFMessageDatabase()
            X.5cQ r7 = r3.A2Q
            X.49e r6 = new X.49e
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3.A2D = r6
            X.10I r2 = X.AnonymousClass3MX.A0w(r3)
            X.49e r1 = r3.A2D
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.CGM(r1, r0)
            return
        L_0x0861:
            X.1QB r11 = r0.A00
            goto L_0x0839
        L_0x0864:
            java.lang.Object r0 = r14.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.AnonymousClass4aY.A0s(r0)
            return
        L_0x086c:
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r0 = "contact"
            X.AnonymousClass3MY.A12(r1, r9, r0)
            X.C72453Mb.A16(r2, r1)
            return
        L_0x0879:
            int r0 = r8.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.setText(r0)
            r4 = 2
            float[] r1 = new float[r4]
            r1 = {1065353216, 1066192077} // fill-array
            java.lang.String r0 = "scaleX"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            float[] r1 = new float[r4]
            r1 = {1065353216, 1066192077} // fill-array
            java.lang.String r0 = "scaleY"
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofFloat(r0, r1)
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r4]
            r0 = 0
            r1[r0] = r3
            r3 = 1
            r1[r3] = r2
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r5, r1)
            r0 = 100
            r2.setDuration(r0)
            r2.setRepeatCount(r3)
            r2.setRepeatMode(r4)
            r2.start()
            return
        L_0x08b6:
            X.1E7 r0 = r8.A04
            X.1BI r1 = r0.A0J
            r0 = 0
            r3.A2E(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91604fx.Bo9(java.lang.Object):void");
    }

    public C91604fx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, int i) {
        r2.A0A(r1, new C91604fx(r1, i));
    }
}
