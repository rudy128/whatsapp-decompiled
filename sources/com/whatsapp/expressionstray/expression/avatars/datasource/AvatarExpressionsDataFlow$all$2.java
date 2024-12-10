package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C120446Ds;
import X.C147207Sf;
import X.C23421Fz;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarExpressionsDataFlow$all$2 avatarExpressionsDataFlow$all$2 = new AvatarExpressionsDataFlow$all$2(this.this$0, r4);
        avatarExpressionsDataFlow$all$2.Z$0 = AnonymousClass000.A1Y(obj);
        return avatarExpressionsDataFlow$all$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            List<AvatarOnDemandStickerCategory> list = this.this$0.A05;
            ArrayList A0D = C29351c6.A0D(list);
            for (AvatarOnDemandStickerCategory avatarOnDemandStickerCategory : list) {
                A0D.add(avatarOnDemandStickerCategory.A01.A03(new C120446Ds(avatarOnDemandStickerCategory.A00), avatarOnDemandStickerCategory.A03));
            }
            return new C147207Sf(this.this$0, C29431cG.A0t(A0D).toArray(new C23421Fz[0]), 8);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$all$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
