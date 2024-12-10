package com.whatsapp.spamreport;

import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$triggerExtraAction$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass1E7 $contactToDisplay;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ AnonymousClass1E7 $senderContact;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$triggerExtraAction$2(AnonymousClass1E7 r2, AnonymousClass1E7 r3, AnonymousClass1E7 r4, ReportSpamDialogFragment reportSpamDialogFragment, C30391dr r6, boolean z) {
        super(2, r6);
        this.$contact = r2;
        this.this$0 = reportSpamDialogFragment;
        this.$contactToDisplay = r3;
        this.$extraActionChecked = z;
        this.$senderContact = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass1E7 r1 = this.$contact;
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        return new ReportSpamDialogFragment$triggerExtraAction$2(r1, this.$contactToDisplay, this.$senderContact, reportSpamDialogFragment, r9, this.$extraActionChecked);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if (r2.A0C() == false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.label
            if (r0 != 0) goto L_0x0182
            X.C30691eM.A01(r20)
            X.1E7 r1 = r5.$contact
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r1 = r1.A06(r0)
            X.1EC r1 = (X.AnonymousClass1EC) r1
            r4 = 1
            if (r1 == 0) goto L_0x0046
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.1CJ r0 = r0.A09
            if (r0 == 0) goto L_0x0178
            int r0 = r0.A06(r1)
            if (r0 != r4) goto L_0x0046
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ReportSpamDialogFragment/sendingParent/"
            r2.append(r0)
            X.1E7 r0 = r5.$contact
            X.1BI r0 = r0.A0J
            r2.append(r0)
            X.C17890vO.A0w(r2)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.190 r3 = r0.A00
            if (r3 == 0) goto L_0x0175
            X.0vl r0 = r0.A0T
            java.lang.String r2 = X.AnonymousClass3MW.A0y(r0)
            java.lang.String r0 = "ReportSpamDialogFragment/sendingParent"
            r3.A0G(r0, r2, r4)
        L_0x0046:
            X.1E7 r2 = r5.$contactToDisplay
            boolean r0 = r5.$extraActionChecked
            if (r0 == 0) goto L_0x0053
            boolean r0 = r2.A0C()
            r7 = 1
            if (r0 != 0) goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            com.whatsapp.spamreport.ReportSpamDialogFragment r6 = r5.this$0
            X.1KB r4 = r6.A2H()
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r5.this$0
            X.118 r2 = r3.A06
            if (r2 == 0) goto L_0x0172
            X.1Me r0 = r3.A03
            if (r0 == 0) goto L_0x016f
            X.7ES r11 = new X.7ES
            r11.<init>(r4, r0, r2, r6)
            X.0vl r0 = r3.A0b
            int r2 = X.C72453Mb.A0I(r0)
            r0 = 2
            if (r2 != r0) goto L_0x00d1
            boolean r0 = r5.$extraActionChecked
            if (r0 == 0) goto L_0x00b4
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.6uY r3 = r0.A04
            if (r3 == 0) goto L_0x017b
            X.1E7 r2 = r5.$contact
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            X.00H r0 = r3.A04
            java.lang.Object r1 = r0.get()
            X.A6Q r1 = (X.A6Q) r1
            r0 = 5
            r5 = 0
            java.lang.Integer r1 = r1.A05(r5, r0)
            java.lang.Class<X.1ch> r0 = X.C29681ch.class
            com.whatsapp.jid.Jid r2 = r2.A06(r0)
            X.1ch r2 = (X.C29681ch) r2
            X.C17960vV.A07(r2)
            X.1md r0 = r3.A01
            r0.A0E(r2, r1)
            X.00H r0 = r3.A03
            java.lang.Object r1 = r0.get()
            X.74D r1 = (X.AnonymousClass74D) r1
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r9 = -1
            r7 = r5
            r8 = r5
            r6 = r5
            r10 = r9
            r1.A0I(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00b4:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r11.A03
            X.0ve r2 = r0.A02
            r1 = 6145(0x1801, float:8.611E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00ce
            X.118 r1 = r11.A01
            r0 = 2131888854(0x7f120ad6, float:1.9412355E38)
            java.lang.String r0 = X.C18070vi.A0G(r1, r0)
            X.AnonymousClass7ES.A00(r11, r0)
        L_0x00ce:
            X.1Wu r13 = X.C27621Wu.A00
        L_0x00d0:
            return r13
        L_0x00d1:
            if (r7 != 0) goto L_0x015f
            boolean r0 = r5.$extraActionChecked
            if (r0 == 0) goto L_0x015f
            X.1E7 r0 = r5.$senderContact
            r13 = 0
            if (r0 == 0) goto L_0x010d
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.0vl r0 = r0.A0b
            int r0 = X.C72453Mb.A0I(r0)
            if (r0 != 0) goto L_0x010d
            X.1E7 r12 = r5.$senderContact
        L_0x00e8:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.6uY r9 = r0.A04
            if (r9 == 0) goto L_0x0169
            X.1FL r10 = r0.A1D()
            X.C17960vV.A07(r12)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.0vl r0 = r0.A0Z
            boolean r18 = X.C72453Mb.A1a(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.0vl r0 = r0.A0T
            java.lang.String r17 = X.AnonymousClass3MW.A0y(r0)
            r15 = r13
            r16 = r13
            r14 = r13
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00ce
        L_0x010d:
            X.1E7 r0 = r5.$contact
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0118
            X.1E7 r12 = r5.$contact
            goto L_0x00e8
        L_0x0118:
            if (r1 == 0) goto L_0x0148
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            boolean r0 = com.whatsapp.spamreport.ReportSpamDialogFragment.A05(r1, r0)
            if (r0 == 0) goto L_0x0148
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A02(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.00H r0 = r0.A0G
            if (r0 == 0) goto L_0x0166
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            X.1EC r4 = r0.A05(r1)
            if (r4 == 0) goto L_0x00d0
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = r5.this$0
            X.1KB r2 = r3.A2H()
            r1 = 36
            X.7Pl r0 = new X.7Pl
            r0.<init>(r3, r4, r1)
            r2.A0J(r0)
            goto L_0x00ce
        L_0x0148:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            X.6uY r3 = r0.A04
            if (r3 == 0) goto L_0x0169
            X.1E7 r2 = r5.$contact
            X.0vl r0 = r0.A0Z
            boolean r1 = X.C72453Mb.A1a(r0)
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            boolean r0 = r0.A0Q
            r3.A01(r11, r2, r1, r0)
            goto L_0x00ce
        L_0x015f:
            com.whatsapp.spamreport.ReportSpamDialogFragment r0 = r5.this$0
            com.whatsapp.spamreport.ReportSpamDialogFragment.A02(r0)
            goto L_0x00ce
        L_0x0166:
            java.lang.String r0 = "communityChatManager"
            goto L_0x016b
        L_0x0169:
            java.lang.String r0 = "spamReportManager"
        L_0x016b:
            X.C18070vi.A11(r0)
            throw r13
        L_0x016f:
            java.lang.String r0 = "waContactNames"
            goto L_0x017d
        L_0x0172:
            java.lang.String r0 = "waContext"
            goto L_0x017d
        L_0x0175:
            java.lang.String r0 = "crashLogs"
            goto L_0x017d
        L_0x0178:
            java.lang.String r0 = "chatsCache"
            goto L_0x017d
        L_0x017b:
            java.lang.String r0 = "spamReportManager"
        L_0x017d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0182:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.ReportSpamDialogFragment$triggerExtraAction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$triggerExtraAction$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
