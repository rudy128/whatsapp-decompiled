package com.whatsapp.camera.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$1", f = "CameraArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CameraArEffectsViewModel$1$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public CameraArEffectsViewModel$1$1(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        CameraArEffectsViewModel$1$1 cameraArEffectsViewModel$1$1 = new CameraArEffectsViewModel$1$1((C30391dr) obj3);
        cameraArEffectsViewModel$1$1.L$0 = obj;
        cameraArEffectsViewModel$1$1.L$1 = obj2;
        return cameraArEffectsViewModel$1$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return AnonymousClass1D6.A01(((AnonymousClass1D6) this.L$0).second, this.L$1);
        }
        throw AnonymousClass000.A0l();
    }
}
