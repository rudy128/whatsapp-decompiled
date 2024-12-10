package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C136936ue;
import X.C139196yO;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $stableId;
    public int label;
    public final /* synthetic */ C139196yO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(C139196yO r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stableId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(this.this$0, this.$stableId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C139196yO r4 = this.this$0;
            String str2 = this.$stableId;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A05, new AvatarStickerOnDemandInstaller$fetchAvatarStickerByStableId$2(r4, str2, (C30391dr) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C1418377d r8 = (C1418377d) obj;
        if (r8 == null) {
            return null;
        }
        String str3 = r8.A0I;
        C139196yO r1 = this.this$0;
        if (str3 == null) {
            str = "fetch_on_demand_avatar_returned_with_empty_url";
        } else {
            r1.A01.A01(r8);
            if (r8.A0B == null) {
                Log.w("AvatarStickerOnDemandInstaller/couldn't download ondemand sticker image");
            } else {
                C139196yO.A00(r8, r1);
                if (r8.A0B != null) {
                    return r8;
                }
            }
            r1 = this.this$0;
            str = "fetch_on_demand_avatar_returned_with_empty_filepath";
        }
        C136936ue A0p = C108945cZ.A0p(r1.A02);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("stableId=");
        A0p.A02(1, str, AnonymousClass000.A0y(r8.A07, A10));
        return null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
