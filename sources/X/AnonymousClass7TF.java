package X;

import com.whatsapp.bot.home.AiHomeFetchService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeFetchService", f = "AiHomeFetchService.kt", i = {}, l = {73}, m = "loadAiHomeLayout", n = {}, s = {})
/* renamed from: X.7TF  reason: invalid class name */
public final class AnonymousClass7TF extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TF(AiHomeFetchService aiHomeFetchService, C30391dr r2) {
        super(r2);
        this.this$0 = aiHomeFetchService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01(this);
    }
}
