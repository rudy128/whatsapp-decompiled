package com.whatsapp.glasses;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BY2;
import X.C22959BXf;
import X.C26996DOs;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import com.facebook.wearable.mediastream.model.SUPToggleState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.glasses.SupDelegateImpl$startErrorToConnectJob$1", f = "SupDelegateImpl.kt", i = {}, l = {653, 655}, m = "invokeSuspend", n = {}, s = {})
public final class SupDelegateImpl$startErrorToConnectJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ boolean $shouldDelay;
    public int label;
    public final /* synthetic */ C26996DOs this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupDelegateImpl$startErrorToConnectJob$1(C26996DOs dOs, C30391dr r3, boolean z) {
        super(2, r3);
        this.$shouldDelay = z;
        this.this$0 = dOs;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SupDelegateImpl$startErrorToConnectJob$1(this.this$0, r5, this.$shouldDelay);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (this.$shouldDelay) {
                SUPToggleState sUPToggleState = this.this$0.A01;
                if (!(sUPToggleState instanceof C22959BXf) || !(((C22959BXf) sUPToggleState).A00.A00 instanceof BY2)) {
                    this.label = 2;
                    j = 5000;
                } else {
                    this.label = 1;
                    j = 300000;
                }
                if (C62882s9.A00(this, j) == r4) {
                    return r4;
                }
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (C26996DOs.A07(this.this$0)) {
            this.this$0.A0C(false);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SupDelegateImpl$startErrorToConnectJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
