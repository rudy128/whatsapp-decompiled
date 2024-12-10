package X;

import com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository;

/* renamed from: X.828  reason: invalid class name */
public final class AnonymousClass828 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass7FU $messageObserver;
    public final /* synthetic */ BotMemoryMetadataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass828(AnonymousClass7FU r2, BotMemoryMetadataRepository botMemoryMetadataRepository) {
        super(1);
        this.this$0 = botMemoryMetadataRepository;
        this.$messageObserver = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C17880vN.A0V(this.this$0.A03).unregisterObserver(this.$messageObserver);
        return C27621Wu.A00;
    }
}
