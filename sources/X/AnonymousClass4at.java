package X;

import android.content.DialogInterface;

/* renamed from: X.4at  reason: invalid class name */
public class AnonymousClass4at implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass4at(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r3.A28();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x012c;
                case 1: goto L_0x002c;
                case 2: goto L_0x00dd;
                case 3: goto L_0x009c;
                case 4: goto L_0x0051;
                case 5: goto L_0x0020;
                case 6: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A02
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A01
            X.5bO r0 = r0.A01
            r0.BrZ(r1)
        L_0x0010:
            r8.dismiss()
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r0 = r7.A02
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A01
            X.5bO r0 = r0.A01
            r0.Brb(r1)
            goto L_0x0010
        L_0x0020:
            java.lang.Object r0 = r7.A02
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A01
            X.5bO r0 = r0.A01
            r0.Bra(r1)
            goto L_0x0010
        L_0x002c:
            java.lang.Object r0 = r7.A02
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r0 = (com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog) r0
            int r1 = r7.A01
            X.5X9 r0 = r0.A00
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "approveClickListener"
            goto L_0x00d8
        L_0x003a:
            com.whatsapp.community.CommunitySettingsActivity r0 = (com.whatsapp.community.CommunitySettingsActivity) r0
            X.0vl r0 = r0.A08
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r6 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r6
            X.1EC r2 = r6.A03
            if (r2 == 0) goto L_0x0013
            r5 = 1
            if (r1 == 0) goto L_0x005d
            if (r1 == r5) goto L_0x0098
            r0 = 2
            if (r1 == r0) goto L_0x0098
            return
        L_0x0051:
            java.lang.Object r0 = r7.A02
            X.3hR r0 = (X.C75403hR) r0
            int r1 = r7.A01
            X.01E r0 = r0.A02
            X.AnonymousClass4Yv.A00(r0, r1)
            return
        L_0x005d:
            X.00H r0 = r6.A0A
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r0)
            X.1MG r0 = r1.A08
            java.util.HashSet r0 = r0.A03(r2)
            int r4 = r0.size()
            X.0ve r2 = r1.A07
            r1 = 1238(0x4d6, float:1.735E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            int r3 = r0 + 1
            int r3 = r3 - r4
            if (r3 > 0) goto L_0x0089
            X.1vp r3 = r6.A08
            r2 = 2
            r1 = 0
            X.4U4 r0 = new X.4U4
            r0.<init>(r2, r1, r1)
            r3.A0E(r0)
            return
        L_0x0089:
            int r2 = r6.A00
            if (r3 >= r2) goto L_0x0098
            X.1vp r1 = r6.A08
            X.4U4 r0 = new X.4U4
            r0.<init>(r5, r3, r2)
            r1.A0E(r0)
            return
        L_0x0098:
            r6.A0T(r5)
            return
        L_0x009c:
            int r1 = r7.A01
            java.lang.Object r3 = r7.A02
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r3 = (com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment) r3
            r0 = 46
            if (r1 != r0) goto L_0x00c0
            X.8qp r1 = new X.8qp
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0i()
            r1.A00 = r0
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r3.A02
            if (r0 == 0) goto L_0x00d3
            r0.CC7(r1)
        L_0x00c0:
            X.00H r0 = r3.A04
            if (r0 == 0) goto L_0x00d6
            X.1o3 r2 = X.AnonymousClass3MW.A0a(r0)
            X.1FL r1 = r3.A1D()
            java.lang.String r0 = "about-chatting-with-businesses"
            r2.A01(r1, r0)
            goto L_0x0154
        L_0x00d3:
            java.lang.String r0 = "wamRuntime"
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r0 = "contextualHelpHandler"
        L_0x00d8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00dd:
            java.lang.Object r3 = r7.A02
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r3 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r3
            int r4 = r7.A01
            X.3zG r1 = r3.A05
            r2 = 2
            if (r1 == 0) goto L_0x00f3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            X.18K r0 = r3.A04
            r0.CC7(r1)
        L_0x00f3:
            r0 = 30
            if (r4 != r0) goto L_0x011c
            X.8qp r1 = new X.8qp
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.18K r0 = r3.A04
            r0.CC7(r1)
        L_0x010f:
            java.lang.String r0 = "https://faq.whatsapp.com/1148840052398648"
        L_0x0111:
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r0)
            X.1L9 r1 = r3.A00
            goto L_0x0166
        L_0x011c:
            r0 = 1
            if (r4 == r0) goto L_0x0129
            r0 = 4
            if (r4 == r0) goto L_0x0126
            r0 = 5
            if (r4 == r0) goto L_0x0126
            goto L_0x010f
        L_0x0126:
            java.lang.String r0 = "https://faq.whatsapp.com/1520500555178162"
            goto L_0x0111
        L_0x0129:
            java.lang.String r0 = "https://www.whatsapp.com/security"
            goto L_0x0111
        L_0x012c:
            java.lang.Object r3 = r7.A02
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r3 = (com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment) r3
            int r1 = r7.A01
            r0 = 1
            X.129 r2 = r3.A06
            if (r1 != r0) goto L_0x0158
            java.lang.String r0 = "28030015"
            android.net.Uri r4 = r2.A04(r0)
            X.0ve r2 = r3.A02
            r1 = 8926(0x22de, float:1.2508E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0160
            X.1o3 r2 = r3.A02
            java.lang.String r1 = "about-e2e-encryption"
            X.1FL r0 = r3.A1D()
            r2.A01(r0, r1)
        L_0x0154:
            r3.A28()
            return
        L_0x0158:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r4 = r2.A05(r1, r0)
        L_0x0160:
            android.content.Intent r2 = X.AnonymousClass3MY.A07(r4)
            X.1L9 r1 = r3.A00
        L_0x0166:
            android.content.Context r0 = r3.A14()
            r1.A08(r0, r2)
            goto L_0x0154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4at.onClick(android.content.DialogInterface, int):void");
    }
}
