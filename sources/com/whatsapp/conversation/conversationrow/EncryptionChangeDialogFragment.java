package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass12L;
import X.AnonymousClass18K;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PM;
import X.C24921Me;
import X.C25491Ok;
import X.C63852tn;
import X.C72473Md;
import X.C81453zG;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public class EncryptionChangeDialogFragment extends Hilt_EncryptionChangeDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass11S A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1PM A03;
    public C24921Me A04;
    public C25491Ok A05;
    public AnonymousClass1MZ A06;
    public AnonymousClass1KW A07;
    public AnonymousClass12L A08;
    public AnonymousClass18K A09;
    public C81453zG A0A;
    public AnonymousClass1MB A0B;
    public AnonymousClass1LU A0C;
    public AnonymousClass129 A0D;

    public void onCancel(DialogInterface dialogInterface) {
        C81453zG r1 = this.A0A;
        if (r1 != null) {
            r1.A01 = 0;
            this.A09.CC7(r1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.conversation.conversationrow.Hilt_EncryptionChangeDialogFragment] */
    public static EncryptionChangeDialogFragment A00(AnonymousClass1PM r2, C25491Ok r3, UserJid userJid) {
        C63852tn r0 = new C63852tn(r2, r3, userJid);
        ? hilt_EncryptionChangeDialogFragment = new Hilt_EncryptionChangeDialogFragment();
        Bundle A0H = C72473Md.A0H(userJid);
        A0H.putInt("business_state_id", r0.A02());
        hilt_EncryptionChangeDialogFragment.A1R(A0H);
        return hilt_EncryptionChangeDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0072, code lost:
        if (r6 == 17) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r11) {
        /*
            r10 = this;
            android.os.Bundle r3 = r10.A15()
            java.lang.String r0 = "jid"
            java.lang.String r2 = r3.getString(r0)
            java.lang.String r1 = "provider_category"
            r0 = 0
            int r9 = r3.getInt(r1, r0)
            java.lang.String r1 = "business_state_id"
            r0 = -1
            int r6 = r3.getInt(r1, r0)
            X.1BI r5 = X.AnonymousClass3MX.A0l(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid jid="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.C17960vV.A08(r5, r0)
            r3 = -1
            if (r6 != r3) goto L_0x01b7
            X.1M9 r0 = r10.A02
            X.1E7 r2 = r0.A0H(r5)
            if (r9 == 0) goto L_0x010f
            X.12L r8 = r10.A08
            android.content.Context r7 = r10.A14()
            X.1M9 r0 = r10.A02
            X.1Me r1 = r10.A04
            X.1E7 r0 = r0.A0H(r5)
            r4 = 1
            java.lang.String r3 = r1.A0U(r0, r3, r4)
            r2 = 0
            switch(r9) {
                case 1: goto L_0x0106;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00f9;
                case 4: goto L_0x0106;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00f9;
                default: goto L_0x004b;
            }
        L_0x004b:
            r0 = 2131889883(0x7f120edb, float:1.9414442E38)
            java.lang.String r4 = r7.getString(r0)
        L_0x0052:
            X.129 r2 = r10.A0D
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A05(r1, r0)
        L_0x005c:
            X.0yx r3 = new X.0yx
            r3.<init>(r4, r0)
        L_0x0061:
            java.lang.Object r8 = r3.A00
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r3.A01
            X.3Rj r3 = X.AnonymousClass4a6.A03(r10)
            r0 = 16
            if (r6 == r0) goto L_0x0074
            r1 = 17
            r0 = 0
            if (r6 != r1) goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            r6 = 1
            if (r0 == 0) goto L_0x00eb
            android.content.Context r0 = r10.A14()
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A00(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00e9
            if (r5 == 0) goto L_0x00e9
            java.util.HashMap r2 = X.C17880vN.A11()
            X.3Ne r1 = new X.3Ne
            r1.<init>(r10, r5, r6)
            java.lang.String r0 = "coex-verify-encryption"
            r2.put(r0, r1)
            android.text.SpannableStringBuilder r2 = X.C26302CxJ.A03(r8, r2)
        L_0x009f:
            android.content.Context r1 = r10.A14()
            X.1KW r0 = r10.A07
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r2)
            r7.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r7.setMovementMethod(r0)
            android.content.res.Resources r0 = X.AnonymousClass3MZ.A09(r10)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = android.util.TypedValue.applyDimension(r6, r0, r1)
            int r0 = (int) r0
            r7.setPadding(r0, r0, r0, r0)
            r0 = 5
            r7.setTextAlignment(r0)
            r3.setView(r7)
        L_0x00cc:
            r3.A0T(r6)
            r0 = 14
            X.4bC r1 = new X.4bC
            r1.<init>((java.lang.Object) r10, (java.lang.Object) r4, (int) r0)
            r0 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r3.A0Y(r1, r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 18
            X.AnonymousClass4bA.A00(r3, r10, r0, r1)
            X.05w r0 = r3.create()
            return r0
        L_0x00e9:
            r2 = 0
            goto L_0x009f
        L_0x00eb:
            android.content.Context r1 = r10.A14()
            X.1KW r0 = r10.A07
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r8)
            r3.A0S(r0)
            goto L_0x00cc
        L_0x00f9:
            boolean r0 = X.C1402170l.A00(r8, r5)
            r1 = 2131887220(0x7f120474, float:1.940904E38)
            if (r0 == 0) goto L_0x0109
            r1 = 2131888783(0x7f120a8f, float:1.9412211E38)
            goto L_0x0109
        L_0x0106:
            r1 = 2131887218(0x7f120472, float:1.9409037E38)
        L_0x0109:
            java.lang.String r4 = X.C17890vO.A0R(r7, r3, r4, r2, r1)
            goto L_0x0052
        L_0x010f:
            X.1MB r0 = r10.A0B
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x0128
            r0 = 2131888785(0x7f120a91, float:1.9412215E38)
            java.lang.String r4 = r10.A1H(r0)
            X.129 r1 = r10.A0D
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
        L_0x0122:
            android.net.Uri r0 = r1.A04(r0)
            goto L_0x005c
        L_0x0128:
            X.0ve r0 = r10.A02
            boolean r0 = X.C43381zi.A01(r0, r5)
            if (r0 == 0) goto L_0x0147
            android.content.Context r4 = r10.A14()
            r3 = 2131894773(0x7f1221f5, float:1.942436E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r4 = X.C17880vN.A0q(r4, r0, r2, r1, r3)
            X.129 r1 = r10.A0D
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
            goto L_0x0122
        L_0x0147:
            X.12L r0 = r10.A08
            boolean r0 = X.C42761yh.A01(r0, r5)
            if (r0 == 0) goto L_0x015f
            android.content.Context r1 = r10.A14()
            r0 = 2131898340(0x7f122fe4, float:1.9431595E38)
            java.lang.String r4 = X.C80613xU.A04(r1, r0)
            X.129 r1 = r10.A0D
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x0122
        L_0x015f:
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r5)
            if (r1 == 0) goto L_0x01b5
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x01b5
            X.1PM r0 = r10.A03
            boolean r2 = r0.A04(r1)
        L_0x0171:
            X.12L r0 = r10.A08
            boolean r1 = X.C1402170l.A00(r0, r5)
            r0 = 2131889883(0x7f120edb, float:1.9414442E38)
            if (r1 == 0) goto L_0x017f
            r0 = 2131898301(0x7f122fbd, float:1.9431516E38)
        L_0x017f:
            java.lang.String r4 = r10.A1H(r0)
            if (r2 == 0) goto L_0x0193
            X.129 r1 = r10.A0D
            java.lang.String r0 = "26000103"
            java.lang.String r0 = r1.A06(r0)
        L_0x018d:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x005c
        L_0x0193:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://www.whatsapp.com/security?lg="
            r1.append(r0)
            X.0vb r0 = r10.A01
            java.lang.String r0 = r0.A05()
            r1.append(r0)
            java.lang.String r0 = "&lc="
            r1.append(r0)
            X.0vb r0 = r10.A01
            java.lang.String r0 = r0.A04()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x018d
        L_0x01b5:
            r2 = 0
            goto L_0x0171
        L_0x01b7:
            X.3zG r0 = new X.3zG
            r0.<init>()
            r10.A0A = r0
            X.11S r0 = r10.A01
            boolean r2 = r0.A0O(r5)
            X.1MB r0 = r10.A0B
            boolean r0 = r0.A03(r5)
            if (r0 == 0) goto L_0x021b
            r0 = 2131894772(0x7f1221f4, float:1.9424358E38)
            java.lang.String r2 = r10.A1H(r0)
            X.129 r1 = r10.A0D
            java.lang.String r0 = "about-safely-communicating-with-whatsapp-support"
            android.net.Uri r0 = r1.A04(r0)
        L_0x01db:
            X.0yx r3 = new X.0yx
            r3.<init>(r2, r0)
            X.3zG r2 = r10.A0A
            boolean r0 = r5 instanceof X.AnonymousClass1E9
            if (r0 == 0) goto L_0x020a
            boolean r0 = X.C22971Dz.A0e(r5)
            if (r0 == 0) goto L_0x020a
            X.1MZ r0 = r10.A06
            X.C72483Me.A0z(r0, r2, r5)
            r1 = 2
        L_0x01f2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
        L_0x01f8:
            X.3zG r1 = r10.A0A
            switch(r6) {
                case 5: goto L_0x0208;
                case 6: goto L_0x0208;
                case 7: goto L_0x0206;
                case 8: goto L_0x0206;
                case 9: goto L_0x0208;
                case 10: goto L_0x0208;
                case 11: goto L_0x01fd;
                case 12: goto L_0x01fd;
                case 13: goto L_0x01fd;
                case 14: goto L_0x01fd;
                case 15: goto L_0x0208;
                case 16: goto L_0x0208;
                case 17: goto L_0x0208;
                default: goto L_0x01fd;
            }
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            goto L_0x0061
        L_0x0206:
            r0 = 1
            goto L_0x01fe
        L_0x0208:
            r0 = 2
            goto L_0x01fe
        L_0x020a:
            boolean r0 = X.C22971Dz.A0d(r5)
            if (r0 == 0) goto L_0x01f8
            X.1M9 r0 = r10.A02
            boolean r0 = r0.A0z(r5)
            r1 = 1
            if (r0 == 0) goto L_0x01f2
            r1 = 0
            goto L_0x01f2
        L_0x021b:
            X.0ve r0 = r10.A02
            boolean r0 = X.C43381zi.A01(r0, r5)
            if (r0 == 0) goto L_0x023c
            android.content.Context r4 = r10.A14()
            r3 = 2131894773(0x7f1221f5, float:1.942436E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            r1 = 0
            java.lang.String r0 = "WhatsApp Surveys"
            java.lang.String r2 = X.C17880vN.A0q(r4, r0, r2, r1, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/general/about-whatsapp-surveys"
        L_0x0237:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01db
        L_0x023c:
            X.12L r0 = r10.A08
            boolean r0 = X.C42761yh.A01(r0, r5)
            android.content.Context r1 = r10.A14()
            if (r0 == 0) goto L_0x0252
            r0 = 2131898340(0x7f122fe4, float:1.9431595E38)
            java.lang.String r2 = X.C80613xU.A04(r1, r0)
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/about-the-official-whatsapp-chat-account"
            goto L_0x0237
        L_0x0252:
            switch(r6) {
                case 0: goto L_0x0267;
                case 1: goto L_0x0267;
                case 2: goto L_0x0267;
                case 3: goto L_0x0267;
                case 4: goto L_0x0267;
                case 5: goto L_0x0263;
                case 6: goto L_0x0263;
                case 7: goto L_0x025f;
                case 8: goto L_0x025f;
                case 9: goto L_0x0263;
                case 10: goto L_0x0263;
                case 11: goto L_0x0255;
                case 12: goto L_0x0255;
                case 13: goto L_0x0255;
                case 14: goto L_0x0255;
                case 15: goto L_0x0263;
                case 16: goto L_0x025b;
                case 17: goto L_0x0270;
                default: goto L_0x0255;
            }
        L_0x0255:
            r2 = 0
        L_0x0256:
            java.lang.String r0 = X.C63852tn.A00(r6)
            goto L_0x0237
        L_0x025b:
            r0 = 2131894768(0x7f1221f0, float:1.942435E38)
            goto L_0x0273
        L_0x025f:
            r0 = 2131894766(0x7f1221ee, float:1.9424346E38)
            goto L_0x0273
        L_0x0263:
            r0 = 2131894771(0x7f1221f3, float:1.9424356E38)
            goto L_0x0273
        L_0x0267:
            r0 = 2131894770(0x7f1221f2, float:1.9424354E38)
            if (r2 == 0) goto L_0x0273
            r0 = 2131892105(0x7f121789, float:1.9418949E38)
            goto L_0x0273
        L_0x0270:
            r0 = 2131894769(0x7f1221f1, float:1.9424352E38)
        L_0x0273:
            java.lang.String r2 = r1.getString(r0)
            goto L_0x0256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
