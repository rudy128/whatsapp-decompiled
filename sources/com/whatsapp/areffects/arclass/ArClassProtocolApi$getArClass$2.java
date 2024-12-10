package com.whatsapp.areffects.arclass;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass9F6;
import X.C17880vN;
import X.C178879Eu;
import X.C17890vO;
import X.C27621Wu;
import X.C29621ca;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import X.C84584Kb;
import X.C84594Kc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.arclass.ArClassProtocolApi$getArClass$2", f = "ArClassProtocolApi.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
public final class ArClassProtocolApi$getArClass$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ C84584Kb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArClassProtocolApi$getArClass$2(C84584Kb r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ArClassProtocolApi$getArClass$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ArClassProtocolApi$getArClass$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C84584Kb r0 = this.this$0;
            this.L$0 = r0;
            this.label = 1;
            C31781g7 A0m = C72473Md.A0m(this);
            AnonymousClass00H r2 = r0.A00;
            String A0T = C17890vO.A0T(r2);
            AnonymousClass9F6 r1 = new AnonymousClass9F6(A0T, 5);
            C17880vN.A0U(r2).A0I(new C178879Eu(new C84594Kc(A0m), r1), (C29621ca) r1.A00, A0T, 448, 32000);
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
}
