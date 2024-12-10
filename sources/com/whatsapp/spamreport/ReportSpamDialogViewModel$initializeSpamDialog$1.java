package com.whatsapp.spamreport;

import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1", f = "ReportSpamDialogViewModel.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3}, l = {95, 96, 97, 100, 105}, m = "invokeSuspend", n = {"startTime", "contact", "startTime", "contact", "senderContact", "startTime", "contact", "senderContact", "selectedMessage", "contactToDisplay", "startTime"}, s = {"J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0"})
public final class ReportSpamDialogViewModel$initializeSpamDialog$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $contactJid;
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ boolean $hasLoggedInPairedDevices;
    public final /* synthetic */ boolean $isUgc;
    public final /* synthetic */ AnonymousClass205 $selectedMessageKey;
    public final /* synthetic */ UserJid $senderJid;
    public final /* synthetic */ boolean $shouldDeleteChatOnBlock;
    public final /* synthetic */ int $upsellAction;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$initializeSpamDialog$1(AnonymousClass1BI r2, UserJid userJid, AnonymousClass205 r4, ReportSpamDialogViewModel reportSpamDialogViewModel, String str, C30391dr r7, int i, boolean z, boolean z2, boolean z3) {
        super(2, r7);
        this.this$0 = reportSpamDialogViewModel;
        this.$contactJid = r2;
        this.$senderJid = userJid;
        this.$selectedMessageKey = r4;
        this.$entryPoint = str;
        this.$upsellAction = i;
        this.$shouldDeleteChatOnBlock = z;
        this.$isUgc = z2;
        this.$hasLoggedInPairedDevices = z3;
    }

    public final C30391dr create(Object obj, C30391dr r13) {
        return new ReportSpamDialogViewModel$initializeSpamDialog$1(this.$contactJid, this.$senderJid, this.$selectedMessageKey, this.this$0, this.$entryPoint, r13, this.$upsellAction, this.$shouldDeleteChatOnBlock, this.$isUgc, this.$hasLoggedInPairedDevices);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        if (r9.A0E() != false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c6, code lost:
        if (r0 == false) goto L_0x01c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r13 = r30
            X.1g4 r12 = X.C31751g4.COROUTINE_SUSPENDED
            r11 = r29
            int r1 = r11.label
            r14 = 4
            r7 = 3
            r2 = 2
            r5 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0020
            if (r1 == r5) goto L_0x003f
            if (r1 == r2) goto L_0x005a
            if (r1 == r7) goto L_0x0087
            if (r1 == r14) goto L_0x00e6
            r0 = 5
            if (r1 != r0) goto L_0x01d7
            X.C30691eM.A01(r13)
        L_0x001d:
            X.1Wu r12 = X.C27621Wu.A00
            return r12
        L_0x0020:
            X.C30691eM.A01(r13)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = r11.this$0
            long r3 = java.lang.System.currentTimeMillis()
            X.1DT r1 = r0.A02
            X.6G7 r0 = X.AnonymousClass6G7.A00
            r1.A0E(r0)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r1 = r11.this$0
            X.1BI r0 = r11.$contactJid
            r11.J$0 = r3
            r11.label = r5
            java.lang.Object r13 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A03(r0, r1, r11)
            if (r13 != r12) goto L_0x0044
            return r12
        L_0x003f:
            long r3 = r11.J$0
            X.C30691eM.A01(r13)
        L_0x0044:
            r9 = r13
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            com.whatsapp.jid.UserJid r1 = r11.$senderJid
            if (r1 == 0) goto L_0x0067
            com.whatsapp.spamreport.ReportSpamDialogViewModel r0 = r11.this$0
            r11.L$0 = r9
            r11.J$0 = r3
            r11.label = r2
            java.lang.Object r13 = com.whatsapp.spamreport.ReportSpamDialogViewModel.A03(r1, r0, r11)
            if (r13 != r12) goto L_0x0063
            return r12
        L_0x005a:
            long r3 = r11.J$0
            java.lang.Object r9 = r11.L$0
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            X.C30691eM.A01(r13)
        L_0x0063:
            r8 = r13
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            goto L_0x0068
        L_0x0067:
            r8 = r10
        L_0x0068:
            com.whatsapp.spamreport.ReportSpamDialogViewModel r6 = r11.this$0
            X.205 r5 = r11.$selectedMessageKey
            java.lang.String r2 = r11.$entryPoint
            r11.L$0 = r9
            r11.L$1 = r8
            r11.J$0 = r3
            r11.label = r7
            r13 = 0
            if (r5 == 0) goto L_0x0094
            X.0wl r1 = r6.A0F
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2
            r0.<init>(r5, r6, r2, r13)
            java.lang.Object r13 = X.C30451dy.A00(r11, r1, r0)
            if (r13 != r12) goto L_0x0094
            return r12
        L_0x0087:
            long r3 = r11.J$0
            java.lang.Object r8 = r11.L$1
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            java.lang.Object r9 = r11.L$0
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            X.C30691eM.A01(r13)
        L_0x0094:
            r6 = r13
            X.206 r6 = (X.AnonymousClass206) r6
            com.whatsapp.spamreport.ReportSpamDialogViewModel r5 = r11.this$0
            r7 = r9
            if (r6 == 0) goto L_0x00e4
            if (r8 == 0) goto L_0x009f
            r7 = r8
        L_0x009f:
            X.205 r0 = r6.A0v
            if (r0 == 0) goto L_0x00e4
            X.1BI r2 = r0.A00
        L_0x00a5:
            r11.L$0 = r9
            r11.L$1 = r8
            r11.L$2 = r6
            r11.L$3 = r7
            r11.J$0 = r3
            r11.label = r14
            X.1BI r13 = r7.A0J
            X.0ve r14 = r5.A0B
            r1 = 6187(0x182b, float:8.67E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r14, r1)
            if (r0 == 0) goto L_0x00d6
            boolean r0 = X.C22971Dz.A0d(r13)
            if (r0 != 0) goto L_0x00cb
            boolean r0 = X.C22971Dz.A0a(r13)
            if (r0 == 0) goto L_0x00d6
        L_0x00cb:
            X.1BI r0 = r7.A0J
            boolean r1 = X.C22971Dz.A0d(r0)
            java.lang.String r0 = "Contact must be a user"
            X.C17960vV.A0F(r1, r0)
        L_0x00d6:
            X.0wl r1 = r5.A0F
            com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2
            r0.<init>(r7, r2, r5, r10)
            java.lang.Object r13 = X.C30451dy.A00(r11, r1, r0)
            if (r13 != r12) goto L_0x00fb
            return r12
        L_0x00e4:
            r2 = r10
            goto L_0x00a5
        L_0x00e6:
            long r3 = r11.J$0
            java.lang.Object r7 = r11.L$3
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.lang.Object r6 = r11.L$2
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r8 = r11.L$1
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            java.lang.Object r9 = r11.L$0
            X.1E7 r9 = (X.AnonymousClass1E7) r9
            X.C30691eM.A01(r13)
        L_0x00fb:
            java.lang.String r13 = (java.lang.String) r13
            com.whatsapp.spamreport.ReportSpamDialogViewModel r2 = r11.this$0
            android.app.Application r0 = r2.A00
            r17 = r0
            int r5 = r11.$upsellAction
            boolean r1 = r11.$shouldDeleteChatOnBlock
            X.1BI r0 = r9.A0J
            r16 = r0
            X.0ve r15 = r2.A0B
            X.0vf r14 = X.C18040vf.A02
            r0 = 6187(0x182b, float:8.67E-42)
            boolean r0 = X.C18020vd.A05(r14, r15, r0)
            if (r0 == 0) goto L_0x0172
            boolean r0 = X.C22971Dz.A0d(r16)
            if (r0 != 0) goto L_0x0123
            boolean r0 = X.C22971Dz.A0a(r16)
            if (r0 == 0) goto L_0x0172
        L_0x0123:
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x0132
            boolean r0 = r9.A0E()
            r2 = 2131895186(0x7f122392, float:1.9425198E38)
            if (r0 == 0) goto L_0x0135
        L_0x0132:
            r2 = 2131895187(0x7f122393, float:1.94252E38)
        L_0x0135:
            r0 = r17
            java.lang.String r23 = X.C18070vi.A0F(r0, r2)
            com.whatsapp.spamreport.ReportSpamDialogViewModel r5 = r11.this$0
            X.0wl r2 = r5.A0F
            boolean r14 = r11.$isUgc
            boolean r1 = r11.$hasLoggedInPairedDevices
            java.lang.String r0 = r11.$entryPoint
            com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1$1 r15 = new com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1$1
            r22 = r0
            r24 = r10
            r25 = r3
            r27 = r14
            r28 = r1
            r19 = r6
            r20 = r5
            r21 = r13
            r17 = r8
            r18 = r7
            r16 = r9
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28)
            r11.L$0 = r10
            r11.L$1 = r10
            r11.L$2 = r10
            r11.L$3 = r10
            r0 = 5
            r11.label = r0
            java.lang.Object r0 = X.C30451dy.A00(r11, r2, r15)
            if (r0 != r12) goto L_0x001d
            return r12
        L_0x0172:
            X.1BI r0 = r9.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x0181
            r0 = 2
            if (r5 != r0) goto L_0x0181
            r2 = 2131895232(0x7f1223c0, float:1.9425291E38)
            goto L_0x0135
        L_0x0181:
            boolean r0 = r9.A0F()
            if (r0 == 0) goto L_0x01a0
            if (r8 == 0) goto L_0x01ab
            if (r5 != 0) goto L_0x01ab
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r8.A0E()
        L_0x0195:
            if (r0 != 0) goto L_0x01cd
            r2 = 2131895173(0x7f122385, float:1.9425172E38)
            if (r1 == 0) goto L_0x0135
            r2 = 2131895172(0x7f122384, float:1.942517E38)
            goto L_0x0135
        L_0x01a0:
            boolean r0 = r9.A0C()
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r9.A0E()
            goto L_0x0195
        L_0x01ab:
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r1 = r9.A06(r0)
            if (r1 == 0) goto L_0x01dc
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.1CJ r0 = r2.A09
            boolean r0 = r0.A0R(r1)
            if (r0 == 0) goto L_0x01c8
            X.1MZ r0 = r2.A0A
            boolean r0 = r0.A0J(r1)
            r2 = 2131890174(0x7f120ffe, float:1.9415032E38)
            if (r0 != 0) goto L_0x0135
        L_0x01c8:
            r2 = 2131895200(0x7f1223a0, float:1.9425226E38)
            goto L_0x0135
        L_0x01cd:
            r2 = 2131895171(0x7f122383, float:1.9425167E38)
            if (r1 == 0) goto L_0x0135
            r2 = 2131899349(0x7f1233d5, float:1.9433641E38)
            goto L_0x0135
        L_0x01d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x01dc:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogViewModel$initializeSpamDialog$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$initializeSpamDialog$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
