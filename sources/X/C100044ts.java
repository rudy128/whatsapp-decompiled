package X;

import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {31}, m = "fetch-IoAF18A", n = {}, s = {})
/* renamed from: X.4ts  reason: invalid class name and case insensitive filesystem */
public final class C100044ts extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100044ts(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C30391dr r2) {
        super(r2);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00(this);
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return new C30671eK(A00);
        }
        return A00;
    }
}
