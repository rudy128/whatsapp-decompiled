package com.whatsapp.calling.camera;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17900vP;
import X.C18600wl;
import X.C24155BwL;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C24155BwL this$0;

    @DebugMetadata(c = "com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1", f = "ScreenShareCaptureDevice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.camera.ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(bwL, r5, CQ1);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                int i = CQ1;
                if (i != 0) {
                    bwL.A0B.A01(i);
                    C17900vP.A0i("ScreenShareCaptureDevice Failed to stop screen sharing: ", AnonymousClass000.A10(), i);
                }
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(C24155BwL bwL, C30391dr r3) {
        super(2, r3);
        this.this$0 = bwL;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareCaptureDevice$mediaProjectionCallback$1$onStop$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final int CQ1 = this.this$0.A09.CQ1();
            final C24155BwL bwL = this.this$0;
            C18600wl r2 = bwL.A0E;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
