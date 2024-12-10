package X;

import android.view.View;

/* renamed from: X.48h  reason: invalid class name and case insensitive filesystem */
public class C825248h extends C38471rL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C825248h(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C825248h(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: com.whatsapp.calling.spam.CallSpamActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: com.whatsapp.calling.callhistory.group.GroupCallLogActivity} */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.whatsapp.languageselector.LanguageSelectorBottomSheet, com.whatsapp.languageselector.Hilt_LanguageSelectorBottomSheet, java.lang.Object, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: type inference failed for: r1v96, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0391, code lost:
        if (r0 != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0393, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0396, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0561, code lost:
        r3.A08(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0564, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x068a, code lost:
        r0 = "parentJid";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x07a8, code lost:
        r1.A0M = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x07aa, code lost:
        if (r0 == false) goto L_0x07bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x07ac, code lost:
        r0 = "call_spam_dialog_report";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x07ae, code lost:
        r1.A0K = r0;
        r1.A1R((android.os.Bundle) r15.A02);
        X.C72453Mb.A1I(r1, (X.AnonymousClass1FL) r15.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07bf, code lost:
        r0 = "call_spam_dialog_block";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x08c3, code lost:
        ((java.lang.Runnable) r0).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x08c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x095d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0961, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09dc, code lost:
        X.AnonymousClass3MX.A1K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.view.View r16) {
        /*
            r15 = this;
            r5 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x094b;
                case 1: goto L_0x093c;
                case 2: goto L_0x092f;
                case 3: goto L_0x0915;
                case 4: goto L_0x090d;
                case 5: goto L_0x08db;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x08c9;
                case 9: goto L_0x089d;
                case 10: goto L_0x0881;
                case 11: goto L_0x0851;
                case 12: goto L_0x082c;
                case 13: goto L_0x0817;
                case 14: goto L_0x09cc;
                case 15: goto L_0x0397;
                case 16: goto L_0x07fd;
                case 17: goto L_0x0989;
                case 18: goto L_0x07e3;
                case 19: goto L_0x0374;
                case 20: goto L_0x0357;
                case 21: goto L_0x07c2;
                case 22: goto L_0x07a2;
                case 23: goto L_0x00b8;
                case 24: goto L_0x079b;
                case 25: goto L_0x0336;
                case 26: goto L_0x074e;
                case 27: goto L_0x071b;
                case 28: goto L_0x06b9;
                case 29: goto L_0x069a;
                case 30: goto L_0x068e;
                case 31: goto L_0x065a;
                case 32: goto L_0x0545;
                case 33: goto L_0x0565;
                case 34: goto L_0x051e;
                case 35: goto L_0x0500;
                case 36: goto L_0x04e2;
                case 37: goto L_0x04de;
                case 38: goto L_0x02fc;
                case 39: goto L_0x02e0;
                case 40: goto L_0x04a8;
                case 41: goto L_0x0467;
                case 42: goto L_0x0252;
                case 43: goto L_0x011e;
                case 44: goto L_0x0431;
                case 45: goto L_0x0412;
                case 46: goto L_0x03f6;
                case 47: goto L_0x03ba;
                case 48: goto L_0x03ae;
                case 49: goto L_0x03a6;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r15.A01
            X.4i3 r4 = (X.C92874i3) r4
            java.lang.Object r7 = r15.A02
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            boolean r0 = X.C42701yb.A01(r7)
            if (r0 == 0) goto L_0x0045
            X.00H r0 = r4.A1B
            java.lang.Object r0 = r0.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            X.24e r2 = r0.A02(r7)
            if (r2 == 0) goto L_0x0045
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.String r0 = r2.A0F
            r1.A0C = r0
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A06 = r0
            java.lang.String r0 = X.C50542Uv.A00()
            r1.A0E = r0
            X.18K r0 = r4.A0v
            r0.CC7(r1)
        L_0x0045:
            r0 = 9
            X.C92874i3.A02(r4, r0)
            r6 = 1
            X.C92874i3.A03(r4, r6)
            com.whatsapp.biz.viewmodel.BusinessDetailsViewModel r1 = r4.A0h
            X.1E7 r0 = r1.A00
            if (r0 == 0) goto L_0x0067
            boolean r0 = X.C92874i3.A0A(r4)
            if (r0 == 0) goto L_0x0067
            X.6mK r3 = r4.A17
            X.1E7 r0 = r1.A00
            int r2 = r0.A00
            java.lang.Integer r1 = r3.A00
            r0 = 8
            r3.A00(r1, r0, r2)
        L_0x0067:
            com.whatsapp.chatinfo.ContactInfoActivity r5 = r4.A0l
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A0C(r5, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r2 = r1.addFlags(r0)
            java.lang.String r1 = "jid"
            java.lang.String r0 = r7.getRawString()
            android.content.Intent r1 = r2.putExtra(r1, r0)
            java.lang.String r0 = "args_conversation_screen_entry_point"
            android.content.Intent r2 = r1.putExtra(r0, r6)
            java.lang.String r1 = "referrer_action"
            r0 = 7
            android.content.Intent r3 = r2.putExtra(r1, r0)
            java.lang.Integer r0 = r4.A1E
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.intValue()
            r0 = 19
            if (r1 == r0) goto L_0x00b2
            r0 = 20
            if (r1 != r0) goto L_0x00b5
            java.lang.String r1 = "custom_qr_code_link"
        L_0x009d:
            java.lang.String r0 = "entry_point_conversion_source"
            android.content.Intent r2 = r3.putExtra(r0, r1)
            java.lang.String r1 = "entry_point_conversion_app"
            java.lang.String r0 = "whatsapp"
            r2.putExtra(r1, r0)
            X.1L9 r1 = r4.A0S
            java.lang.String r0 = "ContactInfoActivity"
            r1.A0B(r5, r3, r0)
        L_0x00b1:
            return
        L_0x00b2:
            java.lang.String r1 = "custom_link"
            goto L_0x009d
        L_0x00b5:
            java.lang.String r1 = "biz_profile"
            goto L_0x009d
        L_0x00b8:
            java.lang.Object r3 = r15.A01
            com.whatsapp.calling.spam.CallSpamActivity r3 = (com.whatsapp.calling.spam.CallSpamActivity) r3
            X.1Mc r1 = r3.A01
            java.lang.Object r6 = r15.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            r0 = 1
            boolean r0 = r1.A08(r6, r0)
            if (r0 != 0) goto L_0x0393
            X.1Mc r5 = r3.A01
            r4 = 0
            java.util.ArrayList r0 = X.C24901Mc.A01(r5)
            if (r0 == 0) goto L_0x0119
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
        L_0x00d6:
            boolean r0 = r2.contains(r6)
            if (r0 != 0) goto L_0x010f
            int r0 = r2.size()
            int r1 = r0 + 1
            r0 = 50
            if (r1 <= r0) goto L_0x00e9
            r2.remove(r4)
        L_0x00e9:
            r2.add(r6)
            java.lang.String r1 = ","
            r0 = 0
            java.lang.String r2 = X.C29431cG.A0h(r1, r2, r0)
            X.1La r1 = r5.A02
            java.lang.String r0 = "call_not_spam_jids"
            r1.A06(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "spamManager/setCallNotSpamProp/true: "
            r1.append(r0)
            r1.append(r2)
        L_0x0106:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0393
        L_0x010f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "spamManager/setCallNotSpamProp/false/already contains jid in size: "
            X.C17890vO.A14(r0, r1, r2)
            goto L_0x0106
        L_0x0119:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            goto L_0x00d6
        L_0x011e:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.util.List r0 = X.C42011xT.A0I
            boolean r0 = r5 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 != 0) goto L_0x012e
            java.lang.String r1 = "Given view is not ReactionEmojiTextView."
            r0 = 0
            X.C17960vV.A0F(r0, r1)
        L_0x012e:
            com.whatsapp.reactions.ReactionEmojiTextView r5 = (com.whatsapp.reactions.ReactionEmojiTextView) r5
            java.lang.Object r4 = r15.A02
            X.3Wo r4 = (X.C73593Wo) r4
            android.animation.AnimatorSet r0 = r4.A00
            if (r0 != 0) goto L_0x013f
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r4.A00 = r0
        L_0x013f:
            boolean r1 = r0.isRunning()
            r0 = 1
            if (r1 != r0) goto L_0x014d
            android.animation.AnimatorSet r0 = r4.A00
            if (r0 == 0) goto L_0x014d
            r0.cancel()
        L_0x014d:
            android.view.ViewGroup r0 = r4.A01
            java.lang.String r7 = "parent"
            if (r0 == 0) goto L_0x0957
            int r6 = r0.getChildCount()
            r3 = 0
        L_0x0158:
            if (r3 >= r6) goto L_0x0184
            android.view.ViewGroup r0 = r4.A01
            if (r0 == 0) goto L_0x0957
            android.view.View r2 = r0.getChildAt(r3)
            boolean r0 = r2 instanceof com.whatsapp.reactions.ReactionEmojiTextView
            if (r0 == 0) goto L_0x0181
            com.whatsapp.reactions.ReactionEmojiTextView r2 = (com.whatsapp.reactions.ReactionEmojiTextView) r2
            if (r2 == 0) goto L_0x0181
            boolean r0 = r2.isSelected()
            if (r0 == 0) goto L_0x0181
            boolean r0 = r2.equals(r5)
            if (r0 != 0) goto L_0x0181
            android.animation.AnimatorSet r1 = r4.A00
            if (r1 == 0) goto L_0x0181
            android.animation.AnimatorSet r0 = X.C74263Zd.A00(r2)
            r1.play(r0)
        L_0x0181:
            int r3 = r3 + 1
            goto L_0x0158
        L_0x0184:
            boolean r0 = r5.isSelected()
            android.animation.AnimatorSet r3 = r4.A00
            if (r0 == 0) goto L_0x01c3
            if (r3 == 0) goto L_0x0195
            android.animation.AnimatorSet r2 = X.C74263Zd.A00(r5)
        L_0x0192:
            r3.play(r2)
        L_0x0195:
            boolean r0 = r5.isSelected()
            if (r0 != 0) goto L_0x01ae
            X.0ve r2 = r4.A05
            r1 = 11728(0x2dd0, float:1.6434E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01ae
            X.10I r1 = r4.A08
            r0 = 48
            X.C98814rl.A00(r1, r4, r5, r0)
        L_0x01ae:
            android.animation.AnimatorSet r2 = r4.A00
            if (r2 == 0) goto L_0x01bb
            r1 = 1
            X.3Ml r0 = new X.3Ml
            r0.<init>(r4, r5, r1)
            r2.addListener(r0)
        L_0x01bb:
            android.animation.AnimatorSet r0 = r4.A00
            if (r0 == 0) goto L_0x00b1
            r0.start()
            return
        L_0x01c3:
            if (r3 == 0) goto L_0x0195
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r6 = 1065353216(0x3f800000, float:1.0)
            r10 = 1060320051(0x3f333333, float:0.7)
            r0 = 80
            float[] r6 = X.C72473Md.A1a(r6, r10)
            java.lang.String r12 = "foregroundScale"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r5, r12, r6)
            android.animation.ObjectAnimator r8 = r6.setDuration(r0)
            X.C18070vi.A0X(r8)
            android.view.animation.Interpolator r7 = X.AnonymousClass4IU.A01
            r8.setInterpolator(r7)
            r9 = 2
            X.3Mg r0 = new X.3Mg
            r0.<init>(r5, r10, r9)
            r8.addListener(r0)
            android.animation.Animator[] r11 = new android.animation.Animator[r9]
            r14 = 0
            r11[r14] = r8
            r6 = 1060320051(0x3f333333, float:0.7)
            r10 = 1065353216(0x3f800000, float:1.0)
            r0 = 80
            float[] r13 = new float[r9]
            r13[r14] = r6
            r6 = 1
            r13[r6] = r10
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r5, r12, r13)
            android.animation.ObjectAnimator r1 = r6.setDuration(r0)
            X.C18070vi.A0X(r1)
            r1.setInterpolator(r7)
            X.3Mg r0 = new X.3Mg
            r0.<init>(r5, r10, r9)
            r1.addListener(r0)
            r7 = 1
            r11[r7] = r1
            r2.playSequentially(r11)
            r6 = 0
            r0 = 250(0xfa, double:1.235E-321)
            float[] r11 = new float[r9]
            r11[r14] = r6
            r11[r7] = r10
            java.lang.String r6 = "backgroundScale"
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r5, r6, r11)
            android.animation.ObjectAnimator r1 = r6.setDuration(r0)
            X.C18070vi.A0X(r1)
            X.3Mg r0 = new X.3Mg
            r0.<init>(r5, r10, r7)
            r1.addListener(r0)
            android.view.animation.Interpolator r0 = X.C1409073n.A00
            r1.setInterpolator(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[r9]
            r0[r14] = r8
            r0[r7] = r1
            r2.playTogether(r0)
            r0 = 15
            X.AnonymousClass3Mo.A00(r2, r5, r0)
            goto L_0x0192
        L_0x0252:
            java.lang.Object r5 = r15.A01
            X.3sn r5 = (X.C78433sn) r5
            java.lang.Object r1 = r15.A02
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r4 = X.C18050vg.A01(r1, r0)
            X.1FU r4 = (X.AnonymousClass1FU) r4
            X.206 r2 = r5.A0I
            X.22U r2 = (X.AnonymousClass22U) r2
            if (r4 == 0) goto L_0x00b1
            com.whatsapp.jid.UserJid r0 = r2.A04
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r2.A0A
            if (r0 == 0) goto L_0x00b1
            X.A8Q r3 = r5.A0e
            r1 = 8
            r0 = 0
            r3.A08(r1, r0, r0)
            X.A6X r8 = r5.A03
            X.1BI r7 = r2.A0H()
            java.lang.String r6 = "received_cart"
            java.lang.String r3 = "from_cart"
            r0 = 1
            X.3zZ r1 = new X.3zZ
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r1.A03 = r6
            boolean r0 = X.AnonymousClass1EG.A0H(r3)
            if (r0 != 0) goto L_0x029c
            r1.A05 = r3
        L_0x029c:
            X.00H r0 = r8.A06
            java.lang.Object r0 = r0.get()
            X.2jg r0 = (X.C57812jg) r0
            r0.A00(r1, r7)
            X.18K r0 = r8.A02
            r0.CC7(r1)
            X.1QO r0 = r5.A01
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0962
            X.205 r3 = r2.A0v
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0962
            X.4Op r1 = r5.A02
            com.whatsapp.jid.UserJid r0 = r2.A04
            X.C17960vV.A07(r0)
            X.1BI r0 = r3.A00
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            X.C17960vV.A07(r0)
            java.lang.String r0 = r2.A08
            X.C17960vV.A07(r0)
            java.lang.String r0 = r2.A0A
            X.C17960vV.A07(r0)
            X.0zA r0 = r1.A00
            r0.A03()
            java.lang.String r0 = "getCreateOrderActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02e0:
            java.lang.Object r0 = r15.A02
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.1KB r0 = r0.A0S
            X.1FR r3 = r0.A00
            if (r3 == 0) goto L_0x00b1
            java.lang.Object r2 = r15.A01
            X.23z r2 = (X.C445823z) r2
            X.4Cu r1 = X.C82954Cu.EDIT
            X.4Cx r0 = X.C82984Cx.NONE
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C83664Ge.A00(r2, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            r3.CMk(r1, r0)
            return
        L_0x02fc:
            java.lang.Object r2 = r15.A01
            X.23z r2 = (X.C445823z) r2
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x00b1
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r15.A02
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.1nl r3 = r0.A0T
            android.content.Context r4 = X.AnonymousClass3MY.A04(r0)
            android.net.Uri r5 = android.net.Uri.parse(r1)
            boolean r1 = X.C22971Dz.A0f(r2)
            r0 = 24
            if (r1 == 0) goto L_0x0322
            r0 = 25
        L_0x0322:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "extra_call_lobby_entry_point"
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r1)
            java.util.Map r7 = X.C200610r.A04(r0)
            r6 = 0
            r8 = 0
            r3.CGX(r4, r5, r6, r7, r8)
            return
        L_0x0336:
            com.whatsapp.jid.UserJid r2 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r2 == 0) goto L_0x00b1
            X.1LU r1 = new X.1LU
            r1.<init>()
            java.lang.Object r3 = r15.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            android.content.Intent r2 = r1.A20(r3, r2, r0)
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = 7
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0357:
            java.lang.Object r0 = r15.A01
            X.3XM r0 = (X.AnonymousClass3XM) r0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r3 = r0.A01
            X.00H r0 = r3.A0K
            X.C72453Mb.A1P(r0)
            r4 = 1
            r0 = 0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity.A0Q(r3, r0, r4)
            X.1VP r2 = r3.A03
            java.lang.Object r1 = r15.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            r0 = 20
            int r0 = r2.CNw(r3, r1, r0, r4)
            goto L_0x0391
        L_0x0374:
            java.lang.Object r0 = r15.A01
            X.3XM r0 = (X.AnonymousClass3XM) r0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r3 = r0.A01
            X.00H r0 = r3.A0K
            X.C72453Mb.A1P(r0)
            r4 = 0
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity.A0Q(r3, r4, r4)
            X.1VP r2 = r3.A03
            java.lang.Object r1 = r15.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            r0 = 20
            X.1VQ r2 = (X.AnonymousClass1VQ) r2
            int r0 = r2.CNw(r3, r1, r0, r4)
        L_0x0391:
            if (r0 != 0) goto L_0x00b1
        L_0x0393:
            r3.finish()
            return
        L_0x0397:
            java.lang.Object r0 = r15.A02
            X.43G r0 = (X.AnonymousClass43G) r0
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r1 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x00b1
            X.1wy r1 = r1.A07
            r0 = 3
            goto L_0x09dc
        L_0x03a6:
            java.lang.Object r0 = r15.A02
            X.4UI r0 = (X.AnonymousClass4UI) r0
            r0.A02()
            return
        L_0x03ae:
            java.lang.Object r1 = r15.A02
            X.6oG r1 = (X.C133156oG) r1
            java.lang.Object r0 = r15.A01
            X.5lN r0 = (X.C112375lN) r0
            r1.A00(r0)
            return
        L_0x03ba:
            java.lang.Object r5 = r15.A01
            X.3wX r5 = (X.C80093wX) r5
            X.1QY r4 = r5.A01
            java.lang.Object r2 = r15.A02
            X.1BI r2 = (X.AnonymousClass1BI) r2
            r1 = 1
            X.1CJ r0 = r4.A03
            X.1ci r3 = r0.A0A(r2)
            if (r3 != 0) goto L_0x03d5
            X.1ci r3 = new X.1ci
            r3.<init>((X.AnonymousClass1BI) r2)
            r0.A0K(r3, r2)
        L_0x03d5:
            int r0 = r3.A0D
            if (r0 == r1) goto L_0x03ee
            r3.A0D = r1
            X.00H r0 = r4.A07
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 6
            X.3Ch r1 = new X.3Ch
            r1.<init>(r4, r3, r0)
            r0 = 44
            r2.A01(r1, r0)
        L_0x03ee:
            android.view.ViewGroup r1 = r5.A02
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x03f6:
            java.lang.Object r1 = r15.A02
            X.4OW r1 = (X.AnonymousClass4OW) r1
            X.5cQ r0 = r1.A02
            X.1L9 r3 = r0.getActivityUtils()
            X.1FY r2 = r1.A00
            X.1LU r1 = r1.A04
            java.lang.Object r0 = r15.A01
            X.1BI r0 = (X.AnonymousClass1BI) r0
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r2, r1, r0)
            java.lang.String r0 = "Conversation:forwardMessage"
            r3.A0B(r2, r1, r0)
            return
        L_0x0412:
            java.lang.Object r1 = r15.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.11t r4 = r1.A1r
            X.1FY r3 = X.AnonymousClass3MW.A0P(r1)
            java.lang.Object r0 = r15.A02
            X.4SW r0 = (X.AnonymousClass4SW) r0
            X.1EC r2 = r0.A08
            X.1FY r1 = X.AnonymousClass3MW.A0P(r1)
            r0 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r0 = X.C110885hR.A0A(r1, r0)
            r4.CAm(r3, r0, r2)
            return
        L_0x0431:
            java.lang.Object r3 = r15.A01
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment r3 = (com.whatsapp.conversation.conversationrow.messagerating.MessageRatingFragment) r3
            java.lang.Object r0 = r15.A02
            com.whatsapp.StarRatingBar r0 = (com.whatsapp.StarRatingBar) r0
            int r0 = r0.A00
            com.whatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = r3.A02
            X.1BI r6 = r3.A03
            java.lang.String r9 = r3.A04
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.4c8 r8 = r3.A01
            X.10I r0 = r5.A05
            r10 = 4
            X.AkT r4 = new X.AkT
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.CGF(r4)
            X.1DT r0 = r5.A01
            r0.A0F(r7)
            r0 = 1
            r5.A00 = r0
            X.1KB r2 = r3.A00
            r1 = 2131892060(0x7f12175c, float:1.9418858E38)
            r0 = 0
            r2.A08(r1, r0)
            r3.A28()
            return
        L_0x0467:
            java.lang.Object r0 = r15.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r2 = r0.A0v
            X.1BI r5 = r2.A00
            X.C17960vV.A07(r5)
            boolean r1 = r2.A02
            java.lang.Object r0 = r15.A01
            X.3uR r0 = (X.C79093uR) r0
            if (r1 == 0) goto L_0x0497
            android.app.Activity r4 = X.AnonymousClass3Ma.A05(r0)
            X.1FU r4 = (X.AnonymousClass1FU) r4
            java.lang.String r3 = r2.A01
            com.whatsapp.location.StopLiveLocationDialogFragment r2 = new com.whatsapp.location.StopLiveLocationDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C72473Md.A0H(r5)
            java.lang.String r0 = "id"
            r1.putString(r0, r3)
            r2.A1R(r1)
            r4.CMl(r2)
            return
        L_0x0497:
            X.689 r2 = r0.A0G
            X.C17960vV.A07(r2)
            android.content.Context r1 = r0.getContext()
            X.C17960vV.A07(r5)
            r0 = 0
            r2.A08(r1, r5, r0)
            return
        L_0x04a8:
            java.lang.Object r6 = r15.A01
            android.view.View r6 = (android.view.View) r6
            android.content.Context r1 = r6.getContext()
            java.lang.Object r0 = r15.A02
            X.206 r0 = (X.AnonymousClass206) r0
            X.205 r0 = r0.A0v
            java.lang.String r5 = r0.A01
            X.1BI r4 = r0.A00
            boolean r3 = r0.A02
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.invites.ViewGroupInviteActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "key_id"
            r2.putExtra(r0, r5)
            if (r4 == 0) goto L_0x04d5
            java.lang.String r0 = "key_remote_jid"
            X.AnonymousClass3MY.A12(r2, r4, r0)
        L_0x04d5:
            java.lang.String r0 = "from_me"
            r2.putExtra(r0, r3)
            X.AnonymousClass3MY.A11(r2, r6)
            return
        L_0x04de:
            java.lang.Object r0 = r15.A02
            goto L_0x08c3
        L_0x04e2:
            java.lang.Object r0 = r15.A01
            X.4rI r0 = (X.C98524rI) r0
            X.5cS r4 = r0.A01
            X.1FY r3 = r4.CFa()
            java.lang.Object r0 = r15.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r2 = r0.A0J
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass1LU.A13(r3, r2, r1, r0, r0)
            X.1FY r0 = r4.CFa()
            r0.startActivity(r1)
            return
        L_0x0500:
            java.lang.Object r0 = r15.A01
            X.3Oi r0 = (X.AnonymousClass3Oi) r0
            X.3gf r1 = r0.A00
            X.1L9 r3 = r1.A01
            android.content.Context r2 = r0.getContext()
            X.00H r0 = r1.A0Q
            r0.get()
            X.129 r1 = r1.A0G
            java.lang.String r0 = "515115256843064"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A1p(r0)
            goto L_0x0561
        L_0x051e:
            java.lang.Object r0 = r15.A01
            X.5yK r0 = (X.C116625yK) r0
            com.whatsapp.contact.picker.ContactPickerFragment r3 = r0.A04
            java.lang.Object r0 = r15.A02
            X.7EC r0 = (X.AnonymousClass7EC) r0
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r0 = "android.intent.extra.TEXT"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            java.lang.String r0 = "text/plain"
            r1.setType(r0)
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)
            r3.A1k(r0)
            return
        L_0x0545:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r0 = r15.A02
            X.279 r0 = (X.AnonymousClass279) r0
            X.1L9 r3 = r0.getActivityUtils$app_product_community_community()
            android.content.Context r2 = r5.getContext()
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            X.1EC r0 = r0.A02
            if (r0 == 0) goto L_0x068a
            android.content.Intent r0 = X.AnonymousClass1LU.A0l(r1, r0)
        L_0x0561:
            r3.A08(r2, r0)
            return
        L_0x0565:
            java.lang.String r5 = "RegisterAsCompanionEnterNumberActivity/failed to parse phone number"
            java.lang.Object r9 = r15.A02
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r9 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r9
            boolean r0 = X.AnonymousClass3MW.A1Y(r9)
            r3 = 1
            if (r0 != 0) goto L_0x057b
            X.1KB r1 = r9.A05
            r0 = 2131894717(0x7f1221bd, float:1.9424247E38)
            r1.A08(r0, r3)
            return
        L_0x057b:
            X.9gv r0 = r9.A04
            java.lang.String r10 = "phoneNumberEntryViewHolder"
            if (r0 == 0) goto L_0x0655
            android.widget.EditText r0 = r0.A02
            java.lang.String r8 = X.AnonymousClass3Ma.A12(r0)
            int r7 = r8.length()
            int r7 = r7 - r3
            r6 = 0
            r4 = 0
            r2 = 0
        L_0x058f:
            if (r4 > r7) goto L_0x05b1
            r0 = r7
            if (r2 != 0) goto L_0x0595
            r0 = r4
        L_0x0595:
            char r1 = r8.charAt(r0)
            r0 = 32
            int r1 = X.C18070vi.A00(r1, r0)
            r0 = 0
            if (r1 > 0) goto L_0x05a3
            r0 = 1
        L_0x05a3:
            if (r2 != 0) goto L_0x05ac
            if (r0 != 0) goto L_0x05a9
            r2 = 1
            goto L_0x058f
        L_0x05a9:
            int r4 = r4 + 1
            goto L_0x058f
        L_0x05ac:
            if (r0 == 0) goto L_0x05b1
            int r7 = r7 + -1
            goto L_0x058f
        L_0x05b1:
            int r0 = r7 + 1
            java.lang.CharSequence r0 = r8.subSequence(r4, r0)
            java.lang.String r8 = r0.toString()
            X.9gv r0 = r9.A04
            if (r0 == 0) goto L_0x0655
            android.widget.EditText r0 = r0.A03
            java.lang.String r2 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r0 = "\\D"
            X.1wr r1 = new X.1wr
            r1.<init>((java.lang.String) r0)
            java.lang.String r0 = ""
            java.lang.String r2 = r1.A00(r2, r0)
            X.1LA r1 = r9.A00
            if (r1 == 0) goto L_0x095b
            r0 = 0
            int r0 = X.C63942tw.A00(r1, r0, r8, r2)
            if (r0 == r3) goto L_0x05e5
            java.lang.Object r0 = r15.A01
            X.1bI r0 = (X.C28931bI) r0
            r0.A04(r6)
            return
        L_0x05e5:
            java.lang.Object r4 = r15.A01
            X.1bI r4 = (X.C28931bI) r4
            r0 = 8
            r4.A04(r0)
            X.1LA r1 = r9.A00     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            if (r1 == 0) goto L_0x063d
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r7 = r1.A03(r0, r2)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            X.C18070vi.A0X(r7)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            r1.append(r7)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r0 = "@s.whatsapp.net"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A03(r0)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            X.10I r2 = r9.A05     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            r1 = 13
            X.3Bv r0 = new X.3Bv     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            r0.<init>(r9, r3, r1)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            r2.CGN(r0)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            X.02n r3 = r9.A0A     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            X.1LU r0 = r9.A03     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            if (r0 == 0) goto L_0x0643
            android.content.Intent r2 = X.C17880vN.A0A()     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r0 = "com.whatsapp.companionmode.registration.RegisterAsCompanionLinkCodeActivity"
            r2.setClassName(r1, r0)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r0 = "country_code"
            r2.putExtra(r0, r8)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            java.lang.String r0 = "phone_number"
            r2.putExtra(r0, r7)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            r3.A03(r2)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            return
        L_0x063d:
            java.lang.String r0 = "countryPhoneInfo"
            X.C18070vi.A11(r0)     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
            goto L_0x0646
        L_0x0643:
            X.AnonymousClass3MW.A1F()     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
        L_0x0646:
            r0 = 0
            throw r0     // Catch:{ 11T -> 0x064d, IOException -> 0x0648 }
        L_0x0648:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            return
        L_0x064d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r5, r0)
            r4.A04(r6)
            return
        L_0x0655:
            X.C18070vi.A11(r10)
            goto L_0x0960
        L_0x065a:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r1 = r15.A02
            X.279 r1 = (X.AnonymousClass279) r1
            X.1L9 r6 = r1.getActivityUtils$app_product_community_community()
            java.lang.Object r4 = r15.A01
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Context r0 = r5.getContext()
            X.1EC r3 = r1.A02
            if (r3 == 0) goto L_0x068a
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.EditCommunityActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "extra_community_jid"
            X.AnonymousClass3MY.A13(r2, r3, r0)
            r0 = 123(0x7b, float:1.72E-43)
            r6.A0D(r4, r2, r0)
            return
        L_0x068a:
            java.lang.String r0 = "parentJid"
            goto L_0x095d
        L_0x068e:
            java.lang.Object r0 = r15.A02
            X.4TJ r0 = (X.AnonymousClass4TJ) r0
            X.1Di r1 = r0.A01
            X.206 r0 = r0.A00
            r1.invoke(r0)
            return
        L_0x069a:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r0 = r15.A02
            X.3YJ r0 = (X.AnonymousClass3YJ) r0
            X.1gf r3 = r0.A00
            android.content.Context r1 = r5.getContext()
            java.lang.Class<X.01E> r0 = X.AnonymousClass01E.class
            android.app.Activity r2 = X.AnonymousClass1L9.A01(r1, r0)
            X.01E r2 = (X.AnonymousClass01E) r2
            java.lang.Object r1 = r15.A01
            X.1EC r1 = (X.AnonymousClass1EC) r1
            r0 = 0
            r3.BBX(r2, r1, r0)
            return
        L_0x06b9:
            java.lang.Object r4 = r15.A01
            com.whatsapp.community.JoinGroupBottomSheetFragment r4 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r4
            X.1CJ r1 = r4.A0Y
            X.1EC r0 = r4.A0f
            java.lang.String r6 = r1.A0F(r0)
            java.lang.String r0 = r4.A0q
            if (r0 == 0) goto L_0x0702
            if (r6 == 0) goto L_0x0702
            X.A5E r0 = X.A5E.A00()
            X.8Qb r3 = r0.A02()
            X.1LU r7 = r4.A0e
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0l
            android.content.Context r8 = r0.getContext()
            android.content.res.Resources r5 = X.AnonymousClass3MZ.A09(r4)
            r2 = 2131891207(0x7f121407, float:1.9417128E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            java.lang.String r0 = r4.A0q
            r11 = 0
            r1[r11] = r0
            r12 = 1
            java.lang.String r10 = X.AnonymousClass3MW.A0x(r5, r6, r1, r12, r2)
            java.lang.Object r9 = r15.A02
            X.1BI r9 = (X.AnonymousClass1BI) r9
            r14 = r11
            r13 = r11
            android.content.Intent r1 = r7.A1z(r8, r9, r10, r11, r12, r13, r14)
        L_0x06fa:
            android.content.Context r0 = r4.A1n()
            r3.A05(r0, r1)
            return
        L_0x0702:
            X.A5E r0 = X.A5E.A00()
            X.8Qb r3 = r0.A02()
            X.1LU r2 = r4.A0e
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0l
            android.content.Context r1 = r0.getContext()
            java.lang.Object r0 = r15.A02
            X.1BI r0 = (X.AnonymousClass1BI) r0
            android.content.Intent r1 = X.AnonymousClass3MY.A06(r1, r2, r0)
            goto L_0x06fa
        L_0x071b:
            java.lang.Object r3 = r15.A01
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.3oT r2 = r3.A0k
            X.76t r1 = r3.A0X
            r0 = 1
            r2.A0W(r1, r0)
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A0C(r1, r0)
            java.lang.Object r0 = r15.A02
            X.4Wp r0 = (X.AnonymousClass4Wp) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            java.lang.String r1 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "jid"
            android.content.Intent r1 = r2.putExtra(r0, r1)
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r2 = r1.addFlags(r0)
            X.1L9 r1 = r3.A01
            java.lang.String r0 = "ContactInfoActivity"
            r1.A0B(r3, r2, r0)
            return
        L_0x074e:
            java.lang.Object r5 = r15.A02
            X.4XY r5 = (X.AnonymousClass4XY) r5
            X.1CJ r0 = r5.A08
            X.1BI r6 = r5.A09
            X.1ci r0 = r0.A0A(r6)
            r1 = 1
            if (r0 == 0) goto L_0x077e
            boolean r0 = r0.A0m
            if (r0 != r1) goto L_0x077e
            androidx.appcompat.widget.SwitchCompat r0 = r5.A01
            r4 = 0
            if (r0 == 0) goto L_0x0769
            r0.setChecked(r4)
        L_0x0769:
            X.00H r0 = r5.A0A
            X.1fA r3 = X.AnonymousClass3MW.A0Y(r0)
            java.lang.Object r2 = r15.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            X.3oV r1 = new X.3oV
            r1.<init>(r6)
            X.4jU r0 = r5.A04
            r3.A0A(r2, r1, r0, r4)
            return
        L_0x077e:
            androidx.appcompat.widget.SwitchCompat r0 = r5.A01
            if (r0 == 0) goto L_0x0785
            r0.setChecked(r1)
        L_0x0785:
            X.00H r0 = r5.A0A
            X.1fA r2 = X.AnonymousClass3MW.A0Y(r0)
            java.lang.Object r3 = r15.A01
            X.1FY r3 = (X.AnonymousClass1FY) r3
            X.3oX r4 = new X.3oX
            r4.<init>(r6)
            X.4jU r5 = r5.A05
            r7 = 0
            r2.A0C(r3, r4, r5, r6, r7)
            return
        L_0x079b:
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 0
            goto L_0x07a8
        L_0x07a2:
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = new com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment
            r1.<init>()
            r0 = 1
        L_0x07a8:
            r1.A0M = r0
            if (r0 == 0) goto L_0x07bf
            java.lang.String r0 = "call_spam_dialog_report"
        L_0x07ae:
            r1.A0K = r0
            java.lang.Object r0 = r15.A02
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A1R(r0)
            java.lang.Object r0 = r15.A01
            X.1FL r0 = (X.AnonymousClass1FL) r0
            X.C72453Mb.A1I(r1, r0)
            return
        L_0x07bf:
            java.lang.String r0 = "call_spam_dialog_block"
            goto L_0x07ae
        L_0x07c2:
            java.lang.Object r3 = r15.A02
            X.2CV r3 = (X.AnonymousClass2CV) r3
            java.util.List r0 = X.C42011xT.A0I
            X.1mB r2 = r3.A01
            if (r2 != 0) goto L_0x07d2
            java.lang.String r0 = "CallsHistoryContactItemViewHolder/onContactPhotoClicked event listener is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x07d2:
            java.lang.Object r1 = r15.A01
            X.2yM r1 = (X.C66552yM) r1
            X.0vl r0 = r3.A07
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            X.C18070vi.A0X(r0)
            r2.A00(r0, r1, r3)
            return
        L_0x07e3:
            java.lang.Object r0 = r15.A01
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r0 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r0
            X.00H r0 = r0.A04
            X.4jI r0 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerUseCase.A00(r0)
            X.5cN r1 = r0.A01()
            java.lang.Object r0 = r15.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            r1.Bop(r0)
            return
        L_0x07fd:
            java.lang.Object r0 = r15.A02
            X.9ny r0 = (X.C192199ny) r0
            X.AP6 r4 = r0.A00
            X.8nD r3 = r0.A01
            java.lang.Class<X.AP6> r2 = X.AP6.class
            monitor-enter(r2)
            X.9hD r1 = r4.A06     // Catch:{ all -> 0x0814 }
            r0 = 2
            r1.A02 = r0     // Catch:{ all -> 0x0814 }
            r1.A04 = r3     // Catch:{ all -> 0x0814 }
            r4.A0A()     // Catch:{ all -> 0x0814 }
            monitor-exit(r2)     // Catch:{ all -> 0x0814 }
            return
        L_0x0814:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0814 }
            throw r0
        L_0x0817:
            java.lang.Object r2 = r15.A01
            X.9eQ r2 = (X.C186579eQ) r2
            X.9fT r1 = r2.A01
            r0 = 3
            r1.A01 = r0
            java.lang.Object r0 = r15.A02
            X.AEQ r0 = (X.AEQ) r0
            r1.A03 = r0
            X.1DT r0 = r2.A00
            r0.A0F(r1)
            return
        L_0x082c:
            com.whatsapp.languageselector.LanguageSelectorBottomSheet r4 = new com.whatsapp.languageselector.LanguageSelectorBottomSheet
            r4.<init>()
            java.lang.Object r3 = r15.A01
            java.lang.Object r2 = r15.A02
            X.1FU r2 = (X.AnonymousClass1FU) r2
            r1 = 0
            X.4o9 r0 = new X.4o9
            r0.<init>(r3, r2, r1)
            r4.A06 = r0
            X.4oA r0 = new X.4oA
            r0.<init>(r2, r1)
            r4.A07 = r0
            X.4o8 r0 = new X.4o8
            r0.<init>(r2, r4, r1)
            r4.A05 = r0
            r2.CMl(r4)
            return
        L_0x0851:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Object r0 = r15.A01
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            com.whatsapp.jid.Jid r1 = X.AnonymousClass1E7.A01(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r0 = 0
            X.A09 r2 = new X.A09
            r2.<init>(r5, r1, r0)
            java.lang.Object r1 = r15.A02
            X.AOM r1 = (X.AOM) r1
            android.widget.ImageView r0 = r1.A00
            java.lang.String r0 = X.AnonymousClass1Xr.A02(r0)
            r2.A02 = r0
            X.0vl r0 = r1.A01
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r0 = X.AnonymousClass1L9.A00(r0)
            r2.A01(r0)
            return
        L_0x0881:
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            android.content.Context r2 = r5.getContext()
            java.lang.Object r0 = r15.A02
            X.8jl r0 = (X.C168838jl) r0
            com.whatsapp.jid.UserJid r1 = r0.A08
            r0 = 9
            android.content.Intent r1 = X.C72463Mc.A0F(r2, r1, r0)
            java.lang.Object r0 = r15.A01
            X.1L9 r0 = (X.AnonymousClass1L9) r0
            r0.A08(r2, r1)
            return
        L_0x089d:
            java.lang.Object r2 = r15.A02
            X.18K r2 = (X.AnonymousClass18K) r2
            X.8r3 r1 = new X.8r3
            r1.<init>()
            java.lang.Integer r0 = X.C17880vN.A0l()
            r1.A00 = r0
            r0 = 68
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A01 = r0
            java.lang.String r0 = "connected_catalog_details"
            r1.A03 = r0
            r2.CC7(r1)
            java.lang.Object r0 = r15.A01
        L_0x08c3:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x08c9:
            java.lang.Object r3 = r15.A01
            X.4i3 r3 = (X.C92874i3) r3
            java.lang.Object r2 = r15.A02
            r0 = 0
            X.4mR r1 = new X.4mR
            r1.<init>(r15, r2, r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A0D
            X.C92874i3.A05(r3, r1, r0)
            return
        L_0x08db:
            java.lang.Object r7 = r15.A01
            X.4i3 r7 = (X.C92874i3) r7
            com.whatsapp.chatinfo.ContactInfoActivity r6 = r7.A0l
            java.lang.Object r0 = r15.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r5 = r0.A0J
            java.lang.Integer r4 = r7.A1E
            java.lang.String r3 = "jid"
            r0 = 1
            android.content.Intent r2 = X.AnonymousClass3MZ.A07(r5, r0)
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.biz.BusinessProfileExtraFieldsActivity"
            r2.setClassName(r1, r0)
            X.C17960vV.A07(r5)
            X.AnonymousClass3MY.A12(r2, r5, r3)
            java.lang.String r0 = "profile_entry_point"
            r2.putExtra(r0, r4)
            r6.startActivity(r2)
            r0 = 8
            X.C92874i3.A02(r7, r0)
            return
        L_0x090d:
            java.lang.Object r0 = r15.A02
            com.whatsapp.phonematching.CountryAndPhoneNumberFragment r0 = (com.whatsapp.phonematching.CountryAndPhoneNumberFragment) r0
            r0.A28()
            return
        L_0x0915:
            java.lang.Object r1 = r15.A01
            X.6nW r1 = (X.AnonymousClass6nW) r1
            java.lang.Runnable r0 = r1.A04
            if (r0 == 0) goto L_0x0920
            r0.run()
        L_0x0920:
            X.86R r0 = r1.A03
            if (r0 == 0) goto L_0x0927
            r0.Bhy()
        L_0x0927:
            java.lang.Object r0 = r15.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r5)
            return
        L_0x092f:
            java.lang.Object r2 = r15.A01
            X.1Zk r2 = (X.C28221Zk) r2
            java.lang.Object r1 = r15.A02
            X.1bm r1 = (X.C29201bm) r1
            r0 = 1
            r2.A08(r1, r0)
            return
        L_0x093c:
            java.lang.Object r1 = r15.A01
            X.1Zk r1 = (X.C28221Zk) r1
            java.lang.Object r0 = r15.A02
            X.1bm r0 = (X.C29201bm) r0
            r1.A06(r0)
            r0.C4p()
            return
        L_0x094b:
            java.lang.Object r2 = r15.A02
            X.1bm r2 = (X.C29201bm) r2
            r1 = 35
            r0 = 9
            r2.BxX(r1, r0)
            return
        L_0x0957:
            X.C18070vi.A11(r7)
            goto L_0x0960
        L_0x095b:
            java.lang.String r0 = "countryPhoneInfo"
        L_0x095d:
            X.C18070vi.A11(r0)
        L_0x0960:
            r0 = 0
            throw r0
        L_0x0962:
            X.4Op r0 = r5.A02
            X.0ve r1 = r0.A01
            r0 = 1107(0x453, float:1.551E-42)
            r1.A0N(r0)
            X.205 r7 = r2.A0v
            com.whatsapp.jid.UserJid r5 = r2.A04
            X.1BI r0 = r7.A00
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r0)
            X.C17960vV.A07(r6)
            java.lang.String r8 = r2.A08
            java.lang.String r9 = r2.A0A
            java.lang.String r10 = r2.A05
            X.C18070vi.A0s(r5, r6, r8, r9)
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r0 = com.whatsapp.biz.order.view.fragment.OrderDetailFragment.A00(r5, r6, r7, r8, r9, r10)
            r4.CMl(r0)
            return
        L_0x0989:
            java.lang.Object r1 = r15.A01
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r1 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r1
            X.00H r0 = r1.A0d
            java.lang.Object r4 = r0.get()
            X.AM7 r4 = (X.AM7) r4
            java.lang.Object r3 = r15.A02
            X.8nD r3 = (X.AnonymousClass8nD) r3
            boolean r2 = r3.A01
            X.A5L r0 = r1.A0N
            java.lang.Integer r5 = r0.A04()
            int r0 = X.C72453Mb.A05(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r8 = 1
            r9 = 16
            r10 = r8
            r4.A08(r5, r6, r7, r8, r9, r10)
            r1.A02 = r3
            r1.A00 = r8
            X.A2L r0 = r1.A0Q
            java.lang.String r5 = r3.A01
            java.lang.String r6 = r3.A00
            java.lang.String r7 = r3.A00
            long r3 = java.lang.System.currentTimeMillis()
            X.AEy r2 = new X.AEy
            r2.<init>(r3, r5, r6, r7)
            r0.A02(r2)
            X.1wy r1 = r1.A0b
            goto L_0x0a0c
        L_0x09cc:
            java.lang.Object r0 = r15.A02
            X.43G r0 = (X.AnonymousClass43G) r0
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel r5 = r0.A01
            int r2 = r0.A00
            if (r2 == 0) goto L_0x09e0
            r0 = 2
            if (r2 != r0) goto L_0x0a0e
            X.1wy r1 = r5.A07
            r0 = 4
        L_0x09dc:
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x09e0:
            X.AM5 r4 = r5.A01
            X.A5L r3 = r5.A03
            java.lang.Integer r2 = r3.A04()
            X.8sH r1 = new X.8sH
            r1.<init>()
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C = r0
            r1.A09 = r2
            X.AM5.A02(r4, r1)
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x0a0a
            X.8ve r1 = r5.A02
            r0 = 1
            r1.A02(r0)
            com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.A00(r5)
            return
        L_0x0a0a:
            X.1wy r1 = r5.A07
        L_0x0a0c:
            r0 = 0
            goto L_0x09dc
        L_0x0a0e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LocationOptionPickerViewModel/onLocationOptionClicked option not handled: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825248h.A04(android.view.View):void");
    }
}
