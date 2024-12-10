package com.whatsapp.conversationslist.filter;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.filter.ConversationFilterViewModel$createSmbConversationFilters$1", f = "ConversationFilterViewModel.kt", i = {0}, l = {101, 102}, m = "invokeSuspend", n = {"staticFilterList"}, s = {"L$0"})
public final class ConversationFilterViewModel$createSmbConversationFilters$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ ConversationFilterViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationFilterViewModel$createSmbConversationFilters$1(ConversationFilterViewModel conversationFilterViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = conversationFilterViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationFilterViewModel$createSmbConversationFilters$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationFilterViewModel$createSmbConversationFilters$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r1) goto L_0x0049
            if (r0 != r6) goto L_0x007b
            java.lang.Object r4 = r8.L$1
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r7 = r8.L$0
            X.1G4 r7 = (X.AnonymousClass1G4) r7
            X.C30691eM.A01(r9)
        L_0x0017:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = X.C29431cG.A0k(r9, r4)
            r7.setValue(r0)
        L_0x0020:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0023:
            X.C30691eM.A01(r9)
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r8.this$0
            java.util.ArrayList r4 = com.whatsapp.conversationslist.filter.ConversationFilterViewModel.A04(r0)
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r8.this$0
            X.00H r0 = r0.A04
            java.lang.Object r3 = r0.get()
            X.1a8 r3 = (X.C28391a8) r3
            r8.L$0 = r4
            r8.label = r1
            X.0wl r2 = r3.A04
            r1 = 0
            com.whatsapp.home.InboxFilterHelper$isLabelsInboxFiltersEnabled$2 r0 = new com.whatsapp.home.InboxFilterHelper$isLabelsInboxFiltersEnabled$2
            r0.<init>(r3, r1)
            java.lang.Object r9 = X.C30451dy.A00(r8, r2, r0)
            if (r9 != r5) goto L_0x0050
            return r5
        L_0x0049:
            java.lang.Object r4 = r8.L$0
            java.util.Collection r4 = (java.util.Collection) r4
            X.C30691eM.A01(r9)
        L_0x0050:
            boolean r1 = X.AnonymousClass000.A1Y(r9)
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r0 = r8.this$0
            X.1G4 r7 = r0.A08
            if (r1 == 0) goto L_0x0077
            X.00H r0 = r0.A02
            java.lang.Object r3 = r0.get()
            X.2kA r3 = (X.C58112kA) r3
            r8.L$0 = r7
            r8.L$1 = r4
            r8.label = r6
            X.0wl r2 = r3.A01
            r1 = 0
            com.whatsapp.conversationslist.filter.ConversationFilterActions$getLabelFilterList$2 r0 = new com.whatsapp.conversationslist.filter.ConversationFilterActions$getLabelFilterList$2
            r0.<init>(r3, r1)
            java.lang.Object r9 = X.C30451dy.A00(r8, r2, r0)
            if (r9 != r5) goto L_0x0017
            return r5
        L_0x0077:
            r7.setValue(r4)
            goto L_0x0020
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.filter.ConversationFilterViewModel$createSmbConversationFilters$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
