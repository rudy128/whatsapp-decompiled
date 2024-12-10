package X;

import android.view.View;

/* renamed from: X.4dF  reason: invalid class name and case insensitive filesystem */
public class C89924dF implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C89924dF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C89924dF(obj, i));
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [X.4MX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02d0, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02d4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0510, code lost:
        if (r1 != null) goto L_0x0529;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0512, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0529, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x052e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        r1.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        if (r1 == 0) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        r1.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0238, code lost:
        r0 = "disclosureLoggingUtil";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026f, code lost:
        X.AnonymousClass706.A00(r2, r3, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, X.C72463Mc.A0k(r2, r0), (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0513;
                case 1: goto L_0x04e2;
                case 2: goto L_0x04e2;
                case 3: goto L_0x04d6;
                case 4: goto L_0x04d0;
                case 5: goto L_0x0032;
                case 6: goto L_0x04bc;
                case 7: goto L_0x04bc;
                case 8: goto L_0x04b4;
                case 9: goto L_0x04aa;
                case 10: goto L_0x04aa;
                case 11: goto L_0x048a;
                case 12: goto L_0x047f;
                case 13: goto L_0x00fa;
                case 14: goto L_0x0461;
                case 15: goto L_0x00cd;
                case 16: goto L_0x0446;
                case 17: goto L_0x00cd;
                case 18: goto L_0x0446;
                case 19: goto L_0x0430;
                case 20: goto L_0x0094;
                case 21: goto L_0x0416;
                case 22: goto L_0x0500;
                case 23: goto L_0x0066;
                case 24: goto L_0x03e1;
                case 25: goto L_0x0066;
                case 26: goto L_0x04ef;
                case 27: goto L_0x03e1;
                case 28: goto L_0x03cc;
                case 29: goto L_0x03c0;
                case 30: goto L_0x02d5;
                case 31: goto L_0x04d0;
                case 32: goto L_0x028c;
                case 33: goto L_0x023c;
                case 34: goto L_0x021b;
                case 35: goto L_0x01c4;
                case 36: goto L_0x0026;
                case 37: goto L_0x0007;
                case 38: goto L_0x0026;
                case 39: goto L_0x0007;
                case 40: goto L_0x01b2;
                case 41: goto L_0x01a3;
                case 42: goto L_0x0191;
                case 43: goto L_0x0189;
                case 44: goto L_0x0147;
                case 45: goto L_0x0013;
                case 46: goto L_0x013b;
                case 47: goto L_0x0133;
                case 48: goto L_0x04b4;
                case 49: goto L_0x0120;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.5b2 r0 = r0.A08
            if (r0 == 0) goto L_0x0012
            r0.Bnl()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r0 = r1.A01
            X.3Z8 r0 = (X.AnonymousClass3Z8) r0
            X.4NK r2 = r0.A00
            r1 = 1
            boolean r0 = r2.A00
            if (r0 == r1) goto L_0x0012
            r2.A00 = r1
            X.1DT r0 = r2.A01
            r0.A0E(r2)
            return
        L_0x0026:
            java.lang.Object r0 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.DisclosureFragment r0 = (com.whatsapp.datasharingdisclosure.ui.DisclosureFragment) r0
            X.5b2 r0 = r0.A08
            if (r0 == 0) goto L_0x0012
            r0.Bkq()
            return
        L_0x0032:
            java.lang.Object r3 = r1.A01
            X.3wh r3 = (X.C80163wh) r3
            X.3Ww r2 = r3.A05
            int r0 = r2.A00
            r2.A0G(r0)
            int r0 = r3.A05()
            r2.A00 = r0
            android.widget.RadioButton r1 = r3.A00
            r0 = 1
            r1.setChecked(r0)
            X.4MV r0 = r2.A01
            if (r0 == 0) goto L_0x0012
            r3.A05()
            android.view.View r2 = r0.A00
            r0 = 2131435085(0x7f0b1e4d, float:1.8492002E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131436003(0x7f0b21e3, float:1.8493864E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            goto L_0x0529
        L_0x0066:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = (com.whatsapp.conversationslist.LockedConversationsFragment) r2
            X.00H r0 = r2.A2x
            X.1fA r0 = X.AnonymousClass3MW.A0Y(r0)
            android.content.Context r1 = r2.A14()
            X.02n r4 = r2.A03
            X.00H r0 = r0.A0L
            r0.get()
            r3 = 3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "entrypoint"
            r2.putExtra(r0, r3)
            if (r4 == 0) goto L_0x0012
            r4.A03(r2)
            return
        L_0x0094:
            java.lang.Object r0 = r1.A01
            X.5fx r0 = (X.C110495fx) r0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r4 = r0.A04
            if (r4 == 0) goto L_0x0012
            X.0ve r2 = r4.A09
            r1 = 8726(0x2216, float:1.2228E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b6
            X.00H r0 = r4.A0J
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.1pq r3 = (X.C37611pq) r3
            r2 = 0
            r1 = 7
            r0 = 6
            r3.A01(r2, r2, r1, r0)
        L_0x00b6:
            X.0z4 r0 = r4.A08
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "is_chat_list_suggestions_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            X.1wy r1 = r4.A0G
            r0 = 0
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1wy r1 = r4.A0F
            X.4Cs r0 = X.C82934Cs.DISMISS_BUTTON
            goto L_0x011c
        L_0x00cd:
            java.lang.Object r5 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r5 = (com.whatsapp.conversationslist.ConversationsFragment) r5
            X.1FL r4 = r5.A1B()
            X.1wM r0 = r5.A1Q
            if (r0 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0012
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x0012
            boolean r0 = r4 instanceof X.AnonymousClass1FY
            if (r0 == 0) goto L_0x0012
            X.1FY r4 = (X.AnonymousClass1FY) r4
            X.00H r0 = r5.A2x
            X.1fA r3 = X.AnonymousClass3MW.A0Y(r0)
            X.3ob r2 = X.C76893ob.A00
            r0 = 1
            X.4jV r1 = new X.4jV
            r1.<init>(r4, r5, r0)
            r0 = 4
            r3.A0A(r4, r2, r1, r0)
            return
        L_0x00fa:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            X.5fx r0 = r0.A1e
            if (r0 == 0) goto L_0x0012
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r3 = r0.A04
            if (r3 == 0) goto L_0x0012
            X.0z4 r0 = r3.A08
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "is_chat_list_suggestions_dismissed"
            X.C17880vN.A1F(r1, r0, r2)
            X.1wy r1 = r3.A0G
            boolean r0 = com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel.A05(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x011c:
            r1.A0F(r0)
            return
        L_0x0120:
            java.lang.Object r2 = r1.A01
            com.whatsapp.dmsetting.DisappearingMessagesSettingActivity r2 = (com.whatsapp.dmsetting.DisappearingMessagesSettingActivity) r2
            int r0 = r2.A00
            android.content.Intent r1 = X.C17880vN.A0A()
            X.AnonymousClass1LU.A1q(r2, r1, r0)
            r0 = 100
            r2.startActivityForResult(r1, r0)
            return
        L_0x0133:
            java.lang.Object r0 = r1.A01
            com.whatsapp.dmsetting.ChangeDMSettingActivity r0 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x013b:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r0 = r0.A1D()
            r0.finish()
            return
        L_0x0147:
            java.lang.Object r5 = r1.A01
            X.3bn r5 = (X.C74513bn) r5
            X.1DT r0 = r5.A02
            java.lang.Object r1 = r0.A06()
            X.C17960vV.A07(r1)
            X.4NK r1 = (X.AnonymousClass4NK) r1
            X.4XK r3 = r5.A07
            X.1BI r0 = r5.A0C
            java.lang.String r2 = r0.getRawString()
            X.4cE r4 = r1.A02
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x016b
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x016c
        L_0x016b:
            r0 = 1
        L_0x016c:
            r0 = r0 ^ 1
            r3.A01(r2, r0)
            X.4Ld r0 = r5.A08
            X.3hL r3 = r5.A01
            X.4VR r0 = r0.A00
            X.4LS r0 = r0.A08
            X.4aY r2 = r0.A00
            X.4mT r1 = new X.4mT
            r1.<init>(r3, r0, r4)
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.C87464Vr.A01(r2, r1, r0)
            r5.dismiss()
            return
        L_0x0189:
            java.lang.Object r0 = r1.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x0191:
            java.lang.Object r1 = r1.A01
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x01a3:
            java.lang.Object r1 = r1.A01
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.00H r0 = r1.A01
            X.C72453Mb.A1P(r0)
            X.1Fc r0 = r1.A00
            r0.C9u()
            goto L_0x01c0
        L_0x01b2:
            java.lang.Object r1 = r1.A01
            com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment r1 = (com.whatsapp.dialogs.AudioVideoBottomSheetDialogFragment) r1
            X.00H r0 = r1.A01
            X.C72453Mb.A1P(r0)
            X.1Fc r0 = r1.A00
            r0.Bln()
        L_0x01c0:
            r1.A28()
            return
        L_0x01c4:
            java.lang.Object r2 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r2 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r2
            java.lang.Integer r1 = r2.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x01fc
            X.00H r0 = r2.A01
            if (r0 == 0) goto L_0x0217
            java.lang.Object r1 = r0.get()
            X.73F r1 = (X.AnonymousClass73F) r1
            X.0vl r0 = r2.A05
            X.1BI r0 = X.AnonymousClass3MX.A0m(r0)
            r1.A03(r0)
        L_0x01e3:
            X.5b2 r0 = r2.A08
            if (r0 == 0) goto L_0x01ea
            r0.Bkq()
        L_0x01ea:
            X.00H r0 = r2.A03
            if (r0 == 0) goto L_0x0238
            java.lang.Object r3 = r0.get()
            X.706 r3 = (X.AnonymousClass706) r3
            X.0vl r0 = r2.A05
            X.1BI r2 = X.AnonymousClass3MX.A0m(r0)
            r0 = 0
            goto L_0x026f
        L_0x01fc:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x01e3
            X.00H r0 = r2.A01
            if (r0 == 0) goto L_0x0217
            java.lang.Object r1 = r0.get()
            X.73F r1 = (X.AnonymousClass73F) r1
            X.0vl r0 = r2.A05
            X.1BI r0 = X.AnonymousClass3MX.A0m(r0)
            r1.A03(r0)
            r0 = 1
            r2.A04 = r0
            goto L_0x01e3
        L_0x0217:
            java.lang.String r0 = "consumerMarketingDisclosureManager"
            goto L_0x02d0
        L_0x021b:
            java.lang.Object r1 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r1 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r1
            X.5b2 r0 = r1.A08
            if (r0 == 0) goto L_0x0226
            r0.Bnl()
        L_0x0226:
            X.00H r0 = r1.A03
            if (r0 == 0) goto L_0x0238
            java.lang.Object r3 = r0.get()
            X.706 r3 = (X.AnonymousClass706) r3
            X.0vl r0 = r1.A05
            X.1BI r2 = X.AnonymousClass3MX.A0m(r0)
            r0 = 1
            goto L_0x026f
        L_0x0238:
            java.lang.String r0 = "disclosureLoggingUtil"
            goto L_0x02d0
        L_0x023c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment r4 = (com.whatsapp.datasharingdisclosure.ui.ConsumerMarketingDisclosureFragment) r4
            X.1L9 r3 = r4.A00
            if (r3 == 0) goto L_0x0289
            android.content.Context r2 = r4.A14()
            X.1LC r1 = r4.A06
            if (r1 == 0) goto L_0x0286
            X.0vl r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.4X2 r0 = (X.AnonymousClass4X2) r0
            java.lang.String r0 = r0.A0C
            android.net.Uri r0 = r1.A00(r0)
            r1 = 0
            r3.CGU(r2, r0, r1)
            X.00H r0 = r4.A03
            if (r0 == 0) goto L_0x0280
            java.lang.Object r3 = r0.get()
            X.706 r3 = (X.AnonymousClass706) r3
            X.0vl r0 = r4.A05
            X.1BI r2 = X.AnonymousClass3MX.A0m(r0)
            r0 = 2
        L_0x026f:
            java.lang.Integer r7 = X.C72463Mc.A0k(r2, r0)
            r4 = 0
            r13 = 5
            r6 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r5 = r4
            X.AnonymousClass706.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0280:
            java.lang.String r0 = "disclosureLoggingUtil"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0286:
            java.lang.String r0 = "waLinkFactory"
            goto L_0x02d0
        L_0x0289:
            java.lang.String r0 = "activityUtils"
            goto L_0x02d0
        L_0x028c:
            java.lang.Object r6 = r1.A01
            com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment r6 = (com.whatsapp.datasharingdisclosure.ui.ConsumerDisclosureFragment) r6
            X.00H r0 = r6.A04
            if (r0 == 0) goto L_0x02cb
            java.lang.Object r5 = r0.get()
            X.4QI r5 = (X.AnonymousClass4QI) r5
            java.lang.Integer r4 = r6.A2K()
            java.lang.Integer r3 = r6.A08
            java.lang.Integer r2 = r6.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r4 == r0) goto L_0x02b0
            X.18K r1 = r5.A00
            r0 = 1
            X.3zM r0 = r5.A00(r4, r3, r2, r0)
            r1.CC7(r0)
        L_0x02b0:
            java.lang.Integer r1 = r6.A2K()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x02c7
            X.00H r0 = r6.A03
            if (r0 == 0) goto L_0x02ce
            X.4aI r3 = X.AnonymousClass3MW.A0b(r0)
            com.whatsapp.jid.UserJid r2 = r6.A00
            r1 = 0
            r0 = 1
            X.C88654aI.A03(r3, r2, r1, r0, r0)
        L_0x02c7:
            r6.A28()
            return
        L_0x02cb:
            java.lang.String r0 = "dataSharingCtwaDisclosureLogger"
            goto L_0x02d0
        L_0x02ce:
            java.lang.String r0 = "ctwaCustomerLoggingController"
        L_0x02d0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02d5:
            java.lang.Object r3 = r1.A01
            com.whatsapp.crop.CropImage r3 = (com.whatsapp.crop.CropImage) r3
            int r0 = r3.A07
            int r0 = r0 + 270
            int r0 = r0 % 360
            r3.A07 = r0
            android.content.Context r6 = r21.getContext()
            X.11C r5 = r3.A0I
            android.content.Context r4 = r21.getContext()
            int r2 = r3.A07
            r0 = 90
            r1 = 2131894553(0x7f122119, float:1.9423914E38)
            if (r2 == r0) goto L_0x0305
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 2131894551(0x7f122117, float:1.942391E38)
            if (r2 == r0) goto L_0x0305
            r0 = 270(0x10e, float:3.78E-43)
            r1 = 2131894552(0x7f122118, float:1.9423912E38)
            if (r2 == r0) goto L_0x0305
            r1 = 2131894544(0x7f122110, float:1.9423896E38)
        L_0x0305:
            java.lang.String r0 = r4.getString(r1)
            X.AnonymousClass1Y5.A00(r6, r5, r0)
            r15 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r0 = r3.A0K
            android.graphics.Matrix r0 = r0.getImageViewMatrix()
            r0.mapRect(r5)
            android.graphics.Matrix r1 = r3.A0B
            if (r1 == 0) goto L_0x0326
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r1.postRotate(r0)
        L_0x0326:
            com.whatsapp.crop.CropImageView r4 = r3.A0K
            android.graphics.Bitmap r0 = r3.A0A
            X.4MX r2 = new X.4MX
            r2.<init>()
            r2.A00 = r0
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            android.graphics.Matrix r0 = r3.A0C
            r1.set(r0)
            android.graphics.Matrix r0 = r3.A0B
            r1.postConcat(r0)
            r2.A01 = r1
            r0 = 0
            r4.A07(r2, r0)
            X.4Yn r2 = r3.A0L
            if (r2 == 0) goto L_0x0362
            com.whatsapp.crop.CropImageView r0 = r3.A0K
            android.graphics.Matrix r1 = r0.getImageMatrix()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r2.A03 = r0
            android.graphics.Rect r0 = X.C88154Yn.A00(r2)
            r2.A04 = r0
            android.view.View r0 = r2.A07
            r0.invalidate()
        L_0x0362:
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r15, r15, r6, r6)
            com.whatsapp.crop.CropImageView r0 = r3.A0K
            android.graphics.Matrix r0 = r0.getImageViewMatrix()
            r0.mapRect(r4)
            float r2 = r5.width()
            float r0 = r4.width()
            float r2 = r2 / r0
            float r1 = r5.height()
            float r0 = r4.height()
            float r1 = r1 / r0
            float r5 = java.lang.Math.min(r2, r1)
            X.4Yn r1 = r3.A0L
            if (r1 == 0) goto L_0x038f
            com.whatsapp.crop.CropImageView r0 = r3.A0K
            r0.A08(r1)
        L_0x038f:
            r9 = 1
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r9)
            r10 = 1056964608(0x3f000000, float:0.5)
            r14 = 1119092736(0x42b40000, float:90.0)
            r18 = r9
            r19 = r10
            android.view.animation.RotateAnimation r13 = new android.view.animation.RotateAnimation
            r16 = r9
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r7 = r5
            r8 = r6
            r11 = r9
            r12 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r2.addAnimation(r13)
            r2.addAnimation(r4)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            com.whatsapp.crop.CropImageView r0 = r3.A0K
            r0.startAnimation(r2)
            return
        L_0x03c0:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x03cc:
            java.lang.Object r3 = r1.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "package:com.whatsapp"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DELETE"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            return
        L_0x03e1:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.0ve r2 = r3.A25
            r1 = 8926(0x22de, float:1.2508E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x03fd
            X.1o3 r2 = r3.A1I
            X.1FL r1 = r3.A1D()
            java.lang.String r0 = "chat-lock"
            r2.A01(r1, r0)
            return
        L_0x03fd:
            java.lang.String r0 = "https://faq.whatsapp.com/764072925284841"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.1L9 r1 = r3.A0e
            X.1FL r0 = r3.A1D()
            r1.A08(r0, r2)
            return
        L_0x0416:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.InteropConversationsActivity r3 = (com.whatsapp.conversationslist.InteropConversationsActivity) r3
            X.0vl r0 = r3.A04
            r0.getValue()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0430:
            java.lang.Object r0 = r1.A01
            X.1rB r0 = (X.C38371rB) r0
            com.whatsapp.conversationslist.ConversationsFragment r2 = r0.A08
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0O
            X.1rD r0 = r0.A0B
            X.28H r0 = (X.AnonymousClass28H) r0
            r1 = 0
            r0.A0V(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A0O
            r0.A0g(r1)
            return
        L_0x0446:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.00H r0 = r3.A3c
            r0.get()
            X.1FL r2 = r3.A1B()
            r1 = 1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A1V(r2, r0, r0, r1)
            r3.A1k(r0)
            return
        L_0x0461:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.00H r0 = r3.A3c
            r0.get()
            android.content.Context r0 = r3.A14()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r3.A1k(r2)
            return
        L_0x047f:
            java.lang.Object r1 = r1.A01
            X.28H r1 = (X.AnonymousClass28H) r1
            r0 = 0
            r1.A01 = r0
            r1.notifyDataSetChanged()
            return
        L_0x048a:
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.1FL r0 = r4.A1D()
            java.lang.String r3 = "archived_chats"
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.SettingsChat"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "scroll_to_setting"
            r2.putExtra(r0, r3)
            r4.A1k(r2)
            return
        L_0x04aa:
            java.lang.Object r0 = r1.A01
            com.whatsapp.components.WaSwitchView r0 = (com.whatsapp.components.WaSwitchView) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.A02
            r0.toggle()
            return
        L_0x04b4:
            java.lang.Object r0 = r1.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            r0.onBackPressed()
            return
        L_0x04bc:
            java.lang.Object r4 = r1.A01
            X.1pr r4 = (X.C37621pr) r4
            X.1pq r3 = r4.A08
            r2 = 87
            r1 = 0
            r0 = 1
            r3.A01(r1, r1, r0, r2)
            com.whatsapp.conversationslist.ConversationsFragment r1 = r4.A06
            r0 = 0
            com.whatsapp.conversationslist.ConversationsFragment.A0r(r1, r0, r0)
            return
        L_0x04d0:
            java.lang.Object r0 = r1.A01
            X.AnonymousClass3MW.A1V(r0)
            return
        L_0x04d6:
            java.lang.Object r1 = r1.A01
            X.3Wh r1 = (X.C73523Wh) r1
            java.util.List r0 = X.C42011xT.A0I
            X.0vk r0 = r1.A02
            r0.invoke()
            return
        L_0x04e2:
            java.lang.Object r2 = r1.A01
            X.3wd r2 = (X.C80133wd) r2
            r1 = 0
            r0 = 0
            r2.setResult(r0, r1)
            r2.finish()
            return
        L_0x04ef:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = (com.whatsapp.conversationslist.LockedConversationsFragment) r2
            X.00H r0 = r2.A2x
            X.1fA r1 = X.AnonymousClass3MW.A0Y(r0)
            r0 = 1
            r1.A0I(r0)
            android.view.View r1 = r2.A00
            goto L_0x0510
        L_0x0500:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversationslist.LockedConversationsFragment r2 = (com.whatsapp.conversationslist.LockedConversationsFragment) r2
            X.00H r0 = r2.A2x
            X.1fA r1 = X.AnonymousClass3MW.A0Y(r0)
            r0 = 1
            r1.A0I(r0)
            android.view.View r1 = r2.A01
        L_0x0510:
            if (r1 != 0) goto L_0x0529
            return
        L_0x0513:
            java.lang.Object r3 = r1.A01
            X.4PF r3 = (X.AnonymousClass4PF) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.10I r2 = r3.A08
            r1 = 49
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.CGF(r0)
            android.view.View r1 = r3.A02
        L_0x0529:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89924dF.onClick(android.view.View):void");
    }
}
