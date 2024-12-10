package com.whatsapp.bot.creation.viewmodel;

import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1", f = "AiCreationViewModel.kt", i = {}, l = {61, 63}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1G3 $this_apply;
    public Object L$0;
    public int label;
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1(AiCreationViewModel aiCreationViewModel, C30391dr r3, AnonymousClass1G3 r4) {
        super(2, r3);
        this.this$0 = aiCreationViewModel;
        this.$this_apply = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1(this.this$0, r5, this.$this_apply);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r6) goto L_0x0043
            if (r0 != r5) goto L_0x0062
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r0 = r7.this$0
            X.1pP r1 = r0.A00
            java.lang.String r0 = "created_persona"
            java.lang.Object r3 = r1.A02(r0)
            X.4cW r3 = (X.C89474cW) r3
            if (r3 == 0) goto L_0x0046
            X.1G3 r2 = r7.$this_apply
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AiCreationViewModel/restore saved AI: "
            r1.append(r0)
            java.lang.String r0 = r3.A04
            X.C17890vO.A1A(r1, r0)
            X.4iH r0 = new X.4iH
            r0.<init>(r3)
            r7.L$0 = r3
            r7.label = r6
            java.lang.Object r0 = r2.BJt(r0, r7)
            if (r0 != r4) goto L_0x0046
            return r4
        L_0x0043:
            X.C30691eM.A01(r8)
        L_0x0046:
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r0 = r7.this$0
            X.0vl r0 = r0.A05
            X.1Fz r3 = X.AnonymousClass3MX.A18(r0)
            com.whatsapp.bot.creation.viewmodel.AiCreationViewModel r2 = r7.this$0
            r0 = 0
            X.5An r1 = new X.5An
            r1.<init>(r2, r0)
            r0 = 0
            r7.L$0 = r0
            r7.label = r5
            java.lang.Object r0 = X.C88604aC.A00(r7, r1, r3)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0062:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationViewModel$_genAiPersonaCreationResultFlow$2$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
