package com.whatsapp.camera.areffects;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4ZN;
import X.C107875al;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C75603ho;
import X.C86734Sv;
import X.C92274h2;
import X.C99234sU;
import android.view.View;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.camera.areffects.CameraArEffectsViewModel$3", f = "CameraArEffectsViewModel.kt", i = {}, l = {203, 204}, m = "invokeSuspend", n = {}, s = {})
public final class CameraArEffectsViewModel$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C75603ho this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraArEffectsViewModel$3(C75603ho r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CameraArEffectsViewModel$3 cameraArEffectsViewModel$3 = new CameraArEffectsViewModel$3(this.this$0, r4);
        cameraArEffectsViewModel$3.L$0 = obj;
        return cameraArEffectsViewModel$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object A03;
        AnonymousClass4ZN r1;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C107875al r12 = (C107875al) this.L$0;
            C75603ho r0 = this.this$0;
            if (r12 != null) {
                ActionFeedbackPriorityQueue actionFeedbackPriorityQueue = r0.A02;
                AnonymousClass4ZN BNZ = r12.BNZ();
                C86734Sv BNt = r12.BNt();
                View.OnClickListener onClickListener = null;
                if (BNt != null) {
                    r1 = BNt.A01;
                    onClickListener = BNt.A00;
                } else {
                    r1 = null;
                }
                C92274h2 r02 = new C92274h2(onClickListener, BNZ, r1, true);
                this.label = 1;
                A03 = actionFeedbackPriorityQueue.A02(r02, this);
            } else {
                ActionFeedbackPriorityQueue actionFeedbackPriorityQueue2 = r0.A02;
                C99234sU r03 = new C99234sU(3);
                this.label = 2;
                A03 = actionFeedbackPriorityQueue2.A03(this, r03);
            }
            if (A03 == r6) {
                return r6;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CameraArEffectsViewModel$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
