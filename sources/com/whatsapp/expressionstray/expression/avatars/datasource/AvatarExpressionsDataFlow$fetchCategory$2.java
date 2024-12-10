package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6UV;
import X.C108955ca;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$fetchCategory$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$fetchCategory$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6UV $category;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$fetchCategory$2(AvatarExpressionsDataFlow avatarExpressionsDataFlow, AnonymousClass6UV r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarExpressionsDataFlow;
        this.$category = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarExpressionsDataFlow$fetchCategory$2(this.this$0, this.$category, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object A00;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List list = this.this$0.A05;
            AnonymousClass6UV r3 = this.$category;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C18070vi.A18(((AvatarOnDemandStickerCategory) obj2).A00, r3)) {
                    break;
                }
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = (AvatarOnDemandStickerCategory) obj2;
            if (avatarOnDemandStickerCategory == null) {
                return null;
            }
            this.label = 1;
            A00 = avatarOnDemandStickerCategory.A00(this);
            if (A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new C30671eK(A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$fetchCategory$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
