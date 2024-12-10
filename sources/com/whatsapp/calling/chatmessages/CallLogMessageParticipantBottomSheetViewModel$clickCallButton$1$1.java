package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C178119Bw;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C63982u1;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, C178119Bw r4, C30391dr r5) {
        super(2, r5);
        this.$callLog = r4;
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        C178119Bw r3 = this.$callLog;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, r3, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            boolean A0W = this.$callLog.A0W();
            GroupJid groupJid = this.$callLog.A0C;
            CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
            AnonymousClass1E7 A01 = C63982u1.A01(callLogMessageParticipantBottomSheetViewModel.A08, callLogMessageParticipantBottomSheetViewModel.A0F, groupJid, callLogMessageParticipantBottomSheetViewModel.A0G, A0W);
            if (A01 != null) {
                CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                C178119Bw r9 = this.$callLog;
                List A04 = C63982u1.A04(callLogMessageParticipantBottomSheetViewModel2.A05, callLogMessageParticipantBottomSheetViewModel2.A08, callLogMessageParticipantBottomSheetViewModel2.A0D, A01);
                C18070vi.A0X(A04);
                C18600wl r0 = callLogMessageParticipantBottomSheetViewModel2.A0K;
                CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 = new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(context, callLogMessageParticipantBottomSheetViewModel2, A01, r9, A04, (C30391dr) null);
                this.label = 1;
                if (C30451dy.A00(this, r0, callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
