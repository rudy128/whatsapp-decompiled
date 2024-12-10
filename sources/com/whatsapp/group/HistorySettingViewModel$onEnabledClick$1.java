package com.whatsapp.group;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1", f = "HistorySettingViewModel.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {98, 103, 110, 113, 117}, m = "invokeSuspend", n = {"groupJid", "contact", "groupJid", "contact", "groupJid", "contact", "groupJid", "contact"}, s = {"L$1", "L$2", "L$1", "L$2", "L$1", "L$2", "L$1", "L$2"})
public final class HistorySettingViewModel$onEnabledClick$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HistorySettingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySettingViewModel$onEnabledClick$1(HistorySettingViewModel historySettingViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = historySettingViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new HistorySettingViewModel$onEnabledClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new HistorySettingViewModel$onEnabledClick$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 5
            r8 = 4
            r10 = 3
            r2 = 2
            r9 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r9) goto L_0x00af
            if (r0 == r2) goto L_0x00af
            if (r0 == r10) goto L_0x008b
            if (r0 == r8) goto L_0x00af
            if (r0 != r4) goto L_0x00f5
            X.C30691eM.A01(r13)
        L_0x0018:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x001b:
            X.C30691eM.A01(r13)
            com.whatsapp.group.HistorySettingViewModel r5 = r12.this$0
            X.1EC r6 = r5.A01
            if (r6 == 0) goto L_0x0018
            X.1E7 r7 = r5.A00
            if (r7 == 0) goto L_0x0018
            X.11E r0 = r5.A02
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0043
            X.5bm r1 = r5.A06
            X.40w r0 = X.C819140w.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r9
        L_0x003c:
            java.lang.Object r0 = r1.CHH(r0, r12)
            if (r0 != r3) goto L_0x00be
            return r3
        L_0x0043:
            X.1MZ r0 = r5.A04
            boolean r0 = r0.A0K(r6)
            if (r0 != 0) goto L_0x0058
            X.5bm r1 = r5.A06
            X.40x r0 = X.C819240x.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r2
            goto L_0x003c
        L_0x0058:
            X.1G4 r11 = r5.A08
            java.lang.Object r0 = r11.getValue()
            X.4Tg r0 = (X.C86834Tg) r0
            boolean r0 = r0.A00
            r9 = r0 ^ 1
        L_0x0064:
            java.lang.Object r2 = r11.getValue()
            r1 = 0
            X.4Tg r0 = new X.4Tg
            r0.<init>(r9, r1)
            boolean r0 = r11.BFK(r2, r0)
            if (r0 == 0) goto L_0x0064
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper r0 = (com.whatsapp.grouphistory.xmpp.EnableGroupHistoryProtocolHelper) r0
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r10
            java.lang.Object r13 = r0.A00(r6, r12, r9)
            if (r13 != r3) goto L_0x009a
            return r3
        L_0x008b:
            java.lang.Object r7 = r12.L$2
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.C30691eM.A01(r13)
        L_0x009a:
            X.41F r0 = X.AnonymousClass41F.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x00d9
            X.5bm r1 = r5.A06
            X.40y r0 = X.C819340y.A00
            r12.L$0 = r5
            r12.L$1 = r6
            r12.L$2 = r7
            r12.label = r8
            goto L_0x003c
        L_0x00af:
            java.lang.Object r7 = r12.L$2
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            java.lang.Object r6 = r12.L$1
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            java.lang.Object r5 = r12.L$0
            com.whatsapp.group.HistorySettingViewModel r5 = (com.whatsapp.group.HistorySettingViewModel) r5
            X.C30691eM.A01(r13)
        L_0x00be:
            X.1G4 r4 = r5.A08
        L_0x00c0:
            java.lang.Object r3 = r4.getValue()
            boolean r2 = r7.A0i
            X.1MZ r0 = r5.A04
            boolean r1 = r0.A0K(r6)
            X.4Tg r0 = new X.4Tg
            r0.<init>(r2, r1)
            boolean r0 = r4.BFK(r3, r0)
            if (r0 == 0) goto L_0x00c0
            goto L_0x0018
        L_0x00d9:
            X.41G r0 = X.AnonymousClass41G.A00
            boolean r0 = X.C18070vi.A18(r13, r0)
            if (r0 == 0) goto L_0x0018
            X.5bm r2 = r5.A06
            X.40z r1 = X.C819440z.A00
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.label = r4
            java.lang.Object r0 = r2.CHH(r1, r12)
            if (r0 != r3) goto L_0x0018
            return r3
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
