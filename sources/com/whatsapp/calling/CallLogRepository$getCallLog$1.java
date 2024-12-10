package com.whatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass2Q4;
import X.AnonymousClass4N1;
import X.AnonymousClass4W9;
import X.AnonymousClass5MC;
import X.C108475bl;
import X.C178119Bw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C98394r4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.CallLogRepository$getCallLog$1", f = "CallLogRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogRepository$getCallLog$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $joinableGroupJid;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass4N1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogRepository$getCallLog$1(AnonymousClass4N1 r2, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$joinableGroupJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        CallLogRepository$getCallLog$1 callLogRepository$getCallLog$1 = new CallLogRepository$getCallLog$1(this.this$0, this.$joinableGroupJid, r5);
        callLogRepository$getCallLog$1.L$0 = obj;
        return callLogRepository$getCallLog$1;
    }

    public final Object invokeSuspend(Object obj) {
        C178119Bw r0;
        AnonymousClass2Q4 A03;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r4 = (C108475bl) this.L$0;
            C98394r4 r3 = new C98394r4(this.$joinableGroupJid, r4);
            this.this$0.A02.registerObserver(r3);
            AnonymousClass1EC r1 = this.$joinableGroupJid;
            if (r1 == null || (A03 = this.this$0.A01.A03(r1)) == null) {
                r0 = null;
            } else {
                r0 = this.this$0.A00.A04(A03.A01());
            }
            r4.CQ0(r0);
            AnonymousClass5MC r02 = new AnonymousClass5MC(r3, this.this$0);
            this.label = 1;
            if (AnonymousClass4W9.A00(this, r02, r4) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogRepository$getCallLog$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
