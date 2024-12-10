package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108955ca;
import X.C108975cc;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarStickerPackSync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackSync$1(AvatarStickersRepository avatarStickersRepository, Integer num, Integer num2, Set set, C30391dr r6, boolean z) {
        super(2, r6);
        this.this$0 = avatarStickersRepository;
        this.$qplInstanceKey = num;
        this.$stableIds = set;
        this.$defaultPack = z;
        this.$stickerPackDownloadOrigin = num2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new AvatarStickersRepository$fetchAvatarStickerPackSync$1(this.this$0, this.$qplInstanceKey, this.$stickerPackDownloadOrigin, this.$stableIds, r9, this.$defaultPack);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (C108975cc.A1I(this.this$0.A02)) {
                AvatarStickersRepository avatarStickersRepository = this.this$0;
                Integer num = this.$qplInstanceKey;
                Set set = this.$stableIds;
                boolean z = this.$defaultPack;
                Integer num2 = this.$stickerPackDownloadOrigin;
                C18460wS r6 = C18460wS.A00;
                this.label = 1;
                A00 = AvatarStickersRepository.A00(avatarStickersRepository, num, num2, r6, set, this, z);
                if (A00 == r2) {
                    return r2;
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackSync/user has no avatar");
                AvatarStickersRepository.A02(this.this$0, "fetch_avatar_sticker_pack_failed_no_avatar_user", (String) null);
                A00 = C30691eM.A00(new Exception("Unable to fetch Avatar sticker, user has no Avatar"));
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new C30671eK(A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarStickerPackSync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
