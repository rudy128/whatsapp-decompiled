package com.whatsapp.conversationslist;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1", f = "ConversationsSuggestedContactsViewModel.kt", i = {}, l = {197, 209}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ConversationsSuggestedContactsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = conversationsSuggestedContactsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r5 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            if (r0 == r2) goto L_0x006a
            if (r0 != r5) goto L_0x00b2
            X.C30691eM.A01(r11)
        L_0x0010:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0013:
            X.C30691eM.A01(r11)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.2iN r0 = r0.A0A
            java.util.Set r9 = r0.A00(r3)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            int r7 = r9.size()
            X.0ve r6 = r0.A09
            r1 = 7580(0x1d9c, float:1.0622E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r6, r1)
            r0 = 0
            if (r7 > r1) goto L_0x0032
            r0 = 1
        L_0x0032:
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r6 = r10.this$0
            if (r0 != 0) goto L_0x003b
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r6.A01 = r0
            goto L_0x0010
        L_0x003b:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r6.A01 = r0
            X.1wy r1 = r6.A0G
            boolean r0 = com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel.A05(r6)
            X.AnonymousClass3MY.A1M(r1, r0)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.1wy r0 = r0.A0C
            X.AnonymousClass3MY.A1M(r0, r2)
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.00H r0 = r0.A0K
            java.lang.Object r6 = r0.get()
            com.whatsapp.suggestions.SuggestionsEngine r6 = (com.whatsapp.suggestions.SuggestionsEngine) r6
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.4qF r7 = r0.A0B
            r10.label = r2
            r11 = 8
            java.lang.String r8 = "CHAT_LIST_SCREEN"
            java.lang.Object r11 = r6.A04(r7, r8, r9, r10, r11)
            if (r11 != r4) goto L_0x006d
            return r4
        L_0x006a:
            X.C30691eM.A01(r11)
        L_0x006d:
            X.1D6 r11 = (X.AnonymousClass1D6) r11
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.0ve r2 = r0.A09
            r1 = 11450(0x2cba, float:1.6045E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r0 = r10.this$0
            X.2jo r6 = r0.A05
            java.lang.Object r0 = r11.first
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x008d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            X.1BI r0 = X.C72453Mb.A0l(r1)
            if (r0 == 0) goto L_0x008d
            r2.add(r0)
            goto L_0x008d
        L_0x009d:
            r6.A00(r2)
        L_0x00a0:
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r2 = r10.this$0
            X.0wl r1 = r2.A0N
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1$2 r0 = new com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1$2
            r0.<init>(r2, r11, r3)
            r10.label = r5
            java.lang.Object r0 = X.C30451dy.A00(r10, r1, r0)
            if (r0 != r4) goto L_0x0010
            return r4
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$loadSuggestionsAfterXmppReady$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
