package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6RY;
import X.C122576Qx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$toggleScreenSharing$1", f = "ScreenShareViewModel.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$toggleScreenSharing$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122576Qx $entryPoint;
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$toggleScreenSharing$1(C122576Qx r2, ScreenShareViewModel screenShareViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = screenShareViewModel;
        this.$entryPoint = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ScreenShareViewModel$toggleScreenSharing$1(this.$entryPoint, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass6RY r0;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ScreenShareViewModel screenShareViewModel = this.this$0;
            int ordinal = this.$entryPoint.ordinal();
            if (ordinal == 0) {
                r0 = AnonymousClass6RY.STOP_FROM_BOTTOM_SHEET;
            } else if (ordinal == 1) {
                r0 = AnonymousClass6RY.STOP_FROM_GRID_TILE;
            } else if (ordinal == 2) {
                r0 = AnonymousClass6RY.DISPLAY_PENDING_CALL;
            } else if (ordinal == 3) {
                r0 = AnonymousClass6RY.CALL_ENDED;
            } else {
                throw AnonymousClass3MW.A14();
            }
            this.label = 1;
            if (ScreenShareViewModel.A03(r0, screenShareViewModel, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenShareViewModel$toggleScreenSharing$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
