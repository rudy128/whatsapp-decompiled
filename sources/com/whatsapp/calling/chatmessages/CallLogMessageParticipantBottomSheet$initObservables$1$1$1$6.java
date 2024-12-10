package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6", f = "CallLogMessageParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6 callLogMessageParticipantBottomSheet$initObservables$1$1$1$6 = new CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6(this.this$0, r4);
        callLogMessageParticipantBottomSheet$initObservables$1$1$1$6.L$0 = obj;
        return callLogMessageParticipantBottomSheet$initObservables$1$1$1$6;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.L$0 != null) {
                this.this$0.A29();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheet$initObservables$1$1$1$6) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
