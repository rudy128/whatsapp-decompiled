package X;

import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationPhotoLoader", f = "AiCreationPhotoLoader.kt", i = {}, l = {93}, m = "generateFileName", n = {}, s = {})
/* renamed from: X.7TE  reason: invalid class name */
public final class AnonymousClass7TE extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiCreationPhotoLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TE(AiCreationPhotoLoader aiCreationPhotoLoader, C30391dr r2) {
        super(r2);
        this.this$0 = aiCreationPhotoLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AiCreationPhotoLoader.A00(this.this$0, (String) null, this);
    }
}
