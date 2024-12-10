package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.C136936ue;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory$fetch$2", f = "AvatarOnDemandStickerCategory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickerCategory$fetch$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickerCategory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickerCategory$fetch$2(AvatarOnDemandStickerCategory avatarOnDemandStickerCategory, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarOnDemandStickerCategory;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarOnDemandStickerCategory$fetch$2 avatarOnDemandStickerCategory$fetch$2 = new AvatarOnDemandStickerCategory$fetch$2(this.this$0, r4);
        avatarOnDemandStickerCategory$fetch$2.L$0 = obj;
        return avatarOnDemandStickerCategory$fetch$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            try {
                obj2 = Boolean.valueOf(this.this$0.A03.BFN(C27621Wu.A00));
            } catch (Throwable th) {
                obj2 = new AnonymousClass1IU(th);
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = this.this$0;
            Throwable A00 = C30671eK.A00(obj2);
            if (A00 != null && !(A00 instanceof CancellationException)) {
                C136936ue r3 = avatarOnDemandStickerCategory.A02;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("unable to send rendez-vous signal for category (");
                r3.A02(3, "category_fetch_failed", C17900vP.A0B(A00.getMessage(), A10));
            }
            return new C30671eK(obj2);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickerCategory$fetch$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
