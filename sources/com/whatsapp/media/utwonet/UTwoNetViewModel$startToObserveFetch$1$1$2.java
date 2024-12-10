package com.whatsapp.media.utwonet;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass85U;
import X.C108975cc;
import X.C1196068w;
import X.C1196168x;
import X.C126036c5;
import X.C132426ml;
import X.C145067Jt;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.utwonet.UTwoNetViewModel$startToObserveFetch$1$1$2", f = "UTwoNetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UTwoNetViewModel$startToObserveFetch$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass85U $state;
    public int label;
    public final /* synthetic */ UTwoNetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UTwoNetViewModel$startToObserveFetch$1$1$2(UTwoNetViewModel uTwoNetViewModel, AnonymousClass85U r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = uTwoNetViewModel;
        this.$state = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UTwoNetViewModel$startToObserveFetch$1$1$2(this.this$0, this.$state, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DT r1;
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            UTwoNetViewModel uTwoNetViewModel = this.this$0;
            String str = ((C145067Jt) this.$state).A01;
            Log.i("UTwoNetViewModel/loadStaticLibrary");
            AnonymousClass00H r3 = uTwoNetViewModel.A06;
            C132426ml r12 = (C132426ml) r3.get();
            C18030ve r0 = r12.A00;
            C18040vf r6 = C18040vf.A02;
            if (C18020vd.A05(r6, r0, 10857)) {
                AnonymousClass00H r13 = r12.A01;
                if (!((WhatsAppDynamicExecuTorchLoader) r13.get()).A01) {
                    ((WhatsAppDynamicExecuTorchLoader) r13.get()).A00();
                }
            } else {
                AnonymousClass00H r14 = r12.A02;
                if (!((WhatsAppDynamicPytorchLoader) r14.get()).A01) {
                    ((WhatsAppDynamicPytorchLoader) r14.get()).A00();
                }
            }
            C17900vP.A0n("UTwoNetViewModel/loadModel/current model load state = ", AnonymousClass000.A10(), ((C132426ml) r3.get()).A00());
            try {
                if (!C108975cc.A1M(str)) {
                    uTwoNetViewModel.A02.A0E(C1196068w.A00);
                    return C27621Wu.A00;
                }
                C132426ml r15 = (C132426ml) r3.get();
                if (C18020vd.A05(r6, r15.A00, 10857)) {
                    ((WhatsAppDynamicExecuTorchLoader) r15.A01.get()).loadModel("UTwoNet", str);
                } else {
                    ((WhatsAppDynamicPytorchLoader) r15.A02.get()).loadModel("UTwoNet", str);
                }
                if (!((C132426ml) r3.get()).A00()) {
                    Log.e("UTwoNetViewModel/loadModel/Failed to load the model");
                    r1 = uTwoNetViewModel.A02;
                    obj2 = C1196068w.A00;
                } else {
                    Log.i("UTwoNetViewModel/loadModel/Model loaded, starting processor.");
                    uTwoNetViewModel.A00 = new C126036c5((C132426ml) C18070vi.A0E(r3));
                    r1 = uTwoNetViewModel.A02;
                    obj2 = C1196168x.A00;
                }
                r1.A0E(obj2);
                return C27621Wu.A00;
            } catch (Exception e) {
                Log.e("UTwoNetViewModel/loadModel", e);
            }
        } else {
            throw AnonymousClass000.A0l();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UTwoNetViewModel$startToObserveFetch$1$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
