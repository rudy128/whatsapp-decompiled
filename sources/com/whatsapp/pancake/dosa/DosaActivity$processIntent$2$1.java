package com.whatsapp.pancake.dosa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.dosa.DosaActivity$processIntent$2$1", f = "DosaActivity.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class DosaActivity$processIntent$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $expireTimeout;
    public final /* synthetic */ String $it;
    public int label;
    public final /* synthetic */ DosaActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaActivity$processIntent$2$1(DosaActivity dosaActivity, String str, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = dosaActivity;
        this.$it = str;
        this.$expireTimeout = j;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new DosaActivity$processIntent$2$1(this.this$0, this.$it, r8, this.$expireTimeout);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$it;
            long j = this.$expireTimeout;
            this.label = 1;
            if (((DosaNavigationViewModel) this.this$0.A03.getValue()).A00.A08(str, j, this) == r5) {
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
        return ((DosaActivity$processIntent$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
