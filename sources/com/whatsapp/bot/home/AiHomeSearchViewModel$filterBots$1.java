package com.whatsapp.bot.home;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeSearchViewModel$filterBots$1", f = "AiHomeSearchViewModel.kt", i = {}, l = {41, 42}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeSearchViewModel$filterBots$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $query;
    public int label;
    public final /* synthetic */ AiHomeSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeSearchViewModel$filterBots$1(AiHomeSearchViewModel aiHomeSearchViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiHomeSearchViewModel;
        this.$query = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiHomeSearchViewModel$filterBots$1(this.this$0, this.$query, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x002d
            if (r0 != r5) goto L_0x0057
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            com.whatsapp.bot.home.AiHomeSearchViewModel r0 = r6.this$0
            X.1UD r0 = r0.A04
            X.0ve r2 = r0.A00
            X.0vf r1 = X.C18040vf.A01
            r0 = 10606(0x296e, float:1.4862E-41)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            long r0 = (long) r0
            r6.label = r3
            java.lang.Object r0 = X.C62882s9.A00(r6, r0)
            if (r0 != r4) goto L_0x0030
            return r4
        L_0x002d:
            X.C30691eM.A01(r7)
        L_0x0030:
            com.whatsapp.bot.home.AiHomeSearchViewModel r0 = r6.this$0
            com.whatsapp.bot.home.AiHomeFetchService r3 = r0.A03
            java.lang.String r2 = r6.$query
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 0
            com.whatsapp.bot.home.AiHomeFetchService$loadAiHomeSearch$1 r0 = new com.whatsapp.bot.home.AiHomeFetchService$loadAiHomeSearch$1
            r0.<init>(r3, r2, r1)
            X.Du4 r3 = new X.Du4
            r3.<init>(r0)
            java.lang.String r2 = r6.$query
            com.whatsapp.bot.home.AiHomeSearchViewModel r1 = r6.this$0
            X.7Si r0 = new X.7Si
            r0.<init>(r1, r2)
            r6.label = r5
            java.lang.Object r0 = r3.BFC(r6, r0)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.AiHomeSearchViewModel$filterBots$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiHomeSearchViewModel$filterBots$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
