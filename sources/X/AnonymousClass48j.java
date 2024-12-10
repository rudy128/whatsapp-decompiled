package X;

import android.view.View;

/* renamed from: X.48j  reason: invalid class name */
public class AnonymousClass48j extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass48j(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new AnonymousClass48j(obj, obj2, obj3, i));
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [X.23S, X.206] */
    /* JADX WARNING: type inference failed for: r1v76, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x06ad, code lost:
        r1 = X.AnonymousClass1LU.A0r(r2, r1, r0);
        r0 = X.AnonymousClass3Ma.A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x06b5, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x06b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0708, code lost:
        r5.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x070b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0434, code lost:
        r1.CMk(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0437, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r17) {
        /*
            r16 = this;
            r4 = r17
            r9 = r16
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0766;
                case 1: goto L_0x074c;
                case 2: goto L_0x0242;
                case 3: goto L_0x0726;
                case 4: goto L_0x070c;
                case 5: goto L_0x06e4;
                case 6: goto L_0x06b9;
                case 7: goto L_0x06a0;
                case 8: goto L_0x0692;
                case 9: goto L_0x0673;
                case 10: goto L_0x0656;
                case 11: goto L_0x0623;
                case 12: goto L_0x05fc;
                case 13: goto L_0x05ad;
                case 14: goto L_0x058f;
                case 15: goto L_0x056b;
                case 16: goto L_0x0537;
                case 17: goto L_0x0214;
                case 18: goto L_0x0140;
                case 19: goto L_0x00fe;
                case 20: goto L_0x04df;
                case 21: goto L_0x04aa;
                case 22: goto L_0x0499;
                case 23: goto L_0x00df;
                case 24: goto L_0x0472;
                case 25: goto L_0x0074;
                case 26: goto L_0x0438;
                case 27: goto L_0x0409;
                case 28: goto L_0x03dd;
                case 29: goto L_0x030a;
                case 30: goto L_0x02e1;
                case 31: goto L_0x02cb;
                case 32: goto L_0x0022;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r9.A02
            if (r1 == 0) goto L_0x001a
            java.lang.Object r0 = r9.A03
            X.4eK r0 = (X.C90594eK) r0
            X.Bik r0 = r0.A01
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x001a
            r0.remove(r1)
        L_0x001a:
            java.lang.Object r0 = r9.A01
            X.1rL r0 = (X.C38471rL) r0
            r0.A04(r4)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r2 = r9.A03
            X.5nB r2 = (X.C113495nB) r2
            android.widget.ImageView r1 = r2.A06
            r0 = 0
            r1.setContentDescription(r0)
            android.widget.LinearLayout r0 = r2.A09
            r0.requestFocus()
            java.lang.Object r0 = r9.A01
            X.6IH r0 = (X.AnonymousClass6IH) r0
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r4 = r0.A01
            X.00H r0 = r4.A0E
            java.lang.Object r2 = r0.get()
            X.A59 r2 = (X.A59) r2
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2.A03(r1, r0, r0)
            java.lang.Object r5 = r9.A02
            X.725 r5 = (X.AnonymousClass725) r5
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0021
            X.1SB r3 = r4.A0A
            X.10I r2 = r3.A0C
            r1 = 25
            X.7RQ r0 = new X.7RQ
            r0.<init>(r3, r5, r1)
            r2.CGF(r0)
            X.00H r0 = r4.A0G
            java.lang.Object r4 = r0.get()
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = (com.whatsapp.stickers.stickerpack.StickerPackDownloader) r4
            java.lang.Integer r7 = X.C17880vN.A0i()
            r6 = 0
            r11 = 0
            r9 = r6
            r10 = r6
            r8 = r6
            r4.A02(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0074:
            java.lang.Object r3 = r9.A03
            com.whatsapp.info.views.EncryptionInfoView r3 = (com.whatsapp.info.views.EncryptionInfoView) r3
            X.1MZ r0 = r3.getGroupParticipantsManager$app_productinfra_chat_chat()
            java.lang.Object r6 = r9.A01
            X.1E9 r6 = (X.AnonymousClass1E9) r6
            boolean r0 = r0.A0M(r6)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00b5
            X.00H r0 = r3.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat()
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.12G> r0 = X.AnonymousClass12G.class
            r1.A01(r0)
            r0 = 4
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r2 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A00(r0)
            X.1FU r1 = r3.A03
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r1.CMk(r2, r0)
        L_0x00a8:
            java.lang.Object r1 = r9.A02
            X.3zh r1 = (X.C81723zh) r1
            if (r1 == 0) goto L_0x0021
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.A05 = r0
            return
        L_0x00b5:
            X.1FU r4 = r3.A03
            X.00H r0 = r3.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat()
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.11c> r0 = X.C201711c.class
            r1.A01(r0)
            r3 = 0
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r2 = new com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C72473Md.A0H(r6)
            java.lang.String r0 = "provider_category"
            r1.putInt(r0, r5)
            java.lang.String r0 = "display_name"
            r1.putString(r0, r3)
            r2.A1R(r1)
            r4.CMk(r2, r3)
            goto L_0x00a8
        L_0x00df:
            java.lang.Object r0 = r9.A03
            X.3y7 r0 = (X.C80803y7) r0
            X.1KB r0 = r0.getGlobalUI()
            X.1FR r3 = r0.A00
            if (r3 == 0) goto L_0x0021
            java.lang.Object r2 = r9.A01
            X.23z r2 = (X.C445823z) r2
            java.lang.Object r1 = r9.A02
            X.4Cx r1 = (X.C82984Cx) r1
            r0 = 0
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C83664Ge.A00(r2, r0, r1)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            r3.CMk(r1, r0)
            return
        L_0x00fe:
            boolean r0 = r4 instanceof X.C79093uR
            if (r0 == 0) goto L_0x0021
            X.3uR r4 = (X.C79093uR) r4
            X.206 r0 = r4.getFMessage()
            long r3 = X.AnonymousClass25A.A02(r0)
            long r1 = X.AnonymousClass25A.A03(r0)
            java.lang.Object r7 = r9.A02
            android.content.Context r7 = (android.content.Context) r7
            X.205 r8 = r0.A0v
            X.1BI r5 = r8.A00
            r0 = 0
            android.content.Intent r6 = X.C72473Md.A0A(r7, r5, r0)
            java.lang.String r5 = "primary_container_class"
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity"
            r6.putExtra(r5, r0)
            java.lang.String r5 = "secondary_container_class"
            java.lang.String r0 = "com.whatsapp.Conversation"
            r6.putExtra(r5, r0)
            java.lang.String r0 = "row_id"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "sort_id"
            r6.putExtra(r0, r1)
            X.AnonymousClass4aU.A00(r6, r8)
            java.lang.Object r0 = r9.A01
            X.1L9 r0 = (X.AnonymousClass1L9) r0
            r0.A09(r7, r6)
            return
        L_0x0140:
            java.lang.Object r2 = r9.A01
            X.4aH r2 = (X.C88644aH) r2
            X.6lM r1 = r2.A0H
            r0 = 2
            r1.A00(r0)
            java.lang.Object r0 = r9.A02
            X.4Wv r0 = (X.C87754Wv) r0
            java.lang.String r0 = r0.A03
            r7 = 0
            if (r0 == 0) goto L_0x0021
            android.net.Uri r5 = android.net.Uri.parse(r0)
            if (r5 == 0) goto L_0x0021
            java.lang.Object r10 = r9.A03
            X.206 r10 = (X.AnonymousClass206) r10
            boolean r0 = r10 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x020e
            r11 = r10
            X.210 r11 = (X.AnonymousClass210) r11
            X.A2e r0 = r2.A05
            if (r0 == 0) goto L_0x01a0
            r1 = 6
            int r0 = r11.A01
            if (r1 != r0) goto L_0x01a0
            X.11S r0 = r2.A02
            if (r0 == 0) goto L_0x01a0
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 == 0) goto L_0x01a0
            X.A2e r3 = r2.A05
            X.205 r0 = r10.A0v
            java.lang.String r1 = r0.A01
            X.11S r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            java.lang.String r0 = r0.getRawString()
            java.lang.String r12 = r3.A01(r1, r0)
            X.11S r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            java.lang.String r13 = X.C19991A2e.A00(r0)
            X.10I r0 = r2.A06
            r14 = 2
            X.Ak5 r8 = new X.Ak5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0.CGF(r8)
        L_0x01a0:
            int r4 = r11.A00
            X.0ve r3 = r2.A0G
            r1 = 11720(0x2dc8, float:1.6423E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x01af
            r7 = r10
        L_0x01af:
            X.4kp r6 = new X.4kp
            r6.<init>(r5, r7, r9, r4)
        L_0x01b4:
            X.4Qu r8 = r2.A0C
            java.lang.String r7 = r5.toString()
            boolean r5 = X.C72453Mb.A1Z(r7)
            X.205 r4 = r10.A0v
            X.1BI r3 = r4.A00
            if (r3 == 0) goto L_0x077f
            X.A8x r0 = r8.A00
            X.1gU r1 = r0.A0A
            r0 = 1
            java.util.ArrayList r0 = r1.A04(r7, r0)
            if (r0 == 0) goto L_0x077f
            boolean r0 = r8.A00(r3)
            if (r0 == 0) goto L_0x077f
            X.4Kh r0 = r8.A01
            X.0vc r1 = r0.A00
            java.lang.String r0 = "smb_suspicious_warning_banner"
            android.content.SharedPreferences r1 = r1.A05(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = r3.getRawString()
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L_0x077f
            android.content.Context r0 = r2.A09
            android.app.Activity r3 = X.AnonymousClass1L9.A00(r0)
            X.1FU r3 = (X.AnonymousClass1FU) r3
            X.4i6 r2 = new X.4i6
            r2.<init>(r9, r6, r5)
            android.os.Bundle r1 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0A(r1, r4)
            com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet r0 = new com.whatsapp.bizintegrity.smbsuspicious.SMBSuspiciousSenderUrlClickWarningSheet
            r0.<init>()
            r0.A1R(r1)
            r0.A05 = r2
            r3.CMl(r0)
            return
        L_0x020e:
            X.4ko r6 = new X.4ko
            r6.<init>(r5, r9)
            goto L_0x01b4
        L_0x0214:
            java.lang.Object r4 = r9.A01
            X.3uO r4 = (X.AnonymousClass3uO) r4
            java.lang.Object r0 = r9.A02
            X.206 r0 = (X.AnonymousClass206) r0
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r0)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.Object r6 = r9.A03
            X.1EC r6 = (X.AnonymousClass1EC) r6
            X.1FU r5 = X.AnonymousClass3Ma.A0K(r4)
            if (r6 == 0) goto L_0x0021
            if (r5 == 0) goto L_0x0021
            X.11E r0 = r4.A0h
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x078a
            X.1KB r2 = r4.A0S
            r1 = 2131886748(0x7f12029c, float:1.9408084E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x0242:
            java.lang.Object r0 = r9.A01
            X.1xT r0 = (X.C42011xT) r0
            int r1 = r0.A05()
            r0 = -1
            if (r1 == r0) goto L_0x0021
            java.lang.Object r0 = r9.A02
            X.B79 r0 = (X.B79) r0
            X.9Wb r0 = r0.BQj(r1)
            X.8i8 r0 = (X.C168008i8) r0
            X.ADV r5 = r0.A00
            java.lang.Object r2 = r9.A03
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r2 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r2
            X.A8Q r3 = r2.A09
            X.A7D r1 = new X.A7D
            r1.<init>()
            java.lang.String r0 = r3.A03
            r1.A0B = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A0D
            int r0 = r0.get()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
            X.A8Q r4 = r2.A09
            java.lang.String r0 = r4.A01
            r1.A0E = r0
            java.lang.String r0 = r4.A02
            r1.A0F = r0
            java.util.concurrent.atomic.AtomicInteger r0 = r4.A0E
            int r0 = r0.getAndIncrement()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r1.A09 = r0
            r0 = 39
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A06 = r0
            r0 = 46
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            java.lang.String r6 = r5.A07
            r1.A0H = r6
            X.AE6 r0 = r5.A04
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A04(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0K
            r1.A00 = r0
            java.lang.String r0 = r2.A0X
            r1.A0G = r0
            r3.A09(r1)
            X.8Fk r0 = r2.A0C
            android.content.Context r1 = r2.A14()
            com.whatsapp.jid.UserJid r3 = r0.A0C
            r8 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A1n(r1, r8, r8)
            r7 = 9
            r4 = 0
            r5 = r4
            X.C20057A5g.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x02cb:
            java.lang.Object r0 = r9.A03
            X.6Gp r0 = (X.AnonymousClass6Gp) r0
            X.1L9 r2 = r0.A0E
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            java.lang.Object r0 = r9.A02
            android.net.Uri r0 = (android.net.Uri) r0
            r2.A0C(r1, r0)
            return
        L_0x02e1:
            java.lang.Object r0 = r9.A03
            X.71y r0 = (X.C1405571y) r0
            X.0vl r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            X.1dR r3 = (X.C30131dR) r3
            java.lang.String r2 = "status_privacy_activity"
            java.lang.String r1 = "SEE_LINKING_NUX"
            r0 = 927604110(0x374a1d8e, float:1.20470195E-5)
            r3.A06(r2, r1, r0)
            java.lang.Object r0 = r9.A01
            X.89c r0 = (X.C1605989c) r0
            com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment r1 = new com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment
            r1.<init>()
            r1.A02 = r0
            java.lang.Object r0 = r9.A02
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.CMl(r1)
            return
        L_0x030a:
            java.lang.Object r5 = r9.A01
            com.whatsapp.invites.InviteGroupParticipantsActivity r5 = (com.whatsapp.invites.InviteGroupParticipantsActivity) r5
            java.lang.Object r6 = r9.A03
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r9.A02
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            X.1iW r10 = r5.A01
            X.1E7 r0 = r5.A09
            boolean r0 = X.C83804Gs.A00(r0)
            if (r0 == 0) goto L_0x0390
            X.1E7 r0 = r5.A09
            java.lang.String r12 = r0.A0K()
        L_0x0326:
            java.util.List r1 = r5.A0C
            byte[] r11 = r5.A0D
            com.whatsapp.mentions.MentionableEntry r0 = r5.A0A
            java.lang.String r9 = r0.getStringText()
            if (r12 != 0) goto L_0x0337
            java.lang.String r0 = "UserActions - Missing group name during invite"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0337:
            X.11S r0 = r10.A04
            com.whatsapp.jid.PhoneUserJid r8 = X.AnonymousClass11S.A00(r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x0341:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0399
            java.lang.Object r3 = r15.next()
            X.4O7 r3 = (X.AnonymousClass4O7) r3
            X.1PP r1 = r10.A0x
            com.whatsapp.jid.UserJid r0 = r3.A02
            r14 = 1
            X.205 r13 = r1.A01(r0, r14)
            X.11P r0 = r10.A0K
            long r0 = X.AnonymousClass11P.A01(r0)
            r2 = 24
            X.23S r4 = new X.23S
            r4.<init>(r13, r2, r0)
            r4.A02 = r14
            X.1EC r14 = r3.A01
            java.lang.String r13 = r3.A03
            long r2 = r3.A00
            X.1CJ r0 = r10.A0R
            int r1 = r0.A06(r14)
            r0 = 0
            r4.A02 = r14
            r4.A03 = r8
            r4.A05 = r12
            r4.A06 = r13
            r4.A01 = r2
            r4.A07 = r0
            r4.A00 = r1
            r4.A04 = r9
            if (r11 == 0) goto L_0x0387
            r4.A0p(r11)
        L_0x0387:
            r10.A0b(r4)
            X.122 r0 = r10.A0U
            r0.BBM(r4)
            goto L_0x0341
        L_0x0390:
            X.1Me r1 = r5.A04
            X.1E7 r0 = r5.A09
            java.lang.String r12 = r1.A0I(r0)
            goto L_0x0326
        L_0x0399:
            r0 = -1
            r5.setResult(r0)
            X.1KB r10 = r5.A05
            X.0vb r9 = r5.A07
            r8 = 2131755197(0x7f1000bd, float:1.9141266E38)
            java.util.List r0 = r5.A0C
            int r0 = r0.size()
            long r3 = (long) r0
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.util.List r0 = r5.A0C
            int r0 = r0.size()
            boolean r2 = X.C72453Mb.A1b(r1, r0)
            java.lang.String r0 = r9.A0K(r1, r8, r3)
            r10.A0G(r0, r2)
            if (r6 == 0) goto L_0x03d9
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x03d9
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "invite_trigger_source"
            int r0 = r1.getIntExtra(r0, r2)
            android.content.Intent r0 = X.AnonymousClass1LU.A0q(r5, r7, r6, r0, r2)
            r5.startActivity(r0)
        L_0x03d9:
            r5.finish()
            return
        L_0x03dd:
            java.lang.Object r5 = r9.A03
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r5 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r5
            java.lang.Object r4 = r9.A01
            java.lang.Object r3 = r9.A02
            X.10I r2 = r5.getWaWorkers$app_productinfra_chat_chat()
            r1 = 4
            X.7R0 r0 = new X.7R0
            r0.<init>(r3, r5, r4, r1)
            r2.CGF(r0)
            X.00H r0 = r5.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat()
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.11k> r0 = X.C202511k.class
            r1.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            r2.<init>()
            X.1FU r1 = r5.A06
            java.lang.String r0 = "PhoneNumberSharedInCAGBottomSheet"
            goto L_0x0434
        L_0x0409:
            java.lang.Object r5 = r9.A03
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r5 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r5
            java.lang.Object r4 = r9.A01
            java.lang.Object r3 = r9.A02
            X.10I r2 = r5.getWaWorkers$app_productinfra_chat_chat()
            r1 = 4
            X.7R0 r0 = new X.7R0
            r0.<init>(r3, r5, r4, r1)
            r2.CGF(r0)
            X.00H r0 = r5.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat()
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.11h> r0 = X.C202211h.class
            r1.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet
            r2.<init>()
            X.1FU r1 = r5.A06
            java.lang.String r0 = "PhoneNumberHiddenInCAGBottomSheet"
        L_0x0434:
            r1.CMk(r2, r0)
            return
        L_0x0438:
            java.lang.Object r1 = r9.A02
            X.3zh r1 = (X.C81723zh) r1
            if (r1 == 0) goto L_0x0444
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A05 = r0
        L_0x0444:
            java.lang.Object r0 = r9.A03
            com.whatsapp.info.views.EncryptionInfoView r0 = (com.whatsapp.info.views.EncryptionInfoView) r0
            X.1FU r4 = r0.A03
            X.00H r0 = r0.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat()
            X.17w r1 = X.AnonymousClass3MW.A0c(r0)
            java.lang.Class<X.12H> r0 = X.AnonymousClass12H.class
            r1.A01(r0)
            java.lang.Object r0 = r9.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            r3 = 0
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C72473Md.A0H(r0)
            java.lang.String r0 = "business_state_id"
            r1.putInt(r0, r3)
            r2.A1R(r1)
            r0 = 0
            r4.CMk(r2, r0)
            return
        L_0x0472:
            java.lang.Object r0 = r9.A03
            X.3R7 r0 = (X.AnonymousClass3R7) r0
            X.689 r1 = r0.getLocationUtils()
            android.content.Context r2 = r0.getContext()
            java.lang.Object r0 = r9.A01
            X.9qf r0 = (X.C193789qf) r0
            double r5 = r0.A00
            double r7 = r0.A01
            java.lang.Object r0 = r9.A02
            X.23z r0 = (X.C445823z) r0
            X.9rg r0 = r0.A01
            r4 = 0
            if (r0 == 0) goto L_0x0497
            java.lang.String r3 = r0.A02
            java.lang.String r4 = r0.A01
        L_0x0493:
            r1.A09(r2, r3, r4, r5, r7)
            return
        L_0x0497:
            r3 = r4
            goto L_0x0493
        L_0x0499:
            java.lang.Object r3 = r9.A03
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r9.A01
            X.1BI r2 = (X.AnonymousClass1BI) r2
            r1 = 0
            java.lang.Object r0 = r9.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3.A0V(r2, r0, r1)
            return
        L_0x04aa:
            java.lang.Object r0 = r9.A03
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r0)
            java.lang.Object r0 = r9.A01
            X.3wX r0 = (X.C80093wX) r0
            X.4Qq r0 = r0.A03
            java.util.ArrayList r4 = r0.A00(r1)
            java.lang.Object r3 = r9.A02
            android.content.Context r3 = (android.content.Context) r3
            r4.size()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "edit_mode"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "vcard_sender_infos"
            r2.putParcelableArrayListExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x04df:
            java.lang.Object r4 = r9.A01
            X.3wW r4 = (X.C80083wW) r4
            X.11S r0 = r4.A01
            com.whatsapp.jid.PhoneUserJid r11 = X.AnonymousClass11S.A01(r0)
            X.11S r0 = r4.A01
            java.lang.String r1 = r0.A0D()
            X.73C r10 = new X.73C
            r10.<init>()
            X.6oE r0 = r10.A0A
            r0.A01 = r1
            java.lang.String r12 = X.AnonymousClass17K.A05(r11)
            r13 = 0
            r15 = 1
            r14 = 2
            r10.A03(r11, r12, r13, r14, r15)
            X.0vb r2 = r4.A05
            X.1LA r1 = r4.A00
            X.6yH r0 = new X.6yH
            r0.<init>(r1, r2)
            java.lang.String r3 = r0.A01(r10)     // Catch:{ 1iZ -> 0x0529 }
            android.content.Context r0 = r4.getContext()     // Catch:{ 1iZ -> 0x0529 }
            java.lang.Object r2 = r9.A02     // Catch:{ 1iZ -> 0x0529 }
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2     // Catch:{ 1iZ -> 0x0529 }
            android.content.Intent r1 = X.C72483Me.A0C(r0, r15)     // Catch:{ 1iZ -> 0x0529 }
            java.lang.String r0 = "jid"
            X.AnonymousClass3MY.A12(r1, r2, r0)     // Catch:{ 1iZ -> 0x0529 }
            java.lang.String r0 = "vcard"
            r1.putExtra(r0, r3)     // Catch:{ 1iZ -> 0x0529 }
            X.AnonymousClass3MY.A11(r1, r4)     // Catch:{ 1iZ -> 0x0529 }
            goto L_0x052f
        L_0x0529:
            r1 = move-exception
            java.lang.String r0 = "ReciprocalShare"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x052f:
            java.lang.Object r0 = r9.A03
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0537:
            java.lang.Object r4 = r9.A01
            X.3sl r4 = (X.C78413sl) r4
            X.00H r0 = r4.A1g
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            java.lang.Object r0 = r9.A02
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0P(r0)
            if (r0 == 0) goto L_0x0563
            X.1FU r3 = r4.A01
            r0 = 1
            X.4i9 r2 = new X.4i9
            r2.<init>(r3, r4, r0)
            r0 = 2131894668(0x7f12218c, float:1.9424147E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            com.whatsapp.blocklist.UnblockDialogFragment r0 = X.C87374Vi.A01(r2, r1, r0, r0)
            r3.CMl(r0)
            return
        L_0x0563:
            java.lang.Object r0 = r9.A03
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.C78413sl.A00(r4, r0)
            return
        L_0x056b:
            java.lang.Object r3 = r9.A03
            X.3uP r3 = (X.AnonymousClass3uP) r3
            X.10I r2 = r3.A1X
            java.lang.Object r1 = r9.A02
            X.21B r1 = (X.AnonymousClass21B) r1
            r0 = 18
            X.C98814rl.A00(r2, r3, r1, r0)
            X.689 r2 = r3.A0G
            X.C17960vV.A07(r2)
            java.lang.Object r3 = r9.A01
            android.content.Context r3 = (android.content.Context) r3
            double r6 = r1.A00
            double r8 = r1.A01
            java.lang.String r4 = r1.A01
            java.lang.String r5 = r1.A00
            r2.A09(r3, r4, r5, r6, r8)
            return
        L_0x058f:
            java.lang.Object r2 = r9.A01
            X.3rt r2 = (X.C77963rt) r2
            X.1Co r1 = r2.A04
            java.lang.Object r0 = r9.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r0 = r0.A0J
            r1.A06(r0)
            java.lang.Object r1 = r9.A03
            X.5Z8 r1 = (X.AnonymousClass5Z8) r1
            r0 = 1
            if (r1 == 0) goto L_0x05a9
            r2.Bcw(r1, r0)
            return
        L_0x05a9:
            r2.A06(r0)
            return
        L_0x05ad:
            java.lang.Object r4 = r9.A01
            X.5yK r4 = (X.C116625yK) r4
            java.lang.Object r0 = r9.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.Object r3 = r9.A03
            android.view.View r3 = (android.view.View) r3
            java.lang.String r1 = r0.A0K()
            X.1BI r2 = r0.A0J
            if (r2 != 0) goto L_0x05d1
            if (r1 == 0) goto L_0x05d1
            java.lang.String r0 = "@"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x05d1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r4.A04
            r0.A2d(r1)
            return
        L_0x05d1:
            X.C17960vV.A07(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.Class<com.whatsapp.contact.picker.ContactPicker> r0 = com.whatsapp.contact.picker.ContactPicker.class
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r2.getRawString()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass1Xr.A04(r3, r1)
            r0 = 0
            X.A09 r5 = new X.A09
            r5.<init>(r3, r2, r0)
            r5.A02 = r1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r4.A04
            X.1FL r0 = r0.A1B()
            goto L_0x0708
        L_0x05fc:
            java.lang.Object r1 = r9.A02
            android.view.View r1 = (android.view.View) r1
            android.content.Context r3 = r1.getContext()
            java.lang.Object r0 = r9.A03
            X.27A r0 = (X.AnonymousClass27A) r0
            X.00H r0 = r0.getWaIntents()
            r0.get()
            android.content.Context r2 = r1.getContext()
            java.lang.Object r0 = r9.A01
            X.4Up r0 = (X.C87184Up) r0
            X.1EC r1 = r0.A00
            X.4Cx r0 = X.C82984Cx.COMMUNITY_NAVIGATION
            android.content.Intent r0 = X.AnonymousClass1LU.A0U(r2, r0, r1)
            r3.startActivity(r0)
            return
        L_0x0623:
            java.lang.Object r1 = r9.A02
            android.view.View r1 = (android.view.View) r1
            android.content.Context r4 = r1.getContext()
            java.lang.Object r0 = r9.A03
            X.27A r0 = (X.AnonymousClass27A) r0
            X.00H r0 = r0.getWaIntents()
            r0.get()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r1)
            java.lang.Object r0 = r9.A01
            X.4Up r0 = (X.C87184Up) r0
            X.1EC r3 = r0.A00
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.communitymedia.CommunityMediaActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "parent_jid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r4.startActivity(r2)
            return
        L_0x0656:
            java.lang.Object r1 = r9.A02
            X.3zh r1 = (X.C81723zh) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A09 = r0
            java.lang.Object r2 = r9.A03
            com.whatsapp.info.views.StarredMessageInfoView r2 = (com.whatsapp.info.views.StarredMessageInfoView) r2
            android.content.Context r1 = r2.getContext()
            java.lang.Object r0 = r9.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            android.content.Intent r1 = X.AnonymousClass1LU.A0s(r1, r0)
            X.1FU r0 = r2.A00
            goto L_0x06b5
        L_0x0673:
            java.lang.Object r2 = r9.A02
            X.02n r2 = (X.AnonymousClass02n) r2
            java.lang.Object r1 = r9.A03
            com.whatsapp.info.views.NotificationsAndSoundsInfoView r1 = (com.whatsapp.info.views.NotificationsAndSoundsInfoView) r1
            X.00H r0 = r1.getWaIntents()
            r0.get()
            android.content.Context r1 = X.AnonymousClass3MY.A04(r1)
            java.lang.Object r0 = r9.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            android.content.Intent r0 = X.AnonymousClass1LU.A0t(r1, r0)
            r2.A03(r0)
            return
        L_0x0692:
            java.lang.Object r3 = r9.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r9.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 1
            goto L_0x06ad
        L_0x06a0:
            java.lang.Object r3 = r9.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r9.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 0
        L_0x06ad:
            android.content.Intent r1 = X.AnonymousClass1LU.A0r(r2, r1, r0)
            android.app.Activity r0 = X.AnonymousClass3Ma.A05(r3)
        L_0x06b5:
            r0.startActivity(r1)
            return
        L_0x06b9:
            java.lang.Object r1 = r9.A03
            X.3RZ r1 = (X.AnonymousClass3RZ) r1
            X.1FU r0 = r1.getActivity()
            X.1GP r2 = X.AnonymousClass3MX.A0O(r0)
            X.1FU r3 = r1.getActivity()
            X.C18070vi.A0X(r3)
            java.lang.Object r4 = r9.A01
            X.1EC r4 = (X.AnonymousClass1EC) r4
            java.lang.Object r5 = r9.A02
            X.1EC r5 = (X.AnonymousClass1EC) r5
            X.5RB r8 = new X.5RB
            r8.<init>(r1)
            r9 = 1
            X.0wS r6 = X.C18460wS.A00
            X.5QE r7 = X.AnonymousClass5QE.A00
            r10 = 6
            r11 = r9
            X.C83744Gm.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x06e4:
            java.lang.Object r1 = r9.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r1 = r1.A06(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r0 = 0
            X.A09 r5 = new X.A09
            r5.<init>(r4, r1, r0)
            java.lang.Object r0 = r9.A03
            X.4No r0 = (X.C85484No) r0
            android.widget.ImageView r0 = r0.A01
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            r5.A02 = r0
            java.lang.Object r0 = r9.A01
            X.3Os r0 = (X.C73033Os) r0
            android.app.Activity r0 = r0.A04
        L_0x0708:
            r5.A01(r0)
            return
        L_0x070c:
            java.lang.Object r0 = r9.A03
            X.4OR r0 = (X.AnonymousClass4OR) r0
            android.widget.CompoundButton$OnCheckedChangeListener r2 = r0.A01
            java.lang.Object r0 = r9.A02
            X.4rF r0 = (X.C98494rF) r0
            java.lang.Object r1 = r0.element
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r0 = r9.A01
            X.1yM r0 = (X.C42551yM) r0
            boolean r0 = r0.A0P
            r0 = r0 ^ 1
            r2.onCheckedChanged(r1, r0)
            return
        L_0x0726:
            java.lang.Object r0 = r9.A01
            X.3Of r0 = (X.AnonymousClass3Of) r0
            com.whatsapp.chatinfo.ListChatInfoActivity r3 = r0.A00
            java.lang.Object r0 = r9.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.jid.Jid r2 = X.AnonymousClass1E7.A01(r0)
            X.1BI r2 = (X.AnonymousClass1BI) r2
            r0 = 0
            X.A09 r1 = new X.A09
            r1.<init>(r4, r2, r0)
            java.lang.Object r0 = r9.A03
            X.4Nn r0 = (X.C85474Nn) r0
            android.widget.ImageView r0 = r0.A00
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            r1.A02 = r0
            r1.A01(r3)
            return
        L_0x074c:
            java.lang.Object r1 = r9.A02
            X.6nW r1 = (X.AnonymousClass6nW) r1
            java.lang.Runnable r0 = r1.A04
            if (r0 == 0) goto L_0x0757
            r0.run()
        L_0x0757:
            X.86R r0 = r1.A03
            if (r0 == 0) goto L_0x075e
            r0.Bhy()
        L_0x075e:
            java.lang.Object r0 = r9.A03
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r4)
            return
        L_0x0766:
            java.lang.Object r2 = r9.A03
            X.5gg r2 = (X.C110655gg) r2
            java.lang.Object r1 = r9.A01
            int[] r1 = (int[]) r1
            X.5Zl r0 = r2.A04
            r0.C5m(r1)
            r2.dismiss()
            java.lang.Object r1 = r9.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x077f:
            r6.BKk()
            X.10I r1 = r2.A06
            r0 = 41
            X.C98814rl.A00(r1, r9, r10, r0)
            return
        L_0x078a:
            r1 = 2131893530(0x7f121d1a, float:1.942184E38)
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r5.CNB(r1, r0)
            X.126 r1 = r4.A19
            X.1NN r0 = r4.A0D
            X.40S r3 = new X.40S
            r3.<init>(r0, r1, r6, r2)
            X.1wy r2 = r3.A03
            r1 = 2
            X.4fo r0 = new X.4fo
            r0.<init>(r6, r5, r4, r1)
            r2.A0A(r5, r0)
            X.1wy r2 = r3.A02
            r1 = 3
            X.4fo r0 = new X.4fo
            r0.<init>(r6, r5, r4, r1)
            r2.A0A(r5, r0)
            X.1wy r2 = r3.A01
            r1 = 4
            X.4fo r0 = new X.4fo
            r0.<init>(r6, r5, r4, r1)
            r2.A0A(r5, r0)
            X.1wy r1 = r3.A00
            r0 = 37
            X.C91624fz.A00(r5, r1, r0)
            X.12M r0 = r4.A0F
            r0.A0B(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48j.A04(android.view.View):void");
    }
}
