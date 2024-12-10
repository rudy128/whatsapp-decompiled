package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C188119gu;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1", f = "F43FA254595FE297CBAE8.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
public final class F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ C188119gu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1(C188119gu r2, String str, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1(this.this$0, this.$token, r6, this.$errorCode);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C188119gu r4 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            this.label = 1;
            obj = C30451dy.A00(this, r4.A06, new F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2(r4, str, (C30391dr) null, 0.0d, i2));
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
