package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass1OS;
import X.AnonymousClass3Uj;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1", f = "ReportToAdminMessagesViewModel.kt", i = {1, 1}, l = {110, 114}, m = "invokeSuspend", n = {"result", "reports"}, s = {"L$0", "L$1"})
public final class ReportToAdminMessagesViewModel$fetchReportedMessages$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ AnonymousClass3Uj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$fetchReportedMessages$1(AnonymousClass3Uj r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ReportToAdminMessagesViewModel$fetchReportedMessages$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r14.label
            r1 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0059
            if (r0 == r3) goto L_0x006b
            if (r0 != r1) goto L_0x011a
            java.lang.Object r6 = r14.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r14.L$0
            X.4F4 r5 = (X.AnonymousClass4F4) r5
            X.C30691eM.A01(r15)
        L_0x0018:
            X.3Uj r0 = r14.this$0
            X.1DT r1 = r0.A02
            X.1D6 r0 = X.AnonymousClass1D6.A01(r15, r6)
            r1.A0E(r0)
            X.46i r5 = (X.C823946i) r5
            java.lang.Object r0 = r5.A00
            X.9FF r0 = (X.AnonymousClass9FF) r0
            X.9CY r0 = r0.A00
            if (r0 == 0) goto L_0x002f
            java.lang.String r4 = r0.A01
        L_0x002f:
            java.lang.String r0 = "lid"
            boolean r0 = X.C18070vi.A18(r4, r0)
            if (r0 == 0) goto L_0x012c
            X.3Uj r5 = r14.this$0
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r6.iterator()
        L_0x0045:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()
            X.9DH r0 = (X.AnonymousClass9DH) r0
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            X.C29401cD.A0J(r0, r2)
            goto L_0x0045
        L_0x0059:
            X.C30691eM.A01(r15)
            X.3Uj r0 = r14.this$0
            com.whatsapp.reporttoadmin.xmpp.RtaXmppClient r2 = r0.A07
            X.1EC r0 = r0.A06
            r14.label = r3
            java.lang.Object r15 = r2.A02(r0, r14)
            if (r15 != r7) goto L_0x006e
            return r7
        L_0x006b:
            X.C30691eM.A01(r15)
        L_0x006e:
            r5 = r15
            X.4F4 r5 = (X.AnonymousClass4F4) r5
            boolean r0 = r5 instanceof X.C823946i
            if (r0 == 0) goto L_0x011f
            r0 = r5
            X.46i r0 = (X.C823946i) r0
            java.lang.Object r0 = r0.A00
            X.9FF r0 = (X.AnonymousClass9FF) r0
            java.util.List r6 = r0.A01
            X.3Uj r2 = r14.this$0
            X.4JE r8 = r2.A03
            java.util.ArrayList r13 = X.C29351c6.A0D(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x008a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r3.next()
            X.9DH r0 = (X.AnonymousClass9DH) r0
            java.lang.String r0 = r0.A02
            r13.add(r0)
            goto L_0x008a
        L_0x009c:
            X.1K2 r0 = r8.A00
            X.10E r3 = r0.A01
            X.11P r9 = X.AnonymousClass10E.A6O(r3)
            X.00S r0 = r3.A2G
            java.lang.Object r10 = r0.get()
            X.1LW r10 = (X.AnonymousClass1LW) r10
            X.00S r0 = r3.A3A
            java.lang.Object r11 = r0.get()
            X.1LY r11 = (X.AnonymousClass1LY) r11
            X.00S r0 = r3.A6i
            java.lang.Object r12 = r0.get()
            X.1Cd r12 = (X.AnonymousClass1Cd) r12
            X.2fr r8 = new X.2fr
            r8.<init>(r9, r10, r11, r12, r13)
            r2.A00 = r8
            X.3Uj r0 = r14.this$0
            X.2fr r3 = r0.A00
            if (r3 == 0) goto L_0x00df
            X.1EC r2 = r0.A06
            r14.L$0 = r5
            r14.L$1 = r6
            r14.label = r1
            X.1Ho r1 = X.C23761Hn.A01
            com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2 r0 = new com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2
            r0.<init>(r4, r2, r3, r4)
            java.lang.Object r15 = X.C30451dy.A00(r14, r1, r0)
            if (r15 != r7) goto L_0x0018
            return r7
        L_0x00df:
            r15 = r4
            goto L_0x0018
        L_0x00e2:
            java.util.Iterator r3 = r2.iterator()
        L_0x00e6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r3.next()
            X.9DF r0 = (X.AnonymousClass9DF) r0
            java.lang.Object r2 = r0.A01
            java.lang.Object r0 = r0.A03
            X.9DO r0 = (X.AnonymousClass9DO) r0
            if (r0 == 0) goto L_0x0108
            java.lang.Object r1 = r0.A01
        L_0x00fc:
            boolean r0 = r2 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x00e6
            r4.put(r2, r1)
            goto L_0x00e6
        L_0x0108:
            r1 = 0
            goto L_0x00fc
        L_0x010a:
            X.00H r0 = r5.A08
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.util.Map r0 = X.AnonymousClass1D7.A0F(r4)
            r1.A0K(r0)
            goto L_0x012c
        L_0x011a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x011f:
            X.3Uj r0 = r14.this$0
            X.1DT r1 = r0.A02
            X.0wS r0 = X.C18460wS.A00
            X.1D6 r0 = X.AnonymousClass1D6.A01(r4, r0)
            r1.A0E(r0)
        L_0x012c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$fetchReportedMessages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
