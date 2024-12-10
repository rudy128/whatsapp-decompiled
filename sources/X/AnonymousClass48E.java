package X;

import android.widget.TextView;

/* renamed from: X.48E  reason: invalid class name */
public class AnonymousClass48E extends C89564cf {
    public final int A00;
    public final Object A01;

    public AnonymousClass48E(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new AnonymousClass48E(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0348, code lost:
        if (r0.intValue() == 2) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x045b, code lost:
        if (r1.A72 != false) goto L_0x045d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0474, code lost:
        if (r6 != false) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0478, code lost:
        r7 = X.AnonymousClass3MZ.A0a(r1);
        r6 = r1.A3R;
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0483, code lost:
        if (X.C22971Dz.A0V(r6) == false) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0485, code lost:
        r0 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0487, code lost:
        r7.A00(r6, 1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017b, code lost:
        if (r5 != null) goto L_0x017d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r19) {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A00
            r9 = r19
            switch(r0) {
                case 1: goto L_0x0200;
                case 2: goto L_0x0009;
                case 3: goto L_0x048c;
                case 4: goto L_0x00ee;
                case 5: goto L_0x01df;
                case 6: goto L_0x02af;
                case 7: goto L_0x029a;
                case 8: goto L_0x0009;
                case 9: goto L_0x0009;
                case 10: goto L_0x0286;
                case 11: goto L_0x01b6;
                case 12: goto L_0x0009;
                case 13: goto L_0x0262;
                case 14: goto L_0x0009;
                case 15: goto L_0x00ad;
                case 16: goto L_0x000d;
                case 17: goto L_0x0232;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.afterTextChanged(r9)
        L_0x000c:
            return
        L_0x000d:
            if (r19 == 0) goto L_0x000c
            java.lang.Object r6 = r5.A01
            com.whatsapp.text.FinalBackspaceAwareEntry r6 = (com.whatsapp.text.FinalBackspaceAwareEntry) r6
            java.lang.String r0 = r9.toString()
            boolean r0 = com.whatsapp.text.FinalBackspaceAwareEntry.A0B(r0)
            if (r0 != 0) goto L_0x0085
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0085
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r7 = r0.iterator()
        L_0x0029:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r7.next()
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            com.whatsapp.search.views.TokenizedSearchInput r5 = r0.A00
            int r0 = r5.A00
            r4 = 1
            if (r0 != r4) goto L_0x0046
            X.1bI r0 = r5.A0f
        L_0x003e:
            android.view.View r0 = r0.A02()
        L_0x0042:
            com.whatsapp.search.views.TokenizedSearchInput.A06(r0, r5)
            goto L_0x0029
        L_0x0046:
            r1 = 2
            if (r0 != r1) goto L_0x004c
            X.1bI r0 = r5.A0c
            goto L_0x003e
        L_0x004c:
            r3 = 3
            if (r0 != r3) goto L_0x0052
            X.1bI r0 = r5.A0e
            goto L_0x003e
        L_0x0052:
            r2 = 5
            if (r0 != r2) goto L_0x0058
            com.google.android.material.chip.Chip r0 = r5.A02
            goto L_0x0042
        L_0x0058:
            if (r0 != 0) goto L_0x0029
            com.whatsapp.jid.UserJid r0 = r5.A0B
            if (r0 != 0) goto L_0x007e
            java.lang.Integer r0 = r5.A0L
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x006e
            r0 = 98
            if (r1 == r0) goto L_0x006e
            r5.setFocus(r4)
            goto L_0x0029
        L_0x006e:
            X.77Z r0 = r5.A0D
            if (r0 == 0) goto L_0x0076
            r5.setFocus(r3)
            goto L_0x0029
        L_0x0076:
            X.77M r0 = r5.A0C
            if (r0 == 0) goto L_0x0029
            r5.setFocus(r2)
            goto L_0x0029
        L_0x007e:
            r5.setFocus(r1)
            goto L_0x0029
        L_0x0082:
            com.whatsapp.text.FinalBackspaceAwareEntry.A0A(r9, r6)
        L_0x0085:
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L_0x000c
            java.util.Iterator r3 = r0.iterator()
        L_0x008d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r2 = r3.next()
            X.4M1 r2 = (X.AnonymousClass4M1) r2
            android.text.Editable r0 = com.whatsapp.text.FinalBackspaceAwareEntry.A08(r9)
            java.lang.String r1 = r0.toString()
            com.whatsapp.search.views.TokenizedSearchInput r0 = r2.A00
            X.5c1 r0 = r0.A0F
            if (r0 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            r0.CKI(r1)
            goto L_0x008d
        L_0x00ad:
            r1 = 0
            X.C18070vi.A0d(r9, r1)
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = X.AnonymousClass1YF.A0I(r0)
            java.lang.Object r0 = r5.A01
            com.whatsapp.settings.SettingsSetupUserProxyActivity r0 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r0
            X.0vl r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r3 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r3
            X.C18070vi.A0d(r4, r1)
            X.4Yf r0 = r3.A0T()
            java.lang.String r0 = r0.A03
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x000c
            X.4Yf r0 = r3.A0T()
            int r2 = r0.A00
            X.4Yf r0 = r3.A0T()
            int r1 = r0.A01
            X.4Yf r0 = r3.A0T()
            boolean r0 = r0.A06
            X.4Yf r0 = X.AnonymousClass4HR.A00(r4, r2, r1, r0)
            com.whatsapp.settings.SettingsSetupUserProxyViewModel.A00(r0, r3)
            return
        L_0x00ee:
            java.lang.Object r0 = r5.A01
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            X.3U2 r2 = r0.A0A
            if (r2 != 0) goto L_0x00fa
            java.lang.String r0 = "editMessageViewModel"
            goto L_0x04ad
        L_0x00fa:
            com.whatsapp.mentions.MentionableEntry r3 = r0.A0G
            if (r3 != 0) goto L_0x0102
            java.lang.String r0 = "entry"
            goto L_0x04ad
        L_0x0102:
            r10 = 0
            java.lang.String r0 = r3.getStringText()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = X.C26302CxJ.A0G(r0, r10)
            r2.A00 = r0
            X.206 r1 = r2.A0B
            boolean r0 = r1 instanceof X.C438921i
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x019f
            X.21i r1 = (X.C438921i) r1
            java.lang.String r1 = r1.A01
        L_0x0120:
            java.lang.String r0 = r2.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            r7 = 0
            if (r0 != 0) goto L_0x012f
            r7 = 1
            X.1DT r0 = r2.A05
            r0.A0E(r5)
        L_0x012f:
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x0139
            int r0 = r0.length()
            if (r0 != 0) goto L_0x017f
        L_0x0139:
            X.1DT r1 = r2.A04
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C18070vi.A18(r0, r5)
            if (r0 != 0) goto L_0x014b
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x017f
        L_0x014b:
            r1.A0E(r6)
        L_0x014e:
            X.7Fe r0 = r2.A07
            X.3TA r6 = r2.A08
            X.7Fe r5 = r6.A00
            if (r0 == 0) goto L_0x017a
            if (r5 == 0) goto L_0x017d
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = r5.A0S
            boolean r0 = android.text.TextUtils.equals(r1, r0)
        L_0x0160:
            r0 = r0 ^ 1
            if (r7 != 0) goto L_0x0167
            if (r0 != 0) goto L_0x0167
            r4 = 0
        L_0x0167:
            r2.A02 = r4
            X.205 r0 = r2.A0C
            X.1BI r8 = r0.A00
            if (r8 == 0) goto L_0x000c
            android.text.Editable r7 = r3.getEditableText()
            X.00H r9 = r2.A0E
            r11 = r10
            r6.A0W(r7, r8, r9, r10, r11)
            return
        L_0x017a:
            r0 = 1
            if (r5 == 0) goto L_0x0160
        L_0x017d:
            r0 = 0
            goto L_0x0160
        L_0x017f:
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x014e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x014e
            X.1DT r1 = r2.A04
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C18070vi.A18(r0, r6)
            if (r0 != 0) goto L_0x019b
            java.lang.Object r0 = r1.A06()
            if (r0 != 0) goto L_0x014e
        L_0x019b:
            r1.A0E(r5)
            goto L_0x014e
        L_0x019f:
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x01ab
            X.21V r1 = (X.AnonymousClass21V) r1
            java.lang.String r1 = r1.A18()
            goto L_0x0120
        L_0x01ab:
            if (r1 == 0) goto L_0x01b3
            java.lang.String r1 = r1.A0P()
            goto L_0x0120
        L_0x01b3:
            r1 = 0
            goto L_0x0120
        L_0x01b6:
            r1 = 0
            X.C18070vi.A0d(r9, r1)
            java.lang.Object r4 = r5.A01
            com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment r4 = (com.whatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment) r4
            java.lang.String r0 = r9.toString()
            java.lang.String r3 = X.C26302CxJ.A0G(r0, r1)
            X.C18070vi.A0X(r3)
            r4.A0A = r3
            com.whatsapp.wds.components.button.WDSButton r2 = r4.A09
            if (r2 == 0) goto L_0x000c
            X.11C r1 = r4.A03
            if (r1 == 0) goto L_0x04a8
            X.0vc r0 = r4.A08
            if (r0 == 0) goto L_0x04ab
            boolean r0 = X.C26302CxJ.A0V(r1, r0, r3)
            r2.setEnabled(r0)
            return
        L_0x01df:
            java.lang.Object r3 = r5.A01
            X.4aY r3 = (X.AnonymousClass4aY) r3
            boolean r0 = r3.A6o
            if (r0 != 0) goto L_0x000c
            java.lang.String r0 = r9.toString()
            int r0 = r0.length()
            r2 = 0
            if (r0 == 0) goto L_0x04b2
            X.1iW r1 = X.AnonymousClass3MX.A0X(r3)
            X.1E7 r0 = r3.A35
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            r1.A0Q(r0, r2)
            return
        L_0x0200:
            java.lang.Object r4 = r5.A01
            X.3dz r4 = (X.C75093dz) r4
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            java.lang.String r2 = "secretCodeEditText"
            r1 = 0
            if (r0 != 0) goto L_0x020f
            X.C18070vi.A11(r2)
            throw r1
        L_0x020f:
            android.os.Handler r0 = r0.getHandler()
            if (r0 == 0) goto L_0x0218
            r0.removeCallbacksAndMessages(r1)
        L_0x0218:
            com.google.android.material.textfield.TextInputEditText r0 = r4.A00
            if (r0 != 0) goto L_0x0220
            X.C18070vi.A11(r2)
            throw r1
        L_0x0220:
            android.os.Handler r3 = r0.getHandler()
            if (r3 == 0) goto L_0x000c
            r0 = 5
            X.4rf r2 = new X.4rf
            r2.<init>(r4, r0)
            r0 = 250(0xfa, double:1.235E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x0232:
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.lang.String r0 = r9.toString()
            java.lang.String r3 = X.AnonymousClass1YF.A0I(r0)
            java.lang.Object r2 = r5.A01
            com.whatsapp.twofactor.SetEmailFragment r2 = (com.whatsapp.twofactor.SetEmailFragment) r2
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x025b
            r0 = 2
            if (r1 != r0) goto L_0x0257
            android.widget.TextView r0 = r2.A02
            if (r0 == 0) goto L_0x0251
            X.AnonymousClass3MW.A1S(r0)
        L_0x0251:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            if (r0 == 0) goto L_0x0257
            r0.A05 = r3
        L_0x0257:
            com.whatsapp.twofactor.SetEmailFragment.A00(r2)
            return
        L_0x025b:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r2.A05
            if (r0 == 0) goto L_0x0257
            r0.A04 = r3
            goto L_0x0257
        L_0x0262:
            r4 = 0
            X.C18070vi.A0d(r9, r4)
            int r3 = r9.length()
            r2 = 8
            java.lang.Object r1 = r5.A01
            com.whatsapp.labelitem.view.bottomsheet.NewLabelView r1 = (com.whatsapp.labelitem.view.bottomsheet.NewLabelView) r1
            com.whatsapp.WaImageView r0 = r1.A0E
            if (r3 != 0) goto L_0x027d
            r0.setVisibility(r2)
            com.whatsapp.WaImageView r0 = r1.A0D
            r0.setVisibility(r4)
            return
        L_0x027d:
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r1.A0D
            r0.setVisibility(r2)
            return
        L_0x0286:
            java.lang.Object r0 = r5.A01
            com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment r0 = (com.whatsapp.emojiedittext.EmojiEditTextBottomSheetDialogFragment) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A0I
            java.lang.String r0 = r9.toString()
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            return
        L_0x029a:
            java.lang.Object r2 = r5.A01
            X.4aY r2 = (X.AnonymousClass4aY) r2
            X.3UY r1 = r2.A2Z
            java.lang.String r0 = r9.toString()
            r1.A0U(r0)
            java.lang.String r0 = r9.toString()
            X.AnonymousClass4aY.A1c(r2, r0)
            return
        L_0x02af:
            java.lang.String r2 = r9.toString()
            boolean r6 = X.AnonymousClass1EG.A0H(r2)
            java.lang.Object r1 = r5.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.AnonymousClass4aY.A0w(r1)
            X.3V4 r0 = r1.A2Y
            r0.A0X(r6)
            X.3V0 r0 = r1.A2c
            r0.A0U(r6)
            boolean r0 = r1.A6s
            r8 = 2
            r3 = 0
            r4 = 1
            if (r6 == r0) goto L_0x0460
            r1.A6s = r6
            boolean r0 = X.AnonymousClass4aY.A21(r1)
            if (r6 == 0) goto L_0x03ec
            if (r0 != 0) goto L_0x02e8
            android.view.View r5 = r1.A0J
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r0 = X.C88404Zo.A00(r0, r4, r3)
            r5.startAnimation(r0)
        L_0x02e8:
            boolean r0 = X.AnonymousClass4aY.A25(r1)
            if (r0 != 0) goto L_0x0304
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r5 = X.C88404Zo.A00(r0, r4, r4)
            android.widget.ImageButton r0 = r1.A0X
            r0.startAnimation(r5)
            android.widget.ImageButton r0 = r1.A0Y
            if (r0 == 0) goto L_0x0304
            r0.startAnimation(r5)
        L_0x0304:
            X.AnonymousClass4aY.A1P(r1, r3)
            X.1R2 r5 = r1.A3s
            X.1BI r0 = r1.A3R
            int r6 = r5.A0H(r0)
            boolean r0 = X.AnonymousClass4aY.A2D(r1, r6)
            if (r0 == 0) goto L_0x0338
            X.1bI r0 = r1.A4T
            int r0 = r0.A01()
            if (r0 == 0) goto L_0x0338
            X.1bI r0 = r1.A4T
            r0.A04(r3)
            X.1bI r0 = r1.A4T
            android.view.View r5 = r0.A02()
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r0 = X.C88404Zo.A00(r0, r4, r4)
            r5.startAnimation(r0)
            X.AnonymousClass4aY.A1M(r1, r6)
        L_0x0338:
            boolean r0 = r1.A72
            if (r0 != 0) goto L_0x045d
            X.4R4 r0 = X.AnonymousClass3MZ.A0a(r1)
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0358
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x0358
        L_0x034a:
            X.4R4 r5 = X.AnonymousClass3MZ.A0a(r1)
            java.lang.String r0 = r5.A01
            if (r0 != 0) goto L_0x0358
            java.lang.String r0 = X.C17890vO.A0Q()
            r5.A01 = r0
        L_0x0358:
            X.4R4 r7 = X.AnonymousClass3MZ.A0a(r1)
            X.1BI r6 = r1.A3R
            boolean r5 = X.C22971Dz.A0V(r6)
            r0 = 4
            if (r5 == 0) goto L_0x0367
            r0 = 26
        L_0x0367:
            r7.A00(r6, r8, r0)
        L_0x036a:
            X.3TA r8 = r1.A2d
            X.0vq r11 = r1.A2K()
            X.1BI r0 = r1.A3R
            r10 = r0
            r12 = r3
            r13 = r4
            r8.A0W(r9, r10, r11, r12, r13)
            X.0ve r13 = r1.A3F
            X.1FY r8 = X.AnonymousClass3MW.A0P(r1)
            X.5cQ r0 = r1.A2Q
            X.1KW r12 = r0.getEmojiLoader()
            X.5cQ r0 = r1.A2Q
            X.11C r11 = r0.getSystemServices()
            X.0vc r14 = r1.A3x
            com.whatsapp.mentions.MentionableEntry r0 = r1.A3Z
            android.text.TextPaint r10 = r0.getPaint()
            X.1FY r6 = X.AnonymousClass3MW.A0Q(r1)
            r5 = 2130970892(0x7f04090c, float:1.7550507E38)
            r0 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r15 = X.AnonymousClass1YL.A00(r6, r5, r0)
            X.1FY r6 = X.AnonymousClass3MW.A0Q(r1)
            r5 = 2130970132(0x7f040614, float:1.7548965E38)
            r0 = 2131101250(0x7f060642, float:1.7814904E38)
            int r16 = X.AnonymousClass1YL.A00(r6, r5, r0)
            r17 = r4
            X.C26302CxJ.A0L(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r1)
            X.00H r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.6pA r0 = (X.AnonymousClass6pA) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x03d8
            X.6nN r0 = r1.A47
            if (r0 == 0) goto L_0x03d8
            X.5cQ r0 = r1.A2Q
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r0.getEmojiSearchProvider()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x03d8
            X.6nN r0 = r1.A47
            r0.A00(r2)
        L_0x03d8:
            X.3RG r0 = r1.A1h
            if (r0 == 0) goto L_0x03e8
            X.C18070vi.A0d(r2, r3)
            X.3Uy r0 = r0.getViewModel()
            r0.A01 = r2
            X.C73343Uy.A00(r0)
        L_0x03e8:
            X.AnonymousClass4aY.A1D(r1)
            return
        L_0x03ec:
            if (r0 != 0) goto L_0x03fd
            android.view.View r6 = r1.A0J
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r0 = X.C88404Zo.A00(r0, r3, r3)
            r6.startAnimation(r0)
        L_0x03fd:
            boolean r0 = X.AnonymousClass4aY.A25(r1)
            if (r0 != 0) goto L_0x041d
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r6 = X.C88404Zo.A00(r0, r3, r4)
            r0 = 6
            X.C74613c2.A00(r6, r5, r0)
            android.widget.ImageButton r0 = r1.A0X
            r0.startAnimation(r6)
            android.widget.ImageButton r0 = r1.A0Y
            if (r0 == 0) goto L_0x041d
            r0.startAnimation(r6)
        L_0x041d:
            X.1R2 r5 = r1.A3s
            X.1BI r0 = r1.A3R
            int r0 = r5.A0H(r0)
            boolean r0 = X.AnonymousClass4aY.A2D(r1, r0)
            if (r0 == 0) goto L_0x0459
            X.1bI r0 = r1.A4T
            int r5 = r0.A01()
            r0 = 8
            if (r5 == r0) goto L_0x0459
            X.0vb r0 = r1.A2k
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            android.view.animation.AnimationSet r6 = X.C88404Zo.A00(r0, r3, r4)
            X.1bI r0 = r1.A4T
            android.view.View r5 = r0.A02()
            r0 = 3
            X.C74613c2.A00(r6, r5, r0)
            X.1bI r0 = r1.A4T
            android.view.View r0 = r0.A02()
            r0.startAnimation(r6)
            android.animation.ObjectAnimator r0 = r1.A09
            if (r0 == 0) goto L_0x0459
            r0.cancel()
        L_0x0459:
            boolean r0 = r1.A72
            if (r0 == 0) goto L_0x0478
        L_0x045d:
            r1.A72 = r3
            return
        L_0x0460:
            X.4R4 r0 = X.AnonymousClass3MZ.A0a(r1)
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x036a
            java.lang.String r0 = r1.A6V
            int r5 = r0.length()
            int r0 = r2.length()
            if (r5 == r0) goto L_0x036a
            if (r6 == 0) goto L_0x0478
            goto L_0x034a
        L_0x0478:
            X.4R4 r7 = X.AnonymousClass3MZ.A0a(r1)
            X.1BI r6 = r1.A3R
            boolean r5 = X.C22971Dz.A0V(r6)
            r0 = 4
            if (r5 == 0) goto L_0x0487
            r0 = 26
        L_0x0487:
            r7.A00(r6, r4, r0)
            goto L_0x036a
        L_0x048c:
            java.lang.Object r4 = r5.A01
            X.3pI r4 = (X.C77063pI) r4
            com.whatsapp.WaEditText r0 = r4.A08
            android.content.Context r3 = r0.getContext()
            com.whatsapp.WaEditText r0 = r4.A08
            android.text.TextPaint r2 = r0.getPaint()
            X.1KW r1 = r4.A0D
            X.0ve r0 = r4.A0E
            X.C43251zV.A07(r3, r2, r9, r1, r0)
            r0 = 0
            r4.A4b(r0)
            return
        L_0x04a8:
            java.lang.String r0 = "systemServices"
            goto L_0x04ad
        L_0x04ab:
            java.lang.String r0 = "sharedPreferencesFactory"
        L_0x04ad:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x04b2:
            r3.A6i = r2
            X.1iW r1 = X.AnonymousClass3MX.A0X(r3)
            X.1E7 r0 = r3.A35
            X.1BI r0 = X.AnonymousClass1E7.A00(r0)
            r1.A0P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48E.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (6 - this.A00 != 0) {
            super.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        ((AnonymousClass4aY) this.A01).A6V = charSequence.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (X.AnonymousClass3MZ.A0v(r3).A0V() != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
        r2.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        X.C18070vi.A11("submitButton");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0171, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018e, code lost:
        r1.setEnabled(X.AnonymousClass000.A1R(r0.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x015f;
                case 1: goto L_0x0172;
                case 2: goto L_0x00e0;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x013e;
                case 7: goto L_0x0005;
                case 8: goto L_0x00a3;
                case 9: goto L_0x0009;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0053;
                case 13: goto L_0x0005;
                case 14: goto L_0x00f8;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onTextChanged(r7, r8, r9, r10)
        L_0x0008:
            return
        L_0x0009:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r2 = r6.A01
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity r2 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportActivity) r2
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A06
            if (r1 == 0) goto L_0x016b
            int r0 = r7.length()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1.setEnabled(r0)
            X.0vl r0 = r2.A09
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel r3 = (com.whatsapp.dogfood.DogfooderDiagnosticsDetailReportViewModel) r3
            java.lang.String r2 = r7.toString()
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r2)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C18070vi.A0X(r0)
            int r1 = r0.length()
            r0 = 10
            X.1DT r2 = r3.A00
            if (r1 < r0) goto L_0x0050
            X.3xn r0 = X.C80693xn.A00
            goto L_0x009f
        L_0x0050:
            X.3xm r0 = X.C80683xm.A00
            goto L_0x009f
        L_0x0053:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r3 = r6.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r3 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r3
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A0K
            if (r2 == 0) goto L_0x016b
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0070
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = X.AnonymousClass3MZ.A0v(r3)
            boolean r1 = r0.A0V()
            r0 = 1
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 0
        L_0x0071:
            r2.setEnabled(r0)
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r3 = X.AnonymousClass3MZ.A0v(r3)
            java.lang.String r2 = r7.toString()
            java.lang.String r0 = "[^\\p{L}\\p{N}\\p{P}\\p{Z}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r0)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r2)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r0)
            X.C18070vi.A0X(r0)
            int r1 = r0.length()
            r0 = 10
            if (r1 < r0) goto L_0x0008
            X.1DT r2 = r3.A06
            X.41M r0 = X.AnonymousClass41M.A00
        L_0x009f:
            r2.A0F(r0)
            return
        L_0x00a3:
            java.lang.Object r5 = r6.A01
            X.4VR r5 = (X.AnonymousClass4VR) r5
            int r1 = r5.A00
            r0 = 2
            if (r1 == r0) goto L_0x00af
            r0 = 3
            if (r1 != r0) goto L_0x0008
        L_0x00af:
            int r4 = r7.length()
            X.Akb r1 = r5.A05
            if (r1 != 0) goto L_0x00d6
            r0 = 21
            X.3Bq r2 = new X.3Bq
            r2.<init>(r5, r0)
            r0 = 22
            X.3Bq r1 = new X.3Bq
            r1.<init>(r5, r0)
            r0 = 45
            X.Akb r3 = new X.Akb
            r3.<init>((java.lang.Object) r2, (int) r4, (int) r0, (java.lang.Object) r1)
            r5.A05 = r3
        L_0x00ce:
            X.1KB r2 = r5.A0L
            r0 = 275(0x113, double:1.36E-321)
            r2.A0K(r3, r0)
            return
        L_0x00d6:
            X.1KB r0 = r5.A0L
            r0.A0I(r1)
            X.Akb r3 = r5.A05
            r3.A00 = r4
            goto L_0x00ce
        L_0x00e0:
            if (r7 == 0) goto L_0x00ec
            java.lang.Object r1 = r6.A01
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r1 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r1
            java.lang.String r0 = r7.toString()
            r1.A04 = r0
        L_0x00ec:
            java.lang.Object r0 = r6.A01
            com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet r0 = (com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A03
            if (r1 == 0) goto L_0x0008
            java.lang.String r0 = r0.A04
            goto L_0x018e
        L_0x00f8:
            java.lang.Object r4 = r6.A01
            com.whatsapp.mediacomposer.ui.caption.CaptionView r4 = (com.whatsapp.mediacomposer.ui.caption.CaptionView) r4
            java.lang.CharSequence r0 = r4.getCaptionText()
            if (r0 == 0) goto L_0x0137
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0137
            java.lang.CharSequence r0 = r4.A06
            if (r0 == 0) goto L_0x0112
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0137
        L_0x0112:
            X.0vk r0 = r4.A07
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0137
            int r3 = r0.intValue()
            X.00H r0 = r4.getMediaSharingUserJourneyLogger()
            java.lang.Object r2 = r0.get()
            X.A4v r2 = (X.C20050A4v) r2
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 9
            r2.A02(r1, r0, r3)
        L_0x0137:
            java.lang.CharSequence r0 = r4.getCaptionText()
            r4.A06 = r0
            return
        L_0x013e:
            java.lang.Object r0 = r6.A01
            X.4aY r0 = (X.AnonymousClass4aY) r0
            X.3TA r3 = r0.A2d
            r2 = 0
            if (r10 <= r9) goto L_0x015c
            int r10 = r10 + r8
            int r1 = java.lang.Character.codePointCount(r7, r8, r10)
            r0 = 1
            if (r1 > r0) goto L_0x015b
            if (r1 != r0) goto L_0x015c
            int r0 = java.lang.Character.codePointAt(r7, r8)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x015c
        L_0x015b:
            r2 = 1
        L_0x015c:
            r3.A0C = r2
            return
        L_0x015f:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r0 = r6.A01
            X.1Di r0 = (X.C22821Di) r0
            r0.invoke(r7)
            return
        L_0x016b:
            java.lang.String r0 = "submitButton"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0172:
            if (r7 == 0) goto L_0x0182
            java.lang.Object r2 = r6.A01
            X.3dz r2 = (X.C75093dz) r2
            java.lang.String r1 = r7.toString()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r2.A06 = r1
        L_0x0182:
            java.lang.Object r0 = r6.A01
            X.3dz r0 = (X.C75093dz) r0
            com.whatsapp.wds.components.button.WDSButton r1 = r0.A4c()
            java.lang.String r0 = r0.A4d()
        L_0x018e:
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48E.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
