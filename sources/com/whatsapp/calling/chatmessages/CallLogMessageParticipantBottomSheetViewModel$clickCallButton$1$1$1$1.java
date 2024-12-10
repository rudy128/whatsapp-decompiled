package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1VP;
import X.AnonymousClass3MY;
import X.C178119Bw;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72483Me;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ List $contactList;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass1E7 $it;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, AnonymousClass1E7 r4, C178119Bw r5, List list, C30391dr r7) {
        super(2, r7);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$contactList = list;
        this.$context = context;
        this.$callLog = r5;
        this.$it = r4;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
        List list = this.$contactList;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(this.$context, callLogMessageParticipantBottomSheetViewModel, this.$it, this.$callLog, list, r9);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
            if (!callLogMessageParticipantBottomSheetViewModel.A04 || !callLogMessageParticipantBottomSheetViewModel.A01) {
                AnonymousClass1VP r1 = callLogMessageParticipantBottomSheetViewModel.A06;
                List list = this.$contactList;
                r1.CNy(this.$context, AnonymousClass3MY.A0a(this.$it), list, C72483Me.A06(this.$callLog), this.this$0.A03);
            } else {
                AnonymousClass1VP r12 = callLogMessageParticipantBottomSheetViewModel.A06;
                List list2 = this.$contactList;
                r12.BjT(this.$context, this.$callLog.A0C, list2, C72483Me.A06(this.$callLog), true);
            }
            AnonymousClass1G4 r13 = this.this$0.A0N;
            C27621Wu r0 = C27621Wu.A00;
            r13.setValue(r0);
            return r0;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
