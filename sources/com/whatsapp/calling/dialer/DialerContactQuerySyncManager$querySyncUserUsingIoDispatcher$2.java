package com.whatsapp.calling.dialer;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2R1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.dialer.DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2", f = "DialerContactQuerySyncManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $phoneNumber;
    public int label;
    public final /* synthetic */ DialerContactQuerySyncManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2(DialerContactQuerySyncManager dialerContactQuerySyncManager, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = dialerContactQuerySyncManager;
        this.$phoneNumber = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2(this.this$0, this.$phoneNumber, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A00.A03(AnonymousClass2R1.A0F, (Integer) null, this.$phoneNumber);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DialerContactQuerySyncManager$querySyncUserUsingIoDispatcher$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
