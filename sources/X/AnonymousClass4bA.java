package X;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog$Builder;

/* renamed from: X.4bA  reason: invalid class name */
public class AnonymousClass4bA implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4bA(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AlertDialog$Builder alertDialog$Builder, Object obj, int i, int i2) {
        alertDialog$Builder.setNegativeButton(i2, new AnonymousClass4bA(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c1, code lost:
        r1 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02cb, code lost:
        r1 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x035f, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0360, code lost:
        X.AnonymousClass4Yv.A00(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0363, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03eb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ef, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0422, code lost:
        r11.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0425, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0269, code lost:
        r1 = 17;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x03e1;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x01bf;
                case 7: goto L_0x03c9;
                case 8: goto L_0x03b5;
                case 9: goto L_0x03ab;
                case 10: goto L_0x0393;
                case 11: goto L_0x0370;
                case 12: goto L_0x040d;
                case 13: goto L_0x0189;
                case 14: goto L_0x0178;
                case 15: goto L_0x0364;
                case 16: goto L_0x0359;
                case 17: goto L_0x0341;
                case 18: goto L_0x0329;
                case 19: goto L_0x0005;
                case 20: goto L_0x00aa;
                case 21: goto L_0x0083;
                case 22: goto L_0x0302;
                case 23: goto L_0x02f7;
                case 24: goto L_0x02e3;
                case 25: goto L_0x02ce;
                case 26: goto L_0x02c5;
                case 27: goto L_0x02bb;
                case 28: goto L_0x0281;
                case 29: goto L_0x0277;
                case 30: goto L_0x026d;
                case 31: goto L_0x0250;
                case 32: goto L_0x0249;
                case 33: goto L_0x0048;
                case 34: goto L_0x023f;
                case 35: goto L_0x0238;
                case 36: goto L_0x01fe;
                case 37: goto L_0x0022;
                case 38: goto L_0x000d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0212;
                case 41: goto L_0x0204;
                case 42: goto L_0x020b;
                case 43: goto L_0x0204;
                case 44: goto L_0x01fe;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01f0;
                case 47: goto L_0x01ea;
                case 48: goto L_0x01e4;
                case 49: goto L_0x03fe;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A28()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r10.A01
            com.whatsapp.email.ReconfirmEmailBottomSheet r0 = (com.whatsapp.email.ReconfirmEmailBottomSheet) r0
            X.9kJ r1 = r0.A02
            if (r1 == 0) goto L_0x03e9
            java.lang.String r2 = r0.A04
            int r4 = r0.A00
            r7 = 3
            r3 = 0
            r5 = 11
            r6 = 4
            r1.A00(r2, r3, r4, r5, r6, r7)
            goto L_0x0044
        L_0x0022:
            java.lang.Object r3 = r10.A01
            com.whatsapp.email.ReconfirmEmailBottomSheet r3 = (com.whatsapp.email.ReconfirmEmailBottomSheet) r3
            java.lang.String r1 = "REMOVE_EMAIL"
            boolean r0 = r3.A1b()
            if (r0 == 0) goto L_0x0044
            boolean r0 = r3.A0j
            if (r0 != 0) goto L_0x0044
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "RECONFIRM_EMAIL_RESULT"
            r2.putString(r0, r1)
            X.1GP r1 = r3.A1F()
            java.lang.String r0 = "RECONFIRM_EMAIL_FRAGMENT_RESULT"
            r1.A0w(r0, r2)
        L_0x0044:
            if (r11 == 0) goto L_0x000c
            goto L_0x0422
        L_0x0048:
            java.lang.Object r0 = r10.A01
            com.whatsapp.dogfood.MuteDiagnosticsDialogFragment r0 = (com.whatsapp.dogfood.MuteDiagnosticsDialogFragment) r0
            X.0vl r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.dogfood.MuteDiagnosticsDialogViewModel r2 = (com.whatsapp.dogfood.MuteDiagnosticsDialogViewModel) r2
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            X.4Wq r1 = r2.A01
            X.4DY r0 = r2.A00
            long r3 = r0.durationInMillis
            java.util.HashMap r0 = r1.A02
            java.util.Collection r0 = r0.values()
            X.C18070vi.A0X(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0069:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r5.next()
            X.4S3 r0 = (X.AnonymousClass4S3) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0069
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            java.lang.System.currentTimeMillis()
            goto L_0x0069
        L_0x0083:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1FL r5 = r0.A1B()
            boolean r0 = r5 instanceof com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity
            if (r0 == 0) goto L_0x000c
            com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity r5 = (com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity) r5
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r5.CNA(r0)
            X.10I r4 = r5.A05
            X.4kt r0 = r5.A00
            X.1To r3 = r0.A08
            X.1aN r2 = r5.A04
            X.1BI r1 = r5.A0E
            X.49I r0 = new X.49I
            r0.<init>(r3, r5, r2, r1)
            X.C17890vO.A0u(r0, r4)
            return
        L_0x00aa:
            java.lang.Object r4 = r10.A01
            com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment r4 = (com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment) r4
            r0 = -1
            if (r12 != r0) goto L_0x000c
            android.os.Bundle r2 = r4.A15()
            X.1FL r1 = r4.A1D()
            boolean r0 = r1 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x00c9
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131894874(0x7f12225a, float:1.9424565E38)
            boolean r0 = r1.A47(r0)
            if (r0 == 0) goto L_0x00cf
            return
        L_0x00c9:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x00cf:
            java.lang.String r0 = "search_query_type"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x010c
            r0 = 1
            if (r1 != r0) goto L_0x000c
            android.os.Bundle r1 = r4.A15()
            java.lang.String r0 = "image_file"
            java.lang.String r1 = r1.getString(r0)
            X.1FL r5 = r4.A1B()
            if (r5 == 0) goto L_0x000c
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r5 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x03f0
            X.10I r0 = r4.A05
            X.1KB r6 = r4.A01
            X.181 r7 = r4.A03
            X.18K r8 = r4.A04
            X.1FU r5 = (X.AnonymousClass1FU) r5
            java.io.File r9 = new java.io.File
            r9.<init>(r1)
            X.9BF r4 = new X.9BF
            r4.<init>(r5, r6, r7, r8, r9)
            X.C17890vO.A0u(r4, r0)
            return
        L_0x010c:
            android.os.Bundle r1 = r4.A15()
            java.lang.String r0 = "search_query_text"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = "wa"
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "www.google.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "search"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "ctx"
            android.net.Uri$Builder r2 = r1.appendQueryParameter(r0, r2)
            android.net.Uri r0 = r2.build()
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            int r0 = 2000 - r0
            int r0 = r0 + -3
            java.lang.String r1 = X.C60382nw.A01(r3, r0)
            if (r1 == 0) goto L_0x03f3
            java.lang.String r0 = "q"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r0.build()
            if (r0 == 0) goto L_0x03f3
            android.content.Intent r3 = X.AnonymousClass3MY.A07(r0)
            X.1FL r2 = r4.A1B()
            if (r2 == 0) goto L_0x000c
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x000c
            X.18K r1 = r4.A04
            X.3yR r0 = new X.3yR
            r0.<init>()
            r1.CC7(r0)
            X.1L9 r0 = r4.A00
            r0.A08(r2, r3)
            return
        L_0x0178:
            java.lang.Object r0 = r10.A01
            com.whatsapp.conversation.CapturePictureOrVideoDialogFragment r0 = (com.whatsapp.conversation.CapturePictureOrVideoDialogFragment) r0
            X.5aw r1 = r0.A00
            if (r1 == 0) goto L_0x000c
            if (r12 == 0) goto L_0x03fa
            r0 = 1
            if (r12 != r0) goto L_0x000c
            r1.C2j()
            return
        L_0x0189:
            java.lang.Object r0 = r10.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r0.A0E
            boolean r0 = r1 instanceof com.whatsapp.contact.picker.ContactPickerFragment
            if (r0 == 0) goto L_0x000c
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            if (r1 == 0) goto L_0x000c
            r1.A2H()
            return
        L_0x019b:
            java.lang.Object r0 = r10.A01
            com.whatsapp.community.CommunityExitDialogFragment r0 = (com.whatsapp.community.CommunityExitDialogFragment) r0
            android.content.Context r5 = r0.A1n()
            if (r5 == 0) goto L_0x000c
            X.1L9 r4 = r0.A01
            X.1EC r3 = r0.A0A
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "parent_group_jid"
            X.AnonymousClass3MY.A12(r2, r3, r0)
            r4.A08(r5, r2)
            return
        L_0x01bf:
            java.lang.Object r4 = r10.A01
            com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment r4 = (com.whatsapp.community.deactivate.DeactivateCommunityConfirmationFragment) r4
            X.5XD r3 = r4.A00
            if (r3 != 0) goto L_0x01cb
            java.lang.String r0 = "deactivateClickListener"
            goto L_0x03eb
        L_0x01cb:
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity r3 = (com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity) r3
            r0 = 2131889207(0x7f120c37, float:1.9413071E38)
            r3.CNA(r0)
            X.1pm r2 = X.AnonymousClass3MZ.A0H(r3)
            r1 = 0
            com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1 r0 = new com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity$onDeactivateClicked$1
            r0.<init>(r3, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            r4.A28()
            return
        L_0x01e4:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x02c1
        L_0x01ea:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x02cb
        L_0x01f0:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 6
            goto L_0x0360
        L_0x01f7:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 5
            goto L_0x0360
        L_0x01fe:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x035f
        L_0x0204:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 4
            goto L_0x0360
        L_0x020b:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 3
            goto L_0x0360
        L_0x0212:
            java.lang.Object r1 = r10.A01
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            r0 = 2
            X.9kJ r2 = X.C72453Mb.A0k(r1)
            java.lang.String r3 = r1.A0A
            int r5 = r1.A00
            r8 = 3
            r4 = 0
            r6 = 4
            r7 = r6
            r2.A00(r3, r4, r5, r6, r7, r8)
            X.AnonymousClass4Yv.A00(r1, r0)
            return
        L_0x022a:
            java.lang.Object r1 = r10.A01
            com.whatsapp.email.UpdateEmailActivity r1 = (com.whatsapp.email.UpdateEmailActivity) r1
            r0 = 2
            X.AnonymousClass4Yv.A00(r1, r0)
            java.lang.String r0 = ""
            com.whatsapp.email.UpdateEmailActivity.A0V(r1, r0)
            return
        L_0x0238:
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 2
            goto L_0x0360
        L_0x023f:
            java.lang.Object r0 = r10.A01
            com.whatsapp.dogfood.MuteDiagnosticsDialogFragment r0 = (com.whatsapp.dogfood.MuteDiagnosticsDialogFragment) r0
            X.0vl r0 = r0.A01
            r0.getValue()
            return
        L_0x0249:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r0 = r0.A02
            goto L_0x0269
        L_0x0250:
            java.lang.Object r4 = r10.A01
            X.3hR r4 = (X.C75403hR) r4
            X.5Zh r1 = r4.A0A
            X.4mf r1 = (X.C95704mf) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0267
            r3 = 1
            java.lang.Object r2 = r1.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            r1 = 0
            X.4PL r0 = r2.A29
            r2.A2o(r0, r3, r1)
        L_0x0267:
            X.01E r0 = r4.A02
        L_0x0269:
            r1 = 17
            goto L_0x0360
        L_0x026d:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r0 = r0.A02
            r1 = 12
            goto L_0x0360
        L_0x0277:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r0 = r0.A02
            r1 = 9
            goto L_0x0360
        L_0x0281:
            java.lang.Object r4 = r10.A01
            X.3hR r4 = (X.C75403hR) r4
            X.01E r3 = r4.A02
            r0 = 9
            X.AnonymousClass4Yv.A00(r3, r0)
            X.1Nf r1 = r4.A09
            X.1BI r0 = r4.A0C
            X.1E7 r0 = r1.A01(r0)
            java.lang.String r2 = X.AnonymousClass17K.A02(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.String r2 = "android.intent.action.DIAL"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r3.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x02b1 }
            return
        L_0x02b1:
            X.1KB r2 = r4.A04
            r1 = 2131886448(0x7f120170, float:1.9407475E38)
            r0 = 0
            r2.A08(r1, r0)
            return
        L_0x02bb:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r0 = r0.A02
        L_0x02c1:
            r1 = 8
            goto L_0x0360
        L_0x02c5:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r0 = r0.A02
        L_0x02cb:
            r1 = 7
            goto L_0x0360
        L_0x02ce:
            java.lang.Object r0 = r10.A01
            X.3hR r0 = (X.C75403hR) r0
            X.01E r2 = r0.A02
            java.lang.String r1 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r2.startActivity(r0)
            r0 = 2
            X.AnonymousClass4Yv.A00(r2, r0)
            return
        L_0x02e3:
            java.lang.Object r3 = r10.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            X.00H r0 = r3.A5C
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            java.lang.String r1 = "channels_update_edit"
            X.1FY r0 = X.AnonymousClass3MW.A0P(r3)
            r2.A01(r0, r1)
            return
        L_0x02f7:
            java.lang.Object r0 = r10.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.7Jl r1 = r0.A4B
            r0 = 2
            r1.A01(r0)
            return
        L_0x0302:
            java.lang.Object r2 = r10.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.7Jl r1 = r2.A4B
            r0 = 1
            r1.A01(r0)
            X.5cQ r4 = r2.A2Q
            X.1FY r0 = r4.CFa()
            r3 = 0
            android.content.Intent r2 = X.AnonymousClass3MZ.A07(r0, r3)
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.greenalert.GreenAlertActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "page"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x0329:
            java.lang.Object r2 = r10.A01
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = (com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r2
            r0 = 1
            X.3zG r1 = r2.A0A
            if (r1 == 0) goto L_0x033d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r2.A09
            r0.CC7(r1)
        L_0x033d:
            r2.A29()
            return
        L_0x0341:
            java.lang.Object r2 = r10.A01
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r2 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r2
            r0 = 1
            X.3zG r1 = r2.A05
            if (r1 == 0) goto L_0x0355
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r2.A04
            r0.CC7(r1)
        L_0x0355:
            r2.A28()
            return
        L_0x0359:
            java.lang.Object r0 = r10.A01
            X.DOe r0 = (X.C26982DOe) r0
            android.app.Activity r0 = r0.A02
        L_0x035f:
            r1 = 1
        L_0x0360:
            X.AnonymousClass4Yv.A00(r0, r1)
            return
        L_0x0364:
            java.lang.Object r0 = r10.A01
            X.48m r0 = (X.AnonymousClass48m) r0
            java.lang.Object r0 = r0.A01
            com.whatsapp.conversation.ConversationAttachmentContentView r0 = (com.whatsapp.conversation.ConversationAttachmentContentView) r0
            r0.A0E()
            return
        L_0x0370:
            java.lang.Object r0 = r10.A01
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r0 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r0
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            X.0vl r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            X.3U0 r0 = (X.AnonymousClass3U0) r0
            X.1G4 r3 = r0.A0A
        L_0x0382:
            java.lang.Object r2 = r3.getValue()
            r1 = 0
            X.4YN r0 = new X.4YN
            r0.<init>(r1, r1, r4)
            boolean r0 = r3.BFK(r2, r0)
            if (r0 == 0) goto L_0x0382
            return
        L_0x0393:
            java.lang.Object r3 = r10.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            r11.dismiss()
            X.10I r2 = r3.A05
            r1 = 35
            X.7Pc r0 = new X.7Pc
            r0.<init>(r3, r1)
            r2.CGF(r0)
            return
        L_0x03ab:
            java.lang.Object r0 = r10.A01
            com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity r0 = (com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity) r0
            X.3Ui r0 = r0.A05
            X.C73313Ui.A00(r0)
            return
        L_0x03b5:
            java.lang.Object r0 = r10.A01
            com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment r0 = (com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment) r0
            X.4L5 r0 = r0.A00
            X.4RW r0 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r1 = r0.A03
            X.3xb r0 = r0.A05
            boolean r0 = r0.A05()
            r1.A0W(r0)
            return
        L_0x03c9:
            java.lang.Object r3 = r10.A01
            X.1FP r3 = (X.AnonymousClass1FP) r3
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.optin.ui.ForcedOptInActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            r0 = 100
            r3.startActivityForResult(r1, r0)
            return
        L_0x03e1:
            java.lang.Object r0 = r10.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x03e9:
            java.lang.String r0 = "emailVerificationLogger"
        L_0x03eb:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x03f0:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            goto L_0x03f5
        L_0x03f3:
            java.lang.String r1 = "Failed to encode URI in UTF-8, this should not happen"
        L_0x03f5:
            r0 = 0
            X.C17960vV.A0F(r0, r1)
            return
        L_0x03fa:
            r1.C8O()
            return
        L_0x03fe:
            java.lang.Object r1 = r10.A01
            X.5ZY r1 = (X.AnonymousClass5ZY) r1
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            r11.dismiss()
            r1.BEw()
            goto L_0x0422
        L_0x040d:
            java.lang.Object r0 = r10.A01
            X.0z4 r0 = (X.C19830z4) r0
            r2 = 1
            X.C18070vi.A0d(r11, r2)
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forward_with_captions_nux_shown"
            X.C17880vN.A1F(r1, r0, r2)
        L_0x0422:
            r11.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4bA.onClick(android.content.DialogInterface, int):void");
    }
}
