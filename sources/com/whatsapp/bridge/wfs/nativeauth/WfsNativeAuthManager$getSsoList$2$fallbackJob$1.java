package com.whatsapp.bridge.wfs.nativeauth;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.C108485bm;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bridge.wfs.nativeauth.WfsNativeAuthManager$getSsoList$2$fallbackJob$1", f = "WfsNativeAuthManager.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
public final class WfsNativeAuthManager$getSsoList$2$fallbackJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $fbJob;
    public final /* synthetic */ AnonymousClass1OB $igJob;
    public final /* synthetic */ C108485bm $resultChannel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WfsNativeAuthManager$getSsoList$2$fallbackJob$1(C30391dr r2, AnonymousClass1OB r3, AnonymousClass1OB r4, C108485bm r5) {
        super(2, r2);
        this.$fbJob = r3;
        this.$igJob = r4;
        this.$resultChannel = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        WfsNativeAuthManager$getSsoList$2$fallbackJob$1 wfsNativeAuthManager$getSsoList$2$fallbackJob$1 = new WfsNativeAuthManager$getSsoList$2$fallbackJob$1(r6, this.$fbJob, this.$igJob, this.$resultChannel);
        wfsNativeAuthManager$getSsoList$2$fallbackJob$1.L$0 = obj;
        return wfsNativeAuthManager$getSsoList$2$fallbackJob$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r1 = (AnonymousClass1OX) this.L$0;
            while (AnonymousClass1OW.A05(r1) && (this.$fbJob.Be2() || this.$igJob.Be2())) {
            }
            C108485bm r12 = this.$resultChannel;
            C18460wS r0 = C18460wS.A00;
            this.label = 1;
            if (r12.CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WfsNativeAuthManager$getSsoList$2$fallbackJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
