package com.whatsapp.calling.screenshare;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1", f = "ScreenShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenShareViewModel$stopScreenSharing$res$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ScreenShareViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenShareViewModel$stopScreenSharing$res$1(ScreenShareViewModel screenShareViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = screenShareViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ScreenShareViewModel$stopScreenSharing$res$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ScreenShareViewModel$stopScreenSharing$res$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return AnonymousClass3MW.A0v(this.this$0.A05.CQ1());
        }
        throw AnonymousClass000.A0l();
    }
}
