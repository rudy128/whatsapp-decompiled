package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C445823z;
import X.C62152qs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoFragment$cancelEventNotification$1", f = "EventInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoFragment$cancelEventNotification$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C445823z $message;
    public int label;
    public final /* synthetic */ EventInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoFragment$cancelEventNotification$1(C445823z r2, EventInfoFragment eventInfoFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = eventInfoFragment;
        this.$message = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new EventInfoFragment$cancelEventNotification$1(this.$message, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass00H r0 = this.this$0.A09;
            if (r0 != null) {
                C445823z r1 = this.$message;
                C18070vi.A0d(r1, 0);
                ((C62152qs) r0.get()).A04.BEK(85, C62152qs.A00(r1), "EventNotificationHelper");
                return C27621Wu.A00;
            }
            C18070vi.A11("eventEditNotificationManager");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventInfoFragment$cancelEventNotification$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
