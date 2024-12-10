package com.whatsapp.logging.messaging;

import X.AnonymousClass000;
import X.AnonymousClass1GV;
import X.AnonymousClass1OS;
import X.C25441Of;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C99244sV;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.logging.messaging.MessagingFunnelLoggerImpl$logActionUnconstrained$1", f = "MessagingFunnelLoggerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessagingFunnelLoggerImpl$logActionUnconstrained$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1GV $initBlock;
    public int label;
    public final /* synthetic */ C25441Of this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessagingFunnelLoggerImpl$logActionUnconstrained$1(AnonymousClass1GV r2, C25441Of r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$initBlock = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MessagingFunnelLoggerImpl$logActionUnconstrained$1(this.$initBlock, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A00(new C99244sV(this.$initBlock, 49));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MessagingFunnelLoggerImpl$logActionUnconstrained$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
