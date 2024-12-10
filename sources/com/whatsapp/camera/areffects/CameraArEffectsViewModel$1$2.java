package com.whatsapp.camera.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass7DY;
import X.C106575Wj;
import X.C108335bX;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import X.C75603ho;
import X.C92384hD;
import X.C92504hR;
import X.C92594ha;
import X.C92614hc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$2", f = "CameraArEffectsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CameraArEffectsViewModel$1$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C75603ho this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraArEffectsViewModel$1$2(C75603ho r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CameraArEffectsViewModel$1$2 cameraArEffectsViewModel$1$2 = new CameraArEffectsViewModel$1$2(this.this$0, r4);
        cameraArEffectsViewModel$1$2.L$0 = obj;
        return cameraArEffectsViewModel$1$2;
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int ordinal;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1D6 r0 = (AnonymousClass1D6) this.L$0;
            C75603ho r3 = this.this$0;
            C106575Wj r7 = (C106575Wj) r0.first;
            C106575Wj r6 = (C106575Wj) r0.second;
            if ((r7 instanceof C92614hc) && (r6 instanceof C92594ha)) {
                C92384hD r1 = ((C92594ha) r6).A02;
                if (r1.A05) {
                    int ordinal2 = r1.A00.ordinal();
                    if (ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 6) {
                        i = 73;
                        int intValue = Integer.valueOf(i).intValue();
                        AnonymousClass7DY r02 = r3.A07;
                        C72463Mc.A1F(r02.A1L, intValue, AnonymousClass7DY.A01(r02));
                    }
                    return C27621Wu.A00;
                }
            }
            if ((r7 instanceof C108335bX) && (r6 instanceof C92614hc) && (((C92614hc) r6).A00 instanceof C92504hR) && ((ordinal = ((C108335bX) r7).BW8().A00.ordinal()) == 2 || ordinal == 3 || ordinal == 6)) {
                i = 74;
                int intValue2 = Integer.valueOf(i).intValue();
                AnonymousClass7DY r022 = r3.A07;
                C72463Mc.A1F(r022.A1L, intValue2, AnonymousClass7DY.A01(r022));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CameraArEffectsViewModel$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
