package com.whatsapp.event;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C73333Ur;
import X.C95514mM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageChanged$1", f = "EventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventsViewModel$messageObserver$1$onMessageChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass206 $message;
    public int label;
    public final /* synthetic */ C95514mM this$0;
    public final /* synthetic */ C73333Ur this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$messageObserver$1$onMessageChanged$1(C95514mM r2, C73333Ur r3, AnonymousClass206 r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$message = r4;
        this.this$1 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new EventsViewModel$messageObserver$1$onMessageChanged$1(this.this$0, this.this$1, this.$message, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C95514mM.A01(this.this$0, this.$message)) {
                C73333Ur.A00(this.this$1);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventsViewModel$messageObserver$1$onMessageChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
