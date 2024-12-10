package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C139196yO;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C139196yO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(C139196yO r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C139196yO r4 = this.this$0;
            String str = this.$stableId;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A05, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C1418377d r7 = (C1418377d) obj;
        if (r7 != null) {
            this.this$0.A01.A01(r7);
        }
        return r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installTemporaryAvatarStickerByStableId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
