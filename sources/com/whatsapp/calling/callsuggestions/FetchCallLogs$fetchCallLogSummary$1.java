package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C132226mR;
import X.C18070vi;
import X.C188419hO;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.EEF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.FetchCallLogs$fetchCallLogSummary$1", f = "FetchCallLogs.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCallLogs$fetchCallLogSummary$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ C188419hO $parameters;
    public int label;
    public final /* synthetic */ C132226mR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCallLogs$fetchCallLogSummary$1(C188419hO r2, C132226mR r3, C30391dr r4, AnonymousClass1OX r5) {
        super(2, r4);
        this.this$0 = r3;
        this.$coroutineScope = r5;
        this.$parameters = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FetchCallLogs$fetchCallLogSummary$1(this.$parameters, this.this$0, r6, this.$coroutineScope);
    }

    public final Object invokeSuspend(Object obj) {
        EEF eef;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C132226mR r4 = this.this$0;
            AnonymousClass1OX r3 = this.$coroutineScope;
            C188419hO r1 = this.$parameters;
            synchronized (r4) {
                eef = r4.A00;
                if (eef == null) {
                    FetchCallLogs$startFetchCallLogs$1 fetchCallLogs$startFetchCallLogs$1 = new FetchCallLogs$startFetchCallLogs$1(r1, r4, (C30391dr) null);
                    C18070vi.A0d(r3, 0);
                    eef = C30451dy.A01(AnonymousClass00R.A00, C23761Hn.A01, fetchCallLogs$startFetchCallLogs$1, r3);
                    r4.A00 = eef;
                }
            }
            this.label = 1;
            obj = eef.BCp(this);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCallLogs$fetchCallLogSummary$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
