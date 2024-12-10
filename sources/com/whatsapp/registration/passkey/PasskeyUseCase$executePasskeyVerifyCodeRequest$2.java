package com.whatsapp.registration.passkey;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C194669s6;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.passkey.PasskeyUseCase$executePasskeyVerifyCodeRequest$2", f = "PasskeyUseCase.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyUseCase$executePasskeyVerifyCodeRequest$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C194669s6 $params;
    public int label;
    public final /* synthetic */ PasskeyUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyUseCase$executePasskeyVerifyCodeRequest$2(PasskeyUseCase passkeyUseCase, C194669s6 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = passkeyUseCase;
        this.$params = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new PasskeyUseCase$executePasskeyVerifyCodeRequest$2(this.this$0, this.$params, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PasskeyUseCase passkeyUseCase = this.this$0;
            C194669s6 r0 = this.$params;
            this.label = 1;
            if (PasskeyUseCase.A01(passkeyUseCase, r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PasskeyUseCase$executePasskeyVerifyCodeRequest$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
