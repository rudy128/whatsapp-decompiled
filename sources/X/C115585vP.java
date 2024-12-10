package X;

/* renamed from: X.5vP  reason: invalid class name and case insensitive filesystem */
public class C115585vP extends C65802x8 {
    public final C1404371k A00;

    public C115585vP(C1404371k r4) {
        super("wa.action.bonsai.AcceptDisclaimerV2", "wa.action.bonsai.GetChatJid", "wa.action.bonsai.GetMsgKeyId", "wa.action.bonsai.SubmitFeedback", "wa.action.bot.CloseDisclaimer", "wa.action.bonsai.SubmitNegativeFeedbackMultiple");
        this.A00 = r4;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [X.A45, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0198, code lost:
        if (r12.equals("wa.action.bonsai.GetMsgKeyId") == false) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object BKe(X.C199029zJ r10, X.C25681CkC r11, java.lang.String r12) {
        /*
            r9 = this;
            X.Boh r11 = (X.C23736Boh) r11
            int r0 = r12.hashCode()
            r4 = 3
            r3 = 2
            r2 = 1
            r1 = 0
            r6 = -1
            switch(r0) {
                case -1780838056: goto L_0x017c;
                case 621219906: goto L_0x0187;
                case 649612623: goto L_0x0192;
                case 1175015327: goto L_0x019c;
                case 1185711293: goto L_0x01a7;
                case 1910438231: goto L_0x01b2;
                default: goto L_0x000e;
            }
        L_0x000e:
            r5 = 0
            switch(r6) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0206;
                case 2: goto L_0x01d8;
                case 3: goto L_0x00fa;
                case 4: goto L_0x01ee;
                default: goto L_0x0012;
            }
        L_0x0012:
            return r5
        L_0x0013:
            java.util.List r0 = r10.A00
            int r6 = X.AnonymousClass001.A0n(r0, r1)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            X.71k r7 = r9.A00
            android.app.Activity r8 = X.ALS.A05(r11)
            boolean r1 = r0.booleanValue()
            if (r6 == r3) goto L_0x008d
            if (r6 == r4) goto L_0x008d
            r0 = 4
            if (r6 == r0) goto L_0x0081
            r0 = 5
            if (r6 != r0) goto L_0x0075
            if (r1 != 0) goto L_0x0075
            X.00H r2 = r7.A08
            java.lang.Object r0 = r2.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6xO r0 = (X.C138616xO) r0
            X.0vl r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.1H7 r0 = (X.AnonymousClass1H7) r0
            java.lang.Object r1 = r0.A01()
            java.lang.String r0 = "yes"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0075
            java.lang.Object r0 = r2.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6xO r0 = (X.C138616xO) r0
            X.0vl r0 = r0.A05
            java.lang.Object r2 = r0.getValue()
            X.1H7 r2 = (X.AnonymousClass1H7) r2
            java.lang.String r1 = "no"
            r0 = 1
            r2.A04(r1, r0)
        L_0x0075:
            if (r8 == 0) goto L_0x0012
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x0012
            r8.finish()
            return r5
        L_0x0081:
            X.00H r0 = r7.A06
            X.73d r1 = X.C108945cZ.A0c(r0)
            X.6RD r0 = X.AnonymousClass6RD.META_AI_SHORTCUT_TOS
            r1.A06(r5, r5, r0)
            goto L_0x0075
        L_0x008d:
            if (r1 != 0) goto L_0x0075
            X.00H r4 = r7.A08
            java.lang.Object r0 = r4.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            java.lang.String r1 = r0.A01()
            java.lang.String r0 = "yes"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0075
            X.00H r0 = r7.A03
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 12820(0x3214, float:1.7965E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r4.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00c4
            X.C1404371k.A01(r5, r7, r3)
            goto L_0x0075
        L_0x00c4:
            java.lang.Object r0 = r4.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.6xO r0 = (X.C138616xO) r0
            X.0vl r0 = r0.A04
            java.lang.Object r2 = r0.getValue()
            X.1H7 r2 = (X.AnonymousClass1H7) r2
            java.lang.String r1 = "no"
            r0 = 0
            r2.A04(r1, r0)
            r0 = 2
            if (r6 == r0) goto L_0x00e4
            r3 = 2
        L_0x00e4:
            X.00H r0 = r7.A04
            java.lang.Object r2 = r0.get()
            X.6mK r2 = (X.C132176mK) r2
            java.lang.Object r0 = r0.get()
            X.6mK r0 = (X.C132176mK) r0
            java.lang.Integer r1 = r0.A00
            r0 = 6
            r2.A00(r1, r0, r3)
            goto L_0x0075
        L_0x00fa:
            java.util.List r0 = r10.A00
            java.lang.Object r1 = r0.get(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r0 = r0.get(r2)
            if (r1 == 0) goto L_0x0012
            if (r0 == 0) goto L_0x0012
            X.Cgj r0 = (X.C25488Cgj) r0
            X.E8A r0 = r0.A00
            X.A45 r6 = new X.A45
            r6.<init>()
            r6.A00 = r11
            r6.A01 = r0
            X.71k r8 = r9.A00
            int r1 = r1.intValue()
            if (r1 == 0) goto L_0x0156
            if (r1 == r2) goto L_0x0156
            if (r1 == r3) goto L_0x0219
            if (r1 == r4) goto L_0x0215
            r0 = 4
            if (r1 == r0) goto L_0x0156
            r0 = 5
            if (r1 != r0) goto L_0x0012
            X.00H r0 = r8.A08
            java.lang.Object r0 = r0.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            X.7OK r7 = new X.7OK
            r7.<init>(r6, r8)
            java.lang.String r6 = "meta_ai_biz"
            X.00H r0 = r0.A02
            java.lang.Object r4 = r0.get()
            X.6xO r4 = (X.C138616xO) r4
            r2 = 20240415(0x134d81f, double:1.00000937E-316)
            X.00H r0 = r4.A01
            java.lang.Object r1 = r0.get()
            X.6lC r1 = (X.C131496lC) r1
            X.7DA r0 = new X.7DA
            r0.<init>(r7, r4, r6)
            r1.A00(r0, r2)
            return r5
        L_0x0156:
            X.00H r0 = r8.A06
            X.73d r4 = X.C108945cZ.A0c(r0)
            X.7D8 r3 = new X.7D8
            r3.<init>(r6, r8, r1)
            if (r1 == 0) goto L_0x0179
            if (r1 == r2) goto L_0x0176
            r0 = 4
            if (r1 != r0) goto L_0x0012
            X.6RZ r0 = X.AnonymousClass6RZ.META_AI_SHORTCUT_TOS
        L_0x016a:
            long r1 = r0.noticeId
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L_0x0012
            X.C1408073d.A02(r3, r4, r1)
            return r5
        L_0x0176:
            X.6RZ r0 = X.AnonymousClass6RZ.AGENT_TOS
            goto L_0x016a
        L_0x0179:
            X.6RZ r0 = X.AnonymousClass6RZ.INVOKE_TOS
            goto L_0x016a
        L_0x017c:
            java.lang.String r0 = "wa.action.bot.CloseDisclaimer"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r6 = 0
            goto L_0x000e
        L_0x0187:
            java.lang.String r0 = "wa.action.bonsai.SubmitNegativeFeedbackMultiple"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r6 = 1
            goto L_0x000e
        L_0x0192:
            java.lang.String r0 = "wa.action.bonsai.GetMsgKeyId"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01d8
            goto L_0x000e
        L_0x019c:
            java.lang.String r0 = "wa.action.bonsai.AcceptDisclaimerV2"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r6 = 3
            goto L_0x000e
        L_0x01a7:
            java.lang.String r0 = "wa.action.bonsai.SubmitFeedback"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r6 = 4
            goto L_0x000e
        L_0x01b2:
            java.lang.String r0 = "wa.action.bonsai.GetChatJid"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            X.71k r0 = r9.A00
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.6bK r0 = (X.C125586bK) r0
            java.lang.String r1 = "chat_jid"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x01cf
            r0 = 0
        L_0x01cf:
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x01ec
            java.lang.String r5 = r0.getRawString()
            return r5
        L_0x01d8:
            X.71k r0 = r9.A00
            X.00H r0 = r0.A05
            java.lang.Object r0 = r0.get()
            X.6bK r0 = (X.C125586bK) r0
            java.lang.String r1 = "message_key_id"
            java.util.HashMap r0 = r0.A00
            java.lang.Object r5 = r0.get(r1)
            if (r5 != 0) goto L_0x0012
        L_0x01ec:
            r5 = 0
            return r5
        L_0x01ee:
            java.util.List r0 = r10.A00
            java.lang.String r7 = X.C17880vN.A0w(r0, r1)
            int r6 = X.AnonymousClass001.A0n(r0, r2)
            java.lang.String r2 = X.C17880vN.A0w(r0, r3)
            java.lang.String r1 = X.C17880vN.A0w(r0, r4)
            X.71k r0 = r9.A00
            r0.A02(r7, r2, r1, r6)
            return r5
        L_0x0206:
            java.util.List r0 = r10.A00
            r0.get(r1)
            r0.get(r2)
            r0.get(r3)
            r0.get(r4)
            return r5
        L_0x0215:
            X.C1404371k.A01(r6, r8, r3)
            return r5
        L_0x0219:
            X.C1404371k.A01(r6, r8, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115585vP.BKe(X.9zJ, X.CkC, java.lang.String):java.lang.Object");
    }
}
