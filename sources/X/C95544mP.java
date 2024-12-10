package X;

/* renamed from: X.4mP  reason: invalid class name and case insensitive filesystem */
public class C95544mP implements C107305Ze {
    public final int A00;
    public final Object A01;

    public C95544mP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        com.whatsapp.chatinfo.ContactInfoActivity.A1E(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0124, code lost:
        r3.CNw(r5, r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0127, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012d, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0130, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x030a, code lost:
        if (r2 == 8) goto L_0x030c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bkp() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0043;
                case 1: goto L_0x004a;
                case 2: goto L_0x0064;
                case 3: goto L_0x006d;
                case 4: goto L_0x00ac;
                case 5: goto L_0x00ee;
                case 6: goto L_0x0018;
                case 7: goto L_0x0131;
                case 8: goto L_0x014a;
                case 9: goto L_0x015f;
                case 10: goto L_0x002d;
                case 11: goto L_0x01cc;
                case 12: goto L_0x01d6;
                case 13: goto L_0x0262;
                case 14: goto L_0x02af;
                case 15: goto L_0x0339;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r8.A01
            X.4kS r3 = (X.C94334kS) r3
            X.4aY r0 = r3.A00
            X.10I r2 = r0.A4c
            r1 = 46
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r2 = r8.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r0 = 0
            r2.A6z = r0
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z
            r0 = 1
            r1.setFocusableInTouchMode(r0)
            X.3hU r0 = r2.A23
            if (r0 == 0) goto L_0x0017
            r0.A0I()
            return
        L_0x002d:
            java.lang.Object r1 = r8.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.3TF r0 = r1.A0h
            X.1vp r0 = r0.A00
            java.lang.Object r0 = r0.A06()
            X.4YI r0 = (X.AnonymousClass4YI) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0017
            X.AnonymousClass4aY.A16(r1)
            return
        L_0x0043:
            java.lang.Object r0 = r8.A01
            X.4i3 r0 = (X.C92874i3) r0
            com.whatsapp.chatinfo.ContactInfoActivity r1 = r0.A0l
            goto L_0x0068
        L_0x004a:
            java.lang.Object r0 = r8.A01
            X.9Aa r0 = (X.C177649Aa) r0
            java.lang.Object r1 = r0.A01
            X.4i3 r1 = (X.C92874i3) r1
            r0 = 2
            X.C92874i3.A03(r1, r0)
            X.1VP r4 = r1.A0j
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r0 = r1.A0h
            X.1E7 r3 = r0.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = r1.A0l
            r1 = 6
            r0 = 0
            r4.CNw(r2, r3, r1, r0)
            return
        L_0x0064:
            java.lang.Object r1 = r8.A01
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
        L_0x0068:
            r0 = 1
            com.whatsapp.chatinfo.ContactInfoActivity.A1E(r1, r0)
            return
        L_0x006d:
            java.lang.Object r5 = r8.A01
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.00H r0 = r5.A26
            X.C72453Mb.A1P(r0)
            X.4VP r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0z(r5)
            com.whatsapp.jid.UserJid r0 = r5.A4l()
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00a5
            X.3oT r4 = r5.A0k
            java.lang.Integer r3 = r5.A2A
            boolean r2 = com.whatsapp.chatinfo.ContactInfoActivity.A1K(r5)
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A1I(r5)
            r0 = 10
            r4.A0X(r3, r0, r2, r1)
            X.3oT r2 = r5.A0k
            r1 = 2
            X.76t r0 = r5.A0X
            r2.A0W(r0, r1)
            X.1VP r3 = r5.A0c
            X.1E7 r2 = r5.A0z
            r1 = 6
            r0 = 0
            goto L_0x0124
        L_0x00a5:
            X.4VP r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0z(r5)
            r0 = 3
            goto L_0x012d
        L_0x00ac:
            java.lang.Object r3 = r8.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.3oT r5 = r3.A0k
            java.lang.Integer r4 = r3.A2A
            boolean r2 = com.whatsapp.chatinfo.ContactInfoActivity.A1K(r3)
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A1I(r3)
            r0 = 9
            r5.A0X(r4, r0, r2, r1)
            X.3oT r2 = r3.A0k
            r1 = 1
            X.76t r0 = r3.A0X
            r2.A0W(r0, r1)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A0C(r1, r0)
            com.whatsapp.jid.UserJid r0 = r3.A4l()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.1L9 r1 = r3.A01
            java.lang.String r0 = "ContactInfoActivity"
            r1.A0B(r3, r2, r0)
            return
        L_0x00ee:
            java.lang.Object r5 = r8.A01
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.00H r0 = r5.A26
            X.C72453Mb.A1P(r0)
            X.4VP r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0z(r5)
            com.whatsapp.jid.UserJid r0 = r5.A4l()
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0128
            X.3oT r4 = r5.A0k
            java.lang.Integer r3 = r5.A2A
            boolean r2 = com.whatsapp.chatinfo.ContactInfoActivity.A1K(r5)
            boolean r1 = com.whatsapp.chatinfo.ContactInfoActivity.A1I(r5)
            r0 = 11
            r4.A0X(r3, r0, r2, r1)
            X.3oT r2 = r5.A0k
            r1 = 3
            X.76t r0 = r5.A0X
            r2.A0W(r0, r1)
            X.1VP r3 = r5.A0c
            X.1E7 r2 = r5.A0z
            r1 = 6
            r0 = 1
        L_0x0124:
            r3.CNw(r5, r2, r1, r0)
            return
        L_0x0128:
            X.4VP r1 = com.whatsapp.chatinfo.ContactInfoActivity.A0z(r5)
            r0 = 4
        L_0x012d:
            r1.A00(r0)
            return
        L_0x0131:
            java.lang.Object r2 = r8.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z
            r0 = 1
            r1.setFocusableInTouchMode(r0)
            com.whatsapp.mentions.MentionableEntry r0 = r2.A3Z
            r0.requestFocus()
            com.whatsapp.mentions.MentionableEntry r1 = r2.A3Z
            r0 = 0
            r1.A0I(r0)
            X.AnonymousClass4aY.A0h(r2)
            return
        L_0x014a:
            java.lang.Object r3 = r8.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            boolean r0 = X.AnonymousClass4aY.A27(r3)
            if (r0 == 0) goto L_0x015b
            r2 = 1
            r1 = 0
            r0 = 0
            X.AnonymousClass4aY.A1f(r3, r1, r0, r2, r0)
            return
        L_0x015b:
            X.AnonymousClass4aY.A0o(r3)
            return
        L_0x015f:
            java.lang.Object r4 = r8.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r4)
            X.00H r0 = r0.A0E
            X.C72453Mb.A1P(r0)
            X.4aI r2 = X.C88444Zs.A00(r4)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MW.A0j(r4)
            r6 = 0
            r0 = 8
            r5 = 1
            X.C88654aI.A03(r2, r1, r6, r0, r5)
            X.4Wn r1 = r4.A4G
            r0 = 7
            X.C87684Wn.A00(r1, r0)
            X.4PK r0 = X.AnonymousClass3Ma.A0Z(r4)
            X.00H r0 = r0.A0B
            r3 = 0
            java.lang.Object r2 = r0.get()
            X.9sP r2 = (X.C194859sP) r2
            r2.A00()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r4.A6n
            if (r0 == 0) goto L_0x019d
            java.lang.Integer r6 = X.C72483Me.A0V(r4)
        L_0x019d:
            r0 = 3
            r2.A02(r1, r6, r0)
            X.AnonymousClass4aY.A0l(r4)
            X.00H r0 = r4.A5w
            java.lang.Object r1 = r0.get()
            X.1VD r1 = (X.AnonymousClass1VD) r1
            X.1E7 r0 = r4.A35
            boolean r0 = r1.A01(r0, r3)
            if (r0 == 0) goto L_0x01c6
            X.5cQ r1 = r4.A2Q
            X.00H r0 = r4.A5w
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r0 = r0.A00()
            r1.CMl(r0)
            return
        L_0x01c6:
            X.1E7 r0 = r4.A35
            r4.A2x(r0, r5, r3, r3)
            return
        L_0x01cc:
            java.lang.Object r1 = r8.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.4Xd r0 = r1.A2p
            X.AnonymousClass4aY.A1S(r1, r0)
            return
        L_0x01d6:
            java.lang.Object r7 = r8.A01
            X.4aY r7 = (X.AnonymousClass4aY) r7
            X.1QO r1 = r7.A3l
            X.1BI r0 = r7.A3R
            int r1 = r1.A05(r0)
            r0 = 2
            if (r1 != r0) goto L_0x0216
            X.00H r0 = r7.A5B
            java.lang.Object r1 = r0.get()
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            X.1BI r0 = r7.A3R
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r6 = r0.A0K()
            X.1KB r5 = r7.A1L
            X.5cQ r1 = r7.A2Q
            r0 = 2131893280(0x7f121c20, float:1.9421332E38)
            java.lang.String r4 = r1.getString(r0)
            X.5cQ r3 = r7.A2Q
            r2 = 2131893279(0x7f121c1f, float:1.942133E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r1 = 0
            r0[r1] = r6
            java.lang.String r0 = r3.getString(r2, r0)
            r5.A0M(r4, r0, r1)
            return
        L_0x0216:
            X.4Op r2 = r7.A3n
            X.5cQ r0 = r7.A2Q
            r0.CFa()
            X.11S r1 = r7.A1O
            java.lang.String r5 = "merchant_initiated"
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r1)
            if (r0 != 0) goto L_0x0253
            X.4Op r4 = r7.A3n
            X.1BI r3 = r7.A3R
            X.00H r0 = r7.A6H
            java.lang.Object r2 = r0.get()
            X.18K r2 = (X.AnonymousClass18K) r2
            X.3zZ r1 = new X.3zZ
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A01 = r0
            java.lang.String r0 = "order_details_creation"
            r1.A03 = r0
            r1.A05 = r5
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.2jg r0 = (X.C57812jg) r0
            r0.A00(r1, r3)
            r2.CC7(r1)
            return
        L_0x0253:
            X.0zA r0 = r2.A00
            r0.A03()
            r1.A0I()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0262:
            java.lang.Object r3 = r8.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.4aI r5 = X.C88444Zs.A00(r3)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass3MW.A0j(r3)
            r2 = 0
            r1 = 8
            r0 = 1
            X.C88654aI.A03(r5, r4, r2, r1, r0)
            X.4Wn r1 = r3.A4G
            r0 = 9
            X.C87684Wn.A00(r1, r0)
            X.AnonymousClass4aY.A0l(r3)
            X.00H r0 = r3.A5w
            java.lang.Object r2 = r0.get()
            X.1VD r2 = (X.AnonymousClass1VD) r2
            X.1E7 r1 = r3.A35
            r0 = 0
            boolean r0 = r2.A01(r1, r0)
            if (r0 == 0) goto L_0x02a2
            X.00H r0 = r3.A5w
            java.lang.Object r0 = r0.get()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet r1 = r0.A00()
        L_0x029c:
            X.5cQ r0 = r3.A2Q
            r0.CMl(r1)
            return
        L_0x02a2:
            android.os.Bundle r0 = X.C17880vN.A0D()
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = new com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment
            r1.<init>()
            r1.A1R(r0)
            goto L_0x029c
        L_0x02af:
            java.lang.Object r3 = r8.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.4Wn r0 = r3.A4G
            r4 = 1
            X.C87684Wn.A00(r0, r4)
            boolean r0 = X.C72483Me.A1C(r3)
            if (r0 == 0) goto L_0x02c9
            X.1FY r1 = X.AnonymousClass3MW.A0P(r3)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x02c9:
            X.AnonymousClass4aY.A0w(r3)
            X.0ve r0 = r3.A3F
            boolean r0 = X.C87544Vz.A01(r0)
            if (r0 == 0) goto L_0x0330
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r3.A39
            if (r0 == 0) goto L_0x02db
            r0.A03()
        L_0x02db:
            X.5tO r0 = r3.A24
            X.3d2 r2 = r0.A02
            if (r2 == 0) goto L_0x031a
            boolean r0 = r2.isShowing()
            if (r0 == 0) goto L_0x02f9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AttachPopupWindowV2"
            r1.append(r0)
            java.lang.String r0 = "/startAttachmentAction/start transition to keyboard"
            X.C17890vO.A1A(r1, r0)
            r2.A0E()
            return
        L_0x02f9:
            boolean r0 = X.AnonymousClass4aY.A26(r3)
            if (r0 == 0) goto L_0x030c
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r3.A3D
            if (r0 == 0) goto L_0x030c
            int r2 = r0.getVisibility()
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            r1 = 0
            if (r0 == 0) goto L_0x0314
            X.AnonymousClass4aY.A1n(r3, r1)
            return
        L_0x0314:
            X.5tO r0 = r3.A24
            r0.A0J(r1)
            return
        L_0x031a:
            boolean r0 = X.AnonymousClass4aY.A26(r3)
            if (r0 == 0) goto L_0x0330
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r3.A3D
            if (r0 == 0) goto L_0x0330
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0330
            X.AnonymousClass4aY.A1n(r3, r4)
            return
        L_0x0330:
            X.5tO r2 = r3.A24
            android.view.View r1 = r3.A0F
            r0 = 3
            r2.A0E(r1, r0)
            return
        L_0x0339:
            java.lang.Object r0 = r8.A01
            X.4kR r0 = (X.C94324kR) r0
            X.4aY r0 = r0.A00
            X.3V4 r1 = r0.A2Y
            r0 = 0
            r1.A0V(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95544mP.Bkp():void");
    }
}
