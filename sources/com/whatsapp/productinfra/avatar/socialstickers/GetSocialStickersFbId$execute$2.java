package com.whatsapp.productinfra.avatar.socialstickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7GX;
import X.AnonymousClass9F6;
import X.C108945cZ;
import X.C127646eh;
import X.C1584180p;
import X.C1584280q;
import X.C17890vO;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2", f = "GetSocialStickersFbId.kt", i = {0, 0}, l = {98}, m = "invokeSuspend", n = {"iqId", "contactFbIdRequest"}, s = {"L$0", "L$1"})
public final class GetSocialStickersFbId$execute$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $userJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C127646eh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSocialStickersFbId$execute$2(UserJid userJid, C127646eh r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$userJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GetSocialStickersFbId$execute$2(this.$userJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String A0T = C17890vO.A0T(C108945cZ.A0r(this.this$0.A00).A01);
            AnonymousClass9F6 r3 = new AnonymousClass9F6(A0T, this.$userJid, 6);
            C127646eh r2 = this.this$0;
            this.L$0 = A0T;
            this.L$1 = r3;
            this.L$2 = r2;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            C108945cZ.A0r(r2.A00).A02(new AnonymousClass7GX(A0m, 0), (C29621ca) r3.A00, A0T, new C1584180p(A0m), new C1584280q(A0m));
            obj = A0m.A0C();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSocialStickersFbId$execute$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
