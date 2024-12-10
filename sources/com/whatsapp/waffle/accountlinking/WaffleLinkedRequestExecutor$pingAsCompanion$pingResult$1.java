package com.whatsapp.waffle.accountlinking;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1OS;
import X.AnonymousClass6OA;
import X.AnonymousClass6OB;
import X.AnonymousClass6OU;
import X.AnonymousClass6p7;
import X.C130466jT;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34871lD;
import X.C35021lW;
import com.whatsapp.waffle.companions.accountlinking.operations.CompanionWafflePingHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.waffle.accountlinking.WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1", f = "WaffleLinkedRequestExecutor.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130466jT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1(C130466jT r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new WaffleLinkedRequestExecutor$pingAsCompanion$pingResult$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CompanionWafflePingHelper companionWafflePingHelper = (CompanionWafflePingHelper) this.this$0.A02.get();
            this.label = 1;
            C34871lD r1 = companionWafflePingHelper.A02;
            if (AnonymousClass11P.A00(r1.A00) > C17890vO.A05(C18070vi.A03(r1.A02), "pref_ping_validity_time")) {
                obj = companionWafflePingHelper.A00(this);
            } else {
                AnonymousClass6p7 A01 = companionWafflePingHelper.A00.A01(C35021lW.A09);
                if (A01 != null) {
                    return new AnonymousClass6OA(A01);
                }
                obj = new AnonymousClass6OB(new AnonymousClass6OU(3, (Throwable) null), true);
            }
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
