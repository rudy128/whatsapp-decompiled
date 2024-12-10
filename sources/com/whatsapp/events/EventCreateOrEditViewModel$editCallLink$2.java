package com.whatsapp.events;

import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.AnonymousClass3VY;
import X.AnonymousClass4CW;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.voipcalling.CallLinkInfo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$editCallLink$2", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$editCallLink$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $newEventStartTimeMillis;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ AnonymousClass3VY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$editCallLink$2(AnonymousClass3VY r2, String str, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = r2;
        this.$token = str;
        this.$newEventStartTimeMillis = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new EventCreateOrEditViewModel$editCallLink$2(this.this$0, this.$token, r8, this.$newEventStartTimeMillis);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3VY r0 = this.this$0;
            r0.A04.A01.A00(new A69(Message.obtain((Handler) null, 0, 0, 0, new CallLinkInfo(this.$token, AnonymousClass000.A1Z(AnonymousClass3MX.A0f(r0.A0M).A01, AnonymousClass4CW.WA_VIDEO_CALL), C17880vN.A04(this.$newEventStartTimeMillis))), "edit_call_link_for_event"));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$editCallLink$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
