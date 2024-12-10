package com.whatsapp.suggestions;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1", f = "NewChatSuggestedContactsPrefetchViewModel.kt", i = {}, l = {174, 175}, m = "invokeSuspend", n = {}, s = {})
public final class NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $delayTimeInMillis;
    public int label;
    public final /* synthetic */ NewChatSuggestedContactsPrefetchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1(NewChatSuggestedContactsPrefetchViewModel newChatSuggestedContactsPrefetchViewModel, C30391dr r3, long j) {
        super(2, r3);
        this.$delayTimeInMillis = j;
        this.this$0 = newChatSuggestedContactsPrefetchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1(this.this$0, r6, this.$delayTimeInMillis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0020
            if (r0 != r3) goto L_0x002e
            X.C30691eM.A01(r6)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r6)
            long r0 = r5.$delayTimeInMillis
            r5.label = r2
            java.lang.Object r0 = X.C62882s9.A00(r5, r0)
            if (r0 != r4) goto L_0x0023
            return r4
        L_0x0020:
            X.C30691eM.A01(r6)
        L_0x0023:
            com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel r0 = r5.this$0
            r5.label = r3
            java.lang.Object r0 = com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel.A08(r0, r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.suggestions.NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewChatSuggestedContactsPrefetchViewModel$scheduleFetchAgainIfAppIsRunning$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
