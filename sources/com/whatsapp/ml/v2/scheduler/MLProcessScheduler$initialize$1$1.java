package com.whatsapp.ml.v2.scheduler;

import X.ALY;
import X.AnonymousClass000;
import X.AnonymousClass10T;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C122716Rq;
import X.C1407873b;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C25749ClJ;
import X.C26092CsA;
import X.C27179DXo;
import X.C27189DXz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.scheduler.MLProcessScheduler$initialize$1$1", f = "MLProcessScheduler.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class MLProcessScheduler$initialize$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C25749ClJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLProcessScheduler$initialize$1$1(C25749ClJ clJ, C30391dr r3) {
        super(2, r3);
        this.this$0 = clJ;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MLProcessScheduler$initialize$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MLProcessScheduler$initialize$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C18030ve r2 = AnonymousClass3MX.A0y(this.this$0.A07).A01;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 2890) || !C18020vd.A05(r1, r2, 11344)) {
                ((AnonymousClass10T) this.this$0.A02.get()).registerObserver(new ALY(this.this$0, 0));
            }
            C27179DXo dXo = new C27179DXo(new C27179DXo(C26092CsA.A02(((C1407873b) this.this$0.A05.get()).A05(C122716Rq.TRANSCRIPTION)), 14), 4);
            C27189DXz dXz = new C27189DXz(this.this$0, 6);
            this.label = 1;
            if (dXo.BFC(this, dXz) == r4) {
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
