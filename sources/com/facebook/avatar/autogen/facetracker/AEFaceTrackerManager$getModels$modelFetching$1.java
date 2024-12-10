package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.CCY;
import X.COL;
import X.DAS;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$modelFetching$1", f = "AEFaceTrackerManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AEFaceTrackerManager$getModels$modelFetching$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AEFaceTrackerManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AEFaceTrackerManager$getModels$modelFetching$1(AEFaceTrackerManager aEFaceTrackerManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = aEFaceTrackerManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AEFaceTrackerManager$getModels$modelFetching$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AEFaceTrackerManager$getModels$modelFetching$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            DAS das = AEFaceTrackerManager.A03;
            if (das != null) {
                COL col = das.A04.A07;
                CCY.A00(col.A00, col.A01, "model_fetch_failed", 36);
            }
            AEFaceTrackerManager.A02 = null;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
