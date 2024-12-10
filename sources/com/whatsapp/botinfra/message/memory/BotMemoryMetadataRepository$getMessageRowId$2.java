package com.whatsapp.botinfra.message.memory;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass7FU;
import X.AnonymousClass828;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72453Mb;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository$getMessageRowId$2", f = "BotMemoryMetadataRepository.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class BotMemoryMetadataRepository$getMessageRowId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $fMessage;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ BotMemoryMetadataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotMemoryMetadataRepository$getMessageRowId$2(BotMemoryMetadataRepository botMemoryMetadataRepository, AnonymousClass206 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = botMemoryMetadataRepository;
        this.$fMessage = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new BotMemoryMetadataRepository$getMessageRowId$2(this.this$0, this.$fMessage, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            BotMemoryMetadataRepository botMemoryMetadataRepository = this.this$0;
            AnonymousClass206 r0 = this.$fMessage;
            this.L$0 = botMemoryMetadataRepository;
            this.L$1 = r0;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            AnonymousClass7FU r1 = new AnonymousClass7FU(botMemoryMetadataRepository, r0, A0m);
            C72453Mb.A1Q(botMemoryMetadataRepository.A03, r1);
            A0m.Bdu(new AnonymousClass828(r1, botMemoryMetadataRepository));
            obj = A0m.A0C();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotMemoryMetadataRepository$getMessageRowId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
