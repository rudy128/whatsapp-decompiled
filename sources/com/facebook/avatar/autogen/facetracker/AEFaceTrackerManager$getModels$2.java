package com.facebook.avatar.autogen.facetracker;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.EEF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager$getModels$2", f = "AEFaceTrackerManager.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class AEFaceTrackerManager$getModels$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ EEF $modelFetching;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AEFaceTrackerManager$getModels$2(C30391dr r2, EEF eef) {
        super(2, r2);
        this.$modelFetching = eef;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AEFaceTrackerManager$getModels$2(r4, this.$modelFetching);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AEFaceTrackerManager$getModels$2((C30391dr) obj2, this.$modelFetching).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            EEF eef = this.$modelFetching;
            this.label = 1;
            if (eef.BCp(this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
