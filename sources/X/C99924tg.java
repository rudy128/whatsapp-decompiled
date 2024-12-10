package X;

import com.whatsapp.bot.creation.service.AiCreationService;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationService", f = "AiCreationService.kt", i = {}, l = {48}, m = "createGenAiPersona", n = {}, s = {})
/* renamed from: X.4tg  reason: invalid class name and case insensitive filesystem */
public final class C99924tg extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiCreationService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99924tg(AiCreationService aiCreationService, C30391dr r2) {
        super(r2);
        this.this$0 = aiCreationService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((String) null, this);
    }
}
