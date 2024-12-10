package com.whatsapp.conversation.conversationrow.bottomsheets;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1L9;
import X.C139436yq;
import X.C18030ve;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class GenericSystemInfoBottomSheet extends Hilt_GenericSystemInfoBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public AnonymousClass00H A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626850, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0110, code lost:
        if (r2 == 4) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r13, android.view.View r14) {
        /*
            r12 = this;
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            super.A21(r13, r14)
            r0 = 2131435044(0x7f0b1e24, float:1.849192E38)
            android.view.View r1 = X.C18070vi.A05(r14, r0)
            r0 = 2131435033(0x7f0b1e19, float:1.8491897E38)
            android.widget.TextView r6 = X.AnonymousClass3Ma.A0E(r14, r0)
            r0 = 2131435032(0x7f0b1e18, float:1.8491895E38)
            com.whatsapp.WaTextView r5 = X.AnonymousClass3Ma.A0N(r14, r0)
            r0 = 2131435051(0x7f0b1e2b, float:1.8491933E38)
            android.view.View r7 = X.C18070vi.A05(r14, r0)
            r0 = 14
            X.C89914dE.A00(r1, r12, r0)
            r4 = r12
            boolean r3 = r12 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet
            if (r3 == 0) goto L_0x01e1
            r11 = r4
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r11 = (com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet) r11
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = "jid"
            X.0vl r0 = X.C88414Zp.A01(r11, r0)
            java.lang.String r0 = X.AnonymousClass3MW.A0y(r0)
            X.1BI r0 = r1.A02(r0)
            r11.A03 = r0
            java.lang.String r1 = "business_state_id"
            r0 = -1
            X.0vl r0 = X.C88414Zp.A03(r11, r1, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r11.A06 = r0
            X.1MB r1 = r11.A02
            if (r1 == 0) goto L_0x0298
            X.1BI r0 = r11.A03
            boolean r0 = r1.A03(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x012b
            r0 = 2131894772(0x7f1221f4, float:1.9424358E38)
            java.lang.String r8 = r11.A1H(r0)
            X.129 r2 = r11.A04
            if (r2 == 0) goto L_0x028b
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r0 = r2.A04(r0)
            X.4U8 r9 = new X.4U8
            r9.<init>(r0, r1, r8)
        L_0x0075:
            r10 = 0
            if (r9 == 0) goto L_0x0128
            java.lang.CharSequence r1 = r9.A02
        L_0x007a:
            r8 = 0
            X.C18070vi.A0d(r6, r8)
            if (r1 == 0) goto L_0x0121
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0121
            r6.setVisibility(r8)
            r6.setText(r1)
        L_0x008c:
            if (r9 == 0) goto L_0x0090
            java.lang.CharSequence r10 = r9.A01
        L_0x0090:
            if (r3 == 0) goto L_0x00f9
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r4 = (com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet) r4
            X.00H r0 = r4.A05
            if (r0 == 0) goto L_0x029b
            java.lang.Object r2 = r0.get()
            X.4Nu r2 = (X.C85544Nu) r2
            android.content.Context r6 = r4.A14()
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x00f7
            int r1 = r0.intValue()
            r0 = 16
            if (r1 == r0) goto L_0x00b2
            r0 = 17
            if (r1 != r0) goto L_0x00f7
        L_0x00b2:
            r0 = 1
        L_0x00b3:
            X.5Gj r11 = new X.5Gj
            r11.<init>(r4)
            if (r10 == 0) goto L_0x011f
            if (r0 == 0) goto L_0x00cf
            X.1np r3 = r2.A03
        L_0x00be:
            java.lang.String r2 = r10.toString()
            r0 = 49
            X.4ri r1 = new X.4ri
            r1.<init>((java.lang.Object) r11, (int) r0)
            java.lang.String r0 = "coex-verify-encryption"
            android.text.SpannableStringBuilder r10 = r3.A05(r6, r1, r2, r0)
        L_0x00cf:
            X.C18070vi.A0d(r5, r8)
            if (r10 == 0) goto L_0x00f1
            int r0 = r10.length()
            if (r0 == 0) goto L_0x00f1
            r5.setVisibility(r8)
            r5.setText(r10)
        L_0x00e0:
            X.0ve r1 = r12.A02
            if (r1 == 0) goto L_0x0295
            X.11C r0 = r12.A01
            if (r0 == 0) goto L_0x0288
            X.AnonymousClass1Y5.A0C(r5, r0, r1)
            r0 = 41
            X.C90074dU.A01(r7, r12, r9, r0)
            return
        L_0x00f1:
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x00e0
        L_0x00f7:
            r0 = 0
            goto L_0x00b3
        L_0x00f9:
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r4 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r4
            X.00H r0 = r4.A07
            if (r0 == 0) goto L_0x029b
            java.lang.Object r3 = r0.get()
            X.4Nu r3 = (X.C85544Nu) r3
            android.content.Context r6 = r4.A14()
            int r2 = r4.A01
            r0 = 5
            if (r2 == r0) goto L_0x0112
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x0113
        L_0x0112:
            r0 = 1
        L_0x0113:
            X.5Gi r11 = new X.5Gi
            r11.<init>(r4)
            if (r10 == 0) goto L_0x011f
            if (r0 == 0) goto L_0x00cf
            X.1np r3 = r3.A03
            goto L_0x00be
        L_0x011f:
            r10 = 0
            goto L_0x00cf
        L_0x0121:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x008c
        L_0x0128:
            r1 = r10
            goto L_0x007a
        L_0x012b:
            X.0ve r2 = r11.A02
            if (r2 == 0) goto L_0x0295
            X.1BI r0 = r11.A03
            boolean r0 = X.C43381zi.A01(r2, r0)
            if (r0 == 0) goto L_0x0161
            android.content.Context r9 = r11.A14()
            r8 = 2131894778(0x7f1221fa, float:1.942437E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r1 = X.C17880vN.A0q(r9, r0, r2, r1, r8)
            android.content.Context r2 = r11.A14()
            r0 = 2131894765(0x7f1221ed, float:1.9424344E38)
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r2 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x0156:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            X.4U8 r9 = new X.4U8
            r9.<init>(r2, r1, r0)
            goto L_0x0075
        L_0x0161:
            X.12L r2 = r11.A01
            if (r2 == 0) goto L_0x0292
            X.1BI r0 = r11.A03
            boolean r0 = X.C42761yh.A01(r2, r0)
            if (r0 == 0) goto L_0x017b
            android.content.Context r2 = r11.A14()
            r0 = 2131898340(0x7f122fe4, float:1.9431595E38)
            java.lang.String r0 = X.C80613xU.A04(r2, r0)
            java.lang.String r2 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x0156
        L_0x017b:
            java.lang.Integer r2 = r11.A06
            r0 = 0
            if (r2 == 0) goto L_0x01de
            int r10 = r2.intValue()
            android.content.Context r8 = r11.A14()
            X.11S r9 = r11.A00
            if (r9 == 0) goto L_0x028e
            X.1BI r2 = r11.A03
            boolean r2 = r9.A0O(r2)
            switch(r10) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01bc;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01bc;
                case 5: goto L_0x01b1;
                case 6: goto L_0x01b1;
                case 7: goto L_0x01b1;
                case 8: goto L_0x01b1;
                case 9: goto L_0x01b1;
                case 10: goto L_0x01b1;
                case 11: goto L_0x0195;
                case 12: goto L_0x0195;
                case 13: goto L_0x0195;
                case 14: goto L_0x0195;
                case 15: goto L_0x01b1;
                case 16: goto L_0x01a6;
                case 17: goto L_0x019b;
                default: goto L_0x0195;
            }
        L_0x0195:
            r1 = r0
        L_0x0196:
            java.lang.String r2 = X.C63852tn.A00(r10)
            goto L_0x0156
        L_0x019b:
            r0 = 2131894775(0x7f1221f7, float:1.9424364E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894762(0x7f1221ea, float:1.9424338E38)
            goto L_0x01c1
        L_0x01a6:
            r0 = 2131894774(0x7f1221f6, float:1.9424362E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894761(0x7f1221e9, float:1.9424336E38)
            goto L_0x01c1
        L_0x01b1:
            r0 = 2131894777(0x7f1221f9, float:1.9424368E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894764(0x7f1221ec, float:1.9424342E38)
            goto L_0x01c1
        L_0x01bc:
            if (r2 == 0) goto L_0x01d3
            r0 = 2131892105(0x7f121789, float:1.9418949E38)
        L_0x01c1:
            java.lang.String r2 = r8.getString(r0)
            X.0yx r0 = new X.0yx
            r0.<init>(r1, r2)
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.A01
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0196
        L_0x01d3:
            r0 = 2131894776(0x7f1221f8, float:1.9424366E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131894763(0x7f1221eb, float:1.942434E38)
            goto L_0x01c1
        L_0x01de:
            r9 = r0
            goto L_0x0075
        L_0x01e1:
            r10 = r4
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r10 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r10
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = "jid"
            X.0vl r0 = X.C88414Zp.A01(r10, r0)
            java.lang.String r0 = X.AnonymousClass3MW.A0y(r0)
            X.1BI r0 = r1.A02(r0)
            r10.A06 = r0
            java.lang.String r0 = "arg_transition_id"
            r1 = -1
            X.0vl r0 = X.C88414Zp.A03(r10, r0, r1)
            int r0 = X.C72453Mb.A0I(r0)
            r10.A01 = r0
            java.lang.String r0 = "arg_message_action"
            X.0vl r0 = X.C88414Zp.A03(r10, r0, r1)
            int r0 = X.C72453Mb.A0I(r0)
            r10.A00 = r0
            r8 = 0
            r9 = 69
            if (r0 != r9) goto L_0x0286
            android.content.res.Resources r11 = X.AnonymousClass3MZ.A09(r10)
            int r2 = r10.A01
            r0 = 1
            r1 = 2131894776(0x7f1221f8, float:1.9424366E38)
            if (r2 == r0) goto L_0x0281
            r0 = 2
            if (r2 == r0) goto L_0x027a
            r0 = 3
            if (r2 == r0) goto L_0x027a
            r0 = 4
            r1 = 2131894775(0x7f1221f7, float:1.9424364E38)
            if (r2 == r0) goto L_0x0281
            r0 = 5
            if (r2 == r0) goto L_0x027e
            r2 = 0
        L_0x0230:
            int r0 = r10.A00
            if (r0 != r9) goto L_0x0250
            android.content.res.Resources r9 = X.AnonymousClass3MZ.A09(r10)
            int r8 = r10.A01
            r0 = 1
            r1 = 2131894763(0x7f1221eb, float:1.942434E38)
            if (r8 == r0) goto L_0x0275
            r0 = 2
            if (r8 == r0) goto L_0x026e
            r0 = 3
            if (r8 == r0) goto L_0x026e
            r0 = 4
            r1 = 2131894762(0x7f1221ea, float:1.9424338E38)
            if (r8 == r0) goto L_0x0275
            r0 = 5
            if (r8 == r0) goto L_0x0272
            r8 = 0
        L_0x0250:
            int r1 = r10.A01
            r0 = 1
            if (r1 == r0) goto L_0x026b
            r0 = 4
            if (r1 == r0) goto L_0x0268
            r0 = 5
            if (r1 == r0) goto L_0x0268
            java.lang.String r0 = "https://faq.whatsapp.com/1148840052398648"
        L_0x025d:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.4U8 r9 = new X.4U8
            r9.<init>(r0, r2, r8)
            goto L_0x0075
        L_0x0268:
            java.lang.String r0 = "https://faq.whatsapp.com/1520500555178162"
            goto L_0x025d
        L_0x026b:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            goto L_0x025d
        L_0x026e:
            r1 = 2131894764(0x7f1221ec, float:1.9424342E38)
            goto L_0x0275
        L_0x0272:
            r1 = 2131894761(0x7f1221e9, float:1.9424336E38)
        L_0x0275:
            java.lang.String r8 = r9.getString(r1)
            goto L_0x0250
        L_0x027a:
            r1 = 2131894777(0x7f1221f9, float:1.9424368E38)
            goto L_0x0281
        L_0x027e:
            r1 = 2131894774(0x7f1221f6, float:1.9424362E38)
        L_0x0281:
            java.lang.String r2 = r11.getString(r1)
            goto L_0x0230
        L_0x0286:
            r2 = r8
            goto L_0x0230
        L_0x0288:
            java.lang.String r0 = "systemServices"
            goto L_0x029d
        L_0x028b:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x029d
        L_0x028e:
            X.AnonymousClass3MW.A1D()
            throw r0
        L_0x0292:
            java.lang.String r0 = "infraAbProps"
            goto L_0x029d
        L_0x0295:
            java.lang.String r0 = "abProps"
            goto L_0x029d
        L_0x0298:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x029d
        L_0x029b:
            java.lang.String r0 = "systemInfoDialogHelper"
        L_0x029d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A01(true);
    }
}
