package com.whatsapp.status.playback.avatar;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4GT;
import X.C111065i8;
import X.C139196yO;
import X.C1418377d;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.avatar.AvatarReactionImageLoader$loadAvatarReactionStickerImage$2", f = "AvatarReactionImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarReactionImageLoader$loadAvatarReactionStickerImage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C111065i8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(C111065i8 r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarReactionImageLoader$loadAvatarReactionStickerImage$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1418377d A05 = this.this$0.A00.A05(this.$stableId);
            if (A05 != null) {
                return A05;
            }
            C139196yO r4 = (C139196yO) this.this$0.A01.get();
            String str = this.$stableId;
            C18070vi.A0d(str, 0);
            Object A00 = AnonymousClass4GT.A00(r4.A05, new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableIdSync$1(r4, str, (C30391dr) null));
            if (A00 == null) {
                return null;
            }
            return A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarReactionImageLoader$loadAvatarReactionStickerImage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
