package X;

import android.view.View;

/* renamed from: X.4dH  reason: invalid class name and case insensitive filesystem */
public class C89944dH implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89944dH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89944dH(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0261, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0263, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0266, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0350, code lost:
        r0 = "mediaSharingUserJourneyLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x037b, code lost:
        r0 = (com.whatsapp.gallery.viewmodel.GalleryTabsViewModel) r0.getValue();
        r2 = r0.A05;
        r0 = (java.lang.Iterable) r0.A06.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038b, code lost:
        if (r0 == null) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038d, code lost:
        r1 = X.C29431cG.A0t(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0391, code lost:
        r2.A0F(new X.AnonymousClass7HI(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0399, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x039a, code lost:
        r1 = X.C18460wS.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0414, code lost:
        r2.A01(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0417, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x044f, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0453, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0537, code lost:
        r3.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x053a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        if (r2.A01() == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e8, code lost:
        r0.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01eb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f7, code lost:
        r2.A0A = r0;
        r1 = r2.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fb, code lost:
        if (r1 == null) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fd, code lost:
        r1.setChecked(!r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0202, code lost:
        r1 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0204, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        r0 = r2.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0208, code lost:
        r1.setChecked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0259;
                case 1: goto L_0x0250;
                case 2: goto L_0x0470;
                case 3: goto L_0x045e;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0440;
                case 8: goto L_0x020c;
                case 9: goto L_0x01f2;
                case 10: goto L_0x01ec;
                case 11: goto L_0x0438;
                case 12: goto L_0x0438;
                case 13: goto L_0x0438;
                case 14: goto L_0x042d;
                case 15: goto L_0x0421;
                case 16: goto L_0x0438;
                case 17: goto L_0x0005;
                case 18: goto L_0x03fb;
                case 19: goto L_0x03d4;
                case 20: goto L_0x0005;
                case 21: goto L_0x03bd;
                case 22: goto L_0x039d;
                case 23: goto L_0x01c9;
                case 24: goto L_0x01b7;
                case 25: goto L_0x0354;
                case 26: goto L_0x0197;
                case 27: goto L_0x014d;
                case 28: goto L_0x0311;
                case 29: goto L_0x0142;
                case 30: goto L_0x0137;
                case 31: goto L_0x02f3;
                case 32: goto L_0x02d2;
                case 33: goto L_0x0101;
                case 34: goto L_0x0017;
                case 35: goto L_0x02ca;
                case 36: goto L_0x0005;
                case 37: goto L_0x00c6;
                case 38: goto L_0x02b2;
                case 39: goto L_0x00ba;
                case 40: goto L_0x02aa;
                case 41: goto L_0x028d;
                case 42: goto L_0x000b;
                case 43: goto L_0x0277;
                case 44: goto L_0x026f;
                case 45: goto L_0x009a;
                case 46: goto L_0x0267;
                case 47: goto L_0x0512;
                case 48: goto L_0x0067;
                case 49: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            X.AnonymousClass3MW.A1V(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r1 = r12.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            goto L_0x0208
        L_0x0017:
            java.lang.Object r0 = r12.A01
            X.3Z9 r0 = (X.AnonymousClass3Z9) r0
            X.AnonymousClass3MX.A1O(r0)
            X.0vk r0 = r0.A00
            goto L_0x0263
        L_0x0022:
            java.lang.Object r3 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.00H r0 = r3.A26
            java.lang.Object r1 = r0.get()
            X.2kV r1 = (X.C58322kV) r1
            X.1E7 r0 = r3.A0u
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x000a
            X.00H r0 = r3.A27
            java.lang.Object r2 = r0.get()
            X.6lQ r2 = (X.C131636lQ) r2
            X.1EC r0 = r3.A4l()
            java.lang.String r1 = r0.getRawString()
            r0 = 0
            r2.A00(r0, r1)
            X.1EC r2 = r3.A4l()
            android.content.Intent r4 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity"
            r4.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A13(r4, r2, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r4.addFlags(r0)
            goto L_0x0537
        L_0x0067:
            java.lang.Object r2 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.3zh r1 = r2.A10
            if (r1 == 0) goto L_0x0075
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A03 = r0
        L_0x0075:
            boolean r0 = X.AnonymousClass3MZ.A1a(r2)
            if (r0 == 0) goto L_0x000a
            boolean r0 = X.C72473Md.A1X(r2)
            if (r0 != 0) goto L_0x000a
            boolean r0 = X.C72473Md.A1W(r2)
            if (r0 != 0) goto L_0x000a
            boolean r0 = X.AnonymousClass3MZ.A1Z(r2)
            if (r0 != 0) goto L_0x047e
            X.1E7 r0 = r2.A0u
            boolean r0 = r0.A13
            if (r0 == 0) goto L_0x047e
            r0 = 2131890328(0x7f121098, float:1.9415345E38)
            r2.BhQ(r0)
            return
        L_0x009a:
            java.lang.Object r3 = r12.A01
            com.whatsapp.group.GroupAdminPickerActivity r3 = (com.whatsapp.group.GroupAdminPickerActivity) r3
            java.lang.Object r0 = r13.getTag()
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x000a
            java.lang.Object r2 = r13.getTag()
            X.1BI r2 = (X.AnonymousClass1BI) r2
            X.1MZ r1 = r3.A0B
            X.1EC r0 = r3.A0E
            X.1DT r1 = r1.A03(r2, r0)
            r0 = 19
            X.C91604fx.A00(r3, r1, r0)
            return
        L_0x00ba:
            java.lang.Object r0 = r12.A01
            X.DOr r0 = (X.C26995DOr) r0
            X.E9o r0 = r0.A02
            if (r0 == 0) goto L_0x000a
            r0.Byg()
            return
        L_0x00c6:
            java.lang.Object r4 = r12.A01
            com.whatsapp.glasses.SUPBottomSheetView r4 = (com.whatsapp.glasses.SUPBottomSheetView) r4
            X.3RV r0 = r4.A01
            if (r0 == 0) goto L_0x00e1
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A05
            if (r3 == 0) goto L_0x00e1
            X.Cpd r2 = X.C25970Cpd.A03
            r1 = 2131886084(0x7f120004, float:1.9406737E38)
            java.lang.String r0 = "__external__sup_bottom_sheet_nux_finish_button"
            r2.A01(r3, r1, r0)
            r0 = 36
            A00(r3, r4, r0)
        L_0x00e1:
            X.3RV r3 = r4.A01
            if (r3 == 0) goto L_0x000a
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r1 = 1
            X.4eW r0 = new X.4eW
            r0.<init>(r3, r1)
            r2.setAnimationListener(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A03
            r0.startAnimation(r2)
            return
        L_0x0101:
            java.lang.Object r3 = r12.A01
            X.5z4 r3 = (X.C117015z4) r3
            X.6q9 r2 = r3.A0A
            if (r2 == 0) goto L_0x0110
            boolean r0 = r2.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0111
        L_0x0110:
            r1 = 0
        L_0x0111:
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x012f
            int r0 = r3.A00
            if (r0 != 0) goto L_0x012f
            if (r1 == 0) goto L_0x012f
            r3.A0F()
            java.lang.String r0 = "contextual_suggestion"
            r3.A0O(r0)
        L_0x0125:
            if (r2 == 0) goto L_0x000a
            X.6uM r0 = r2.A0G
            if (r0 == 0) goto L_0x000a
            r0.A00()
            return
        L_0x012f:
            android.view.View$OnClickListener r0 = r3.A0I
            r0.onClick(r13)
            if (r1 == 0) goto L_0x000a
            goto L_0x0125
        L_0x0137:
            java.lang.Object r0 = r12.A01
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A28()
            X.0vk r0 = r0.A00
            goto L_0x0261
        L_0x0142:
            java.lang.Object r0 = r12.A01
            com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment r0 = (com.whatsapp.gallery.dialogs.GalleryPartialPermissionBottomSheetFragment) r0
            r0.A28()
            X.0vk r0 = r0.A01
            goto L_0x0261
        L_0x014d:
            java.lang.Object r4 = r12.A01
            X.3Zc r4 = (X.C74253Zc) r4
            X.206 r0 = r4.A00
            if (r0 == 0) goto L_0x000a
            com.whatsapp.gallery.LinksGalleryFragment r3 = r4.A0A
            X.5cR r0 = X.C72453Mb.A0j(r3)
            boolean r0 = r0.Bcq()
            if (r0 == 0) goto L_0x016d
            X.5cR r1 = X.C72453Mb.A0j(r3)
            X.206 r0 = r4.A00
            r1.CPY(r0)
            X.3XJ r0 = r3.A0A
            goto L_0x01e8
        L_0x016d:
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000a
            X.6lM r1 = r3.A07
            r0 = 3
            r1.A00(r0)
            java.util.Set r0 = r4.A02
            if (r0 == 0) goto L_0x048a
            X.1FL r3 = r3.A1D()
            X.1FU r3 = (X.AnonymousClass1FU) r3
            java.lang.String r2 = r4.A01
            java.util.Set r1 = r4.A02
            X.206 r0 = r4.A00
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            com.whatsapp.SuspiciousLinkWarningDialogFragment r0 = X.C123646Vg.A00(r2, r0, r1)
            r3.CMl(r0)
            return
        L_0x0197:
            java.lang.Object r5 = r12.A01
            X.3Zc r5 = (X.C74253Zc) r5
            X.206 r0 = r5.A00
            if (r0 == 0) goto L_0x000a
            com.whatsapp.gallery.LinksGalleryFragment r4 = r5.A0A
            X.5cR r0 = X.C72453Mb.A0j(r4)
            boolean r0 = r0.Bcq()
            if (r0 == 0) goto L_0x04b6
            X.5cR r1 = X.C72453Mb.A0j(r4)
            X.206 r0 = r5.A00
            r1.CPY(r0)
            X.3XJ r0 = r4.A0A
            goto L_0x01e8
        L_0x01b7:
            java.lang.Object r1 = r12.A01
            com.whatsapp.gallery.GalleryTabHostFragment r1 = (com.whatsapp.gallery.GalleryTabHostFragment) r1
            boolean r0 = r1.A0g
            if (r0 == 0) goto L_0x000a
            X.7DY r0 = com.whatsapp.gallery.GalleryTabHostFragment.A05(r1)
            if (r0 == 0) goto L_0x04eb
            r0.A0u()
            return
        L_0x01c9:
            java.lang.Object r3 = r12.A01
            X.3ZX r3 = (X.AnonymousClass3ZX) r3
            X.21i r0 = r3.A00
            if (r0 == 0) goto L_0x000a
            com.whatsapp.gallery.DocumentsGalleryFragment r2 = r3.A0B
            X.5cR r0 = X.C72453Mb.A0j(r2)
            boolean r0 = r0.Bcq()
            if (r0 == 0) goto L_0x04f0
            X.5cR r1 = X.C72453Mb.A0j(r2)
            X.21i r0 = r3.A00
            r1.CPY(r0)
            X.3XJ r0 = r2.A0A
        L_0x01e8:
            r0.notifyDataSetChanged()
            return
        L_0x01ec:
            java.lang.Object r2 = r12.A01
            com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet r2 = (com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet) r2
            r0 = 0
            goto L_0x01f7
        L_0x01f2:
            java.lang.Object r2 = r12.A01
            com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet r2 = (com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet) r2
            r0 = 1
        L_0x01f7:
            r2.A0A = r0
            android.widget.RadioButton r1 = r2.A02
            if (r1 == 0) goto L_0x0202
            r0 = r0 ^ 1
            r1.setChecked(r0)
        L_0x0202:
            android.widget.RadioButton r1 = r2.A01
            if (r1 == 0) goto L_0x000a
            boolean r0 = r2.A0A
        L_0x0208:
            r1.setChecked(r0)
            return
        L_0x020c:
            java.lang.Object r2 = r12.A01
            com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet r2 = (com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet) r2
            android.os.Bundle r1 = r2.A06
            r5 = 0
            if (r1 == 0) goto L_0x0235
            java.lang.String r0 = "flow_id"
            java.lang.String r4 = r1.getString(r0)
        L_0x021b:
            android.os.Bundle r1 = r2.A06
            if (r1 == 0) goto L_0x0233
            java.lang.String r0 = "message_row_id"
            long r0 = r1.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0229:
            com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel r3 = r2.A08
            if (r3 != 0) goto L_0x0237
            java.lang.String r0 = "flowsDownloadResponseViewModel"
            X.C18070vi.A11(r0)
            throw r5
        L_0x0233:
            r0 = r5
            goto L_0x0229
        L_0x0235:
            r4 = r5
            goto L_0x021b
        L_0x0237:
            if (r4 == 0) goto L_0x000a
            if (r0 == 0) goto L_0x000a
            long r6 = r0.longValue()
            boolean r8 = r2.A0A
            X.1OX r1 = X.C41561wd.A00(r3)
            X.0wl r0 = r3.A03
            com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel$downloadAllResponses$1 r2 = new com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel$downloadAllResponses$1
            r2.<init>(r3, r4, r5, r6, r8)
            X.AnonymousClass3MW.A1X(r0, r2, r1)
            return
        L_0x0250:
            java.lang.Object r1 = r12.A01
            X.61E r1 = (X.AnonymousClass61E) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A03
            goto L_0x0261
        L_0x0259:
            java.lang.Object r1 = r12.A01
            X.61E r1 = (X.AnonymousClass61E) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A04
        L_0x0261:
            if (r0 == 0) goto L_0x000a
        L_0x0263:
            r0.invoke()
            return
        L_0x0267:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupChangedParticipantsBottomSheet r0 = (com.whatsapp.group.GroupChangedParticipantsBottomSheet) r0
            com.whatsapp.group.GroupChangedParticipantsBottomSheet.A00(r0)
            return
        L_0x026f:
            java.lang.Object r0 = r12.A01
            com.whatsapp.group.GroupAdminPickerActivity r0 = (com.whatsapp.group.GroupAdminPickerActivity) r0
            com.whatsapp.group.GroupAdminPickerActivity.A0Q(r0)
            return
        L_0x0277:
            java.lang.Object r2 = r12.A01
            X.3gA r2 = (X.AnonymousClass3gA) r2
            X.129 r1 = r2.A07
            java.lang.String r0 = "515115256843064"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A1p(r0)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x028d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            com.whatsapp.WaViewPager r1 = r0.A02
            if (r1 != 0) goto L_0x0299
            java.lang.String r0 = "viewPager"
            goto L_0x044f
        L_0x0299:
            java.lang.Integer r0 = X.C17880vN.A0h()
            android.view.View r0 = r1.findViewWithTag(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            X.C18070vi.A0b(r0)
            X.C181779Ru.A00(r0)
            return
        L_0x02aa:
            java.lang.Object r0 = r12.A01
            com.whatsapp.greenalert.GreenAlertActivity r0 = (com.whatsapp.greenalert.GreenAlertActivity) r0
            com.whatsapp.greenalert.GreenAlertActivity.A03(r0)
            return
        L_0x02b2:
            java.lang.Object r1 = r12.A01
            X.DOr r1 = (X.C26995DOr) r1
            X.17x r0 = r1.A0J
            boolean r0 = X.C40811vJ.A0N(r0)
            if (r0 == 0) goto L_0x02c2
            X.C26995DOr.A03(r1)
            return
        L_0x02c2:
            X.1wy r1 = r1.A0P
            X.Bym r0 = X.C24289Bym.CALL_NEEDS_BLUETOOTH_PERMISSIONS
            r1.A0F(r0)
            return
        L_0x02ca:
            java.lang.Object r0 = r12.A01
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            com.whatsapp.gifsearch.GifSearchContainer.setupSearchContainer$lambda$4$lambda$2(r0, r13)
            return
        L_0x02d2:
            java.lang.Object r3 = r12.A01
            com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase r3 = (com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase) r3
            java.lang.Integer r0 = X.C72473Md.A0c(r3)
            if (r0 == 0) goto L_0x02ef
            int r2 = r0.intValue()
            X.00H r0 = r3.A03
            if (r0 == 0) goto L_0x0350
            java.lang.Object r1 = r0.get()
            X.A4v r1 = (X.C20050A4v) r1
            r0 = 13
            X.C72463Mc.A1F(r1, r0, r2)
        L_0x02ef:
            X.0vl r0 = r3.A06
            goto L_0x037b
        L_0x02f3:
            java.lang.Object r2 = r12.A01
            com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment r2 = (com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment) r2
            X.74J r0 = X.C72463Mc.A0d(r2)
            boolean r0 = r0.A0U()
            r1 = r0 ^ 1
            r2.A08 = r1
            X.3Rg r0 = r2.A09
            r0.A06(r1)
            X.74J r1 = X.C72463Mc.A0d(r2)
            r0 = 0
            r1.A0O(r0, r0)
            return
        L_0x0311:
            java.lang.Object r3 = r12.A01
            com.whatsapp.gallery.NewMediaPickerFragment r3 = (com.whatsapp.gallery.NewMediaPickerFragment) r3
            X.00H r0 = r3.A0F
            if (r0 == 0) goto L_0x0350
            java.lang.Object r2 = r0.get()
            X.A4v r2 = (X.C20050A4v) r2
            r0 = 13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2.A02(r1, r0, r0)
            java.util.Set r0 = r3.A05
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0333:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0347
            java.lang.Object r0 = r1.next()
            X.8B2 r0 = (X.AnonymousClass8B2) r0
            android.net.Uri r0 = r0.BLl()
            r2.add(r0)
            goto L_0x0333
        L_0x0347:
            java.util.Set r1 = X.C29431cG.A12(r2)
            r0 = 0
            r3.A2K(r0, r1)
            return
        L_0x0350:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            goto L_0x044f
        L_0x0354:
            java.lang.Object r3 = r12.A01
            com.whatsapp.gallery.GalleryTabHostFragment r3 = (com.whatsapp.gallery.GalleryTabHostFragment) r3
            X.0vl r0 = r3.A0n
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r0 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r0
            java.lang.Integer r0 = r0.A0T()
            if (r0 == 0) goto L_0x0379
            int r2 = r0.intValue()
            X.00H r0 = r3.A27()
            java.lang.Object r1 = r0.get()
            X.A4v r1 = (X.C20050A4v) r1
            r0 = 13
            X.C72463Mc.A1F(r1, r0, r2)
        L_0x0379:
            X.0vl r0 = r3.A0o
        L_0x037b:
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.gallery.viewmodel.GalleryTabsViewModel r0 = (com.whatsapp.gallery.viewmodel.GalleryTabsViewModel) r0
            X.1DT r2 = r0.A05
            X.1DT r0 = r0.A06
            java.lang.Object r0 = r0.A06()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x039a
            java.util.List r1 = X.C29431cG.A0t(r0)
        L_0x0391:
            X.7HI r0 = new X.7HI
            r0.<init>(r1)
            r2.A0F(r0)
            return
        L_0x039a:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x0391
        L_0x039d:
            java.lang.Object r3 = r12.A01
            X.8Dk r3 = (X.AnonymousClass8Dk) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r3.getWaIntents()
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.framework.alerts.ui.AlertCardListActivity"
            r2.setClassName(r1, r0)
            X.AnonymousClass3MY.A11(r2, r3)
            return
        L_0x03bd:
            java.lang.Object r1 = r12.A01
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment r1 = (com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment) r1
            r0 = 8
            com.whatsapp.fmx.FMXSafetyTipsBottomSheetFragment.A00(r1, r0)
            X.1o3 r2 = r1.A02
            if (r2 == 0) goto L_0x03d1
            X.1FL r1 = r1.A1D()
            java.lang.String r0 = "how-to-stay-safe-on-wa"
            goto L_0x0414
        L_0x03d1:
            java.lang.String r0 = "contextualHelpHandler"
            goto L_0x044f
        L_0x03d4:
            java.lang.Object r4 = r12.A01
            com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment r4 = (com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment) r4
            X.1LU r0 = r4.A04
            if (r0 == 0) goto L_0x03f8
            android.content.Context r0 = r4.A14()
            java.lang.String r3 = "privacy_groupadd"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsPrivacy"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "target_setting"
            r2.putExtra(r0, r3)
            r4.A1k(r2)
            return
        L_0x03f8:
            java.lang.String r0 = "waIntents"
            goto L_0x044f
        L_0x03fb:
            java.lang.Object r4 = r12.A01
            com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment r4 = (com.whatsapp.fmx.FMXGroupSafetyTipsBottomSheetFragment) r4
            X.4VE r2 = r4.A03
            if (r2 == 0) goto L_0x041e
            r3 = 0
            r1 = 8
            r0 = 1
            r2.A02(r3, r3, r1, r0)
            X.1o3 r2 = r4.A01
            if (r2 == 0) goto L_0x0418
            X.1FL r1 = r4.A1D()
            java.lang.String r0 = "how-to-stay-safe-on-wa-groups"
        L_0x0414:
            r2.A01(r1, r0)
            return
        L_0x0418:
            java.lang.String r0 = "contextualHelpHandler"
            X.C18070vi.A11(r0)
            throw r3
        L_0x041e:
            java.lang.String r0 = "fmxManager"
            goto L_0x044f
        L_0x0421:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            r0.finish()
            return
        L_0x042d:
            java.lang.Object r0 = r12.A01
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity r0 = (com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity) r0
            com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity.A03(r0)
            r0.finish()
            return
        L_0x0438:
            java.lang.Object r0 = r12.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A29()
            return
        L_0x0440:
            java.lang.Object r3 = r12.A01
            X.3yN r3 = (X.C80923yN) r3
            X.AnonymousClass3MX.A1O(r3)
            X.5bo r2 = r3.A02
            X.4nD r0 = r3.A00
            if (r0 != 0) goto L_0x0454
            java.lang.String r0 = "row"
        L_0x044f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0454:
            X.2rT r1 = r0.A01
            int r0 = r3.A05()
            r2.Bty(r1, r0)
            return
        L_0x045e:
            java.lang.Object r4 = r12.A01
            X.4qw r4 = (X.C98324qw) r4
            X.1OX r3 = r4.A06
            X.0wl r2 = r4.A05
            r1 = 0
            com.whatsapp.favorite.OnDeleteFavoritesCallback$showSnackBar$snackBar$1$1 r0 = new com.whatsapp.favorite.OnDeleteFavoritesCallback$showSnackBar$snackBar$1$1
            r0.<init>(r4, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x0470:
            java.lang.Object r1 = r12.A01
            X.61I r1 = (X.AnonymousClass61I) r1
            java.util.List r0 = X.C42011xT.A0I
            X.88B r2 = r1.A09
            r1 = -1
            r0 = 0
            r2.C6w(r0, r0, r0, r1)
            return
        L_0x047e:
            r0 = 7
            X.AnonymousClass4Yv.A01(r2, r0)
            X.1Co r1 = r2.A0p
            X.1EC r0 = r2.A1K
            r1.A06(r0)
            return
        L_0x048a:
            X.00H r0 = r3.A0B
            r0.get()
            java.lang.String r0 = r4.A01
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = X.AnonymousClass1LU.A1p(r0)
            android.content.Context r0 = r3.A14()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.android.browser.application_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "create_new_tab"
            r0 = 1
            r2.putExtra(r1, r0)
            X.1L9 r1 = r3.A00
            android.content.Context r0 = r3.A14()
            r1.A08(r0, r2)
            return
        L_0x04b6:
            X.00H r0 = r4.A0B
            java.lang.Object r2 = r0.get()
            X.1LU r2 = (X.AnonymousClass1LU) r2
            android.content.Context r1 = r4.A14()
            X.206 r0 = r5.A00
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            android.content.Intent r3 = X.AnonymousClass3MY.A06(r1, r2, r0)
            X.206 r0 = r5.A00
            long r1 = r0.A0x
            java.lang.String r0 = "row_id"
            r3.putExtra(r0, r1)
            X.206 r0 = r5.A00
            long r1 = r0.A0y
            java.lang.String r0 = "sort_id"
            r3.putExtra(r0, r1)
            X.206 r0 = r5.A00
            X.205 r0 = r0.A0v
            X.AnonymousClass4aU.A00(r3, r0)
            X.11P r0 = r4.A03
            X.C137086ut.A00(r3, r4, r0)
            return
        L_0x04eb:
            r0 = 1
            com.whatsapp.gallery.GalleryTabHostFragment.A0h(r1, r0)
            return
        L_0x04f0:
            X.00H r0 = r2.A08
            java.lang.Object r9 = r0.get()
            X.6zi r9 = (X.C139956zi) r9
            X.1KB r6 = r2.A02
            X.190 r4 = r2.A01
            X.10I r11 = r2.A0F
            X.1gp r7 = r2.A06
            X.1FL r5 = r2.A1D()
            X.1FU r5 = (X.AnonymousClass1FU) r5
            X.21i r8 = r3.A00
            X.1L9 r3 = r2.A00
            X.1DC r10 = r2.A07
            X.747 r2 = X.C62272r8.A04
            r2.A0A(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0512:
            java.lang.Object r3 = r12.A01
            com.whatsapp.group.GroupChatInfoActivity r3 = (com.whatsapp.group.GroupChatInfoActivity) r3
            X.1Pv r2 = r3.A1B
            X.1EC r1 = r3.A1K
            X.1E7 r0 = r3.A0u
            boolean r0 = r2.A01(r0, r1)
            if (r0 == 0) goto L_0x053b
            X.1EC r5 = r3.A1K
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.expiringgroups.ChangeExpiringGroupsSettingActivity"
            android.content.Intent r4 = r2.setClassName(r1, r0)
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r4, r5, r0)
        L_0x0537:
            r3.startActivity(r4)
            return
        L_0x053b:
            r1 = 2131889945(0x7f120f19, float:1.9414568E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r1, r0)
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89944dH.onClick(android.view.View):void");
    }
}
