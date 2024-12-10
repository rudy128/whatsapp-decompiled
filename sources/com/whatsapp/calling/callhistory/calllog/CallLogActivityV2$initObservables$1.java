package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3MY;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1", f = "CallLogActivityV2.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityV2$initObservables$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallLogActivityV2 this$0;

    @DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1", f = "CallLogActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass1OX r4 = (AnonymousClass1OX) this.L$0;
                CallLogActivityViewModel A0R = AnonymousClass3MY.A0R(CallLogActivityV2.this);
                CallLogActivityV2 callLogActivityV2 = CallLogActivityV2.this;
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$1(callLogActivityV2, (C30391dr) null), r4, A0R.A0a);
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$2(callLogActivityV2, (C30391dr) null), r4, A0R.A0W);
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$3(callLogActivityV2, (C30391dr) null), r4, A0R.A0Y);
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$4(callLogActivityV2, (C30391dr) null), r4, A0R.A0Z);
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$5(callLogActivityV2, (C30391dr) null), r4, A0R.A0V);
                C88604aC.A04(new CallLogActivityV2$initObservables$1$1$1$6(callLogActivityV2, (C30391dr) null), r4, A0R.A0X);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityV2$initObservables$1(CallLogActivityV2 callLogActivityV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallLogActivityV2$initObservables$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogActivityV2$initObservables$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final CallLogActivityV2 callLogActivityV2 = this.this$0;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, callLogActivityV2, this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
