package com.whatsapp.registration.integritysignals;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9LB;
import X.C17900vP;
import X.C18070vi;
import X.C188119gu;
import X.C197949xX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C99814tV;
import android.util.Base64;
import com.google.android.gms.common.api.ApiException;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f55045632c289a1af09ec$1", f = "F43FA254595FE297CBAE8.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
public final class F43FA254595FE297CBAE8$f55045632c289a1af09ec$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C188119gu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F43FA254595FE297CBAE8$f55045632c289a1af09ec$1(C188119gu r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new F43FA254595FE297CBAE8$f55045632c289a1af09ec$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new F43FA254595FE297CBAE8$f55045632c289a1af09ec$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            C30691eM.A01(obj);
            try {
                byte[] A0J = this.this$0.A00.A0J();
                if (A0J == null) {
                    Log.w("44B07D7B6129507AC261");
                    return new C197949xX((String) null, 1005);
                }
                String encodeToString = Base64.encodeToString(A0J, 3);
                C188119gu r3 = this.this$0;
                C18070vi.A0b(encodeToString);
                this.label = 1;
                obj = C30451dy.A00(this, r3.A06, new F43FA254595FE297CBAE8$f94b46a4b17b29dd978c8$2(r3, "reg", encodeToString, (C30391dr) null));
                if (obj == r7) {
                    return r7;
                }
            } catch (Exception e) {
                C17900vP.A0X(e, "AC26DBB831432B4692FC", AnonymousClass000.A10());
                if (e instanceof ApiException) {
                    i = ((ApiException) e).mStatus.A00;
                } else if (e instanceof AnonymousClass9LB) {
                    i = ((AnonymousClass9LB) e).errorCode;
                } else {
                    i = 1000;
                    if (e instanceof C99814tV) {
                        i = 1004;
                    }
                }
                return new C197949xX((String) null, i);
            }
        } else if (i2 == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return new C197949xX((String) obj, 0);
    }
}
