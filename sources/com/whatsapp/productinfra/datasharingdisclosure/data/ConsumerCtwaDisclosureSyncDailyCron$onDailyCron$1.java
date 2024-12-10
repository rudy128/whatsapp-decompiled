package com.whatsapp.productinfra.datasharingdisclosure.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C191439mb;
import X.C20571AQh;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.datasharingdisclosure.data.ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1", f = "ConsumerCtwaDisclosureSyncDailyCron.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
public final class ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C20571AQh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(C20571AQh aQh, C30391dr r3) {
        super(2, r3);
        this.this$0 = aQh;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsumerCtwaDisclosureSyncDailyCron$onDailyCron$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C191439mb r3 = (C191439mb) this.this$0.A01.getValue();
            this.label = 1;
            if (C30451dy.A00(this, r3.A03, new ConsumerCtwaDisclosureRepository$syncConsumerDisclosureAckToServer$2(r3, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
