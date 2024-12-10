package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass1HR;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C24521Kq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1", f = "ScreenShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$startScreenSharing$res$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$startScreenSharing$res$1(ScreenShareViewModel screenShareViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = screenShareViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ScreenShareViewModel$startScreenSharing$res$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareViewModel$startScreenSharing$res$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1HR r1 = (AnonymousClass1HR) this.this$0.A05;
            r1.A01.get();
            C24521Kq r0 = C24521Kq.$redex_init_class;
            CallState A03 = Voip.A03(r1.A00);
            if (A03 == null || A03 == CallState.NONE || A03 == CallState.ENDING) {
                Log.w("turnScreenSharingOn ignored as no call active");
                i = 670007;
            } else {
                i = Voip.turnScreenShareOn();
            }
            return AnonymousClass3MW.A0v(i);
        }
        throw AnonymousClass000.A0l();
    }
}
