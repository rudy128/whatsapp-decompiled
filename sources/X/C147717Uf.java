package X;

import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationPhotoLoader", f = "AiCreationPhotoLoader.kt", i = {0, 0, 1, 1, 1}, l = {48, 51, 73}, m = "loadPhoto", n = {"this", "photoUrl", "this", "photoUrl", "resultFile"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: X.7Uf  reason: invalid class name and case insensitive filesystem */
public final class C147717Uf extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AiCreationPhotoLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C147717Uf(AiCreationPhotoLoader aiCreationPhotoLoader, C30391dr r2) {
        super(r2);
        this.this$0 = aiCreationPhotoLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((String) null, this);
    }
}
