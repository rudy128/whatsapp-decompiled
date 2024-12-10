package com.whatsapp.productinfra.reportingtoken.cron;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C95364m7;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$triggerCleanupLogic$1", f = "ReportingTokenCleanupDailyCron.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
public final class ReportingTokenCleanupDailyCron$triggerCleanupLogic$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $cleanupLogic;
    public final /* synthetic */ int $numDays;
    public int label;
    public final /* synthetic */ C95364m7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportingTokenCleanupDailyCron$triggerCleanupLogic$1(C95364m7 r2, C30391dr r3, AnonymousClass1OS r4, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$numDays = i;
        this.$cleanupLogic = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ReportingTokenCleanupDailyCron$triggerCleanupLogic$1(this.this$0, r6, this.$cleanupLogic, this.$numDays);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OS r1 = this.$cleanupLogic;
            Long l = new Long(System.currentTimeMillis() - (((long) this.$numDays) * 86400000));
            this.label = 1;
            if (r1.invoke(l, this) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportingTokenCleanupDailyCron$triggerCleanupLogic$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
