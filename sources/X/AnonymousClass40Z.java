package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.40Z  reason: invalid class name */
public class AnonymousClass40Z extends AnonymousClass4FH {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextEmojiLabel A03;
    public final C42141xh A04;
    public final C84944Ll A05;
    public final C28931bI A06;
    public final C28931bI A07;
    public final C28931bI A08;
    public final /* synthetic */ GroupChatInfoActivity A09;

    public AnonymousClass40Z(View view, C84944Ll r4, GroupChatInfoActivity groupChatInfoActivity) {
        this.A09 = groupChatInfoActivity;
        this.A01 = AnonymousClass1HF.A06(view, 2131431239);
        this.A04 = C42141xh.A01(view, groupChatInfoActivity.A0O, 2131432903);
        this.A03 = AnonymousClass3MX.A0V(view, 2131435610);
        this.A02 = AnonymousClass3MW.A0G(view, 2131437025);
        this.A06 = C28931bI.A00(view, 2131433369);
        this.A08 = C28931bI.A00(view, 2131435005);
        this.A07 = C28931bI.A00(view, 2131435003);
        this.A00 = AnonymousClass1HF.A06(view, 2131431238);
        this.A05 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ec, code lost:
        if (r11.A01 <= 0) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C107485Zw r25, X.C139106yE r26, java.util.ArrayList r27) {
        /*
            r24 = this;
            r12 = r25
            r3 = r24
            r3.A00 = r12
            X.1bI r10 = r3.A06
            r9 = 8
            r10.A04(r9)
            X.1bI r2 = r3.A08
            r2.A04(r9)
            X.1bI r0 = r3.A07
            r23 = r0
            r0.A04(r9)
            boolean r0 = r12 instanceof X.C96234nW
            X.C17960vV.A0D(r0)
            X.4nW r12 = (X.C96234nW) r12
            X.1E7 r13 = r12.A00
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass3MZ.A0x(r13)
            com.whatsapp.group.GroupChatInfoActivity r8 = r3.A09
            X.11S r0 = r8.A02
            boolean r16 = r0.A0O(r14)
            X.1xh r6 = r3.A04
            r11 = 0
            com.whatsapp.TextEmojiLabel r1 = r6.A01
            r1.setText(r11)
            r4 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0y(r8, r1, r4, r0)
            com.whatsapp.TextEmojiLabel r7 = r3.A03
            r7.setText(r11)
            r4 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r8, r7, r4, r0)
            X.1Me r4 = r8.A0d
            X.1EC r0 = r8.A1K
            int r5 = r4.A08(r13, r0)
            java.lang.Integer r4 = X.AnonymousClass00R.A00
            if (r16 == 0) goto L_0x0183
            r6.A02()
            X.1pZ r15 = r8.A0f
            X.1E8 r0 = X.AnonymousClass3MY.A0P(r8)
            X.C17960vV.A07(r0)
            android.widget.ImageView r6 = r3.A02
            r15.A07(r6, r0)
        L_0x006a:
            X.1Me r0 = r8.A0d
            X.1yg r0 = r0.A0G(r13, r4, r5)
            java.lang.String r5 = r0.A01
            boolean r0 = r12 instanceof X.AnonymousClass40a
            r4 = 0
            r17 = r27
            if (r0 == 0) goto L_0x010d
            r12 = 1
            r6.setClickable(r12)
            if (r16 == 0) goto L_0x01a5
            X.0ve r2 = r8.A0E
            r1 = 5839(0x16cf, float:8.182E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0103
            X.00H r0 = r8.A22
            java.lang.Object r0 = r0.get()
            X.6uV r0 = (X.C136846uV) r0
            X.6sf r1 = r0.A00()
            if (r1 == 0) goto L_0x0101
            java.lang.String r12 = r1.A02
            if (r12 == 0) goto L_0x0101
            java.lang.String r5 = r1.A03
            if (r5 == 0) goto L_0x0101
            long r2 = r1.A00
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0101
            long r0 = r1.A01
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x0101
            long r14 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r13.toMillis(r2)
            long r0 = r0 + r2
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0101
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r12)
            java.lang.String r0 = " "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r5, r1)
        L_0x00c8:
            boolean r0 = X.AnonymousClass1EG.A0H(r1)
            if (r0 != 0) goto L_0x00fd
            r7.setVisibility(r4)
            r7.A0R(r1)
        L_0x00d4:
            boolean r0 = X.AnonymousClass3MZ.A1Z(r8)
            if (r0 == 0) goto L_0x00f1
            r10.A04(r4)
            int r3 = X.AnonymousClass3Ma.A04(r8)
            android.widget.TextView r2 = X.AnonymousClass3MX.A0M(r10)
            r1 = 3
            r0 = 2131890881(0x7f1212c1, float:1.9416466E38)
            if (r3 != r1) goto L_0x00f9
            r0 = 2131888500(0x7f120974, float:1.9411637E38)
            r2.setText(r0)
        L_0x00f1:
            r6.setOnClickListener(r11)
            r0 = 2
            r6.setImportantForAccessibility(r0)
        L_0x00f8:
            return
        L_0x00f9:
            r2.setText(r0)
            goto L_0x00f1
        L_0x00fd:
            r7.setVisibility(r9)
            goto L_0x00d4
        L_0x0101:
            r1 = r11
            goto L_0x00c8
        L_0x0103:
            X.00H r0 = r8.A1j
            java.lang.String r0 = X.C72453Mb.A10(r0)
            r7.A0R(r0)
            goto L_0x00d4
        L_0x010d:
            boolean r0 = r12 instanceof X.AnonymousClass40b
            X.C17960vV.A0D(r0)
            X.40b r12 = (X.AnonymousClass40b) r12
            X.0vb r10 = r8.A0m
            long r2 = r12.A00
            boolean r9 = r12.A01
            long r0 = java.lang.System.currentTimeMillis()
            r13 = 2
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            int r0 = X.A87.A00(r11, r0, r2)
            java.lang.String r14 = X.A8I.A00(r10, r2)
            r11 = 1
            if (r0 != 0) goto L_0x016d
            r12 = 2131893581(0x7f121d4d, float:1.9421943E38)
        L_0x0131:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r4] = r14
        L_0x0135:
            java.lang.String r0 = r8.getString(r12, r1)
            java.lang.String r1 = X.A8I.A01(r10, r0, r2)
            if (r16 == 0) goto L_0x0164
            r0 = 2131893584(0x7f121d50, float:1.9421949E38)
            if (r9 == 0) goto L_0x0147
            r0 = 2131893583(0x7f121d4f, float:1.9421947E38)
        L_0x0147:
            java.lang.String r0 = X.C17890vO.A0R(r8, r1, r11, r4, r0)
            r6.setClickable(r4)
            r7.setVisibility(r4)
            r7.A0R(r0)
            if (r5 == 0) goto L_0x00f8
            r0 = r23
            android.view.View r1 = X.AnonymousClass3MY.A0I(r0, r4)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r0 = r17
            r1.A0S(r5, r0, r4, r4)
            return
        L_0x0164:
            r0 = 2131893579(0x7f121d4b, float:1.9421939E38)
            if (r9 == 0) goto L_0x0147
            r0 = 2131893578(0x7f121d4a, float:1.9421936E38)
            goto L_0x0147
        L_0x016d:
            if (r0 != r11) goto L_0x0173
            r12 = 2131893582(0x7f121d4e, float:1.9421945E38)
            goto L_0x0131
        L_0x0173:
            X.11Y r0 = X.AnonymousClass11X.A00
            java.lang.String r0 = r0.A0B(r10, r2)
            r12 = 2131893580(0x7f121d4c, float:1.942194E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r4] = r0
            r1[r11] = r14
            goto L_0x0135
        L_0x0183:
            X.1Me r0 = r8.A0d
            X.1yg r0 = r0.A0D(r13, r5)
            java.lang.Integer r4 = r0.A00
            boolean r22 = r13.A0O()
            r17 = r6
            r18 = r0
            r19 = r13
            r20 = r11
            r21 = r5
            r17.A04(r18, r19, r20, r21, r22)
            X.1pZ r0 = r8.A0f
            android.widget.ImageView r6 = r3.A02
            r0.A07(r6, r13)
            goto L_0x006a
        L_0x01a5:
            java.lang.Boolean r0 = X.C17970vW.A03
            android.view.View r11 = r3.A00
            r0 = 2131886191(0x7f12006f, float:1.9406954E38)
            X.AnonymousClass1Y5.A02(r11, r0)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            X.4ZR r15 = new X.4ZR
            r15.<init>(r8)
            r0 = 2131899523(0x7f123483, float:1.9433994E38)
            java.lang.String r0 = r15.A02(r0)
            r11.append(r0)
            java.lang.String r0 = X.C22971Dz.A06(r14)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r11)
            X.AnonymousClass1Xr.A04(r6, r0)
            X.AnonymousClass3MY.A1E(r6, r3, r14, r9)
            boolean r0 = r6 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            r11 = r26
            if (r0 == 0) goto L_0x01df
            r3 = r6
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r3 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r3
            if (r26 != 0) goto L_0x020f
            r0 = 0
        L_0x01dc:
            r3.setStatusIndicatorEnabled(r0)
        L_0x01df:
            if (r26 == 0) goto L_0x01ee
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x01ee
            int r3 = r11.A01
            r0 = 2131886197(0x7f120075, float:1.9406966E38)
            if (r3 > 0) goto L_0x01f1
        L_0x01ee:
            r0 = 2131886196(0x7f120074, float:1.9406964E38)
        L_0x01f1:
            X.AnonymousClass1Y5.A02(r6, r0)
            X.3VF r0 = r8.A18
            boolean r0 = r0.A0U(r14)
            if (r0 == 0) goto L_0x0227
            r2 = 2130969268(0x7f0402b4, float:1.7547213E38)
            r0 = 2131100280(0x7f060278, float:1.7812937E38)
            X.C72463Mc.A0y(r8, r1, r2, r0)
            X.C72463Mc.A0y(r8, r7, r2, r0)
            r0 = 2131896774(0x7f1229c6, float:1.9428419E38)
            r7.setText(r0)
            return
        L_0x020f:
            int r0 = r11.A01
            if (r0 <= 0) goto L_0x0224
            X.1sh r15 = X.C39211sh.UNSEEN
        L_0x0215:
            X.1sj r0 = new X.1sj
            r0.<init>(r15)
            r3.setProfileStatus(r0)
            boolean r0 = r8.A2C
            boolean r0 = X.AnonymousClass73K.A03(r11, r0)
            goto L_0x01dc
        L_0x0224:
            X.1sh r15 = X.C39211sh.SEEN_80_ALPHA
            goto L_0x0215
        L_0x0227:
            X.1MZ r1 = r8.A0J
            X.1EC r0 = r8.A1K
            X.C17960vV.A07(r14)
            boolean r11 = r1.A0Q(r0, r14)
            if (r11 == 0) goto L_0x024b
            r10.A04(r4)
            int r6 = X.AnonymousClass3Ma.A04(r8)
            android.widget.TextView r3 = X.AnonymousClass3MX.A0M(r10)
            r1 = 3
            r0 = 2131890881(0x7f1212c1, float:1.9416466E38)
            if (r6 != r1) goto L_0x0248
            r0 = 2131888500(0x7f120974, float:1.9411637E38)
        L_0x0248:
            r3.setText(r0)
        L_0x024b:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x025c
            android.view.View r1 = X.AnonymousClass3MY.A0I(r2, r4)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r0 = r17
            r1.A0S(r5, r0, r4, r4)
        L_0x025c:
            X.00H r0 = r8.A1z
            java.lang.Object r0 = r0.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0291
            boolean r0 = X.C72483Me.A1D(r8)
            if (r0 == 0) goto L_0x0291
        L_0x0270:
            if (r11 == 0) goto L_0x0284
            if (r12 == 0) goto L_0x0284
            r0 = 2131887564(0x7f1205cc, float:1.9409739E38)
            java.lang.String r0 = r8.getString(r0)
        L_0x027b:
            if (r0 == 0) goto L_0x0293
            r7.setVisibility(r4)
            r7.A0R(r0)
            return
        L_0x0284:
            X.0ve r2 = r8.A0E
            X.11P r1 = r8.A05
            android.content.Context r0 = r7.getContext()
            java.lang.String r0 = X.AnonymousClass72Y.A02(r0, r1, r13, r2)
            goto L_0x027b
        L_0x0291:
            r12 = 0
            goto L_0x0270
        L_0x0293:
            r7.setVisibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass40Z.A00(X.5Zw, X.6yE, java.util.ArrayList):void");
    }
}
