package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108935cY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.registration.AccountTransferManager$verifyOtpCode$3", f = "AccountTransferManager.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
public final class AccountTransferManager$verifyOtpCode$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108935cY $deferredResult;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountTransferManager$verifyOtpCode$3(C30391dr r2, C108935cY r3) {
        super(2, r2);
        this.$deferredResult = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AccountTransferManager$verifyOtpCode$3(r4, this.$deferredResult);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AccountTransferManager$verifyOtpCode$3((C30391dr) obj2, this.$deferredResult).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108935cY r0 = this.$deferredResult;
            this.label = 1;
            obj = r0.BCp(this);
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
}
