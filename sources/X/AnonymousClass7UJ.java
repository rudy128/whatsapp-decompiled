package X;

import com.whatsapp.bot.home.sync.BotPhotoDownloader;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeBot;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.sync.BotPhotoDownloader", f = "BotPhotoDownloader.kt", i = {1, 2, 2}, l = {96, 100, 105}, m = "handleFromCache", n = {"preferType", "this", "botId"}, s = {"L$0", "L$0", "L$1"})
/* renamed from: X.7UJ  reason: invalid class name */
public final class AnonymousClass7UJ extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BotPhotoDownloader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7UJ(BotPhotoDownloader botPhotoDownloader, C30391dr r2) {
        super(r2);
        this.this$0 = botPhotoDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BotPhotoDownloader.A00((C122616Rb) null, this.this$0, (AiHomeBot) null, this, (AnonymousClass1G4) null);
    }
}
