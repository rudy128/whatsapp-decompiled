package X;

import android.view.View;

/* renamed from: X.78H  reason: invalid class name */
public class AnonymousClass78H implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public AnonymousClass78H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x02d7;
                case 1: goto L_0x0292;
                case 2: goto L_0x01e8;
                case 3: goto L_0x0245;
                case 4: goto L_0x0186;
                case 5: goto L_0x0113;
                case 6: goto L_0x0206;
                case 7: goto L_0x007b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r14.A01
            X.72j r3 = (X.C1406472j) r3
            java.lang.Object r4 = r14.A02
            com.whatsapp.InteractiveAnnotation r4 = (com.whatsapp.InteractiveAnnotation) r4
            java.lang.Object r8 = r14.A03
            X.21V r8 = (X.AnonymousClass21V) r8
            java.lang.Object r6 = r14.A04
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r6 = (com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment) r6
            java.lang.Object r2 = r14.A05
            X.206 r2 = (X.AnonymousClass206) r2
            X.C18070vi.A0j(r4, r8)
            X.00H r5 = r3.A06
            java.lang.Object r1 = X.C18070vi.A0E(r5)
            X.0ve r1 = (X.C18030ve) r1
            X.84C r0 = new X.84C
            r0.<init>(r6)
            boolean r0 = X.C137396vO.A01(r4, r1, r8, r0)
            if (r0 != 0) goto L_0x0078
            X.0vd r4 = X.C17880vN.A0P(r5)
            r1 = 12473(0x30b9, float:1.7478E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0049
            X.00H r0 = r3.A0A
            java.lang.Object r1 = r0.get()
            X.1hg r1 = (X.C32741hg) r1
            r0 = 5
            r1.A0C(r8, r0)
        L_0x0049:
            android.content.Context r4 = r6.A14()
            java.lang.Object r7 = X.C18070vi.A0E(r5)
            X.0ve r7 = (X.C18030ve) r7
            X.00H r0 = r3.A08
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.1nl r6 = (X.C36361nl) r6
            X.00H r0 = r3.A0A
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.1hg r9 = (X.C32741hg) r9
            X.00H r0 = r3.A07
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.1KB r5 = (X.AnonymousClass1KB) r5
            if (r2 == 0) goto L_0x0079
            java.lang.String r0 = r2.A0P()
        L_0x0071:
            java.lang.String r10 = X.C137166v1.A01(r0)
            X.C137396vO.A00(r4, r5, r6, r7, r8, r9, r10)
        L_0x0078:
            return
        L_0x0079:
            r0 = 0
            goto L_0x0071
        L_0x007b:
            java.lang.Object r7 = r14.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment r7 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r7
            java.lang.Object r3 = r14.A02
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r5 = r14.A03
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Object r4 = r14.A04
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            java.lang.Object r6 = r14.A05
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.ref.WeakReference r0 = r7.A0N
            if (r0 == 0) goto L_0x0321
            android.view.View r1 = X.C108945cZ.A0O(r0)
            if (r1 == 0) goto L_0x0321
            r0 = 2131428208(0x7f0b0370, float:1.8478054E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r9 = r0.isChecked()
            r1 = 1
            r7.A0R = r1
            X.0vl r0 = r7.A0T
            java.lang.Object r2 = r0.getValue()
            java.lang.String r0 = "status_post_report"
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x00cb
            X.627 r2 = new X.627
            r2.<init>()
            if (r9 == 0) goto L_0x010e
            java.lang.Integer r0 = X.C17880vN.A0j()
        L_0x00c2:
            r2.A00 = r0
            X.18K r0 = r7.A0B
            if (r0 == 0) goto L_0x031a
            r0.CC7(r2)
        L_0x00cb:
            X.6uY r2 = r7.A04
            if (r2 == 0) goto L_0x0317
            android.content.Context r0 = r7.A1n()
            boolean r0 = r2.A03(r0)
            if (r0 == 0) goto L_0x0078
            X.0vl r0 = r7.A0V
            boolean r0 = X.C72453Mb.A1a(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.spamreport.ReportSpamDialogFragment.A03(r7, r1)
        L_0x00e6:
            if (r9 == 0) goto L_0x00ff
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x00ff
        L_0x00ee:
            r1 = 0
        L_0x00ef:
            r7.A0Q = r1
            X.1pm r0 = X.AnonymousClass3MZ.A0H(r7)
            r8 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1 r2 = new com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass3MX.A1Q(r2, r0)
            return
        L_0x00ff:
            X.0vl r0 = r7.A0a
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00ee
            boolean r0 = com.whatsapp.spamreport.ReportSpamDialogFragment.A04(r3, r7)
            if (r0 == 0) goto L_0x00ee
            goto L_0x00ef
        L_0x010e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x00c2
        L_0x0113:
            java.lang.Object r0 = r14.A01
            X.0vk r0 = (X.C18090vk) r0
            java.lang.Object r2 = r14.A02
            X.771 r2 = (X.AnonymousClass771) r2
            java.lang.Object r1 = r14.A03
            X.1GP r1 = (X.AnonymousClass1GP) r1
            java.lang.Object r4 = r14.A04
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r14.A05
            X.1nl r3 = (X.C36361nl) r3
            if (r0 == 0) goto L_0x012c
            r0.invoke()
        L_0x012c:
            java.util.List r0 = X.C139476yu.A02
            java.lang.String r2 = r2.A00
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x017a
            int r0 = r2.hashCode()
            switch(r0) {
                case -1956801605: goto L_0x016f;
                case -1905312150: goto L_0x0164;
                case 2094604: goto L_0x0159;
                case 75424504: goto L_0x014e;
                case 1924835592: goto L_0x0143;
                default: goto L_0x013d;
            }
        L_0x013d:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x013f:
            X.AnonymousClass6XD.A00(r1, r0)
            return
        L_0x0143:
            java.lang.String r0 = "ACCEPT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x013f
        L_0x014e:
            java.lang.String r0 = "OPTIN"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x013f
        L_0x0159:
            java.lang.String r0 = "DENY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x013f
        L_0x0164:
            java.lang.String r0 = "DISMISS"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            goto L_0x013f
        L_0x016f:
            java.lang.String r0 = "OPTOUT"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            goto L_0x013f
        L_0x017a:
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r2)
            if (r0 == 0) goto L_0x013d
            if (r4 == 0) goto L_0x0078
            X.C72453Mb.A18(r4, r3, r2)
            return
        L_0x0186:
            java.lang.Object r12 = r14.A01
            X.A6R r12 = (X.A6R) r12
            java.lang.Object r9 = r14.A02
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Object r13 = r14.A03
            X.B8b r13 = (X.B8b) r13
            java.lang.Object r10 = r14.A04
            X.AW0 r10 = (X.AW0) r10
            java.lang.Object r11 = r14.A05
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            r5 = 1
            X.1KB r0 = r12.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0078
            X.A6R.A01(r9, r10, r12, r5)
            X.1ex r7 = r12.A04
            java.lang.String r4 = r10.A0K
            X.9mQ r6 = new X.9mQ
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 2
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            java.lang.String r2 = "action"
            java.lang.String r0 = "cancel-payment-request"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 0
            r3[r0] = r1
            java.lang.String r0 = "request-id"
            X.C17880vN.A1Q(r0, r4, r3, r5)
            java.lang.String r0 = "account"
            X.1ca r9 = new X.1ca
            r9.<init>(r0, r3)
            X.118 r0 = r7.A02
            android.content.Context r3 = r0.A00
            X.1KB r5 = r7.A00
            X.00H r0 = r7.A0I
            java.lang.Object r4 = r0.get()
            X.1jG r4 = (X.C33711jG) r4
            r8 = 3
            X.8yh r2 = new X.8yh
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r10 = "set"
            r8 = r2
            r7.A0I(r8, r9, r10, r11)
            return
        L_0x01e8:
            java.lang.Object r5 = r14.A01
            X.70E r5 = (X.AnonymousClass70E) r5
            java.lang.Object r4 = r14.A02
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r14.A03
            X.2qD r3 = (X.C61762qD) r3
            java.lang.Object r2 = r14.A04
            X.3uP r2 = (X.AnonymousClass3uP) r2
            java.lang.Object r1 = r14.A05
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r0 = 0
            r5.A03(r4, r2, r3, r0)
            if (r1 == 0) goto L_0x0078
            r1.A28()
            return
        L_0x0206:
            java.lang.Object r0 = r14.A01
            X.ADM r0 = (X.ADM) r0
            java.lang.Object r6 = r14.A02
            X.0vb r6 = (X.C18000vb) r6
            java.lang.Object r5 = r14.A03
            X.1L9 r5 = (X.AnonymousClass1L9) r5
            java.lang.Object r4 = r14.A04
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r14.A05
            X.1KB r3 = (X.AnonymousClass1KB) r3
            if (r0 == 0) goto L_0x023d
            java.lang.String r2 = r0.A02
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x023d
            java.lang.String r1 = "%@"
            java.lang.String r0 = r6.A05()
            java.lang.String r0 = r2.replace(r1, r0)
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r5.A08(r4, r0)
            return
        L_0x023d:
            r1 = 2131896262(0x7f1227c6, float:1.942738E38)
            r0 = 0
            r3.A08(r1, r0)
            return
        L_0x0245:
            java.lang.Object r0 = r14.A01
            X.71D r0 = (X.AnonymousClass71D) r0
            java.lang.Object r6 = r14.A02
            X.0vk r6 = (X.C18090vk) r6
            java.lang.Object r5 = r14.A03
            X.778 r5 = (X.AnonymousClass778) r5
            java.lang.Object r4 = r14.A04
            X.1GP r4 = (X.AnonymousClass1GP) r4
            java.lang.Object r3 = r14.A05
            java.lang.Number r3 = (java.lang.Number) r3
            r2 = 1
            X.C18070vi.A0d(r6, r2)
            X.0z4 r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "fun_stickers_notice_started_clicked"
            X.C17880vN.A1F(r1, r0, r2)
            r6.invoke()
            if (r3 == 0) goto L_0x028f
            int r3 = r3.intValue()
        L_0x0271:
            com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet r2 = new com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "stickerOrigin"
            r1.putInt(r0, r3)
            if (r5 == 0) goto L_0x0286
            java.lang.String r0 = "funStickerData"
            r1.putParcelable(r0, r5)
        L_0x0286:
            r2.A1R(r1)
            java.lang.String r0 = "search_fun_stickers_bottom_sheet"
            X.C20098A7b.A04(r2, r4, r0)
            return
        L_0x028f:
            r3 = 10
            goto L_0x0271
        L_0x0292:
            java.lang.Object r7 = r14.A01
            X.3zh r7 = (X.C81723zh) r7
            java.lang.Object r1 = r14.A02
            com.whatsapp.chatinfo.EphemeralMessagesInfoView r1 = (com.whatsapp.chatinfo.EphemeralMessagesInfoView) r1
            java.lang.Object r6 = r14.A03
            X.1EC r6 = (X.AnonymousClass1EC) r6
            java.lang.Object r5 = r14.A04
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Object r4 = r14.A05
            android.content.Context r4 = (android.content.Context) r4
            r3 = 0
            r2 = 1
            r0 = 4
            X.C18070vi.A0d(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r7.A04 = r0
            X.126 r0 = r1.getGroupChatManager$app_productinfra_conversation_ui_ui()
            X.1Pv r0 = r0.A0X
            boolean r0 = r0.A00(r5, r6)
            android.content.Context r1 = r1.getContext()
            if (r0 == 0) goto L_0x02cc
            int r0 = r5.A04
            android.content.Intent r0 = X.AnonymousClass1LU.A0c(r1, r6, r0, r2)
            r4.startActivity(r0)
            return
        L_0x02cc:
            r0 = 2131889945(0x7f120f19, float:1.9414568E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            return
        L_0x02d7:
            java.lang.Object r4 = r14.A01
            X.8Bb r4 = (X.C161028Bb) r4
            java.lang.Object r6 = r14.A02
            X.18K r6 = (X.AnonymousClass18K) r6
            java.lang.Object r0 = r14.A03
            X.194 r0 = (X.AnonymousClass194) r0
            java.lang.Object r3 = r14.A04
            X.1vD r3 = (X.C40751vD) r3
            java.lang.Object r1 = r14.A05
            X.1o3 r1 = (X.C36531o3) r1
            X.0ve r5 = r4.A03
            java.lang.Integer r7 = X.AnonymousClass3MY.A0f()
            java.util.Date r0 = r0.A00()
            long r9 = r0.getTime()
            r8 = 1
            X.C137096uu.A01(r5, r6, r7, r8, r9)
            java.lang.String r2 = "android.intent.action.VIEW"
            X.C18070vi.A0h(r3, r1)
            android.net.Uri r0 = r3.A03()
            X.C18070vi.A0X(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r0)
            android.app.Activity r0 = r4.A00
            r0.startActivity(r1)
            r0.finish()
            return
        L_0x0317:
            java.lang.String r0 = "spamReportManager"
            goto L_0x031c
        L_0x031a:
            java.lang.String r0 = "wamRuntime"
        L_0x031c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0321:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass78H.onClick(android.view.View):void");
    }
}
