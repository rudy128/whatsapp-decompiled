package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$insertBotMemoryMetadata$1", f = "BotMemoryMetadataRepository.kt", i = {0, 0, 1}, l = {53, 60}, m = "invokeSuspend", n = {"botMemoryMetadata", "targetMessage", "targetMessage"}, s = {"L$0", "L$1", "L$0"})
public final class BotMemoryMetadataRepository$insertBotMemoryMetadata$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $fMessage;
    public final /* synthetic */ String $targetId;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ BotMemoryMetadataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotMemoryMetadataRepository$insertBotMemoryMetadata$1(BotMemoryMetadataRepository botMemoryMetadataRepository, AnonymousClass206 r3, String str, C30391dr r5) {
        super(2, r5);
        this.$fMessage = r3;
        this.$targetId = str;
        this.this$0 = botMemoryMetadataRepository;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new BotMemoryMetadataRepository$insertBotMemoryMetadata$1(this.this$0, this.$fMessage, this.$targetId, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            r11 = r14
            int r0 = r14.label
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r8) goto L_0x0087
            if (r0 != r3) goto L_0x00b7
            java.lang.Object r2 = r14.L$0
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r0 = X.C108955ca.A0n(r15)
        L_0x0015:
            boolean r0 = r0 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0033
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository r3 = r14.this$0
            r1 = 16384(0x4000, float:2.2959E-41)
            boolean r0 = r2.A0z(r1)
            if (r0 != 0) goto L_0x0033
            r2.A0V(r1)
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.121 r0 = (X.AnonymousClass121) r0
            r0.CQw(r2)
        L_0x0033:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0036:
            X.C30691eM.A01(r15)
            X.206 r1 = r14.$fMessage
            java.lang.Class<X.Ac5> r0 = X.C20951Ac5.class
            X.25F r0 = r1.A0M(r0)
            X.229 r9 = r0.A02
            X.Ac5 r9 = (X.C20951Ac5) r9
            if (r9 == 0) goto L_0x0033
            X.206 r0 = r14.$fMessage
            X.205 r0 = r0.A0v
            X.1BI r2 = r0.A00
            java.lang.String r0 = r14.$targetId
            X.205 r1 = new X.205
            r1.<init>(r2, r0, r8)
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository r0 = r14.this$0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.1W2 r0 = (X.AnonymousClass1W2) r0
            X.206 r2 = r0.A05(r1)
            if (r2 == 0) goto L_0x0033
            X.206 r0 = r14.$fMessage
            long r0 = r0.A0x
            r6 = -1
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository r7 = r14.this$0
            X.206 r6 = r14.$fMessage
            r14.L$0 = r9
            r14.L$1 = r2
            r14.label = r8
            X.0wl r5 = r7.A04
            r1 = 0
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$getMessageRowId$2 r0 = new com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$getMessageRowId$2
            r0.<init>(r7, r6, r1)
            java.lang.Object r15 = X.C30451dy.A00(r14, r5, r0)
            if (r15 != r4) goto L_0x0092
            return r4
        L_0x0087:
            java.lang.Object r2 = r14.L$1
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r9 = r14.L$0
            X.Ac5 r9 = (X.C20951Ac5) r9
            X.C30691eM.A01(r15)
        L_0x0092:
            long r12 = X.C17880vN.A05(r15)
            goto L_0x009b
        L_0x0097:
            X.206 r0 = r14.$fMessage
            long r12 = r0.A0x
        L_0x009b:
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository r0 = r14.this$0
            X.00H r0 = r0.A00
            java.lang.Object r8 = r0.get()
            com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore r8 = (com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore) r8
            java.lang.String r10 = X.C108955ca.A0w(r2)
            r14.L$0 = r2
            r0 = 0
            r14.L$1 = r0
            r14.label = r3
            java.lang.Object r0 = r8.A00(r9, r10, r11, r12)
            if (r0 != r4) goto L_0x0015
            return r4
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$insertBotMemoryMetadata$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotMemoryMetadataRepository$insertBotMemoryMetadata$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
