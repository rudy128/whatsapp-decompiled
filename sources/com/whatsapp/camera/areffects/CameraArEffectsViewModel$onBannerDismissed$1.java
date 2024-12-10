package com.whatsapp.camera.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C75603ho;
import X.C92274h2;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsViewModel$onBannerDismissed$1", f = "CameraArEffectsViewModel.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
public final class CameraArEffectsViewModel$onBannerDismissed$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C92274h2 $viewState;
    public int label;
    public final /* synthetic */ C75603ho this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraArEffectsViewModel$onBannerDismissed$1(C92274h2 r2, C75603ho r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$viewState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CameraArEffectsViewModel$onBannerDismissed$1(this.$viewState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ActionFeedbackPriorityQueue actionFeedbackPriorityQueue = this.this$0.A02;
            C92274h2 r0 = this.$viewState;
            this.label = 1;
            if (actionFeedbackPriorityQueue.A01(r0, this) == r3) {
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
        return ((CameraArEffectsViewModel$onBannerDismissed$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
