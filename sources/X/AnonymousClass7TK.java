package X;

import com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.botinfra.message.memory.BotMemoryMetadataStore", f = "BotMemoryMetadataStore.kt", i = {}, l = {32}, m = "insertBotMemoryMetadata-BWLJW6A", n = {}, s = {})
/* renamed from: X.7TK  reason: invalid class name */
public final class AnonymousClass7TK extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BotMemoryMetadataStore this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TK(BotMemoryMetadataStore botMemoryMetadataStore, C30391dr r2) {
        super(r2);
        this.this$0 = botMemoryMetadataStore;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A00((C20951Ac5) null, (String) null, this, 0));
    }
}
