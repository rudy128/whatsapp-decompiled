package com.whatsapp.events;

import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3VY;
import X.AnonymousClass4CW;
import X.AnonymousClass6h1;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.os.Handler;
import android.os.Message;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$createCallLink$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $eventStartTimeMillis;
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$createCallLink$3(AnonymousClass3VY r2, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = r2;
        this.$eventStartTimeMillis = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventCreateOrEditViewModel$createCallLink$3(this.this$0, r6, this.$eventStartTimeMillis);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VY r0 = this.this$0;
            AnonymousClass6h1 r4 = r0.A04;
            boolean A1Z = AnonymousClass000.A1Z(AnonymousClass3MX.A0f(r0.A0M).A01, AnonymousClass4CW.WA_VIDEO_CALL);
            r4.A01.A00(new A69(Message.obtain((Handler) null, 0, A1Z ? 1 : 0, 0, Long.valueOf(C17880vN.A04(this.$eventStartTimeMillis))), "create_call_link_for_event"));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$createCallLink$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
