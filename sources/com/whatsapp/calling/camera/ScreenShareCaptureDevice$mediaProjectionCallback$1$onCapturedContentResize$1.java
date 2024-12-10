package com.whatsapp.calling.camera;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C24155BwL;
import X.C25791Cm3;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C25791Cm3 $newScreenShareInfo;
    public int label;
    public final /* synthetic */ C24155BwL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(C24155BwL bwL, C25791Cm3 cm3, C30391dr r4) {
        super(2, r4);
        this.this$0 = bwL;
        this.$newScreenShareInfo = cm3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1(this.this$0, this.$newScreenShareInfo, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.onScreenShareInfoChanged(this.$newScreenShareInfo);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenShareCaptureDevice$mediaProjectionCallback$1$onCapturedContentResize$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
