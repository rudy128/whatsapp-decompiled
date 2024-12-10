package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C133686pK;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$3", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$3(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarExpressionsDataFlow$all$3 avatarExpressionsDataFlow$all$3 = new AvatarExpressionsDataFlow$all$3(this.this$0, r4);
        avatarExpressionsDataFlow$all$3.L$0 = obj;
        return avatarExpressionsDataFlow$all$3;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r1 = (AnonymousClass1G2) this.L$0;
            if (!((C133686pK) this.this$0.A03.get()).A02) {
                List list = this.this$0.A06;
                this.label = 1;
                if (r1.BJt(list, this) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$all$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
