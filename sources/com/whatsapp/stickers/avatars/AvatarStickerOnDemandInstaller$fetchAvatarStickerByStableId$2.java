package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
import X.C139196yO;
import X.C139726zL;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.productinfra.avatar.data.AvatarStickersRepository;
import com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
import com.whatsapp.util.Log;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C139196yO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(C139196yO r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AvatarStickersRepository avatarStickersRepository = (AvatarStickersRepository) this.this$0.A03.get();
            List list = (List) AnonymousClass4GT.A00(avatarStickersRepository.A0A, new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(avatarStickersRepository, C18070vi.A0P(new C139726zL(this.$stableId)), (C30391dr) null, false));
            if (list == null || list.isEmpty()) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't find ondemand sticker matching given stableId");
                if (list == null) {
                    return null;
                }
            }
            return C29431cG.A0c(list);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
