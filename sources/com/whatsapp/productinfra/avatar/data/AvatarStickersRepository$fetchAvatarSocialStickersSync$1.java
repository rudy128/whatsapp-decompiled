package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass725;
import X.C108955ca;
import X.C108975cc;
import X.C138986y1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarSocialStickersSync$1", f = "AvatarStickersRepository.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchAvatarSocialStickersSync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ List $socialStickerUserIds;
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarSocialStickersSync$1(AvatarStickersRepository avatarStickersRepository, Integer num, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = avatarStickersRepository;
        this.$qplInstanceKey = num;
        this.$socialStickerUserIds = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AvatarStickersRepository$fetchAvatarSocialStickersSync$1(this.this$0, this.$qplInstanceKey, this.$socialStickerUserIds, r6);
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
                Set A01 = ((C138986y1) avatarStickersRepository.A07.get()).A01();
                Integer A0v = AnonymousClass3MW.A0v(2);
                List list = this.$socialStickerUserIds;
                this.label = 1;
                A00 = AvatarStickersRepository.A00(avatarStickersRepository, num, A0v, list, A01, this, false);
                if (A00 == r2) {
                    return r2;
                }
            } else {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackSync/user has no avatar");
                AvatarStickersRepository.A02(this.this$0, "fetch_avatar_sticker_pack_failed_no_avatar_user", (String) null);
                return null;
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (A00 instanceof AnonymousClass1IU) {
            A00 = null;
        }
        AnonymousClass725 r1 = (AnonymousClass725) A00;
        if (r1 != null) {
            return r1.A07;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickersRepository$fetchAvatarSocialStickersSync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
