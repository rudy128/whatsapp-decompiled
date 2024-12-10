package com.whatsapp.reportinfra.repo;

import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendSpamReport$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ AnonymousClass1BI $jid;
    public final /* synthetic */ AnonymousClass1OS $reportLogic;
    public final /* synthetic */ String $reportOrigin;
    public final /* synthetic */ List $selectedMessages;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendSpamReport$2(AnonymousClass1E7 r2, AnonymousClass1BI r3, SpamReportRepo spamReportRepo, String str, List list, C30391dr r7, AnonymousClass1OS r8) {
        super(2, r7);
        this.this$0 = spamReportRepo;
        this.$jid = r3;
        this.$selectedMessages = list;
        this.$reportOrigin = str;
        this.$reportLogic = r8;
        this.$contact = r2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        SpamReportRepo spamReportRepo = this.this$0;
        AnonymousClass1BI r2 = this.$jid;
        List list = this.$selectedMessages;
        return new SpamReportRepo$sendSpamReport$2(this.$contact, r2, spamReportRepo, this.$reportOrigin, list, r10, this.$reportLogic);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        if (r4.A02.A0R(r13) == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r3 = r22
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            r6 = r21
            int r0 = r6.label
            r5 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r5) goto L_0x0144
            X.C30691eM.A01(r3)
        L_0x0010:
            com.whatsapp.reportinfra.repo.SpamReportRepo r0 = r6.this$0
            X.1BI r2 = r6.$jid
            X.1E7 r1 = r6.$contact
            X.00H r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.2qh r0 = (X.C62042qh) r0
            r0.A01(r1, r2)
            com.whatsapp.reportinfra.repo.SpamReportRepo r0 = r6.this$0
            X.1E7 r1 = r6.$contact
            r1.A0x = r5
            X.1M9 r0 = r0.A01
            r0.A0T(r1)
            return r3
        L_0x002d:
            X.C30691eM.A01(r3)
            com.whatsapp.reportinfra.repo.SpamReportRepo r0 = r6.this$0
            X.00H r0 = r0.A09
            java.lang.Object r9 = r0.get()
            X.1Q1 r9 = (X.AnonymousClass1Q1) r9
            X.1BI r8 = r6.$jid
            java.util.List r4 = r6.$selectedMessages
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            X.00H r0 = r9.A00
            java.lang.Object r3 = r0.get()
            X.11A r3 = (X.AnonymousClass11A) r3
            r2 = 9
            X.3C4 r0 = new X.3C4
            r0.<init>(r9, r8, r4, r2)
            r3.A00(r0)
            com.whatsapp.reportinfra.repo.SpamReportRepo r2 = r6.this$0
            X.1BI r4 = r6.$jid
            X.1Nb r3 = r2.A06
            boolean r0 = r3.A0y(r4)
            if (r0 == 0) goto L_0x006c
            X.1To r2 = r2.A00
            java.util.Set r0 = r2.A06(r4, r1)
            r3.A0b(r4)
            r2.A0R(r0)
        L_0x006c:
            com.whatsapp.reportinfra.repo.SpamReportRepo r4 = r6.this$0
            X.1BI r13 = r6.$jid
            java.util.List r9 = r6.$selectedMessages
            java.lang.String r3 = r6.$reportOrigin
            X.C18070vi.A0e(r13, r1, r3)
            if (r9 == 0) goto L_0x007f
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0089
        L_0x007f:
            X.1CJ r0 = r4.A02
            boolean r0 = r0.A0R(r13)
            r19 = 1
            if (r0 != 0) goto L_0x008b
        L_0x0089:
            r19 = 0
        L_0x008b:
            if (r9 == 0) goto L_0x00dc
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00dc
            r0 = r9
        L_0x0094:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r12 = r0.iterator()
        L_0x009c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f6
            X.206 r11 = X.C17880vN.A0Y(r12)
            boolean r0 = r11 instanceof X.AnonymousClass247
            if (r0 == 0) goto L_0x00d8
            X.00H r0 = r4.A0A
            java.lang.Object r10 = r0.get()
            X.1Qe r10 = (X.C25931Qe) r10
            X.25F[] r2 = new X.AnonymousClass25F[r5]
            X.247 r11 = (X.AnonymousClass247) r11
            X.25F r0 = r11.A04
            r2[r1] = r0
            r10.A0A(r2)
            java.util.ArrayList r2 = r11.A17()
            r0 = 4
            java.util.List r0 = X.C29431cG.A0v(r2, r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x00ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r2.next()
            r8.add(r0)
            goto L_0x00ca
        L_0x00d8:
            r8.add(r11)
            goto L_0x009c
        L_0x00dc:
            X.1R3 r2 = r4.A03
            X.1Qr r0 = r4.A05
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.10f r0 = (X.C199410f) r0
            r14 = 5
            r11 = r0
            r12 = r2
            r15 = r5
            r16 = r19
            java.util.ArrayList r0 = X.AnonymousClass1R3.A01(r11, r12, r13, r14, r15, r16)
            X.C18070vi.A0b(r0)
            goto L_0x0094
        L_0x00f6:
            r0 = 5
            java.util.List r8 = X.C29431cG.A0v(r8, r0)
            if (r9 == 0) goto L_0x012c
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x012c
            X.00H r0 = r4.A07
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.A5M r2 = (X.A5M) r2
            r1 = 0
            r0 = 3
            r2.A05(r1, r8, r0)
        L_0x0110:
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r13)
            if (r1 == 0) goto L_0x0121
            X.00H r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            X.8od r0 = (X.C170038od) r0
            r0.A08(r1, r3)
        L_0x0121:
            X.1OS r0 = r6.$reportLogic
            r6.label = r5
            java.lang.Object r3 = r0.invoke(r8, r6)
            if (r3 != r7) goto L_0x0010
            return r7
        L_0x012c:
            X.00H r0 = r4.A07
            java.lang.Object r12 = r0.get()
            X.A5M r12 = (X.A5M) r12
            int r17 = X.C88244Yx.A01(r3)
            r14 = 0
            r18 = 7
            r16 = r14
            r15 = r14
            r20 = r1
            r12.A03(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0110
        L_0x0144:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.reportinfra.repo.SpamReportRepo$sendSpamReport$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SpamReportRepo$sendSpamReport$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
