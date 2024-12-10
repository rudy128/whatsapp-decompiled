package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C188119gu;
import X.C20377AIn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.wamsys.JniBridge;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2", f = "F43FA254595FE297CBAE8.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $errorCode;
    public final /* synthetic */ double $shaRetryDelay;
    public final /* synthetic */ String $token;
    public double D$0;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C188119gu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2(C188119gu r2, String str, C30391dr r4, double d, int i) {
        super(2, r4);
        this.this$0 = r2;
        this.$token = str;
        this.$errorCode = i;
        this.$shaRetryDelay = d;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        return new F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2(this.this$0, this.$token, r9, this.$shaRetryDelay, this.$errorCode);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C188119gu r0 = this.this$0;
            String str = this.$token;
            int i2 = this.$errorCode;
            double d = this.$shaRetryDelay;
            this.L$0 = r0;
            this.L$1 = str;
            this.I$0 = i2;
            this.D$0 = d;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            long j = (long) i2;
            JniBridge.jvidispatchIIDOOOO(j, d, str, r0.A01.A00, new C20377AIn(A0k), r0.A04.wajContext.get());
            obj = A0k.A00();
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
        return ((F43FA254595FE297CBAE8$fc09ceed2dedd87cc620c$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
