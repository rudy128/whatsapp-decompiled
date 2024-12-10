package com.whatsapp.passkeys;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9F7;
import X.AnonymousClass9Y6;
import X.C108975cc;
import X.C17880vN;
import X.C17890vO;
import X.C178929Ez;
import X.C184649bI;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1", f = "PasskeyServerApiImpl.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ PasskeyServerApiImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1(PasskeyServerApiImpl passkeyServerApiImpl, C30391dr r3) {
        super(2, r3);
        this.this$0 = passkeyServerApiImpl;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new PasskeyServerApiImpl$passkeyExists$$inlined$suspendWithOutcome$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            AnonymousClass9Y6 r5 = new AnonymousClass9Y6(A0k);
            Log.i("PasskeyServer/passkeyExists/sending request");
            String A0T = C17890vO.A0T(this.this$0.A00);
            AnonymousClass9F7 r2 = new AnonymousClass9F7(A0T, 10);
            C17880vN.A0U(this.this$0.A00).A0N(new C178929Ez(new C184649bI(r5, this.this$0), r2), (C29621ca) r2.A00, A0T, 411, 32000);
            obj = A0k.A00();
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
