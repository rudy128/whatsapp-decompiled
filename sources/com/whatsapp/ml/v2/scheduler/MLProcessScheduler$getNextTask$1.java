package com.whatsapp.ml.v2.scheduler;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.C173708vb;
import X.C22821Di;
import X.C24027BuE;
import X.C24489C6h;
import X.C25749ClJ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.E8F;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.scheduler.MLProcessScheduler$getNextTask$1", f = "MLProcessScheduler.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
public final class MLProcessScheduler$getNextTask$1 extends C30431dv implements C22821Di {
    public final /* synthetic */ C24489C6h $request;
    public int label;
    public final /* synthetic */ C25749ClJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLProcessScheduler$getNextTask$1(C25749ClJ clJ, C24489C6h c6h, C30391dr r4) {
        super(1, r4);
        this.this$0 = clJ;
        this.$request = c6h;
    }

    public final C30391dr create(C30391dr r4) {
        return new MLProcessScheduler$getNextTask$1(this.this$0, this.$request, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((MLProcessScheduler$getNextTask$1) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass00H r0;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C25749ClJ.A00(this.this$0, this.$request);
            C25749ClJ clJ = this.this$0;
            C24489C6h c6h = this.$request;
            this.label = 1;
            if (c6h instanceof C24027BuE) {
                r0 = clJ.A08;
            } else if (c6h instanceof C173708vb) {
                r0 = clJ.A09;
            }
            if (((E8F) r0.get()).CCX(c6h, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Throwable th) {
                C25749ClJ.A00(this.this$0, (C24489C6h) null);
                throw th;
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        C25749ClJ.A00(this.this$0, (C24489C6h) null);
        return C27621Wu.A00;
    }
}
