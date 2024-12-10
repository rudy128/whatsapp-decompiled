package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C178119Bw;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72483Me;
import X.C89444cT;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel$retrieveCallLogsWithKeys$1", f = "CallLogActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityViewModel$retrieveCallLogsWithKeys$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $keys;
    public int label;
    public final /* synthetic */ CallLogActivityViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityViewModel$retrieveCallLogsWithKeys$1(CallLogActivityViewModel callLogActivityViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.$keys = list;
        this.this$0 = callLogActivityViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CallLogActivityViewModel$retrieveCallLogsWithKeys$1(this.this$0, this.$keys, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C89444cT r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            List<C89444cT> list = this.$keys;
            CallLogActivityViewModel callLogActivityViewModel = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            for (C89444cT A0U : list) {
                C178119Bw A0U2 = C72483Me.A0U(callLogActivityViewModel.A09, A0U);
                if (A0U2 != null) {
                    A13.add(A0U2);
                }
            }
            CallLogActivityViewModel callLogActivityViewModel2 = this.this$0;
            callLogActivityViewModel2.A0T.setValue(CallLogActivityViewModel.A06(callLogActivityViewModel2, CallLogActivityViewModel.A07(callLogActivityViewModel2, CallLogActivityViewModel.A05(callLogActivityViewModel2, A13))));
            CallLogActivityViewModel callLogActivityViewModel3 = this.this$0;
            C178119Bw r02 = (C178119Bw) C29431cG.A0c(A13);
            if (r02 != null) {
                r0 = r02.A04;
            } else {
                r0 = null;
            }
            callLogActivityViewModel3.A00 = r0;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityViewModel$retrieveCallLogsWithKeys$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
