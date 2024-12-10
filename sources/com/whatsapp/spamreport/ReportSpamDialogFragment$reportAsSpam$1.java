package com.whatsapp.spamreport;

import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1", f = "ReportSpamDialogFragment.kt", i = {}, l = {504, 506, 525}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$reportAsSpam$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass1E7 $contactToDisplay;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ AnonymousClass206 $selectedMessage;
    public final /* synthetic */ AnonymousClass1E7 $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$reportAsSpam$1(AnonymousClass1E7 r2, AnonymousClass1E7 r3, AnonymousClass1E7 r4, AnonymousClass206 r5, ReportSpamDialogFragment reportSpamDialogFragment, C30391dr r7, boolean z) {
        super(2, r7);
        this.$selectedMessage = r5;
        this.this$0 = reportSpamDialogFragment;
        this.$contact = r2;
        this.$extraActionChecked = z;
        this.$contactToDisplay = r3;
        this.$senderContact = r4;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        AnonymousClass206 r4 = this.$selectedMessage;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$reportAsSpam$1(this.$contact, this.$contactToDisplay, this.$senderContact, r4, reportSpamDialogFragment, r10, this.$extraActionChecked);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3, 6187) != false) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r20
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r3 = r19
            int r0 = r3.label
            r5 = 3
            r8 = 2
            r11 = 0
            r10 = 1
            if (r0 == 0) goto L_0x0130
            if (r0 == r10) goto L_0x023f
            if (r0 == r8) goto L_0x0258
            if (r0 != r5) goto L_0x02b1
            X.C30691eM.A01(r7)
        L_0x0017:
            X.1E7 r0 = r3.$contact
            X.1BI r0 = r0.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x00ad
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.0ve r2 = r0.A02
            r1 = 6145(0x1801, float:8.611E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ad
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            java.lang.ref.WeakReference r0 = r0.A0O
            if (r0 == 0) goto L_0x003c
            android.view.View r0 = X.C108945cZ.A0O(r0)
            X.C72453Mb.A1D(r0)
        L_0x003c:
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r3.this$0
            X.0vl r0 = r3.A0c
            android.view.View r2 = X.C72463Mc.A0O(r0)
            X.C18070vi.A0X(r2)
            r0 = 0
            r2.setVisibility(r0)
            r0 = 2131434560(0x7f0b1c40, float:1.8490937E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 32
            X.C89974dK.A00(r1, r3, r0)
            r0 = 2131434561(0x7f0b1c41, float:1.849094E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r2, r0)
            r6 = 2131895196(0x7f12239c, float:1.9425218E38)
            X.1np r12 = r3.A0E
            if (r12 == 0) goto L_0x0299
            android.content.Context r13 = r3.A1n()
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r0 = 0
            java.lang.String r1 = "learn-more"
            java.lang.String r15 = X.AnonymousClass3MX.A16(r3, r1, r5, r0, r6)
            android.content.Context r0 = r3.A1n()
            int r17 = X.C72463Mc.A02(r0)
            X.7RS r14 = new X.7RS
            r14.<init>((com.whatsapp.spamreport.ReportSpamDialogFragment) r3)
            r16 = r1
            android.text.SpannableStringBuilder r0 = r12.A06(r13, r14, r15, r16, r17)
            r4.setText(r0)
            X.0ve r0 = r3.A02
            X.AnonymousClass3Ma.A1I(r4, r0)
            android.graphics.Rect r0 = X.C39401t1.A0A
            X.11C r0 = r3.A05
            if (r0 == 0) goto L_0x029c
            X.AnonymousClass3MZ.A1Q(r4, r0)
            r0 = 2131434562(0x7f0b1c42, float:1.8490941E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 33
            X.C89974dK.A00(r1, r3, r0)
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 6
            X.AnonymousClass795.A00(r1, r2, r3, r0)
        L_0x00aa:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ad:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            r0.A29()
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r3.this$0
            X.1E7 r5 = r3.$contact
            X.1E7 r4 = r3.$contactToDisplay
            boolean r2 = r3.$extraActionChecked
            X.206 r0 = r3.$selectedMessage
            if (r0 == 0) goto L_0x00c0
            X.205 r11 = r0.A0v
        L_0x00c0:
            if (r2 == 0) goto L_0x0107
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L_0x0107
            X.0vl r0 = r1.A0Z
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00e0
            X.0ve r3 = r1.A02
            X.C18070vi.A0W(r3)
            r2 = 6187(0x182b, float:8.67E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            r12 = 1
            if (r0 == 0) goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            X.00H r0 = r1.A0M
            if (r0 == 0) goto L_0x02aa
            android.content.Context r7 = X.C108955ca.A0A(r1, r0)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass3MZ.A0w(r4)
            if (r8 == 0) goto L_0x02a2
            X.0vl r0 = r1.A0T
            java.lang.String r9 = X.AnonymousClass3MW.A0y(r0)
            r11 = 0
            r0 = 3
            X.C18070vi.A0d(r9, r0)
            r13 = r12
            r14 = r11
            r15 = r10
            android.content.Intent r0 = X.C83864Gy.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A1k(r0)
            goto L_0x00aa
        L_0x0107:
            X.1FL r0 = r1.A1B()
            X.1FU r9 = X.C108985cd.A0L(r0)
            if (r2 == 0) goto L_0x012d
            java.lang.String r12 = "report_block"
        L_0x0113:
            X.4Xn r8 = r1.A0C
            if (r8 == 0) goto L_0x02a7
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r10 = X.AnonymousClass3MZ.A0w(r5)
            X.0vl r0 = r1.A0T
            java.lang.String r13 = X.AnonymousClass3MW.A0y(r0)
            X.7wQ r14 = new X.7wQ
            r14.<init>(r9, r5, r1, r2)
            r8.A00(r9, r10, r11, r12, r13, r14)
            goto L_0x00aa
        L_0x012d:
            java.lang.String r12 = "report"
            goto L_0x0113
        L_0x0130:
            X.C30691eM.A01(r7)
            X.206 r0 = r3.$selectedMessage
            if (r0 == 0) goto L_0x025f
            java.util.List r7 = X.C18070vi.A0M(r0)
        L_0x013b:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.0vl r0 = r0.A0V
            boolean r1 = X.C72453Mb.A1a(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            if (r1 == 0) goto L_0x0216
            X.00H r0 = r0.A0F
            if (r0 == 0) goto L_0x02cf
            X.1Ps r1 = X.AnonymousClass3MW.A0W(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.0vl r0 = r0.A0S
            java.lang.Object r7 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r7, r0)
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.00H r0 = r1.A03
            java.lang.Object r6 = r0.get()
            X.6z3 r6 = (X.C139566z3) r6
            X.00H r0 = r6.A05
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r1 = 35
            X.AkI r0 = new X.AkI
            r0.<init>(r6, r7, r1)
            r2.CGF(r0)
            X.6F1 r7 = X.AnonymousClass6F1.A00
        L_0x017a:
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r3.this$0
            boolean r0 = r3.$extraActionChecked
            X.1E7 r8 = r3.$contact
            X.1E7 r2 = r3.$contactToDisplay
            java.lang.String r9 = "Required value was null."
            if (r0 != 0) goto L_0x01bd
            X.2pt r2 = X.C108985cd.A0U(r1)
            java.lang.String r1 = X.C108985cd.A0n(r1)
            X.1BI r0 = r8.A0J
            if (r0 == 0) goto L_0x02b6
            X.C61562pt.A00(r2, r0, r1, r10)
        L_0x0195:
            boolean r0 = r7 instanceof X.AnonymousClass6F0
            if (r0 == 0) goto L_0x0270
            com.whatsapp.spamreport.ReportSpamDialogFragment r1 = r3.this$0
            r0 = 0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A03(r1, r0)
            X.6F0 r7 = (X.AnonymousClass6F0) r7
            java.lang.Exception r2 = r7.A00
            boolean r0 = r2 instanceof X.C122856Se
            if (r0 == 0) goto L_0x0262
            X.6Se r2 = (X.C122856Se) r2
            java.lang.String r0 = r2.toastMessage
            if (r0 == 0) goto L_0x0262
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.1KB r1 = r0.A2H()
            java.lang.String r0 = r2.toastMessage
            X.C17960vV.A07(r0)
            r1.A0G(r0, r10)
            goto L_0x00aa
        L_0x01bd:
            X.1BI r0 = r2.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x01d6
            X.2pt r6 = X.C108985cd.A0U(r1)
            java.lang.String r2 = X.C108985cd.A0n(r1)
            X.1BI r1 = r8.A0J
            if (r1 == 0) goto L_0x02bb
            r0 = 6
        L_0x01d2:
            X.C61562pt.A00(r6, r1, r2, r0)
            goto L_0x0195
        L_0x01d6:
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0208
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r0 = r8.A06(r0)
            X.1EC r0 = (X.AnonymousClass1EC) r0
            if (r0 == 0) goto L_0x01fa
            boolean r0 = com.whatsapp.spamreport.ReportSpamDialogFragment.A05(r0, r1)
            if (r0 == 0) goto L_0x01fa
            X.2pt r6 = X.C108985cd.A0U(r1)
            java.lang.String r2 = X.C108985cd.A0n(r1)
            X.1BI r1 = r8.A0J
            if (r1 == 0) goto L_0x02c0
            r0 = 4
            goto L_0x01d2
        L_0x01fa:
            X.2pt r6 = X.C108985cd.A0U(r1)
            java.lang.String r2 = X.C108985cd.A0n(r1)
            X.1BI r1 = r8.A0J
            if (r1 == 0) goto L_0x02c5
            r0 = 5
            goto L_0x01d2
        L_0x0208:
            X.2pt r6 = X.C108985cd.A0U(r1)
            java.lang.String r2 = X.C108985cd.A0n(r1)
            X.1BI r1 = r8.A0J
            if (r1 == 0) goto L_0x02ca
            r0 = 3
            goto L_0x01d2
        L_0x0216:
            X.0ve r2 = r0.A02
            r1 = 7811(0x1e83, float:1.0946E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            com.whatsapp.spamreport.ReportSpamDialogFragment r6 = r3.this$0
            if (r0 == 0) goto L_0x0246
            X.00H r0 = r6.A0L
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r2 = r0.get()
            com.whatsapp.reportinfra.repo.SpamReportRepo r2 = (com.whatsapp.reportinfra.repo.SpamReportRepo) r2
            X.1E7 r1 = r3.$contact
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            java.lang.String r0 = X.C108985cd.A0n(r0)
            r3.label = r10
            java.lang.Object r7 = r2.A00(r1, r0, r7, r3)
            if (r7 != r4) goto L_0x0242
            return r4
        L_0x023f:
            X.C30691eM.A01(r7)
        L_0x0242:
            X.6Tk r7 = (X.C123176Tk) r7
            goto L_0x017a
        L_0x0246:
            X.1E7 r2 = r3.$contact
            r3.label = r8
            X.1Ho r1 = X.C23761Hn.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2 r0 = new com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2
            r0.<init>(r2, r6, r7, r11)
            java.lang.Object r7 = X.C30451dy.A00(r3, r1, r0)
            if (r7 != r4) goto L_0x025b
            return r4
        L_0x0258:
            X.C30691eM.A01(r7)
        L_0x025b:
            X.6Tk r7 = (X.C123176Tk) r7
            goto L_0x017a
        L_0x025f:
            r7 = r11
            goto L_0x013b
        L_0x0262:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.1KB r1 = r0.A2H()
            r0 = 2131895190(0x7f122396, float:1.9425206E38)
            r1.A08(r0, r10)
            goto L_0x00aa
        L_0x0270:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r3.this$0
            X.87x r0 = r0.A0D
            if (r0 == 0) goto L_0x0279
            r0.C3E()
        L_0x0279:
            com.whatsapp.spamreport.ReportSpamDialogFragment r2 = r3.this$0
            boolean r1 = r3.$extraActionChecked
            X.1E7 r13 = r3.$contact
            X.1E7 r15 = r3.$senderContact
            X.1E7 r14 = r3.$contactToDisplay
            r3.label = r5
            X.1Ho r0 = X.C23761Hn.A01
            com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2 r12 = new com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2
            r17 = r11
            r18 = r1
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = X.C30451dy.A00(r3, r0, r12)
            if (r0 != r4) goto L_0x0017
            return r4
        L_0x0299:
            java.lang.String r0 = "linkifier"
            goto L_0x029e
        L_0x029c:
            java.lang.String r0 = "systemServices"
        L_0x029e:
            X.C18070vi.A11(r0)
            throw r11
        L_0x02a2:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x02a7:
            java.lang.String r0 = "shareReportOrBlockToMetaHelper"
            goto L_0x02ac
        L_0x02aa:
            java.lang.String r0 = "waIntents"
        L_0x02ac:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02b1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x02b6:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r9)
            throw r0
        L_0x02bb:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r9)
            throw r0
        L_0x02c0:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r9)
            throw r0
        L_0x02c5:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r9)
            throw r0
        L_0x02ca:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r9)
            throw r0
        L_0x02cf:
            java.lang.String r0 = "bonsaiUiUtilLazy"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02d5:
            java.lang.String r0 = "spamReportRepo"
            X.C18070vi.A11(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$reportAsSpam$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$reportAsSpam$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
