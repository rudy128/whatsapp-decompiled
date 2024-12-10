package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C108975cc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Set $stableIds;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(AvatarStickersRepository avatarStickersRepository, Set set, C30391dr r4, boolean z) {
        super(2, r4);
        this.this$0 = avatarStickersRepository;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1 avatarStickersRepository$fetchAvatarOnDemandStickersSync$1 = new AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1(this.this$0, this.$stableIds, r6, this.$defaultPack);
        avatarStickersRepository$fetchAvatarOnDemandStickersSync$1.L$0 = obj;
        return avatarStickersRepository$fetchAvatarOnDemandStickersSync$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (C108975cc.A1I(this.this$0.A02)) {
                AvatarStickersRepository avatarStickersRepository = this.this$0;
                Set set = this.$stableIds;
                boolean z = this.$defaultPack;
                try {
                    this.label = 1;
                    obj = C30451dy.A00(this, avatarStickersRepository.A0A, new AvatarStickersRepository$fetchOnDemandAvatarStickers$2(avatarStickersRepository, set, (C30391dr) null, z));
                    if (obj == r6) {
                        return r6;
                    }
                } catch (Throwable th) {
                    obj2 = C108945cZ.A1J(th);
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/user has no avatar");
                AvatarStickersRepository.A02(this.this$0, "fetch_on_demand_avatar_aborted_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = (List) obj;
        AvatarStickersRepository avatarStickersRepository2 = this.this$0;
        Throwable A00 = C30671eK.A00(obj2);
        if (A00 == null) {
            return obj2;
        }
        Log.e("AvatarStickersRepository/fetchAvatarOnDemandStickersSync/", A00);
        AvatarStickersRepository.A02(avatarStickersRepository2, "fetch_on_demand_avatar_stickers_failed", A00.getMessage());
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarOnDemandStickersSync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
