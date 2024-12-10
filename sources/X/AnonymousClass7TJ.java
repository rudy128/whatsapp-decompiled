package X;

import com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore", f = "BotMemoryMetadataStore.kt", i = {}, l = {96}, m = "getMemoryByMemoryAnnotatedUserMessageKeyId-gIAlu-s", n = {}, s = {})
/* renamed from: X.7TJ  reason: invalid class name */
public final class AnonymousClass7TJ extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BotMemoryMetadataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TJ(BotMemoryMetadataStore botMemoryMetadataStore, C30391dr r2) {
        super(r2);
        this.this$0 = botMemoryMetadataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A01((String) null, this));
    }
}
