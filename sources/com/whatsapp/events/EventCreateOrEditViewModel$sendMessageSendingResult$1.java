package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3VY;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C84854Lc;
import X.C86794Tc;
import com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$sendMessageSendingResult$1", f = "EventCreateOrEditViewModel.kt", i = {}, l = {538}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$sendMessageSendingResult$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C86794Tc $sendMessageState;
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$sendMessageSendingResult$1(C86794Tc r2, AnonymousClass3VY r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$sendMessageState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventCreateOrEditViewModel$sendMessageSendingResult$1(this.$sendMessageState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C84854Lc r4 = this.this$0.A07;
            C86794Tc r3 = this.$sendMessageState;
            this.label = 1;
            if (AnonymousClass3MX.A13(C30451dy.A00(this, C23761Hn.A00(), new MainThreadSingleSideEffect$send$2(r4, r3, (C30391dr) null))) == r5) {
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
        return ((EventCreateOrEditViewModel$sendMessageSendingResult$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
