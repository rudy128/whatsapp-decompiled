package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108945cZ;
import X.C108975cc;
import X.C136886uZ;
import X.C139196yO;
import X.C139726zL;
import X.C1418377d;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.util.Log;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2", f = "AvatarStickerOnDemandInstaller.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ C139196yO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(C1418377d r2, C139196yO r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$sticker = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2(this.$sticker, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C1418377d A01;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C139196yO r2 = this.this$0;
            String str = this.$sticker.A07;
            if (str != null && (A01 = ((C136886uZ) r2.A04.get()).A01(str)) != null) {
                return A01;
            }
            C1418377d r5 = this.$sticker;
            String str2 = r5.A07;
            if (str2 != null) {
                C139196yO r3 = this.this$0;
                File A00 = r3.A01.A00(new C139726zL(str2), r5.A0R);
                String str3 = r5.A0B;
                if (str3 == null || !C108975cc.A1M(str3) || !C18070vi.A18(A00.getAbsolutePath(), str3)) {
                    if (r5.A0M) {
                        String str4 = r5.A0F;
                        if (str4 == null) {
                            return null;
                        }
                        File A04 = r3.A00.A04(str4, r5.A0E);
                        if (A04.exists()) {
                            C108945cZ.A1O(r5, A04);
                            return r5;
                        }
                    } else {
                        Log.w("AvatarStickerOnDemandInstaller/cached sticker not found, downloading image");
                        this.label = 1;
                        obj = C30451dy.A00(this, r3.A05, new AvatarStickerOnDemandInstaller$installAvatarStickerByStableId$2(r3, str2, (C30391dr) null));
                        if (obj == r4) {
                            return r4;
                        }
                    }
                }
            }
            Log.w("AvatarStickerOnDemandInstaller/cached sticker found, moving to permanent storage");
            C139196yO.A00(this.$sticker, this.this$0);
            return this.$sticker;
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerOnDemandInstaller$installCachedAvatarSticker$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
